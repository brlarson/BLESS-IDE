/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.LockingAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.aadl2.DataAccess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Locking Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.LockingActionImpl#getEntercritical <em>Entercritical</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.LockingActionImpl#getLeavecritical <em>Leavecritical</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.LockingActionImpl#getRequired_data_access <em>Required data access</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.LockingActionImpl#getLock <em>Lock</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.LockingActionImpl#getUnlock <em>Unlock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LockingActionImpl extends MinimalEObjectImpl.Container implements LockingAction
{
  /**
   * The default value of the '{@link #getEntercritical() <em>Entercritical</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntercritical()
   * @generated
   * @ordered
   */
  protected static final String ENTERCRITICAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntercritical() <em>Entercritical</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntercritical()
   * @generated
   * @ordered
   */
  protected String entercritical = ENTERCRITICAL_EDEFAULT;

  /**
   * The default value of the '{@link #getLeavecritical() <em>Leavecritical</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeavecritical()
   * @generated
   * @ordered
   */
  protected static final String LEAVECRITICAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLeavecritical() <em>Leavecritical</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeavecritical()
   * @generated
   * @ordered
   */
  protected String leavecritical = LEAVECRITICAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getRequired_data_access() <em>Required data access</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequired_data_access()
   * @generated
   * @ordered
   */
  protected DataAccess required_data_access;

  /**
   * The default value of the '{@link #getLock() <em>Lock</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLock()
   * @generated
   * @ordered
   */
  protected static final String LOCK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLock() <em>Lock</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLock()
   * @generated
   * @ordered
   */
  protected String lock = LOCK_EDEFAULT;

  /**
   * The default value of the '{@link #getUnlock() <em>Unlock</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnlock()
   * @generated
   * @ordered
   */
  protected static final String UNLOCK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnlock() <em>Unlock</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnlock()
   * @generated
   * @ordered
   */
  protected String unlock = UNLOCK_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LockingActionImpl()
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
    return BLESSPackage.eINSTANCE.getLockingAction();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEntercritical()
  {
    return entercritical;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEntercritical(String newEntercritical)
  {
    String oldEntercritical = entercritical;
    entercritical = newEntercritical;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.LOCKING_ACTION__ENTERCRITICAL, oldEntercritical, entercritical));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLeavecritical()
  {
    return leavecritical;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLeavecritical(String newLeavecritical)
  {
    String oldLeavecritical = leavecritical;
    leavecritical = newLeavecritical;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.LOCKING_ACTION__LEAVECRITICAL, oldLeavecritical, leavecritical));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataAccess getRequired_data_access()
  {
    if (required_data_access != null && ((EObject)required_data_access).eIsProxy())
    {
      InternalEObject oldRequired_data_access = (InternalEObject)required_data_access;
      required_data_access = (DataAccess)eResolveProxy(oldRequired_data_access);
      if (required_data_access != oldRequired_data_access)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BLESSPackage.LOCKING_ACTION__REQUIRED_DATA_ACCESS, oldRequired_data_access, required_data_access));
      }
    }
    return required_data_access;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataAccess basicGetRequired_data_access()
  {
    return required_data_access;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRequired_data_access(DataAccess newRequired_data_access)
  {
    DataAccess oldRequired_data_access = required_data_access;
    required_data_access = newRequired_data_access;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.LOCKING_ACTION__REQUIRED_DATA_ACCESS, oldRequired_data_access, required_data_access));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLock()
  {
    return lock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLock(String newLock)
  {
    String oldLock = lock;
    lock = newLock;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.LOCKING_ACTION__LOCK, oldLock, lock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUnlock()
  {
    return unlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUnlock(String newUnlock)
  {
    String oldUnlock = unlock;
    unlock = newUnlock;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.LOCKING_ACTION__UNLOCK, oldUnlock, unlock));
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
      case BLESSPackage.LOCKING_ACTION__ENTERCRITICAL:
        return getEntercritical();
      case BLESSPackage.LOCKING_ACTION__LEAVECRITICAL:
        return getLeavecritical();
      case BLESSPackage.LOCKING_ACTION__REQUIRED_DATA_ACCESS:
        if (resolve) return getRequired_data_access();
        return basicGetRequired_data_access();
      case BLESSPackage.LOCKING_ACTION__LOCK:
        return getLock();
      case BLESSPackage.LOCKING_ACTION__UNLOCK:
        return getUnlock();
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
      case BLESSPackage.LOCKING_ACTION__ENTERCRITICAL:
        setEntercritical((String)newValue);
        return;
      case BLESSPackage.LOCKING_ACTION__LEAVECRITICAL:
        setLeavecritical((String)newValue);
        return;
      case BLESSPackage.LOCKING_ACTION__REQUIRED_DATA_ACCESS:
        setRequired_data_access((DataAccess)newValue);
        return;
      case BLESSPackage.LOCKING_ACTION__LOCK:
        setLock((String)newValue);
        return;
      case BLESSPackage.LOCKING_ACTION__UNLOCK:
        setUnlock((String)newValue);
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
      case BLESSPackage.LOCKING_ACTION__ENTERCRITICAL:
        setEntercritical(ENTERCRITICAL_EDEFAULT);
        return;
      case BLESSPackage.LOCKING_ACTION__LEAVECRITICAL:
        setLeavecritical(LEAVECRITICAL_EDEFAULT);
        return;
      case BLESSPackage.LOCKING_ACTION__REQUIRED_DATA_ACCESS:
        setRequired_data_access((DataAccess)null);
        return;
      case BLESSPackage.LOCKING_ACTION__LOCK:
        setLock(LOCK_EDEFAULT);
        return;
      case BLESSPackage.LOCKING_ACTION__UNLOCK:
        setUnlock(UNLOCK_EDEFAULT);
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
      case BLESSPackage.LOCKING_ACTION__ENTERCRITICAL:
        return ENTERCRITICAL_EDEFAULT == null ? entercritical != null : !ENTERCRITICAL_EDEFAULT.equals(entercritical);
      case BLESSPackage.LOCKING_ACTION__LEAVECRITICAL:
        return LEAVECRITICAL_EDEFAULT == null ? leavecritical != null : !LEAVECRITICAL_EDEFAULT.equals(leavecritical);
      case BLESSPackage.LOCKING_ACTION__REQUIRED_DATA_ACCESS:
        return required_data_access != null;
      case BLESSPackage.LOCKING_ACTION__LOCK:
        return LOCK_EDEFAULT == null ? lock != null : !LOCK_EDEFAULT.equals(lock);
      case BLESSPackage.LOCKING_ACTION__UNLOCK:
        return UNLOCK_EDEFAULT == null ? unlock != null : !UNLOCK_EDEFAULT.equals(unlock);
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
    result.append(" (entercritical: ");
    result.append(entercritical);
    result.append(", leavecritical: ");
    result.append(leavecritical);
    result.append(", lock: ");
    result.append(lock);
    result.append(", unlock: ");
    result.append(unlock);
    result.append(')');
    return result.toString();
  }

} //LockingActionImpl
