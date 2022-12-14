/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Value Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ConditionValuePair#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ConditionValuePair#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getConditionValuePair()
 * @model
 * @generated
 */
public interface ConditionValuePair extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Predicate)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getConditionValuePair_Condition()
   * @model containment="true"
   * @generated
   */
  Predicate getCondition();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ConditionValuePair#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Predicate value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(AssertionNumericExpression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getConditionValuePair_Expression()
   * @model containment="true"
   * @generated
   */
  AssertionNumericExpression getExpression();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ConditionValuePair#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(AssertionNumericExpression value);

} // ConditionValuePair
