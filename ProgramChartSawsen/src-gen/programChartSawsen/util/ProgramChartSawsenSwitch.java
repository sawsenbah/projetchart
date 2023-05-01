/**
 */
package programChartSawsen.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import programChartSawsen.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see programChartSawsen.ProgramChartSawsenPackage
 * @generated
 */
public class ProgramChartSawsenSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProgramChartSawsenPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramChartSawsenSwitch() {
		if (modelPackage == null) {
			modelPackage = ProgramChartSawsenPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ProgramChartSawsenPackage.APPLY_FILTER: {
			ApplyFilter applyFilter = (ApplyFilter) theEObject;
			T result = caseApplyFilter(applyFilter);
			if (result == null)
				result = caseFunctions(applyFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProgramChartSawsenPackage.CREATE_CHART: {
			CreateChart createChart = (CreateChart) theEObject;
			T result = caseCreateChart(createChart);
			if (result == null)
				result = caseFunctions(createChart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProgramChartSawsenPackage.CSV_LOADER: {
			CsvLoader csvLoader = (CsvLoader) theEObject;
			T result = caseCsvLoader(csvLoader);
			if (result == null)
				result = caseFunctions(csvLoader);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProgramChartSawsenPackage.FUNCTIONS: {
			Functions functions = (Functions) theEObject;
			T result = caseFunctions(functions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProgramChartSawsenPackage.PROG_CHART: {
			ProgChart progChart = (ProgChart) theEObject;
			T result = caseProgChart(progChart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProgramChartSawsenPackage.SELECTED_COLUMNS: {
			SelectedColumns selectedColumns = (SelectedColumns) theEObject;
			T result = caseSelectedColumns(selectedColumns);
			if (result == null)
				result = caseFunctions(selectedColumns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apply Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apply Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplyFilter(ApplyFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Chart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Chart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateChart(CreateChart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prog Chart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prog Chart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgChart(ProgChart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selected Columns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selected Columns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectedColumns(SelectedColumns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Csv Loader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Csv Loader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCsvLoader(CsvLoader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctions(Functions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProgramChartSawsenSwitch
