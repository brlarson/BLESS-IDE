/**
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.33.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simultaneous Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.SimultaneousAssignment#getLhs <em>Lhs</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.SimultaneousAssignment#getAsgn <em>Asgn</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.SimultaneousAssignment#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getSimultaneousAssignment()
 * @model
 * @generated
 */
public interface SimultaneousAssignment extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.NameTick}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getSimultaneousAssignment_Lhs()
   * @model containment="true"
   * @generated
   */
  EList<NameTick> getLhs();

  /**
   * Returns the value of the '<em><b>Asgn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asgn</em>' attribute.
   * @see #setAsgn(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getSimultaneousAssignment_Asgn()
   * @model
   * @generated
   */
  String getAsgn();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.SimultaneousAssignment#getAsgn <em>Asgn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asgn</em>' attribute.
   * @see #getAsgn()
   * @generated
   */
  void setAsgn(String value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.ExpressionOrAny}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getSimultaneousAssignment_Rhs()
   * @model containment="true"
   * @generated
   */
  EList<ExpressionOrAny> getRhs();

} // SimultaneousAssignment
