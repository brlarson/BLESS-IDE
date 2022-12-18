/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.Constant;
import com.multitude.aadl.bless.bLESS.EnumerationValue;
import com.multitude.aadl.bless.bLESS.Value;
import com.multitude.aadl.bless.bLESS.ValueName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ValueImpl#getValue_name <em>Value name</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ValueImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ValueImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ValueImpl#getNow <em>Now</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ValueImpl#getTops <em>Tops</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ValueImpl#getEnum_val <em>Enum val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueImpl extends ElementImpl implements Value
{
  /**
   * The cached value of the '{@link #getValue_name() <em>Value name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue_name()
   * @generated
   * @ordered
   */
  protected ValueName value_name;

  /**
   * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
  protected Constant constant;

  /**
   * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeout()
   * @generated
   * @ordered
   */
  protected static final String TIMEOUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeout()
   * @generated
   * @ordered
   */
  protected String timeout = TIMEOUT_EDEFAULT;

  /**
   * The default value of the '{@link #getNow() <em>Now</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNow()
   * @generated
   * @ordered
   */
  protected static final String NOW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNow() <em>Now</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNow()
   * @generated
   * @ordered
   */
  protected String now = NOW_EDEFAULT;

  /**
   * The default value of the '{@link #getTops() <em>Tops</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTops()
   * @generated
   * @ordered
   */
  protected static final String TOPS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTops() <em>Tops</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTops()
   * @generated
   * @ordered
   */
  protected String tops = TOPS_EDEFAULT;

  /**
   * The cached value of the '{@link #getEnum_val() <em>Enum val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnum_val()
   * @generated
   * @ordered
   */
  protected EnumerationValue enum_val;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValueImpl()
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
    return BLESSPackage.eINSTANCE.getValue();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ValueName getValue_name()
  {
    return value_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue_name(ValueName newValue_name, NotificationChain msgs)
  {
    ValueName oldValue_name = value_name;
    value_name = newValue_name;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.VALUE__VALUE_NAME, oldValue_name, newValue_name);
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
  public void setValue_name(ValueName newValue_name)
  {
    if (newValue_name != value_name)
    {
      NotificationChain msgs = null;
      if (value_name != null)
        msgs = ((InternalEObject)value_name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.VALUE__VALUE_NAME, null, msgs);
      if (newValue_name != null)
        msgs = ((InternalEObject)newValue_name).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.VALUE__VALUE_NAME, null, msgs);
      msgs = basicSetValue_name(newValue_name, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.VALUE__VALUE_NAME, newValue_name, newValue_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Constant getConstant()
  {
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstant(Constant newConstant, NotificationChain msgs)
  {
    Constant oldConstant = constant;
    constant = newConstant;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.VALUE__CONSTANT, oldConstant, newConstant);
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
  public void setConstant(Constant newConstant)
  {
    if (newConstant != constant)
    {
      NotificationChain msgs = null;
      if (constant != null)
        msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.VALUE__CONSTANT, null, msgs);
      if (newConstant != null)
        msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.VALUE__CONSTANT, null, msgs);
      msgs = basicSetConstant(newConstant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.VALUE__CONSTANT, newConstant, newConstant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTimeout()
  {
    return timeout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTimeout(String newTimeout)
  {
    String oldTimeout = timeout;
    timeout = newTimeout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.VALUE__TIMEOUT, oldTimeout, timeout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNow()
  {
    return now;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNow(String newNow)
  {
    String oldNow = now;
    now = newNow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.VALUE__NOW, oldNow, now));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTops()
  {
    return tops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTops(String newTops)
  {
    String oldTops = tops;
    tops = newTops;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.VALUE__TOPS, oldTops, tops));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumerationValue getEnum_val()
  {
    return enum_val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnum_val(EnumerationValue newEnum_val, NotificationChain msgs)
  {
    EnumerationValue oldEnum_val = enum_val;
    enum_val = newEnum_val;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.VALUE__ENUM_VAL, oldEnum_val, newEnum_val);
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
  public void setEnum_val(EnumerationValue newEnum_val)
  {
    if (newEnum_val != enum_val)
    {
      NotificationChain msgs = null;
      if (enum_val != null)
        msgs = ((InternalEObject)enum_val).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.VALUE__ENUM_VAL, null, msgs);
      if (newEnum_val != null)
        msgs = ((InternalEObject)newEnum_val).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.VALUE__ENUM_VAL, null, msgs);
      msgs = basicSetEnum_val(newEnum_val, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.VALUE__ENUM_VAL, newEnum_val, newEnum_val));
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
      case BLESSPackage.VALUE__VALUE_NAME:
        return basicSetValue_name(null, msgs);
      case BLESSPackage.VALUE__CONSTANT:
        return basicSetConstant(null, msgs);
      case BLESSPackage.VALUE__ENUM_VAL:
        return basicSetEnum_val(null, msgs);
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
      case BLESSPackage.VALUE__VALUE_NAME:
        return getValue_name();
      case BLESSPackage.VALUE__CONSTANT:
        return getConstant();
      case BLESSPackage.VALUE__TIMEOUT:
        return getTimeout();
      case BLESSPackage.VALUE__NOW:
        return getNow();
      case BLESSPackage.VALUE__TOPS:
        return getTops();
      case BLESSPackage.VALUE__ENUM_VAL:
        return getEnum_val();
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
      case BLESSPackage.VALUE__VALUE_NAME:
        setValue_name((ValueName)newValue);
        return;
      case BLESSPackage.VALUE__CONSTANT:
        setConstant((Constant)newValue);
        return;
      case BLESSPackage.VALUE__TIMEOUT:
        setTimeout((String)newValue);
        return;
      case BLESSPackage.VALUE__NOW:
        setNow((String)newValue);
        return;
      case BLESSPackage.VALUE__TOPS:
        setTops((String)newValue);
        return;
      case BLESSPackage.VALUE__ENUM_VAL:
        setEnum_val((EnumerationValue)newValue);
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
      case BLESSPackage.VALUE__VALUE_NAME:
        setValue_name((ValueName)null);
        return;
      case BLESSPackage.VALUE__CONSTANT:
        setConstant((Constant)null);
        return;
      case BLESSPackage.VALUE__TIMEOUT:
        setTimeout(TIMEOUT_EDEFAULT);
        return;
      case BLESSPackage.VALUE__NOW:
        setNow(NOW_EDEFAULT);
        return;
      case BLESSPackage.VALUE__TOPS:
        setTops(TOPS_EDEFAULT);
        return;
      case BLESSPackage.VALUE__ENUM_VAL:
        setEnum_val((EnumerationValue)null);
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
      case BLESSPackage.VALUE__VALUE_NAME:
        return value_name != null;
      case BLESSPackage.VALUE__CONSTANT:
        return constant != null;
      case BLESSPackage.VALUE__TIMEOUT:
        return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
      case BLESSPackage.VALUE__NOW:
        return NOW_EDEFAULT == null ? now != null : !NOW_EDEFAULT.equals(now);
      case BLESSPackage.VALUE__TOPS:
        return TOPS_EDEFAULT == null ? tops != null : !TOPS_EDEFAULT.equals(tops);
      case BLESSPackage.VALUE__ENUM_VAL:
        return enum_val != null;
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
    result.append(" (timeout: ");
    result.append(timeout);
    result.append(", now: ");
    result.append(now);
    result.append(", tops: ");
    result.append(tops);
    result.append(')');
    return result.toString();
  }

} //ValueImpl
