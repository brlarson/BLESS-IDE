/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.EnumerationType;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.EnumerationTypeImpl#getDefining_enumeration_literal <em>Defining enumeration literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationTypeImpl extends ElementImpl implements EnumerationType
{
  /**
   * The cached value of the '{@link #getDefining_enumeration_literal() <em>Defining enumeration literal</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefining_enumeration_literal()
   * @generated
   * @ordered
   */
  protected EList<String> defining_enumeration_literal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumerationTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BLESSPackage.eINSTANCE.getEnumerationType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getDefining_enumeration_literal()
  {
    if (defining_enumeration_literal == null)
    {
      defining_enumeration_literal = new EDataTypeEList<String>(String.class, this, BLESSPackage.ENUMERATION_TYPE__DEFINING_ENUMERATION_LITERAL);
    }
    return defining_enumeration_literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BLESSPackage.ENUMERATION_TYPE__DEFINING_ENUMERATION_LITERAL:
        return getDefining_enumeration_literal();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BLESSPackage.ENUMERATION_TYPE__DEFINING_ENUMERATION_LITERAL:
        getDefining_enumeration_literal().clear();
        getDefining_enumeration_literal().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BLESSPackage.ENUMERATION_TYPE__DEFINING_ENUMERATION_LITERAL:
        getDefining_enumeration_literal().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BLESSPackage.ENUMERATION_TYPE__DEFINING_ENUMERATION_LITERAL:
        return defining_enumeration_literal != null && !defining_enumeration_literal.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (defining_enumeration_literal: ");
    result.append(defining_enumeration_literal);
    result.append(')');
    return result.toString();
  }

} //EnumerationTypeImpl
