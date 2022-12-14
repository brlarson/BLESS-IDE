/**
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.Type;
import com.multitude.aadl.bless.bLESS.TypeDeclaration;
import com.multitude.aadl.bless.bLESS.TypeOrReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Or Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.TypeOrReferenceImpl#getTy <em>Ty</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.TypeOrReferenceImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeOrReferenceImpl extends ElementImpl implements TypeOrReference
{
  /**
   * The cached value of the '{@link #getTy() <em>Ty</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTy()
   * @generated
   * @ordered
   */
  protected Type ty;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected TypeDeclaration ref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeOrReferenceImpl()
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
    return BLESSPackage.eINSTANCE.getTypeOrReference();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type getTy()
  {
    return ty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTy(Type newTy, NotificationChain msgs)
  {
    Type oldTy = ty;
    ty = newTy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.TYPE_OR_REFERENCE__TY, oldTy, newTy);
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
  public void setTy(Type newTy)
  {
    if (newTy != ty)
    {
      NotificationChain msgs = null;
      if (ty != null)
        msgs = ((InternalEObject)ty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.TYPE_OR_REFERENCE__TY, null, msgs);
      if (newTy != null)
        msgs = ((InternalEObject)newTy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.TYPE_OR_REFERENCE__TY, null, msgs);
      msgs = basicSetTy(newTy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.TYPE_OR_REFERENCE__TY, newTy, newTy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeDeclaration getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (TypeDeclaration)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BLESSPackage.TYPE_OR_REFERENCE__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDeclaration basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRef(TypeDeclaration newRef)
  {
    TypeDeclaration oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.TYPE_OR_REFERENCE__REF, oldRef, ref));
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
      case BLESSPackage.TYPE_OR_REFERENCE__TY:
        return basicSetTy(null, msgs);
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
      case BLESSPackage.TYPE_OR_REFERENCE__TY:
        return getTy();
      case BLESSPackage.TYPE_OR_REFERENCE__REF:
        if (resolve) return getRef();
        return basicGetRef();
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
      case BLESSPackage.TYPE_OR_REFERENCE__TY:
        setTy((Type)newValue);
        return;
      case BLESSPackage.TYPE_OR_REFERENCE__REF:
        setRef((TypeDeclaration)newValue);
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
      case BLESSPackage.TYPE_OR_REFERENCE__TY:
        setTy((Type)null);
        return;
      case BLESSPackage.TYPE_OR_REFERENCE__REF:
        setRef((TypeDeclaration)null);
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
      case BLESSPackage.TYPE_OR_REFERENCE__TY:
        return ty != null;
      case BLESSPackage.TYPE_OR_REFERENCE__REF:
        return ref != null;
    }
    return super.eIsSet(featureID);
  }

} //TypeOrReferenceImpl
