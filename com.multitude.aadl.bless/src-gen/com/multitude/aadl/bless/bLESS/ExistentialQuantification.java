/**
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.33.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Existential Quantification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ExistentialQuantification#getVariables <em>Variables</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ExistentialQuantification#isIn <em>In</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ExistentialQuantification#getRange <em>Range</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ExistentialQuantification#isWhich <em>Which</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ExistentialQuantification#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ExistentialQuantification#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getExistentialQuantification()
 * @model
 * @generated
 */
public interface ExistentialQuantification extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference.
   * @see #setVariables(LogicVariables)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getExistentialQuantification_Variables()
   * @model containment="true"
   * @generated
   */
  LogicVariables getVariables();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ExistentialQuantification#getVariables <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variables</em>' containment reference.
   * @see #getVariables()
   * @generated
   */
  void setVariables(LogicVariables value);

  /**
   * Returns the value of the '<em><b>In</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>In</em>' attribute.
   * @see #setIn(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getExistentialQuantification_In()
   * @model
   * @generated
   */
  boolean isIn();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ExistentialQuantification#isIn <em>In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In</em>' attribute.
   * @see #isIn()
   * @generated
   */
  void setIn(boolean value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(Range)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getExistentialQuantification_Range()
   * @model containment="true"
   * @generated
   */
  Range getRange();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ExistentialQuantification#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(Range value);

  /**
   * Returns the value of the '<em><b>Which</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Which</em>' attribute.
   * @see #setWhich(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getExistentialQuantification_Which()
   * @model
   * @generated
   */
  boolean isWhich();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ExistentialQuantification#isWhich <em>Which</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Which</em>' attribute.
   * @see #isWhich()
   * @generated
   */
  void setWhich(boolean value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Predicate)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getExistentialQuantification_Condition()
   * @model containment="true"
   * @generated
   */
  Predicate getCondition();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ExistentialQuantification#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Predicate value);

  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference.
   * @see #setPredicate(Predicate)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getExistentialQuantification_Predicate()
   * @model containment="true"
   * @generated
   */
  Predicate getPredicate();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ExistentialQuantification#getPredicate <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' containment reference.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(Predicate value);

} // ExistentialQuantification
