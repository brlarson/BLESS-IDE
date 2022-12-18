/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.IndexExpression#getL <em>L</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.IndexExpression#getSym <em>Sym</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.IndexExpression#getR <em>R</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getIndexExpression()
 * @model
 * @generated
 */
public interface IndexExpression extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' containment reference.
   * @see #setL(PeriodShift)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getIndexExpression_L()
   * @model containment="true"
   * @generated
   */
  PeriodShift getL();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.IndexExpression#getL <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' containment reference.
   * @see #getL()
   * @generated
   */
  void setL(PeriodShift value);

  /**
   * Returns the value of the '<em><b>Sym</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sym</em>' attribute.
   * @see #setSym(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getIndexExpression_Sym()
   * @model
   * @generated
   */
  String getSym();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.IndexExpression#getSym <em>Sym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sym</em>' attribute.
   * @see #getSym()
   * @generated
   */
  void setSym(String value);

  /**
   * Returns the value of the '<em><b>R</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.PeriodShift}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>R</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getIndexExpression_R()
   * @model containment="true"
   * @generated
   */
  EList<PeriodShift> getR();

} // IndexExpression
