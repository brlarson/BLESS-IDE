/**
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.33.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.AssignmentExpression;
import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.ExpressionOrAny;
import com.multitude.aadl.bless.bLESS.TickName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.AssignmentExpressionImpl#getEx <em>Ex</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.AssignmentExpressionImpl#getNt <em>Nt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentExpressionImpl extends MinimalEObjectImpl.Container implements AssignmentExpression
{
  /**
   * The cached value of the '{@link #getEx() <em>Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEx()
   * @generated
   * @ordered
   */
  protected ExpressionOrAny ex;

  /**
   * The cached value of the '{@link #getNt() <em>Nt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNt()
   * @generated
   * @ordered
   */
  protected TickName nt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignmentExpressionImpl()
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
    return BLESSPackage.eINSTANCE.getAssignmentExpression();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionOrAny getEx()
  {
    return ex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEx(ExpressionOrAny newEx, NotificationChain msgs)
  {
    ExpressionOrAny oldEx = ex;
    ex = newEx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSIGNMENT_EXPRESSION__EX, oldEx, newEx);
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
  public void setEx(ExpressionOrAny newEx)
  {
    if (newEx != ex)
    {
      NotificationChain msgs = null;
      if (ex != null)
        msgs = ((InternalEObject)ex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSIGNMENT_EXPRESSION__EX, null, msgs);
      if (newEx != null)
        msgs = ((InternalEObject)newEx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSIGNMENT_EXPRESSION__EX, null, msgs);
      msgs = basicSetEx(newEx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSIGNMENT_EXPRESSION__EX, newEx, newEx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TickName getNt()
  {
    return nt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNt(TickName newNt, NotificationChain msgs)
  {
    TickName oldNt = nt;
    nt = newNt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSIGNMENT_EXPRESSION__NT, oldNt, newNt);
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
  public void setNt(TickName newNt)
  {
    if (newNt != nt)
    {
      NotificationChain msgs = null;
      if (nt != null)
        msgs = ((InternalEObject)nt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSIGNMENT_EXPRESSION__NT, null, msgs);
      if (newNt != null)
        msgs = ((InternalEObject)newNt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSIGNMENT_EXPRESSION__NT, null, msgs);
      msgs = basicSetNt(newNt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSIGNMENT_EXPRESSION__NT, newNt, newNt));
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
      case BLESSPackage.ASSIGNMENT_EXPRESSION__EX:
        return basicSetEx(null, msgs);
      case BLESSPackage.ASSIGNMENT_EXPRESSION__NT:
        return basicSetNt(null, msgs);
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
      case BLESSPackage.ASSIGNMENT_EXPRESSION__EX:
        return getEx();
      case BLESSPackage.ASSIGNMENT_EXPRESSION__NT:
        return getNt();
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
      case BLESSPackage.ASSIGNMENT_EXPRESSION__EX:
        setEx((ExpressionOrAny)newValue);
        return;
      case BLESSPackage.ASSIGNMENT_EXPRESSION__NT:
        setNt((TickName)newValue);
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
      case BLESSPackage.ASSIGNMENT_EXPRESSION__EX:
        setEx((ExpressionOrAny)null);
        return;
      case BLESSPackage.ASSIGNMENT_EXPRESSION__NT:
        setNt((TickName)null);
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
      case BLESSPackage.ASSIGNMENT_EXPRESSION__EX:
        return ex != null;
      case BLESSPackage.ASSIGNMENT_EXPRESSION__NT:
        return nt != null;
    }
    return super.eIsSet(featureID);
  }

} //AssignmentExpressionImpl
