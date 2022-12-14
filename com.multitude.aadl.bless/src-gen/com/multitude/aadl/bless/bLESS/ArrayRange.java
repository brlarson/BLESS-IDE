/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ArrayRange#getLb <em>Lb</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ArrayRange#getUb <em>Ub</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getArrayRange()
 * @model
 * @generated
 */
public interface ArrayRange extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Lb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lb</em>' containment reference.
   * @see #setLb(ANumber)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getArrayRange_Lb()
   * @model containment="true"
   * @generated
   */
  ANumber getLb();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ArrayRange#getLb <em>Lb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lb</em>' containment reference.
   * @see #getLb()
   * @generated
   */
  void setLb(ANumber value);

  /**
   * Returns the value of the '<em><b>Ub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ub</em>' containment reference.
   * @see #setUb(ANumber)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getArrayRange_Ub()
   * @model containment="true"
   * @generated
   */
  ANumber getUb();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ArrayRange#getUb <em>Ub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ub</em>' containment reference.
   * @see #getUb()
   * @generated
   */
  void setUb(ANumber value);

} // ArrayRange
