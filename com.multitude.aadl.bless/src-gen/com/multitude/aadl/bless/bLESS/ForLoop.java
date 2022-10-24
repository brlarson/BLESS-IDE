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
 * A representation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ForLoop#getCount <em>Count</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ForLoop#getLower_bound <em>Lower bound</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ForLoop#getUpper_bound <em>Upper bound</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ForLoop#isInvariant <em>Invariant</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ForLoop#getInv <em>Inv</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ForLoop#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getForLoop()
 * @model
 * @generated
 */
public interface ForLoop extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Count</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Count</em>' containment reference.
   * @see #setCount(ForallVariable)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getForLoop_Count()
   * @model containment="true"
   * @generated
   */
  ForallVariable getCount();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ForLoop#getCount <em>Count</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Count</em>' containment reference.
   * @see #getCount()
   * @generated
   */
  void setCount(ForallVariable value);

  /**
   * Returns the value of the '<em><b>Lower bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower bound</em>' containment reference.
   * @see #setLower_bound(Expression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getForLoop_Lower_bound()
   * @model containment="true"
   * @generated
   */
  Expression getLower_bound();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ForLoop#getLower_bound <em>Lower bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower bound</em>' containment reference.
   * @see #getLower_bound()
   * @generated
   */
  void setLower_bound(Expression value);

  /**
   * Returns the value of the '<em><b>Upper bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper bound</em>' containment reference.
   * @see #setUpper_bound(Expression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getForLoop_Upper_bound()
   * @model containment="true"
   * @generated
   */
  Expression getUpper_bound();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ForLoop#getUpper_bound <em>Upper bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper bound</em>' containment reference.
   * @see #getUpper_bound()
   * @generated
   */
  void setUpper_bound(Expression value);

  /**
   * Returns the value of the '<em><b>Invariant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invariant</em>' attribute.
   * @see #setInvariant(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getForLoop_Invariant()
   * @model
   * @generated
   */
  boolean isInvariant();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ForLoop#isInvariant <em>Invariant</em>}' attribute.
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
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getForLoop_Inv()
   * @model containment="true"
   * @generated
   */
  NamelessAssertion getInv();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ForLoop#getInv <em>Inv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inv</em>' containment reference.
   * @see #getInv()
   * @generated
   */
  void setInv(NamelessAssertion value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(BehaviorActions)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getForLoop_Action()
   * @model containment="true"
   * @generated
   */
  BehaviorActions getAction();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ForLoop#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(BehaviorActions value);

} // ForLoop