/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grammar Roots</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.BLESSGrammarRoots#getUnit_library <em>Unit library</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.BLESSGrammarRoots#getType_library <em>Type library</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.BLESSGrammarRoots#getAssertion_library <em>Assertion library</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.BLESSGrammarRoots#getAction_subclause <em>Action subclause</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.BLESSGrammarRoots#getException_library <em>Exception library</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.BLESSGrammarRoots#getBless_subclause <em>Bless subclause</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getBLESSGrammarRoots()
 * @model
 * @generated
 */
public interface BLESSGrammarRoots extends EObject
{
  /**
   * Returns the value of the '<em><b>Unit library</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit library</em>' containment reference.
   * @see #setUnit_library(UnitLibrary)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getBLESSGrammarRoots_Unit_library()
   * @model containment="true"
   * @generated
   */
  UnitLibrary getUnit_library();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.BLESSGrammarRoots#getUnit_library <em>Unit library</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit library</em>' containment reference.
   * @see #getUnit_library()
   * @generated
   */
  void setUnit_library(UnitLibrary value);

  /**
   * Returns the value of the '<em><b>Type library</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type library</em>' containment reference.
   * @see #setType_library(TypeLibrary)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getBLESSGrammarRoots_Type_library()
   * @model containment="true"
   * @generated
   */
  TypeLibrary getType_library();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.BLESSGrammarRoots#getType_library <em>Type library</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type library</em>' containment reference.
   * @see #getType_library()
   * @generated
   */
  void setType_library(TypeLibrary value);

  /**
   * Returns the value of the '<em><b>Assertion library</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assertion library</em>' containment reference.
   * @see #setAssertion_library(AssertionLibrary)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getBLESSGrammarRoots_Assertion_library()
   * @model containment="true"
   * @generated
   */
  AssertionLibrary getAssertion_library();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.BLESSGrammarRoots#getAssertion_library <em>Assertion library</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assertion library</em>' containment reference.
   * @see #getAssertion_library()
   * @generated
   */
  void setAssertion_library(AssertionLibrary value);

  /**
   * Returns the value of the '<em><b>Action subclause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action subclause</em>' containment reference.
   * @see #setAction_subclause(ActionSubclause)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getBLESSGrammarRoots_Action_subclause()
   * @model containment="true"
   * @generated
   */
  ActionSubclause getAction_subclause();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.BLESSGrammarRoots#getAction_subclause <em>Action subclause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action subclause</em>' containment reference.
   * @see #getAction_subclause()
   * @generated
   */
  void setAction_subclause(ActionSubclause value);

  /**
   * Returns the value of the '<em><b>Exception library</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception library</em>' containment reference.
   * @see #setException_library(ExceptionLibrary)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getBLESSGrammarRoots_Exception_library()
   * @model containment="true"
   * @generated
   */
  ExceptionLibrary getException_library();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.BLESSGrammarRoots#getException_library <em>Exception library</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception library</em>' containment reference.
   * @see #getException_library()
   * @generated
   */
  void setException_library(ExceptionLibrary value);

  /**
   * Returns the value of the '<em><b>Bless subclause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bless subclause</em>' containment reference.
   * @see #setBless_subclause(BLESSSubclause)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getBLESSGrammarRoots_Bless_subclause()
   * @model containment="true"
   * @generated
   */
  BLESSSubclause getBless_subclause();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.BLESSGrammarRoots#getBless_subclause <em>Bless subclause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bless subclause</em>' containment reference.
   * @see #getBless_subclause()
   * @generated
   */
  void setBless_subclause(BLESSSubclause value);

} // BLESSGrammarRoots
