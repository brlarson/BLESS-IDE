/**
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.33.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.UnitExtension#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getUnitExtension()
 * @model
 * @generated
 */
public interface UnitExtension extends UnitDeclaration
{
  /**
   * Returns the value of the '<em><b>Root</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' reference.
   * @see #setRoot(UnitName)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getUnitExtension_Root()
   * @model
   * @generated
   */
  UnitName getRoot();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.UnitExtension#getRoot <em>Root</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' reference.
   * @see #getRoot()
   * @generated
   */
  void setRoot(UnitName value);

} // UnitExtension
