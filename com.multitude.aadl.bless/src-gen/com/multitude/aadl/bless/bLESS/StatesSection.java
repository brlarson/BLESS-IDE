/**
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.33.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>States Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.StatesSection#getSt <em>St</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.StatesSection#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getStatesSection()
 * @model
 * @generated
 */
public interface StatesSection extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>St</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>St</em>' attribute.
   * @see #setSt(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getStatesSection_St()
   * @model
   * @generated
   */
  String getSt();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.StatesSection#getSt <em>St</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>St</em>' attribute.
   * @see #getSt()
   * @generated
   */
  void setSt(String value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.BehaviorState}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getStatesSection_States()
   * @model containment="true"
   * @generated
   */
  EList<BehaviorState> getStates();

} // StatesSection
