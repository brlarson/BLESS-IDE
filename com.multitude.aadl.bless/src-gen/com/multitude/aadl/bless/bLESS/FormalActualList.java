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
 * A representation of the model object '<em><b>Formal Actual List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.FormalActualList#getVariables <em>Variables</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.FormalActualList#isComma <em>Comma</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getFormalActualList()
 * @model
 * @generated
 */
public interface FormalActualList extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.FormalActual}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getFormalActualList_Variables()
   * @model containment="true"
   * @generated
   */
  EList<FormalActual> getVariables();

  /**
   * Returns the value of the '<em><b>Comma</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comma</em>' attribute.
   * @see #setComma(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getFormalActualList_Comma()
   * @model
   * @generated
   */
  boolean isComma();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.FormalActualList#isComma <em>Comma</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comma</em>' attribute.
   * @see #isComma()
   * @generated
   */
  void setComma(boolean value);

} // FormalActualList
