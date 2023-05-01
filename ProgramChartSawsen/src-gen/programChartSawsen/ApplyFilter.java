/**
 */
package programChartSawsen;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programChartSawsen.ApplyFilter#getColumname <em>Columname</em>}</li>
 *   <li>{@link programChartSawsen.ApplyFilter#getFilter <em>Filter</em>}</li>
 *   <li>{@link programChartSawsen.ApplyFilter#getFiltervalue <em>Filtervalue</em>}</li>
 *   <li>{@link programChartSawsen.ApplyFilter#getFilteredoutput <em>Filteredoutput</em>}</li>
 * </ul>
 *
 * @see programChartSawsen.ProgramChartSawsenPackage#getApplyFilter()
 * @model
 * @generated
 */
public interface ApplyFilter extends Functions {
	/**
	 * Returns the value of the '<em><b>Columname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columname</em>' attribute.
	 * @see #setColumname(String)
	 * @see programChartSawsen.ProgramChartSawsenPackage#getApplyFilter_Columname()
	 * @model
	 * @generated
	 */
	String getColumname();

	/**
	 * Sets the value of the '{@link programChartSawsen.ApplyFilter#getColumname <em>Columname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columname</em>' attribute.
	 * @see #getColumname()
	 * @generated
	 */
	void setColumname(String value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * The literals are from the enumeration {@link programChartSawsen.FilterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see programChartSawsen.FilterType
	 * @see #setFilter(FilterType)
	 * @see programChartSawsen.ProgramChartSawsenPackage#getApplyFilter_Filter()
	 * @model
	 * @generated
	 */
	FilterType getFilter();

	/**
	 * Sets the value of the '{@link programChartSawsen.ApplyFilter#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see programChartSawsen.FilterType
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Filtervalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filtervalue</em>' attribute.
	 * @see #setFiltervalue(String)
	 * @see programChartSawsen.ProgramChartSawsenPackage#getApplyFilter_Filtervalue()
	 * @model
	 * @generated
	 */
	String getFiltervalue();

	/**
	 * Sets the value of the '{@link programChartSawsen.ApplyFilter#getFiltervalue <em>Filtervalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filtervalue</em>' attribute.
	 * @see #getFiltervalue()
	 * @generated
	 */
	void setFiltervalue(String value);

	/**
	 * Returns the value of the '<em><b>Filteredoutput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filteredoutput</em>' attribute.
	 * @see #setFilteredoutput(String)
	 * @see programChartSawsen.ProgramChartSawsenPackage#getApplyFilter_Filteredoutput()
	 * @model
	 * @generated
	 */
	String getFilteredoutput();

	/**
	 * Sets the value of the '{@link programChartSawsen.ApplyFilter#getFilteredoutput <em>Filteredoutput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filteredoutput</em>' attribute.
	 * @see #getFilteredoutput()
	 * @generated
	 */
	void setFilteredoutput(String value);

} // ApplyFilter
