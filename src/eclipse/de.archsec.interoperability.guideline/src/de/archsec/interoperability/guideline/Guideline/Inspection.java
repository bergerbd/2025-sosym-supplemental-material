/**
 */
package de.archsec.interoperability.guideline.Guideline;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inspection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.Inspection#getGuideline <em>Guideline</em>}</li>
 *   <li>{@link de.archsec.interoperability.guideline.Guideline.Inspection#getFindings <em>Findings</em>}</li>
 * </ul>
 *
 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getInspection()
 * @model
 * @generated
 */
public interface Inspection extends EObject {
	/**
	 * Returns the value of the '<em><b>Guideline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guideline</em>' reference.
	 * @see #setGuideline(Guideline)
	 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getInspection_Guideline()
	 * @model required="true"
	 * @generated
	 */
	Guideline getGuideline();

	/**
	 * Sets the value of the '{@link de.archsec.interoperability.guideline.Guideline.Inspection#getGuideline <em>Guideline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guideline</em>' reference.
	 * @see #getGuideline()
	 * @generated
	 */
	void setGuideline(Guideline value);

	/**
	 * Returns the value of the '<em><b>Findings</b></em>' containment reference list.
	 * The list contents are of type {@link de.archsec.interoperability.guideline.Guideline.Finding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Findings</em>' containment reference list.
	 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getInspection_Findings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Finding> getFindings();

} // Inspection
