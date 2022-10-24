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
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Range#getLower_bound <em>Lower bound</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Range#getSym <em>Sym</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Range#getUpper_bound <em>Upper bound</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getRange()
 * @model
 * @generated
 */
public interface Range extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Lower bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower bound</em>' containment reference.
   * @see #setLower_bound(Subexpression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getRange_Lower_bound()
   * @model containment="true"
   * @generated
   */
  Subexpression getLower_bound();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Range#getLower_bound <em>Lower bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower bound</em>' containment reference.
   * @see #getLower_bound()
   * @generated
   */
  void setLower_bound(Subexpression value);

  /**
   * Returns the value of the '<em><b>Sym</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sym</em>' attribute.
   * @see #setSym(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getRange_Sym()
   * @model
   * @generated
   */
  String getSym();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Range#getSym <em>Sym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sym</em>' attribute.
   * @see #getSym()
   * @generated
   */
  void setSym(String value);

  /**
   * Returns the value of the '<em><b>Upper bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper bound</em>' containment reference.
   * @see #setUpper_bound(Subexpression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getRange_Upper_bound()
   * @model containment="true"
   * @generated
   */
  Subexpression getUpper_bound();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Range#getUpper_bound <em>Upper bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper bound</em>' containment reference.
   * @see #getUpper_bound()
   * @generated
   */
  void setUpper_bound(Subexpression value);

} // Range