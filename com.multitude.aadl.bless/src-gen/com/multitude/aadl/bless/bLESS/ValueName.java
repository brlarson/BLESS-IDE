/**
 * (C) Multitude Corporation 2021
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;
import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ValueName#getId <em>Id</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ValueName#isLp <em>Lp</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ValueName#getPr <em>Pr</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ValueName#isLb <em>Lb</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ValueName#getArray_index <em>Array index</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ValueName#isDot <em>Dot</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ValueName#getPn <em>Pn</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ValueName#isQ <em>Q</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ValueName#isFresh <em>Fresh</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ValueName#isCount <em>Count</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.ValueName#isUpdated <em>Updated</em>}</li>
 * </ul>
 *
 * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getValueName()
 * @model
 * @generated
 */
public interface ValueName extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' reference.
   * @see #setId(NamedElement)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getValueName_Id()
   * @model
   * @generated
   */
  NamedElement getId();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ValueName#getId <em>Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' reference.
   * @see #getId()
   * @generated
   */
  void setId(NamedElement value);

  /**
   * Returns the value of the '<em><b>Lp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lp</em>' attribute.
   * @see #setLp(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getValueName_Lp()
   * @model
   * @generated
   */
  boolean isLp();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ValueName#isLp <em>Lp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lp</em>' attribute.
   * @see #isLp()
   * @generated
   */
  void setLp(boolean value);

  /**
   * Returns the value of the '<em><b>Pr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pr</em>' containment reference.
   * @see #setPr(FunctionParameters)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getValueName_Pr()
   * @model containment="true"
   * @generated
   */
  FunctionParameters getPr();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ValueName#getPr <em>Pr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pr</em>' containment reference.
   * @see #getPr()
   * @generated
   */
  void setPr(FunctionParameters value);

  /**
   * Returns the value of the '<em><b>Lb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lb</em>' attribute.
   * @see #setLb(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getValueName_Lb()
   * @model
   * @generated
   */
  boolean isLb();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ValueName#isLb <em>Lb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lb</em>' attribute.
   * @see #isLb()
   * @generated
   */
  void setLb(boolean value);

  /**
   * Returns the value of the '<em><b>Array index</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.IndexExpressionOrRange}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array index</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getValueName_Array_index()
   * @model containment="true"
   * @generated
   */
  EList<IndexExpressionOrRange> getArray_index();

  /**
   * Returns the value of the '<em><b>Dot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dot</em>' attribute.
   * @see #setDot(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getValueName_Dot()
   * @model
   * @generated
   */
  boolean isDot();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ValueName#isDot <em>Dot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dot</em>' attribute.
   * @see #isDot()
   * @generated
   */
  void setDot(boolean value);

  /**
   * Returns the value of the '<em><b>Pn</b></em>' containment reference list.
   * The list contents are of type {@link com.multitude.aadl.bless.bLESS.PartialName}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pn</em>' containment reference list.
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getValueName_Pn()
   * @model containment="true"
   * @generated
   */
  EList<PartialName> getPn();

  /**
   * Returns the value of the '<em><b>Q</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Q</em>' attribute.
   * @see #setQ(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getValueName_Q()
   * @model
   * @generated
   */
  boolean isQ();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ValueName#isQ <em>Q</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Q</em>' attribute.
   * @see #isQ()
   * @generated
   */
  void setQ(boolean value);

  /**
   * Returns the value of the '<em><b>Fresh</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fresh</em>' attribute.
   * @see #setFresh(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getValueName_Fresh()
   * @model
   * @generated
   */
  boolean isFresh();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ValueName#isFresh <em>Fresh</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fresh</em>' attribute.
   * @see #isFresh()
   * @generated
   */
  void setFresh(boolean value);

  /**
   * Returns the value of the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Count</em>' attribute.
   * @see #setCount(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getValueName_Count()
   * @model
   * @generated
   */
  boolean isCount();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ValueName#isCount <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Count</em>' attribute.
   * @see #isCount()
   * @generated
   */
  void setCount(boolean value);

  /**
   * Returns the value of the '<em><b>Updated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Updated</em>' attribute.
   * @see #setUpdated(boolean)
   * @see com.multitude.aadl.bless.bLESS.BLESSPackage#getValueName_Updated()
   * @model
   * @generated
   */
  boolean isUpdated();

  /**
   * Sets the value of the '{@link com.multitude.aadl.bless.bLESS.ValueName#isUpdated <em>Updated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Updated</em>' attribute.
   * @see #isUpdated()
   * @generated
   */
  void setUpdated(boolean value);

} // ValueName