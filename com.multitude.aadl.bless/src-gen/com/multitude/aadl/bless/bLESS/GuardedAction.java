/**
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.33.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guarded Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.GuardedAction#getGuard <em>Guard</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.GuardedAction#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getGuardedAction()
 * @model
 * @generated
 */
public interface GuardedAction extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(BooleanExpression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getGuardedAction_Guard()
   * @model containment="true"
   * @generated
   */
  BooleanExpression getGuard();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.GuardedAction#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(BooleanExpression value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(AssertedAction)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getGuardedAction_Action()
   * @model containment="true"
   * @generated
   */
  AssertedAction getAction();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.GuardedAction#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(AssertedAction value);

} // GuardedAction
