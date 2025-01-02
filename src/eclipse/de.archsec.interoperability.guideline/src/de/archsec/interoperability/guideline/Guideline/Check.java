/**
 */
package de.archsec.interoperability.guideline.Guideline;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.Check#getId <em>Id</em>}</li>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.Check#getDescription <em>Description</em>}</li>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.Check#isIsAutomated <em>Is Automated</em>}</li>
 * </ul>
 *
 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getCheck()
 * @model
 * @generated
 */
public interface Check extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getCheck_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.archsec.interoperability.guideline.Guideline.Check#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getCheck_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.archsec.interoperability.guideline.Guideline.Check#getDescription <em>Description</em>}' attribute.
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
	 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getCheck_IsAutomated()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsAutomated();

	/**
	 * Sets the value of the '{@link de.archsec.interoperability.guideline.Guideline.Check#isIsAutomated <em>Is Automated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Automated</em>' attribute.
	 * @see #isIsAutomated()
	 * @generated
	 */
	void setIsAutomated(boolean value);

} // Check
