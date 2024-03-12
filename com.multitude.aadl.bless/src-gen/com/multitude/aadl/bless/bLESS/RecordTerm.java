/**
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.30.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.RecordTerm#getRecord_type <em>Record type</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.RecordTerm#getRecord_value <em>Record value</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getRecordTerm()
 * @model
 * @generated
 */
public interface RecordTerm extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Record type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record type</em>' reference.
   * @see #setRecord_type(TypeDeclaration)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getRecordTerm_Record_type()
   * @model
   * @generated
   */
  TypeDeclaration getRecord_type();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.RecordTerm#getRecord_type <em>Record type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record type</em>' reference.
   * @see #getRecord_type()
   * @generated
   */
  void setRecord_type(TypeDeclaration value);

  /**
   * Returns the value of the '<em><b>Record value</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.RecordValue}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record value</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getRecordTerm_Record_value()
   * @model containment="true"
   * @generated
   */
  EList<RecordValue> getRecord_value();

} // RecordTerm
