/**
 */
package programChartSawsen.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import programChartSawsen.ProgramChartSawsenPackage;
import programChartSawsen.SelectedColumns;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selected Columns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link programChartSawsen.impl.SelectedColumnsImpl#getColumnsname <em>Columnsname</em>}</li>
 *   <li>{@link programChartSawsen.impl.SelectedColumnsImpl#getOutputpath <em>Outputpath</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectedColumnsImpl extends FunctionsImpl implements SelectedColumns {
	/**
	 * The cached value of the '{@link #getColumnsname() <em>Columnsname</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnsname()
	 * @generated
	 * @ordered
	 */
	protected EList<String> columnsname;

	/**
	 * The default value of the '{@link #getOutputpath() <em>Outputpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputpath()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUTPATH_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOutputpath() <em>Outputpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputpath()
	 * @generated
	 * @ordered
	 */
	protected String outputpath = OUTPUTPATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectedColumnsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgramChartSawsenPackage.Literals.SELECTED_COLUMNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getColumnsname() {
		if (columnsname == null) {
			columnsname = new EDataTypeUniqueEList<String>(String.class, this,
					ProgramChartSawsenPackage.SELECTED_COLUMNS__COLUMNSNAME);
		}
		return columnsname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputpath() {
		return outputpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputpath(String newOutputpath) {
		String oldOutputpath = outputpath;
		outputpath = newOutputpath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProgramChartSawsenPackage.SELECTED_COLUMNS__OUTPUTPATH, oldOutputpath, outputpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProgramChartSawsenPackage.SELECTED_COLUMNS__COLUMNSNAME:
			return getColumnsname();
		case ProgramChartSawsenPackage.SELECTED_COLUMNS__OUTPUTPATH:
			return getOutputpath();
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
		case ProgramChartSawsenPackage.SELECTED_COLUMNS__COLUMNSNAME:
			getColumnsname().clear();
			getColumnsname().addAll((Collection<? extends String>) newValue);
			return;
		case ProgramChartSawsenPackage.SELECTED_COLUMNS__OUTPUTPATH:
			setOutputpath((String) newValue);
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
		case ProgramChartSawsenPackage.SELECTED_COLUMNS__COLUMNSNAME:
			getColumnsname().clear();
			return;
		case ProgramChartSawsenPackage.SELECTED_COLUMNS__OUTPUTPATH:
			setOutputpath(OUTPUTPATH_EDEFAULT);
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
		case ProgramChartSawsenPackage.SELECTED_COLUMNS__COLUMNSNAME:
			return columnsname != null && !columnsname.isEmpty();
		case ProgramChartSawsenPackage.SELECTED_COLUMNS__OUTPUTPATH:
			return OUTPUTPATH_EDEFAULT == null ? outputpath != null : !OUTPUTPATH_EDEFAULT.equals(outputpath);
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
		result.append(" (columnsname: ");
		result.append(columnsname);
		result.append(", outputpath: ");
		result.append(outputpath);
		result.append(')');
		return result.toString();
	}

} //SelectedColumnsImpl
