/**
 */
package de.archsec.interoperability.guideline.Guideline.impl;

import de.archsec.interoperability.guideline.Guideline.Check;
import de.archsec.interoperability.guideline.Guideline.FlawTarget;
import de.archsec.interoperability.guideline.Guideline.GuidelinePackage;
import de.archsec.interoperability.guideline.Guideline.Identification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.impl.IdentificationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.impl.IdentificationImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.impl.IdentificationImpl#getChecks <em>Checks</em>}</li>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.impl.IdentificationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.impl.IdentificationImpl#isIsAutomated <em>Is Automated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentificationImpl extends MinimalEObjectImpl.Container implements Identification {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<FlawTarget> target;

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
	 * The cached value of the '{@link #getChecks() <em>Checks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecks()
	 * @generated
	 * @ordered
	 */
	protected EList<Check> checks;

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
	protected IdentificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuidelinePackage.Literals.IDENTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlawTarget> getTarget() {
		if (target == null) {
			target = new EDataTypeUniqueEList<FlawTarget>(FlawTarget.class, this, GuidelinePackage.IDENTIFICATION__TARGET);
		}
		return target;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuidelinePackage.IDENTIFICATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Check> getChecks() {
		if (checks == null) {
			checks = new EObjectContainmentEList<Check>(Check.class, this, GuidelinePackage.IDENTIFICATION__CHECKS);
		}
		return checks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuidelinePackage.IDENTIFICATION__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuidelinePackage.IDENTIFICATION__IS_AUTOMATED, oldIsAutomated, isAutomated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuidelinePackage.IDENTIFICATION__CHECKS:
				return ((InternalEList<?>)getChecks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuidelinePackage.IDENTIFICATION__TARGET:
				return getTarget();
			case GuidelinePackage.IDENTIFICATION__ID:
				return getId();
			case GuidelinePackage.IDENTIFICATION__CHECKS:
				return getChecks();
			case GuidelinePackage.IDENTIFICATION__DESCRIPTION:
				return getDescription();
			case GuidelinePackage.IDENTIFICATION__IS_AUTOMATED:
				return isIsAutomated();
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
			case GuidelinePackage.IDENTIFICATION__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends FlawTarget>)newValue);
				return;
			case GuidelinePackage.IDENTIFICATION__ID:
				setId((String)newValue);
				return;
			case GuidelinePackage.IDENTIFICATION__CHECKS:
				getChecks().clear();
				getChecks().addAll((Collection<? extends Check>)newValue);
				return;
			case GuidelinePackage.IDENTIFICATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GuidelinePackage.IDENTIFICATION__IS_AUTOMATED:
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
			case GuidelinePackage.IDENTIFICATION__TARGET:
				getTarget().clear();
				return;
			case GuidelinePackage.IDENTIFICATION__ID:
				setId(ID_EDEFAULT);
				return;
			case GuidelinePackage.IDENTIFICATION__CHECKS:
				getChecks().clear();
				return;
			case GuidelinePackage.IDENTIFICATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GuidelinePackage.IDENTIFICATION__IS_AUTOMATED:
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
			case GuidelinePackage.IDENTIFICATION__TARGET:
				return target != null && !target.isEmpty();
			case GuidelinePackage.IDENTIFICATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GuidelinePackage.IDENTIFICATION__CHECKS:
				return checks != null && !checks.isEmpty();
			case GuidelinePackage.IDENTIFICATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GuidelinePackage.IDENTIFICATION__IS_AUTOMATED:
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
		result.append(" (target: ");
		result.append(target);
		result.append(", id: ");
		result.append(id);
		result.append(", description: ");
		result.append(description);
		result.append(", isAutomated: ");
		result.append(isAutomated);
		result.append(')');
		return result.toString();
	}

} //IdentificationImpl
