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
 * A representation of the model object '<em><b>Transitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Transitions#getBt <em>Bt</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getTransitions()
 * @model
 * @generated
 */
public interface Transitions extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Bt</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.BehaviorTransition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bt</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getTransitions_Bt()
   * @model containment="true"
   * @generated
   */
  EList<BehaviorTransition> getBt();

} // Transitions
