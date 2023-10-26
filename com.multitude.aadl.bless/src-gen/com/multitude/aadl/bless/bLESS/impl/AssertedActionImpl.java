/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.30.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.Action;
import com.multitude.aadl.bless.bLESS.AssertedAction;
import com.multitude.aadl.bless.bLESS.Assertion;
import com.multitude.aadl.bless.bLESS.BLESSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asserted Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.AssertedActionImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.AssertedActionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.AssertedActionImpl#getPostcondition <em>Postcondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssertedActionImpl extends ElementImpl implements AssertedAction
{
  /**
   * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecondition()
   * @generated
   * @ordered
   */
  protected Assertion precondition;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected Action action;

  /**
   * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostcondition()
   * @generated
   * @ordered
   */
  protected Assertion postcondition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertedActionImpl()
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
    return BLESSPackage.eINSTANCE.getAssertedAction();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Assertion getPrecondition()
  {
    return precondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrecondition(Assertion newPrecondition, NotificationChain msgs)
  {
    Assertion oldPrecondition = precondition;
    precondition = newPrecondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSERTED_ACTION__PRECONDITION, oldPrecondition, newPrecondition);
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
  public void setPrecondition(Assertion newPrecondition)
  {
    if (newPrecondition != precondition)
    {
      NotificationChain msgs = null;
      if (precondition != null)
        msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSERTED_ACTION__PRECONDITION, null, msgs);
      if (newPrecondition != null)
        msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSERTED_ACTION__PRECONDITION, null, msgs);
      msgs = basicSetPrecondition(newPrecondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSERTED_ACTION__PRECONDITION, newPrecondition, newPrecondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(Action newAction, NotificationChain msgs)
  {
    Action oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSERTED_ACTION__ACTION, oldAction, newAction);
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
  public void setAction(Action newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSERTED_ACTION__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSERTED_ACTION__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSERTED_ACTION__ACTION, newAction, newAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Assertion getPostcondition()
  {
    return postcondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPostcondition(Assertion newPostcondition, NotificationChain msgs)
  {
    Assertion oldPostcondition = postcondition;
    postcondition = newPostcondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSERTED_ACTION__POSTCONDITION, oldPostcondition, newPostcondition);
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
  public void setPostcondition(Assertion newPostcondition)
  {
    if (newPostcondition != postcondition)
    {
      NotificationChain msgs = null;
      if (postcondition != null)
        msgs = ((InternalEObject)postcondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSERTED_ACTION__POSTCONDITION, null, msgs);
      if (newPostcondition != null)
        msgs = ((InternalEObject)newPostcondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSERTED_ACTION__POSTCONDITION, null, msgs);
      msgs = basicSetPostcondition(newPostcondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSERTED_ACTION__POSTCONDITION, newPostcondition, newPostcondition));
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
      case BLESSPackage.ASSERTED_ACTION__PRECONDITION:
        return basicSetPrecondition(null, msgs);
      case BLESSPackage.ASSERTED_ACTION__ACTION:
        return basicSetAction(null, msgs);
      case BLESSPackage.ASSERTED_ACTION__POSTCONDITION:
        return basicSetPostcondition(null, msgs);
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
      case BLESSPackage.ASSERTED_ACTION__PRECONDITION:
        return getPrecondition();
      case BLESSPackage.ASSERTED_ACTION__ACTION:
        return getAction();
      case BLESSPackage.ASSERTED_ACTION__POSTCONDITION:
        return getPostcondition();
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
      case BLESSPackage.ASSERTED_ACTION__PRECONDITION:
        setPrecondition((Assertion)newValue);
        return;
      case BLESSPackage.ASSERTED_ACTION__ACTION:
        setAction((Action)newValue);
        return;
      case BLESSPackage.ASSERTED_ACTION__POSTCONDITION:
        setPostcondition((Assertion)newValue);
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
      case BLESSPackage.ASSERTED_ACTION__PRECONDITION:
        setPrecondition((Assertion)null);
        return;
      case BLESSPackage.ASSERTED_ACTION__ACTION:
        setAction((Action)null);
        return;
      case BLESSPackage.ASSERTED_ACTION__POSTCONDITION:
        setPostcondition((Assertion)null);
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
      case BLESSPackage.ASSERTED_ACTION__PRECONDITION:
        return precondition != null;
      case BLESSPackage.ASSERTED_ACTION__ACTION:
        return action != null;
      case BLESSPackage.ASSERTED_ACTION__POSTCONDITION:
        return postcondition != null;
    }
    return super.eIsSet(featureID);
  }

} //AssertedActionImpl
