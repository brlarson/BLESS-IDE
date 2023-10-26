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
 * A representation of the model object '<em><b>Dispatch Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.DispatchExpression#getDc <em>Dc</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.DispatchExpression#isOr <em>Or</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.DispatchExpression#getSubprogramaccessdispatch <em>Subprogramaccessdispatch</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getDispatchExpression()
 * @model
 * @generated
 */
public interface DispatchExpression extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Dc</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.DispatchConjunction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dc</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getDispatchExpression_Dc()
   * @model containment="true"
   * @generated
   */
  EList<DispatchConjunction> getDc();

  /**
   * Returns the value of the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Or</em>' attribute.
   * @see #setOr(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getDispatchExpression_Or()
   * @model
   * @generated
   */
  boolean isOr();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.DispatchExpression#isOr <em>Or</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Or</em>' attribute.
   * @see #isOr()
   * @generated
   */
  void setOr(boolean value);

  /**
   * Returns the value of the '<em><b>Subprogramaccessdispatch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subprogramaccessdispatch</em>' containment reference.
   * @see #setSubprogramaccessdispatch(SubprogramAccessDispatch)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getDispatchExpression_Subprogramaccessdispatch()
   * @model containment="true"
   * @generated
   */
  SubprogramAccessDispatch getSubprogramaccessdispatch();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.DispatchExpression#getSubprogramaccessdispatch <em>Subprogramaccessdispatch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subprogramaccessdispatch</em>' containment reference.
   * @see #getSubprogramaccessdispatch()
   * @generated
   */
  void setSubprogramaccessdispatch(SubprogramAccessDispatch value);

} // DispatchExpression
