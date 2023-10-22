/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.30.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.AssertionFunctionValue;
import com.multitude.aadl.bless.bLESS.AssertionNumericExpression;
import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.ConditionalAssertionFunction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assertion Function Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.AssertionFunctionValueImpl#getCexp <em>Cexp</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.AssertionFunctionValueImpl#getPexp <em>Pexp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssertionFunctionValueImpl extends ElementImpl implements AssertionFunctionValue
{
  /**
   * The cached value of the '{@link #getCexp() <em>Cexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCexp()
   * @generated
   * @ordered
   */
  protected ConditionalAssertionFunction cexp;

  /**
   * The cached value of the '{@link #getPexp() <em>Pexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPexp()
   * @generated
   * @ordered
   */
  protected AssertionNumericExpression pexp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertionFunctionValueImpl()
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
    return BLESSPackage.eINSTANCE.getAssertionFunctionValue();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConditionalAssertionFunction getCexp()
  {
    return cexp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCexp(ConditionalAssertionFunction newCexp, NotificationChain msgs)
  {
    ConditionalAssertionFunction oldCexp = cexp;
    cexp = newCexp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSERTION_FUNCTION_VALUE__CEXP, oldCexp, newCexp);
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
  public void setCexp(ConditionalAssertionFunction newCexp)
  {
    if (newCexp != cexp)
    {
      NotificationChain msgs = null;
      if (cexp != null)
        msgs = ((InternalEObject)cexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSERTION_FUNCTION_VALUE__CEXP, null, msgs);
      if (newCexp != null)
        msgs = ((InternalEObject)newCexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSERTION_FUNCTION_VALUE__CEXP, null, msgs);
      msgs = basicSetCexp(newCexp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSERTION_FUNCTION_VALUE__CEXP, newCexp, newCexp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AssertionNumericExpression getPexp()
  {
    return pexp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPexp(AssertionNumericExpression newPexp, NotificationChain msgs)
  {
    AssertionNumericExpression oldPexp = pexp;
    pexp = newPexp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSERTION_FUNCTION_VALUE__PEXP, oldPexp, newPexp);
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
  public void setPexp(AssertionNumericExpression newPexp)
  {
    if (newPexp != pexp)
    {
      NotificationChain msgs = null;
      if (pexp != null)
        msgs = ((InternalEObject)pexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSERTION_FUNCTION_VALUE__PEXP, null, msgs);
      if (newPexp != null)
        msgs = ((InternalEObject)newPexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSERTION_FUNCTION_VALUE__PEXP, null, msgs);
      msgs = basicSetPexp(newPexp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSERTION_FUNCTION_VALUE__PEXP, newPexp, newPexp));
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
      case BLESSPackage.ASSERTION_FUNCTION_VALUE__CEXP:
        return basicSetCexp(null, msgs);
      case BLESSPackage.ASSERTION_FUNCTION_VALUE__PEXP:
        return basicSetPexp(null, msgs);
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
      case BLESSPackage.ASSERTION_FUNCTION_VALUE__CEXP:
        return getCexp();
      case BLESSPackage.ASSERTION_FUNCTION_VALUE__PEXP:
        return getPexp();
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
      case BLESSPackage.ASSERTION_FUNCTION_VALUE__CEXP:
        setCexp((ConditionalAssertionFunction)newValue);
        return;
      case BLESSPackage.ASSERTION_FUNCTION_VALUE__PEXP:
        setPexp((AssertionNumericExpression)newValue);
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
      case BLESSPackage.ASSERTION_FUNCTION_VALUE__CEXP:
        setCexp((ConditionalAssertionFunction)null);
        return;
      case BLESSPackage.ASSERTION_FUNCTION_VALUE__PEXP:
        setPexp((AssertionNumericExpression)null);
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
      case BLESSPackage.ASSERTION_FUNCTION_VALUE__CEXP:
        return cexp != null;
      case BLESSPackage.ASSERTION_FUNCTION_VALUE__PEXP:
        return pexp != null;
    }
    return super.eIsSet(featureID);
  }

} //AssertionFunctionValueImpl
