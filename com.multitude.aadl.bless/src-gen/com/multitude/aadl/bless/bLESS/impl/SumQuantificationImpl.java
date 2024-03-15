/**
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.30.0
 *  from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.bLESS.impl;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.LogicVariables;
import com.multitude.aadl.bless.bLESS.NumericExpression;
import com.multitude.aadl.bless.bLESS.Predicate;
import com.multitude.aadl.bless.bLESS.Range;
import com.multitude.aadl.bless.bLESS.SumQuantification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sum Quantification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.SumQuantificationImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.SumQuantificationImpl#isIn <em>In</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.SumQuantificationImpl#getRange <em>Range</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.SumQuantificationImpl#isWhich <em>Which</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.SumQuantificationImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.multitude.aadl.bless.bLESS.impl.SumQuantificationImpl#getNumeric_expression <em>Numeric expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SumQuantificationImpl extends ElementImpl implements SumQuantification
{
  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected LogicVariables variables;

  /**
   * The default value of the '{@link #isIn() <em>In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIn()
   * @generated
   * @ordered
   */
  protected static final boolean IN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIn() <em>In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIn()
   * @generated
   * @ordered
   */
  protected boolean in = IN_EDEFAULT;

  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected Range range;

  /**
   * The default value of the '{@link #isWhich() <em>Which</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWhich()
   * @generated
   * @ordered
   */
  protected static final boolean WHICH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWhich() <em>Which</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWhich()
   * @generated
   * @ordered
   */
  protected boolean which = WHICH_EDEFAULT;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Predicate condition;

  /**
   * The cached value of the '{@link #getNumeric_expression() <em>Numeric expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumeric_expression()
   * @generated
   * @ordered
   */
  protected NumericExpression numeric_expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SumQuantificationImpl()
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
    return BLESSPackage.eINSTANCE.getSumQuantification();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicVariables getVariables()
  {
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariables(LogicVariables newVariables, NotificationChain msgs)
  {
    LogicVariables oldVariables = variables;
    variables = newVariables;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.SUM_QUANTIFICATION__VARIABLES, oldVariables, newVariables);
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
  public void setVariables(LogicVariables newVariables)
  {
    if (newVariables != variables)
    {
      NotificationChain msgs = null;
      if (variables != null)
        msgs = ((InternalEObject)variables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.SUM_QUANTIFICATION__VARIABLES, null, msgs);
      if (newVariables != null)
        msgs = ((InternalEObject)newVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.SUM_QUANTIFICATION__VARIABLES, null, msgs);
      msgs = basicSetVariables(newVariables, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.SUM_QUANTIFICATION__VARIABLES, newVariables, newVariables));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isIn()
  {
    return in;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIn(boolean newIn)
  {
    boolean oldIn = in;
    in = newIn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.SUM_QUANTIFICATION__IN, oldIn, in));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Range getRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRange(Range newRange, NotificationChain msgs)
  {
    Range oldRange = range;
    range = newRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.SUM_QUANTIFICATION__RANGE, oldRange, newRange);
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
  public void setRange(Range newRange)
  {
    if (newRange != range)
    {
      NotificationChain msgs = null;
      if (range != null)
        msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.SUM_QUANTIFICATION__RANGE, null, msgs);
      if (newRange != null)
        msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.SUM_QUANTIFICATION__RANGE, null, msgs);
      msgs = basicSetRange(newRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.SUM_QUANTIFICATION__RANGE, newRange, newRange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isWhich()
  {
    return which;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWhich(boolean newWhich)
  {
    boolean oldWhich = which;
    which = newWhich;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.SUM_QUANTIFICATION__WHICH, oldWhich, which));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Predicate getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Predicate newCondition, NotificationChain msgs)
  {
    Predicate oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.SUM_QUANTIFICATION__CONDITION, oldCondition, newCondition);
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
  public void setCondition(Predicate newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.SUM_QUANTIFICATION__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.SUM_QUANTIFICATION__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.SUM_QUANTIFICATION__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumericExpression getNumeric_expression()
  {
    return numeric_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumeric_expression(NumericExpression newNumeric_expression, NotificationChain msgs)
  {
    NumericExpression oldNumeric_expression = numeric_expression;
    numeric_expression = newNumeric_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BLESSPackage.SUM_QUANTIFICATION__NUMERIC_EXPRESSION, oldNumeric_expression, newNumeric_expression);
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
  public void setNumeric_expression(NumericExpression newNumeric_expression)
  {
    if (newNumeric_expression != numeric_expression)
    {
      NotificationChain msgs = null;
      if (numeric_expression != null)
        msgs = ((InternalEObject)numeric_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.SUM_QUANTIFICATION__NUMERIC_EXPRESSION, null, msgs);
      if (newNumeric_expression != null)
        msgs = ((InternalEObject)newNumeric_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BLESSPackage.SUM_QUANTIFICATION__NUMERIC_EXPRESSION, null, msgs);
      msgs = basicSetNumeric_expression(newNumeric_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BLESSPackage.SUM_QUANTIFICATION__NUMERIC_EXPRESSION, newNumeric_expression, newNumeric_expression));
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
      case BLESSPackage.SUM_QUANTIFICATION__VARIABLES:
        return basicSetVariables(null, msgs);
      case BLESSPackage.SUM_QUANTIFICATION__RANGE:
        return basicSetRange(null, msgs);
      case BLESSPackage.SUM_QUANTIFICATION__CONDITION:
        return basicSetCondition(null, msgs);
      case BLESSPackage.SUM_QUANTIFICATION__NUMERIC_EXPRESSION:
        return basicSetNumeric_expression(null, msgs);
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
      case BLESSPackage.SUM_QUANTIFICATION__VARIABLES:
        return getVariables();
      case BLESSPackage.SUM_QUANTIFICATION__IN:
        return isIn();
      case BLESSPackage.SUM_QUANTIFICATION__RANGE:
        return getRange();
      case BLESSPackage.SUM_QUANTIFICATION__WHICH:
        return isWhich();
      case BLESSPackage.SUM_QUANTIFICATION__CONDITION:
        return getCondition();
      case BLESSPackage.SUM_QUANTIFICATION__NUMERIC_EXPRESSION:
        return getNumeric_expression();
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
      case BLESSPackage.SUM_QUANTIFICATION__VARIABLES:
        setVariables((LogicVariables)newValue);
        return;
      case BLESSPackage.SUM_QUANTIFICATION__IN:
        setIn((Boolean)newValue);
        return;
      case BLESSPackage.SUM_QUANTIFICATION__RANGE:
        setRange((Range)newValue);
        return;
      case BLESSPackage.SUM_QUANTIFICATION__WHICH:
        setWhich((Boolean)newValue);
        return;
      case BLESSPackage.SUM_QUANTIFICATION__CONDITION:
        setCondition((Predicate)newValue);
        return;
      case BLESSPackage.SUM_QUANTIFICATION__NUMERIC_EXPRESSION:
        setNumeric_expression((NumericExpression)newValue);
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
      case BLESSPackage.SUM_QUANTIFICATION__VARIABLES:
        setVariables((LogicVariables)null);
        return;
      case BLESSPackage.SUM_QUANTIFICATION__IN:
        setIn(IN_EDEFAULT);
        return;
      case BLESSPackage.SUM_QUANTIFICATION__RANGE:
        setRange((Range)null);
        return;
      case BLESSPackage.SUM_QUANTIFICATION__WHICH:
        setWhich(WHICH_EDEFAULT);
        return;
      case BLESSPackage.SUM_QUANTIFICATION__CONDITION:
        setCondition((Predicate)null);
        return;
      case BLESSPackage.SUM_QUANTIFICATION__NUMERIC_EXPRESSION:
        setNumeric_expression((NumericExpression)null);
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
      case BLESSPackage.SUM_QUANTIFICATION__VARIABLES:
        return variables != null;
      case BLESSPackage.SUM_QUANTIFICATION__IN:
        return in != IN_EDEFAULT;
      case BLESSPackage.SUM_QUANTIFICATION__RANGE:
        return range != null;
      case BLESSPackage.SUM_QUANTIFICATION__WHICH:
        return which != WHICH_EDEFAULT;
      case BLESSPackage.SUM_QUANTIFICATION__CONDITION:
        return condition != null;
      case BLESSPackage.SUM_QUANTIFICATION__NUMERIC_EXPRESSION:
        return numeric_expression != null;
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
    result.append(" (in: ");
    result.append(in);
    result.append(", which: ");
    result.append(which);
    result.append(')');
    return result.toString();
  }

} //SumQuantificationImpl
