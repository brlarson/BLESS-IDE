/**
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.30.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.BehaviorActions;
import com.multitude.aadl.bless.bLESS.Expression;
import com.multitude.aadl.bless.bLESS.ForLoop;
import com.multitude.aadl.bless.bLESS.ForallVariable;
import com.multitude.aadl.bless.bLESS.NamelessAssertion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ForLoopImpl#getCount <em>Count</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ForLoopImpl#getLower_bound <em>Lower bound</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ForLoopImpl#getUpper_bound <em>Upper bound</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ForLoopImpl#isInvariant <em>Invariant</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ForLoopImpl#getInv <em>Inv</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ForLoopImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForLoopImpl extends ElementImpl implements ForLoop
{
  /**
   * The cached value of the '{@link #getCount() <em>Count</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCount()
   * @generated
   * @ordered
   */
  protected ForallVariable count;

  /**
   * The cached value of the '{@link #getLower_bound() <em>Lower bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLower_bound()
   * @generated
   * @ordered
   */
  protected Expression lower_bound;

  /**
   * The cached value of the '{@link #getUpper_bound() <em>Upper bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpper_bound()
   * @generated
   * @ordered
   */
  protected Expression upper_bound;

  /**
   * The default value of the '{@link #isInvariant() <em>Invariant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInvariant()
   * @generated
   * @ordered
   */
  protected static final boolean INVARIANT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInvariant() <em>Invariant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInvariant()
   * @generated
   * @ordered
   */
  protected boolean invariant = INVARIANT_EDEFAULT;

  /**
   * The cached value of the '{@link #getInv() <em>Inv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInv()
   * @generated
   * @ordered
   */
  protected NamelessAssertion inv;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected BehaviorActions action;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForLoopImpl()
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
    return BLESSPackage.eINSTANCE.getForLoop();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ForallVariable getCount()
  {
    return count;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCount(ForallVariable newCount, NotificationChain msgs)
  {
    ForallVariable oldCount = count;
    count = newCount;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.FOR_LOOP__COUNT, oldCount, newCount);
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
  public void setCount(ForallVariable newCount)
  {
    if (newCount != count)
    {
      NotificationChain msgs = null;
      if (count != null)
        msgs = ((InternalEObject)count).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.FOR_LOOP__COUNT, null, msgs);
      if (newCount != null)
        msgs = ((InternalEObject)newCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.FOR_LOOP__COUNT, null, msgs);
      msgs = basicSetCount(newCount, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.FOR_LOOP__COUNT, newCount, newCount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getLower_bound()
  {
    return lower_bound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLower_bound(Expression newLower_bound, NotificationChain msgs)
  {
    Expression oldLower_bound = lower_bound;
    lower_bound = newLower_bound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.FOR_LOOP__LOWER_BOUND, oldLower_bound, newLower_bound);
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
  public void setLower_bound(Expression newLower_bound)
  {
    if (newLower_bound != lower_bound)
    {
      NotificationChain msgs = null;
      if (lower_bound != null)
        msgs = ((InternalEObject)lower_bound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.FOR_LOOP__LOWER_BOUND, null, msgs);
      if (newLower_bound != null)
        msgs = ((InternalEObject)newLower_bound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.FOR_LOOP__LOWER_BOUND, null, msgs);
      msgs = basicSetLower_bound(newLower_bound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.FOR_LOOP__LOWER_BOUND, newLower_bound, newLower_bound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getUpper_bound()
  {
    return upper_bound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpper_bound(Expression newUpper_bound, NotificationChain msgs)
  {
    Expression oldUpper_bound = upper_bound;
    upper_bound = newUpper_bound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.FOR_LOOP__UPPER_BOUND, oldUpper_bound, newUpper_bound);
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
  public void setUpper_bound(Expression newUpper_bound)
  {
    if (newUpper_bound != upper_bound)
    {
      NotificationChain msgs = null;
      if (upper_bound != null)
        msgs = ((InternalEObject)upper_bound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.FOR_LOOP__UPPER_BOUND, null, msgs);
      if (newUpper_bound != null)
        msgs = ((InternalEObject)newUpper_bound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.FOR_LOOP__UPPER_BOUND, null, msgs);
      msgs = basicSetUpper_bound(newUpper_bound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.FOR_LOOP__UPPER_BOUND, newUpper_bound, newUpper_bound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isInvariant()
  {
    return invariant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInvariant(boolean newInvariant)
  {
    boolean oldInvariant = invariant;
    invariant = newInvariant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.FOR_LOOP__INVARIANT, oldInvariant, invariant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NamelessAssertion getInv()
  {
    return inv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInv(NamelessAssertion newInv, NotificationChain msgs)
  {
    NamelessAssertion oldInv = inv;
    inv = newInv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.FOR_LOOP__INV, oldInv, newInv);
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
  public void setInv(NamelessAssertion newInv)
  {
    if (newInv != inv)
    {
      NotificationChain msgs = null;
      if (inv != null)
        msgs = ((InternalEObject)inv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.FOR_LOOP__INV, null, msgs);
      if (newInv != null)
        msgs = ((InternalEObject)newInv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.FOR_LOOP__INV, null, msgs);
      msgs = basicSetInv(newInv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.FOR_LOOP__INV, newInv, newInv));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BehaviorActions getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(BehaviorActions newAction, NotificationChain msgs)
  {
    BehaviorActions oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.FOR_LOOP__ACTION, oldAction, newAction);
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
  public void setAction(BehaviorActions newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.FOR_LOOP__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.FOR_LOOP__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.FOR_LOOP__ACTION, newAction, newAction));
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
      case BLESSPackage.FOR_LOOP__COUNT:
        return basicSetCount(null, msgs);
      case BLESSPackage.FOR_LOOP__LOWER_BOUND:
        return basicSetLower_bound(null, msgs);
      case BLESSPackage.FOR_LOOP__UPPER_BOUND:
        return basicSetUpper_bound(null, msgs);
      case BLESSPackage.FOR_LOOP__INV:
        return basicSetInv(null, msgs);
      case BLESSPackage.FOR_LOOP__ACTION:
        return basicSetAction(null, msgs);
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
      case BLESSPackage.FOR_LOOP__COUNT:
        return getCount();
      case BLESSPackage.FOR_LOOP__LOWER_BOUND:
        return getLower_bound();
      case BLESSPackage.FOR_LOOP__UPPER_BOUND:
        return getUpper_bound();
      case BLESSPackage.FOR_LOOP__INVARIANT:
        return isInvariant();
      case BLESSPackage.FOR_LOOP__INV:
        return getInv();
      case BLESSPackage.FOR_LOOP__ACTION:
        return getAction();
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
      case BLESSPackage.FOR_LOOP__COUNT:
        setCount((ForallVariable)newValue);
        return;
      case BLESSPackage.FOR_LOOP__LOWER_BOUND:
        setLower_bound((Expression)newValue);
        return;
      case BLESSPackage.FOR_LOOP__UPPER_BOUND:
        setUpper_bound((Expression)newValue);
        return;
      case BLESSPackage.FOR_LOOP__INVARIANT:
        setInvariant((Boolean)newValue);
        return;
      case BLESSPackage.FOR_LOOP__INV:
        setInv((NamelessAssertion)newValue);
        return;
      case BLESSPackage.FOR_LOOP__ACTION:
        setAction((BehaviorActions)newValue);
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
      case BLESSPackage.FOR_LOOP__COUNT:
        setCount((ForallVariable)null);
        return;
      case BLESSPackage.FOR_LOOP__LOWER_BOUND:
        setLower_bound((Expression)null);
        return;
      case BLESSPackage.FOR_LOOP__UPPER_BOUND:
        setUpper_bound((Expression)null);
        return;
      case BLESSPackage.FOR_LOOP__INVARIANT:
        setInvariant(INVARIANT_EDEFAULT);
        return;
      case BLESSPackage.FOR_LOOP__INV:
        setInv((NamelessAssertion)null);
        return;
      case BLESSPackage.FOR_LOOP__ACTION:
        setAction((BehaviorActions)null);
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
      case BLESSPackage.FOR_LOOP__COUNT:
        return count != null;
      case BLESSPackage.FOR_LOOP__LOWER_BOUND:
        return lower_bound != null;
      case BLESSPackage.FOR_LOOP__UPPER_BOUND:
        return upper_bound != null;
      case BLESSPackage.FOR_LOOP__INVARIANT:
        return invariant != INVARIANT_EDEFAULT;
      case BLESSPackage.FOR_LOOP__INV:
        return inv != null;
      case BLESSPackage.FOR_LOOP__ACTION:
        return action != null;
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
    result.append(" (invariant: ");
    result.append(invariant);
    result.append(')');
    return result.toString();
  }

} //ForLoopImpl
