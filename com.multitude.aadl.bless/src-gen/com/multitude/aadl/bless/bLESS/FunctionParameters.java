/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.FunctionParameters#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.FunctionParameters#isComma <em>Comma</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getFunctionParameters()
 * @model
 * @generated
 */
public interface FunctionParameters extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.FormalExpressionPair}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getFunctionParameters_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<FormalExpressionPair> getParameters();

  /**
   * Returns the value of the '<em><b>Comma</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comma</em>' attribute.
   * @see #setComma(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getFunctionParameters_Comma()
   * @model
   * @generated
   */
  boolean isComma();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.FunctionParameters#isComma <em>Comma</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comma</em>' attribute.
   * @see #isComma()
   * @generated
   */
  void setComma(boolean value);

} // FunctionParameters
