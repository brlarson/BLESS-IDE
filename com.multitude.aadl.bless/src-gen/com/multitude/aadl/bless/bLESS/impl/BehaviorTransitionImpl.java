/**
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.33.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.Assertion;
import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.BehaviorActions;
import com.multitude.aadl.bless.bLESS.BehaviorState;
import com.multitude.aadl.bless.bLESS.BehaviorTransition;
import com.multitude.aadl.bless.bLESS.DispatchCondition;
import com.multitude.aadl.bless.bLESS.ExecuteCondition;
import com.multitude.aadl.bless.bLESS.InternalCondition;
import com.multitude.aadl.bless.bLESS.ModeCondition;
import com.multitude.aadl.bless.bLESS.Priority;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.osate.aadl2.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BehaviorTransitionImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BehaviorTransitionImpl#getColon <em>Colon</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BehaviorTransitionImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BehaviorTransitionImpl#getDispatch <em>Dispatch</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BehaviorTransitionImpl#getExecute <em>Execute</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BehaviorTransitionImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BehaviorTransitionImpl#getInternal <em>Internal</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BehaviorTransitionImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BehaviorTransitionImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BehaviorTransitionImpl#getAss <em>Ass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorTransitionImpl extends NamedElementImpl implements BehaviorTransition
{
  /**
   * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected Priority priority;

  /**
   * The default value of the '{@link #getColon() <em>Colon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColon()
   * @generated
   * @ordered
   */
  protected static final String COLON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColon() <em>Colon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColon()
   * @generated
   * @ordered
   */
  protected String colon = COLON_EDEFAULT;

  /**
   * The cached value of the '{@link #getSources() <em>Sources</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSources()
   * @generated
   * @ordered
   */
  protected EList<BehaviorState> sources;

  /**
   * The cached value of the '{@link #getDispatch() <em>Dispatch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDispatch()
   * @generated
   * @ordered
   */
  protected DispatchCondition dispatch;

  /**
   * The cached value of the '{@link #getExecute() <em>Execute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecute()
   * @generated
   * @ordered
   */
  protected ExecuteCondition execute;

  /**
   * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMode()
   * @generated
   * @ordered
   */
  protected ModeCondition mode;

  /**
   * The cached value of the '{@link #getInternal() <em>Internal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInternal()
   * @generated
   * @ordered
   */
  protected InternalCondition internal;

  /**
   * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected BehaviorState destination;

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
   * The cached value of the '{@link #getAss() <em>Ass</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAss()
   * @generated
   * @ordered
   */
  protected Assertion ass;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BehaviorTransitionImpl()
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
    return BLESSPackage.eINSTANCE.getBehaviorTransition();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Priority getPriority()
  {
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPriority(Priority newPriority, NotificationChain msgs)
  {
    Priority oldPriority = priority;
    priority = newPriority;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.BEHAVIOR_TRANSITION__PRIORITY, oldPriority, newPriority);
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
  public void setPriority(Priority newPriority)
  {
    if (newPriority != priority)
    {
      NotificationChain msgs = null;
      if (priority != null)
        msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BEHAVIOR_TRANSITION__PRIORITY, null, msgs);
      if (newPriority != null)
        msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BEHAVIOR_TRANSITION__PRIORITY, null, msgs);
      msgs = basicSetPriority(newPriority, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.BEHAVIOR_TRANSITION__PRIORITY, newPriority, newPriority));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getColon()
  {
    return colon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setColon(String newColon)
  {
    String oldColon = colon;
    colon = newColon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.BEHAVIOR_TRANSITION__COLON, oldColon, colon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<BehaviorState> getSources()
  {
    if (sources == null)
    {
      sources = new EObjectResolvingEList<BehaviorState>(BehaviorState.class, this, BLESSPackage.BEHAVIOR_TRANSITION__SOURCES);
    }
    return sources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DispatchCondition getDispatch()
  {
    return dispatch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDispatch(DispatchCondition newDispatch, NotificationChain msgs)
  {
    DispatchCondition oldDispatch = dispatch;
    dispatch = newDispatch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.BEHAVIOR_TRANSITION__DISPATCH, oldDispatch, newDispatch);
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
  public void setDispatch(DispatchCondition newDispatch)
  {
    if (newDispatch != dispatch)
    {
      NotificationChain msgs = null;
      if (dispatch != null)
        msgs = ((InternalEObject)dispatch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BEHAVIOR_TRANSITION__DISPATCH, null, msgs);
      if (newDispatch != null)
        msgs = ((InternalEObject)newDispatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BEHAVIOR_TRANSITION__DISPATCH, null, msgs);
      msgs = basicSetDispatch(newDispatch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.BEHAVIOR_TRANSITION__DISPATCH, newDispatch, newDispatch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExecuteCondition getExecute()
  {
    return execute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExecute(ExecuteCondition newExecute, NotificationChain msgs)
  {
    ExecuteCondition oldExecute = execute;
    execute = newExecute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.BEHAVIOR_TRANSITION__EXECUTE, oldExecute, newExecute);
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
  public void setExecute(ExecuteCondition newExecute)
  {
    if (newExecute != execute)
    {
      NotificationChain msgs = null;
      if (execute != null)
        msgs = ((InternalEObject)execute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BEHAVIOR_TRANSITION__EXECUTE, null, msgs);
      if (newExecute != null)
        msgs = ((InternalEObject)newExecute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BEHAVIOR_TRANSITION__EXECUTE, null, msgs);
      msgs = basicSetExecute(newExecute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.BEHAVIOR_TRANSITION__EXECUTE, newExecute, newExecute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModeCondition getMode()
  {
    return mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMode(ModeCondition newMode, NotificationChain msgs)
  {
    ModeCondition oldMode = mode;
    mode = newMode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.BEHAVIOR_TRANSITION__MODE, oldMode, newMode);
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
  public void setMode(ModeCondition newMode)
  {
    if (newMode != mode)
    {
      NotificationChain msgs = null;
      if (mode != null)
        msgs = ((InternalEObject)mode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BEHAVIOR_TRANSITION__MODE, null, msgs);
      if (newMode != null)
        msgs = ((InternalEObject)newMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BEHAVIOR_TRANSITION__MODE, null, msgs);
      msgs = basicSetMode(newMode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.BEHAVIOR_TRANSITION__MODE, newMode, newMode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InternalCondition getInternal()
  {
    return internal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInternal(InternalCondition newInternal, NotificationChain msgs)
  {
    InternalCondition oldInternal = internal;
    internal = newInternal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.BEHAVIOR_TRANSITION__INTERNAL, oldInternal, newInternal);
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
  public void setInternal(InternalCondition newInternal)
  {
    if (newInternal != internal)
    {
      NotificationChain msgs = null;
      if (internal != null)
        msgs = ((InternalEObject)internal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BEHAVIOR_TRANSITION__INTERNAL, null, msgs);
      if (newInternal != null)
        msgs = ((InternalEObject)newInternal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BEHAVIOR_TRANSITION__INTERNAL, null, msgs);
      msgs = basicSetInternal(newInternal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.BEHAVIOR_TRANSITION__INTERNAL, newInternal, newInternal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BehaviorState getDestination()
  {
    if (destination != null && destination.eIsProxy())
    {
      InternalEObject oldDestination = (InternalEObject)destination;
      destination = (BehaviorState)eResolveProxy(oldDestination);
      if (destination != oldDestination)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BLESSPackage.BEHAVIOR_TRANSITION__DESTINATION, oldDestination, destination));
      }
    }
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorState basicGetDestination()
  {
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDestination(BehaviorState newDestination)
  {
    BehaviorState oldDestination = destination;
    destination = newDestination;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.BEHAVIOR_TRANSITION__DESTINATION, oldDestination, destination));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.BEHAVIOR_TRANSITION__ACTIONS, oldActions, newActions);
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
        msgs = ((InternalEObject)actions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BEHAVIOR_TRANSITION__ACTIONS, null, msgs);
      if (newActions != null)
        msgs = ((InternalEObject)newActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BEHAVIOR_TRANSITION__ACTIONS, null, msgs);
      msgs = basicSetActions(newActions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.BEHAVIOR_TRANSITION__ACTIONS, newActions, newActions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Assertion getAss()
  {
    return ass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAss(Assertion newAss, NotificationChain msgs)
  {
    Assertion oldAss = ass;
    ass = newAss;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.BEHAVIOR_TRANSITION__ASS, oldAss, newAss);
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
  public void setAss(Assertion newAss)
  {
    if (newAss != ass)
    {
      NotificationChain msgs = null;
      if (ass != null)
        msgs = ((InternalEObject)ass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BEHAVIOR_TRANSITION__ASS, null, msgs);
      if (newAss != null)
        msgs = ((InternalEObject)newAss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BEHAVIOR_TRANSITION__ASS, null, msgs);
      msgs = basicSetAss(newAss, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.BEHAVIOR_TRANSITION__ASS, newAss, newAss));
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
      case BLESSPackage.BEHAVIOR_TRANSITION__PRIORITY:
        return basicSetPriority(null, msgs);
      case BLESSPackage.BEHAVIOR_TRANSITION__DISPATCH:
        return basicSetDispatch(null, msgs);
      case BLESSPackage.BEHAVIOR_TRANSITION__EXECUTE:
        return basicSetExecute(null, msgs);
      case BLESSPackage.BEHAVIOR_TRANSITION__MODE:
        return basicSetMode(null, msgs);
      case BLESSPackage.BEHAVIOR_TRANSITION__INTERNAL:
        return basicSetInternal(null, msgs);
      case BLESSPackage.BEHAVIOR_TRANSITION__ACTIONS:
        return basicSetActions(null, msgs);
      case BLESSPackage.BEHAVIOR_TRANSITION__ASS:
        return basicSetAss(null, msgs);
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
      case BLESSPackage.BEHAVIOR_TRANSITION__PRIORITY:
        return getPriority();
      case BLESSPackage.BEHAVIOR_TRANSITION__COLON:
        return getColon();
      case BLESSPackage.BEHAVIOR_TRANSITION__SOURCES:
        return getSources();
      case BLESSPackage.BEHAVIOR_TRANSITION__DISPATCH:
        return getDispatch();
      case BLESSPackage.BEHAVIOR_TRANSITION__EXECUTE:
        return getExecute();
      case BLESSPackage.BEHAVIOR_TRANSITION__MODE:
        return getMode();
      case BLESSPackage.BEHAVIOR_TRANSITION__INTERNAL:
        return getInternal();
      case BLESSPackage.BEHAVIOR_TRANSITION__DESTINATION:
        if (resolve) return getDestination();
        return basicGetDestination();
      case BLESSPackage.BEHAVIOR_TRANSITION__ACTIONS:
        return getActions();
      case BLESSPackage.BEHAVIOR_TRANSITION__ASS:
        return getAss();
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
      case BLESSPackage.BEHAVIOR_TRANSITION__PRIORITY:
        setPriority((Priority)newValue);
        return;
      case BLESSPackage.BEHAVIOR_TRANSITION__COLON:
        setColon((String)newValue);
        return;
      case BLESSPackage.BEHAVIOR_TRANSITION__SOURCES:
        getSources().clear();
        getSources().addAll((Collection<? extends BehaviorState>)newValue);
        return;
      case BLESSPackage.BEHAVIOR_TRANSITION__DISPATCH:
        setDispatch((DispatchCondition)newValue);
        return;
      case BLESSPackage.BEHAVIOR_TRANSITION__EXECUTE:
        setExecute((ExecuteCondition)newValue);
        return;
      case BLESSPackage.BEHAVIOR_TRANSITION__MODE:
        setMode((ModeCondition)newValue);
        return;
      case BLESSPackage.BEHAVIOR_TRANSITION__INTERNAL:
        setInternal((InternalCondition)newValue);
        return;
      case BLESSPackage.BEHAVIOR_TRANSITION__DESTINATION:
        setDestination((BehaviorState)newValue);
        return;
      case BLESSPackage.BEHAVIOR_TRANSITION__ACTIONS:
        setActions((BehaviorActions)newValue);
        return;
      case BLESSPackage.BEHAVIOR_TRANSITION__ASS:
        setAss((Assertion)newValue);
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
      case BLESSPackage.BEHAVIOR_TRANSITION__PRIORITY:
        setPriority((Priority)null);
        return;
      case BLESSPackage.BEHAVIOR_TRANSITION__COLON:
        setColon(COLON_EDEFAULT);
        return;
      case BLESSPackage.BEHAVIOR_TRANSITION__SOURCES:
        getSources().clear();
        return;
      case BLESSPackage.BEHAVIOR_TRANSITION__DISPATCH:
        setDispatch((DispatchCondition)null);
        return;
      case BLESSPackage.BEHAVIOR_TRANSITION__EXECUTE:
        setExecute((ExecuteCondition)null);
        return;
      case BLESSPackage.BEHAVIOR_TRANSITION__MODE:
        setMode((ModeCondition)null);
        return;
      case BLESSPackage.BEHAVIOR_TRANSITION__INTERNAL:
        setInternal((InternalCondition)null);
        return;
      case BLESSPackage.BEHAVIOR_TRANSITION__DESTINATION:
        setDestination((BehaviorState)null);
        return;
      case BLESSPackage.BEHAVIOR_TRANSITION__ACTIONS:
        setActions((BehaviorActions)null);
        return;
      case BLESSPackage.BEHAVIOR_TRANSITION__ASS:
        setAss((Assertion)null);
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
      case BLESSPackage.BEHAVIOR_TRANSITION__PRIORITY:
        return priority != null;
      case BLESSPackage.BEHAVIOR_TRANSITION__COLON:
        return COLON_EDEFAULT == null ? colon != null : !COLON_EDEFAULT.equals(colon);
      case BLESSPackage.BEHAVIOR_TRANSITION__SOURCES:
        return sources != null && !sources.isEmpty();
      case BLESSPackage.BEHAVIOR_TRANSITION__DISPATCH:
        return dispatch != null;
      case BLESSPackage.BEHAVIOR_TRANSITION__EXECUTE:
        return execute != null;
      case BLESSPackage.BEHAVIOR_TRANSITION__MODE:
        return mode != null;
      case BLESSPackage.BEHAVIOR_TRANSITION__INTERNAL:
        return internal != null;
      case BLESSPackage.BEHAVIOR_TRANSITION__DESTINATION:
        return destination != null;
      case BLESSPackage.BEHAVIOR_TRANSITION__ACTIONS:
        return actions != null;
      case BLESSPackage.BEHAVIOR_TRANSITION__ASS:
        return ass != null;
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
    result.append(" (colon: ");
    result.append(colon);
    result.append(')');
    return result.toString();
  }

} //BehaviorTransitionImpl
