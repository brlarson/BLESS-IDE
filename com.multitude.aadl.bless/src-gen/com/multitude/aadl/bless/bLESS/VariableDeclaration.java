/**
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.33.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.VariableDeclaration#getVariable <em>Variable</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.VariableDeclaration#isNonvolatile <em>Nonvolatile</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.VariableDeclaration#isShared <em>Shared</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.VariableDeclaration#isConstant <em>Constant</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.VariableDeclaration#isSpread <em>Spread</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.VariableDeclaration#isFinal <em>Final</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.VariableDeclaration#isAssign <em>Assign</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.VariableDeclaration#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.VariableDeclaration#getAssertion <em>Assertion</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(Variable)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getVariableDeclaration_Variable()
   * @model containment="true"
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.VariableDeclaration#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

  /**
   * Returns the value of the '<em><b>Nonvolatile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nonvolatile</em>' attribute.
   * @see #setNonvolatile(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getVariableDeclaration_Nonvolatile()
   * @model
   * @generated
   */
  boolean isNonvolatile();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.VariableDeclaration#isNonvolatile <em>Nonvolatile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nonvolatile</em>' attribute.
   * @see #isNonvolatile()
   * @generated
   */
  void setNonvolatile(boolean value);

  /**
   * Returns the value of the '<em><b>Shared</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shared</em>' attribute.
   * @see #setShared(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getVariableDeclaration_Shared()
   * @model
   * @generated
   */
  boolean isShared();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.VariableDeclaration#isShared <em>Shared</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shared</em>' attribute.
   * @see #isShared()
   * @generated
   */
  void setShared(boolean value);

  /**
   * Returns the value of the '<em><b>Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' attribute.
   * @see #setConstant(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getVariableDeclaration_Constant()
   * @model
   * @generated
   */
  boolean isConstant();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.VariableDeclaration#isConstant <em>Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' attribute.
   * @see #isConstant()
   * @generated
   */
  void setConstant(boolean value);

  /**
   * Returns the value of the '<em><b>Spread</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spread</em>' attribute.
   * @see #setSpread(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getVariableDeclaration_Spread()
   * @model
   * @generated
   */
  boolean isSpread();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.VariableDeclaration#isSpread <em>Spread</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spread</em>' attribute.
   * @see #isSpread()
   * @generated
   */
  void setSpread(boolean value);

  /**
   * Returns the value of the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Final</em>' attribute.
   * @see #setFinal(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getVariableDeclaration_Final()
   * @model
   * @generated
   */
  boolean isFinal();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.VariableDeclaration#isFinal <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Final</em>' attribute.
   * @see #isFinal()
   * @generated
   */
  void setFinal(boolean value);

  /**
   * Returns the value of the '<em><b>Assign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assign</em>' attribute.
   * @see #setAssign(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getVariableDeclaration_Assign()
   * @model
   * @generated
   */
  boolean isAssign();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.VariableDeclaration#isAssign <em>Assign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assign</em>' attribute.
   * @see #isAssign()
   * @generated
   */
  void setAssign(boolean value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getVariableDeclaration_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.VariableDeclaration#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Assertion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assertion</em>' containment reference.
   * @see #setAssertion(Assertion)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getVariableDeclaration_Assertion()
   * @model containment="true"
   * @generated
   */
  Assertion getAssertion();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.VariableDeclaration#getAssertion <em>Assertion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assertion</em>' containment reference.
   * @see #getAssertion()
   * @generated
   */
  void setAssertion(Assertion value);

} // VariableDeclaration
