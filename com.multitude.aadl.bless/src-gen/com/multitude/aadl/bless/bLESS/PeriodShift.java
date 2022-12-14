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
 * A representation of the model object '<em><b>Period Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.PeriodShift#isUnary_minus <em>Unary minus</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.PeriodShift#getV <em>V</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.PeriodShift#getIndex_expression <em>Index expression</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getPeriodShift()
 * @model
 * @generated
 */
public interface PeriodShift extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Unary minus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary minus</em>' attribute.
   * @see #setUnary_minus(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getPeriodShift_Unary_minus()
   * @model
   * @generated
   */
  boolean isUnary_minus();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.PeriodShift#isUnary_minus <em>Unary minus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary minus</em>' attribute.
   * @see #isUnary_minus()
   * @generated
   */
  void setUnary_minus(boolean value);

  /**
   * Returns the value of the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' containment reference.
   * @see #setV(Value)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getPeriodShift_V()
   * @model containment="true"
   * @generated
   */
  Value getV();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.PeriodShift#getV <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' containment reference.
   * @see #getV()
   * @generated
   */
  void setV(Value value);

  /**
   * Returns the value of the '<em><b>Index expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index expression</em>' containment reference.
   * @see #setIndex_expression(IndexExpression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getPeriodShift_Index_expression()
   * @model containment="true"
   * @generated
   */
  IndexExpression getIndex_expression();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.PeriodShift#getIndex_expression <em>Index expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index expression</em>' containment reference.
   * @see #getIndex_expression()
   * @generated
   */
  void setIndex_expression(IndexExpression value);

} // PeriodShift
