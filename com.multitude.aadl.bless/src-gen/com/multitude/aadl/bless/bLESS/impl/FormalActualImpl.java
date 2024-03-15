/**
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.30.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.FormalActual;
import com.multitude.aadl.bless.bLESS.SubProgramParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.Parameter;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Actual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.FormalActualImpl#getFormal <em>Formal</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.FormalActualImpl#getActual <em>Actual</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormalActualImpl extends ElementImpl implements FormalActual
{
  /**
   * The cached value of the '{@link #getFormal() <em>Formal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormal()
   * @generated
   * @ordered
   */
  protected Parameter formal;

  /**
   * The cached value of the '{@link #getActual() <em>Actual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActual()
   * @generated
   * @ordered
   */
  protected SubProgramParameter actual;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormalActualImpl()
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
    return BLESSPackage.eINSTANCE.getFormalActual();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter getFormal()
  {
    if (formal != null && ((EObject)formal).eIsProxy())
    {
      InternalEObject oldFormal = (InternalEObject)formal;
      formal = (Parameter)eResolveProxy(oldFormal);
      if (formal != oldFormal)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BLESSPackage.FORMAL_ACTUAL__FORMAL, oldFormal, formal));
      }
    }
    return formal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter basicGetFormal()
  {
    return formal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFormal(Parameter newFormal)
  {
    Parameter oldFormal = formal;
    formal = newFormal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.FORMAL_ACTUAL__FORMAL, oldFormal, formal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SubProgramParameter getActual()
  {
    return actual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActual(SubProgramParameter newActual, NotificationChain msgs)
  {
    SubProgramParameter oldActual = actual;
    actual = newActual;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.FORMAL_ACTUAL__ACTUAL, oldActual, newActual);
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
  public void setActual(SubProgramParameter newActual)
  {
    if (newActual != actual)
    {
      NotificationChain msgs = null;
      if (actual != null)
        msgs = ((InternalEObject)actual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.FORMAL_ACTUAL__ACTUAL, null, msgs);
      if (newActual != null)
        msgs = ((InternalEObject)newActual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.FORMAL_ACTUAL__ACTUAL, null, msgs);
      msgs = basicSetActual(newActual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.FORMAL_ACTUAL__ACTUAL, newActual, newActual));
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
      case BLESSPackage.FORMAL_ACTUAL__ACTUAL:
        return basicSetActual(null, msgs);
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
      case BLESSPackage.FORMAL_ACTUAL__FORMAL:
        if (resolve) return getFormal();
        return basicGetFormal();
      case BLESSPackage.FORMAL_ACTUAL__ACTUAL:
        return getActual();
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
      case BLESSPackage.FORMAL_ACTUAL__FORMAL:
        setFormal((Parameter)newValue);
        return;
      case BLESSPackage.FORMAL_ACTUAL__ACTUAL:
        setActual((SubProgramParameter)newValue);
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
      case BLESSPackage.FORMAL_ACTUAL__FORMAL:
        setFormal((Parameter)null);
        return;
      case BLESSPackage.FORMAL_ACTUAL__ACTUAL:
        setActual((SubProgramParameter)null);
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
      case BLESSPackage.FORMAL_ACTUAL__FORMAL:
        return formal != null;
      case BLESSPackage.FORMAL_ACTUAL__ACTUAL:
        return actual != null;
    }
    return super.eIsSet(featureID);
  }

} //FormalActualImpl
