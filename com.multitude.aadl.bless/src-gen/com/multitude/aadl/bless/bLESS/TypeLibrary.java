/**
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.30.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.AnnexLibrary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.TypeLibrary#getDecs <em>Decs</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getTypeLibrary()
 * @model
 * @generated
 */
public interface TypeLibrary extends EObject, AnnexLibrary
{
  /**
   * Returns the value of the '<em><b>Decs</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.TypeDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decs</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getTypeLibrary_Decs()
   * @model containment="true"
   * @generated
   */
  EList<TypeDeclaration> getDecs();

} // TypeLibrary
