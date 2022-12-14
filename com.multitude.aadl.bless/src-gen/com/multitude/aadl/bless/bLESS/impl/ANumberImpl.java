/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.ANumber;
import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.PropertyReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.PropertyConstant;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ANumber</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ANumberImpl#getLit <em>Lit</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ANumberImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ANumberImpl#getPropertyConstant <em>Property Constant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ANumberImpl extends ElementImpl implements ANumber
{
  /**
   * The default value of the '{@link #getLit() <em>Lit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLit()
   * @generated
   * @ordered
   */
  protected static final String LIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLit() <em>Lit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLit()
   * @generated
   * @ordered
   */
  protected String lit = LIT_EDEFAULT;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected PropertyReference property;

  /**
   * The cached value of the '{@link #getPropertyConstant() <em>Property Constant</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyConstant()
   * @generated
   * @ordered
   */
  protected PropertyConstant propertyConstant;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ANumberImpl()
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
    return BLESSPackage.eINSTANCE.getANumber();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLit()
  {
    return lit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLit(String newLit)
  {
    String oldLit = lit;
    lit = newLit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ANUMBER__LIT, oldLit, lit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyReference getProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperty(PropertyReference newProperty, NotificationChain msgs)
  {
    PropertyReference oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.ANUMBER__PROPERTY, oldProperty, newProperty);
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
  public void setProperty(PropertyReference newProperty)
  {
    if (newProperty != property)
    {
      NotificationChain msgs = null;
      if (property != null)
        msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ANUMBER__PROPERTY, null, msgs);
      if (newProperty != null)
        msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.ANUMBER__PROPERTY, null, msgs);
      msgs = basicSetProperty(newProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ANUMBER__PROPERTY, newProperty, newProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyConstant getPropertyConstant()
  {
    if (propertyConstant != null && ((EObject)propertyConstant).eIsProxy())
    {
      InternalEObject oldPropertyConstant = (InternalEObject)propertyConstant;
      propertyConstant = (PropertyConstant)eResolveProxy(oldPropertyConstant);
      if (propertyConstant != oldPropertyConstant)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BLESSPackage.ANUMBER__PROPERTY_CONSTANT, oldPropertyConstant, propertyConstant));
      }
    }
    return propertyConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyConstant basicGetPropertyConstant()
  {
    return propertyConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPropertyConstant(PropertyConstant newPropertyConstant)
  {
    PropertyConstant oldPropertyConstant = propertyConstant;
    propertyConstant = newPropertyConstant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.ANUMBER__PROPERTY_CONSTANT, oldPropertyConstant, propertyConstant));
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
      case BLESSPackage.ANUMBER__PROPERTY:
        return basicSetProperty(null, msgs);
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
      case BLESSPackage.ANUMBER__LIT:
        return getLit();
      case BLESSPackage.ANUMBER__PROPERTY:
        return getProperty();
      case BLESSPackage.ANUMBER__PROPERTY_CONSTANT:
        if (resolve) return getPropertyConstant();
        return basicGetPropertyConstant();
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
      case BLESSPackage.ANUMBER__LIT:
        setLit((String)newValue);
        return;
      case BLESSPackage.ANUMBER__PROPERTY:
        setProperty((PropertyReference)newValue);
        return;
      case BLESSPackage.ANUMBER__PROPERTY_CONSTANT:
        setPropertyConstant((PropertyConstant)newValue);
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
      case BLESSPackage.ANUMBER__LIT:
        setLit(LIT_EDEFAULT);
        return;
      case BLESSPackage.ANUMBER__PROPERTY:
        setProperty((PropertyReference)null);
        return;
      case BLESSPackage.ANUMBER__PROPERTY_CONSTANT:
        setPropertyConstant((PropertyConstant)null);
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
      case BLESSPackage.ANUMBER__LIT:
        return LIT_EDEFAULT == null ? lit != null : !LIT_EDEFAULT.equals(lit);
      case BLESSPackage.ANUMBER__PROPERTY:
        return property != null;
      case BLESSPackage.ANUMBER__PROPERTY_CONSTANT:
        return propertyConstant != null;
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
    result.append(" (lit: ");
    result.append(lit);
    result.append(')');
    return result.toString();
  }

} //ANumberImpl
