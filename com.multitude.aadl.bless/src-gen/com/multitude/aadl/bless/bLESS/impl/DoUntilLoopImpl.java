/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.BehaviorActions;
import com.multitude.aadl.bless.bLESS.BooleanExpression;
import com.multitude.aadl.bless.bLESS.DoUntilLoop;
import com.multitude.aadl.bless.bLESS.Expression;
import com.multitude.aadl.bless.bLESS.NamelessAssertion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Do Until Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.DoUntilLoopImpl#isInvariant <em>Invariant</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.DoUntilLoopImpl#getInv <em>Inv</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.DoUntilLoopImpl#isBound <em>Bound</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.DoUntilLoopImpl#getBnd <em>Bnd</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.DoUntilLoopImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.DoUntilLoopImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoUntilLoopImpl extends ElementImpl implements DoUntilLoop
{
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
   * The default value of the '{@link #isBound() <em>Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBound()
   * @generated
   * @ordered
   */
  protected static final boolean BOUND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBound() <em>Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBound()
   * @generated
   * @ordered
   */
  protected boolean bound = BOUND_EDEFAULT;

  /**
   * The cached value of the '{@link #getBnd() <em>Bnd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBnd()
   * @generated
   * @ordered
   */
  protected Expression bnd;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected BehaviorActions actions;

  /**
   * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuard()
   * @generated
   * @ordered
   */
  protected BooleanExpression guard;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DoUntilLoopImpl()
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
    return BLESSPackage.eINSTANCE.getDoUntilLoop();
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
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.DO_UNTIL_LOOP__INVARIANT, oldInvariant, invariant));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.DO_UNTIL_LOOP__INV, oldInv, newInv);
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
        msgs = ((InternalEObject)inv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.DO_UNTIL_LOOP__INV, null, msgs);
      if (newInv != null)
        msgs = ((InternalEObject)newInv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.DO_UNTIL_LOOP__INV, null, msgs);
      msgs = basicSetInv(newInv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.DO_UNTIL_LOOP__INV, newInv, newInv));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isBound()
  {
    return bound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBound(boolean newBound)
  {
    boolean oldBound = bound;
    bound = newBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.DO_UNTIL_LOOP__BOUND, oldBound, bound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getBnd()
  {
    return bnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBnd(Expression newBnd, NotificationChain msgs)
  {
    Expression oldBnd = bnd;
    bnd = newBnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.DO_UNTIL_LOOP__BND, oldBnd, newBnd);
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
  public void setBnd(Expression newBnd)
  {
    if (newBnd != bnd)
    {
      NotificationChain msgs = null;
      if (bnd != null)
        msgs = ((InternalEObject)bnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.DO_UNTIL_LOOP__BND, null, msgs);
      if (newBnd != null)
        msgs = ((InternalEObject)newBnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.DO_UNTIL_LOOP__BND, null, msgs);
      msgs = basicSetBnd(newBnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.DO_UNTIL_LOOP__BND, newBnd, newBnd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BehaviorActions getActions()
  {
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActions(BehaviorActions newActions, NotificationChain msgs)
  {
    BehaviorActions oldActions = actions;
    actions = newActions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.DO_UNTIL_LOOP__ACTIONS, oldActions, newActions);
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
  public void setActions(BehaviorActions newActions)
  {
    if (newActions != actions)
    {
      NotificationChain msgs = null;
      if (actions != null)
        msgs = ((InternalEObject)actions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.DO_UNTIL_LOOP__ACTIONS, null, msgs);
      if (newActions != null)
        msgs = ((InternalEObject)newActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.DO_UNTIL_LOOP__ACTIONS, null, msgs);
      msgs = basicSetActions(newActions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.DO_UNTIL_LOOP__ACTIONS, newActions, newActions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanExpression getGuard()
  {
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuard(BooleanExpression newGuard, NotificationChain msgs)
  {
    BooleanExpression oldGuard = guard;
    guard = newGuard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.DO_UNTIL_LOOP__GUARD, oldGuard, newGuard);
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
  public void setGuard(BooleanExpression newGuard)
  {
    if (newGuard != guard)
    {
      NotificationChain msgs = null;
      if (guard != null)
        msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.DO_UNTIL_LOOP__GUARD, null, msgs);
      if (newGuard != null)
        msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.DO_UNTIL_LOOP__GUARD, null, msgs);
      msgs = basicSetGuard(newGuard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.DO_UNTIL_LOOP__GUARD, newGuard, newGuard));
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
      case BLESSPackage.DO_UNTIL_LOOP__INV:
        return basicSetInv(null, msgs);
      case BLESSPackage.DO_UNTIL_LOOP__BND:
        return basicSetBnd(null, msgs);
      case BLESSPackage.DO_UNTIL_LOOP__ACTIONS:
        return basicSetActions(null, msgs);
      case BLESSPackage.DO_UNTIL_LOOP__GUARD:
        return basicSetGuard(null, msgs);
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
      case BLESSPackage.DO_UNTIL_LOOP__INVARIANT:
        return isInvariant();
      case BLESSPackage.DO_UNTIL_LOOP__INV:
        return getInv();
      case BLESSPackage.DO_UNTIL_LOOP__BOUND:
        return isBound();
      case BLESSPackage.DO_UNTIL_LOOP__BND:
        return getBnd();
      case BLESSPackage.DO_UNTIL_LOOP__ACTIONS:
        return getActions();
      case BLESSPackage.DO_UNTIL_LOOP__GUARD:
        return getGuard();
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
      case BLESSPackage.DO_UNTIL_LOOP__INVARIANT:
        setInvariant((Boolean)newValue);
        return;
      case BLESSPackage.DO_UNTIL_LOOP__INV:
        setInv((NamelessAssertion)newValue);
        return;
      case BLESSPackage.DO_UNTIL_LOOP__BOUND:
        setBound((Boolean)newValue);
        return;
      case BLESSPackage.DO_UNTIL_LOOP__BND:
        setBnd((Expression)newValue);
        return;
      case BLESSPackage.DO_UNTIL_LOOP__ACTIONS:
        setActions((BehaviorActions)newValue);
        return;
      case BLESSPackage.DO_UNTIL_LOOP__GUARD:
        setGuard((BooleanExpression)newValue);
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
      case BLESSPackage.DO_UNTIL_LOOP__INVARIANT:
        setInvariant(INVARIANT_EDEFAULT);
        return;
      case BLESSPackage.DO_UNTIL_LOOP__INV:
        setInv((NamelessAssertion)null);
        return;
      case BLESSPackage.DO_UNTIL_LOOP__BOUND:
        setBound(BOUND_EDEFAULT);
        return;
      case BLESSPackage.DO_UNTIL_LOOP__BND:
        setBnd((Expression)null);
        return;
      case BLESSPackage.DO_UNTIL_LOOP__ACTIONS:
        setActions((BehaviorActions)null);
        return;
      case BLESSPackage.DO_UNTIL_LOOP__GUARD:
        setGuard((BooleanExpression)null);
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
      case BLESSPackage.DO_UNTIL_LOOP__INVARIANT:
        return invariant != INVARIANT_EDEFAULT;
      case BLESSPackage.DO_UNTIL_LOOP__INV:
        return inv != null;
      case BLESSPackage.DO_UNTIL_LOOP__BOUND:
        return bound != BOUND_EDEFAULT;
      case BLESSPackage.DO_UNTIL_LOOP__BND:
        return bnd != null;
      case BLESSPackage.DO_UNTIL_LOOP__ACTIONS:
        return actions != null;
      case BLESSPackage.DO_UNTIL_LOOP__GUARD:
        return guard != null;
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
    result.append(", bound: ");
    result.append(bound);
    result.append(')');
    return result.toString();
  }

} //DoUntilLoopImpl
