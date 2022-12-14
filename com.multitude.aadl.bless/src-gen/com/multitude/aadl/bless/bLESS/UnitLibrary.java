/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.AnnexLibrary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.UnitLibrary#getUnitDeclarations <em>Unit Declarations</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getUnitLibrary()
 * @model
 * @generated
 */
public interface UnitLibrary extends EObject, AnnexLibrary
{
  /**
   * Returns the value of the '<em><b>Unit Declarations</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.UnitDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit Declarations</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getUnitLibrary_UnitDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<UnitDeclaration> getUnitDeclarations();

} // UnitLibrary
