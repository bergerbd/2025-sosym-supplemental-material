/**
 */
package de.archsec.interoperability.guideline.Guideline;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guideline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.Guideline#getId <em>Id</em>}</li>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.Guideline#getName <em>Name</em>}</li>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.Guideline#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getGuideline()
 * @model
 * @generated
 */
public interface Guideline extends EObject {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link de.archsec.interoperability.guideline.Guideline.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getGuideline_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getGuideline_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.archsec.interoperability.guideline.Guideline.Guideline#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getGuideline_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.archsec.interoperability.guideline.Guideline.Guideline#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Guideline
