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
 * A representation of the model object '<em><b>Catch Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.CatchClause#getCatches <em>Catches</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getCatchClause()
 * @model
 * @generated
 */
public interface CatchClause extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Catches</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.CatchClauseTerm}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Catches</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getCatchClause_Catches()
   * @model containment="true"
   * @generated
   */
  EList<CatchClauseTerm> getCatches();

} // CatchClause
