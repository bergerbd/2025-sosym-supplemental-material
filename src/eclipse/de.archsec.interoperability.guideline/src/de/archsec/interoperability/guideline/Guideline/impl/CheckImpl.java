/**
 */
package de.archsec.interoperability.guideline.Guideline.impl;

import de.archsec.interoperability.guideline.Guideline.Check;
import de.archsec.interoperability.guideline.Guideline.GuidelinePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.impl.CheckImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.impl.CheckImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.impl.CheckImpl#isIsAutomated <em>Is Automated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckImpl extends MinimalEObjectImpl.Container implements Check {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAutomated() <em>Is Automated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutomated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AUTOMATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAutomated() <em>Is Automated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutomated()
	 * @generated
	 * @ordered
	 */
	protected boolean isAutomated = IS_AUTOMATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuidelinePackage.Literals.CHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuidelinePackage.CHECK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuidelinePackage.CHECK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAutomated() {
		return isAutomated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAutomated(boolean newIsAutomated) {
		boolean oldIsAutomated = isAutomated;
		isAutomated = newIsAutomated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuidelinePackage.CHECK__IS_AUTOMATED, oldIsAutomated, isAutomated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuidelinePackage.CHECK__ID:
				return getId();
			case GuidelinePackage.CHECK__DESCRIPTION:
				return getDescription();
			case GuidelinePackage.CHECK__IS_AUTOMATED:
				return isIsAutomated();
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
			case GuidelinePackage.CHECK__ID:
				setId((String)newValue);
				return;
			case GuidelinePackage.CHECK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GuidelinePackage.CHECK__IS_AUTOMATED:
				setIsAutomated((Boolean)newValue);
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
			case GuidelinePackage.CHECK__ID:
				setId(ID_EDEFAULT);
				return;
			case GuidelinePackage.CHECK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GuidelinePackage.CHECK__IS_AUTOMATED:
				setIsAutomated(IS_AUTOMATED_EDEFAULT);
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
			case GuidelinePackage.CHECK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GuidelinePackage.CHECK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GuidelinePackage.CHECK__IS_AUTOMATED:
				return isAutomated != IS_AUTOMATED_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", description: ");
		result.append(description);
		result.append(", isAutomated: ");
		result.append(isAutomated);
		result.append(')');
		return result.toString();
	}

} //CheckImpl
