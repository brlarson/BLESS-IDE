/**
 * (C) Multitude Corporation 2021
 * generated by Xtext 2.27.0
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
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.QuantityImpl#isScalar <em>Scalar</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.QuantityImpl#isWhole <em>Whole</em>}</li>
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
   * The default value of the '{@link #isScalar() <em>Scalar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isScalar()
   * @generated
   * @ordered
   */
  protected static final boolean SCALAR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isScalar() <em>Scalar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isScalar()
   * @generated
   * @ordered
   */
  protected boolean scalar = SCALAR_EDEFAULT;

  /**
   * The default value of the '{@link #isWhole() <em>Whole</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWhole()
   * @generated
   * @ordered
   */
  protected static final boolean WHOLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWhole() <em>Whole</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWhole()
   * @generated
   * @ordered
   */
  protected boolean whole = WHOLE_EDEFAULT;

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
  public boolean isScalar()
  {
    return scalar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setScalar(boolean newScalar)
  {
    boolean oldScalar = scalar;
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
  public boolean isWhole()
  {
    return whole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWhole(boolean newWhole)
  {
    boolean oldWhole = whole;
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
        return isScalar();
      case BLESSPackage.QUANTITY__WHOLE:
        return isWhole();
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
        setScalar((Boolean)newValue);
        return;
      case BLESSPackage.QUANTITY__WHOLE:
        setWhole((Boolean)newValue);
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
        return scalar != SCALAR_EDEFAULT;
      case BLESSPackage.QUANTITY__WHOLE:
        return whole != WHOLE_EDEFAULT;
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
