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
 * A representation of the model object '<em><b>Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Quantity#getNumber <em>Number</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Quantity#getUnit <em>Unit</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Quantity#isScalar <em>Scalar</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Quantity#isWhole <em>Whole</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getQuantity()
 * @model
 * @generated
 */
public interface Quantity extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' containment reference.
   * @see #setNumber(ANumber)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getQuantity_Number()
   * @model containment="true"
   * @generated
   */
  ANumber getNumber();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Quantity#getNumber <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' containment reference.
   * @see #getNumber()
   * @generated
   */
  void setNumber(ANumber value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' reference.
   * @see #setUnit(UnitName)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getQuantity_Unit()
   * @model
   * @generated
   */
  UnitName getUnit();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Quantity#getUnit <em>Unit</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' reference.
   * @see #getUnit()
   * @generated
   */
  void setUnit(UnitName value);

  /**
   * Returns the value of the '<em><b>Scalar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scalar</em>' attribute.
   * @see #setScalar(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getQuantity_Scalar()
   * @model
   * @generated
   */
  boolean isScalar();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Quantity#isScalar <em>Scalar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scalar</em>' attribute.
   * @see #isScalar()
   * @generated
   */
  void setScalar(boolean value);

  /**
   * Returns the value of the '<em><b>Whole</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Whole</em>' attribute.
   * @see #setWhole(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getQuantity_Whole()
   * @model
   * @generated
   */
  boolean isWhole();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Quantity#isWhole <em>Whole</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Whole</em>' attribute.
   * @see #isWhole()
   * @generated
   */
  void setWhole(boolean value);

} // Quantity
