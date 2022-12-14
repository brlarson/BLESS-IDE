/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;
import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dispatch Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.DispatchTrigger#getPort <em>Port</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.DispatchTrigger#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.DispatchTrigger#isLp <em>Lp</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.DispatchTrigger#getPorts <em>Ports</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.DispatchTrigger#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getDispatchTrigger()
 * @model
 * @generated
 */
public interface DispatchTrigger extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' containment reference.
   * @see #setPort(PortName)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getDispatchTrigger_Port()
   * @model containment="true"
   * @generated
   */
  PortName getPort();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.DispatchTrigger#getPort <em>Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' containment reference.
   * @see #getPort()
   * @generated
   */
  void setPort(PortName value);

  /**
   * Returns the value of the '<em><b>Timeout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timeout</em>' attribute.
   * @see #setTimeout(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getDispatchTrigger_Timeout()
   * @model
   * @generated
   */
  String getTimeout();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.DispatchTrigger#getTimeout <em>Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timeout</em>' attribute.
   * @see #getTimeout()
   * @generated
   */
  void setTimeout(String value);

  /**
   * Returns the value of the '<em><b>Lp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lp</em>' attribute.
   * @see #setLp(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getDispatchTrigger_Lp()
   * @model
   * @generated
   */
  boolean isLp();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.DispatchTrigger#isLp <em>Lp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lp</em>' attribute.
   * @see #isLp()
   * @generated
   */
  void setLp(boolean value);

  /**
   * Returns the value of the '<em><b>Ports</b></em>' reference list.
   * The list contents are of type {@link org.osate.aadl2.NamedElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getDispatchTrigger_Ports()
   * @model
   * @generated
   */
  EList<NamedElement> getPorts();

  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference.
   * @see #setTime(BehaviorTime)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getDispatchTrigger_Time()
   * @model containment="true"
   * @generated
   */
  BehaviorTime getTime();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.DispatchTrigger#getTime <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' containment reference.
   * @see #getTime()
   * @generated
   */
  void setTime(BehaviorTime value);

} // DispatchTrigger
