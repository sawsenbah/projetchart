package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import programChartSawsen.ApplyFilter;
import programChartSawsen.ChartType;
import programChartSawsen.CreateChart;
import programChartSawsen.CsvLoader;
import programChartSawsen.FilterType;
import programChartSawsen.Functions;
import programChartSawsen.ProgChart;
import programChartSawsen.SelectedColumns;

@SuppressWarnings("all")
public class MyDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    try {
      EObject _get = resource.getContents().get(0);
      final ProgChart prog = ((ProgChart) _get);
      ArrayList<String> _arrayList = new ArrayList<String>();
      List<String> selectedCsvContent = ((List<String>) _arrayList);
      ArrayList<String> _arrayList_1 = new ArrayList<String>();
      List<String> filteredCsvContent = ((List<String>) _arrayList_1);
      String csvFilePath = "";
      EList<Functions> _functions = prog.getFunctions();
      for (final Functions function : _functions) {
        if ((function instanceof CsvLoader)) {
          final CsvLoader csvLoader = ((CsvLoader) function);
          csvFilePath = csvLoader.getPath();
        }
      }
      final List<String> csvContent = Files.readAllLines(Paths.get(csvFilePath));
      final String[] headers = csvContent.get(0).split(";");
      final Function1<String, String> _function = (String header) -> {
        return header.replaceAll("[^a-zA-Z0-9àâçéèêëîïôûùüÿñæœÀÂÇÉÈÊËÎÏÔÛÙÜŸÑÆŒ]", "");
      };
      final List<String> cleanedHeaders = ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(headers)), _function);
      csvContent.set(0, IterableExtensions.join(cleanedHeaders, ";"));
      fsa.generateFile("output.csv", IterableExtensions.join(csvContent, "\n"));
      EList<Functions> _functions_1 = prog.getFunctions();
      for (final Functions function_1 : _functions_1) {
        if ((function_1 instanceof SelectedColumns)) {
          final SelectedColumns selectedCols = ((SelectedColumns) function_1);
          final EList<String> selectedColumns = selectedCols.getColumnsname();
          final String outputpath = selectedCols.getOutputpath();
          selectedCsvContent = this.processSelectedColumns(selectedColumns, csvContent);
          fsa.generateFile(selectedCols.getOutputpath(), IterableExtensions.join(selectedCsvContent, "\n"));
        }
      }
      EList<Functions> _functions_2 = prog.getFunctions();
      for (final Functions function_2 : _functions_2) {
        if ((function_2 instanceof ApplyFilter)) {
          final ApplyFilter applyFilter = ((ApplyFilter) function_2);
          final String columname = applyFilter.getColumname();
          final FilterType filter = applyFilter.getFilter();
          final String filtervalue = applyFilter.getFiltervalue();
          filteredCsvContent = this.applyFilterfun(columname, filter, filtervalue, selectedCsvContent);
          String _filteredoutput = applyFilter.getFilteredoutput();
          boolean _notEquals = (!Objects.equal(_filteredoutput, null));
          if (_notEquals) {
            fsa.generateFile(applyFilter.getFilteredoutput(), IterableExtensions.join(filteredCsvContent, "\n"));
          }
        }
      }
      final ArrayList<String> yLabels = new ArrayList<String>();
      EList<Functions> _functions_3 = prog.getFunctions();
      for (final Functions function_3 : _functions_3) {
        if ((function_3 instanceof CreateChart)) {
          final CreateChart createChart = ((CreateChart) function_3);
          final ChartType chart = createChart.getChart();
          final String xlabel = createChart.getXlabel();
          final String titlechart = createChart.getTitlechart();
          final EList<String> yLabelList = createChart.getYlabel();
          yLabels.addAll(yLabelList);
          String chartContent = "";
          if (chart != null) {
            switch (chart) {
              case HISTOGRAM:
                chartContent = this.generateHistogramChart(xlabel, yLabels, filteredCsvContent, titlechart);
                break;
              case PIE:
                chartContent = this.generatePieChart(xlabel, yLabels, filteredCsvContent, titlechart);
                break;
              case LINE:
                chartContent = this.generateLineChart(xlabel, yLabels, filteredCsvContent, titlechart);
                break;
              default:
                break;
            }
          }
          ChartType _chart = createChart.getChart();
          boolean _notEquals_1 = (!Objects.equal(_chart, null));
          if (_notEquals_1) {
            ChartType _chart_1 = createChart.getChart();
            String _plus = (_chart_1 + ".html");
            fsa.generateFile(_plus, chartContent);
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String generateHistogramChart(final String xlabel, final List<String> yLabels, final List<String> filteredCsvContent, final String titlechart) {
    final String[] headers = filteredCsvContent.get(0).split(";");
    final ArrayList<String> constdata = new ArrayList<String>();
    int _size = filteredCsvContent.size();
    int _minus = (_size - 1);
    IntegerRange _upTo = new IntegerRange(2, _minus);
    for (final Integer i : _upTo) {
      {
        final String line = filteredCsvContent.get((i).intValue());
        final String[] row = line.split(";");
        final StringBuilder rowData = new StringBuilder();
        rowData.append("{");
        int _size_1 = ((List<String>)Conversions.doWrapArray(headers)).size();
        int _minus_1 = (_size_1 - 1);
        IntegerRange _upTo_1 = new IntegerRange(0, _minus_1);
        for (final Integer j : _upTo_1) {
          rowData.append("\"").append(headers[(j).intValue()]).append("\":\"").append(row[(j).intValue()]).append("\",");
        }
        int _length = rowData.length();
        int _minus_2 = (_length - 1);
        rowData.deleteCharAt(_minus_2);
        rowData.append("}");
        final String jsonString = rowData.toString().replace("=", ":");
        constdata.add(jsonString);
      }
    }
    String datasets = "";
    int _size_1 = yLabels.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size_1, true);
    for (final Integer i_1 : _doubleDotLessThan) {
      String _datasets = datasets;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("label:\'   ");
      String _plus = (_builder.toString() + yLabels.get((i_1).intValue()));
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _builder_1.append("\',");
      _builder_1.newLine();
      _builder_1.append("          ");
      _builder_1.append("data: data.map(row => row.");
      String _plus_1 = (_plus + _builder_1);
      String _plus_2 = (_plus_1 + yLabels.get((i_1).intValue()));
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(")");
      _builder_2.newLine();
      _builder_2.append("        ");
      _builder_2.append("},");
      _builder_2.newLine();
      String _plus_3 = (_plus_2 + _builder_2);
      datasets = (_datasets + _plus_3);
    }
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("<html>");
    _builder_3.newLine();
    _builder_3.append("<head>");
    _builder_3.newLine();
    _builder_3.append("  ");
    _builder_3.append("<script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>");
    _builder_3.newLine();
    _builder_3.append("  ");
    _builder_3.append("<title>");
    String _plus_4 = (_builder_3.toString() + titlechart);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("</title>");
    _builder_4.newLine();
    _builder_4.append("    ");
    _builder_4.append("</head>");
    _builder_4.newLine();
    _builder_4.append("    ");
    _builder_4.append("<body>");
    _builder_4.newLine();
    _builder_4.append("      ");
    _builder_4.append("<canvas id=\"myChart\"></canvas>");
    _builder_4.newLine();
    _builder_4.append("      ");
    _builder_4.append("<script>");
    _builder_4.newLine();
    _builder_4.append("         ");
    _builder_4.append("const CHART_COLORS = {");
    _builder_4.newLine();
    _builder_4.append("           ");
    _builder_4.append("redt: \'rgba(255, 99, 132, 0.6)\',");
    _builder_4.newLine();
    _builder_4.append("           ");
    _builder_4.append("red: \'rgb(255, 99, 132)\',");
    _builder_4.newLine();
    _builder_4.append("           ");
    _builder_4.append("orange: \'rgb(255, 159, 64)\',");
    _builder_4.newLine();
    _builder_4.append("           ");
    _builder_4.append("yellow: \'rgb(255, 205, 86)\',");
    _builder_4.newLine();
    _builder_4.append("           ");
    _builder_4.append("green: \'rgb(75, 192, 192)\',");
    _builder_4.newLine();
    _builder_4.append("           ");
    _builder_4.append("bluet: \'rgba(54, 162, 235,0.6)\',");
    _builder_4.newLine();
    _builder_4.append("           ");
    _builder_4.append("blue: \'rgb(54, 162, 235)\',");
    _builder_4.newLine();
    _builder_4.append("           ");
    _builder_4.append("purple: \'rgb(153, 102, 255)\',");
    _builder_4.newLine();
    _builder_4.append("           ");
    _builder_4.append("grey: \'rgb(201, 203, 207)\'");
    _builder_4.newLine();
    _builder_4.append("         ");
    _builder_4.append("};");
    _builder_4.newLine();
    _builder_4.append("         ");
    _builder_4.newLine();
    _builder_4.append("         ");
    _builder_4.append("const NAMED_COLORS = [");
    _builder_4.newLine();
    _builder_4.append("           ");
    _builder_4.append("CHART_COLORS.red,");
    _builder_4.newLine();
    _builder_4.append("           ");
    _builder_4.append("CHART_COLORS.orange,");
    _builder_4.newLine();
    _builder_4.append("           ");
    _builder_4.append("CHART_COLORS.yellow,");
    _builder_4.newLine();
    _builder_4.append("           ");
    _builder_4.append("CHART_COLORS.green,");
    _builder_4.newLine();
    _builder_4.append("           ");
    _builder_4.append("CHART_COLORS.blue,");
    _builder_4.newLine();
    _builder_4.append("           ");
    _builder_4.append("CHART_COLORS.purple,");
    _builder_4.newLine();
    _builder_4.append("           ");
    _builder_4.append("CHART_COLORS.grey,");
    _builder_4.newLine();
    _builder_4.append("         ");
    _builder_4.append("];");
    _builder_4.newLine();
    _builder_4.append("         ");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("const data = ");
    String _plus_5 = (_plus_4 + _builder_4);
    String _replaceAll = constdata.toString().replaceAll("\\[", "\\[").replaceAll("\\]", "\\]");
    String _plus_6 = (_plus_5 + _replaceAll);
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append(";");
    _builder_5.newLine();
    _builder_5.append("        ");
    _builder_5.append("console.log(data);");
    _builder_5.newLine();
    _builder_5.append("         ");
    _builder_5.append("new Chart(");
    _builder_5.newLine();
    _builder_5.append("            ");
    _builder_5.append("document.getElementById(\'myChart\'),");
    _builder_5.newLine();
    _builder_5.append("            ");
    _builder_5.append("{");
    _builder_5.newLine();
    _builder_5.append("              ");
    _builder_5.append("type: \'bar\',");
    _builder_5.newLine();
    _builder_5.append("             ");
    _builder_5.append("data: {");
    _builder_5.newLine();
    _builder_5.append("                        ");
    _builder_5.append("labels: data.map(row => row.");
    String _plus_7 = (_plus_6 + _builder_5);
    String _plus_8 = (_plus_7 + xlabel);
    StringConcatenation _builder_6 = new StringConcatenation();
    _builder_6.append("),");
    _builder_6.newLine();
    _builder_6.append("                        ");
    _builder_6.append("datasets: [ ");
    String _plus_9 = (_plus_8 + _builder_6);
    String _plus_10 = (_plus_9 + datasets);
    StringConcatenation _builder_7 = new StringConcatenation();
    _builder_7.append(" ");
    _builder_7.append("],");
    _builder_7.newLine();
    _builder_7.append("                      ");
    _builder_7.append("}");
    _builder_7.newLine();
    _builder_7.append("                    ");
    _builder_7.append("}");
    _builder_7.newLine();
    _builder_7.append("                  ");
    _builder_7.append(");");
    _builder_7.newLine();
    _builder_7.append("                  ");
    _builder_7.append("</script>");
    _builder_7.newLine();
    _builder_7.append("                ");
    _builder_7.append("</head>");
    _builder_7.newLine();
    _builder_7.append("                ");
    _builder_7.append("<body>");
    _builder_7.newLine();
    _builder_7.append("                ");
    _builder_7.append("</body>");
    _builder_7.newLine();
    _builder_7.append("              ");
    _builder_7.append("</html>");
    _builder_7.newLine();
    final String chartContent = (_plus_10 + _builder_7);
    return chartContent;
  }
  
  public String generateLineChart(final String xlabel, final List<String> yLabels, final List<String> filteredCsvContent, final String titlechart) {
    final String[] headers = filteredCsvContent.get(0).split(";");
    final ArrayList<String> constdata = new ArrayList<String>();
    int _size = filteredCsvContent.size();
    int _minus = (_size - 1);
    IntegerRange _upTo = new IntegerRange(2, _minus);
    for (final Integer i : _upTo) {
      {
        final String line = filteredCsvContent.get((i).intValue());
        final String[] row = line.split(";");
        final StringBuilder rowData = new StringBuilder();
        rowData.append("{");
        int _size_1 = ((List<String>)Conversions.doWrapArray(headers)).size();
        int _minus_1 = (_size_1 - 1);
        IntegerRange _upTo_1 = new IntegerRange(0, _minus_1);
        for (final Integer j : _upTo_1) {
          rowData.append("\"").append(headers[(j).intValue()]).append("\":\"").append(row[(j).intValue()]).append("\",");
        }
        int _length = rowData.length();
        int _minus_2 = (_length - 1);
        rowData.deleteCharAt(_minus_2);
        rowData.append("}");
        final String jsonString = rowData.toString().replace("=", ":");
        constdata.add(jsonString);
      }
    }
    String datasets = "";
    int _size_1 = yLabels.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size_1, true);
    for (final Integer i_1 : _doubleDotLessThan) {
      String _datasets = datasets;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("label:\'   ");
      String _plus = (_builder.toString() + yLabels.get((i_1).intValue()));
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _builder_1.append("\',");
      _builder_1.newLine();
      _builder_1.append("          ");
      _builder_1.append("data: data.map(row => row.");
      String _plus_1 = (_plus + _builder_1);
      String _plus_2 = (_plus_1 + yLabels.get((i_1).intValue()));
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(")");
      _builder_2.newLine();
      _builder_2.append("        ");
      _builder_2.append("},");
      _builder_2.newLine();
      String _plus_3 = (_plus_2 + _builder_2);
      datasets = (_datasets + _plus_3);
    }
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("<html>");
    _builder_3.newLine();
    _builder_3.append("<head>");
    _builder_3.newLine();
    _builder_3.append("  ");
    _builder_3.append("<script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>");
    _builder_3.newLine();
    _builder_3.append("   ");
    _builder_3.append("<title>");
    String _plus_4 = (_builder_3.toString() + titlechart);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("</title>");
    _builder_4.newLine();
    _builder_4.append("    ");
    _builder_4.append("</head>");
    _builder_4.newLine();
    _builder_4.append("    ");
    _builder_4.append("<body>");
    _builder_4.newLine();
    _builder_4.append("      ");
    _builder_4.append("<canvas id=\"myChart\"></canvas>");
    _builder_4.newLine();
    _builder_4.append("      ");
    _builder_4.append("<script>");
    _builder_4.newLine();
    _builder_4.append("      ");
    _builder_4.append("const CHART_COLORS = {");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("redt: \'rgba(255, 99, 132, 0.6)\',");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("red: \'rgb(255, 99, 132)\',");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("orange: \'rgb(255, 159, 64)\',");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("yellow: \'rgb(255, 205, 86)\',");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("green: \'rgb(75, 192, 192)\',");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("bluet: \'rgba(54, 162, 235,0.6)\',");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("blue: \'rgb(54, 162, 235)\',");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("purple: \'rgb(153, 102, 255)\',");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("grey: \'rgb(201, 203, 207)\'");
    _builder_4.newLine();
    _builder_4.append("      ");
    _builder_4.append("};");
    _builder_4.newLine();
    _builder_4.append("      ");
    _builder_4.newLine();
    _builder_4.append("      ");
    _builder_4.append("const NAMED_COLORS = [");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("CHART_COLORS.red,");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("CHART_COLORS.orange,");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("CHART_COLORS.yellow,");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("CHART_COLORS.green,");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("CHART_COLORS.blue,");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("CHART_COLORS.purple,");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("CHART_COLORS.grey,");
    _builder_4.newLine();
    _builder_4.append("      ");
    _builder_4.append("];");
    _builder_4.newLine();
    _builder_4.append("      ");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("const data = ");
    String _plus_5 = (_plus_4 + _builder_4);
    String _replaceAll = constdata.toString().replaceAll("\\[", "\\[").replaceAll("\\]", "\\]");
    String _plus_6 = (_plus_5 + _replaceAll);
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append(";");
    _builder_5.newLine();
    _builder_5.append("        ");
    _builder_5.append("console.log(data);");
    _builder_5.newLine();
    _builder_5.append("        ");
    _builder_5.append("new Chart(");
    _builder_5.newLine();
    _builder_5.append("        ");
    _builder_5.append("document.getElementById(\'myChart\'),");
    _builder_5.newLine();
    _builder_5.append("        ");
    _builder_5.append("{");
    _builder_5.newLine();
    _builder_5.append("          ");
    _builder_5.append("type: \'line\',");
    _builder_5.newLine();
    _builder_5.append("          ");
    _builder_5.append("data: {");
    _builder_5.newLine();
    _builder_5.append("            ");
    _builder_5.append("labels: data.map(row => row.");
    String _plus_7 = (_plus_6 + _builder_5);
    String _plus_8 = (_plus_7 + xlabel);
    StringConcatenation _builder_6 = new StringConcatenation();
    _builder_6.append("),");
    _builder_6.newLine();
    _builder_6.append("            ");
    _builder_6.append("datasets: [ ");
    String _plus_9 = (_plus_8 + _builder_6);
    String _plus_10 = (_plus_9 + datasets);
    StringConcatenation _builder_7 = new StringConcatenation();
    _builder_7.append(" ");
    _builder_7.append("],");
    _builder_7.newLine();
    _builder_7.append("          ");
    _builder_7.append("}");
    _builder_7.newLine();
    _builder_7.append("        ");
    _builder_7.append("}");
    _builder_7.newLine();
    _builder_7.append("      ");
    _builder_7.append(");");
    _builder_7.newLine();
    _builder_7.append("      ");
    _builder_7.append("</script>");
    _builder_7.newLine();
    _builder_7.append("    ");
    _builder_7.append("</head>");
    _builder_7.newLine();
    _builder_7.append("    ");
    _builder_7.append("<body>");
    _builder_7.newLine();
    _builder_7.append("    ");
    _builder_7.append("</body>");
    _builder_7.newLine();
    _builder_7.append("  ");
    _builder_7.append("</html>");
    _builder_7.newLine();
    final String chartContent = (_plus_10 + _builder_7);
    return chartContent;
  }
  
  public String generatePieChart(final String xlabel, final List<String> yLabels, final List<String> filteredCsvContent, final String titlechart) {
    final String[] headers = filteredCsvContent.get(0).split(";");
    final ArrayList<String> constdata = new ArrayList<String>();
    int _size = filteredCsvContent.size();
    int _minus = (_size - 1);
    IntegerRange _upTo = new IntegerRange(2, _minus);
    for (final Integer i : _upTo) {
      {
        final String line = filteredCsvContent.get((i).intValue());
        final String[] row = line.split(";");
        final StringBuilder rowData = new StringBuilder();
        rowData.append("{");
        int _size_1 = ((List<String>)Conversions.doWrapArray(headers)).size();
        int _minus_1 = (_size_1 - 1);
        IntegerRange _upTo_1 = new IntegerRange(0, _minus_1);
        for (final Integer j : _upTo_1) {
          rowData.append("\"").append(headers[(j).intValue()]).append("\":\"").append(row[(j).intValue()]).append("\",");
        }
        int _length = rowData.length();
        int _minus_2 = (_length - 1);
        rowData.deleteCharAt(_minus_2);
        rowData.append("}");
        final String jsonString = rowData.toString().replace("=", ":");
        constdata.add(jsonString);
      }
    }
    String datasets = "";
    int _size_1 = yLabels.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size_1, true);
    for (final Integer i_1 : _doubleDotLessThan) {
      String _datasets = datasets;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("label:\'   ");
      String _plus = (_builder.toString() + yLabels.get((i_1).intValue()));
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _builder_1.append("\',");
      _builder_1.newLine();
      _builder_1.append("          ");
      _builder_1.append("data: data.map(row => row.");
      String _plus_1 = (_plus + _builder_1);
      String _plus_2 = (_plus_1 + yLabels.get((i_1).intValue()));
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(")");
      _builder_2.newLine();
      _builder_2.append("        ");
      _builder_2.append("},");
      _builder_2.newLine();
      String _plus_3 = (_plus_2 + _builder_2);
      datasets = (_datasets + _plus_3);
    }
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("<html>");
    _builder_3.newLine();
    _builder_3.append("<head>");
    _builder_3.newLine();
    _builder_3.append("  ");
    _builder_3.append("<script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>");
    _builder_3.newLine();
    _builder_3.append("   ");
    _builder_3.append("<title>");
    String _plus_4 = (_builder_3.toString() + titlechart);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("</title>");
    _builder_4.newLine();
    _builder_4.append("    ");
    _builder_4.append("</head>");
    _builder_4.newLine();
    _builder_4.append("    ");
    _builder_4.append("<body>");
    _builder_4.newLine();
    _builder_4.append("      ");
    _builder_4.append("<canvas id=\"myChart\"></canvas>");
    _builder_4.newLine();
    _builder_4.append("      ");
    _builder_4.append("<script>");
    _builder_4.newLine();
    _builder_4.append("      ");
    _builder_4.append("const CHART_COLORS = {");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("redt: \'rgba(255, 99, 132, 0.6)\',");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("red: \'rgb(255, 99, 132)\',");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("orange: \'rgb(255, 159, 64)\',");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("yellow: \'rgb(255, 205, 86)\',");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("green: \'rgb(75, 192, 192)\',");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("bluet: \'rgba(54, 162, 235,0.6)\',");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("blue: \'rgb(54, 162, 235)\',");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("purple: \'rgb(153, 102, 255)\',");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("grey: \'rgb(201, 203, 207)\'");
    _builder_4.newLine();
    _builder_4.append("      ");
    _builder_4.append("};");
    _builder_4.newLine();
    _builder_4.append("      ");
    _builder_4.newLine();
    _builder_4.append("      ");
    _builder_4.append("const NAMED_COLORS = [");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("CHART_COLORS.red,");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("CHART_COLORS.orange,");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("CHART_COLORS.yellow,");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("CHART_COLORS.green,");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("CHART_COLORS.blue,");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("CHART_COLORS.purple,");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("CHART_COLORS.grey,");
    _builder_4.newLine();
    _builder_4.append("      ");
    _builder_4.append("];");
    _builder_4.newLine();
    _builder_4.append("      ");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("const data = ");
    String _plus_5 = (_plus_4 + _builder_4);
    String _replaceAll = constdata.toString().replaceAll("\\[", "\\[").replaceAll("\\]", "\\]");
    String _plus_6 = (_plus_5 + _replaceAll);
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append(";");
    _builder_5.newLine();
    _builder_5.append("        ");
    _builder_5.append("console.log(data);");
    _builder_5.newLine();
    _builder_5.append("        ");
    _builder_5.append("new Chart(");
    _builder_5.newLine();
    _builder_5.append("        ");
    _builder_5.append("document.getElementById(\'myChart\'),");
    _builder_5.newLine();
    _builder_5.append("        ");
    _builder_5.append("{");
    _builder_5.newLine();
    _builder_5.append("          ");
    _builder_5.append("type: \'pie\',");
    _builder_5.newLine();
    _builder_5.append("          ");
    _builder_5.append("data: {");
    _builder_5.newLine();
    _builder_5.append("            ");
    _builder_5.append("labels: data.map(row => row.");
    String _plus_7 = (_plus_6 + _builder_5);
    String _plus_8 = (_plus_7 + xlabel);
    StringConcatenation _builder_6 = new StringConcatenation();
    _builder_6.append("),");
    _builder_6.newLine();
    _builder_6.append("            ");
    _builder_6.append("datasets: [ ");
    String _plus_9 = (_plus_8 + _builder_6);
    String _plus_10 = (_plus_9 + datasets);
    StringConcatenation _builder_7 = new StringConcatenation();
    _builder_7.append(" ");
    _builder_7.append("],");
    _builder_7.newLine();
    _builder_7.append("          ");
    _builder_7.append("}");
    _builder_7.newLine();
    _builder_7.append("        ");
    _builder_7.append("}");
    _builder_7.newLine();
    _builder_7.append("      ");
    _builder_7.append(");");
    _builder_7.newLine();
    _builder_7.append("      ");
    _builder_7.append("</script>");
    _builder_7.newLine();
    _builder_7.append("    ");
    _builder_7.append("</head>");
    _builder_7.newLine();
    _builder_7.append("    ");
    _builder_7.append("<body>");
    _builder_7.newLine();
    _builder_7.append("    ");
    _builder_7.append("</body>");
    _builder_7.newLine();
    _builder_7.append("  ");
    _builder_7.append("</html>");
    _builder_7.newLine();
    final String chartContent = (_plus_10 + _builder_7);
    return chartContent;
  }
  
  public List<String> processSelectedColumns(final List<String> selectedColumns, final List<String> csvContent) {
    final Function<String, String> _function = (String line) -> {
      String _xblockexpression = null;
      {
        final String[] splitLine = line.split(";");
        final Function1<String, String> _function_1 = (String colName) -> {
          String _xblockexpression_1 = null;
          {
            final int colIndex = ((List<String>)Conversions.doWrapArray(csvContent.get(0).split(";"))).indexOf(colName);
            String _xifexpression = null;
            if (((colIndex >= 0) && (colIndex < splitLine.length))) {
              _xifexpression = splitLine[colIndex];
            } else {
              _xifexpression = "";
            }
            _xblockexpression_1 = _xifexpression;
          }
          return _xblockexpression_1;
        };
        final List<String> selectedLine = ListExtensions.<String, String>map(selectedColumns, _function_1);
        String _xifexpression = null;
        final Function1<Object, Boolean> _function_2 = (Object it) -> {
          return Boolean.valueOf(Objects.equal(it, ""));
        };
        boolean _contains = selectedLine.contains(_function_2);
        if (_contains) {
          _xifexpression = null;
        } else {
          _xifexpression = IterableExtensions.join(selectedLine, ";");
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    };
    final Predicate<String> _function_1 = (String it) -> {
      return ((!Objects.equal(it, null)) && (!Objects.equal(it, "")));
    };
    return csvContent.stream().<String>map(_function).filter(_function_1).collect(Collectors.<String>toList());
  }
  
  public List<String> applyFilterfun(final String columname, final FilterType filter, final String filtervalue, final List<String> selectedCsvContent) {
    final List<String> filteredCsvContent = selectedCsvContent.stream().limit(2).collect(Collectors.<String>toList());
    final Predicate<String> _function = (String line) -> {
      boolean _xblockexpression = false;
      {
        final String[] splitLine = line.split(";");
        final int colIndex = ((List<String>)Conversions.doWrapArray(selectedCsvContent.get(0).split(";"))).indexOf(columname);
        boolean _xifexpression = false;
        int _length = splitLine.length;
        boolean _greaterEqualsThan = (colIndex >= _length);
        if (_greaterEqualsThan) {
          _xifexpression = false;
        } else {
          boolean _xblockexpression_1 = false;
          {
            final String colValue = splitLine[colIndex];
            boolean _switchResult = false;
            if (filter != null) {
              switch (filter) {
                case EQUAL:
                  _switchResult = colValue.equals(filtervalue);
                  break;
                case INF:
                  int _parseInt = Integer.parseInt(colValue);
                  int _parseInt_1 = Integer.parseInt(filtervalue);
                  _switchResult = (_parseInt < _parseInt_1);
                  break;
                case SUP:
                  int _parseInt_2 = Integer.parseInt(colValue);
                  int _parseInt_3 = Integer.parseInt(filtervalue);
                  _switchResult = (_parseInt_2 > _parseInt_3);
                  break;
                default:
                  break;
              }
            }
            _xblockexpression_1 = _switchResult;
          }
          _xifexpression = _xblockexpression_1;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    };
    filteredCsvContent.addAll(selectedCsvContent.stream().skip(2).filter(_function).collect(Collectors.<String>toList()));
    return filteredCsvContent;
  }
}
