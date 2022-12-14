/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.SubprogramAccessDispatch;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.SubprogramAccess;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Access Dispatch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.SubprogramAccessDispatchImpl#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramAccessDispatchImpl extends ElementImpl implements SubprogramAccessDispatch
{
  /**
   * The cached value of the '{@link #getAccess() <em>Access</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected SubprogramAccess access;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubprogramAccessDispatchImpl()
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
    return BLESSPackage.eINSTANCE.getSubprogramAccessDispatch();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SubprogramAccess getAccess()
  {
    if (access != null && ((EObject)access).eIsProxy())
    {
      InternalEObject oldAccess = (InternalEObject)access;
      access = (SubprogramAccess)eResolveProxy(oldAccess);
      if (access != oldAccess)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BLESSPackage.SUBPROGRAM_ACCESS_DISPATCH__ACCESS, oldAccess, access));
      }
    }
    return access;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubprogramAccess basicGetAccess()
  {
    return access;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAccess(SubprogramAccess newAccess)
  {
    SubprogramAccess oldAccess = access;
    access = newAccess;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.SUBPROGRAM_ACCESS_DISPATCH__ACCESS, oldAccess, access));
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
      case BLESSPackage.SUBPROGRAM_ACCESS_DISPATCH__ACCESS:
        if (resolve) return getAccess();
        return basicGetAccess();
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
      case BLESSPackage.SUBPROGRAM_ACCESS_DISPATCH__ACCESS:
        setAccess((SubprogramAccess)newValue);
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
      case BLESSPackage.SUBPROGRAM_ACCESS_DISPATCH__ACCESS:
        setAccess((SubprogramAccess)null);
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
      case BLESSPackage.SUBPROGRAM_ACCESS_DISPATCH__ACCESS:
        return access != null;
    }
    return super.eIsSet(featureID);
  }

} //SubprogramAccessDispatchImpl
