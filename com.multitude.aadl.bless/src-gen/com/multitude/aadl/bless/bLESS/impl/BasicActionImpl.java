/**
 * (C) Multitude Corporation 2021
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.Assignment;
import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.BasicAction;
import com.multitude.aadl.bless.bLESS.CombinableOperation;
import com.multitude.aadl.bless.bLESS.CommunicationAction;
import com.multitude.aadl.bless.bLESS.Computation;
import com.multitude.aadl.bless.bLESS.IssueException;
import com.multitude.aadl.bless.bLESS.SimultaneousAssignment;
import com.multitude.aadl.bless.bLESS.WhenThrow;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.Mode;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BasicActionImpl#getSkip <em>Skip</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BasicActionImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BasicActionImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BasicActionImpl#getWhen <em>When</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BasicActionImpl#getComb <em>Comb</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BasicActionImpl#getCommunication <em>Communication</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BasicActionImpl#getComputation <em>Computation</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BasicActionImpl#getMulti_assign <em>Multi assign</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BasicActionImpl#getExc <em>Exc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicActionImpl extends ElementImpl implements BasicAction
{
  /**
   * The default value of the '{@link #getSkip() <em>Skip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSkip()
   * @generated
   * @ordered
   */
  protected static final String SKIP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSkip() <em>Skip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSkip()
   * @generated
   * @ordered
   */
  protected String skip = SKIP_EDEFAULT;

  /**
   * The cached value of the '{@link #getAssign() <em>Assign</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssign()
   * @generated
   * @ordered
   */
  protected Assignment assign;

  /**
   * The cached value of the '{@link #getMode() <em>Mode</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMode()
   * @generated
   * @ordered
   */
  protected Mode mode;

  /**
   * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhen()
   * @generated
   * @ordered
   */
  protected WhenThrow when;

  /**
   * The cached value of the '{@link #getComb() <em>Comb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComb()
   * @generated
   * @ordered
   */
  protected CombinableOperation comb;

  /**
   * The cached value of the '{@link #getCommunication() <em>Communication</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommunication()
   * @generated
   * @ordered
   */
  protected CommunicationAction communication;

  /**
   * The cached value of the '{@link #getComputation() <em>Computation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComputation()
   * @generated
   * @ordered
   */
  protected Computation computation;

  /**
   * The cached value of the '{@link #getMulti_assign() <em>Multi assign</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMulti_assign()
   * @generated
   * @ordered
   */
  protected SimultaneousAssignment multi_assign;

  /**
   * The cached value of the '{@link #getExc() <em>Exc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExc()
   * @generated
   * @ordered
   */
  protected IssueException exc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BasicActionImpl()
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
    return BLESSPackage.eINSTANCE.getBasicAction();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSkip()
  {
    return skip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSkip(String newSkip)
  {
    String oldSkip = skip;
    skip = newSkip;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.BASIC_ACTION__SKIP, oldSkip, skip));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Assignment getAssign()
  {
    return assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssign(Assignment newAssign, NotificationChain msgs)
  {
    Assignment oldAssign = assign;
    assign = newAssign;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.BASIC_ACTION__ASSIGN, oldAssign, newAssign);
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
  public void setAssign(Assignment newAssign)
  {
    if (newAssign != assign)
    {
      NotificationChain msgs = null;
      if (assign != null)
        msgs = ((InternalEObject)assign).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BASIC_ACTION__ASSIGN, null, msgs);
      if (newAssign != null)
        msgs = ((InternalEObject)newAssign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BASIC_ACTION__ASSIGN, null, msgs);
      msgs = basicSetAssign(newAssign, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.BASIC_ACTION__ASSIGN, newAssign, newAssign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mode getMode()
  {
    if (mode != null && ((EObject)mode).eIsProxy())
    {
      InternalEObject oldMode = (InternalEObject)mode;
      mode = (Mode)eResolveProxy(oldMode);
      if (mode != oldMode)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BLESSPackage.BASIC_ACTION__MODE, oldMode, mode));
      }
    }
    return mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mode basicGetMode()
  {
    return mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMode(Mode newMode)
  {
    Mode oldMode = mode;
    mode = newMode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.BASIC_ACTION__MODE, oldMode, mode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WhenThrow getWhen()
  {
    return when;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhen(WhenThrow newWhen, NotificationChain msgs)
  {
    WhenThrow oldWhen = when;
    when = newWhen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.BASIC_ACTION__WHEN, oldWhen, newWhen);
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
  public void setWhen(WhenThrow newWhen)
  {
    if (newWhen != when)
    {
      NotificationChain msgs = null;
      if (when != null)
        msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BASIC_ACTION__WHEN, null, msgs);
      if (newWhen != null)
        msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BASIC_ACTION__WHEN, null, msgs);
      msgs = basicSetWhen(newWhen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.BASIC_ACTION__WHEN, newWhen, newWhen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CombinableOperation getComb()
  {
    return comb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComb(CombinableOperation newComb, NotificationChain msgs)
  {
    CombinableOperation oldComb = comb;
    comb = newComb;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.BASIC_ACTION__COMB, oldComb, newComb);
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
  public void setComb(CombinableOperation newComb)
  {
    if (newComb != comb)
    {
      NotificationChain msgs = null;
      if (comb != null)
        msgs = ((InternalEObject)comb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BASIC_ACTION__COMB, null, msgs);
      if (newComb != null)
        msgs = ((InternalEObject)newComb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BASIC_ACTION__COMB, null, msgs);
      msgs = basicSetComb(newComb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.BASIC_ACTION__COMB, newComb, newComb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CommunicationAction getCommunication()
  {
    return communication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCommunication(CommunicationAction newCommunication, NotificationChain msgs)
  {
    CommunicationAction oldCommunication = communication;
    communication = newCommunication;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.BASIC_ACTION__COMMUNICATION, oldCommunication, newCommunication);
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
  public void setCommunication(CommunicationAction newCommunication)
  {
    if (newCommunication != communication)
    {
      NotificationChain msgs = null;
      if (communication != null)
        msgs = ((InternalEObject)communication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BASIC_ACTION__COMMUNICATION, null, msgs);
      if (newCommunication != null)
        msgs = ((InternalEObject)newCommunication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BASIC_ACTION__COMMUNICATION, null, msgs);
      msgs = basicSetCommunication(newCommunication, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.BASIC_ACTION__COMMUNICATION, newCommunication, newCommunication));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Computation getComputation()
  {
    return computation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComputation(Computation newComputation, NotificationChain msgs)
  {
    Computation oldComputation = computation;
    computation = newComputation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.BASIC_ACTION__COMPUTATION, oldComputation, newComputation);
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
  public void setComputation(Computation newComputation)
  {
    if (newComputation != computation)
    {
      NotificationChain msgs = null;
      if (computation != null)
        msgs = ((InternalEObject)computation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BASIC_ACTION__COMPUTATION, null, msgs);
      if (newComputation != null)
        msgs = ((InternalEObject)newComputation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BASIC_ACTION__COMPUTATION, null, msgs);
      msgs = basicSetComputation(newComputation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.BASIC_ACTION__COMPUTATION, newComputation, newComputation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimultaneousAssignment getMulti_assign()
  {
    return multi_assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMulti_assign(SimultaneousAssignment newMulti_assign, NotificationChain msgs)
  {
    SimultaneousAssignment oldMulti_assign = multi_assign;
    multi_assign = newMulti_assign;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.BASIC_ACTION__MULTI_ASSIGN, oldMulti_assign, newMulti_assign);
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
  public void setMulti_assign(SimultaneousAssignment newMulti_assign)
  {
    if (newMulti_assign != multi_assign)
    {
      NotificationChain msgs = null;
      if (multi_assign != null)
        msgs = ((InternalEObject)multi_assign).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BASIC_ACTION__MULTI_ASSIGN, null, msgs);
      if (newMulti_assign != null)
        msgs = ((InternalEObject)newMulti_assign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BASIC_ACTION__MULTI_ASSIGN, null, msgs);
      msgs = basicSetMulti_assign(newMulti_assign, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.BASIC_ACTION__MULTI_ASSIGN, newMulti_assign, newMulti_assign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IssueException getExc()
  {
    return exc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExc(IssueException newExc, NotificationChain msgs)
  {
    IssueException oldExc = exc;
    exc = newExc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.BASIC_ACTION__EXC, oldExc, newExc);
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
  public void setExc(IssueException newExc)
  {
    if (newExc != exc)
    {
      NotificationChain msgs = null;
      if (exc != null)
        msgs = ((InternalEObject)exc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BASIC_ACTION__EXC, null, msgs);
      if (newExc != null)
        msgs = ((InternalEObject)newExc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BASIC_ACTION__EXC, null, msgs);
      msgs = basicSetExc(newExc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.BASIC_ACTION__EXC, newExc, newExc));
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
      case BLESSPackage.BASIC_ACTION__ASSIGN:
        return basicSetAssign(null, msgs);
      case BLESSPackage.BASIC_ACTION__WHEN:
        return basicSetWhen(null, msgs);
      case BLESSPackage.BASIC_ACTION__COMB:
        return basicSetComb(null, msgs);
      case BLESSPackage.BASIC_ACTION__COMMUNICATION:
        return basicSetCommunication(null, msgs);
      case BLESSPackage.BASIC_ACTION__COMPUTATION:
        return basicSetComputation(null, msgs);
      case BLESSPackage.BASIC_ACTION__MULTI_ASSIGN:
        return basicSetMulti_assign(null, msgs);
      case BLESSPackage.BASIC_ACTION__EXC:
        return basicSetExc(null, msgs);
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
      case BLESSPackage.BASIC_ACTION__SKIP:
        return getSkip();
      case BLESSPackage.BASIC_ACTION__ASSIGN:
        return getAssign();
      case BLESSPackage.BASIC_ACTION__MODE:
        if (resolve) return getMode();
        return basicGetMode();
      case BLESSPackage.BASIC_ACTION__WHEN:
        return getWhen();
      case BLESSPackage.BASIC_ACTION__COMB:
        return getComb();
      case BLESSPackage.BASIC_ACTION__COMMUNICATION:
        return getCommunication();
      case BLESSPackage.BASIC_ACTION__COMPUTATION:
        return getComputation();
      case BLESSPackage.BASIC_ACTION__MULTI_ASSIGN:
        return getMulti_assign();
      case BLESSPackage.BASIC_ACTION__EXC:
        return getExc();
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
      case BLESSPackage.BASIC_ACTION__SKIP:
        setSkip((String)newValue);
        return;
      case BLESSPackage.BASIC_ACTION__ASSIGN:
        setAssign((Assignment)newValue);
        return;
      case BLESSPackage.BASIC_ACTION__MODE:
        setMode((Mode)newValue);
        return;
      case BLESSPackage.BASIC_ACTION__WHEN:
        setWhen((WhenThrow)newValue);
        return;
      case BLESSPackage.BASIC_ACTION__COMB:
        setComb((CombinableOperation)newValue);
        return;
      case BLESSPackage.BASIC_ACTION__COMMUNICATION:
        setCommunication((CommunicationAction)newValue);
        return;
      case BLESSPackage.BASIC_ACTION__COMPUTATION:
        setComputation((Computation)newValue);
        return;
      case BLESSPackage.BASIC_ACTION__MULTI_ASSIGN:
        setMulti_assign((SimultaneousAssignment)newValue);
        return;
      case BLESSPackage.BASIC_ACTION__EXC:
        setExc((IssueException)newValue);
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
      case BLESSPackage.BASIC_ACTION__SKIP:
        setSkip(SKIP_EDEFAULT);
        return;
      case BLESSPackage.BASIC_ACTION__ASSIGN:
        setAssign((Assignment)null);
        return;
      case BLESSPackage.BASIC_ACTION__MODE:
        setMode((Mode)null);
        return;
      case BLESSPackage.BASIC_ACTION__WHEN:
        setWhen((WhenThrow)null);
        return;
      case BLESSPackage.BASIC_ACTION__COMB:
        setComb((CombinableOperation)null);
        return;
      case BLESSPackage.BASIC_ACTION__COMMUNICATION:
        setCommunication((CommunicationAction)null);
        return;
      case BLESSPackage.BASIC_ACTION__COMPUTATION:
        setComputation((Computation)null);
        return;
      case BLESSPackage.BASIC_ACTION__MULTI_ASSIGN:
        setMulti_assign((SimultaneousAssignment)null);
        return;
      case BLESSPackage.BASIC_ACTION__EXC:
        setExc((IssueException)null);
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
      case BLESSPackage.BASIC_ACTION__SKIP:
        return SKIP_EDEFAULT == null ? skip != null : !SKIP_EDEFAULT.equals(skip);
      case BLESSPackage.BASIC_ACTION__ASSIGN:
        return assign != null;
      case BLESSPackage.BASIC_ACTION__MODE:
        return mode != null;
      case BLESSPackage.BASIC_ACTION__WHEN:
        return when != null;
      case BLESSPackage.BASIC_ACTION__COMB:
        return comb != null;
      case BLESSPackage.BASIC_ACTION__COMMUNICATION:
        return communication != null;
      case BLESSPackage.BASIC_ACTION__COMPUTATION:
        return computation != null;
      case BLESSPackage.BASIC_ACTION__MULTI_ASSIGN:
        return multi_assign != null;
      case BLESSPackage.BASIC_ACTION__EXC:
        return exc != null;
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
    result.append(" (skip: ");
    result.append(skip);
    result.append(')');
    return result.toString();
  }

} //BasicActionImpl