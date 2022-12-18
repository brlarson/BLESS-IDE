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
 * A representation of the model object '<em><b>Assertion Function Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.AssertionFunctionValue#getCexp <em>Cexp</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.AssertionFunctionValue#getPexp <em>Pexp</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getAssertionFunctionValue()
 * @model
 * @generated
 */
public interface AssertionFunctionValue extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Cexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cexp</em>' containment reference.
   * @see #setCexp(ConditionalAssertionFunction)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getAssertionFunctionValue_Cexp()
   * @model containment="true"
   * @generated
   */
  ConditionalAssertionFunction getCexp();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.AssertionFunctionValue#getCexp <em>Cexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cexp</em>' containment reference.
   * @see #getCexp()
   * @generated
   */
  void setCexp(ConditionalAssertionFunction value);

  /**
   * Returns the value of the '<em><b>Pexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pexp</em>' containment reference.
   * @see #setPexp(AssertionNumericExpression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getAssertionFunctionValue_Pexp()
   * @model containment="true"
   * @generated
   */
  AssertionNumericExpression getPexp();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.AssertionFunctionValue#getPexp <em>Pexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pexp</em>' containment reference.
   * @see #getPexp()
   * @generated
   */
  void setPexp(AssertionNumericExpression value);

} // AssertionFunctionValue
