/**
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.30.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.ANumber;
import com.multitude.aadl.bless.bLESS.ArrayRange;
import com.multitude.aadl.bless.bLESS.BLESSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ArrayRangeImpl#getLb <em>Lb</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ArrayRangeImpl#getUb <em>Ub</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayRangeImpl extends ElementImpl implements ArrayRange
{
  /**
   * The cached value of the '{@link #getLb() <em>Lb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLb()
   * @generated
   * @ordered
   */
  protected ANumber lb;

  /**
   * The cached value of the '{@link #getUb() <em>Ub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUb()
   * @generated
   * @ordered
   */
  protected ANumber ub;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayRangeImpl()
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
    return BLESSPackage.eINSTANCE.getArrayRange();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ANumber getLb()
  {
    return lb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLb(ANumber newLb, NotificationChain msgs)
  {
    ANumber oldLb = lb;
    lb = newLb;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ARRAY_RANGE__LB, oldLb, newLb);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLb(ANumber newLb)
  {
    if (newLb != lb)
    {
      NotificationChain msgs = null;
      if (lb != null)
        msgs = ((InternalEObject)lb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ARRAY_RANGE__LB, null, msgs);
      if (newLb != null)
        msgs = ((InternalEObject)newLb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ARRAY_RANGE__LB, null, msgs);
      msgs = basicSetLb(newLb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ARRAY_RANGE__LB, newLb, newLb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ANumber getUb()
  {
    return ub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUb(ANumber newUb, NotificationChain msgs)
  {
    ANumber oldUb = ub;
    ub = newUb;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ARRAY_RANGE__UB, oldUb, newUb);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUb(ANumber newUb)
  {
    if (newUb != ub)
    {
      NotificationChain msgs = null;
      if (ub != null)
        msgs = ((InternalEObject)ub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ARRAY_RANGE__UB, null, msgs);
      if (newUb != null)
        msgs = ((InternalEObject)newUb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ARRAY_RANGE__UB, null, msgs);
      msgs = basicSetUb(newUb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ARRAY_RANGE__UB, newUb, newUb));
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
      case BLESSPackage.ARRAY_RANGE__LB:
        return basicSetLb(null, msgs);
      case BLESSPackage.ARRAY_RANGE__UB:
        return basicSetUb(null, msgs);
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
      case BLESSPackage.ARRAY_RANGE__LB:
        return getLb();
      case BLESSPackage.ARRAY_RANGE__UB:
        return getUb();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BLESSPackage.ARRAY_RANGE__LB:
        setLb((ANumber)newValue);
        return;
      case BLESSPackage.ARRAY_RANGE__UB:
        setUb((ANumber)newValue);
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
      case BLESSPackage.ARRAY_RANGE__LB:
        setLb((ANumber)null);
        return;
      case BLESSPackage.ARRAY_RANGE__UB:
        setUb((ANumber)null);
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
      case BLESSPackage.ARRAY_RANGE__LB:
        return lb != null;
      case BLESSPackage.ARRAY_RANGE__UB:
        return ub != null;
    }
    return super.eIsSet(featureID);
  }

} //ArrayRangeImpl
