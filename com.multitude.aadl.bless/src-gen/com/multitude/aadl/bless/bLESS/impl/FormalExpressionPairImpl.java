/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.Expression;
import com.multitude.aadl.bless.bLESS.FormalExpressionPair;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Expression Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.FormalExpressionPairImpl#getFormal <em>Formal</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.FormalExpressionPairImpl#getActual <em>Actual</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormalExpressionPairImpl extends ElementImpl implements FormalExpressionPair
{
  /**
   * The default value of the '{@link #getFormal() <em>Formal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormal()
   * @generated
   * @ordered
   */
  protected static final String FORMAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFormal() <em>Formal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormal()
   * @generated
   * @ordered
   */
  protected String formal = FORMAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getActual() <em>Actual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActual()
   * @generated
   * @ordered
   */
  protected Expression actual;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormalExpressionPairImpl()
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
    return BLESSPackage.eINSTANCE.getFormalExpressionPair();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFormal()
  {
    return formal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFormal(String newFormal)
  {
    String oldFormal = formal;
    formal = newFormal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.FORMAL_EXPRESSION_PAIR__FORMAL, oldFormal, formal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getActual()
  {
    return actual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActual(Expression newActual, NotificationChain msgs)
  {
    Expression oldActual = actual;
    actual = newActual;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.FORMAL_EXPRESSION_PAIR__ACTUAL, oldActual, newActual);
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
  public void setActual(Expression newActual)
  {
    if (newActual != actual)
    {
      NotificationChain msgs = null;
      if (actual != null)
        msgs = ((InternalEObject)actual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.FORMAL_EXPRESSION_PAIR__ACTUAL, null, msgs);
      if (newActual != null)
        msgs = ((InternalEObject)newActual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.FORMAL_EXPRESSION_PAIR__ACTUAL, null, msgs);
      msgs = basicSetActual(newActual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.FORMAL_EXPRESSION_PAIR__ACTUAL, newActual, newActual));
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
      case BLESSPackage.FORMAL_EXPRESSION_PAIR__ACTUAL:
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
      case BLESSPackage.FORMAL_EXPRESSION_PAIR__FORMAL:
        return getFormal();
      case BLESSPackage.FORMAL_EXPRESSION_PAIR__ACTUAL:
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
      case BLESSPackage.FORMAL_EXPRESSION_PAIR__FORMAL:
        setFormal((String)newValue);
        return;
      case BLESSPackage.FORMAL_EXPRESSION_PAIR__ACTUAL:
        setActual((Expression)newValue);
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
      case BLESSPackage.FORMAL_EXPRESSION_PAIR__FORMAL:
        setFormal(FORMAL_EDEFAULT);
        return;
      case BLESSPackage.FORMAL_EXPRESSION_PAIR__ACTUAL:
        setActual((Expression)null);
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
      case BLESSPackage.FORMAL_EXPRESSION_PAIR__FORMAL:
        return FORMAL_EDEFAULT == null ? formal != null : !FORMAL_EDEFAULT.equals(formal);
      case BLESSPackage.FORMAL_EXPRESSION_PAIR__ACTUAL:
        return actual != null;
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
    result.append(" (formal: ");
    result.append(formal);
    result.append(')');
    return result.toString();
  }

} //FormalExpressionPairImpl
