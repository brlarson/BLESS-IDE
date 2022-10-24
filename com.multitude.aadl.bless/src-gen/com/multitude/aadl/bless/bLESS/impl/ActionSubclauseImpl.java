/**
 * (C) Multitude Corporation 2021
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.ActionSubclause;
import com.multitude.aadl.bless.bLESS.AssertClause;
import com.multitude.aadl.bless.bLESS.Assertion;
import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.ExistentialLatticeQuantification;
import com.multitude.aadl.bless.bLESS.ThrowsClause;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.impl.AnnexSubclauseImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Subclause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ActionSubclauseImpl#isNo_proof <em>No proof</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ActionSubclauseImpl#getThrows_clause <em>Throws clause</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ActionSubclauseImpl#getAssert_clause <em>Assert clause</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ActionSubclauseImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ActionSubclauseImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ActionSubclauseImpl#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ActionSubclauseImpl#getElq <em>Elq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionSubclauseImpl extends AnnexSubclauseImpl implements ActionSubclause
{
  /**
   * The default value of the '{@link #isNo_proof() <em>No proof</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNo_proof()
   * @generated
   * @ordered
   */
  protected static final boolean NO_PROOF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNo_proof() <em>No proof</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNo_proof()
   * @generated
   * @ordered
   */
  protected boolean no_proof = NO_PROOF_EDEFAULT;

  /**
   * The cached value of the '{@link #getThrows_clause() <em>Throws clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThrows_clause()
   * @generated
   * @ordered
   */
  protected ThrowsClause throws_clause;

  /**
   * The cached value of the '{@link #getAssert_clause() <em>Assert clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssert_clause()
   * @generated
   * @ordered
   */
  protected AssertClause assert_clause;

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
   * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostcondition()
   * @generated
   * @ordered
   */
  protected Assertion postcondition;

  /**
   * The cached value of the '{@link #getInvariant() <em>Invariant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvariant()
   * @generated
   * @ordered
   */
  protected Assertion invariant;

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
  protected ActionSubclauseImpl()
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
    return BLESSPackage.eINSTANCE.getActionSubclause();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isNo_proof()
  {
    return no_proof;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNo_proof(boolean newNo_proof)
  {
    boolean oldNo_proof = no_proof;
    no_proof = newNo_proof;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION_SUBCLAUSE__NO_PROOF, oldNo_proof, no_proof));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ThrowsClause getThrows_clause()
  {
    return throws_clause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThrows_clause(ThrowsClause newThrows_clause, NotificationChain msgs)
  {
    ThrowsClause oldThrows_clause = throws_clause;
    throws_clause = newThrows_clause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION_SUBCLAUSE__THROWS_CLAUSE, oldThrows_clause, newThrows_clause);
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
  public void setThrows_clause(ThrowsClause newThrows_clause)
  {
    if (newThrows_clause != throws_clause)
    {
      NotificationChain msgs = null;
      if (throws_clause != null)
        msgs = ((InternalEObject)throws_clause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION_SUBCLAUSE__THROWS_CLAUSE, null, msgs);
      if (newThrows_clause != null)
        msgs = ((InternalEObject)newThrows_clause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION_SUBCLAUSE__THROWS_CLAUSE, null, msgs);
      msgs = basicSetThrows_clause(newThrows_clause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION_SUBCLAUSE__THROWS_CLAUSE, newThrows_clause, newThrows_clause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AssertClause getAssert_clause()
  {
    return assert_clause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssert_clause(AssertClause newAssert_clause, NotificationChain msgs)
  {
    AssertClause oldAssert_clause = assert_clause;
    assert_clause = newAssert_clause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION_SUBCLAUSE__ASSERT_CLAUSE, oldAssert_clause, newAssert_clause);
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
  public void setAssert_clause(AssertClause newAssert_clause)
  {
    if (newAssert_clause != assert_clause)
    {
      NotificationChain msgs = null;
      if (assert_clause != null)
        msgs = ((InternalEObject)assert_clause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION_SUBCLAUSE__ASSERT_CLAUSE, null, msgs);
      if (newAssert_clause != null)
        msgs = ((InternalEObject)newAssert_clause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION_SUBCLAUSE__ASSERT_CLAUSE, null, msgs);
      msgs = basicSetAssert_clause(newAssert_clause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION_SUBCLAUSE__ASSERT_CLAUSE, newAssert_clause, newAssert_clause));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION_SUBCLAUSE__PRECONDITION, oldPrecondition, newPrecondition);
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
        msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION_SUBCLAUSE__PRECONDITION, null, msgs);
      if (newPrecondition != null)
        msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION_SUBCLAUSE__PRECONDITION, null, msgs);
      msgs = basicSetPrecondition(newPrecondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION_SUBCLAUSE__PRECONDITION, newPrecondition, newPrecondition));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION_SUBCLAUSE__POSTCONDITION, oldPostcondition, newPostcondition);
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
        msgs = ((InternalEObject)postcondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION_SUBCLAUSE__POSTCONDITION, null, msgs);
      if (newPostcondition != null)
        msgs = ((InternalEObject)newPostcondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION_SUBCLAUSE__POSTCONDITION, null, msgs);
      msgs = basicSetPostcondition(newPostcondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION_SUBCLAUSE__POSTCONDITION, newPostcondition, newPostcondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Assertion getInvariant()
  {
    return invariant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInvariant(Assertion newInvariant, NotificationChain msgs)
  {
    Assertion oldInvariant = invariant;
    invariant = newInvariant;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION_SUBCLAUSE__INVARIANT, oldInvariant, newInvariant);
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
  public void setInvariant(Assertion newInvariant)
  {
    if (newInvariant != invariant)
    {
      NotificationChain msgs = null;
      if (invariant != null)
        msgs = ((InternalEObject)invariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION_SUBCLAUSE__INVARIANT, null, msgs);
      if (newInvariant != null)
        msgs = ((InternalEObject)newInvariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION_SUBCLAUSE__INVARIANT, null, msgs);
      msgs = basicSetInvariant(newInvariant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION_SUBCLAUSE__INVARIANT, newInvariant, newInvariant));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION_SUBCLAUSE__ELQ, oldElq, newElq);
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
        msgs = ((InternalEObject)elq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION_SUBCLAUSE__ELQ, null, msgs);
      if (newElq != null)
        msgs = ((InternalEObject)newElq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION_SUBCLAUSE__ELQ, null, msgs);
      msgs = basicSetElq(newElq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION_SUBCLAUSE__ELQ, newElq, newElq));
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
      case BLESSPackage.ACTION_SUBCLAUSE__THROWS_CLAUSE:
        return basicSetThrows_clause(null, msgs);
      case BLESSPackage.ACTION_SUBCLAUSE__ASSERT_CLAUSE:
        return basicSetAssert_clause(null, msgs);
      case BLESSPackage.ACTION_SUBCLAUSE__PRECONDITION:
        return basicSetPrecondition(null, msgs);
      case BLESSPackage.ACTION_SUBCLAUSE__POSTCONDITION:
        return basicSetPostcondition(null, msgs);
      case BLESSPackage.ACTION_SUBCLAUSE__INVARIANT:
        return basicSetInvariant(null, msgs);
      case BLESSPackage.ACTION_SUBCLAUSE__ELQ:
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
      case BLESSPackage.ACTION_SUBCLAUSE__NO_PROOF:
        return isNo_proof();
      case BLESSPackage.ACTION_SUBCLAUSE__THROWS_CLAUSE:
        return getThrows_clause();
      case BLESSPackage.ACTION_SUBCLAUSE__ASSERT_CLAUSE:
        return getAssert_clause();
      case BLESSPackage.ACTION_SUBCLAUSE__PRECONDITION:
        return getPrecondition();
      case BLESSPackage.ACTION_SUBCLAUSE__POSTCONDITION:
        return getPostcondition();
      case BLESSPackage.ACTION_SUBCLAUSE__INVARIANT:
        return getInvariant();
      case BLESSPackage.ACTION_SUBCLAUSE__ELQ:
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
      case BLESSPackage.ACTION_SUBCLAUSE__NO_PROOF:
        setNo_proof((Boolean)newValue);
        return;
      case BLESSPackage.ACTION_SUBCLAUSE__THROWS_CLAUSE:
        setThrows_clause((ThrowsClause)newValue);
        return;
      case BLESSPackage.ACTION_SUBCLAUSE__ASSERT_CLAUSE:
        setAssert_clause((AssertClause)newValue);
        return;
      case BLESSPackage.ACTION_SUBCLAUSE__PRECONDITION:
        setPrecondition((Assertion)newValue);
        return;
      case BLESSPackage.ACTION_SUBCLAUSE__POSTCONDITION:
        setPostcondition((Assertion)newValue);
        return;
      case BLESSPackage.ACTION_SUBCLAUSE__INVARIANT:
        setInvariant((Assertion)newValue);
        return;
      case BLESSPackage.ACTION_SUBCLAUSE__ELQ:
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
      case BLESSPackage.ACTION_SUBCLAUSE__NO_PROOF:
        setNo_proof(NO_PROOF_EDEFAULT);
        return;
      case BLESSPackage.ACTION_SUBCLAUSE__THROWS_CLAUSE:
        setThrows_clause((ThrowsClause)null);
        return;
      case BLESSPackage.ACTION_SUBCLAUSE__ASSERT_CLAUSE:
        setAssert_clause((AssertClause)null);
        return;
      case BLESSPackage.ACTION_SUBCLAUSE__PRECONDITION:
        setPrecondition((Assertion)null);
        return;
      case BLESSPackage.ACTION_SUBCLAUSE__POSTCONDITION:
        setPostcondition((Assertion)null);
        return;
      case BLESSPackage.ACTION_SUBCLAUSE__INVARIANT:
        setInvariant((Assertion)null);
        return;
      case BLESSPackage.ACTION_SUBCLAUSE__ELQ:
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
      case BLESSPackage.ACTION_SUBCLAUSE__NO_PROOF:
        return no_proof != NO_PROOF_EDEFAULT;
      case BLESSPackage.ACTION_SUBCLAUSE__THROWS_CLAUSE:
        return throws_clause != null;
      case BLESSPackage.ACTION_SUBCLAUSE__ASSERT_CLAUSE:
        return assert_clause != null;
      case BLESSPackage.ACTION_SUBCLAUSE__PRECONDITION:
        return precondition != null;
      case BLESSPackage.ACTION_SUBCLAUSE__POSTCONDITION:
        return postcondition != null;
      case BLESSPackage.ACTION_SUBCLAUSE__INVARIANT:
        return invariant != null;
      case BLESSPackage.ACTION_SUBCLAUSE__ELQ:
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
    result.append(" (no_proof: ");
    result.append(no_proof);
    result.append(')');
    return result.toString();
  }

} //ActionSubclauseImpl
