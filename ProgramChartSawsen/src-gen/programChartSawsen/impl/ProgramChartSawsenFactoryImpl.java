/**
 */
package programChartSawsen.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import programChartSawsen.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgramChartSawsenFactoryImpl extends EFactoryImpl implements ProgramChartSawsenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProgramChartSawsenFactory init() {
		try {
			ProgramChartSawsenFactory theProgramChartSawsenFactory = (ProgramChartSawsenFactory) EPackage.Registry.INSTANCE
					.getEFactory(ProgramChartSawsenPackage.eNS_URI);
			if (theProgramChartSawsenFactory != null) {
				return theProgramChartSawsenFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProgramChartSawsenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramChartSawsenFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ProgramChartSawsenPackage.APPLY_FILTER:
			return createApplyFilter();
		case ProgramChartSawsenPackage.CREATE_CHART:
			return createCreateChart();
		case ProgramChartSawsenPackage.CSV_LOADER:
			return createCsvLoader();
		case ProgramChartSawsenPackage.PROG_CHART:
			return createProgChart();
		case ProgramChartSawsenPackage.SELECTED_COLUMNS:
			return createSelectedColumns();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ProgramChartSawsenPackage.CHART_TYPE:
			return createChartTypeFromString(eDataType, initialValue);
		case ProgramChartSawsenPackage.FILTER_TYPE:
			return createFilterTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ProgramChartSawsenPackage.CHART_TYPE:
			return convertChartTypeToString(eDataType, instanceValue);
		case ProgramChartSawsenPackage.FILTER_TYPE:
			return convertFilterTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplyFilter createApplyFilter() {
		ApplyFilterImpl applyFilter = new ApplyFilterImpl();
		return applyFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateChart createCreateChart() {
		CreateChartImpl createChart = new CreateChartImpl();
		return createChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgChart createProgChart() {
		ProgChartImpl progChart = new ProgChartImpl();
		return progChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectedColumns createSelectedColumns() {
		SelectedColumnsImpl selectedColumns = new SelectedColumnsImpl();
		return selectedColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsvLoader createCsvLoader() {
		CsvLoaderImpl csvLoader = new CsvLoaderImpl();
		return csvLoader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartType createChartTypeFromString(EDataType eDataType, String initialValue) {
		ChartType result = ChartType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChartTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType createFilterTypeFromString(EDataType eDataType, String initialValue) {
		FilterType result = FilterType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramChartSawsenPackage getProgramChartSawsenPackage() {
		return (ProgramChartSawsenPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProgramChartSawsenPackage getPackage() {
		return ProgramChartSawsenPackage.eINSTANCE;
	}

} //ProgramChartSawsenFactoryImpl
