/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.30.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;
import org.osate.aadl2.SubprogramAccess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Access Dispatch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.SubprogramAccessDispatch#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getSubprogramAccessDispatch()
 * @model
 * @generated
 */
public interface SubprogramAccessDispatch extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Access</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access</em>' reference.
   * @see #setAccess(SubprogramAccess)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getSubprogramAccessDispatch_Access()
   * @model
   * @generated
   */
  SubprogramAccess getAccess();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.SubprogramAccessDispatch#getAccess <em>Access</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access</em>' reference.
   * @see #getAccess()
   * @generated
   */
  void setAccess(SubprogramAccess value);

} // SubprogramAccessDispatch
