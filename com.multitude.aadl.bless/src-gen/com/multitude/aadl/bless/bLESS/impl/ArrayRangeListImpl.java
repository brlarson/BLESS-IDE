/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.ArrayRange;
import com.multitude.aadl.bless.bLESS.ArrayRangeList;
import com.multitude.aadl.bless.bLESS.BLESSPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Range List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ArrayRangeListImpl#getRange <em>Range</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ArrayRangeListImpl#isComma <em>Comma</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayRangeListImpl extends ElementImpl implements ArrayRangeList
{
  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected EList<ArrayRange> range;

  /**
   * The default value of the '{@link #isComma() <em>Comma</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isComma()
   * @generated
   * @ordered
   */
  protected static final boolean COMMA_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isComma() <em>Comma</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isComma()
   * @generated
   * @ordered
   */
  protected boolean comma = COMMA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayRangeListImpl()
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
    return BLESSPackage.eINSTANCE.getArrayRangeList();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ArrayRange> getRange()
  {
    if (range == null)
    {
      range = new EObjectContainmentEList<ArrayRange>(ArrayRange.class, this, BLESSPackage.ARRAY_RANGE_LIST__RANGE);
    }
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isComma()
  {
    return comma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setComma(boolean newComma)
  {
    boolean oldComma = comma;
    comma = newComma;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ARRAY_RANGE_LIST__COMMA, oldComma, comma));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BLESSPackage.ARRAY_RANGE_LIST__RANGE:
        return ((InternalEList<?>)getRange()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case BLESSPackage.ARRAY_RANGE_LIST__RANGE:
        return getRange();
      case BLESSPackage.ARRAY_RANGE_LIST__COMMA:
        return isComma();
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
      case BLESSPackage.ARRAY_RANGE_LIST__RANGE:
        getRange().clear();
        getRange().addAll((Collection<? extends ArrayRange>)newValue);
        return;
      case BLESSPackage.ARRAY_RANGE_LIST__COMMA:
        setComma((Boolean)newValue);
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
      case BLESSPackage.ARRAY_RANGE_LIST__RANGE:
        getRange().clear();
        return;
      case BLESSPackage.ARRAY_RANGE_LIST__COMMA:
        setComma(COMMA_EDEFAULT);
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
      case BLESSPackage.ARRAY_RANGE_LIST__RANGE:
        return range != null && !range.isEmpty();
      case BLESSPackage.ARRAY_RANGE_LIST__COMMA:
        return comma != COMMA_EDEFAULT;
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
    result.append(" (comma: ");
    result.append(comma);
    result.append(')');
    return result.toString();
  }

} //ArrayRangeListImpl
