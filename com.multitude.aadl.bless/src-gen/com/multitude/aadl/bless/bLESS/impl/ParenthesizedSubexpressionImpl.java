/**
 * (C) Multitude Corporation 2021
 * generated by Xtext 2.27.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.CaseExpression;
import com.multitude.aadl.bless.bLESS.Expression;
import com.multitude.aadl.bless.bLESS.ParenthesizedSubexpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parenthesized Subexpression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ParenthesizedSubexpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ParenthesizedSubexpressionImpl#getT <em>T</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ParenthesizedSubexpressionImpl#getF <em>F</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.ParenthesizedSubexpressionImpl#getCaseexpression <em>Caseexpression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParenthesizedSubexpressionImpl extends ElementImpl implements ParenthesizedSubexpression
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The cached value of the '{@link #getT() <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected Expression t;

  /**
   * The cached value of the '{@link #getF() <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getF()
   * @generated
   * @ordered
   */
  protected Expression f;

  /**
   * The cached value of the '{@link #getCaseexpression() <em>Caseexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseexpression()
   * @generated
   * @ordered
   */
  protected CaseExpression caseexpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParenthesizedSubexpressionImpl()
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
    return BLESSPackage.eINSTANCE.getParenthesizedSubexpression();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.PARENTHESIZED_SUBEXPRESSION__EXPRESSION, oldExpression, newExpression);
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
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.PARENTHESIZED_SUBEXPRESSION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.PARENTHESIZED_SUBEXPRESSION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.PARENTHESIZED_SUBEXPRESSION__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT(Expression newT, NotificationChain msgs)
  {
    Expression oldT = t;
    t = newT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.PARENTHESIZED_SUBEXPRESSION__T, oldT, newT);
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
  public void setT(Expression newT)
  {
    if (newT != t)
    {
      NotificationChain msgs = null;
      if (t != null)
        msgs = ((InternalEObject)t).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.PARENTHESIZED_SUBEXPRESSION__T, null, msgs);
      if (newT != null)
        msgs = ((InternalEObject)newT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.PARENTHESIZED_SUBEXPRESSION__T, null, msgs);
      msgs = basicSetT(newT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.PARENTHESIZED_SUBEXPRESSION__T, newT, newT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getF()
  {
    return f;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetF(Expression newF, NotificationChain msgs)
  {
    Expression oldF = f;
    f = newF;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.PARENTHESIZED_SUBEXPRESSION__F, oldF, newF);
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
  public void setF(Expression newF)
  {
    if (newF != f)
    {
      NotificationChain msgs = null;
      if (f != null)
        msgs = ((InternalEObject)f).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.PARENTHESIZED_SUBEXPRESSION__F, null, msgs);
      if (newF != null)
        msgs = ((InternalEObject)newF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.PARENTHESIZED_SUBEXPRESSION__F, null, msgs);
      msgs = basicSetF(newF, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.PARENTHESIZED_SUBEXPRESSION__F, newF, newF));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CaseExpression getCaseexpression()
  {
    return caseexpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCaseexpression(CaseExpression newCaseexpression, NotificationChain msgs)
  {
    CaseExpression oldCaseexpression = caseexpression;
    caseexpression = newCaseexpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.PARENTHESIZED_SUBEXPRESSION__CASEEXPRESSION, oldCaseexpression, newCaseexpression);
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
  public void setCaseexpression(CaseExpression newCaseexpression)
  {
    if (newCaseexpression != caseexpression)
    {
      NotificationChain msgs = null;
      if (caseexpression != null)
        msgs = ((InternalEObject)caseexpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.PARENTHESIZED_SUBEXPRESSION__CASEEXPRESSION, null, msgs);
      if (newCaseexpression != null)
        msgs = ((InternalEObject)newCaseexpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.PARENTHESIZED_SUBEXPRESSION__CASEEXPRESSION, null, msgs);
      msgs = basicSetCaseexpression(newCaseexpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.PARENTHESIZED_SUBEXPRESSION__CASEEXPRESSION, newCaseexpression, newCaseexpression));
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
      case BLESSPackage.PARENTHESIZED_SUBEXPRESSION__EXPRESSION:
        return basicSetExpression(null, msgs);
      case BLESSPackage.PARENTHESIZED_SUBEXPRESSION__T:
        return basicSetT(null, msgs);
      case BLESSPackage.PARENTHESIZED_SUBEXPRESSION__F:
        return basicSetF(null, msgs);
      case BLESSPackage.PARENTHESIZED_SUBEXPRESSION__CASEEXPRESSION:
        return basicSetCaseexpression(null, msgs);
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
      case BLESSPackage.PARENTHESIZED_SUBEXPRESSION__EXPRESSION:
        return getExpression();
      case BLESSPackage.PARENTHESIZED_SUBEXPRESSION__T:
        return getT();
      case BLESSPackage.PARENTHESIZED_SUBEXPRESSION__F:
        return getF();
      case BLESSPackage.PARENTHESIZED_SUBEXPRESSION__CASEEXPRESSION:
        return getCaseexpression();
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
      case BLESSPackage.PARENTHESIZED_SUBEXPRESSION__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case BLESSPackage.PARENTHESIZED_SUBEXPRESSION__T:
        setT((Expression)newValue);
        return;
      case BLESSPackage.PARENTHESIZED_SUBEXPRESSION__F:
        setF((Expression)newValue);
        return;
      case BLESSPackage.PARENTHESIZED_SUBEXPRESSION__CASEEXPRESSION:
        setCaseexpression((CaseExpression)newValue);
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
      case BLESSPackage.PARENTHESIZED_SUBEXPRESSION__EXPRESSION:
        setExpression((Expression)null);
        return;
      case BLESSPackage.PARENTHESIZED_SUBEXPRESSION__T:
        setT((Expression)null);
        return;
      case BLESSPackage.PARENTHESIZED_SUBEXPRESSION__F:
        setF((Expression)null);
        return;
      case BLESSPackage.PARENTHESIZED_SUBEXPRESSION__CASEEXPRESSION:
        setCaseexpression((CaseExpression)null);
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
      case BLESSPackage.PARENTHESIZED_SUBEXPRESSION__EXPRESSION:
        return expression != null;
      case BLESSPackage.PARENTHESIZED_SUBEXPRESSION__T:
        return t != null;
      case BLESSPackage.PARENTHESIZED_SUBEXPRESSION__F:
        return f != null;
      case BLESSPackage.PARENTHESIZED_SUBEXPRESSION__CASEEXPRESSION:
        return caseexpression != null;
    }
    return super.eIsSet(featureID);
  }

} //ParenthesizedSubexpressionImpl
