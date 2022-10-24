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
 * A representation of the model object '<em><b>Execute Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ExecuteCondition#getEor <em>Eor</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ExecuteCondition#getOtherwise <em>Otherwise</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getExecuteCondition()
 * @model
 * @generated
 */
public interface ExecuteCondition extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Eor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eor</em>' containment reference.
   * @see #setEor(BooleanExpression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getExecuteCondition_Eor()
   * @model containment="true"
   * @generated
   */
  BooleanExpression getEor();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ExecuteCondition#getEor <em>Eor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eor</em>' containment reference.
   * @see #getEor()
   * @generated
   */
  void setEor(BooleanExpression value);

  /**
   * Returns the value of the '<em><b>Otherwise</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Otherwise</em>' containment reference.
   * @see #setOtherwise(Otherwise)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getExecuteCondition_Otherwise()
   * @model containment="true"
   * @generated
   */
  Otherwise getOtherwise();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ExecuteCondition#getOtherwise <em>Otherwise</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Otherwise</em>' containment reference.
   * @see #getOtherwise()
   * @generated
   */
  void setOtherwise(Otherwise value);

} // ExecuteCondition
