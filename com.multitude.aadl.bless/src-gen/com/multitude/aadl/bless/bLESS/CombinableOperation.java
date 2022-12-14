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
 * A representation of the model object '<em><b>Combinable Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.CombinableOperation#isF_add <em>Fadd</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.CombinableOperation#getTarget <em>Target</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.CombinableOperation#getArithmetic <em>Arithmetic</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.CombinableOperation#getResult <em>Result</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.CombinableOperation#isF_or <em>For</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.CombinableOperation#isF_and <em>Fand</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.CombinableOperation#isF_xor <em>Fxor</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.CombinableOperation#getBool <em>Bool</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.CombinableOperation#isSw <em>Sw</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.CombinableOperation#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getCombinableOperation()
 * @model
 * @generated
 */
public interface CombinableOperation extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Fadd</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fadd</em>' attribute.
   * @see #setF_add(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getCombinableOperation_F_add()
   * @model
   * @generated
   */
  boolean isF_add();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.CombinableOperation#isF_add <em>Fadd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fadd</em>' attribute.
   * @see #isF_add()
   * @generated
   */
  void setF_add(boolean value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Variable)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getCombinableOperation_Target()
   * @model
   * @generated
   */
  Variable getTarget();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.CombinableOperation#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Variable value);

  /**
   * Returns the value of the '<em><b>Arithmetic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arithmetic</em>' containment reference.
   * @see #setArithmetic(Expression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getCombinableOperation_Arithmetic()
   * @model containment="true"
   * @generated
   */
  Expression getArithmetic();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.CombinableOperation#getArithmetic <em>Arithmetic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arithmetic</em>' containment reference.
   * @see #getArithmetic()
   * @generated
   */
  void setArithmetic(Expression value);

  /**
   * Returns the value of the '<em><b>Result</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result</em>' reference.
   * @see #setResult(Variable)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getCombinableOperation_Result()
   * @model
   * @generated
   */
  Variable getResult();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.CombinableOperation#getResult <em>Result</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' reference.
   * @see #getResult()
   * @generated
   */
  void setResult(Variable value);

  /**
   * Returns the value of the '<em><b>For</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>For</em>' attribute.
   * @see #setF_or(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getCombinableOperation_F_or()
   * @model
   * @generated
   */
  boolean isF_or();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.CombinableOperation#isF_or <em>For</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For</em>' attribute.
   * @see #isF_or()
   * @generated
   */
  void setF_or(boolean value);

  /**
   * Returns the value of the '<em><b>Fand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fand</em>' attribute.
   * @see #setF_and(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getCombinableOperation_F_and()
   * @model
   * @generated
   */
  boolean isF_and();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.CombinableOperation#isF_and <em>Fand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fand</em>' attribute.
   * @see #isF_and()
   * @generated
   */
  void setF_and(boolean value);

  /**
   * Returns the value of the '<em><b>Fxor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fxor</em>' attribute.
   * @see #setF_xor(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getCombinableOperation_F_xor()
   * @model
   * @generated
   */
  boolean isF_xor();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.CombinableOperation#isF_xor <em>Fxor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fxor</em>' attribute.
   * @see #isF_xor()
   * @generated
   */
  void setF_xor(boolean value);

  /**
   * Returns the value of the '<em><b>Bool</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool</em>' containment reference.
   * @see #setBool(Expression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getCombinableOperation_Bool()
   * @model containment="true"
   * @generated
   */
  Expression getBool();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.CombinableOperation#getBool <em>Bool</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool</em>' containment reference.
   * @see #getBool()
   * @generated
   */
  void setBool(Expression value);

  /**
   * Returns the value of the '<em><b>Sw</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sw</em>' attribute.
   * @see #setSw(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getCombinableOperation_Sw()
   * @model
   * @generated
   */
  boolean isSw();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.CombinableOperation#isSw <em>Sw</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sw</em>' attribute.
   * @see #isSw()
   * @generated
   */
  void setSw(boolean value);

  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(Variable)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getCombinableOperation_Reference()
   * @model
   * @generated
   */
  Variable getReference();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.CombinableOperation#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(Variable value);

} // CombinableOperation
