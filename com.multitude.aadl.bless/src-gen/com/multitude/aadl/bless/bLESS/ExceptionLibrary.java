/**
 * (C) Multitude Corporation 2021
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.AnnexLibrary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ExceptionLibrary#getExceptiondefinitions <em>Exceptiondefinitions</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getExceptionLibrary()
 * @model
 * @generated
 */
public interface ExceptionLibrary extends EObject, AnnexLibrary
{
  /**
   * Returns the value of the '<em><b>Exceptiondefinitions</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.Exception}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exceptiondefinitions</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getExceptionLibrary_Exceptiondefinitions()
   * @model containment="true"
   * @generated
   */
  EList<com.multitude.aadl.bless.bLESS.Exception> getExceptiondefinitions();

} // ExceptionLibrary
