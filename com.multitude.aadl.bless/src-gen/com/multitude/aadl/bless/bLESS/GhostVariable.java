/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ghost Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.GhostVariable#getTod <em>Tod</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getGhostVariable()
 * @model
 * @generated
 */
public interface GhostVariable extends EObject, NamedElement
{
  /**
   * Returns the value of the '<em><b>Tod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tod</em>' containment reference.
   * @see #setTod(TypeOrReference)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getGhostVariable_Tod()
   * @model containment="true"
   * @generated
   */
  TypeOrReference getTod();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.GhostVariable#getTod <em>Tod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tod</em>' containment reference.
   * @see #getTod()
   * @generated
   */
  void setTod(TypeOrReference value);

} // GhostVariable
