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
 * A representation of the model object '<em><b>Record Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.RecordValue#getLabel <em>Label</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.RecordValue#getAval <em>Aval</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getRecordValue()
 * @model
 * @generated
 */
public interface RecordValue extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getRecordValue_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.RecordValue#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Aval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aval</em>' containment reference.
   * @see #setAval(Value)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getRecordValue_Aval()
   * @model containment="true"
   * @generated
   */
  Value getAval();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.RecordValue#getAval <em>Aval</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aval</em>' containment reference.
   * @see #getAval()
   * @generated
   */
  void setAval(Value value);

} // RecordValue