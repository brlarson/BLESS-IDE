/**
 * (C) Multitude Corporation 2021
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.UnitDeclaration#getFactors <em>Factors</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getUnitDeclaration()
 * @model
 * @generated
 */
public interface UnitDeclaration extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Factors</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.UnitFactor}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factors</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getUnitDeclaration_Factors()
   * @model containment="true"
   * @generated
   */
  EList<UnitFactor> getFactors();

} // UnitDeclaration