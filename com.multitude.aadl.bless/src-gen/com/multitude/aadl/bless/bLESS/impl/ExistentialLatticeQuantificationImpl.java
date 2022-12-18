/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.ActionTimeout;
import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.BehaviorActions;
import com.multitude.aadl.bless.bLESS.CatchClause;
import com.multitude.aadl.bless.bLESS.ExistentialLatticeQuantification;
import com.multitude.aadl.bless.bLESS.QuantifiedVariables;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Existential Lattice Quantification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ExistentialLatticeQuantificationImpl#getQuantified_variables <em>Quantified variables</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ExistentialLatticeQuantificationImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ExistentialLatticeQuantificationImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ExistentialLatticeQuantificationImpl#getCatch_clause <em>Catch clause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExistentialLatticeQuantificationImpl extends ElementImpl implements ExistentialLatticeQuantification
{
  /**
   * The cached value of the '{@link #getQuantified_variables() <em>Quantified variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantified_variables()
   * @generated
   * @ordered
   */
  protected QuantifiedVariables quantified_variables;

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
   * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeout()
   * @generated
   * @ordered
   */
  protected ActionTimeout timeout;

  /**
   * The cached value of the '{@link #getCatch_clause() <em>Catch clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCatch_clause()
   * @generated
   * @ordered
   */
  protected CatchClause catch_clause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExistentialLatticeQuantificationImpl()
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
    return BLESSPackage.eINSTANCE.getExistentialLatticeQuantification();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QuantifiedVariables getQuantified_variables()
  {
    return quantified_variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuantified_variables(QuantifiedVariables newQuantified_variables, NotificationChain msgs)
  {
    QuantifiedVariables oldQuantified_variables = quantified_variables;
    quantified_variables = newQuantified_variables;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__QUANTIFIED_VARIABLES, oldQuantified_variables, newQuantified_variables);
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
  public void setQuantified_variables(QuantifiedVariables newQuantified_variables)
  {
    if (newQuantified_variables != quantified_variables)
    {
      NotificationChain msgs = null;
      if (quantified_variables != null)
        msgs = ((InternalEObject)quantified_variables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__QUANTIFIED_VARIABLES, null, msgs);
      if (newQuantified_variables != null)
        msgs = ((InternalEObject)newQuantified_variables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__QUANTIFIED_VARIABLES, null, msgs);
      msgs = basicSetQuantified_variables(newQuantified_variables, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__QUANTIFIED_VARIABLES, newQuantified_variables, newQuantified_variables));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__ACTIONS, oldActions, newActions);
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
        msgs = ((InternalEObject)actions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__ACTIONS, null, msgs);
      if (newActions != null)
        msgs = ((InternalEObject)newActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__ACTIONS, null, msgs);
      msgs = basicSetActions(newActions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__ACTIONS, newActions, newActions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionTimeout getTimeout()
  {
    return timeout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimeout(ActionTimeout newTimeout, NotificationChain msgs)
  {
    ActionTimeout oldTimeout = timeout;
    timeout = newTimeout;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__TIMEOUT, oldTimeout, newTimeout);
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
  public void setTimeout(ActionTimeout newTimeout)
  {
    if (newTimeout != timeout)
    {
      NotificationChain msgs = null;
      if (timeout != null)
        msgs = ((InternalEObject)timeout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__TIMEOUT, null, msgs);
      if (newTimeout != null)
        msgs = ((InternalEObject)newTimeout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__TIMEOUT, null, msgs);
      msgs = basicSetTimeout(newTimeout, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__TIMEOUT, newTimeout, newTimeout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CatchClause getCatch_clause()
  {
    return catch_clause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCatch_clause(CatchClause newCatch_clause, NotificationChain msgs)
  {
    CatchClause oldCatch_clause = catch_clause;
    catch_clause = newCatch_clause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__CATCH_CLAUSE, oldCatch_clause, newCatch_clause);
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
  public void setCatch_clause(CatchClause newCatch_clause)
  {
    if (newCatch_clause != catch_clause)
    {
      NotificationChain msgs = null;
      if (catch_clause != null)
        msgs = ((InternalEObject)catch_clause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__CATCH_CLAUSE, null, msgs);
      if (newCatch_clause != null)
        msgs = ((InternalEObject)newCatch_clause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__CATCH_CLAUSE, null, msgs);
      msgs = basicSetCatch_clause(newCatch_clause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__CATCH_CLAUSE, newCatch_clause, newCatch_clause));
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
      case BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__QUANTIFIED_VARIABLES:
        return basicSetQuantified_variables(null, msgs);
      case BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__ACTIONS:
        return basicSetActions(null, msgs);
      case BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__TIMEOUT:
        return basicSetTimeout(null, msgs);
      case BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__CATCH_CLAUSE:
        return basicSetCatch_clause(null, msgs);
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
      case BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__QUANTIFIED_VARIABLES:
        return getQuantified_variables();
      case BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__ACTIONS:
        return getActions();
      case BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__TIMEOUT:
        return getTimeout();
      case BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__CATCH_CLAUSE:
        return getCatch_clause();
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
      case BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__QUANTIFIED_VARIABLES:
        setQuantified_variables((QuantifiedVariables)newValue);
        return;
      case BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__ACTIONS:
        setActions((BehaviorActions)newValue);
        return;
      case BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__TIMEOUT:
        setTimeout((ActionTimeout)newValue);
        return;
      case BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__CATCH_CLAUSE:
        setCatch_clause((CatchClause)newValue);
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
      case BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__QUANTIFIED_VARIABLES:
        setQuantified_variables((QuantifiedVariables)null);
        return;
      case BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__ACTIONS:
        setActions((BehaviorActions)null);
        return;
      case BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__TIMEOUT:
        setTimeout((ActionTimeout)null);
        return;
      case BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__CATCH_CLAUSE:
        setCatch_clause((CatchClause)null);
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
      case BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__QUANTIFIED_VARIABLES:
        return quantified_variables != null;
      case BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__ACTIONS:
        return actions != null;
      case BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__TIMEOUT:
        return timeout != null;
      case BLESSPackage.EXISTENTIAL_LATTICE_QUANTIFICATION__CATCH_CLAUSE:
        return catch_clause != null;
    }
    return super.eIsSet(featureID);
  }

} //ExistentialLatticeQuantificationImpl
