/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.Action;
import com.multitude.aadl.bless.bLESS.Alternative;
import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.BasicAction;
import com.multitude.aadl.bless.bLESS.DoUntilLoop;
import com.multitude.aadl.bless.bLESS.ExistentialLatticeQuantification;
import com.multitude.aadl.bless.bLESS.ForLoop;
import com.multitude.aadl.bless.bLESS.LockingAction;
import com.multitude.aadl.bless.bLESS.UniversalLatticeQuantification;
import com.multitude.aadl.bless.bLESS.WhileLoop;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ActionImpl#getBasic <em>Basic</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ActionImpl#getIf_fi <em>If fi</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ActionImpl#getWl <em>Wl</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ActionImpl#getFl <em>Fl</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ActionImpl#getDu <em>Du</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ActionImpl#getElq <em>Elq</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ActionImpl#getUlq <em>Ulq</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ActionImpl#getLa <em>La</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends ElementImpl implements Action
{
  /**
   * The cached value of the '{@link #getBasic() <em>Basic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasic()
   * @generated
   * @ordered
   */
  protected BasicAction basic;

  /**
   * The cached value of the '{@link #getIf_fi() <em>If fi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIf_fi()
   * @generated
   * @ordered
   */
  protected Alternative if_fi;

  /**
   * The cached value of the '{@link #getWl() <em>Wl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWl()
   * @generated
   * @ordered
   */
  protected WhileLoop wl;

  /**
   * The cached value of the '{@link #getFl() <em>Fl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFl()
   * @generated
   * @ordered
   */
  protected ForLoop fl;

  /**
   * The cached value of the '{@link #getDu() <em>Du</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDu()
   * @generated
   * @ordered
   */
  protected DoUntilLoop du;

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
   * The cached value of the '{@link #getUlq() <em>Ulq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUlq()
   * @generated
   * @ordered
   */
  protected UniversalLatticeQuantification ulq;

  /**
   * The cached value of the '{@link #getLa() <em>La</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLa()
   * @generated
   * @ordered
   */
  protected LockingAction la;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return BLESSPackage.eINSTANCE.getAction();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BasicAction getBasic()
  {
    return basic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBasic(BasicAction newBasic, NotificationChain msgs)
  {
    BasicAction oldBasic = basic;
    basic = newBasic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION__BASIC, oldBasic, newBasic);
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
  public void setBasic(BasicAction newBasic)
  {
    if (newBasic != basic)
    {
      NotificationChain msgs = null;
      if (basic != null)
        msgs = ((InternalEObject)basic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION__BASIC, null, msgs);
      if (newBasic != null)
        msgs = ((InternalEObject)newBasic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION__BASIC, null, msgs);
      msgs = basicSetBasic(newBasic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION__BASIC, newBasic, newBasic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Alternative getIf_fi()
  {
    return if_fi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIf_fi(Alternative newIf_fi, NotificationChain msgs)
  {
    Alternative oldIf_fi = if_fi;
    if_fi = newIf_fi;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION__IF_FI, oldIf_fi, newIf_fi);
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
  public void setIf_fi(Alternative newIf_fi)
  {
    if (newIf_fi != if_fi)
    {
      NotificationChain msgs = null;
      if (if_fi != null)
        msgs = ((InternalEObject)if_fi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION__IF_FI, null, msgs);
      if (newIf_fi != null)
        msgs = ((InternalEObject)newIf_fi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION__IF_FI, null, msgs);
      msgs = basicSetIf_fi(newIf_fi, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION__IF_FI, newIf_fi, newIf_fi));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WhileLoop getWl()
  {
    return wl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWl(WhileLoop newWl, NotificationChain msgs)
  {
    WhileLoop oldWl = wl;
    wl = newWl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION__WL, oldWl, newWl);
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
  public void setWl(WhileLoop newWl)
  {
    if (newWl != wl)
    {
      NotificationChain msgs = null;
      if (wl != null)
        msgs = ((InternalEObject)wl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION__WL, null, msgs);
      if (newWl != null)
        msgs = ((InternalEObject)newWl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION__WL, null, msgs);
      msgs = basicSetWl(newWl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION__WL, newWl, newWl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ForLoop getFl()
  {
    return fl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFl(ForLoop newFl, NotificationChain msgs)
  {
    ForLoop oldFl = fl;
    fl = newFl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION__FL, oldFl, newFl);
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
  public void setFl(ForLoop newFl)
  {
    if (newFl != fl)
    {
      NotificationChain msgs = null;
      if (fl != null)
        msgs = ((InternalEObject)fl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION__FL, null, msgs);
      if (newFl != null)
        msgs = ((InternalEObject)newFl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION__FL, null, msgs);
      msgs = basicSetFl(newFl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION__FL, newFl, newFl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DoUntilLoop getDu()
  {
    return du;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDu(DoUntilLoop newDu, NotificationChain msgs)
  {
    DoUntilLoop oldDu = du;
    du = newDu;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION__DU, oldDu, newDu);
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
  public void setDu(DoUntilLoop newDu)
  {
    if (newDu != du)
    {
      NotificationChain msgs = null;
      if (du != null)
        msgs = ((InternalEObject)du).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION__DU, null, msgs);
      if (newDu != null)
        msgs = ((InternalEObject)newDu).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION__DU, null, msgs);
      msgs = basicSetDu(newDu, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION__DU, newDu, newDu));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION__ELQ, oldElq, newElq);
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
        msgs = ((InternalEObject)elq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION__ELQ, null, msgs);
      if (newElq != null)
        msgs = ((InternalEObject)newElq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION__ELQ, null, msgs);
      msgs = basicSetElq(newElq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION__ELQ, newElq, newElq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UniversalLatticeQuantification getUlq()
  {
    return ulq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUlq(UniversalLatticeQuantification newUlq, NotificationChain msgs)
  {
    UniversalLatticeQuantification oldUlq = ulq;
    ulq = newUlq;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION__ULQ, oldUlq, newUlq);
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
  public void setUlq(UniversalLatticeQuantification newUlq)
  {
    if (newUlq != ulq)
    {
      NotificationChain msgs = null;
      if (ulq != null)
        msgs = ((InternalEObject)ulq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION__ULQ, null, msgs);
      if (newUlq != null)
        msgs = ((InternalEObject)newUlq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION__ULQ, null, msgs);
      msgs = basicSetUlq(newUlq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION__ULQ, newUlq, newUlq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LockingAction getLa()
  {
    return la;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLa(LockingAction newLa, NotificationChain msgs)
  {
    LockingAction oldLa = la;
    la = newLa;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION__LA, oldLa, newLa);
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
  public void setLa(LockingAction newLa)
  {
    if (newLa != la)
    {
      NotificationChain msgs = null;
      if (la != null)
        msgs = ((InternalEObject)la).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION__LA, null, msgs);
      if (newLa != null)
        msgs = ((InternalEObject)newLa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ACTION__LA, null, msgs);
      msgs = basicSetLa(newLa, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ACTION__LA, newLa, newLa));
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
      case BLESSPackage.ACTION__BASIC:
        return basicSetBasic(null, msgs);
      case BLESSPackage.ACTION__IF_FI:
        return basicSetIf_fi(null, msgs);
      case BLESSPackage.ACTION__WL:
        return basicSetWl(null, msgs);
      case BLESSPackage.ACTION__FL:
        return basicSetFl(null, msgs);
      case BLESSPackage.ACTION__DU:
        return basicSetDu(null, msgs);
      case BLESSPackage.ACTION__ELQ:
        return basicSetElq(null, msgs);
      case BLESSPackage.ACTION__ULQ:
        return basicSetUlq(null, msgs);
      case BLESSPackage.ACTION__LA:
        return basicSetLa(null, msgs);
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
      case BLESSPackage.ACTION__BASIC:
        return getBasic();
      case BLESSPackage.ACTION__IF_FI:
        return getIf_fi();
      case BLESSPackage.ACTION__WL:
        return getWl();
      case BLESSPackage.ACTION__FL:
        return getFl();
      case BLESSPackage.ACTION__DU:
        return getDu();
      case BLESSPackage.ACTION__ELQ:
        return getElq();
      case BLESSPackage.ACTION__ULQ:
        return getUlq();
      case BLESSPackage.ACTION__LA:
        return getLa();
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
      case BLESSPackage.ACTION__BASIC:
        setBasic((BasicAction)newValue);
        return;
      case BLESSPackage.ACTION__IF_FI:
        setIf_fi((Alternative)newValue);
        return;
      case BLESSPackage.ACTION__WL:
        setWl((WhileLoop)newValue);
        return;
      case BLESSPackage.ACTION__FL:
        setFl((ForLoop)newValue);
        return;
      case BLESSPackage.ACTION__DU:
        setDu((DoUntilLoop)newValue);
        return;
      case BLESSPackage.ACTION__ELQ:
        setElq((ExistentialLatticeQuantification)newValue);
        return;
      case BLESSPackage.ACTION__ULQ:
        setUlq((UniversalLatticeQuantification)newValue);
        return;
      case BLESSPackage.ACTION__LA:
        setLa((LockingAction)newValue);
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
      case BLESSPackage.ACTION__BASIC:
        setBasic((BasicAction)null);
        return;
      case BLESSPackage.ACTION__IF_FI:
        setIf_fi((Alternative)null);
        return;
      case BLESSPackage.ACTION__WL:
        setWl((WhileLoop)null);
        return;
      case BLESSPackage.ACTION__FL:
        setFl((ForLoop)null);
        return;
      case BLESSPackage.ACTION__DU:
        setDu((DoUntilLoop)null);
        return;
      case BLESSPackage.ACTION__ELQ:
        setElq((ExistentialLatticeQuantification)null);
        return;
      case BLESSPackage.ACTION__ULQ:
        setUlq((UniversalLatticeQuantification)null);
        return;
      case BLESSPackage.ACTION__LA:
        setLa((LockingAction)null);
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
      case BLESSPackage.ACTION__BASIC:
        return basic != null;
      case BLESSPackage.ACTION__IF_FI:
        return if_fi != null;
      case BLESSPackage.ACTION__WL:
        return wl != null;
      case BLESSPackage.ACTION__FL:
        return fl != null;
      case BLESSPackage.ACTION__DU:
        return du != null;
      case BLESSPackage.ACTION__ELQ:
        return elq != null;
      case BLESSPackage.ACTION__ULQ:
        return ulq != null;
      case BLESSPackage.ACTION__LA:
        return la != null;
    }
    return super.eIsSet(featureID);
  }

} //ActionImpl
