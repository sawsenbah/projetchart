/**
 */
package programChartSawsen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prog Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programChartSawsen.ProgChart#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see programChartSawsen.ProgramChartSawsenPackage#getProgChart()
 * @model
 * @generated
 */
public interface ProgChart extends EObject {
	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link programChartSawsen.Functions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see programChartSawsen.ProgramChartSawsenPackage#getProgChart_Functions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Functions> getFunctions();

} // ProgChart
