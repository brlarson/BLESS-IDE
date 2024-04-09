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
 * A representation of the model object '<em><b>Elseif Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ElseifAlternative#getTest <em>Test</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ElseifAlternative#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getElseifAlternative()
 * @model
 * @generated
 */
public interface ElseifAlternative extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test</em>' containment reference.
   * @see #setTest(BooleanExpression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getElseifAlternative_Test()
   * @model containment="true"
   * @generated
   */
  BooleanExpression getTest();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ElseifAlternative#getTest <em>Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test</em>' containment reference.
   * @see #getTest()
   * @generated
   */
  void setTest(BooleanExpression value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference.
   * @see #setActions(BehaviorActions)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getElseifAlternative_Actions()
   * @model containment="true"
   * @generated
   */
  BehaviorActions getActions();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ElseifAlternative#getActions <em>Actions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actions</em>' containment reference.
   * @see #getActions()
   * @generated
   */
  void setActions(BehaviorActions value);

} // ElseifAlternative
