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
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Constant#getNumeric_constant <em>Numeric constant</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Constant#getString_literal <em>String literal</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Constant#getT <em>T</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Constant#getF <em>F</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Constant#getNul <em>Nul</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Numeric constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numeric constant</em>' containment reference.
   * @see #setNumeric_constant(Quantity)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getConstant_Numeric_constant()
   * @model containment="true"
   * @generated
   */
  Quantity getNumeric_constant();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Constant#getNumeric_constant <em>Numeric constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Numeric constant</em>' containment reference.
   * @see #getNumeric_constant()
   * @generated
   */
  void setNumeric_constant(Quantity value);

  /**
   * Returns the value of the '<em><b>String literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>String literal</em>' attribute.
   * @see #setString_literal(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getConstant_String_literal()
   * @model
   * @generated
   */
  String getString_literal();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Constant#getString_literal <em>String literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String literal</em>' attribute.
   * @see #getString_literal()
   * @generated
   */
  void setString_literal(String value);

  /**
   * Returns the value of the '<em><b>T</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' attribute.
   * @see #setT(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getConstant_T()
   * @model
   * @generated
   */
  String getT();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Constant#getT <em>T</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' attribute.
   * @see #getT()
   * @generated
   */
  void setT(String value);

  /**
   * Returns the value of the '<em><b>F</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>F</em>' attribute.
   * @see #setF(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getConstant_F()
   * @model
   * @generated
   */
  String getF();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Constant#getF <em>F</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F</em>' attribute.
   * @see #getF()
   * @generated
   */
  void setF(String value);

  /**
   * Returns the value of the '<em><b>Nul</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nul</em>' attribute.
   * @see #setNul(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getConstant_Nul()
   * @model
   * @generated
   */
  String getNul();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Constant#getNul <em>Nul</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nul</em>' attribute.
   * @see #getNul()
   * @generated
   */
  void setNul(String value);

} // Constant