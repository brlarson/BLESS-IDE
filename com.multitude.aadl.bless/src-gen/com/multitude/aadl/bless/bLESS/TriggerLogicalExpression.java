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
 * A representation of the model object '<em><b>Trigger Logical Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.TriggerLogicalExpression#getFirst <em>First</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.TriggerLogicalExpression#getOp <em>Op</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.TriggerLogicalExpression#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.TriggerLogicalExpression#getOps <em>Ops</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getTriggerLogicalExpression()
 * @model
 * @generated
 */
public interface TriggerLogicalExpression extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>First</em>' containment reference.
   * @see #setFirst(EventTrigger)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getTriggerLogicalExpression_First()
   * @model containment="true"
   * @generated
   */
  EventTrigger getFirst();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.TriggerLogicalExpression#getFirst <em>First</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First</em>' containment reference.
   * @see #getFirst()
   * @generated
   */
  void setFirst(EventTrigger value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' containment reference.
   * @see #setOp(LogicalOperator)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getTriggerLogicalExpression_Op()
   * @model containment="true"
   * @generated
   */
  LogicalOperator getOp();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.TriggerLogicalExpression#getOp <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' containment reference.
   * @see #getOp()
   * @generated
   */
  void setOp(LogicalOperator value);

  /**
   * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.EventTrigger}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getTriggerLogicalExpression_Trigger()
   * @model containment="true"
   * @generated
   */
  EList<EventTrigger> getTrigger();

  /**
   * Returns the value of the '<em><b>Ops</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.LogicalOperator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ops</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getTriggerLogicalExpression_Ops()
   * @model containment="true"
   * @generated
   */
  EList<LogicalOperator> getOps();

} // TriggerLogicalExpression
