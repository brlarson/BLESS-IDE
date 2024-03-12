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
 * A representation of the model object '<em><b>Event Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.EventTrigger#getSub <em>Sub</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.EventTrigger#getIndex <em>Index</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.EventTrigger#getTle <em>Tle</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getEventTrigger()
 * @model
 * @generated
 */
public interface EventTrigger extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Sub</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub</em>' attribute list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getEventTrigger_Sub()
   * @model unique="false"
   * @generated
   */
  EList<String> getSub();

  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getEventTrigger_Index()
   * @model
   * @generated
   */
  String getIndex();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.EventTrigger#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(String value);

  /**
   * Returns the value of the '<em><b>Tle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tle</em>' containment reference.
   * @see #setTle(TriggerLogicalExpression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getEventTrigger_Tle()
   * @model containment="true"
   * @generated
   */
  TriggerLogicalExpression getTle();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.EventTrigger#getTle <em>Tle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tle</em>' containment reference.
   * @see #getTle()
   * @generated
   */
  void setTle(TriggerLogicalExpression value);

} // EventTrigger
