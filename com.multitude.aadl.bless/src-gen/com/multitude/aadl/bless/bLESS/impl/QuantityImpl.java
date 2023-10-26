/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.30.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.ANumber;
import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.Quantity;
import com.multitude.aadl.bless.bLESS.UnitName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.QuantityImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.QuantityImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.QuantityImpl#getScalar <em>Scalar</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.QuantityImpl#getWhole <em>Whole</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantityImpl extends ElementImpl implements Quantity
{
  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected ANumber number;

  /**
   * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected UnitName unit;

  /**
   * The default value of the '{@link #getScalar() <em>Scalar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScalar()
   * @generated
   * @ordered
   */
  protected static final String SCALAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getScalar() <em>Scalar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScalar()
   * @generated
   * @ordered
   */
  protected String scalar = SCALAR_EDEFAULT;

  /**
   * The default value of the '{@link #getWhole() <em>Whole</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhole()
   * @generated
   * @ordered
   */
  protected static final String WHOLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWhole() <em>Whole</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhole()
   * @generated
   * @ordered
   */
  protected String whole = WHOLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuantityImpl()
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
    return BLESSPackage.eINSTANCE.getQuantity();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ANumber getNumber()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumber(ANumber newNumber, NotificationChain msgs)
  {
    ANumber oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.QUANTITY__NUMBER, oldNumber, newNumber);
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
  public void setNumber(ANumber newNumber)
  {
    if (newNumber != number)
    {
      NotificationChain msgs = null;
      if (number != null)
        msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.QUANTITY__NUMBER, null, msgs);
      if (newNumber != null)
        msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.QUANTITY__NUMBER, null, msgs);
      msgs = basicSetNumber(newNumber, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.QUANTITY__NUMBER, newNumber, newNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnitName getUnit()
  {
    if (unit != null && unit.eIsProxy())
    {
      InternalEObject oldUnit = (InternalEObject)unit;
      unit = (UnitName)eResolveProxy(oldUnit);
      if (unit != oldUnit)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BLESSPackage.QUANTITY__UNIT, oldUnit, unit));
      }
    }
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitName basicGetUnit()
  {
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUnit(UnitName newUnit)
  {
    UnitName oldUnit = unit;
    unit = newUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.QUANTITY__UNIT, oldUnit, unit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getScalar()
  {
    return scalar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setScalar(String newScalar)
  {
    String oldScalar = scalar;
    scalar = newScalar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.QUANTITY__SCALAR, oldScalar, scalar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getWhole()
  {
    return whole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWhole(String newWhole)
  {
    String oldWhole = whole;
    whole = newWhole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.QUANTITY__WHOLE, oldWhole, whole));
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
      case BLESSPackage.QUANTITY__NUMBER:
        return basicSetNumber(null, msgs);
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
      case BLESSPackage.QUANTITY__NUMBER:
        return getNumber();
      case BLESSPackage.QUANTITY__UNIT:
        if (resolve) return getUnit();
        return basicGetUnit();
      case BLESSPackage.QUANTITY__SCALAR:
        return getScalar();
      case BLESSPackage.QUANTITY__WHOLE:
        return getWhole();
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
      case BLESSPackage.QUANTITY__NUMBER:
        setNumber((ANumber)newValue);
        return;
      case BLESSPackage.QUANTITY__UNIT:
        setUnit((UnitName)newValue);
        return;
      case BLESSPackage.QUANTITY__SCALAR:
        setScalar((String)newValue);
        return;
      case BLESSPackage.QUANTITY__WHOLE:
        setWhole((String)newValue);
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
      case BLESSPackage.QUANTITY__NUMBER:
        setNumber((ANumber)null);
        return;
      case BLESSPackage.QUANTITY__UNIT:
        setUnit((UnitName)null);
        return;
      case BLESSPackage.QUANTITY__SCALAR:
        setScalar(SCALAR_EDEFAULT);
        return;
      case BLESSPackage.QUANTITY__WHOLE:
        setWhole(WHOLE_EDEFAULT);
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
      case BLESSPackage.QUANTITY__NUMBER:
        return number != null;
      case BLESSPackage.QUANTITY__UNIT:
        return unit != null;
      case BLESSPackage.QUANTITY__SCALAR:
        return SCALAR_EDEFAULT == null ? scalar != null : !SCALAR_EDEFAULT.equals(scalar);
      case BLESSPackage.QUANTITY__WHOLE:
        return WHOLE_EDEFAULT == null ? whole != null : !WHOLE_EDEFAULT.equals(whole);
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
    result.append(" (scalar: ");
    result.append(scalar);
    result.append(", whole: ");
    result.append(whole);
    result.append(')');
    return result.toString();
  }

} //QuantityImpl
