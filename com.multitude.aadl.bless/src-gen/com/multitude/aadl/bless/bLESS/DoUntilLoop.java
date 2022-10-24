/**
 * (C) Multitude Corporation 2021
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do Until Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.DoUntilLoop#isInvariant <em>Invariant</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.DoUntilLoop#getInv <em>Inv</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.DoUntilLoop#isBound <em>Bound</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.DoUntilLoop#getBnd <em>Bnd</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.DoUntilLoop#getActions <em>Actions</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.DoUntilLoop#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getDoUntilLoop()
 * @model
 * @generated
 */
public interface DoUntilLoop extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Invariant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invariant</em>' attribute.
   * @see #setInvariant(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getDoUntilLoop_Invariant()
   * @model
   * @generated
   */
  boolean isInvariant();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.DoUntilLoop#isInvariant <em>Invariant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Invariant</em>' attribute.
   * @see #isInvariant()
   * @generated
   */
  void setInvariant(boolean value);

  /**
   * Returns the value of the '<em><b>Inv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inv</em>' containment reference.
   * @see #setInv(NamelessAssertion)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getDoUntilLoop_Inv()
   * @model containment="true"
   * @generated
   */
  NamelessAssertion getInv();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.DoUntilLoop#getInv <em>Inv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inv</em>' containment reference.
   * @see #getInv()
   * @generated
   */
  void setInv(NamelessAssertion value);

  /**
   * Returns the value of the '<em><b>Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bound</em>' attribute.
   * @see #setBound(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getDoUntilLoop_Bound()
   * @model
   * @generated
   */
  boolean isBound();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.DoUntilLoop#isBound <em>Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bound</em>' attribute.
   * @see #isBound()
   * @generated
   */
  void setBound(boolean value);

  /**
   * Returns the value of the '<em><b>Bnd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bnd</em>' containment reference.
   * @see #setBnd(Expression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getDoUntilLoop_Bnd()
   * @model containment="true"
   * @generated
   */
  Expression getBnd();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.DoUntilLoop#getBnd <em>Bnd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bnd</em>' containment reference.
   * @see #getBnd()
   * @generated
   */
  void setBnd(Expression value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference.
   * @see #setActions(BehaviorActions)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getDoUntilLoop_Actions()
   * @model containment="true"
   * @generated
   */
  BehaviorActions getActions();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.DoUntilLoop#getActions <em>Actions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actions</em>' containment reference.
   * @see #getActions()
   * @generated
   */
  void setActions(BehaviorActions value);

  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(BooleanExpression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getDoUntilLoop_Guard()
   * @model containment="true"
   * @generated
   */
  BooleanExpression getGuard();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.DoUntilLoop#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(BooleanExpression value);

} // DoUntilLoop
