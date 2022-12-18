/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.ConditionalExpression;
import com.multitude.aadl.bless.bLESS.Invocation;
import com.multitude.aadl.bless.bLESS.ParenthesizedSubexpression;
import com.multitude.aadl.bless.bLESS.RecordTerm;
import com.multitude.aadl.bless.bLESS.TimedSubject;
import com.multitude.aadl.bless.bLESS.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.TimedSubjectImpl#getPs <em>Ps</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.TimedSubjectImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.TimedSubjectImpl#getConditional <em>Conditional</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.TimedSubjectImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.TimedSubjectImpl#getInvocation <em>Invocation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimedSubjectImpl extends ElementImpl implements TimedSubject
{
  /**
   * The cached value of the '{@link #getPs() <em>Ps</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPs()
   * @generated
   * @ordered
   */
  protected ParenthesizedSubexpression ps;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Value value;

  /**
   * The cached value of the '{@link #getConditional() <em>Conditional</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditional()
   * @generated
   * @ordered
   */
  protected ConditionalExpression conditional;

  /**
   * The cached value of the '{@link #getRecord() <em>Record</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecord()
   * @generated
   * @ordered
   */
  protected RecordTerm record;

  /**
   * The cached value of the '{@link #getInvocation() <em>Invocation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvocation()
   * @generated
   * @ordered
   */
  protected Invocation invocation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimedSubjectImpl()
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
    return BLESSPackage.eINSTANCE.getTimedSubject();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParenthesizedSubexpression getPs()
  {
    return ps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPs(ParenthesizedSubexpression newPs, NotificationChain msgs)
  {
    ParenthesizedSubexpression oldPs = ps;
    ps = newPs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.TIMED_SUBJECT__PS, oldPs, newPs);
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
  public void setPs(ParenthesizedSubexpression newPs)
  {
    if (newPs != ps)
    {
      NotificationChain msgs = null;
      if (ps != null)
        msgs = ((InternalEObject)ps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.TIMED_SUBJECT__PS, null, msgs);
      if (newPs != null)
        msgs = ((InternalEObject)newPs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.TIMED_SUBJECT__PS, null, msgs);
      msgs = basicSetPs(newPs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.TIMED_SUBJECT__PS, newPs, newPs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Value getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Value newValue, NotificationChain msgs)
  {
    Value oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.TIMED_SUBJECT__VALUE, oldValue, newValue);
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
  public void setValue(Value newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.TIMED_SUBJECT__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.TIMED_SUBJECT__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.TIMED_SUBJECT__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConditionalExpression getConditional()
  {
    return conditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditional(ConditionalExpression newConditional, NotificationChain msgs)
  {
    ConditionalExpression oldConditional = conditional;
    conditional = newConditional;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.TIMED_SUBJECT__CONDITIONAL, oldConditional, newConditional);
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
  public void setConditional(ConditionalExpression newConditional)
  {
    if (newConditional != conditional)
    {
      NotificationChain msgs = null;
      if (conditional != null)
        msgs = ((InternalEObject)conditional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.TIMED_SUBJECT__CONDITIONAL, null, msgs);
      if (newConditional != null)
        msgs = ((InternalEObject)newConditional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.TIMED_SUBJECT__CONDITIONAL, null, msgs);
      msgs = basicSetConditional(newConditional, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.TIMED_SUBJECT__CONDITIONAL, newConditional, newConditional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RecordTerm getRecord()
  {
    return record;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecord(RecordTerm newRecord, NotificationChain msgs)
  {
    RecordTerm oldRecord = record;
    record = newRecord;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.TIMED_SUBJECT__RECORD, oldRecord, newRecord);
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
  public void setRecord(RecordTerm newRecord)
  {
    if (newRecord != record)
    {
      NotificationChain msgs = null;
      if (record != null)
        msgs = ((InternalEObject)record).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.TIMED_SUBJECT__RECORD, null, msgs);
      if (newRecord != null)
        msgs = ((InternalEObject)newRecord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.TIMED_SUBJECT__RECORD, null, msgs);
      msgs = basicSetRecord(newRecord, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.TIMED_SUBJECT__RECORD, newRecord, newRecord));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Invocation getInvocation()
  {
    return invocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInvocation(Invocation newInvocation, NotificationChain msgs)
  {
    Invocation oldInvocation = invocation;
    invocation = newInvocation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.TIMED_SUBJECT__INVOCATION, oldInvocation, newInvocation);
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
  public void setInvocation(Invocation newInvocation)
  {
    if (newInvocation != invocation)
    {
      NotificationChain msgs = null;
      if (invocation != null)
        msgs = ((InternalEObject)invocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.TIMED_SUBJECT__INVOCATION, null, msgs);
      if (newInvocation != null)
        msgs = ((InternalEObject)newInvocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.TIMED_SUBJECT__INVOCATION, null, msgs);
      msgs = basicSetInvocation(newInvocation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.TIMED_SUBJECT__INVOCATION, newInvocation, newInvocation));
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
      case BLESSPackage.TIMED_SUBJECT__PS:
        return basicSetPs(null, msgs);
      case BLESSPackage.TIMED_SUBJECT__VALUE:
        return basicSetValue(null, msgs);
      case BLESSPackage.TIMED_SUBJECT__CONDITIONAL:
        return basicSetConditional(null, msgs);
      case BLESSPackage.TIMED_SUBJECT__RECORD:
        return basicSetRecord(null, msgs);
      case BLESSPackage.TIMED_SUBJECT__INVOCATION:
        return basicSetInvocation(null, msgs);
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
      case BLESSPackage.TIMED_SUBJECT__PS:
        return getPs();
      case BLESSPackage.TIMED_SUBJECT__VALUE:
        return getValue();
      case BLESSPackage.TIMED_SUBJECT__CONDITIONAL:
        return getConditional();
      case BLESSPackage.TIMED_SUBJECT__RECORD:
        return getRecord();
      case BLESSPackage.TIMED_SUBJECT__INVOCATION:
        return getInvocation();
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
      case BLESSPackage.TIMED_SUBJECT__PS:
        setPs((ParenthesizedSubexpression)newValue);
        return;
      case BLESSPackage.TIMED_SUBJECT__VALUE:
        setValue((Value)newValue);
        return;
      case BLESSPackage.TIMED_SUBJECT__CONDITIONAL:
        setConditional((ConditionalExpression)newValue);
        return;
      case BLESSPackage.TIMED_SUBJECT__RECORD:
        setRecord((RecordTerm)newValue);
        return;
      case BLESSPackage.TIMED_SUBJECT__INVOCATION:
        setInvocation((Invocation)newValue);
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
      case BLESSPackage.TIMED_SUBJECT__PS:
        setPs((ParenthesizedSubexpression)null);
        return;
      case BLESSPackage.TIMED_SUBJECT__VALUE:
        setValue((Value)null);
        return;
      case BLESSPackage.TIMED_SUBJECT__CONDITIONAL:
        setConditional((ConditionalExpression)null);
        return;
      case BLESSPackage.TIMED_SUBJECT__RECORD:
        setRecord((RecordTerm)null);
        return;
      case BLESSPackage.TIMED_SUBJECT__INVOCATION:
        setInvocation((Invocation)null);
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
      case BLESSPackage.TIMED_SUBJECT__PS:
        return ps != null;
      case BLESSPackage.TIMED_SUBJECT__VALUE:
        return value != null;
      case BLESSPackage.TIMED_SUBJECT__CONDITIONAL:
        return conditional != null;
      case BLESSPackage.TIMED_SUBJECT__RECORD:
        return record != null;
      case BLESSPackage.TIMED_SUBJECT__INVOCATION:
        return invocation != null;
    }
    return super.eIsSet(featureID);
  }

} //TimedSubjectImpl
