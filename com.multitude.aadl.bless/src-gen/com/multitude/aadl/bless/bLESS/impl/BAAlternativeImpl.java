/**
 * (C) Multitude Corporation 2021
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BAAlternative;
import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.BehaviorActions;
import com.multitude.aadl.bless.bLESS.ElseAlternative;
import com.multitude.aadl.bless.bLESS.ElseifAlternative;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BA Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BAAlternativeImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BAAlternativeImpl#getElseifalt <em>Elseifalt</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.BAAlternativeImpl#getElsealt <em>Elsealt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BAAlternativeImpl extends ElementImpl implements BAAlternative
{
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
   * The cached value of the '{@link #getElseifalt() <em>Elseifalt</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseifalt()
   * @generated
   * @ordered
   */
  protected EList<ElseifAlternative> elseifalt;

  /**
   * The cached value of the '{@link #getElsealt() <em>Elsealt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElsealt()
   * @generated
   * @ordered
   */
  protected ElseAlternative elsealt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BAAlternativeImpl()
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
    return BLESSPackage.eINSTANCE.getBAAlternative();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.BA_ALTERNATIVE__ACTIONS, oldActions, newActions);
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
        msgs = ((InternalEObject)actions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BA_ALTERNATIVE__ACTIONS, null, msgs);
      if (newActions != null)
        msgs = ((InternalEObject)newActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BA_ALTERNATIVE__ACTIONS, null, msgs);
      msgs = basicSetActions(newActions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.BA_ALTERNATIVE__ACTIONS, newActions, newActions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ElseifAlternative> getElseifalt()
  {
    if (elseifalt == null)
    {
      elseifalt = new EObjectContainmentEList<ElseifAlternative>(ElseifAlternative.class, this, BLESSPackage.BA_ALTERNATIVE__ELSEIFALT);
    }
    return elseifalt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ElseAlternative getElsealt()
  {
    return elsealt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElsealt(ElseAlternative newElsealt, NotificationChain msgs)
  {
    ElseAlternative oldElsealt = elsealt;
    elsealt = newElsealt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.BA_ALTERNATIVE__ELSEALT, oldElsealt, newElsealt);
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
  public void setElsealt(ElseAlternative newElsealt)
  {
    if (newElsealt != elsealt)
    {
      NotificationChain msgs = null;
      if (elsealt != null)
        msgs = ((InternalEObject)elsealt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BA_ALTERNATIVE__ELSEALT, null, msgs);
      if (newElsealt != null)
        msgs = ((InternalEObject)newElsealt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.BA_ALTERNATIVE__ELSEALT, null, msgs);
      msgs = basicSetElsealt(newElsealt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.BA_ALTERNATIVE__ELSEALT, newElsealt, newElsealt));
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
      case BLESSPackage.BA_ALTERNATIVE__ACTIONS:
        return basicSetActions(null, msgs);
      case BLESSPackage.BA_ALTERNATIVE__ELSEIFALT:
        return ((InternalEList<?>)getElseifalt()).basicRemove(otherEnd, msgs);
      case BLESSPackage.BA_ALTERNATIVE__ELSEALT:
        return basicSetElsealt(null, msgs);
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
      case BLESSPackage.BA_ALTERNATIVE__ACTIONS:
        return getActions();
      case BLESSPackage.BA_ALTERNATIVE__ELSEIFALT:
        return getElseifalt();
      case BLESSPackage.BA_ALTERNATIVE__ELSEALT:
        return getElsealt();
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
      case BLESSPackage.BA_ALTERNATIVE__ACTIONS:
        setActions((BehaviorActions)newValue);
        return;
      case BLESSPackage.BA_ALTERNATIVE__ELSEIFALT:
        getElseifalt().clear();
        getElseifalt().addAll((Collection<? extends ElseifAlternative>)newValue);
        return;
      case BLESSPackage.BA_ALTERNATIVE__ELSEALT:
        setElsealt((ElseAlternative)newValue);
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
      case BLESSPackage.BA_ALTERNATIVE__ACTIONS:
        setActions((BehaviorActions)null);
        return;
      case BLESSPackage.BA_ALTERNATIVE__ELSEIFALT:
        getElseifalt().clear();
        return;
      case BLESSPackage.BA_ALTERNATIVE__ELSEALT:
        setElsealt((ElseAlternative)null);
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
      case BLESSPackage.BA_ALTERNATIVE__ACTIONS:
        return actions != null;
      case BLESSPackage.BA_ALTERNATIVE__ELSEIFALT:
        return elseifalt != null && !elseifalt.isEmpty();
      case BLESSPackage.BA_ALTERNATIVE__ELSEALT:
        return elsealt != null;
    }
    return super.eIsSet(featureID);
  }

} //BAAlternativeImpl
