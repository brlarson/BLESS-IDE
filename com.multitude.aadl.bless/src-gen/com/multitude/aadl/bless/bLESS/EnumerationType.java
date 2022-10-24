/**
 * (C) Multitude Corporation 2021
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.common.util.EList;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.EnumerationType#getDefining_enumeration_literal <em>Defining enumeration literal</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getEnumerationType()
 * @model
 * @generated
 */
public interface EnumerationType extends Element, Type
{
  /**
   * Returns the value of the '<em><b>Defining enumeration literal</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defining enumeration literal</em>' attribute list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getEnumerationType_Defining_enumeration_literal()
   * @model unique="false"
   * @generated
   */
  EList<String> getDefining_enumeration_literal();

} // EnumerationType
