/**
 */
package programChartSawsen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see programChartSawsen.ProgramChartSawsenFactory
 * @model kind="package"
 * @generated
 */
public interface ProgramChartSawsenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "programChartSawsen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/programChartSawsen";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "programChartSawsen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProgramChartSawsenPackage eINSTANCE = programChartSawsen.impl.ProgramChartSawsenPackageImpl.init();

	/**
	 * The meta object id for the '{@link programChartSawsen.impl.FunctionsImpl <em>Functions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programChartSawsen.impl.FunctionsImpl
	 * @see programChartSawsen.impl.ProgramChartSawsenPackageImpl#getFunctions()
	 * @generated
	 */
	int FUNCTIONS = 3;

	/**
	 * The number of structural features of the '<em>Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link programChartSawsen.impl.ApplyFilterImpl <em>Apply Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programChartSawsen.impl.ApplyFilterImpl
	 * @see programChartSawsen.impl.ProgramChartSawsenPackageImpl#getApplyFilter()
	 * @generated
	 */
	int APPLY_FILTER = 0;

	/**
	 * The feature id for the '<em><b>Columname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_FILTER__COLUMNAME = FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_FILTER__FILTER = FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filtervalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_FILTER__FILTERVALUE = FUNCTIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Filteredoutput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_FILTER__FILTEREDOUTPUT = FUNCTIONS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Apply Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_FILTER_FEATURE_COUNT = FUNCTIONS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Apply Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_FILTER_OPERATION_COUNT = FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link programChartSawsen.impl.CreateChartImpl <em>Create Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programChartSawsen.impl.CreateChartImpl
	 * @see programChartSawsen.impl.ProgramChartSawsenPackageImpl#getCreateChart()
	 * @generated
	 */
	int CREATE_CHART = 1;

	/**
	 * The feature id for the '<em><b>Chart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CHART__CHART = FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xlabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CHART__XLABEL = FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ylabel</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CHART__YLABEL = FUNCTIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Titlechart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CHART__TITLECHART = FUNCTIONS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Create Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CHART_FEATURE_COUNT = FUNCTIONS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Create Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CHART_OPERATION_COUNT = FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link programChartSawsen.impl.ProgChartImpl <em>Prog Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programChartSawsen.impl.ProgChartImpl
	 * @see programChartSawsen.impl.ProgramChartSawsenPackageImpl#getProgChart()
	 * @generated
	 */
	int PROG_CHART = 4;

	/**
	 * The meta object id for the '{@link programChartSawsen.impl.CsvLoaderImpl <em>Csv Loader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programChartSawsen.impl.CsvLoaderImpl
	 * @see programChartSawsen.impl.ProgramChartSawsenPackageImpl#getCsvLoader()
	 * @generated
	 */
	int CSV_LOADER = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOADER__PATH = FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Csv Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOADER_FEATURE_COUNT = FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Csv Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOADER_OPERATION_COUNT = FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_CHART__FUNCTIONS = 0;

	/**
	 * The number of structural features of the '<em>Prog Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_CHART_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Prog Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_CHART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link programChartSawsen.impl.SelectedColumnsImpl <em>Selected Columns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programChartSawsen.impl.SelectedColumnsImpl
	 * @see programChartSawsen.impl.ProgramChartSawsenPackageImpl#getSelectedColumns()
	 * @generated
	 */
	int SELECTED_COLUMNS = 5;

	/**
	 * The feature id for the '<em><b>Columnsname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_COLUMNS__COLUMNSNAME = FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_COLUMNS__OUTPUTPATH = FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Selected Columns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_COLUMNS_FEATURE_COUNT = FUNCTIONS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Selected Columns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_COLUMNS_OPERATION_COUNT = FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link programChartSawsen.ChartType <em>Chart Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programChartSawsen.ChartType
	 * @see programChartSawsen.impl.ProgramChartSawsenPackageImpl#getChartType()
	 * @generated
	 */
	int CHART_TYPE = 6;

	/**
	 * The meta object id for the '{@link programChartSawsen.FilterType <em>Filter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programChartSawsen.FilterType
	 * @see programChartSawsen.impl.ProgramChartSawsenPackageImpl#getFilterType()
	 * @generated
	 */
	int FILTER_TYPE = 7;

	/**
	 * Returns the meta object for class '{@link programChartSawsen.ApplyFilter <em>Apply Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apply Filter</em>'.
	 * @see programChartSawsen.ApplyFilter
	 * @generated
	 */
	EClass getApplyFilter();

	/**
	 * Returns the meta object for the attribute '{@link programChartSawsen.ApplyFilter#getColumname <em>Columname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columname</em>'.
	 * @see programChartSawsen.ApplyFilter#getColumname()
	 * @see #getApplyFilter()
	 * @generated
	 */
	EAttribute getApplyFilter_Columname();

	/**
	 * Returns the meta object for the attribute '{@link programChartSawsen.ApplyFilter#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see programChartSawsen.ApplyFilter#getFilter()
	 * @see #getApplyFilter()
	 * @generated
	 */
	EAttribute getApplyFilter_Filter();

	/**
	 * Returns the meta object for the attribute '{@link programChartSawsen.ApplyFilter#getFiltervalue <em>Filtervalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filtervalue</em>'.
	 * @see programChartSawsen.ApplyFilter#getFiltervalue()
	 * @see #getApplyFilter()
	 * @generated
	 */
	EAttribute getApplyFilter_Filtervalue();

	/**
	 * Returns the meta object for the attribute '{@link programChartSawsen.ApplyFilter#getFilteredoutput <em>Filteredoutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filteredoutput</em>'.
	 * @see programChartSawsen.ApplyFilter#getFilteredoutput()
	 * @see #getApplyFilter()
	 * @generated
	 */
	EAttribute getApplyFilter_Filteredoutput();

	/**
	 * Returns the meta object for class '{@link programChartSawsen.CreateChart <em>Create Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Chart</em>'.
	 * @see programChartSawsen.CreateChart
	 * @generated
	 */
	EClass getCreateChart();

	/**
	 * Returns the meta object for the attribute '{@link programChartSawsen.CreateChart#getChart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chart</em>'.
	 * @see programChartSawsen.CreateChart#getChart()
	 * @see #getCreateChart()
	 * @generated
	 */
	EAttribute getCreateChart_Chart();

	/**
	 * Returns the meta object for the attribute '{@link programChartSawsen.CreateChart#getXlabel <em>Xlabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xlabel</em>'.
	 * @see programChartSawsen.CreateChart#getXlabel()
	 * @see #getCreateChart()
	 * @generated
	 */
	EAttribute getCreateChart_Xlabel();

	/**
	 * Returns the meta object for the attribute list '{@link programChartSawsen.CreateChart#getYlabel <em>Ylabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ylabel</em>'.
	 * @see programChartSawsen.CreateChart#getYlabel()
	 * @see #getCreateChart()
	 * @generated
	 */
	EAttribute getCreateChart_Ylabel();

	/**
	 * Returns the meta object for the attribute '{@link programChartSawsen.CreateChart#getTitlechart <em>Titlechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titlechart</em>'.
	 * @see programChartSawsen.CreateChart#getTitlechart()
	 * @see #getCreateChart()
	 * @generated
	 */
	EAttribute getCreateChart_Titlechart();

	/**
	 * Returns the meta object for class '{@link programChartSawsen.ProgChart <em>Prog Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prog Chart</em>'.
	 * @see programChartSawsen.ProgChart
	 * @generated
	 */
	EClass getProgChart();

	/**
	 * Returns the meta object for the containment reference list '{@link programChartSawsen.ProgChart#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see programChartSawsen.ProgChart#getFunctions()
	 * @see #getProgChart()
	 * @generated
	 */
	EReference getProgChart_Functions();

	/**
	 * Returns the meta object for class '{@link programChartSawsen.SelectedColumns <em>Selected Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selected Columns</em>'.
	 * @see programChartSawsen.SelectedColumns
	 * @generated
	 */
	EClass getSelectedColumns();

	/**
	 * Returns the meta object for the attribute list '{@link programChartSawsen.SelectedColumns#getColumnsname <em>Columnsname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Columnsname</em>'.
	 * @see programChartSawsen.SelectedColumns#getColumnsname()
	 * @see #getSelectedColumns()
	 * @generated
	 */
	EAttribute getSelectedColumns_Columnsname();

	/**
	 * Returns the meta object for the attribute '{@link programChartSawsen.SelectedColumns#getOutputpath <em>Outputpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outputpath</em>'.
	 * @see programChartSawsen.SelectedColumns#getOutputpath()
	 * @see #getSelectedColumns()
	 * @generated
	 */
	EAttribute getSelectedColumns_Outputpath();

	/**
	 * Returns the meta object for class '{@link programChartSawsen.CsvLoader <em>Csv Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Csv Loader</em>'.
	 * @see programChartSawsen.CsvLoader
	 * @generated
	 */
	EClass getCsvLoader();

	/**
	 * Returns the meta object for the attribute '{@link programChartSawsen.CsvLoader#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see programChartSawsen.CsvLoader#getPath()
	 * @see #getCsvLoader()
	 * @generated
	 */
	EAttribute getCsvLoader_Path();

	/**
	 * Returns the meta object for class '{@link programChartSawsen.Functions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functions</em>'.
	 * @see programChartSawsen.Functions
	 * @generated
	 */
	EClass getFunctions();

	/**
	 * Returns the meta object for enum '{@link programChartSawsen.ChartType <em>Chart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Chart Type</em>'.
	 * @see programChartSawsen.ChartType
	 * @generated
	 */
	EEnum getChartType();

	/**
	 * Returns the meta object for enum '{@link programChartSawsen.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Filter Type</em>'.
	 * @see programChartSawsen.FilterType
	 * @generated
	 */
	EEnum getFilterType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProgramChartSawsenFactory getProgramChartSawsenFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link programChartSawsen.impl.ApplyFilterImpl <em>Apply Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programChartSawsen.impl.ApplyFilterImpl
		 * @see programChartSawsen.impl.ProgramChartSawsenPackageImpl#getApplyFilter()
		 * @generated
		 */
		EClass APPLY_FILTER = eINSTANCE.getApplyFilter();

		/**
		 * The meta object literal for the '<em><b>Columname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLY_FILTER__COLUMNAME = eINSTANCE.getApplyFilter_Columname();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLY_FILTER__FILTER = eINSTANCE.getApplyFilter_Filter();

		/**
		 * The meta object literal for the '<em><b>Filtervalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLY_FILTER__FILTERVALUE = eINSTANCE.getApplyFilter_Filtervalue();

		/**
		 * The meta object literal for the '<em><b>Filteredoutput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLY_FILTER__FILTEREDOUTPUT = eINSTANCE.getApplyFilter_Filteredoutput();

		/**
		 * The meta object literal for the '{@link programChartSawsen.impl.CreateChartImpl <em>Create Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programChartSawsen.impl.CreateChartImpl
		 * @see programChartSawsen.impl.ProgramChartSawsenPackageImpl#getCreateChart()
		 * @generated
		 */
		EClass CREATE_CHART = eINSTANCE.getCreateChart();

		/**
		 * The meta object literal for the '<em><b>Chart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_CHART__CHART = eINSTANCE.getCreateChart_Chart();

		/**
		 * The meta object literal for the '<em><b>Xlabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_CHART__XLABEL = eINSTANCE.getCreateChart_Xlabel();

		/**
		 * The meta object literal for the '<em><b>Ylabel</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_CHART__YLABEL = eINSTANCE.getCreateChart_Ylabel();

		/**
		 * The meta object literal for the '<em><b>Titlechart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_CHART__TITLECHART = eINSTANCE.getCreateChart_Titlechart();

		/**
		 * The meta object literal for the '{@link programChartSawsen.impl.ProgChartImpl <em>Prog Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programChartSawsen.impl.ProgChartImpl
		 * @see programChartSawsen.impl.ProgramChartSawsenPackageImpl#getProgChart()
		 * @generated
		 */
		EClass PROG_CHART = eINSTANCE.getProgChart();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROG_CHART__FUNCTIONS = eINSTANCE.getProgChart_Functions();

		/**
		 * The meta object literal for the '{@link programChartSawsen.impl.SelectedColumnsImpl <em>Selected Columns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programChartSawsen.impl.SelectedColumnsImpl
		 * @see programChartSawsen.impl.ProgramChartSawsenPackageImpl#getSelectedColumns()
		 * @generated
		 */
		EClass SELECTED_COLUMNS = eINSTANCE.getSelectedColumns();

		/**
		 * The meta object literal for the '<em><b>Columnsname</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTED_COLUMNS__COLUMNSNAME = eINSTANCE.getSelectedColumns_Columnsname();

		/**
		 * The meta object literal for the '<em><b>Outputpath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTED_COLUMNS__OUTPUTPATH = eINSTANCE.getSelectedColumns_Outputpath();

		/**
		 * The meta object literal for the '{@link programChartSawsen.impl.CsvLoaderImpl <em>Csv Loader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programChartSawsen.impl.CsvLoaderImpl
		 * @see programChartSawsen.impl.ProgramChartSawsenPackageImpl#getCsvLoader()
		 * @generated
		 */
		EClass CSV_LOADER = eINSTANCE.getCsvLoader();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_LOADER__PATH = eINSTANCE.getCsvLoader_Path();

		/**
		 * The meta object literal for the '{@link programChartSawsen.impl.FunctionsImpl <em>Functions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programChartSawsen.impl.FunctionsImpl
		 * @see programChartSawsen.impl.ProgramChartSawsenPackageImpl#getFunctions()
		 * @generated
		 */
		EClass FUNCTIONS = eINSTANCE.getFunctions();

		/**
		 * The meta object literal for the '{@link programChartSawsen.ChartType <em>Chart Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programChartSawsen.ChartType
		 * @see programChartSawsen.impl.ProgramChartSawsenPackageImpl#getChartType()
		 * @generated
		 */
		EEnum CHART_TYPE = eINSTANCE.getChartType();

		/**
		 * The meta object literal for the '{@link programChartSawsen.FilterType <em>Filter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programChartSawsen.FilterType
		 * @see programChartSawsen.impl.ProgramChartSawsenPackageImpl#getFilterType()
		 * @generated
		 */
		EEnum FILTER_TYPE = eINSTANCE.getFilterType();

	}

} //ProgramChartSawsenPackage
