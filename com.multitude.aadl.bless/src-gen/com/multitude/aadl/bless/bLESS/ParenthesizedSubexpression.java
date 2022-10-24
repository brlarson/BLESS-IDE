/**
 * (C) Multitude Corporation 2021
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parenthesized Subexpression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ParenthesizedSubexpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ParenthesizedSubexpression#getT <em>T</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ParenthesizedSubexpression#getF <em>F</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ParenthesizedSubexpression#getCaseexpression <em>Caseexpression</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getParenthesizedSubexpression()
 * @model
 * @generated
 */
public interface ParenthesizedSubexpression extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getParenthesizedSubexpression_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ParenthesizedSubexpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(Expression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getParenthesizedSubexpression_T()
   * @model containment="true"
   * @generated
   */
  Expression getT();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ParenthesizedSubexpression#getT <em>T</em>}' containment reference.
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
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getParenthesizedSubexpression_F()
   * @model containment="true"
   * @generated
   */
  Expression getF();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ParenthesizedSubexpression#getF <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F</em>' containment reference.
   * @see #getF()
   * @generated
   */
  void setF(Expression value);

  /**
   * Returns the value of the '<em><b>Caseexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Caseexpression</em>' containment reference.
   * @see #setCaseexpression(CaseExpression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getParenthesizedSubexpression_Caseexpression()
   * @model containment="true"
   * @generated
   */
  CaseExpression getCaseexpression();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ParenthesizedSubexpression#getCaseexpression <em>Caseexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Caseexpression</em>' containment reference.
   * @see #getCaseexpression()
   * @generated
   */
  void setCaseexpression(CaseExpression value);

} // ParenthesizedSubexpression