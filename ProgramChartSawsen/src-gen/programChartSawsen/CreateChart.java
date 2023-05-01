/**
 */
package programChartSawsen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programChartSawsen.CreateChart#getChart <em>Chart</em>}</li>
 *   <li>{@link programChartSawsen.CreateChart#getXlabel <em>Xlabel</em>}</li>
 *   <li>{@link programChartSawsen.CreateChart#getYlabel <em>Ylabel</em>}</li>
 *   <li>{@link programChartSawsen.CreateChart#getTitlechart <em>Titlechart</em>}</li>
 * </ul>
 *
 * @see programChartSawsen.ProgramChartSawsenPackage#getCreateChart()
 * @model
 * @generated
 */
public interface CreateChart extends Functions {
	/**
	 * Returns the value of the '<em><b>Chart</b></em>' attribute.
	 * The literals are from the enumeration {@link programChartSawsen.ChartType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chart</em>' attribute.
	 * @see programChartSawsen.ChartType
	 * @see #setChart(ChartType)
	 * @see programChartSawsen.ProgramChartSawsenPackage#getCreateChart_Chart()
	 * @model
	 * @generated
	 */
	ChartType getChart();

	/**
	 * Sets the value of the '{@link programChartSawsen.CreateChart#getChart <em>Chart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chart</em>' attribute.
	 * @see programChartSawsen.ChartType
	 * @see #getChart()
	 * @generated
	 */
	void setChart(ChartType value);

	/**
	 * Returns the value of the '<em><b>Xlabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xlabel</em>' attribute.
	 * @see #setXlabel(String)
	 * @see programChartSawsen.ProgramChartSawsenPackage#getCreateChart_Xlabel()
	 * @model
	 * @generated
	 */
	String getXlabel();

	/**
	 * Sets the value of the '{@link programChartSawsen.CreateChart#getXlabel <em>Xlabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xlabel</em>' attribute.
	 * @see #getXlabel()
	 * @generated
	 */
	void setXlabel(String value);

	/**
	 * Returns the value of the '<em><b>Ylabel</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ylabel</em>' attribute list.
	 * @see programChartSawsen.ProgramChartSawsenPackage#getCreateChart_Ylabel()
	 * @model
	 * @generated
	 */
	EList<String> getYlabel();

	/**
	 * Returns the value of the '<em><b>Titlechart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titlechart</em>' attribute.
	 * @see #setTitlechart(String)
	 * @see programChartSawsen.ProgramChartSawsenPackage#getCreateChart_Titlechart()
	 * @model
	 * @generated
	 */
	String getTitlechart();

	/**
	 * Sets the value of the '{@link programChartSawsen.CreateChart#getTitlechart <em>Titlechart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titlechart</em>' attribute.
	 * @see #getTitlechart()
	 * @generated
	 */
	void setTitlechart(String value);

} // CreateChart
