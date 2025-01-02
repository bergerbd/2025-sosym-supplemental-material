/**
 */
package de.archsec.interoperability.guideline.Guideline;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Flaw Target</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.archsec.interoperability.guideline.Guideline.GuidelinePackage#getFlawTarget()
 * @model
 * @generated
 */
public enum FlawTarget implements Enumerator {
	/**
	 * The '<em><b>Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESS(0, "Process", "Process"),

	/**
	 * The '<em><b>Datastore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATASTORE_VALUE
	 * @generated
	 * @ordered
	 */
	DATASTORE(1, "Datastore", "Datastore"),

	/**
	 * The '<em><b>Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_VALUE
	 * @generated
	 * @ordered
	 */
	DATA(2, "Data", "Data"),

	/**
	 * The '<em><b>Information Flow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATION_FLOW_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMATION_FLOW(3, "InformationFlow", "InformationFlow"),

	/**
	 * The '<em><b>External Entity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_ENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	EXTERNAL_ENTITY(4, "ExternalEntity", "ExternalEntity");

	/**
	 * The '<em><b>Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS
	 * @model name="Process"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESS_VALUE = 0;

	/**
	 * The '<em><b>Datastore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATASTORE
	 * @model name="Datastore"
	 * @generated
	 * @ordered
	 */
	public static final int DATASTORE_VALUE = 1;

	/**
	 * The '<em><b>Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA
	 * @model name="Data"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_VALUE = 2;

	/**
	 * The '<em><b>Information Flow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATION_FLOW
	 * @model name="InformationFlow"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMATION_FLOW_VALUE = 3;

	/**
	 * The '<em><b>External Entity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_ENTITY
	 * @model name="ExternalEntity"
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_ENTITY_VALUE = 4;

	/**
	 * An array of all the '<em><b>Flaw Target</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FlawTarget[] VALUES_ARRAY =
		new FlawTarget[] {
			PROCESS,
			DATASTORE,
			DATA,
			INFORMATION_FLOW,
			EXTERNAL_ENTITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Flaw Target</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FlawTarget> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Flaw Target</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FlawTarget get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FlawTarget result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Flaw Target</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FlawTarget getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FlawTarget result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Flaw Target</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FlawTarget get(int value) {
		switch (value) {
			case PROCESS_VALUE: return PROCESS;
			case DATASTORE_VALUE: return DATASTORE;
			case DATA_VALUE: return DATA;
			case INFORMATION_FLOW_VALUE: return INFORMATION_FLOW;
			case EXTERNAL_ENTITY_VALUE: return EXTERNAL_ENTITY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FlawTarget(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FlawTarget
