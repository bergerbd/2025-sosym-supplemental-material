/**
 */
package de.archsec.interoperability.guideline.Guideline;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.Identification#getTarget <em>Target</em>}</li>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.Identification#getId <em>Id</em>}</li>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.Identification#getChecks <em>Checks</em>}</li>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.Identification#getDescription <em>Description</em>}</li>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.Identification#isIsAutomated <em>Is Automated</em>}</li>
 * </ul>
 *
 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getIdentification()
 * @model
 * @generated
 */
public interface Identification extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute list.
	 * The list contents are of type {@link de.archsec.interoperability.guideline.Guideline.FlawTarget}.
	 * The literals are from the enumeration {@link de.archsec.interoperability.guideline.Guideline.FlawTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute list.
	 * @see de.archsec.interoperability.guideline.Guideline.FlawTarget
	 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getIdentification_Target()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<FlawTarget> getTarget();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getIdentification_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.archsec.interoperability.guideline.Guideline.Identification#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Checks</b></em>' containment reference list.
	 * The list contents are of type {@link de.archsec.interoperability.guideline.Guideline.Check}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checks</em>' containment reference list.
	 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getIdentification_Checks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Check> getChecks();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getIdentification_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.archsec.interoperability.guideline.Guideline.Identification#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Automated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Automated</em>' attribute.
	 * @see #setIsAutomated(boolean)
	 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getIdentification_IsAutomated()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsAutomated();

	/**
	 * Sets the value of the '{@link de.archsec.interoperability.guideline.Guideline.Identification#isIsAutomated <em>Is Automated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Automated</em>' attribute.
	 * @see #isIsAutomated()
	 * @generated
	 */
	void setIsAutomated(boolean value);

} // Identification
