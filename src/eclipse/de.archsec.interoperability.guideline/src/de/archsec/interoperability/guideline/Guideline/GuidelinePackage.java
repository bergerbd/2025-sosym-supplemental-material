/**
 */
package de.archsec.interoperability.guideline.Guideline;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.archsec.interoperability.guideline.Guideline.GuidelineFactory
 * @model kind="package"
 * @generated
 */
public interface GuidelinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Guideline";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.archsec.de/models/guideline/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GuidelinePackage eINSTANCE = de.archsec.interoperability.guideline.Guideline.impl.GuidelinePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.archsec.interoperability.guideline.Guideline.impl.GuidelineImpl <em>Guideline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.archsec.interoperability.guideline.Guideline.impl.GuidelineImpl
	 * @see de.archsec.interoperability.guideline.Guideline.impl.GuidelinePackageImpl#getGuideline()
	 * @generated
	 */
	int GUIDELINE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE__RULES = 2;

	/**
	 * The number of structural features of the '<em>Guideline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Guideline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDELINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.archsec.interoperability.guideline.Guideline.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.archsec.interoperability.guideline.Guideline.impl.RuleImpl
	 * @see de.archsec.interoperability.guideline.Guideline.impl.GuidelinePackageImpl#getRule()
	 * @generated
	 */
	int RULE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PATTERNS = 3;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.archsec.interoperability.guideline.Guideline.impl.IdentificationImpl <em>Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.archsec.interoperability.guideline.Guideline.impl.IdentificationImpl
	 * @see de.archsec.interoperability.guideline.Guideline.impl.GuidelinePackageImpl#getIdentification()
	 * @generated
	 */
	int IDENTIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION__ID = 1;

	/**
	 * The feature id for the '<em><b>Checks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION__CHECKS = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Is Automated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION__IS_AUTOMATED = 4;

	/**
	 * The number of structural features of the '<em>Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.archsec.interoperability.guideline.Guideline.impl.CheckImpl <em>Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.archsec.interoperability.guideline.Guideline.impl.CheckImpl
	 * @see de.archsec.interoperability.guideline.Guideline.impl.GuidelinePackageImpl#getCheck()
	 * @generated
	 */
	int CHECK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Is Automated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__IS_AUTOMATED = 2;

	/**
	 * The number of structural features of the '<em>Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.archsec.interoperability.guideline.Guideline.impl.InspectionImpl <em>Inspection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.archsec.interoperability.guideline.Guideline.impl.InspectionImpl
	 * @see de.archsec.interoperability.guideline.Guideline.impl.GuidelinePackageImpl#getInspection()
	 * @generated
	 */
	int INSPECTION = 4;

	/**
	 * The feature id for the '<em><b>Guideline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION__GUIDELINE = 0;

	/**
	 * The feature id for the '<em><b>Findings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION__FINDINGS = 1;

	/**
	 * The number of structural features of the '<em>Inspection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Inspection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.archsec.interoperability.guideline.Guideline.impl.FindingImpl <em>Finding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.archsec.interoperability.guideline.Guideline.impl.FindingImpl
	 * @see de.archsec.interoperability.guideline.Guideline.impl.GuidelinePackageImpl#getFinding()
	 * @generated
	 */
	int FINDING = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__RESULT = 2;

	/**
	 * The feature id for the '<em><b>Check</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__CHECK = 3;

	/**
	 * The number of structural features of the '<em>Finding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Finding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.archsec.interoperability.guideline.Guideline.FlawTarget <em>Flaw Target</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.archsec.interoperability.guideline.Guideline.FlawTarget
	 * @see de.archsec.interoperability.guideline.Guideline.impl.GuidelinePackageImpl#getFlawTarget()
	 * @generated
	 */
	int FLAW_TARGET = 6;

	/**
	 * The meta object id for the '{@link de.archsec.interoperability.guideline.Guideline.CheckState <em>Check State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.archsec.interoperability.guideline.Guideline.CheckState
	 * @see de.archsec.interoperability.guideline.Guideline.impl.GuidelinePackageImpl#getCheckState()
	 * @generated
	 */
	int CHECK_STATE = 7;


	/**
	 * Returns the meta object for class '{@link de.archsec.interoperability.guideline.Guideline.Guideline <em>Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guideline</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Guideline
	 * @generated
	 */
	EClass getGuideline();

	/**
	 * Returns the meta object for the containment reference list '{@link de.archsec.interoperability.guideline.Guideline.Guideline#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Guideline#getRules()
	 * @see #getGuideline()
	 * @generated
	 */
	EReference getGuideline_Rules();

	/**
	 * Returns the meta object for the attribute '{@link de.archsec.interoperability.guideline.Guideline.Guideline#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Guideline#getId()
	 * @see #getGuideline()
	 * @generated
	 */
	EAttribute getGuideline_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.archsec.interoperability.guideline.Guideline.Guideline#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Guideline#getName()
	 * @see #getGuideline()
	 * @generated
	 */
	EAttribute getGuideline_Name();

	/**
	 * Returns the meta object for class '{@link de.archsec.interoperability.guideline.Guideline.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link de.archsec.interoperability.guideline.Guideline.Rule#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Rule#getDescription()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link de.archsec.interoperability.guideline.Guideline.Rule#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patterns</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Rule#getPatterns()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Patterns();

	/**
	 * Returns the meta object for the attribute '{@link de.archsec.interoperability.guideline.Guideline.Rule#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Rule#getId()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.archsec.interoperability.guideline.Guideline.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for class '{@link de.archsec.interoperability.guideline.Guideline.Identification <em>Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identification</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Identification
	 * @generated
	 */
	EClass getIdentification();

	/**
	 * Returns the meta object for the attribute list '{@link de.archsec.interoperability.guideline.Guideline.Identification#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Target</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Identification#getTarget()
	 * @see #getIdentification()
	 * @generated
	 */
	EAttribute getIdentification_Target();

	/**
	 * Returns the meta object for the attribute '{@link de.archsec.interoperability.guideline.Guideline.Identification#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Identification#getId()
	 * @see #getIdentification()
	 * @generated
	 */
	EAttribute getIdentification_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link de.archsec.interoperability.guideline.Guideline.Identification#getChecks <em>Checks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checks</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Identification#getChecks()
	 * @see #getIdentification()
	 * @generated
	 */
	EReference getIdentification_Checks();

	/**
	 * Returns the meta object for the attribute '{@link de.archsec.interoperability.guideline.Guideline.Identification#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Identification#getDescription()
	 * @see #getIdentification()
	 * @generated
	 */
	EAttribute getIdentification_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.archsec.interoperability.guideline.Guideline.Identification#isIsAutomated <em>Is Automated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Automated</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Identification#isIsAutomated()
	 * @see #getIdentification()
	 * @generated
	 */
	EAttribute getIdentification_IsAutomated();

	/**
	 * Returns the meta object for class '{@link de.archsec.interoperability.guideline.Guideline.Check <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Check
	 * @generated
	 */
	EClass getCheck();

	/**
	 * Returns the meta object for the attribute '{@link de.archsec.interoperability.guideline.Guideline.Check#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Check#getId()
	 * @see #getCheck()
	 * @generated
	 */
	EAttribute getCheck_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.archsec.interoperability.guideline.Guideline.Check#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Check#getDescription()
	 * @see #getCheck()
	 * @generated
	 */
	EAttribute getCheck_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.archsec.interoperability.guideline.Guideline.Check#isIsAutomated <em>Is Automated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Automated</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Check#isIsAutomated()
	 * @see #getCheck()
	 * @generated
	 */
	EAttribute getCheck_IsAutomated();

	/**
	 * Returns the meta object for class '{@link de.archsec.interoperability.guideline.Guideline.Inspection <em>Inspection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inspection</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Inspection
	 * @generated
	 */
	EClass getInspection();

	/**
	 * Returns the meta object for the reference '{@link de.archsec.interoperability.guideline.Guideline.Inspection#getGuideline <em>Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guideline</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Inspection#getGuideline()
	 * @see #getInspection()
	 * @generated
	 */
	EReference getInspection_Guideline();

	/**
	 * Returns the meta object for the containment reference list '{@link de.archsec.interoperability.guideline.Guideline.Inspection#getFindings <em>Findings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Findings</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Inspection#getFindings()
	 * @see #getInspection()
	 * @generated
	 */
	EReference getInspection_Findings();

	/**
	 * Returns the meta object for class '{@link de.archsec.interoperability.guideline.Guideline.Finding <em>Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finding</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Finding
	 * @generated
	 */
	EClass getFinding();

	/**
	 * Returns the meta object for the attribute '{@link de.archsec.interoperability.guideline.Guideline.Finding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Finding#getName()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.archsec.interoperability.guideline.Guideline.Finding#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Finding#getComment()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_Comment();

	/**
	 * Returns the meta object for the attribute '{@link de.archsec.interoperability.guideline.Guideline.Finding#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Finding#getResult()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_Result();

	/**
	 * Returns the meta object for the reference '{@link de.archsec.interoperability.guideline.Guideline.Finding#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Check</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.Finding#getCheck()
	 * @see #getFinding()
	 * @generated
	 */
	EReference getFinding_Check();

	/**
	 * Returns the meta object for enum '{@link de.archsec.interoperability.guideline.Guideline.FlawTarget <em>Flaw Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flaw Target</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.FlawTarget
	 * @generated
	 */
	EEnum getFlawTarget();

	/**
	 * Returns the meta object for enum '{@link de.archsec.interoperability.guideline.Guideline.CheckState <em>Check State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Check State</em>'.
	 * @see de.archsec.interoperability.guideline.Guideline.CheckState
	 * @generated
	 */
	EEnum getCheckState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GuidelineFactory getGuidelineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.archsec.interoperability.guideline.Guideline.impl.GuidelineImpl <em>Guideline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.archsec.interoperability.guideline.Guideline.impl.GuidelineImpl
		 * @see de.archsec.interoperability.guideline.Guideline.impl.GuidelinePackageImpl#getGuideline()
		 * @generated
		 */
		EClass GUIDELINE = eINSTANCE.getGuideline();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUIDELINE__RULES = eINSTANCE.getGuideline_Rules();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUIDELINE__ID = eINSTANCE.getGuideline_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUIDELINE__NAME = eINSTANCE.getGuideline_Name();

		/**
		 * The meta object literal for the '{@link de.archsec.interoperability.guideline.Guideline.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.archsec.interoperability.guideline.Guideline.impl.RuleImpl
		 * @see de.archsec.interoperability.guideline.Guideline.impl.GuidelinePackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__DESCRIPTION = eINSTANCE.getRule_Description();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__PATTERNS = eINSTANCE.getRule_Patterns();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__ID = eINSTANCE.getRule_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '{@link de.archsec.interoperability.guideline.Guideline.impl.IdentificationImpl <em>Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.archsec.interoperability.guideline.Guideline.impl.IdentificationImpl
		 * @see de.archsec.interoperability.guideline.Guideline.impl.GuidelinePackageImpl#getIdentification()
		 * @generated
		 */
		EClass IDENTIFICATION = eINSTANCE.getIdentification();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION__TARGET = eINSTANCE.getIdentification_Target();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION__ID = eINSTANCE.getIdentification_Id();

		/**
		 * The meta object literal for the '<em><b>Checks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFICATION__CHECKS = eINSTANCE.getIdentification_Checks();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION__DESCRIPTION = eINSTANCE.getIdentification_Description();

		/**
		 * The meta object literal for the '<em><b>Is Automated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION__IS_AUTOMATED = eINSTANCE.getIdentification_IsAutomated();

		/**
		 * The meta object literal for the '{@link de.archsec.interoperability.guideline.Guideline.impl.CheckImpl <em>Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.archsec.interoperability.guideline.Guideline.impl.CheckImpl
		 * @see de.archsec.interoperability.guideline.Guideline.impl.GuidelinePackageImpl#getCheck()
		 * @generated
		 */
		EClass CHECK = eINSTANCE.getCheck();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK__ID = eINSTANCE.getCheck_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK__DESCRIPTION = eINSTANCE.getCheck_Description();

		/**
		 * The meta object literal for the '<em><b>Is Automated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK__IS_AUTOMATED = eINSTANCE.getCheck_IsAutomated();

		/**
		 * The meta object literal for the '{@link de.archsec.interoperability.guideline.Guideline.impl.InspectionImpl <em>Inspection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.archsec.interoperability.guideline.Guideline.impl.InspectionImpl
		 * @see de.archsec.interoperability.guideline.Guideline.impl.GuidelinePackageImpl#getInspection()
		 * @generated
		 */
		EClass INSPECTION = eINSTANCE.getInspection();

		/**
		 * The meta object literal for the '<em><b>Guideline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSPECTION__GUIDELINE = eINSTANCE.getInspection_Guideline();

		/**
		 * The meta object literal for the '<em><b>Findings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSPECTION__FINDINGS = eINSTANCE.getInspection_Findings();

		/**
		 * The meta object literal for the '{@link de.archsec.interoperability.guideline.Guideline.impl.FindingImpl <em>Finding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.archsec.interoperability.guideline.Guideline.impl.FindingImpl
		 * @see de.archsec.interoperability.guideline.Guideline.impl.GuidelinePackageImpl#getFinding()
		 * @generated
		 */
		EClass FINDING = eINSTANCE.getFinding();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDING__NAME = eINSTANCE.getFinding_Name();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDING__COMMENT = eINSTANCE.getFinding_Comment();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDING__RESULT = eINSTANCE.getFinding_Result();

		/**
		 * The meta object literal for the '<em><b>Check</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINDING__CHECK = eINSTANCE.getFinding_Check();

		/**
		 * The meta object literal for the '{@link de.archsec.interoperability.guideline.Guideline.FlawTarget <em>Flaw Target</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.archsec.interoperability.guideline.Guideline.FlawTarget
		 * @see de.archsec.interoperability.guideline.Guideline.impl.GuidelinePackageImpl#getFlawTarget()
		 * @generated
		 */
		EEnum FLAW_TARGET = eINSTANCE.getFlawTarget();

		/**
		 * The meta object literal for the '{@link de.archsec.interoperability.guideline.Guideline.CheckState <em>Check State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.archsec.interoperability.guideline.Guideline.CheckState
		 * @see de.archsec.interoperability.guideline.Guideline.impl.GuidelinePackageImpl#getCheckState()
		 * @generated
		 */
		EEnum CHECK_STATE = eINSTANCE.getCheckState();

	}

} //GuidelinePackage
