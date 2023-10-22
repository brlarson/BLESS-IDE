/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.30.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subexpression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Subexpression#getUnary <em>Unary</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Subexpression#getTimed_expression <em>Timed expression</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getSubexpression()
 * @model
 * @generated
 */
public interface Subexpression extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Unary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary</em>' containment reference.
   * @see #setUnary(UnaryOperator)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getSubexpression_Unary()
   * @model containment="true"
   * @generated
   */
  UnaryOperator getUnary();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Subexpression#getUnary <em>Unary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary</em>' containment reference.
   * @see #getUnary()
   * @generated
   */
  void setUnary(UnaryOperator value);

  /**
   * Returns the value of the '<em><b>Timed expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timed expression</em>' containment reference.
   * @see #setTimed_expression(TimedExpression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getSubexpression_Timed_expression()
   * @model containment="true"
   * @generated
   */
  TimedExpression getTimed_expression();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Subexpression#getTimed_expression <em>Timed expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timed expression</em>' containment reference.
   * @see #getTimed_expression()
   * @generated
   */
  void setTimed_expression(TimedExpression value);

} // Subexpression
