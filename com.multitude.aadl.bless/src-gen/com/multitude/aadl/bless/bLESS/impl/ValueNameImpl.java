/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.FunctionParameters;
import com.multitude.aadl.bless.bLESS.IndexExpressionOrRange;
import com.multitude.aadl.bless.bLESS.PartialName;
import com.multitude.aadl.bless.bLESS.ValueName;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.NamedElement;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ValueNameImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ValueNameImpl#isLp <em>Lp</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ValueNameImpl#getPr <em>Pr</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ValueNameImpl#isLb <em>Lb</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ValueNameImpl#getArray_index <em>Array index</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ValueNameImpl#isDot <em>Dot</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ValueNameImpl#getPn <em>Pn</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ValueNameImpl#isQ <em>Q</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ValueNameImpl#isFresh <em>Fresh</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ValueNameImpl#isCount <em>Count</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ValueNameImpl#isUpdated <em>Updated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueNameImpl extends ElementImpl implements ValueName
{
  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected NamedElement id;

  /**
   * The default value of the '{@link #isLp() <em>Lp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLp()
   * @generated
   * @ordered
   */
  protected static final boolean LP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLp() <em>Lp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLp()
   * @generated
   * @ordered
   */
  protected boolean lp = LP_EDEFAULT;

  /**
   * The cached value of the '{@link #getPr() <em>Pr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPr()
   * @generated
   * @ordered
   */
  protected FunctionParameters pr;

  /**
   * The default value of the '{@link #isLb() <em>Lb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLb()
   * @generated
   * @ordered
   */
  protected static final boolean LB_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLb() <em>Lb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLb()
   * @generated
   * @ordered
   */
  protected boolean lb = LB_EDEFAULT;

  /**
   * The cached value of the '{@link #getArray_index() <em>Array index</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArray_index()
   * @generated
   * @ordered
   */
  protected EList<IndexExpressionOrRange> array_index;

  /**
   * The default value of the '{@link #isDot() <em>Dot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDot()
   * @generated
   * @ordered
   */
  protected static final boolean DOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDot() <em>Dot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDot()
   * @generated
   * @ordered
   */
  protected boolean dot = DOT_EDEFAULT;

  /**
   * The cached value of the '{@link #getPn() <em>Pn</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPn()
   * @generated
   * @ordered
   */
  protected EList<PartialName> pn;

  /**
   * The default value of the '{@link #isQ() <em>Q</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isQ()
   * @generated
   * @ordered
   */
  protected static final boolean Q_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isQ() <em>Q</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isQ()
   * @generated
   * @ordered
   */
  protected boolean q = Q_EDEFAULT;

  /**
   * The default value of the '{@link #isFresh() <em>Fresh</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFresh()
   * @generated
   * @ordered
   */
  protected static final boolean FRESH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFresh() <em>Fresh</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFresh()
   * @generated
   * @ordered
   */
  protected boolean fresh = FRESH_EDEFAULT;

  /**
   * The default value of the '{@link #isCount() <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCount()
   * @generated
   * @ordered
   */
  protected static final boolean COUNT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCount() <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCount()
   * @generated
   * @ordered
   */
  protected boolean count = COUNT_EDEFAULT;

  /**
   * The default value of the '{@link #isUpdated() <em>Updated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUpdated()
   * @generated
   * @ordered
   */
  protected static final boolean UPDATED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUpdated() <em>Updated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUpdated()
   * @generated
   * @ordered
   */
  protected boolean updated = UPDATED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValueNameImpl()
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
    return BLESSPackage.eINSTANCE.getValueName();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NamedElement getId()
  {
    if (id != null && ((EObject)id).eIsProxy())
    {
      InternalEObject oldId = (InternalEObject)id;
      id = (NamedElement)eResolveProxy(oldId);
      if (id != oldId)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BLESSPackage.VALUE_NAME__ID, oldId, id));
      }
    }
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement basicGetId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setId(NamedElement newId)
  {
    NamedElement oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.VALUE_NAME__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isLp()
  {
    return lp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLp(boolean newLp)
  {
    boolean oldLp = lp;
    lp = newLp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.VALUE_NAME__LP, oldLp, lp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionParameters getPr()
  {
    return pr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPr(FunctionParameters newPr, NotificationChain msgs)
  {
    FunctionParameters oldPr = pr;
    pr = newPr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.VALUE_NAME__PR, oldPr, newPr);
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
  public void setPr(FunctionParameters newPr)
  {
    if (newPr != pr)
    {
      NotificationChain msgs = null;
      if (pr != null)
        msgs = ((InternalEObject)pr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.VALUE_NAME__PR, null, msgs);
      if (newPr != null)
        msgs = ((InternalEObject)newPr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.VALUE_NAME__PR, null, msgs);
      msgs = basicSetPr(newPr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.VALUE_NAME__PR, newPr, newPr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isLb()
  {
    return lb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLb(boolean newLb)
  {
    boolean oldLb = lb;
    lb = newLb;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.VALUE_NAME__LB, oldLb, lb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<IndexExpressionOrRange> getArray_index()
  {
    if (array_index == null)
    {
      array_index = new EObjectContainmentEList<IndexExpressionOrRange>(IndexExpressionOrRange.class, this, BLESSPackage.VALUE_NAME__ARRAY_INDEX);
    }
    return array_index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isDot()
  {
    return dot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDot(boolean newDot)
  {
    boolean oldDot = dot;
    dot = newDot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.VALUE_NAME__DOT, oldDot, dot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PartialName> getPn()
  {
    if (pn == null)
    {
      pn = new EObjectContainmentEList<PartialName>(PartialName.class, this, BLESSPackage.VALUE_NAME__PN);
    }
    return pn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isQ()
  {
    return q;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setQ(boolean newQ)
  {
    boolean oldQ = q;
    q = newQ;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.VALUE_NAME__Q, oldQ, q));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFresh()
  {
    return fresh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFresh(boolean newFresh)
  {
    boolean oldFresh = fresh;
    fresh = newFresh;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.VALUE_NAME__FRESH, oldFresh, fresh));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isCount()
  {
    return count;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCount(boolean newCount)
  {
    boolean oldCount = count;
    count = newCount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.VALUE_NAME__COUNT, oldCount, count));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isUpdated()
  {
    return updated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUpdated(boolean newUpdated)
  {
    boolean oldUpdated = updated;
    updated = newUpdated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.VALUE_NAME__UPDATED, oldUpdated, updated));
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
      case BLESSPackage.VALUE_NAME__PR:
        return basicSetPr(null, msgs);
      case BLESSPackage.VALUE_NAME__ARRAY_INDEX:
        return ((InternalEList<?>)getArray_index()).basicRemove(otherEnd, msgs);
      case BLESSPackage.VALUE_NAME__PN:
        return ((InternalEList<?>)getPn()).basicRemove(otherEnd, msgs);
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
      case BLESSPackage.VALUE_NAME__ID:
        if (resolve) return getId();
        return basicGetId();
      case BLESSPackage.VALUE_NAME__LP:
        return isLp();
      case BLESSPackage.VALUE_NAME__PR:
        return getPr();
      case BLESSPackage.VALUE_NAME__LB:
        return isLb();
      case BLESSPackage.VALUE_NAME__ARRAY_INDEX:
        return getArray_index();
      case BLESSPackage.VALUE_NAME__DOT:
        return isDot();
      case BLESSPackage.VALUE_NAME__PN:
        return getPn();
      case BLESSPackage.VALUE_NAME__Q:
        return isQ();
      case BLESSPackage.VALUE_NAME__FRESH:
        return isFresh();
      case BLESSPackage.VALUE_NAME__COUNT:
        return isCount();
      case BLESSPackage.VALUE_NAME__UPDATED:
        return isUpdated();
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
      case BLESSPackage.VALUE_NAME__ID:
        setId((NamedElement)newValue);
        return;
      case BLESSPackage.VALUE_NAME__LP:
        setLp((Boolean)newValue);
        return;
      case BLESSPackage.VALUE_NAME__PR:
        setPr((FunctionParameters)newValue);
        return;
      case BLESSPackage.VALUE_NAME__LB:
        setLb((Boolean)newValue);
        return;
      case BLESSPackage.VALUE_NAME__ARRAY_INDEX:
        getArray_index().clear();
        getArray_index().addAll((Collection<? extends IndexExpressionOrRange>)newValue);
        return;
      case BLESSPackage.VALUE_NAME__DOT:
        setDot((Boolean)newValue);
        return;
      case BLESSPackage.VALUE_NAME__PN:
        getPn().clear();
        getPn().addAll((Collection<? extends PartialName>)newValue);
        return;
      case BLESSPackage.VALUE_NAME__Q:
        setQ((Boolean)newValue);
        return;
      case BLESSPackage.VALUE_NAME__FRESH:
        setFresh((Boolean)newValue);
        return;
      case BLESSPackage.VALUE_NAME__COUNT:
        setCount((Boolean)newValue);
        return;
      case BLESSPackage.VALUE_NAME__UPDATED:
        setUpdated((Boolean)newValue);
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
      case BLESSPackage.VALUE_NAME__ID:
        setId((NamedElement)null);
        return;
      case BLESSPackage.VALUE_NAME__LP:
        setLp(LP_EDEFAULT);
        return;
      case BLESSPackage.VALUE_NAME__PR:
        setPr((FunctionParameters)null);
        return;
      case BLESSPackage.VALUE_NAME__LB:
        setLb(LB_EDEFAULT);
        return;
      case BLESSPackage.VALUE_NAME__ARRAY_INDEX:
        getArray_index().clear();
        return;
      case BLESSPackage.VALUE_NAME__DOT:
        setDot(DOT_EDEFAULT);
        return;
      case BLESSPackage.VALUE_NAME__PN:
        getPn().clear();
        return;
      case BLESSPackage.VALUE_NAME__Q:
        setQ(Q_EDEFAULT);
        return;
      case BLESSPackage.VALUE_NAME__FRESH:
        setFresh(FRESH_EDEFAULT);
        return;
      case BLESSPackage.VALUE_NAME__COUNT:
        setCount(COUNT_EDEFAULT);
        return;
      case BLESSPackage.VALUE_NAME__UPDATED:
        setUpdated(UPDATED_EDEFAULT);
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
      case BLESSPackage.VALUE_NAME__ID:
        return id != null;
      case BLESSPackage.VALUE_NAME__LP:
        return lp != LP_EDEFAULT;
      case BLESSPackage.VALUE_NAME__PR:
        return pr != null;
      case BLESSPackage.VALUE_NAME__LB:
        return lb != LB_EDEFAULT;
      case BLESSPackage.VALUE_NAME__ARRAY_INDEX:
        return array_index != null && !array_index.isEmpty();
      case BLESSPackage.VALUE_NAME__DOT:
        return dot != DOT_EDEFAULT;
      case BLESSPackage.VALUE_NAME__PN:
        return pn != null && !pn.isEmpty();
      case BLESSPackage.VALUE_NAME__Q:
        return q != Q_EDEFAULT;
      case BLESSPackage.VALUE_NAME__FRESH:
        return fresh != FRESH_EDEFAULT;
      case BLESSPackage.VALUE_NAME__COUNT:
        return count != COUNT_EDEFAULT;
      case BLESSPackage.VALUE_NAME__UPDATED:
        return updated != UPDATED_EDEFAULT;
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
    result.append(" (lp: ");
    result.append(lp);
    result.append(", lb: ");
    result.append(lb);
    result.append(", dot: ");
    result.append(dot);
    result.append(", q: ");
    result.append(q);
    result.append(", fresh: ");
    result.append(fresh);
    result.append(", count: ");
    result.append(count);
    result.append(", updated: ");
    result.append(updated);
    result.append(')');
    return result.toString();
  }

} //ValueNameImpl
