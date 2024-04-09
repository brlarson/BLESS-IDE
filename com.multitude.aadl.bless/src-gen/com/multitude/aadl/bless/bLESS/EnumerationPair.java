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
 * A representation of the model object '<em><b>Enumeration Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.EnumerationPair#getEnumeration_literal <em>Enumeration literal</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.EnumerationPair#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getEnumerationPair()
 * @model
 * @generated
 */
public interface EnumerationPair extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Enumeration literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumeration literal</em>' attribute.
   * @see #setEnumeration_literal(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getEnumerationPair_Enumeration_literal()
   * @model
   * @generated
   */
  String getEnumeration_literal();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.EnumerationPair#getEnumeration_literal <em>Enumeration literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumeration literal</em>' attribute.
   * @see #getEnumeration_literal()
   * @generated
   */
  void setEnumeration_literal(String value);

  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference.
   * @see #setPredicate(Predicate)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getEnumerationPair_Predicate()
   * @model containment="true"
   * @generated
   */
  Predicate getPredicate();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.EnumerationPair#getPredicate <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' containment reference.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(Predicate value);

} // EnumerationPair
