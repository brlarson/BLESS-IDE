/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throws Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ThrowsClause#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getThrowsClause()
 * @model
 * @generated
 */
public interface ThrowsClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Exceptions</b></em>' reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.Exception}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exceptions</em>' reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getThrowsClause_Exceptions()
   * @model
   * @generated
   */
  EList<com.multitude.aadl.bless.bLESS.Exception> getExceptions();

} // ThrowsClause
