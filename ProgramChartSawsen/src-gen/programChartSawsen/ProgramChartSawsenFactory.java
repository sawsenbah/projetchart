/**
 */
package programChartSawsen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see programChartSawsen.ProgramChartSawsenPackage
 * @generated
 */
public interface ProgramChartSawsenFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProgramChartSawsenFactory eINSTANCE = programChartSawsen.impl.ProgramChartSawsenFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Apply Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apply Filter</em>'.
	 * @generated
	 */
	ApplyFilter createApplyFilter();

	/**
	 * Returns a new object of class '<em>Create Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Chart</em>'.
	 * @generated
	 */
	CreateChart createCreateChart();

	/**
	 * Returns a new object of class '<em>Prog Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prog Chart</em>'.
	 * @generated
	 */
	ProgChart createProgChart();

	/**
	 * Returns a new object of class '<em>Selected Columns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selected Columns</em>'.
	 * @generated
	 */
	SelectedColumns createSelectedColumns();

	/**
	 * Returns a new object of class '<em>Csv Loader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Csv Loader</em>'.
	 * @generated
	 */
	CsvLoader createCsvLoader();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProgramChartSawsenPackage getProgramChartSawsenPackage();

} //ProgramChartSawsenFactory
