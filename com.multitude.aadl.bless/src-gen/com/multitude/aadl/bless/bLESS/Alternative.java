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
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Alternative#getGuard <em>Guard</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Alternative#getBlessalt <em>Blessalt</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.Alternative#getBaalt <em>Baalt</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getAlternative()
 * @model
 * @generated
 */
public interface Alternative extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(BooleanExpression)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getAlternative_Guard()
   * @model containment="true"
   * @generated
   */
  BooleanExpression getGuard();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Alternative#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(BooleanExpression value);

  /**
   * Returns the value of the '<em><b>Blessalt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blessalt</em>' containment reference.
   * @see #setBlessalt(BLESSAlternative)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getAlternative_Blessalt()
   * @model containment="true"
   * @generated
   */
  BLESSAlternative getBlessalt();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Alternative#getBlessalt <em>Blessalt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Blessalt</em>' containment reference.
   * @see #getBlessalt()
   * @generated
   */
  void setBlessalt(BLESSAlternative value);

  /**
   * Returns the value of the '<em><b>Baalt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Baalt</em>' containment reference.
   * @see #setBaalt(BAAlternative)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getAlternative_Baalt()
   * @model containment="true"
   * @generated
   */
  BAAlternative getBaalt();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.Alternative#getBaalt <em>Baalt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Baalt</em>' containment reference.
   * @see #getBaalt()
   * @generated
   */
  void setBaalt(BAAlternative value);

} // Alternative
