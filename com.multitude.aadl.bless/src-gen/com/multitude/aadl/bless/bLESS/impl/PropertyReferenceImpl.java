/**
 * (C) Multitude Corporation 2021
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.PropertyField;
import com.multitude.aadl.bless.bLESS.PropertyReference;

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

import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.Property;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.PropertyReferenceImpl#getPname <em>Pname</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.PropertyReferenceImpl#getField <em>Field</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.PropertyReferenceImpl#isSelf <em>Self</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.PropertyReferenceImpl#getSpname <em>Spname</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.PropertyReferenceImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.PropertyReferenceImpl#getCpname <em>Cpname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyReferenceImpl extends ElementImpl implements PropertyReference
{
  /**
   * The cached value of the '{@link #getPname() <em>Pname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPname()
   * @generated
   * @ordered
   */
  protected Property pname;

  /**
   * The cached value of the '{@link #getField() <em>Field</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField()
   * @generated
   * @ordered
   */
  protected EList<PropertyField> field;

  /**
   * The default value of the '{@link #isSelf() <em>Self</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSelf()
   * @generated
   * @ordered
   */
  protected static final boolean SELF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSelf() <em>Self</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSelf()
   * @generated
   * @ordered
   */
  protected boolean self = SELF_EDEFAULT;

  /**
   * The cached value of the '{@link #getSpname() <em>Spname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpname()
   * @generated
   * @ordered
   */
  protected Property spname;

  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected ComponentClassifier component;

  /**
   * The cached value of the '{@link #getCpname() <em>Cpname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCpname()
   * @generated
   * @ordered
   */
  protected Property cpname;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyReferenceImpl()
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
    return BLESSPackage.eINSTANCE.getPropertyReference();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Property getPname()
  {
    if (pname != null && ((EObject)pname).eIsProxy())
    {
      InternalEObject oldPname = (InternalEObject)pname;
      pname = (Property)eResolveProxy(oldPname);
      if (pname != oldPname)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BLESSPackage.PROPERTY_REFERENCE__PNAME, oldPname, pname));
      }
    }
    return pname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property basicGetPname()
  {
    return pname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPname(Property newPname)
  {
    Property oldPname = pname;
    pname = newPname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.PROPERTY_REFERENCE__PNAME, oldPname, pname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PropertyField> getField()
  {
    if (field == null)
    {
      field = new EObjectContainmentEList<PropertyField>(PropertyField.class, this, BLESSPackage.PROPERTY_REFERENCE__FIELD);
    }
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isSelf()
  {
    return self;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSelf(boolean newSelf)
  {
    boolean oldSelf = self;
    self = newSelf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.PROPERTY_REFERENCE__SELF, oldSelf, self));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Property getSpname()
  {
    if (spname != null && ((EObject)spname).eIsProxy())
    {
      InternalEObject oldSpname = (InternalEObject)spname;
      spname = (Property)eResolveProxy(oldSpname);
      if (spname != oldSpname)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BLESSPackage.PROPERTY_REFERENCE__SPNAME, oldSpname, spname));
      }
    }
    return spname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property basicGetSpname()
  {
    return spname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSpname(Property newSpname)
  {
    Property oldSpname = spname;
    spname = newSpname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.PROPERTY_REFERENCE__SPNAME, oldSpname, spname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComponentClassifier getComponent()
  {
    if (component != null && ((EObject)component).eIsProxy())
    {
      InternalEObject oldComponent = (InternalEObject)component;
      component = (ComponentClassifier)eResolveProxy(oldComponent);
      if (component != oldComponent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BLESSPackage.PROPERTY_REFERENCE__COMPONENT, oldComponent, component));
      }
    }
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentClassifier basicGetComponent()
  {
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setComponent(ComponentClassifier newComponent)
  {
    ComponentClassifier oldComponent = component;
    component = newComponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.PROPERTY_REFERENCE__COMPONENT, oldComponent, component));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Property getCpname()
  {
    if (cpname != null && ((EObject)cpname).eIsProxy())
    {
      InternalEObject oldCpname = (InternalEObject)cpname;
      cpname = (Property)eResolveProxy(oldCpname);
      if (cpname != oldCpname)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BLESSPackage.PROPERTY_REFERENCE__CPNAME, oldCpname, cpname));
      }
    }
    return cpname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property basicGetCpname()
  {
    return cpname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCpname(Property newCpname)
  {
    Property oldCpname = cpname;
    cpname = newCpname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.PROPERTY_REFERENCE__CPNAME, oldCpname, cpname));
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
      case BLESSPackage.PROPERTY_REFERENCE__FIELD:
        return ((InternalEList<?>)getField()).basicRemove(otherEnd, msgs);
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
      case BLESSPackage.PROPERTY_REFERENCE__PNAME:
        if (resolve) return getPname();
        return basicGetPname();
      case BLESSPackage.PROPERTY_REFERENCE__FIELD:
        return getField();
      case BLESSPackage.PROPERTY_REFERENCE__SELF:
        return isSelf();
      case BLESSPackage.PROPERTY_REFERENCE__SPNAME:
        if (resolve) return getSpname();
        return basicGetSpname();
      case BLESSPackage.PROPERTY_REFERENCE__COMPONENT:
        if (resolve) return getComponent();
        return basicGetComponent();
      case BLESSPackage.PROPERTY_REFERENCE__CPNAME:
        if (resolve) return getCpname();
        return basicGetCpname();
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
      case BLESSPackage.PROPERTY_REFERENCE__PNAME:
        setPname((Property)newValue);
        return;
      case BLESSPackage.PROPERTY_REFERENCE__FIELD:
        getField().clear();
        getField().addAll((Collection<? extends PropertyField>)newValue);
        return;
      case BLESSPackage.PROPERTY_REFERENCE__SELF:
        setSelf((Boolean)newValue);
        return;
      case BLESSPackage.PROPERTY_REFERENCE__SPNAME:
        setSpname((Property)newValue);
        return;
      case BLESSPackage.PROPERTY_REFERENCE__COMPONENT:
        setComponent((ComponentClassifier)newValue);
        return;
      case BLESSPackage.PROPERTY_REFERENCE__CPNAME:
        setCpname((Property)newValue);
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
      case BLESSPackage.PROPERTY_REFERENCE__PNAME:
        setPname((Property)null);
        return;
      case BLESSPackage.PROPERTY_REFERENCE__FIELD:
        getField().clear();
        return;
      case BLESSPackage.PROPERTY_REFERENCE__SELF:
        setSelf(SELF_EDEFAULT);
        return;
      case BLESSPackage.PROPERTY_REFERENCE__SPNAME:
        setSpname((Property)null);
        return;
      case BLESSPackage.PROPERTY_REFERENCE__COMPONENT:
        setComponent((ComponentClassifier)null);
        return;
      case BLESSPackage.PROPERTY_REFERENCE__CPNAME:
        setCpname((Property)null);
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
      case BLESSPackage.PROPERTY_REFERENCE__PNAME:
        return pname != null;
      case BLESSPackage.PROPERTY_REFERENCE__FIELD:
        return field != null && !field.isEmpty();
      case BLESSPackage.PROPERTY_REFERENCE__SELF:
        return self != SELF_EDEFAULT;
      case BLESSPackage.PROPERTY_REFERENCE__SPNAME:
        return spname != null;
      case BLESSPackage.PROPERTY_REFERENCE__COMPONENT:
        return component != null;
      case BLESSPackage.PROPERTY_REFERENCE__CPNAME:
        return cpname != null;
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
    result.append(" (self: ");
    result.append(self);
    result.append(')');
    return result.toString();
  }

} //PropertyReferenceImpl
