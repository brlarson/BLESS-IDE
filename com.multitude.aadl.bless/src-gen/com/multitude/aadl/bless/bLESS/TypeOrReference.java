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
 * A representation of the model object '<em><b>Type Or Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.TypeOrReference#getTy <em>Ty</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.TypeOrReference#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getTypeOrReference()
 * @model
 * @generated
 */
public interface TypeOrReference extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Ty</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ty</em>' containment reference.
   * @see #setTy(Type)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getTypeOrReference_Ty()
   * @model containment="true"
   * @generated
   */
  Type getTy();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.TypeOrReference#getTy <em>Ty</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ty</em>' containment reference.
   * @see #getTy()
   * @generated
   */
  void setTy(Type value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(TypeDeclaration)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getTypeOrReference_Ref()
   * @model
   * @generated
   */
  TypeDeclaration getRef();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.TypeOrReference#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(TypeDeclaration value);

} // TypeOrReference
