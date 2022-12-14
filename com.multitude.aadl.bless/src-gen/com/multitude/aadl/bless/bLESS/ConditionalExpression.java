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
 * A representation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ConditionalExpression#getPred <em>Pred</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ConditionalExpression#getT <em>T</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ConditionalExpression#getF <em>F</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getConditionalExpression()
 * @model
 * @generated
 */
public interface ConditionalExpression extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred</em>' containment reference.
   * @see #setPred(Expression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getConditionalExpression_Pred()
   * @model containment="true"
   * @generated
   */
  Expression getPred();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ConditionalExpression#getPred <em>Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pred</em>' containment reference.
   * @see #getPred()
   * @generated
   */
  void setPred(Expression value);

  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(Expression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getConditionalExpression_T()
   * @model containment="true"
   * @generated
   */
  Expression getT();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ConditionalExpression#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(Expression value);

  /**
   * Returns the value of the '<em><b>F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>F</em>' containment reference.
   * @see #setF(Expression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getConditionalExpression_F()
   * @model containment="true"
   * @generated
   */
  Expression getF();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ConditionalExpression#getF <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F</em>' containment reference.
   * @see #getF()
   * @generated
   */
  void setF(Expression value);

} // ConditionalExpression
