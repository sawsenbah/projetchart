/**
 */
package programChartSawsen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selected Columns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programChartSawsen.SelectedColumns#getColumnsname <em>Columnsname</em>}</li>
 *   <li>{@link programChartSawsen.SelectedColumns#getOutputpath <em>Outputpath</em>}</li>
 * </ul>
 *
 * @see programChartSawsen.ProgramChartSawsenPackage#getSelectedColumns()
 * @model
 * @generated
 */
public interface SelectedColumns extends Functions {
	/**
	 * Returns the value of the '<em><b>Columnsname</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnsname</em>' attribute list.
	 * @see programChartSawsen.ProgramChartSawsenPackage#getSelectedColumns_Columnsname()
	 * @model
	 * @generated
	 */
	EList<String> getColumnsname();

	/**
	 * Returns the value of the '<em><b>Outputpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputpath</em>' attribute.
	 * @see #setOutputpath(String)
	 * @see programChartSawsen.ProgramChartSawsenPackage#getSelectedColumns_Outputpath()
	 * @model
	 * @generated
	 */
	String getOutputpath();

	/**
	 * Sets the value of the '{@link programChartSawsen.SelectedColumns#getOutputpath <em>Outputpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputpath</em>' attribute.
	 * @see #getOutputpath()
	 * @generated
	 */
	void setOutputpath(String value);

} // SelectedColumns
