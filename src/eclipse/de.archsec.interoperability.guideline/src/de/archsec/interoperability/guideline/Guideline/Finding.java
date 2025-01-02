/**
 */
package de.archsec.interoperability.guideline.Guideline;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.Finding#getName <em>Name</em>}</li>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.Finding#getComment <em>Comment</em>}</li>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.Finding#getResult <em>Result</em>}</li>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.Finding#getCheck <em>Check</em>}</li>
 * </ul>
 *
 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getFinding()
 * @model
 * @generated
 */
public interface Finding extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getFinding_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.archsec.interoperability.guideline.Guideline.Finding#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getFinding_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link de.archsec.interoperability.guideline.Guideline.Finding#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * The literals are from the enumeration {@link de.archsec.interoperability.guideline.Guideline.CheckState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see de.archsec.interoperability.guideline.Guideline.CheckState
	 * @see #setResult(CheckState)
	 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getFinding_Result()
	 * @model
	 * @generated
	 */
	CheckState getResult();

	/**
	 * Sets the value of the '{@link de.archsec.interoperability.guideline.Guideline.Finding#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see de.archsec.interoperability.guideline.Guideline.CheckState
	 * @see #getResult()
	 * @generated
	 */
	void setResult(CheckState value);

	/**
	 * Returns the value of the '<em><b>Check</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check</em>' reference.
	 * @see #setCheck(Check)
	 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getFinding_Check()
	 * @model required="true"
	 * @generated
	 */
	Check getCheck();

	/**
	 * Sets the value of the '{@link de.archsec.interoperability.guideline.Guideline.Finding#getCheck <em>Check</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check</em>' reference.
	 * @see #getCheck()
	 * @generated
	 */
	void setCheck(Check value);

} // Finding
