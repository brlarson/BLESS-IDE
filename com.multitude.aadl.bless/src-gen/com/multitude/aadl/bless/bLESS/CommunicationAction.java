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
 * A representation of the model object '<em><b>Communication Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.CommunicationAction#getPc <em>Pc</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.CommunicationAction#getPo <em>Po</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.CommunicationAction#getPi <em>Pi</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.CommunicationAction#getFp <em>Fp</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.CommunicationAction#getPause <em>Pause</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getCommunicationAction()
 * @model
 * @generated
 */
public interface CommunicationAction extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Pc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pc</em>' containment reference.
   * @see #setPc(SubprogramCall)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getCommunicationAction_Pc()
   * @model containment="true"
   * @generated
   */
  SubprogramCall getPc();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.CommunicationAction#getPc <em>Pc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pc</em>' containment reference.
   * @see #getPc()
   * @generated
   */
  void setPc(SubprogramCall value);

  /**
   * Returns the value of the '<em><b>Po</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Po</em>' containment reference.
   * @see #setPo(PortOutput)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getCommunicationAction_Po()
   * @model containment="true"
   * @generated
   */
  PortOutput getPo();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.CommunicationAction#getPo <em>Po</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Po</em>' containment reference.
   * @see #getPo()
   * @generated
   */
  void setPo(PortOutput value);

  /**
   * Returns the value of the '<em><b>Pi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pi</em>' containment reference.
   * @see #setPi(PortInput)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getCommunicationAction_Pi()
   * @model containment="true"
   * @generated
   */
  PortInput getPi();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.CommunicationAction#getPi <em>Pi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pi</em>' containment reference.
   * @see #getPi()
   * @generated
   */
  void setPi(PortInput value);

  /**
   * Returns the value of the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fp</em>' containment reference.
   * @see #setFp(FreezePort)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getCommunicationAction_Fp()
   * @model containment="true"
   * @generated
   */
  FreezePort getFp();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.CommunicationAction#getFp <em>Fp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fp</em>' containment reference.
   * @see #getFp()
   * @generated
   */
  void setFp(FreezePort value);

  /**
   * Returns the value of the '<em><b>Pause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pause</em>' containment reference.
   * @see #setPause(Pause)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getCommunicationAction_Pause()
   * @model containment="true"
   * @generated
   */
  Pause getPause();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.CommunicationAction#getPause <em>Pause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pause</em>' containment reference.
   * @see #getPause()
   * @generated
   */
  void setPause(Pause value);

} // CommunicationAction
