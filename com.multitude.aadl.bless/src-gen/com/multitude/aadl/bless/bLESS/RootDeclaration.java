/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.RootDeclaration#isBase <em>Base</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.RootDeclaration#getFormula <em>Formula</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.RootDeclaration#getKindWords <em>Kind Words</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.RootDeclaration#getUnitName <em>Unit Name</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getRootDeclaration()
 * @model
 * @generated
 */
public interface RootDeclaration extends UnitDeclaration
{
  /**
   * Returns the value of the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' attribute.
   * @see #setBase(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getRootDeclaration_Base()
   * @model
   * @generated
   */
  boolean isBase();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.RootDeclaration#isBase <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' attribute.
   * @see #isBase()
   * @generated
   */
  void setBase(boolean value);

  /**
   * Returns the value of the '<em><b>Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formula</em>' containment reference.
   * @see #setFormula(UnitFormula)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getRootDeclaration_Formula()
   * @model containment="true"
   * @generated
   */
  UnitFormula getFormula();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.RootDeclaration#getFormula <em>Formula</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formula</em>' containment reference.
   * @see #getFormula()
   * @generated
   */
  void setFormula(UnitFormula value);

  /**
   * Returns the value of the '<em><b>Kind Words</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind Words</em>' attribute list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getRootDeclaration_KindWords()
   * @model unique="false"
   * @generated
   */
  EList<String> getKindWords();

  /**
   * Returns the value of the '<em><b>Unit Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit Name</em>' containment reference.
   * @see #setUnitName(UnitName)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getRootDeclaration_UnitName()
   * @model containment="true"
   * @generated
   */
  UnitName getUnitName();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.RootDeclaration#getUnitName <em>Unit Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit Name</em>' containment reference.
   * @see #getUnitName()
   * @generated
   */
  void setUnitName(UnitName value);

} // RootDeclaration
