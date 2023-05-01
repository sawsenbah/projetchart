/**
 */
package programChartSawsen.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import programChartSawsen.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see programChartSawsen.ProgramChartSawsenPackage
 * @generated
 */
public class ProgramChartSawsenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProgramChartSawsenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramChartSawsenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProgramChartSawsenPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramChartSawsenSwitch<Adapter> modelSwitch = new ProgramChartSawsenSwitch<Adapter>() {
		@Override
		public Adapter caseApplyFilter(ApplyFilter object) {
			return createApplyFilterAdapter();
		}

		@Override
		public Adapter caseCreateChart(CreateChart object) {
			return createCreateChartAdapter();
		}

		@Override
		public Adapter caseCsvLoader(CsvLoader object) {
			return createCsvLoaderAdapter();
		}

		@Override
		public Adapter caseFunctions(Functions object) {
			return createFunctionsAdapter();
		}

		@Override
		public Adapter caseProgChart(ProgChart object) {
			return createProgChartAdapter();
		}

		@Override
		public Adapter caseSelectedColumns(SelectedColumns object) {
			return createSelectedColumnsAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link programChartSawsen.ApplyFilter <em>Apply Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see programChartSawsen.ApplyFilter
	 * @generated
	 */
	public Adapter createApplyFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link programChartSawsen.CreateChart <em>Create Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see programChartSawsen.CreateChart
	 * @generated
	 */
	public Adapter createCreateChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link programChartSawsen.ProgChart <em>Prog Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see programChartSawsen.ProgChart
	 * @generated
	 */
	public Adapter createProgChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link programChartSawsen.SelectedColumns <em>Selected Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see programChartSawsen.SelectedColumns
	 * @generated
	 */
	public Adapter createSelectedColumnsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link programChartSawsen.CsvLoader <em>Csv Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see programChartSawsen.CsvLoader
	 * @generated
	 */
	public Adapter createCsvLoaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link programChartSawsen.Functions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see programChartSawsen.Functions
	 * @generated
	 */
	public Adapter createFunctionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProgramChartSawsenAdapterFactory
