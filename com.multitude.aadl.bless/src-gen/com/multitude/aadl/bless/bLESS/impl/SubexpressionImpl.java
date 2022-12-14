/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.Subexpression;
import com.multitude.aadl.bless.bLESS.TimedExpression;
import com.multitude.aadl.bless.bLESS.UnaryOperator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subexpression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.SubexpressionImpl#getUnary <em>Unary</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.SubexpressionImpl#getTimed_expression <em>Timed expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubexpressionImpl extends ElementImpl implements Subexpression
{
  /**
   * The cached value of the '{@link #getUnary() <em>Unary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnary()
   * @generated
   * @ordered
   */
  protected UnaryOperator unary;

  /**
   * The cached value of the '{@link #getTimed_expression() <em>Timed expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimed_expression()
   * @generated
   * @ordered
   */
  protected TimedExpression timed_expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubexpressionImpl()
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
    return BLESSPackage.eINSTANCE.getSubexpression();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryOperator getUnary()
  {
    return unary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnary(UnaryOperator newUnary, NotificationChain msgs)
  {
    UnaryOperator oldUnary = unary;
    unary = newUnary;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.SUBEXPRESSION__UNARY, oldUnary, newUnary);
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
  public void setUnary(UnaryOperator newUnary)
  {
    if (newUnary != unary)
    {
      NotificationChain msgs = null;
      if (unary != null)
        msgs = ((InternalEObject)unary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.SUBEXPRESSION__UNARY, null, msgs);
      if (newUnary != null)
        msgs = ((InternalEObject)newUnary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.SUBEXPRESSION__UNARY, null, msgs);
      msgs = basicSetUnary(newUnary, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.SUBEXPRESSION__UNARY, newUnary, newUnary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimedExpression getTimed_expression()
  {
    return timed_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimed_expression(TimedExpression newTimed_expression, NotificationChain msgs)
  {
    TimedExpression oldTimed_expression = timed_expression;
    timed_expression = newTimed_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.SUBEXPRESSION__TIMED_EXPRESSION, oldTimed_expression, newTimed_expression);
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
  public void setTimed_expression(TimedExpression newTimed_expression)
  {
    if (newTimed_expression != timed_expression)
    {
      NotificationChain msgs = null;
      if (timed_expression != null)
        msgs = ((InternalEObject)timed_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.SUBEXPRESSION__TIMED_EXPRESSION, null, msgs);
      if (newTimed_expression != null)
        msgs = ((InternalEObject)newTimed_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.SUBEXPRESSION__TIMED_EXPRESSION, null, msgs);
      msgs = basicSetTimed_expression(newTimed_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.SUBEXPRESSION__TIMED_EXPRESSION, newTimed_expression, newTimed_expression));
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
      case BLESSPackage.SUBEXPRESSION__UNARY:
        return basicSetUnary(null, msgs);
      case BLESSPackage.SUBEXPRESSION__TIMED_EXPRESSION:
        return basicSetTimed_expression(null, msgs);
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
      case BLESSPackage.SUBEXPRESSION__UNARY:
        return getUnary();
      case BLESSPackage.SUBEXPRESSION__TIMED_EXPRESSION:
        return getTimed_expression();
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
      case BLESSPackage.SUBEXPRESSION__UNARY:
        setUnary((UnaryOperator)newValue);
        return;
      case BLESSPackage.SUBEXPRESSION__TIMED_EXPRESSION:
        setTimed_expression((TimedExpression)newValue);
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
      case BLESSPackage.SUBEXPRESSION__UNARY:
        setUnary((UnaryOperator)null);
        return;
      case BLESSPackage.SUBEXPRESSION__TIMED_EXPRESSION:
        setTimed_expression((TimedExpression)null);
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
      case BLESSPackage.SUBEXPRESSION__UNARY:
        return unary != null;
      case BLESSPackage.SUBEXPRESSION__TIMED_EXPRESSION:
        return timed_expression != null;
    }
    return super.eIsSet(featureID);
  }

} //SubexpressionImpl
