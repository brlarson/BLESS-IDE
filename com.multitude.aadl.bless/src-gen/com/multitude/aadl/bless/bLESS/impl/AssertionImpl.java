/**
 * (C) Multitude Corporation 2021
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.Assertion;
import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.NamedAssertion;
import com.multitude.aadl.bless.bLESS.NamelessAssertion;
import com.multitude.aadl.bless.bLESS.NamelessEnumeration;
import com.multitude.aadl.bless.bLESS.NamelessFunction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.AssertionImpl#getNamedassertion <em>Namedassertion</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.AssertionImpl#getNamelessassertion <em>Namelessassertion</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.AssertionImpl#getNamelessfunction <em>Namelessfunction</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.AssertionImpl#getNamelessenumeration <em>Namelessenumeration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssertionImpl extends ElementImpl implements Assertion
{
  /**
   * The cached value of the '{@link #getNamedassertion() <em>Namedassertion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamedassertion()
   * @generated
   * @ordered
   */
  protected NamedAssertion namedassertion;

  /**
   * The cached value of the '{@link #getNamelessassertion() <em>Namelessassertion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamelessassertion()
   * @generated
   * @ordered
   */
  protected NamelessAssertion namelessassertion;

  /**
   * The cached value of the '{@link #getNamelessfunction() <em>Namelessfunction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamelessfunction()
   * @generated
   * @ordered
   */
  protected NamelessFunction namelessfunction;

  /**
   * The cached value of the '{@link #getNamelessenumeration() <em>Namelessenumeration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamelessenumeration()
   * @generated
   * @ordered
   */
  protected NamelessEnumeration namelessenumeration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertionImpl()
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
    return BLESSPackage.eINSTANCE.getAssertion();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NamedAssertion getNamedassertion()
  {
    return namedassertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamedassertion(NamedAssertion newNamedassertion, NotificationChain msgs)
  {
    NamedAssertion oldNamedassertion = namedassertion;
    namedassertion = newNamedassertion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSERTION__NAMEDASSERTION, oldNamedassertion, newNamedassertion);
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
  public void setNamedassertion(NamedAssertion newNamedassertion)
  {
    if (newNamedassertion != namedassertion)
    {
      NotificationChain msgs = null;
      if (namedassertion != null)
        msgs = ((InternalEObject)namedassertion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSERTION__NAMEDASSERTION, null, msgs);
      if (newNamedassertion != null)
        msgs = ((InternalEObject)newNamedassertion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSERTION__NAMEDASSERTION, null, msgs);
      msgs = basicSetNamedassertion(newNamedassertion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSERTION__NAMEDASSERTION, newNamedassertion, newNamedassertion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NamelessAssertion getNamelessassertion()
  {
    return namelessassertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamelessassertion(NamelessAssertion newNamelessassertion, NotificationChain msgs)
  {
    NamelessAssertion oldNamelessassertion = namelessassertion;
    namelessassertion = newNamelessassertion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSERTION__NAMELESSASSERTION, oldNamelessassertion, newNamelessassertion);
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
  public void setNamelessassertion(NamelessAssertion newNamelessassertion)
  {
    if (newNamelessassertion != namelessassertion)
    {
      NotificationChain msgs = null;
      if (namelessassertion != null)
        msgs = ((InternalEObject)namelessassertion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSERTION__NAMELESSASSERTION, null, msgs);
      if (newNamelessassertion != null)
        msgs = ((InternalEObject)newNamelessassertion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSERTION__NAMELESSASSERTION, null, msgs);
      msgs = basicSetNamelessassertion(newNamelessassertion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSERTION__NAMELESSASSERTION, newNamelessassertion, newNamelessassertion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NamelessFunction getNamelessfunction()
  {
    return namelessfunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamelessfunction(NamelessFunction newNamelessfunction, NotificationChain msgs)
  {
    NamelessFunction oldNamelessfunction = namelessfunction;
    namelessfunction = newNamelessfunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSERTION__NAMELESSFUNCTION, oldNamelessfunction, newNamelessfunction);
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
  public void setNamelessfunction(NamelessFunction newNamelessfunction)
  {
    if (newNamelessfunction != namelessfunction)
    {
      NotificationChain msgs = null;
      if (namelessfunction != null)
        msgs = ((InternalEObject)namelessfunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSERTION__NAMELESSFUNCTION, null, msgs);
      if (newNamelessfunction != null)
        msgs = ((InternalEObject)newNamelessfunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSERTION__NAMELESSFUNCTION, null, msgs);
      msgs = basicSetNamelessfunction(newNamelessfunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSERTION__NAMELESSFUNCTION, newNamelessfunction, newNamelessfunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NamelessEnumeration getNamelessenumeration()
  {
    return namelessenumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamelessenumeration(NamelessEnumeration newNamelessenumeration, NotificationChain msgs)
  {
    NamelessEnumeration oldNamelessenumeration = namelessenumeration;
    namelessenumeration = newNamelessenumeration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSERTION__NAMELESSENUMERATION, oldNamelessenumeration, newNamelessenumeration);
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
  public void setNamelessenumeration(NamelessEnumeration newNamelessenumeration)
  {
    if (newNamelessenumeration != namelessenumeration)
    {
      NotificationChain msgs = null;
      if (namelessenumeration != null)
        msgs = ((InternalEObject)namelessenumeration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSERTION__NAMELESSENUMERATION, null, msgs);
      if (newNamelessenumeration != null)
        msgs = ((InternalEObject)newNamelessenumeration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ASSERTION__NAMELESSENUMERATION, null, msgs);
      msgs = basicSetNamelessenumeration(newNamelessenumeration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ASSERTION__NAMELESSENUMERATION, newNamelessenumeration, newNamelessenumeration));
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
      case BLESSPackage.ASSERTION__NAMEDASSERTION:
        return basicSetNamedassertion(null, msgs);
      case BLESSPackage.ASSERTION__NAMELESSASSERTION:
        return basicSetNamelessassertion(null, msgs);
      case BLESSPackage.ASSERTION__NAMELESSFUNCTION:
        return basicSetNamelessfunction(null, msgs);
      case BLESSPackage.ASSERTION__NAMELESSENUMERATION:
        return basicSetNamelessenumeration(null, msgs);
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
      case BLESSPackage.ASSERTION__NAMEDASSERTION:
        return getNamedassertion();
      case BLESSPackage.ASSERTION__NAMELESSASSERTION:
        return getNamelessassertion();
      case BLESSPackage.ASSERTION__NAMELESSFUNCTION:
        return getNamelessfunction();
      case BLESSPackage.ASSERTION__NAMELESSENUMERATION:
        return getNamelessenumeration();
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
      case BLESSPackage.ASSERTION__NAMEDASSERTION:
        setNamedassertion((NamedAssertion)newValue);
        return;
      case BLESSPackage.ASSERTION__NAMELESSASSERTION:
        setNamelessassertion((NamelessAssertion)newValue);
        return;
      case BLESSPackage.ASSERTION__NAMELESSFUNCTION:
        setNamelessfunction((NamelessFunction)newValue);
        return;
      case BLESSPackage.ASSERTION__NAMELESSENUMERATION:
        setNamelessenumeration((NamelessEnumeration)newValue);
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
      case BLESSPackage.ASSERTION__NAMEDASSERTION:
        setNamedassertion((NamedAssertion)null);
        return;
      case BLESSPackage.ASSERTION__NAMELESSASSERTION:
        setNamelessassertion((NamelessAssertion)null);
        return;
      case BLESSPackage.ASSERTION__NAMELESSFUNCTION:
        setNamelessfunction((NamelessFunction)null);
        return;
      case BLESSPackage.ASSERTION__NAMELESSENUMERATION:
        setNamelessenumeration((NamelessEnumeration)null);
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
      case BLESSPackage.ASSERTION__NAMEDASSERTION:
        return namedassertion != null;
      case BLESSPackage.ASSERTION__NAMELESSASSERTION:
        return namelessassertion != null;
      case BLESSPackage.ASSERTION__NAMELESSFUNCTION:
        return namelessfunction != null;
      case BLESSPackage.ASSERTION__NAMELESSENUMERATION:
        return namelessenumeration != null;
    }
    return super.eIsSet(featureID);
  }

} //AssertionImpl
