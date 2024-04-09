/**
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.33.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.AssertionEnumeration#getPred <em>Pred</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.AssertionEnumeration#getPair <em>Pair</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getAssertionEnumeration()
 * @model
 * @generated
 */
public interface AssertionEnumeration extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred</em>' containment reference.
   * @see #setPred(Invocation)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getAssertionEnumeration_Pred()
   * @model containment="true"
   * @generated
   */
  Invocation getPred();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.AssertionEnumeration#getPred <em>Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pred</em>' containment reference.
   * @see #getPred()
   * @generated
   */
  void setPred(Invocation value);

  /**
   * Returns the value of the '<em><b>Pair</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.EnumerationPair}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pair</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getAssertionEnumeration_Pair()
   * @model containment="true"
   * @generated
   */
  EList<EnumerationPair> getPair();

} // AssertionEnumeration
