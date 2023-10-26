/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.30.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partial Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.PartialName#getRecord_id <em>Record id</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.PartialName#isLb <em>Lb</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.PartialName#getArray_index <em>Array index</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getPartialName()
 * @model
 * @generated
 */
public interface PartialName extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Record id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record id</em>' attribute.
   * @see #setRecord_id(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getPartialName_Record_id()
   * @model
   * @generated
   */
  String getRecord_id();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.PartialName#getRecord_id <em>Record id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record id</em>' attribute.
   * @see #getRecord_id()
   * @generated
   */
  void setRecord_id(String value);

  /**
   * Returns the value of the '<em><b>Lb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lb</em>' attribute.
   * @see #setLb(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getPartialName_Lb()
   * @model
   * @generated
   */
  boolean isLb();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.PartialName#isLb <em>Lb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lb</em>' attribute.
   * @see #isLb()
   * @generated
   */
  void setLb(boolean value);

  /**
   * Returns the value of the '<em><b>Array index</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.IndexExpressionOrRange}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array index</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getPartialName_Array_index()
   * @model containment="true"
   * @generated
   */
  EList<IndexExpressionOrRange> getArray_index();

} // PartialName
