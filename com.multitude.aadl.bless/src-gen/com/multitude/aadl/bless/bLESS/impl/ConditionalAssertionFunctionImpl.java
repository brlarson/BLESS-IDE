/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.ConditionValuePair;
import com.multitude.aadl.bless.bLESS.ConditionalAssertionFunction;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Assertion Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ConditionalAssertionFunctionImpl#getCvp <em>Cvp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalAssertionFunctionImpl extends ElementImpl implements ConditionalAssertionFunction
{
  /**
   * The cached value of the '{@link #getCvp() <em>Cvp</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCvp()
   * @generated
   * @ordered
   */
  protected EList<ConditionValuePair> cvp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalAssertionFunctionImpl()
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
    return BLESSPackage.eINSTANCE.getConditionalAssertionFunction();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ConditionValuePair> getCvp()
  {
    if (cvp == null)
    {
      cvp = new EObjectContainmentEList<ConditionValuePair>(ConditionValuePair.class, this, BLESSPackage.CONDITIONAL_ASSERTION_FUNCTION__CVP);
    }
    return cvp;
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
      case BLESSPackage.CONDITIONAL_ASSERTION_FUNCTION__CVP:
        return ((InternalEList<?>)getCvp()).basicRemove(otherEnd, msgs);
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
      case BLESSPackage.CONDITIONAL_ASSERTION_FUNCTION__CVP:
        return getCvp();
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
      case BLESSPackage.CONDITIONAL_ASSERTION_FUNCTION__CVP:
        getCvp().clear();
        getCvp().addAll((Collection<? extends ConditionValuePair>)newValue);
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
      case BLESSPackage.CONDITIONAL_ASSERTION_FUNCTION__CVP:
        getCvp().clear();
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
      case BLESSPackage.CONDITIONAL_ASSERTION_FUNCTION__CVP:
        return cvp != null && !cvp.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConditionalAssertionFunctionImpl
