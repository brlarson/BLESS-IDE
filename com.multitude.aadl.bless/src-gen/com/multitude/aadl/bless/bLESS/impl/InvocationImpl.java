/**
 * (C) Multitude Corporation 2021
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.ActualParameter;
import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.Invocation;
import com.multitude.aadl.bless.bLESS.NamedAssertion;
import com.multitude.aadl.bless.bLESS.NumericExpression;

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
 * An implementation of the model object '<em><b>Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.InvocationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.InvocationImpl#getParams <em>Params</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.InvocationImpl#getActual_parameter <em>Actual parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvocationImpl extends ElementImpl implements Invocation
{
  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected NamedAssertion label;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<ActualParameter> params;

  /**
   * The cached value of the '{@link #getActual_parameter() <em>Actual parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActual_parameter()
   * @generated
   * @ordered
   */
  protected NumericExpression actual_parameter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InvocationImpl()
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
    return BLESSPackage.eINSTANCE.getInvocation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NamedAssertion getLabel()
  {
    if (label != null && label.eIsProxy())
    {
      InternalEObject oldLabel = (InternalEObject)label;
      label = (NamedAssertion)eResolveProxy(oldLabel);
      if (label != oldLabel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BLESSPackage.INVOCATION__LABEL, oldLabel, label));
      }
    }
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedAssertion basicGetLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLabel(NamedAssertion newLabel)
  {
    NamedAssertion oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.INVOCATION__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ActualParameter> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<ActualParameter>(ActualParameter.class, this, BLESSPackage.INVOCATION__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumericExpression getActual_parameter()
  {
    return actual_parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActual_parameter(NumericExpression newActual_parameter, NotificationChain msgs)
  {
    NumericExpression oldActual_parameter = actual_parameter;
    actual_parameter = newActual_parameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.INVOCATION__ACTUAL_PARAMETER, oldActual_parameter, newActual_parameter);
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
  public void setActual_parameter(NumericExpression newActual_parameter)
  {
    if (newActual_parameter != actual_parameter)
    {
      NotificationChain msgs = null;
      if (actual_parameter != null)
        msgs = ((InternalEObject)actual_parameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.INVOCATION__ACTUAL_PARAMETER, null, msgs);
      if (newActual_parameter != null)
        msgs = ((InternalEObject)newActual_parameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.INVOCATION__ACTUAL_PARAMETER, null, msgs);
      msgs = basicSetActual_parameter(newActual_parameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.INVOCATION__ACTUAL_PARAMETER, newActual_parameter, newActual_parameter));
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
      case BLESSPackage.INVOCATION__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case BLESSPackage.INVOCATION__ACTUAL_PARAMETER:
        return basicSetActual_parameter(null, msgs);
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
      case BLESSPackage.INVOCATION__LABEL:
        if (resolve) return getLabel();
        return basicGetLabel();
      case BLESSPackage.INVOCATION__PARAMS:
        return getParams();
      case BLESSPackage.INVOCATION__ACTUAL_PARAMETER:
        return getActual_parameter();
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
      case BLESSPackage.INVOCATION__LABEL:
        setLabel((NamedAssertion)newValue);
        return;
      case BLESSPackage.INVOCATION__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends ActualParameter>)newValue);
        return;
      case BLESSPackage.INVOCATION__ACTUAL_PARAMETER:
        setActual_parameter((NumericExpression)newValue);
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
      case BLESSPackage.INVOCATION__LABEL:
        setLabel((NamedAssertion)null);
        return;
      case BLESSPackage.INVOCATION__PARAMS:
        getParams().clear();
        return;
      case BLESSPackage.INVOCATION__ACTUAL_PARAMETER:
        setActual_parameter((NumericExpression)null);
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
      case BLESSPackage.INVOCATION__LABEL:
        return label != null;
      case BLESSPackage.INVOCATION__PARAMS:
        return params != null && !params.isEmpty();
      case BLESSPackage.INVOCATION__ACTUAL_PARAMETER:
        return actual_parameter != null;
    }
    return super.eIsSet(featureID);
  }

} //InvocationImpl