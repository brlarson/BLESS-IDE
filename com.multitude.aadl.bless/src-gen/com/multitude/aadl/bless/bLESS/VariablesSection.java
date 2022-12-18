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
 * A representation of the model object '<em><b>Variables Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.VariablesSection#getBehavior_variables <em>Behavior variables</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getVariablesSection()
 * @model
 * @generated
 */
public interface VariablesSection extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Behavior variables</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.VariableDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behavior variables</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getVariablesSection_Behavior_variables()
   * @model containment="true"
   * @generated
   */
  EList<VariableDeclaration> getBehavior_variables();

} // VariablesSection
