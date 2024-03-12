/**
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.30.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;
import org.osate.aadl2.Mode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.BasicAction#getSkip <em>Skip</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.BasicAction#getAssign <em>Assign</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.BasicAction#getMode <em>Mode</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.BasicAction#getWhen <em>When</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.BasicAction#getComb <em>Comb</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.BasicAction#getCommunication <em>Communication</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.BasicAction#getComputation <em>Computation</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.BasicAction#getMulti_assign <em>Multi assign</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.BasicAction#getExc <em>Exc</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getBasicAction()
 * @model
 * @generated
 */
public interface BasicAction extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Skip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Skip</em>' attribute.
   * @see #setSkip(String)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getBasicAction_Skip()
   * @model
   * @generated
   */
  String getSkip();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.BasicAction#getSkip <em>Skip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Skip</em>' attribute.
   * @see #getSkip()
   * @generated
   */
  void setSkip(String value);

  /**
   * Returns the value of the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assign</em>' containment reference.
   * @see #setAssign(Assignment)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getBasicAction_Assign()
   * @model containment="true"
   * @generated
   */
  Assignment getAssign();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.BasicAction#getAssign <em>Assign</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assign</em>' containment reference.
   * @see #getAssign()
   * @generated
   */
  void setAssign(Assignment value);

  /**
   * Returns the value of the '<em><b>Mode</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mode</em>' reference.
   * @see #setMode(Mode)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getBasicAction_Mode()
   * @model
   * @generated
   */
  Mode getMode();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.BasicAction#getMode <em>Mode</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' reference.
   * @see #getMode()
   * @generated
   */
  void setMode(Mode value);

  /**
   * Returns the value of the '<em><b>When</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>When</em>' containment reference.
   * @see #setWhen(WhenThrow)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getBasicAction_When()
   * @model containment="true"
   * @generated
   */
  WhenThrow getWhen();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.BasicAction#getWhen <em>When</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When</em>' containment reference.
   * @see #getWhen()
   * @generated
   */
  void setWhen(WhenThrow value);

  /**
   * Returns the value of the '<em><b>Comb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comb</em>' containment reference.
   * @see #setComb(CombinableOperation)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getBasicAction_Comb()
   * @model containment="true"
   * @generated
   */
  CombinableOperation getComb();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.BasicAction#getComb <em>Comb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comb</em>' containment reference.
   * @see #getComb()
   * @generated
   */
  void setComb(CombinableOperation value);

  /**
   * Returns the value of the '<em><b>Communication</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Communication</em>' containment reference.
   * @see #setCommunication(CommunicationAction)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getBasicAction_Communication()
   * @model containment="true"
   * @generated
   */
  CommunicationAction getCommunication();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.BasicAction#getCommunication <em>Communication</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Communication</em>' containment reference.
   * @see #getCommunication()
   * @generated
   */
  void setCommunication(CommunicationAction value);

  /**
   * Returns the value of the '<em><b>Computation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Computation</em>' containment reference.
   * @see #setComputation(Computation)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getBasicAction_Computation()
   * @model containment="true"
   * @generated
   */
  Computation getComputation();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.BasicAction#getComputation <em>Computation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Computation</em>' containment reference.
   * @see #getComputation()
   * @generated
   */
  void setComputation(Computation value);

  /**
   * Returns the value of the '<em><b>Multi assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multi assign</em>' containment reference.
   * @see #setMulti_assign(SimultaneousAssignment)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getBasicAction_Multi_assign()
   * @model containment="true"
   * @generated
   */
  SimultaneousAssignment getMulti_assign();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.BasicAction#getMulti_assign <em>Multi assign</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multi assign</em>' containment reference.
   * @see #getMulti_assign()
   * @generated
   */
  void setMulti_assign(SimultaneousAssignment value);

  /**
   * Returns the value of the '<em><b>Exc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exc</em>' containment reference.
   * @see #setExc(IssueException)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getBasicAction_Exc()
   * @model containment="true"
   * @generated
   */
  IssueException getExc();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.BasicAction#getExc <em>Exc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exc</em>' containment reference.
   * @see #getExc()
   * @generated
   */
  void setExc(IssueException value);

} // BasicAction
