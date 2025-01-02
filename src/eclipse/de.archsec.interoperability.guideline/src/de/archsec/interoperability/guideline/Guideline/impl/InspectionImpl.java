/**
 */
package de.archsec.interoperability.guideline.Guideline.impl;

import de.archsec.interoperability.guideline.Guideline.Finding;
import de.archsec.interoperability.guideline.Guideline.Guideline;
import de.archsec.interoperability.guideline.Guideline.GuidelinePackage;
import de.archsec.interoperability.guideline.Guideline.Inspection;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inspection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.impl.InspectionImpl#getGuideline <em>Guideline</em>}</li>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.impl.InspectionImpl#getFindings <em>Findings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InspectionImpl extends MinimalEObjectImpl.Container implements Inspection {
	/**
	 * The cached value of the '{@link #getGuideline() <em>Guideline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideline()
	 * @generated
	 * @ordered
	 */
	protected Guideline guideline;

	/**
	 * The cached value of the '{@link #getFindings() <em>Findings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Finding> findings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InspectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuidelinePackage.Literals.INSPECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Guideline getGuideline() {
		if (guideline != null && guideline.eIsProxy()) {
			InternalEObject oldGuideline = (InternalEObject)guideline;
			guideline = (Guideline)eResolveProxy(oldGuideline);
			if (guideline != oldGuideline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuidelinePackage.INSPECTION__GUIDELINE, oldGuideline, guideline));
			}
		}
		return guideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guideline basicGetGuideline() {
		return guideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGuideline(Guideline newGuideline) {
		Guideline oldGuideline = guideline;
		guideline = newGuideline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuidelinePackage.INSPECTION__GUIDELINE, oldGuideline, guideline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Finding> getFindings() {
		if (findings == null) {
			findings = new EObjectContainmentEList<Finding>(Finding.class, this, GuidelinePackage.INSPECTION__FINDINGS);
		}
		return findings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuidelinePackage.INSPECTION__FINDINGS:
				return ((InternalEList<?>)getFindings()).basicRemove(otherEnd, msgs);
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
			case GuidelinePackage.INSPECTION__GUIDELINE:
				if (resolve) return getGuideline();
				return basicGetGuideline();
			case GuidelinePackage.INSPECTION__FINDINGS:
				return getFindings();
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
			case GuidelinePackage.INSPECTION__GUIDELINE:
				setGuideline((Guideline)newValue);
				return;
			case GuidelinePackage.INSPECTION__FINDINGS:
				getFindings().clear();
				getFindings().addAll((Collection<? extends Finding>)newValue);
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
			case GuidelinePackage.INSPECTION__GUIDELINE:
				setGuideline((Guideline)null);
				return;
			case GuidelinePackage.INSPECTION__FINDINGS:
				getFindings().clear();
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
			case GuidelinePackage.INSPECTION__GUIDELINE:
				return guideline != null;
			case GuidelinePackage.INSPECTION__FINDINGS:
				return findings != null && !findings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InspectionImpl
