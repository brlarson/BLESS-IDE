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
 * A representation of the model object '<em><b>Nameless Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.NamelessFunction#getTod <em>Tod</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.NamelessFunction#isFunc <em>Func</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.NamelessFunction#getFunctionvalue <em>Functionvalue</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getNamelessFunction()
 * @model
 * @generated
 */
public interface NamelessFunction extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Tod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tod</em>' containment reference.
   * @see #setTod(TypeOrReference)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getNamelessFunction_Tod()
   * @model containment="true"
   * @generated
   */
  TypeOrReference getTod();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.NamelessFunction#getTod <em>Tod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tod</em>' containment reference.
   * @see #getTod()
   * @generated
   */
  void setTod(TypeOrReference value);

  /**
   * Returns the value of the '<em><b>Func</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' attribute.
   * @see #setFunc(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getNamelessFunction_Func()
   * @model
   * @generated
   */
  boolean isFunc();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.NamelessFunction#isFunc <em>Func</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' attribute.
   * @see #isFunc()
   * @generated
   */
  void setFunc(boolean value);

  /**
   * Returns the value of the '<em><b>Functionvalue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functionvalue</em>' containment reference.
   * @see #setFunctionvalue(AssertionFunctionValue)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getNamelessFunction_Functionvalue()
   * @model containment="true"
   * @generated
   */
  AssertionFunctionValue getFunctionvalue();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.NamelessFunction#getFunctionvalue <em>Functionvalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functionvalue</em>' containment reference.
   * @see #getFunctionvalue()
   * @generated
   */
  void setFunctionvalue(AssertionFunctionValue value);

} // NamelessFunction