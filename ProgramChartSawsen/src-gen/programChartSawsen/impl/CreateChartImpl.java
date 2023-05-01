/**
 */
package programChartSawsen.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import programChartSawsen.ChartType;
import programChartSawsen.CreateChart;
import programChartSawsen.ProgramChartSawsenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link programChartSawsen.impl.CreateChartImpl#getChart <em>Chart</em>}</li>
 *   <li>{@link programChartSawsen.impl.CreateChartImpl#getXlabel <em>Xlabel</em>}</li>
 *   <li>{@link programChartSawsen.impl.CreateChartImpl#getYlabel <em>Ylabel</em>}</li>
 *   <li>{@link programChartSawsen.impl.CreateChartImpl#getTitlechart <em>Titlechart</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateChartImpl extends FunctionsImpl implements CreateChart {
	/**
	 * The default value of the '{@link #getChart() <em>Chart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChart()
	 * @generated
	 * @ordered
	 */
	protected static final ChartType CHART_EDEFAULT = ChartType.HISTOGRAM;

	/**
	 * The cached value of the '{@link #getChart() <em>Chart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChart()
	 * @generated
	 * @ordered
	 */
	protected ChartType chart = CHART_EDEFAULT;

	/**
	 * The default value of the '{@link #getXlabel() <em>Xlabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXlabel()
	 * @generated
	 * @ordered
	 */
	protected static final String XLABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXlabel() <em>Xlabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXlabel()
	 * @generated
	 * @ordered
	 */
	protected String xlabel = XLABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getYlabel() <em>Ylabel</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYlabel()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ylabel;

	/**
	 * The default value of the '{@link #getTitlechart() <em>Titlechart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitlechart()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLECHART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitlechart() <em>Titlechart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitlechart()
	 * @generated
	 * @ordered
	 */
	protected String titlechart = TITLECHART_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateChartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgramChartSawsenPackage.Literals.CREATE_CHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartType getChart() {
		return chart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChart(ChartType newChart) {
		ChartType oldChart = chart;
		chart = newChart == null ? CHART_EDEFAULT : newChart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgramChartSawsenPackage.CREATE_CHART__CHART,
					oldChart, chart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXlabel() {
		return xlabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXlabel(String newXlabel) {
		String oldXlabel = xlabel;
		xlabel = newXlabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgramChartSawsenPackage.CREATE_CHART__XLABEL,
					oldXlabel, xlabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getYlabel() {
		if (ylabel == null) {
			ylabel = new EDataTypeUniqueEList<String>(String.class, this,
					ProgramChartSawsenPackage.CREATE_CHART__YLABEL);
		}
		return ylabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitlechart() {
		return titlechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitlechart(String newTitlechart) {
		String oldTitlechart = titlechart;
		titlechart = newTitlechart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgramChartSawsenPackage.CREATE_CHART__TITLECHART,
					oldTitlechart, titlechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProgramChartSawsenPackage.CREATE_CHART__CHART:
			return getChart();
		case ProgramChartSawsenPackage.CREATE_CHART__XLABEL:
			return getXlabel();
		case ProgramChartSawsenPackage.CREATE_CHART__YLABEL:
			return getYlabel();
		case ProgramChartSawsenPackage.CREATE_CHART__TITLECHART:
			return getTitlechart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ProgramChartSawsenPackage.CREATE_CHART__CHART:
			setChart((ChartType) newValue);
			return;
		case ProgramChartSawsenPackage.CREATE_CHART__XLABEL:
			setXlabel((String) newValue);
			return;
		case ProgramChartSawsenPackage.CREATE_CHART__YLABEL:
			getYlabel().clear();
			getYlabel().addAll((Collection<? extends String>) newValue);
			return;
		case ProgramChartSawsenPackage.CREATE_CHART__TITLECHART:
			setTitlechart((String) newValue);
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
		case ProgramChartSawsenPackage.CREATE_CHART__CHART:
			setChart(CHART_EDEFAULT);
			return;
		case ProgramChartSawsenPackage.CREATE_CHART__XLABEL:
			setXlabel(XLABEL_EDEFAULT);
			return;
		case ProgramChartSawsenPackage.CREATE_CHART__YLABEL:
			getYlabel().clear();
			return;
		case ProgramChartSawsenPackage.CREATE_CHART__TITLECHART:
			setTitlechart(TITLECHART_EDEFAULT);
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
		case ProgramChartSawsenPackage.CREATE_CHART__CHART:
			return chart != CHART_EDEFAULT;
		case ProgramChartSawsenPackage.CREATE_CHART__XLABEL:
			return XLABEL_EDEFAULT == null ? xlabel != null : !XLABEL_EDEFAULT.equals(xlabel);
		case ProgramChartSawsenPackage.CREATE_CHART__YLABEL:
			return ylabel != null && !ylabel.isEmpty();
		case ProgramChartSawsenPackage.CREATE_CHART__TITLECHART:
			return TITLECHART_EDEFAULT == null ? titlechart != null : !TITLECHART_EDEFAULT.equals(titlechart);
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
		result.append(" (chart: ");
		result.append(chart);
		result.append(", xlabel: ");
		result.append(xlabel);
		result.append(", ylabel: ");
		result.append(ylabel);
		result.append(", titlechart: ");
		result.append(titlechart);
		result.append(')');
		return result.toString();
	}

} //CreateChartImpl
