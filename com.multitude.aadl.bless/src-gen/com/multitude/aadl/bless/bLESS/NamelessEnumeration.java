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
 * A representation of the model object '<em><b>Nameless Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.NamelessEnumeration#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getNamelessEnumeration()
 * @model
 * @generated
 */
public interface NamelessEnumeration extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Enumeration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumeration</em>' containment reference.
   * @see #setEnumeration(Invocation)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getNamelessEnumeration_Enumeration()
   * @model containment="true"
   * @generated
   */
  Invocation getEnumeration();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.NamelessEnumeration#getEnumeration <em>Enumeration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumeration</em>' containment reference.
   * @see #getEnumeration()
   * @generated
   */
  void setEnumeration(Invocation value);

} // NamelessEnumeration
