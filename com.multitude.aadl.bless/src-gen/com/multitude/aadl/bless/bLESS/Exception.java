/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.30.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Exception#getDescription <em>Description</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Exception#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getException()
 * @model
 * @generated
 */
public interface Exception extends EObject, NamedElement
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getException_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Exception#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' attribute.
   * @see #setCode(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getException_Code()
   * @model
   * @generated
   */
  String getCode();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Exception#getCode <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' attribute.
   * @see #getCode()
   * @generated
   */
  void setCode(String value);

} // Exception
