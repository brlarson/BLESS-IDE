/**
 * (C) Multitude Corporation 2021
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ArrayType#getArray_ranges <em>Array ranges</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ArrayType#getTyp <em>Typ</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends Element, Type
{
  /**
   * Returns the value of the '<em><b>Array ranges</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array ranges</em>' containment reference.
   * @see #setArray_ranges(ArrayRangeList)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getArrayType_Array_ranges()
   * @model containment="true"
   * @generated
   */
  ArrayRangeList getArray_ranges();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ArrayType#getArray_ranges <em>Array ranges</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array ranges</em>' containment reference.
   * @see #getArray_ranges()
   * @generated
   */
  void setArray_ranges(ArrayRangeList value);

  /**
   * Returns the value of the '<em><b>Typ</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typ</em>' containment reference.
   * @see #setTyp(TypeOrReference)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getArrayType_Typ()
   * @model containment="true"
   * @generated
   */
  TypeOrReference getTyp();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ArrayType#getTyp <em>Typ</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typ</em>' containment reference.
   * @see #getTyp()
   * @generated
   */
  void setTyp(TypeOrReference value);

} // ArrayType
