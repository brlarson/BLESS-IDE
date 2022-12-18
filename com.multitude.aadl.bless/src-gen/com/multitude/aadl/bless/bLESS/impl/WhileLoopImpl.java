/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.BooleanExpression;
import com.multitude.aadl.bless.bLESS.ExistentialLatticeQuantification;
import com.multitude.aadl.bless.bLESS.Expression;
import com.multitude.aadl.bless.bLESS.NamelessAssertion;
import com.multitude.aadl.bless.bLESS.WhileLoop;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.WhileLoopImpl#getTest <em>Test</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.WhileLoopImpl#isInvariant <em>Invariant</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.WhileLoopImpl#getInv <em>Inv</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.WhileLoopImpl#isBound <em>Bound</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.WhileLoopImpl#getBound_function <em>Bound function</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.WhileLoopImpl#getElq <em>Elq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhileLoopImpl extends ElementImpl implements WhileLoop
{
  /**
   * The cached value of the '{@link #getTest() <em>Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest()
   * @generated
   * @ordered
   */
  protected BooleanExpression test;

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
   * The cached value of the '{@link #getBound_function() <em>Bound function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBound_function()
   * @generated
   * @ordered
   */
  protected Expression bound_function;

  /**
   * The cached value of the '{@link #getElq() <em>Elq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElq()
   * @generated
   * @ordered
   */
  protected ExistentialLatticeQuantification elq;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhileLoopImpl()
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
    return BLESSPackage.eINSTANCE.getWhileLoop();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanExpression getTest()
  {
    return test;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTest(BooleanExpression newTest, NotificationChain msgs)
  {
    BooleanExpression oldTest = test;
    test = newTest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.WHILE_LOOP__TEST, oldTest, newTest);
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
  public void setTest(BooleanExpression newTest)
  {
    if (newTest != test)
    {
      NotificationChain msgs = null;
      if (test != null)
        msgs = ((InternalEObject)test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.WHILE_LOOP__TEST, null, msgs);
      if (newTest != null)
        msgs = ((InternalEObject)newTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.WHILE_LOOP__TEST, null, msgs);
      msgs = basicSetTest(newTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.WHILE_LOOP__TEST, newTest, newTest));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.WHILE_LOOP__INVARIANT, oldInvariant, invariant));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.WHILE_LOOP__INV, oldInv, newInv);
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
        msgs = ((InternalEObject)inv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.WHILE_LOOP__INV, null, msgs);
      if (newInv != null)
        msgs = ((InternalEObject)newInv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.WHILE_LOOP__INV, null, msgs);
      msgs = basicSetInv(newInv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.WHILE_LOOP__INV, newInv, newInv));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.WHILE_LOOP__BOUND, oldBound, bound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getBound_function()
  {
    return bound_function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBound_function(Expression newBound_function, NotificationChain msgs)
  {
    Expression oldBound_function = bound_function;
    bound_function = newBound_function;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.WHILE_LOOP__BOUND_FUNCTION, oldBound_function, newBound_function);
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
  public void setBound_function(Expression newBound_function)
  {
    if (newBound_function != bound_function)
    {
      NotificationChain msgs = null;
      if (bound_function != null)
        msgs = ((InternalEObject)bound_function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.WHILE_LOOP__BOUND_FUNCTION, null, msgs);
      if (newBound_function != null)
        msgs = ((InternalEObject)newBound_function).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.WHILE_LOOP__BOUND_FUNCTION, null, msgs);
      msgs = basicSetBound_function(newBound_function, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.WHILE_LOOP__BOUND_FUNCTION, newBound_function, newBound_function));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExistentialLatticeQuantification getElq()
  {
    return elq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElq(ExistentialLatticeQuantification newElq, NotificationChain msgs)
  {
    ExistentialLatticeQuantification oldElq = elq;
    elq = newElq;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.WHILE_LOOP__ELQ, oldElq, newElq);
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
  public void setElq(ExistentialLatticeQuantification newElq)
  {
    if (newElq != elq)
    {
      NotificationChain msgs = null;
      if (elq != null)
        msgs = ((InternalEObject)elq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.WHILE_LOOP__ELQ, null, msgs);
      if (newElq != null)
        msgs = ((InternalEObject)newElq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.WHILE_LOOP__ELQ, null, msgs);
      msgs = basicSetElq(newElq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.WHILE_LOOP__ELQ, newElq, newElq));
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
      case BLESSPackage.WHILE_LOOP__TEST:
        return basicSetTest(null, msgs);
      case BLESSPackage.WHILE_LOOP__INV:
        return basicSetInv(null, msgs);
      case BLESSPackage.WHILE_LOOP__BOUND_FUNCTION:
        return basicSetBound_function(null, msgs);
      case BLESSPackage.WHILE_LOOP__ELQ:
        return basicSetElq(null, msgs);
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
      case BLESSPackage.WHILE_LOOP__TEST:
        return getTest();
      case BLESSPackage.WHILE_LOOP__INVARIANT:
        return isInvariant();
      case BLESSPackage.WHILE_LOOP__INV:
        return getInv();
      case BLESSPackage.WHILE_LOOP__BOUND:
        return isBound();
      case BLESSPackage.WHILE_LOOP__BOUND_FUNCTION:
        return getBound_function();
      case BLESSPackage.WHILE_LOOP__ELQ:
        return getElq();
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
      case BLESSPackage.WHILE_LOOP__TEST:
        setTest((BooleanExpression)newValue);
        return;
      case BLESSPackage.WHILE_LOOP__INVARIANT:
        setInvariant((Boolean)newValue);
        return;
      case BLESSPackage.WHILE_LOOP__INV:
        setInv((NamelessAssertion)newValue);
        return;
      case BLESSPackage.WHILE_LOOP__BOUND:
        setBound((Boolean)newValue);
        return;
      case BLESSPackage.WHILE_LOOP__BOUND_FUNCTION:
        setBound_function((Expression)newValue);
        return;
      case BLESSPackage.WHILE_LOOP__ELQ:
        setElq((ExistentialLatticeQuantification)newValue);
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
      case BLESSPackage.WHILE_LOOP__TEST:
        setTest((BooleanExpression)null);
        return;
      case BLESSPackage.WHILE_LOOP__INVARIANT:
        setInvariant(INVARIANT_EDEFAULT);
        return;
      case BLESSPackage.WHILE_LOOP__INV:
        setInv((NamelessAssertion)null);
        return;
      case BLESSPackage.WHILE_LOOP__BOUND:
        setBound(BOUND_EDEFAULT);
        return;
      case BLESSPackage.WHILE_LOOP__BOUND_FUNCTION:
        setBound_function((Expression)null);
        return;
      case BLESSPackage.WHILE_LOOP__ELQ:
        setElq((ExistentialLatticeQuantification)null);
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
      case BLESSPackage.WHILE_LOOP__TEST:
        return test != null;
      case BLESSPackage.WHILE_LOOP__INVARIANT:
        return invariant != INVARIANT_EDEFAULT;
      case BLESSPackage.WHILE_LOOP__INV:
        return inv != null;
      case BLESSPackage.WHILE_LOOP__BOUND:
        return bound != BOUND_EDEFAULT;
      case BLESSPackage.WHILE_LOOP__BOUND_FUNCTION:
        return bound_function != null;
      case BLESSPackage.WHILE_LOOP__ELQ:
        return elq != null;
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

} //WhileLoopImpl
