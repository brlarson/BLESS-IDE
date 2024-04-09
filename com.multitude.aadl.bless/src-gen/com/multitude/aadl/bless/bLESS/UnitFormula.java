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
 * A representation of the model object '<em><b>Unit Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.UnitFormula#getTop <em>Top</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.UnitFormula#isSlash <em>Slash</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.UnitFormula#getBottom <em>Bottom</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getUnitFormula()
 * @model
 * @generated
 */
public interface UnitFormula extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Top</b></em>' reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.UnitName}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Top</em>' reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getUnitFormula_Top()
   * @model
   * @generated
   */
  EList<UnitName> getTop();

  /**
   * Returns the value of the '<em><b>Slash</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Slash</em>' attribute.
   * @see #setSlash(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getUnitFormula_Slash()
   * @model
   * @generated
   */
  boolean isSlash();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.UnitFormula#isSlash <em>Slash</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Slash</em>' attribute.
   * @see #isSlash()
   * @generated
   */
  void setSlash(boolean value);

  /**
   * Returns the value of the '<em><b>Bottom</b></em>' reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.UnitName}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bottom</em>' reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getUnitFormula_Bottom()
   * @model
   * @generated
   */
  EList<UnitName> getBottom();

} // UnitFormula
