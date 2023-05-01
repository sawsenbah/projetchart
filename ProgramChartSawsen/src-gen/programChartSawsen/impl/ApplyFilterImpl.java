/**
 */
package programChartSawsen.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import programChartSawsen.ApplyFilter;
import programChartSawsen.FilterType;
import programChartSawsen.ProgramChartSawsenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apply Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link programChartSawsen.impl.ApplyFilterImpl#getColumname <em>Columname</em>}</li>
 *   <li>{@link programChartSawsen.impl.ApplyFilterImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link programChartSawsen.impl.ApplyFilterImpl#getFiltervalue <em>Filtervalue</em>}</li>
 *   <li>{@link programChartSawsen.impl.ApplyFilterImpl#getFilteredoutput <em>Filteredoutput</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplyFilterImpl extends FunctionsImpl implements ApplyFilter {
	/**
	 * The default value of the '{@link #getColumname() <em>Columname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumname()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumname() <em>Columname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumname()
	 * @generated
	 * @ordered
	 */
	protected String columname = COLUMNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final FilterType FILTER_EDEFAULT = FilterType.INF;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType filter = FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFiltervalue() <em>Filtervalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltervalue()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTERVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFiltervalue() <em>Filtervalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltervalue()
	 * @generated
	 * @ordered
	 */
	protected String filtervalue = FILTERVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilteredoutput() <em>Filteredoutput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilteredoutput()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTEREDOUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilteredoutput() <em>Filteredoutput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilteredoutput()
	 * @generated
	 * @ordered
	 */
	protected String filteredoutput = FILTEREDOUTPUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplyFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgramChartSawsenPackage.Literals.APPLY_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumname() {
		return columname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumname(String newColumname) {
		String oldColumname = columname;
		columname = newColumname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgramChartSawsenPackage.APPLY_FILTER__COLUMNAME,
					oldColumname, columname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(FilterType newFilter) {
		FilterType oldFilter = filter;
		filter = newFilter == null ? FILTER_EDEFAULT : newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgramChartSawsenPackage.APPLY_FILTER__FILTER,
					oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFiltervalue() {
		return filtervalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiltervalue(String newFiltervalue) {
		String oldFiltervalue = filtervalue;
		filtervalue = newFiltervalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgramChartSawsenPackage.APPLY_FILTER__FILTERVALUE,
					oldFiltervalue, filtervalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilteredoutput() {
		return filteredoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilteredoutput(String newFilteredoutput) {
		String oldFilteredoutput = filteredoutput;
		filteredoutput = newFilteredoutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProgramChartSawsenPackage.APPLY_FILTER__FILTEREDOUTPUT, oldFilteredoutput, filteredoutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProgramChartSawsenPackage.APPLY_FILTER__COLUMNAME:
			return getColumname();
		case ProgramChartSawsenPackage.APPLY_FILTER__FILTER:
			return getFilter();
		case ProgramChartSawsenPackage.APPLY_FILTER__FILTERVALUE:
			return getFiltervalue();
		case ProgramChartSawsenPackage.APPLY_FILTER__FILTEREDOUTPUT:
			return getFilteredoutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ProgramChartSawsenPackage.APPLY_FILTER__COLUMNAME:
			setColumname((String) newValue);
			return;
		case ProgramChartSawsenPackage.APPLY_FILTER__FILTER:
			setFilter((FilterType) newValue);
			return;
		case ProgramChartSawsenPackage.APPLY_FILTER__FILTERVALUE:
			setFiltervalue((String) newValue);
			return;
		case ProgramChartSawsenPackage.APPLY_FILTER__FILTEREDOUTPUT:
			setFilteredoutput((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ProgramChartSawsenPackage.APPLY_FILTER__COLUMNAME:
			setColumname(COLUMNAME_EDEFAULT);
			return;
		case ProgramChartSawsenPackage.APPLY_FILTER__FILTER:
			setFilter(FILTER_EDEFAULT);
			return;
		case ProgramChartSawsenPackage.APPLY_FILTER__FILTERVALUE:
			setFiltervalue(FILTERVALUE_EDEFAULT);
			return;
		case ProgramChartSawsenPackage.APPLY_FILTER__FILTEREDOUTPUT:
			setFilteredoutput(FILTEREDOUTPUT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ProgramChartSawsenPackage.APPLY_FILTER__COLUMNAME:
			return COLUMNAME_EDEFAULT == null ? columname != null : !COLUMNAME_EDEFAULT.equals(columname);
		case ProgramChartSawsenPackage.APPLY_FILTER__FILTER:
			return filter != FILTER_EDEFAULT;
		case ProgramChartSawsenPackage.APPLY_FILTER__FILTERVALUE:
			return FILTERVALUE_EDEFAULT == null ? filtervalue != null : !FILTERVALUE_EDEFAULT.equals(filtervalue);
		case ProgramChartSawsenPackage.APPLY_FILTER__FILTEREDOUTPUT:
			return FILTEREDOUTPUT_EDEFAULT == null ? filteredoutput != null
					: !FILTEREDOUTPUT_EDEFAULT.equals(filteredoutput);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (columname: ");
		result.append(columname);
		result.append(", filter: ");
		result.append(filter);
		result.append(", filtervalue: ");
		result.append(filtervalue);
		result.append(", filteredoutput: ");
		result.append(filteredoutput);
		result.append(')');
		return result.toString();
	}

} //ApplyFilterImpl
