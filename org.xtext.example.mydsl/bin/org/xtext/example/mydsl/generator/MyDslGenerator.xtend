package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import programChartSawsen.ApplyFilter
import programChartSawsen.CreateChart
import programChartSawsen.ProgChart
import programChartSawsen.CsvLoader
import programChartSawsen.FilterType
import java.nio.file.Files
import java.nio.file.Paths
import java.util.stream.Collectors
import programChartSawsen.SelectedColumns
import java.util.function.Function
import java.util.ArrayList
import org.eclipse.emf.common.util.EList
import java.util.List
import programChartSawsen.ChartType
import java.util.HashMap

class MyDslGenerator extends AbstractGenerator {
  override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
    val prog = resource.contents.get(0) as ProgChart
    var selectedCsvContent = new ArrayList<String>() as List<String>
    var filteredCsvContent = new ArrayList<String>() as List<String>
    var csvFilePath = ""
    for (function : prog.functions) {
      if (function instanceof CsvLoader) {
        val csvLoader = function as CsvLoader
        csvFilePath = csvLoader.path
      }  
    }
val csvContent = Files.readAllLines(Paths.get(csvFilePath))
val headers = csvContent.get(0).split(";")
val cleanedHeaders = headers.map[header | header.replaceAll("[^a-zA-Z0-9àâçéèêëîïôûùüÿñæœÀÂÇÉÈÊËÎÏÔÛÙÜŸÑÆŒ]", "")]
csvContent.set(0, cleanedHeaders.join(";"))
fsa.generateFile("output.csv", csvContent.join("\n"))

  for (function : prog.functions) {
      if (function instanceof SelectedColumns) {
        val selectedCols = function as SelectedColumns
        val selectedColumns = selectedCols.columnsname
        val outputpath = selectedCols.outputpath 
        selectedCsvContent = processSelectedColumns(selectedColumns,csvContent)
      fsa.generateFile(selectedCols.outputpath,  selectedCsvContent.join("\n"))
        
      }
    }
    for (function : prog.functions) {
      if (function instanceof ApplyFilter) {
        val applyFilter = function as ApplyFilter
        val columname = applyFilter.columname
        val filter = applyFilter.filter
        val filtervalue = applyFilter.filtervalue
        filteredCsvContent = applyFilterfun(columname, filter, filtervalue, selectedCsvContent)
        if (applyFilter.filteredoutput != null) {
          fsa.generateFile(applyFilter.filteredoutput, filteredCsvContent.join("\n"))
        }
      }
    }

   val yLabels = new ArrayList<String>()   
for (function : prog.functions) {
  if (function instanceof CreateChart) {
    val createChart = function as CreateChart
    val chart= createChart.chart
    val xlabel = createChart.xlabel
     val titlechart = createChart.titlechart
  val yLabelList = createChart.ylabel
    yLabels.addAll(yLabelList)
    var chartContent = ""

    switch (chart) {
      case ChartType.HISTOGRAM:
        chartContent = generateHistogramChart(xlabel, yLabels , filteredCsvContent, titlechart)
      case ChartType.PIE:
        chartContent = generatePieChart(xlabel,yLabels , filteredCsvContent , titlechart)
      case ChartType.LINE:
		chartContent = generateLineChart(xlabel,yLabels , filteredCsvContent , titlechart)

    }
      if (createChart.chart != null) {
      fsa.generateFile(createChart.chart + ".html", chartContent)
    }
  }
}}
def generateHistogramChart(String xlabel,  List<String> yLabels, List<String> filteredCsvContent , String titlechart) {
  // Convert filteredCsvContent to a JavaScript object array
  val headers = filteredCsvContent.get(0).split(";")
  val constdata = new ArrayList<String>()

  for (i : 2 .. filteredCsvContent.size - 1) {
    val line = filteredCsvContent.get(i)
    val row = line.split(";")
    val rowData = new StringBuilder()

    rowData.append("{")
    for (j : 0 .. headers.size - 1) {
      rowData.append("\"").append(headers.get(j)).append("\":\"").append(row.get(j)).append("\",")
    }
    rowData.deleteCharAt(rowData.length() - 1)
    rowData.append("}")

    // Replace the "=" sign with a ":" sign
    val jsonString = rowData.toString().replace("=", ":")
    constdata.add(jsonString)
  }
  // Create datasets
var datasets = ""
for (i : 0 ..< yLabels.size) {
    datasets += '''
        {
          label:'   '''+{yLabels.get(i)}+ ''' ',
          data: data.map(row => row.'''+{yLabels.get(i)} + ''')
        },
    '''
}

 // Create the HTML content
 val chartContent = '''
    <html>
    <head>
      <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
      <title>'''+ titlechart + '''</title>
    </head>
    <body>
      <canvas id="myChart"></canvas>
      <script>
         const CHART_COLORS = {
           redt: 'rgba(255, 99, 132, 0.6)',
           red: 'rgb(255, 99, 132)',
           orange: 'rgb(255, 159, 64)',
           yellow: 'rgb(255, 205, 86)',
           green: 'rgb(75, 192, 192)',
           bluet: 'rgba(54, 162, 235,0.6)',
           blue: 'rgb(54, 162, 235)',
           purple: 'rgb(153, 102, 255)',
           grey: 'rgb(201, 203, 207)'
         };
         
         const NAMED_COLORS = [
           CHART_COLORS.red,
           CHART_COLORS.orange,
           CHART_COLORS.yellow,
           CHART_COLORS.green,
           CHART_COLORS.blue,
           CHART_COLORS.purple,
           CHART_COLORS.grey,
         ];
         
        const data = ''' + constdata.toString.replaceAll("\\[", "\\[").replaceAll("\\]", "\\]") + ''';
        console.log(data);
         new Chart(
            document.getElementById('myChart'),
            {
              type: 'bar',
             data: {
                        labels: data.map(row => row.'''+ xlabel +'''),
                        datasets: [ ''' + datasets + ''' ],
                      }
                    }
                  );
                  </script>
                </head>
                <body>
                </body>
              </html>
            '''  return chartContent
}

def generateLineChart(String xlabel,  List<String> yLabels, List<String> filteredCsvContent, String titlechart) {
  // Convert filteredCsvContent to a JavaScript object array
  val headers = filteredCsvContent.get(0).split(";")
  val constdata = new ArrayList<String>()

  for (i : 2 .. filteredCsvContent.size - 1) {
    val line = filteredCsvContent.get(i)
    val row = line.split(";")
    val rowData = new StringBuilder()

    rowData.append("{")
    for (j : 0 .. headers.size - 1) {
      rowData.append("\"").append(headers.get(j)).append("\":\"").append(row.get(j)).append("\",")
    }
    rowData.deleteCharAt(rowData.length() - 1)
    rowData.append("}")

    // Replace the "=" sign with a ":" sign
    val jsonString = rowData.toString().replace("=", ":")
    constdata.add(jsonString)
  }

// Create datasets
var datasets = ""
for (i : 0 ..< yLabels.size) {
    datasets += '''
        {
          label:'   '''+{yLabels.get(i)}+ ''' ',
          data: data.map(row => row.'''+{yLabels.get(i)} + ''')
        },
    '''
}


// création du code HTML avec les données
val chartContent = '''
    <html>
    <head>
      <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
       <title>'''+ titlechart + '''</title>
    </head>
    <body>
      <canvas id="myChart"></canvas>
      <script>
      const CHART_COLORS = {
        redt: 'rgba(255, 99, 132, 0.6)',
        red: 'rgb(255, 99, 132)',
        orange: 'rgb(255, 159, 64)',
        yellow: 'rgb(255, 205, 86)',
        green: 'rgb(75, 192, 192)',
        bluet: 'rgba(54, 162, 235,0.6)',
        blue: 'rgb(54, 162, 235)',
        purple: 'rgb(153, 102, 255)',
        grey: 'rgb(201, 203, 207)'
      };
      
      const NAMED_COLORS = [
        CHART_COLORS.red,
        CHART_COLORS.orange,
        CHART_COLORS.yellow,
        CHART_COLORS.green,
        CHART_COLORS.blue,
        CHART_COLORS.purple,
        CHART_COLORS.grey,
      ];
      
        const data = ''' + constdata.toString.replaceAll("\\[", "\\[").replaceAll("\\]", "\\]") + ''';
        console.log(data);
        new Chart(
        document.getElementById('myChart'),
        {
          type: 'line',
          data: {
            labels: data.map(row => row.'''+ xlabel +'''),
            datasets: [ ''' + datasets + ''' ],
          }
        }
      );
      </script>
    </head>
    <body>
    </body>
  </html>
'''
return chartContent
}

def generatePieChart(String xlabel,  List<String> yLabels, List<String> filteredCsvContent ,  String titlechart) {
// conversion de filteredCsvContent en un tableau d'objets JavaScript
  val headers = filteredCsvContent.get(0).split(";")
  val constdata = new ArrayList<String>()

  for (i : 2 .. filteredCsvContent.size - 1) {
    val line = filteredCsvContent.get(i)
    val row = line.split(";")
    val rowData = new StringBuilder()

    rowData.append("{")
    for (j : 0 .. headers.size - 1) {
      rowData.append("\"").append(headers.get(j)).append("\":\"").append(row.get(j)).append("\",")
    }
    rowData.deleteCharAt(rowData.length() - 1)
    rowData.append("}")

    // Replace the "=" sign with a ":" sign
    val jsonString = rowData.toString().replace("=", ":")
    constdata.add(jsonString)
  }
  // Create datasets
var datasets = ""
for (i : 0 ..< yLabels.size) {
    datasets += '''
        {
          label:'   '''+{yLabels.get(i)}+ ''' ',
          data: data.map(row => row.'''+{yLabels.get(i)} + ''')
        },
    '''
}
  
// création du code HTML avec les données
val chartContent = '''
    <html>
    <head>
      <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
       <title>'''+ titlechart + '''</title>
    </head>
    <body>
      <canvas id="myChart"></canvas>
      <script>
      const CHART_COLORS = {
        redt: 'rgba(255, 99, 132, 0.6)',
        red: 'rgb(255, 99, 132)',
        orange: 'rgb(255, 159, 64)',
        yellow: 'rgb(255, 205, 86)',
        green: 'rgb(75, 192, 192)',
        bluet: 'rgba(54, 162, 235,0.6)',
        blue: 'rgb(54, 162, 235)',
        purple: 'rgb(153, 102, 255)',
        grey: 'rgb(201, 203, 207)'
      };
      
      const NAMED_COLORS = [
        CHART_COLORS.red,
        CHART_COLORS.orange,
        CHART_COLORS.yellow,
        CHART_COLORS.green,
        CHART_COLORS.blue,
        CHART_COLORS.purple,
        CHART_COLORS.grey,
      ];
      
        const data = ''' + constdata.toString.replaceAll("\\[", "\\[").replaceAll("\\]", "\\]") + ''';
        console.log(data);
        new Chart(
        document.getElementById('myChart'),
        {
          type: 'pie',
          data: {
            labels: data.map(row => row.'''+ xlabel +'''),
            datasets: [ ''' + datasets + ''' ],
          }
        }
      );
      </script>
    </head>
    <body>
    </body>
  </html>
'''
return chartContent
}



def processSelectedColumns(List<String> selectedColumns, List<String> csvContent) {
    csvContent.stream().map [line |
        val splitLine = line.split(";")
        val selectedLine = selectedColumns.map[colName |
            val colIndex = csvContent.get(0).split(";").indexOf(colName)
            if (colIndex >= 0 && colIndex < splitLine.length) {
                splitLine.get(colIndex)
            } else {
                ""
            }
        ]
        if (selectedLine.contains[it == ""]) {
            null
        } else {
            selectedLine.join(";")
        }
    ].filter[it != null && it != ""].collect(Collectors.toList())
}

def applyFilterfun(String columname, FilterType filter, String filtervalue, List<String> selectedCsvContent) {
  val filteredCsvContent = selectedCsvContent.stream().limit(2).collect(Collectors.toList()) // copier les deux premières lignes
  filteredCsvContent.addAll(selectedCsvContent.stream().skip(2).filter [line |
    val splitLine = line.split(";")
    val colIndex = selectedCsvContent.get(0).split(";").indexOf(columname)
    if (colIndex >= splitLine.length) {
      false // valeur manquante, on saute la ligne
    } else {
      val colValue = splitLine.get(colIndex)
      switch(filter) {
        case FilterType.EQUAL: colValue.equals(filtervalue)
        case FilterType.INF: Integer::parseInt(colValue) < Integer::parseInt(filtervalue)
        case FilterType.SUP: Integer::parseInt(colValue) > Integer::parseInt(filtervalue)
      }
    }
  ].collect(Collectors.toList()))
  return filteredCsvContent
}

  
}
  
     
        
    

  




