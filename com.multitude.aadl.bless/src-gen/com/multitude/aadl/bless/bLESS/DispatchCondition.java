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
 * A representation of the model object '<em><b>Dispatch Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.DispatchCondition#getDispatch <em>Dispatch</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.DispatchCondition#getDe <em>De</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.DispatchCondition#getFrozen <em>Frozen</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getDispatchCondition()
 * @model
 * @generated
 */
public interface DispatchCondition extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Dispatch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dispatch</em>' attribute.
   * @see #setDispatch(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getDispatchCondition_Dispatch()
   * @model
   * @generated
   */
  String getDispatch();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.DispatchCondition#getDispatch <em>Dispatch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dispatch</em>' attribute.
   * @see #getDispatch()
   * @generated
   */
  void setDispatch(String value);

  /**
   * Returns the value of the '<em><b>De</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>De</em>' containment reference.
   * @see #setDe(DispatchExpression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getDispatchCondition_De()
   * @model containment="true"
   * @generated
   */
  DispatchExpression getDe();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.DispatchCondition#getDe <em>De</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>De</em>' containment reference.
   * @see #getDe()
   * @generated
   */
  void setDe(DispatchExpression value);

  /**
   * Returns the value of the '<em><b>Frozen</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Frozen</em>' containment reference.
   * @see #setFrozen(FreezePort)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getDispatchCondition_Frozen()
   * @model containment="true"
   * @generated
   */
  FreezePort getFrozen();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.DispatchCondition#getFrozen <em>Frozen</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Frozen</em>' containment reference.
   * @see #getFrozen()
   * @generated
   */
  void setFrozen(FreezePort value);

} // DispatchCondition
