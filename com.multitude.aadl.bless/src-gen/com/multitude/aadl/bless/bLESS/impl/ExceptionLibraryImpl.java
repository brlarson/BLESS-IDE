/**
 * (C) Multitude Corporation 2021
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.ExceptionLibrary;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.impl.AnnexLibraryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ExceptionLibraryImpl#getExceptiondefinitions <em>Exceptiondefinitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExceptionLibraryImpl extends AnnexLibraryImpl implements ExceptionLibrary
{
  /**
   * The cached value of the '{@link #getExceptiondefinitions() <em>Exceptiondefinitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceptiondefinitions()
   * @generated
   * @ordered
   */
  protected EList<com.multitude.aadl.bless.bLESS.Exception> exceptiondefinitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExceptionLibraryImpl()
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
    return BLESSPackage.eINSTANCE.getExceptionLibrary();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<com.multitude.aadl.bless.bLESS.Exception> getExceptiondefinitions()
  {
    if (exceptiondefinitions == null)
    {
      exceptiondefinitions = new EObjectContainmentEList<com.multitude.aadl.bless.bLESS.Exception>(com.multitude.aadl.bless.bLESS.Exception.class, this, BLESSPackage.EXCEPTION_LIBRARY__EXCEPTIONDEFINITIONS);
    }
    return exceptiondefinitions;
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
      case BLESSPackage.EXCEPTION_LIBRARY__EXCEPTIONDEFINITIONS:
        return ((InternalEList<?>)getExceptiondefinitions()).basicRemove(otherEnd, msgs);
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
      case BLESSPackage.EXCEPTION_LIBRARY__EXCEPTIONDEFINITIONS:
        return getExceptiondefinitions();
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
      case BLESSPackage.EXCEPTION_LIBRARY__EXCEPTIONDEFINITIONS:
        getExceptiondefinitions().clear();
        getExceptiondefinitions().addAll((Collection<? extends com.multitude.aadl.bless.bLESS.Exception>)newValue);
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
      case BLESSPackage.EXCEPTION_LIBRARY__EXCEPTIONDEFINITIONS:
        getExceptiondefinitions().clear();
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
      case BLESSPackage.EXCEPTION_LIBRARY__EXCEPTIONDEFINITIONS:
        return exceptiondefinitions != null && !exceptiondefinitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExceptionLibraryImpl