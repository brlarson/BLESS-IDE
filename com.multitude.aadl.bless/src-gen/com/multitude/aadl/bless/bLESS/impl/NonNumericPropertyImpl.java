/**
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.33.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.NonNumericProperty;
import com.multitude.aadl.bless.bLESS.PropertyReference;
import com.multitude.aadl.bless.bLESS.TypeOrReference;

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
 * An implementation of the model object '<em><b>Non Numeric Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.NonNumericPropertyImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.NonNumericPropertyImpl#getPropertyConstant <em>Property Constant</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.NonNumericPropertyImpl#getTod <em>Tod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NonNumericPropertyImpl extends ElementImpl implements NonNumericProperty
{
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
   * The cached value of the '{@link #getTod() <em>Tod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTod()
   * @generated
   * @ordered
   */
  protected TypeOrReference tod;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonNumericPropertyImpl()
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
    return BLESSPackage.eINSTANCE.getNonNumericProperty();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.NON_NUMERIC_PROPERTY__PROPERTY, oldProperty, newProperty);
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
        msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.NON_NUMERIC_PROPERTY__PROPERTY, null, msgs);
      if (newProperty != null)
        msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.NON_NUMERIC_PROPERTY__PROPERTY, null, msgs);
      msgs = basicSetProperty(newProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.NON_NUMERIC_PROPERTY__PROPERTY, newProperty, newProperty));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BLESSPackage.NON_NUMERIC_PROPERTY__PROPERTY_CONSTANT, oldPropertyConstant, propertyConstant));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.NON_NUMERIC_PROPERTY__PROPERTY_CONSTANT, oldPropertyConstant, propertyConstant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeOrReference getTod()
  {
    return tod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTod(TypeOrReference newTod, NotificationChain msgs)
  {
    TypeOrReference oldTod = tod;
    tod = newTod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.NON_NUMERIC_PROPERTY__TOD, oldTod, newTod);
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
  public void setTod(TypeOrReference newTod)
  {
    if (newTod != tod)
    {
      NotificationChain msgs = null;
      if (tod != null)
        msgs = ((InternalEObject)tod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.NON_NUMERIC_PROPERTY__TOD, null, msgs);
      if (newTod != null)
        msgs = ((InternalEObject)newTod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.NON_NUMERIC_PROPERTY__TOD, null, msgs);
      msgs = basicSetTod(newTod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.NON_NUMERIC_PROPERTY__TOD, newTod, newTod));
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
      case BLESSPackage.NON_NUMERIC_PROPERTY__PROPERTY:
        return basicSetProperty(null, msgs);
      case BLESSPackage.NON_NUMERIC_PROPERTY__TOD:
        return basicSetTod(null, msgs);
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
      case BLESSPackage.NON_NUMERIC_PROPERTY__PROPERTY:
        return getProperty();
      case BLESSPackage.NON_NUMERIC_PROPERTY__PROPERTY_CONSTANT:
        if (resolve) return getPropertyConstant();
        return basicGetPropertyConstant();
      case BLESSPackage.NON_NUMERIC_PROPERTY__TOD:
        return getTod();
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
      case BLESSPackage.NON_NUMERIC_PROPERTY__PROPERTY:
        setProperty((PropertyReference)newValue);
        return;
      case BLESSPackage.NON_NUMERIC_PROPERTY__PROPERTY_CONSTANT:
        setPropertyConstant((PropertyConstant)newValue);
        return;
      case BLESSPackage.NON_NUMERIC_PROPERTY__TOD:
        setTod((TypeOrReference)newValue);
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
      case BLESSPackage.NON_NUMERIC_PROPERTY__PROPERTY:
        setProperty((PropertyReference)null);
        return;
      case BLESSPackage.NON_NUMERIC_PROPERTY__PROPERTY_CONSTANT:
        setPropertyConstant((PropertyConstant)null);
        return;
      case BLESSPackage.NON_NUMERIC_PROPERTY__TOD:
        setTod((TypeOrReference)null);
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
      case BLESSPackage.NON_NUMERIC_PROPERTY__PROPERTY:
        return property != null;
      case BLESSPackage.NON_NUMERIC_PROPERTY__PROPERTY_CONSTANT:
        return propertyConstant != null;
      case BLESSPackage.NON_NUMERIC_PROPERTY__TOD:
        return tod != null;
    }
    return super.eIsSet(featureID);
  }

} //NonNumericPropertyImpl
