/**
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.30.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Timeout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ActionTimeout#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getActionTimeout()
 * @model
 * @generated
 */
public interface ActionTimeout extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' containment reference.
   * @see #setDuration(BehaviorTime)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getActionTimeout_Duration()
   * @model containment="true"
   * @generated
   */
  BehaviorTime getDuration();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ActionTimeout#getDuration <em>Duration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' containment reference.
   * @see #getDuration()
   * @generated
   */
  void setDuration(BehaviorTime value);

} // ActionTimeout
