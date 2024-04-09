/**
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.33.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.EnumerationValue#getEnumeration_type <em>Enumeration type</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.EnumerationValue#getTick <em>Tick</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.EnumerationValue#getEnumeration_value <em>Enumeration value</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getEnumerationValue()
 * @model
 * @generated
 */
public interface EnumerationValue extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Enumeration type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumeration type</em>' reference.
   * @see #setEnumeration_type(TypeDeclaration)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getEnumerationValue_Enumeration_type()
   * @model
   * @generated
   */
  TypeDeclaration getEnumeration_type();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.EnumerationValue#getEnumeration_type <em>Enumeration type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumeration type</em>' reference.
   * @see #getEnumeration_type()
   * @generated
   */
  void setEnumeration_type(TypeDeclaration value);

  /**
   * Returns the value of the '<em><b>Tick</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tick</em>' attribute.
   * @see #setTick(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getEnumerationValue_Tick()
   * @model
   * @generated
   */
  String getTick();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.EnumerationValue#getTick <em>Tick</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tick</em>' attribute.
   * @see #getTick()
   * @generated
   */
  void setTick(String value);

  /**
   * Returns the value of the '<em><b>Enumeration value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumeration value</em>' attribute.
   * @see #setEnumeration_value(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getEnumerationValue_Enumeration_value()
   * @model
   * @generated
   */
  String getEnumeration_value();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.EnumerationValue#getEnumeration_value <em>Enumeration value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumeration value</em>' attribute.
   * @see #getEnumeration_value()
   * @generated
   */
  void setEnumeration_value(String value);

} // EnumerationValue
