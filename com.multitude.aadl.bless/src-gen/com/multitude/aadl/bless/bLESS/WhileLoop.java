/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.WhileLoop#getTest <em>Test</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.WhileLoop#isInvariant <em>Invariant</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.WhileLoop#getInv <em>Inv</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.WhileLoop#isBound <em>Bound</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.WhileLoop#getBound_function <em>Bound function</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.WhileLoop#getElq <em>Elq</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getWhileLoop()
 * @model
 * @generated
 */
public interface WhileLoop extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test</em>' containment reference.
   * @see #setTest(BooleanExpression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getWhileLoop_Test()
   * @model containment="true"
   * @generated
   */
  BooleanExpression getTest();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.WhileLoop#getTest <em>Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test</em>' containment reference.
   * @see #getTest()
   * @generated
   */
  void setTest(BooleanExpression value);

  /**
   * Returns the value of the '<em><b>Invariant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invariant</em>' attribute.
   * @see #setInvariant(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getWhileLoop_Invariant()
   * @model
   * @generated
   */
  boolean isInvariant();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.WhileLoop#isInvariant <em>Invariant</em>}' attribute.
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
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getWhileLoop_Inv()
   * @model containment="true"
   * @generated
   */
  NamelessAssertion getInv();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.WhileLoop#getInv <em>Inv</em>}' containment reference.
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
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getWhileLoop_Bound()
   * @model
   * @generated
   */
  boolean isBound();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.WhileLoop#isBound <em>Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bound</em>' attribute.
   * @see #isBound()
   * @generated
   */
  void setBound(boolean value);

  /**
   * Returns the value of the '<em><b>Bound function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bound function</em>' containment reference.
   * @see #setBound_function(Expression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getWhileLoop_Bound_function()
   * @model containment="true"
   * @generated
   */
  Expression getBound_function();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.WhileLoop#getBound_function <em>Bound function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bound function</em>' containment reference.
   * @see #getBound_function()
   * @generated
   */
  void setBound_function(Expression value);

  /**
   * Returns the value of the '<em><b>Elq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elq</em>' containment reference.
   * @see #setElq(ExistentialLatticeQuantification)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getWhileLoop_Elq()
   * @model containment="true"
   * @generated
   */
  ExistentialLatticeQuantification getElq();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.WhileLoop#getElq <em>Elq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elq</em>' containment reference.
   * @see #getElq()
   * @generated
   */
  void setElq(ExistentialLatticeQuantification value);

} // WhileLoop
