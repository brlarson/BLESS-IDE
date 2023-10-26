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
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Value#getValue_name <em>Value name</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Value#getConstant <em>Constant</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Value#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Value#getNow <em>Now</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Value#getTops <em>Tops</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Value#getEnum_val <em>Enum val</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Value name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value name</em>' containment reference.
   * @see #setValue_name(ValueName)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getValue_Value_name()
   * @model containment="true"
   * @generated
   */
  ValueName getValue_name();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Value#getValue_name <em>Value name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value name</em>' containment reference.
   * @see #getValue_name()
   * @generated
   */
  void setValue_name(ValueName value);

  /**
   * Returns the value of the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' containment reference.
   * @see #setConstant(Constant)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getValue_Constant()
   * @model containment="true"
   * @generated
   */
  Constant getConstant();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Value#getConstant <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' containment reference.
   * @see #getConstant()
   * @generated
   */
  void setConstant(Constant value);

  /**
   * Returns the value of the '<em><b>Timeout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timeout</em>' attribute.
   * @see #setTimeout(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getValue_Timeout()
   * @model
   * @generated
   */
  String getTimeout();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Value#getTimeout <em>Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timeout</em>' attribute.
   * @see #getTimeout()
   * @generated
   */
  void setTimeout(String value);

  /**
   * Returns the value of the '<em><b>Now</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Now</em>' attribute.
   * @see #setNow(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getValue_Now()
   * @model
   * @generated
   */
  String getNow();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Value#getNow <em>Now</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Now</em>' attribute.
   * @see #getNow()
   * @generated
   */
  void setNow(String value);

  /**
   * Returns the value of the '<em><b>Tops</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tops</em>' attribute.
   * @see #setTops(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getValue_Tops()
   * @model
   * @generated
   */
  String getTops();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Value#getTops <em>Tops</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tops</em>' attribute.
   * @see #getTops()
   * @generated
   */
  void setTops(String value);

  /**
   * Returns the value of the '<em><b>Enum val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum val</em>' containment reference.
   * @see #setEnum_val(EnumerationValue)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getValue_Enum_val()
   * @model containment="true"
   * @generated
   */
  EnumerationValue getEnum_val();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Value#getEnum_val <em>Enum val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum val</em>' containment reference.
   * @see #getEnum_val()
   * @generated
   */
  void setEnum_val(EnumerationValue value);

} // Value
