/**
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.30.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.AssertionEnumeration;
import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.EnumerationPair;
import com.multitude.aadl.bless.bLESS.Invocation;

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
 * An implementation of the model object '<em><b>Assertion Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.AssertionEnumerationImpl#getPred <em>Pred</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.AssertionEnumerationImpl#getPair <em>Pair</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssertionEnumerationImpl extends ElementImpl implements AssertionEnumeration
{
  /**
   * The cached value of the '{@link #getPred() <em>Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPred()
   * @generated
   * @ordered
   */
  protected Invocation pred;

  /**
   * The cached value of the '{@link #getPair() <em>Pair</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPair()
   * @generated
   * @ordered
   */
  protected EList<EnumerationPair> pair;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertionEnumerationImpl()
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
    return BLESSPackage.eINSTANCE.getAssertionEnumeration();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Invocation getPred()
  {
    return pred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPred(Invocation newPred, NotificationChain msgs)
  {
    Invocation oldPred = pred;
    pred = newPred;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSERTION_ENUMERATION__PRED, oldPred, newPred);
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
  public void setPred(Invocation newPred)
  {
    if (newPred != pred)
    {
      NotificationChain msgs = null;
      if (pred != null)
        msgs = ((InternalEObject)pred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSERTION_ENUMERATION__PRED, null, msgs);
      if (newPred != null)
        msgs = ((InternalEObject)newPred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSERTION_ENUMERATION__PRED, null, msgs);
      msgs = basicSetPred(newPred, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSERTION_ENUMERATION__PRED, newPred, newPred));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EnumerationPair> getPair()
  {
    if (pair == null)
    {
      pair = new EObjectContainmentEList<EnumerationPair>(EnumerationPair.class, this, BLESSPackage.ASSERTION_ENUMERATION__PAIR);
    }
    return pair;
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
      case BLESSPackage.ASSERTION_ENUMERATION__PRED:
        return basicSetPred(null, msgs);
      case BLESSPackage.ASSERTION_ENUMERATION__PAIR:
        return ((InternalEList<?>)getPair()).basicRemove(otherEnd, msgs);
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
      case BLESSPackage.ASSERTION_ENUMERATION__PRED:
        return getPred();
      case BLESSPackage.ASSERTION_ENUMERATION__PAIR:
        return getPair();
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
      case BLESSPackage.ASSERTION_ENUMERATION__PRED:
        setPred((Invocation)newValue);
        return;
      case BLESSPackage.ASSERTION_ENUMERATION__PAIR:
        getPair().clear();
        getPair().addAll((Collection<? extends EnumerationPair>)newValue);
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
      case BLESSPackage.ASSERTION_ENUMERATION__PRED:
        setPred((Invocation)null);
        return;
      case BLESSPackage.ASSERTION_ENUMERATION__PAIR:
        getPair().clear();
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
      case BLESSPackage.ASSERTION_ENUMERATION__PRED:
        return pred != null;
      case BLESSPackage.ASSERTION_ENUMERATION__PAIR:
        return pair != null && !pair.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AssertionEnumerationImpl
