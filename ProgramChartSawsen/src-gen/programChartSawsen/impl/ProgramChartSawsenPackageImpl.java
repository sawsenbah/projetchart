/**
 */
package programChartSawsen.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import programChartSawsen.ApplyFilter;
import programChartSawsen.ChartType;
import programChartSawsen.CreateChart;
import programChartSawsen.CsvLoader;
import programChartSawsen.FilterType;
import programChartSawsen.Functions;
import programChartSawsen.ProgChart;
import programChartSawsen.ProgramChartSawsenFactory;
import programChartSawsen.ProgramChartSawsenPackage;
import programChartSawsen.SelectedColumns;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgramChartSawsenPackageImpl extends EPackageImpl implements ProgramChartSawsenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applyFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectedColumnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csvLoaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chartTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filterTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see programChartSawsen.ProgramChartSawsenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProgramChartSawsenPackageImpl() {
		super(eNS_URI, ProgramChartSawsenFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ProgramChartSawsenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProgramChartSawsenPackage init() {
		if (isInited)
			return (ProgramChartSawsenPackage) EPackage.Registry.INSTANCE
					.getEPackage(ProgramChartSawsenPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProgramChartSawsenPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProgramChartSawsenPackageImpl theProgramChartSawsenPackage = registeredProgramChartSawsenPackage instanceof ProgramChartSawsenPackageImpl
				? (ProgramChartSawsenPackageImpl) registeredProgramChartSawsenPackage
				: new ProgramChartSawsenPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theProgramChartSawsenPackage.createPackageContents();

		// Initialize created meta-data
		theProgramChartSawsenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProgramChartSawsenPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProgramChartSawsenPackage.eNS_URI, theProgramChartSawsenPackage);
		return theProgramChartSawsenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplyFilter() {
		return applyFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplyFilter_Columname() {
		return (EAttribute) applyFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplyFilter_Filter() {
		return (EAttribute) applyFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplyFilter_Filtervalue() {
		return (EAttribute) applyFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplyFilter_Filteredoutput() {
		return (EAttribute) applyFilterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateChart() {
		return createChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateChart_Chart() {
		return (EAttribute) createChartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateChart_Xlabel() {
		return (EAttribute) createChartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateChart_Ylabel() {
		return (EAttribute) createChartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateChart_Titlechart() {
		return (EAttribute) createChartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgChart() {
		return progChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgChart_Functions() {
		return (EReference) progChartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectedColumns() {
		return selectedColumnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectedColumns_Columnsname() {
		return (EAttribute) selectedColumnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectedColumns_Outputpath() {
		return (EAttribute) selectedColumnsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCsvLoader() {
		return csvLoaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCsvLoader_Path() {
		return (EAttribute) csvLoaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctions() {
		return functionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChartType() {
		return chartTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFilterType() {
		return filterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramChartSawsenFactory getProgramChartSawsenFactory() {
		return (ProgramChartSawsenFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		applyFilterEClass = createEClass(APPLY_FILTER);
		createEAttribute(applyFilterEClass, APPLY_FILTER__COLUMNAME);
		createEAttribute(applyFilterEClass, APPLY_FILTER__FILTER);
		createEAttribute(applyFilterEClass, APPLY_FILTER__FILTERVALUE);
		createEAttribute(applyFilterEClass, APPLY_FILTER__FILTEREDOUTPUT);

		createChartEClass = createEClass(CREATE_CHART);
		createEAttribute(createChartEClass, CREATE_CHART__CHART);
		createEAttribute(createChartEClass, CREATE_CHART__XLABEL);
		createEAttribute(createChartEClass, CREATE_CHART__YLABEL);
		createEAttribute(createChartEClass, CREATE_CHART__TITLECHART);

		csvLoaderEClass = createEClass(CSV_LOADER);
		createEAttribute(csvLoaderEClass, CSV_LOADER__PATH);

		functionsEClass = createEClass(FUNCTIONS);

		progChartEClass = createEClass(PROG_CHART);
		createEReference(progChartEClass, PROG_CHART__FUNCTIONS);

		selectedColumnsEClass = createEClass(SELECTED_COLUMNS);
		createEAttribute(selectedColumnsEClass, SELECTED_COLUMNS__COLUMNSNAME);
		createEAttribute(selectedColumnsEClass, SELECTED_COLUMNS__OUTPUTPATH);

		// Create enums
		chartTypeEEnum = createEEnum(CHART_TYPE);
		filterTypeEEnum = createEEnum(FILTER_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		applyFilterEClass.getESuperTypes().add(this.getFunctions());
		createChartEClass.getESuperTypes().add(this.getFunctions());
		csvLoaderEClass.getESuperTypes().add(this.getFunctions());
		selectedColumnsEClass.getESuperTypes().add(this.getFunctions());

		// Initialize classes, features, and operations; add parameters
		initEClass(applyFilterEClass, ApplyFilter.class, "ApplyFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplyFilter_Columname(), ecorePackage.getEString(), "columname", null, 0, 1,
				ApplyFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplyFilter_Filter(), this.getFilterType(), "filter", null, 0, 1, ApplyFilter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplyFilter_Filtervalue(), ecorePackage.getEString(), "filtervalue", null, 0, 1,
				ApplyFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplyFilter_Filteredoutput(), ecorePackage.getEString(), "filteredoutput", null, 0, 1,
				ApplyFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(createChartEClass, CreateChart.class, "CreateChart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateChart_Chart(), this.getChartType(), "chart", null, 0, 1, CreateChart.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateChart_Xlabel(), ecorePackage.getEString(), "xlabel", null, 0, 1, CreateChart.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateChart_Ylabel(), ecorePackage.getEString(), "ylabel", null, 0, -1, CreateChart.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateChart_Titlechart(), ecorePackage.getEString(), "titlechart", null, 0, 1,
				CreateChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(csvLoaderEClass, CsvLoader.class, "CsvLoader", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCsvLoader_Path(), ecorePackage.getEString(), "path", null, 0, 1, CsvLoader.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionsEClass, Functions.class, "Functions", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(progChartEClass, ProgChart.class, "ProgChart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgChart_Functions(), this.getFunctions(), null, "functions", null, 1, -1, ProgChart.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectedColumnsEClass, SelectedColumns.class, "SelectedColumns", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectedColumns_Columnsname(), ecorePackage.getEString(), "columnsname", null, 0, -1,
				SelectedColumns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectedColumns_Outputpath(), ecorePackage.getEString(), "outputpath", null, 0, 1,
				SelectedColumns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(chartTypeEEnum, ChartType.class, "ChartType");
		addEEnumLiteral(chartTypeEEnum, ChartType.HISTOGRAM);
		addEEnumLiteral(chartTypeEEnum, ChartType.PIE);
		addEEnumLiteral(chartTypeEEnum, ChartType.LINE);

		initEEnum(filterTypeEEnum, FilterType.class, "FilterType");
		addEEnumLiteral(filterTypeEEnum, FilterType.INF);
		addEEnumLiteral(filterTypeEEnum, FilterType.SUP);
		addEEnumLiteral(filterTypeEEnum, FilterType.EQUAL);

		// Create resource
		createResource(eNS_URI);
	}

} //ProgramChartSawsenPackageImpl
