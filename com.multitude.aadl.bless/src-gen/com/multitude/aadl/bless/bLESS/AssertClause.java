/**
 * (C) Multitude Corporation 2021
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.AssertClause#getAssertions <em>Assertions</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getAssertClause()
 * @model
 * @generated
 */
public interface AssertClause extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Assertions</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.NamedAssertion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assertions</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getAssertClause_Assertions()
   * @model containment="true"
   * @generated
   */
  EList<NamedAssertion> getAssertions();

} // AssertClause