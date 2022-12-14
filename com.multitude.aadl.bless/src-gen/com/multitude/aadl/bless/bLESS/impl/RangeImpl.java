/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.Range;
import com.multitude.aadl.bless.bLESS.Subexpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.RangeImpl#getLower_bound <em>Lower bound</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.RangeImpl#getSym <em>Sym</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.RangeImpl#getUpper_bound <em>Upper bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeImpl extends ElementImpl implements Range
{
  /**
   * The cached value of the '{@link #getLower_bound() <em>Lower bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLower_bound()
   * @generated
   * @ordered
   */
  protected Subexpression lower_bound;

  /**
   * The default value of the '{@link #getSym() <em>Sym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSym()
   * @generated
   * @ordered
   */
  protected static final String SYM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSym() <em>Sym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSym()
   * @generated
   * @ordered
   */
  protected String sym = SYM_EDEFAULT;

  /**
   * The cached value of the '{@link #getUpper_bound() <em>Upper bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpper_bound()
   * @generated
   * @ordered
   */
  protected Subexpression upper_bound;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RangeImpl()
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
    return BLESSPackage.eINSTANCE.getRange();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Subexpression getLower_bound()
  {
    return lower_bound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLower_bound(Subexpression newLower_bound, NotificationChain msgs)
  {
    Subexpression oldLower_bound = lower_bound;
    lower_bound = newLower_bound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.RANGE__LOWER_BOUND, oldLower_bound, newLower_bound);
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
  public void setLower_bound(Subexpression newLower_bound)
  {
    if (newLower_bound != lower_bound)
    {
      NotificationChain msgs = null;
      if (lower_bound != null)
        msgs = ((InternalEObject)lower_bound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.RANGE__LOWER_BOUND, null, msgs);
      if (newLower_bound != null)
        msgs = ((InternalEObject)newLower_bound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.RANGE__LOWER_BOUND, null, msgs);
      msgs = basicSetLower_bound(newLower_bound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.RANGE__LOWER_BOUND, newLower_bound, newLower_bound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSym()
  {
    return sym;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSym(String newSym)
  {
    String oldSym = sym;
    sym = newSym;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.RANGE__SYM, oldSym, sym));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Subexpression getUpper_bound()
  {
    return upper_bound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpper_bound(Subexpression newUpper_bound, NotificationChain msgs)
  {
    Subexpression oldUpper_bound = upper_bound;
    upper_bound = newUpper_bound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.RANGE__UPPER_BOUND, oldUpper_bound, newUpper_bound);
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
  public void setUpper_bound(Subexpression newUpper_bound)
  {
    if (newUpper_bound != upper_bound)
    {
      NotificationChain msgs = null;
      if (upper_bound != null)
        msgs = ((InternalEObject)upper_bound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.RANGE__UPPER_BOUND, null, msgs);
      if (newUpper_bound != null)
        msgs = ((InternalEObject)newUpper_bound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.RANGE__UPPER_BOUND, null, msgs);
      msgs = basicSetUpper_bound(newUpper_bound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.RANGE__UPPER_BOUND, newUpper_bound, newUpper_bound));
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
      case BLESSPackage.RANGE__LOWER_BOUND:
        return basicSetLower_bound(null, msgs);
      case BLESSPackage.RANGE__UPPER_BOUND:
        return basicSetUpper_bound(null, msgs);
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
      case BLESSPackage.RANGE__LOWER_BOUND:
        return getLower_bound();
      case BLESSPackage.RANGE__SYM:
        return getSym();
      case BLESSPackage.RANGE__UPPER_BOUND:
        return getUpper_bound();
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
      case BLESSPackage.RANGE__LOWER_BOUND:
        setLower_bound((Subexpression)newValue);
        return;
      case BLESSPackage.RANGE__SYM:
        setSym((String)newValue);
        return;
      case BLESSPackage.RANGE__UPPER_BOUND:
        setUpper_bound((Subexpression)newValue);
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
      case BLESSPackage.RANGE__LOWER_BOUND:
        setLower_bound((Subexpression)null);
        return;
      case BLESSPackage.RANGE__SYM:
        setSym(SYM_EDEFAULT);
        return;
      case BLESSPackage.RANGE__UPPER_BOUND:
        setUpper_bound((Subexpression)null);
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
      case BLESSPackage.RANGE__LOWER_BOUND:
        return lower_bound != null;
      case BLESSPackage.RANGE__SYM:
        return SYM_EDEFAULT == null ? sym != null : !SYM_EDEFAULT.equals(sym);
      case BLESSPackage.RANGE__UPPER_BOUND:
        return upper_bound != null;
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
    result.append(" (sym: ");
    result.append(sym);
    result.append(')');
    return result.toString();
  }

} //RangeImpl
