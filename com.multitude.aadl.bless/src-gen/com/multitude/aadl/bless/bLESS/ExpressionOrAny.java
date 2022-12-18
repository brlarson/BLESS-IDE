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
 * A representation of the model object '<em><b>Expression Or Any</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ExpressionOrAny#getExp <em>Exp</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ExpressionOrAny#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getExpressionOrAny()
 * @model
 * @generated
 */
public interface ExpressionOrAny extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getExpressionOrAny_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ExpressionOrAny#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

  /**
   * Returns the value of the '<em><b>Any</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Any</em>' attribute.
   * @see #setAny(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getExpressionOrAny_Any()
   * @model
   * @generated
   */
  String getAny();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ExpressionOrAny#getAny <em>Any</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Any</em>' attribute.
   * @see #getAny()
   * @generated
   */
  void setAny(String value);

} // ExpressionOrAny
