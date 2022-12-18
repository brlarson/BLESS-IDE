/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.IndexExpression;
import com.multitude.aadl.bless.bLESS.PeriodShift;
import com.multitude.aadl.bless.bLESS.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Period Shift</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.PeriodShiftImpl#isUnary_minus <em>Unary minus</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.PeriodShiftImpl#getV <em>V</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.PeriodShiftImpl#getIndex_expression <em>Index expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodShiftImpl extends ElementImpl implements PeriodShift
{
  /**
   * The default value of the '{@link #isUnary_minus() <em>Unary minus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnary_minus()
   * @generated
   * @ordered
   */
  protected static final boolean UNARY_MINUS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUnary_minus() <em>Unary minus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnary_minus()
   * @generated
   * @ordered
   */
  protected boolean unary_minus = UNARY_MINUS_EDEFAULT;

  /**
   * The cached value of the '{@link #getV() <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected Value v;

  /**
   * The cached value of the '{@link #getIndex_expression() <em>Index expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex_expression()
   * @generated
   * @ordered
   */
  protected IndexExpression index_expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PeriodShiftImpl()
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
    return BLESSPackage.eINSTANCE.getPeriodShift();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isUnary_minus()
  {
    return unary_minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUnary_minus(boolean newUnary_minus)
  {
    boolean oldUnary_minus = unary_minus;
    unary_minus = newUnary_minus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.PERIOD_SHIFT__UNARY_MINUS, oldUnary_minus, unary_minus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Value getV()
  {
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetV(Value newV, NotificationChain msgs)
  {
    Value oldV = v;
    v = newV;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.PERIOD_SHIFT__V, oldV, newV);
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
  public void setV(Value newV)
  {
    if (newV != v)
    {
      NotificationChain msgs = null;
      if (v != null)
        msgs = ((InternalEObject)v).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.PERIOD_SHIFT__V, null, msgs);
      if (newV != null)
        msgs = ((InternalEObject)newV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.PERIOD_SHIFT__V, null, msgs);
      msgs = basicSetV(newV, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.PERIOD_SHIFT__V, newV, newV));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IndexExpression getIndex_expression()
  {
    return index_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndex_expression(IndexExpression newIndex_expression, NotificationChain msgs)
  {
    IndexExpression oldIndex_expression = index_expression;
    index_expression = newIndex_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.PERIOD_SHIFT__INDEX_EXPRESSION, oldIndex_expression, newIndex_expression);
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
  public void setIndex_expression(IndexExpression newIndex_expression)
  {
    if (newIndex_expression != index_expression)
    {
      NotificationChain msgs = null;
      if (index_expression != null)
        msgs = ((InternalEObject)index_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.PERIOD_SHIFT__INDEX_EXPRESSION, null, msgs);
      if (newIndex_expression != null)
        msgs = ((InternalEObject)newIndex_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.PERIOD_SHIFT__INDEX_EXPRESSION, null, msgs);
      msgs = basicSetIndex_expression(newIndex_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.PERIOD_SHIFT__INDEX_EXPRESSION, newIndex_expression, newIndex_expression));
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
      case BLESSPackage.PERIOD_SHIFT__V:
        return basicSetV(null, msgs);
      case BLESSPackage.PERIOD_SHIFT__INDEX_EXPRESSION:
        return basicSetIndex_expression(null, msgs);
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
      case BLESSPackage.PERIOD_SHIFT__UNARY_MINUS:
        return isUnary_minus();
      case BLESSPackage.PERIOD_SHIFT__V:
        return getV();
      case BLESSPackage.PERIOD_SHIFT__INDEX_EXPRESSION:
        return getIndex_expression();
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
      case BLESSPackage.PERIOD_SHIFT__UNARY_MINUS:
        setUnary_minus((Boolean)newValue);
        return;
      case BLESSPackage.PERIOD_SHIFT__V:
        setV((Value)newValue);
        return;
      case BLESSPackage.PERIOD_SHIFT__INDEX_EXPRESSION:
        setIndex_expression((IndexExpression)newValue);
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
      case BLESSPackage.PERIOD_SHIFT__UNARY_MINUS:
        setUnary_minus(UNARY_MINUS_EDEFAULT);
        return;
      case BLESSPackage.PERIOD_SHIFT__V:
        setV((Value)null);
        return;
      case BLESSPackage.PERIOD_SHIFT__INDEX_EXPRESSION:
        setIndex_expression((IndexExpression)null);
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
      case BLESSPackage.PERIOD_SHIFT__UNARY_MINUS:
        return unary_minus != UNARY_MINUS_EDEFAULT;
      case BLESSPackage.PERIOD_SHIFT__V:
        return v != null;
      case BLESSPackage.PERIOD_SHIFT__INDEX_EXPRESSION:
        return index_expression != null;
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
    result.append(" (unary_minus: ");
    result.append(unary_minus);
    result.append(')');
    return result.toString();
  }

} //PeriodShiftImpl
