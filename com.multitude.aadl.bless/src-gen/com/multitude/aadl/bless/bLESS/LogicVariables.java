/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Variables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.LogicVariables#getLv <em>Lv</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getLogicVariables()
 * @model
 * @generated
 */
public interface LogicVariables extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Lv</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.Variable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lv</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getLogicVariables_Lv()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getLv();

} // LogicVariables
