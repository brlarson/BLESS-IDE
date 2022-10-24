/**
 * (C) Multitude Corporation 2021
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.DispatchConjunction;
import com.multitude.aadl.bless.bLESS.DispatchTrigger;

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
 * An implementation of the model object '<em><b>Dispatch Conjunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.DispatchConjunctionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.DispatchConjunctionImpl#isAnd <em>And</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DispatchConjunctionImpl extends ElementImpl implements DispatchConjunction
{
  /**
   * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrigger()
   * @generated
   * @ordered
   */
  protected EList<DispatchTrigger> trigger;

  /**
   * The default value of the '{@link #isAnd() <em>And</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnd()
   * @generated
   * @ordered
   */
  protected static final boolean AND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAnd() <em>And</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnd()
   * @generated
   * @ordered
   */
  protected boolean and = AND_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DispatchConjunctionImpl()
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
    return BLESSPackage.eINSTANCE.getDispatchConjunction();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DispatchTrigger> getTrigger()
  {
    if (trigger == null)
    {
      trigger = new EObjectContainmentEList<DispatchTrigger>(DispatchTrigger.class, this, BLESSPackage.DISPATCH_CONJUNCTION__TRIGGER);
    }
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isAnd()
  {
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAnd(boolean newAnd)
  {
    boolean oldAnd = and;
    and = newAnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.DISPATCH_CONJUNCTION__AND, oldAnd, and));
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
      case BLESSPackage.DISPATCH_CONJUNCTION__TRIGGER:
        return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
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
      case BLESSPackage.DISPATCH_CONJUNCTION__TRIGGER:
        return getTrigger();
      case BLESSPackage.DISPATCH_CONJUNCTION__AND:
        return isAnd();
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
      case BLESSPackage.DISPATCH_CONJUNCTION__TRIGGER:
        getTrigger().clear();
        getTrigger().addAll((Collection<? extends DispatchTrigger>)newValue);
        return;
      case BLESSPackage.DISPATCH_CONJUNCTION__AND:
        setAnd((Boolean)newValue);
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
      case BLESSPackage.DISPATCH_CONJUNCTION__TRIGGER:
        getTrigger().clear();
        return;
      case BLESSPackage.DISPATCH_CONJUNCTION__AND:
        setAnd(AND_EDEFAULT);
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
      case BLESSPackage.DISPATCH_CONJUNCTION__TRIGGER:
        return trigger != null && !trigger.isEmpty();
      case BLESSPackage.DISPATCH_CONJUNCTION__AND:
        return and != AND_EDEFAULT;
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
    result.append(" (and: ");
    result.append(and);
    result.append(')');
    return result.toString();
  }

} //DispatchConjunctionImpl
