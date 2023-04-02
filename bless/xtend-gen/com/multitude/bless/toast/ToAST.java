package com.multitude.bless.toast;

import com.google.common.base.Objects;
import com.multitude.aadl.bless.bLESS.ANumber;
import com.multitude.aadl.bless.bLESS.Action;
import com.multitude.aadl.bless.bLESS.ActionSubclause;
import com.multitude.aadl.bless.bLESS.ActualParameter;
import com.multitude.aadl.bless.bLESS.AddSub;
import com.multitude.aadl.bless.bLESS.Alternative;
import com.multitude.aadl.bless.bLESS.ArrayRange;
import com.multitude.aadl.bless.bLESS.ArrayRangeList;
import com.multitude.aadl.bless.bLESS.ArrayType;
import com.multitude.aadl.bless.bLESS.AssertClause;
import com.multitude.aadl.bless.bLESS.AssertedAction;
import com.multitude.aadl.bless.bLESS.Assertion;
import com.multitude.aadl.bless.bLESS.AssertionEnumeration;
import com.multitude.aadl.bless.bLESS.AssertionFunctionValue;
import com.multitude.aadl.bless.bLESS.AssertionLibrary;
import com.multitude.aadl.bless.bLESS.AssertionNumericExpression;
import com.multitude.aadl.bless.bLESS.Assignment;
import com.multitude.aadl.bless.bLESS.BAAlternative;
import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.BasicAction;
import com.multitude.aadl.bless.bLESS.BehaviorActions;
import com.multitude.aadl.bless.bLESS.BehaviorState;
import com.multitude.aadl.bless.bLESS.BehaviorTime;
import com.multitude.aadl.bless.bLESS.BehaviorTransition;
import com.multitude.aadl.bless.bLESS.BooleanExpression;
import com.multitude.aadl.bless.bLESS.BooleanType;
import com.multitude.aadl.bless.bLESS.CaseChoice;
import com.multitude.aadl.bless.bLESS.CaseExpression;
import com.multitude.aadl.bless.bLESS.CatchClause;
import com.multitude.aadl.bless.bLESS.CatchClauseTerm;
import com.multitude.aadl.bless.bLESS.CombinableOperation;
import com.multitude.aadl.bless.bLESS.CommunicationAction;
import com.multitude.aadl.bless.bLESS.Computation;
import com.multitude.aadl.bless.bLESS.ConditionValuePair;
import com.multitude.aadl.bless.bLESS.ConditionalAssertionFunction;
import com.multitude.aadl.bless.bLESS.ConditionalExpression;
import com.multitude.aadl.bless.bLESS.Conjunction;
import com.multitude.aadl.bless.bLESS.Constant;
import com.multitude.aadl.bless.bLESS.CountingQuantification;
import com.multitude.aadl.bless.bLESS.Disjunction;
import com.multitude.aadl.bless.bLESS.DispatchCondition;
import com.multitude.aadl.bless.bLESS.DispatchConjunction;
import com.multitude.aadl.bless.bLESS.DispatchExpression;
import com.multitude.aadl.bless.bLESS.DispatchTrigger;
import com.multitude.aadl.bless.bLESS.DoUntilLoop;
import com.multitude.aadl.bless.bLESS.EnumerationPair;
import com.multitude.aadl.bless.bLESS.EnumerationType;
import com.multitude.aadl.bless.bLESS.EnumerationValue;
import com.multitude.aadl.bless.bLESS.ExecuteCondition;
import com.multitude.aadl.bless.bLESS.ExistentialLatticeQuantification;
import com.multitude.aadl.bless.bLESS.ExistentialQuantification;
import com.multitude.aadl.bless.bLESS.Exp;
import com.multitude.aadl.bless.bLESS.Expression;
import com.multitude.aadl.bless.bLESS.ExpressionOrAny;
import com.multitude.aadl.bless.bLESS.ForLoop;
import com.multitude.aadl.bless.bLESS.FormalActual;
import com.multitude.aadl.bless.bLESS.FormalActualList;
import com.multitude.aadl.bless.bLESS.FormalExpressionPair;
import com.multitude.aadl.bless.bLESS.GuardedAction;
import com.multitude.aadl.bless.bLESS.IndexExpression;
import com.multitude.aadl.bless.bLESS.IndexExpressionOrRange;
import com.multitude.aadl.bless.bLESS.InternalCondition;
import com.multitude.aadl.bless.bLESS.InvariantClause;
import com.multitude.aadl.bless.bLESS.Invocation;
import com.multitude.aadl.bless.bLESS.IssueException;
import com.multitude.aadl.bless.bLESS.LogicVariables;
import com.multitude.aadl.bless.bLESS.ModeCondition;
import com.multitude.aadl.bless.bLESS.MultDiv;
import com.multitude.aadl.bless.bLESS.NameTick;
import com.multitude.aadl.bless.bLESS.NamedAssertion;
import com.multitude.aadl.bless.bLESS.NamelessAssertion;
import com.multitude.aadl.bless.bLESS.NamelessEnumeration;
import com.multitude.aadl.bless.bLESS.NamelessFunction;
import com.multitude.aadl.bless.bLESS.ParenthesizedSubexpression;
import com.multitude.aadl.bless.bLESS.PartialName;
import com.multitude.aadl.bless.bLESS.PeriodShift;
import com.multitude.aadl.bless.bLESS.PortInput;
import com.multitude.aadl.bless.bLESS.PortOutput;
import com.multitude.aadl.bless.bLESS.ProductQuantification;
import com.multitude.aadl.bless.bLESS.PropertyField;
import com.multitude.aadl.bless.bLESS.PropertyReference;
import com.multitude.aadl.bless.bLESS.QuantifiedVariables;
import com.multitude.aadl.bless.bLESS.Quantity;
import com.multitude.aadl.bless.bLESS.QuantityType;
import com.multitude.aadl.bless.bLESS.Range;
import com.multitude.aadl.bless.bLESS.RecordField;
import com.multitude.aadl.bless.bLESS.RecordTerm;
import com.multitude.aadl.bless.bLESS.RecordType;
import com.multitude.aadl.bless.bLESS.RecordValue;
import com.multitude.aadl.bless.bLESS.Relation;
import com.multitude.aadl.bless.bLESS.SimultaneousAssignment;
import com.multitude.aadl.bless.bLESS.StringType;
import com.multitude.aadl.bless.bLESS.SubProgramParameter;
import com.multitude.aadl.bless.bLESS.Subexpression;
import com.multitude.aadl.bless.bLESS.SubprogramCall;
import com.multitude.aadl.bless.bLESS.SumQuantification;
import com.multitude.aadl.bless.bLESS.TimedExpression;
import com.multitude.aadl.bless.bLESS.TimedSubject;
import com.multitude.aadl.bless.bLESS.Transitions;
import com.multitude.aadl.bless.bLESS.TriggerLogicalExpression;
import com.multitude.aadl.bless.bLESS.Type;
import com.multitude.aadl.bless.bLESS.TypeOrReference;
import com.multitude.aadl.bless.bLESS.UniversalLatticeQuantification;
import com.multitude.aadl.bless.bLESS.UniversalQuantification;
import com.multitude.aadl.bless.bLESS.Value;
import com.multitude.aadl.bless.bLESS.ValueName;
import com.multitude.aadl.bless.bLESS.Variable;
import com.multitude.aadl.bless.bLESS.VariableDeclaration;
import com.multitude.aadl.bless.bLESS.VariableList;
import com.multitude.aadl.bless.bLESS.VariablesSection;
import com.multitude.aadl.bless.bLESS.WhenThrow;
import com.multitude.aadl.bless.bLESS.WhileLoop;
import com.multitude.bless.app.Global;
import com.multitude.bless.tree.BAST;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.osate.aadl2.Element;
import org.osate.aadl2.PropertyConstant;

@SuppressWarnings("all")
public class ToAST {
  public static final ToAST TOAST = new ToAST();

  public static BAST x = new BAST("x");

  public BAST newBAST(final Element e) {
    return new BAST(e);
  }

  public BAST makeBASTforID(final String id, final Element parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nID cannot be resolved");
  }

  public BAST makeBASTforANumber(final ANumber an, final Element parent) {
    BAST _xblockexpression = null;
    {
      PropertyReference _property = an.getProperty();
      boolean _tripleNotEquals = (_property != null);
      if (_tripleNotEquals) {
        return this.makeBASTforPropertyReference(an.getProperty(), parent);
      }
      PropertyConstant _propertyConstant = an.getPropertyConstant();
      boolean _tripleNotEquals_1 = (_propertyConstant != null);
      if (_tripleNotEquals_1) {
        return this.makeBASTforPropertyName(an.getPropertyConstant().qualifiedName(), parent);
      }
      BAST _xifexpression = null;
      boolean _contains = an.getLit().contains(".");
      if (_contains) {
        _xifexpression = this.makeBASTforREAL_LIT(an.getLit(), parent);
      } else {
        _xifexpression = this.makeBASTforINT(an.getLit(), parent);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public BAST makeBASTforPropertyReference(final PropertyReference pr, final Element e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nOCTOTHORPE cannot be resolved"
      + "\nLITERAL_self cannot be resolved");
  }

  public BAST makeBASTforComponentClassifier(final String s, final Element e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nDOUBLE_COLON cannot be resolved");
  }

  public List<String> getComponentClassifierStrings(final String s) {
    ArrayList<String> _xblockexpression = null;
    {
      final ArrayList<String> retval = new ArrayList<String>();
      int l = 0;
      int r = s.indexOf("::", l);
      while ((l < s.length())) {
        {
          retval.add(s.substring(l, r));
          l = (r + 2);
          r = s.indexOf("::", l);
        }
      }
      _xblockexpression = retval;
    }
    return _xblockexpression;
  }

  public BAST makeBASTforPropertyField(final PropertyField f, final Element e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLBRACKET cannot be resolved"
      + "\nRBRACKET cannot be resolved"
      + "\nLBRACKET cannot be resolved"
      + "\nRBRACKET cannot be resolved"
      + "\nPERIOD cannot be resolved"
      + "\nPERIOD cannot be resolved"
      + "\nLITERAL_upper_bound cannot be resolved"
      + "\nPERIOD cannot be resolved"
      + "\nLITERAL_lower_bound cannot be resolved");
  }

  /**
   * make a BAST node for an integer literal
   * used by AssertionValue , NaturalConstant
   */
  public BAST makeBASTforINT(final String integer_literal, final Element parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nINTEGER_LIT cannot be resolved");
  }

  /**
   * make a BAST node for a real literal
   * used by AssertionValue , ValueConstant
   */
  public BAST makeBASTforREAL_LIT(final String real_literal, final Element parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nREAL_LIT cannot be resolved");
  }

  /**
   * make a BAST node for a literal
   * eiter integer or float
   */
  public BAST makeBASTforLIT(final String literal, final Element parent) {
    BAST _xifexpression = null;
    boolean _contains = literal.contains(".");
    if (_contains) {
      _xifexpression = this.makeBASTforREAL_LIT(literal, parent);
    } else {
      _xifexpression = this.makeBASTforINT(literal, parent);
    }
    return _xifexpression;
  }

  /**
   * make a BAST node for a string literal
   * used by AssertionValue
   */
  public BAST makeBASTforSTRING(final String string_literal, final Value parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nAADL_STRING_LITERAL cannot be resolved");
  }

  /**
   * make a BAST node for a RangeSymbol : DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA;
   * used by LogicVariableDomain , Range
   */
  public BAST makeBASTforRangeSymbol(final String mySymbol, final Element parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nDOTDOT cannot be resolved"
      + "\nCOMMADOT cannot be resolved"
      + "\nDOTCOMMA cannot be resolved"
      + "\nCOMMACOMMA cannot be resolved");
  }

  /**
   * make a BAST node for a RelationSymbol : '=' | '<>' | '<' | '<=' | '>=' | '>';
   * used by PredicateRelation, ExpressionOrRelation
   */
  public BAST makeBASTforRelationSymbol(final String mySymbol, final Element parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nEQ cannot be resolved"
      + "\nNEQ cannot be resolved"
      + "\nLT cannot be resolved"
      + "\nAM cannot be resolved"
      + "\nAL cannot be resolved"
      + "\nGT cannot be resolved");
  }

  /**
   * make a BAST node for a time_unit : LITERAL_ps | LITERAL_us | LITERAL_ms | LITERAL_sec | LITERAL_min | LITERAL_hr    ;
   * used by BehaviorTime
   */
  public BAST makeBASTforTimeUnit(final String myUnit, final BehaviorTime parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_ps cannot be resolved"
      + "\nLITERAL_us cannot be resolved"
      + "\nLITERAL_ms cannot be resolved"
      + "\nLITERAL_sec cannot be resolved"
      + "\nLITERAL_min cannot be resolved"
      + "\nLITERAL_hr cannot be resolved");
  }

  /**
   * make a BAST node for an AADL Property
   * used by
   */
  public BAST makeBASTforPropertyName(final String property_name, final Element parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nDOUBLE_COLON cannot be resolved"
      + "\nDOUBLE_COLON cannot be resolved"
      + "\nDOUBLE_COLON cannot be resolved");
  }

  /**
   * make a BAST node for an AADL component port
   * used by
   */
  public BAST makeBASTforPort(final String port_name, final Element parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nID cannot be resolved");
  }

  /**
   * make a BAST node for an AADL_STRING_LITERAL
   * used by
   */
  public BAST makeBASTforAADL_STRING_LITERAL(final String theString, final Element parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nAADL_STRING_LITERAL cannot be resolved");
  }

  /**
   * put Assertion into map
   *   if (putAssertionsIntoMap&&($cln!==null)&&($a.text!==null))
   * if (Global.label_assertion_map.containsKey($a.text))
   * throw new YouIdiot("Duplicate Assertion for \""+$a.text+"\"",$a.tree);
   * else
   * Global.label_assertion_map.put($a.text,$assertion_body.tree);}
   */
  public void putAssertionIntoMap(final String key, final BAST b) {
    try {
      boolean _containsKey = Global.label_assertion_map.containsKey(key);
      boolean _not = (!_containsKey);
      if (_not) {
        Global.label_assertion_map.put(key, b);
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception ex = (Exception)_t;
        ex.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }

  protected BAST _toAST(final AssertionLibrary e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nASSERTION_ANNEX cannot be resolved");
  }

  protected BAST _toAST(final Assertion e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xblockexpression = null;
      {
        BAST result = null;
        NamedAssertion _namedassertion = e.getNamedassertion();
        boolean _tripleNotEquals = (_namedassertion != null);
        if (_tripleNotEquals) {
          result = this.toAST(e.getNamedassertion());
          this.putAssertionIntoMap(e.getNamedassertion().getName(), result);
        } else {
          NamelessAssertion _namelessassertion = e.getNamelessassertion();
          boolean _tripleNotEquals_1 = (_namelessassertion != null);
          if (_tripleNotEquals_1) {
            result = this.toAST(e.getNamelessassertion());
          } else {
            NamelessFunction _namelessfunction = e.getNamelessfunction();
            boolean _tripleNotEquals_2 = (_namelessfunction != null);
            if (_tripleNotEquals_2) {
              result = this.toAST(e.getNamelessfunction());
            } else {
              NamelessEnumeration _namelessenumeration = e.getNamelessenumeration();
              boolean _tripleNotEquals_3 = (_namelessenumeration != null);
              if (_tripleNotEquals_3) {
                result = this.toAST(e.getNamelessenumeration());
              }
            }
          }
        }
        _xblockexpression = result;
      }
      _xtrycatchfinallyexpression = _xblockexpression;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception ex = (Exception)_t;
        BAST _xblockexpression_1 = null;
        {
          ex.printStackTrace();
          _xblockexpression_1 = ToAST.x;
        }
        _xtrycatchfinallyexpression = _xblockexpression_1;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }

  protected BAST _toAST(final AssertionEnumeration e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nPLUS_ARROW cannot be resolved");
  }

  protected BAST _toAST(final SumQuantification e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_sum cannot be resolved"
      + "\nLITERAL_in cannot be resolved"
      + "\nLITERAL_of cannot be resolved");
  }

  protected BAST _toAST(final ProductQuantification e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_product cannot be resolved"
      + "\nLITERAL_in cannot be resolved"
      + "\nLITERAL_of cannot be resolved");
  }

  protected BAST _toAST(final CountingQuantification e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_numberof cannot be resolved"
      + "\nLITERAL_in cannot be resolved"
      + "\nLITERAL_that cannot be resolved");
  }

  protected BAST _toAST(final AssertionFunctionValue e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      ConditionalAssertionFunction _cexp = e.getCexp();
      boolean _tripleNotEquals = (_cexp != null);
      if (_tripleNotEquals) {
        _xifexpression = this.toAST(e.getCexp());
      } else {
        BAST _xifexpression_1 = null;
        AssertionNumericExpression _pexp = e.getPexp();
        boolean _tripleNotEquals_1 = (_pexp != null);
        if (_tripleNotEquals_1) {
          AssertionNumericExpression _pexp_1 = e.getPexp();
          _xifexpression_1 = this.toAST(((Expression) _pexp_1));
        }
        _xifexpression = _xifexpression_1;
      }
      _xtrycatchfinallyexpression = _xifexpression;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception ex = (Exception)_t;
        BAST _xblockexpression = null;
        {
          ex.printStackTrace();
          _xblockexpression = ToAST.x;
        }
        _xtrycatchfinallyexpression = _xblockexpression;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }

  protected BAST _toAST(final ConditionValuePair e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nIMP cannot be resolved");
  }

  public BAST parenthesize(final BAST pred, final Element e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nAT_SIGN cannot be resolved"
      + "\nLBRACKET cannot be resolved"
      + "\nLPAREN cannot be resolved"
      + "\nRPAREN cannot be resolved");
  }

  protected BAST _toAST(final ConditionalExpression e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nCONDITIONAL cannot be resolved");
  }

  protected BAST _toAST(final ConditionalAssertionFunction e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nCONDITIONAL_FUNCTION cannot be resolved");
  }

  protected BAST _toAST(final EnumerationPair e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nID cannot be resolved");
  }

  protected BAST _toAST(final ExistentialQuantification e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_exists cannot be resolved"
      + "\nLITERAL_in cannot be resolved");
  }

  protected BAST _toAST(final Variable e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nTILDE cannot be resolved"
      + "\nID cannot be resolved");
  }

  protected BAST _toAST(final VariableList e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nCOMMA cannot be resolved");
  }

  protected BAST _toAST(final IndexExpressionOrRange e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nDOTDOT cannot be resolved");
  }

  protected BAST _toAST(final PeriodShift e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nUNARY_MINUS cannot be resolved");
  }

  /**
   * make IntegerExpression into parenthesized_subexpression
   */
  public BAST parenthesize(final IndexExpression ie) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLPAREN cannot be resolved"
      + "\nRPAREN cannot be resolved");
  }

  protected BAST _toAST(final IndexExpression ie) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nMINUS cannot be resolved"
      + "\nDIVIDE cannot be resolved"
      + "\nLITERAL_mod cannot be resolved"
      + "\nPLUS cannot be resolved"
      + "\nTIMES cannot be resolved");
  }

  protected BAST _toAST(final LogicVariables e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nCOLON cannot be resolved"
      + "\nCOLON cannot be resolved");
  }

  protected BAST _toAST(final ModeCondition e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_on cannot be resolved");
  }

  protected BAST _toAST(final ValueName e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nPERIOD cannot be resolved"
      + "\nID cannot be resolved"
      + "\nQUESTION cannot be resolved"
      + "\nFUNCTION_CALL cannot be resolved"
      + "\nID cannot be resolved");
  }

  protected BAST _toAST(final FormalExpressionPair e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nARROW cannot be resolved");
  }

  protected BAST _toAST(final NamelessAssertion e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nASSERTION cannot be resolved");
  }

  protected BAST _toAST(final NamelessFunction e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nASSERTION_FUNCTION cannot be resolved");
  }

  protected BAST _toAST(final NamelessEnumeration e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nASSERTION_ENUMERATION cannot be resolved");
  }

  protected BAST _toAST(final PartialName e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _makeBASTforID = this.makeBASTforID(e.getRecord_id(), e);
      final Procedure1<BAST> _function = (BAST it) -> {
        EList<IndexExpressionOrRange> _array_index = e.getArray_index();
        for (final IndexExpressionOrRange index : _array_index) {
          it.addChild(this.toAST(index));
        }
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_makeBASTforID, _function);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception ex = (Exception)_t;
        BAST _xblockexpression = null;
        {
          ex.printStackTrace();
          _xblockexpression = ToAST.x;
        }
        _xtrycatchfinallyexpression = _xblockexpression;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }

  protected BAST _toAST(final Invocation e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nINVOKE cannot be resolved"
      + "\nPARAMETER cannot be resolved"
      + "\nCOLON_TILDE cannot be resolved"
      + "\nINVOKE_FUNCTION cannot be resolved"
      + "\nINVOKE_FUNCTION cannot be resolved");
  }

  public boolean isPredicateParameter(final NamedAssertion na, final ActualParameter ap) {
    if ((ap.getFormal().equals(na.getFormals().getFirst().getName()) && (na.getFormals().getFirst().getTod().getTy() instanceof BooleanType))) {
      return true;
    }
    EList<Variable> _parameter = na.getFormals().getParameter();
    for (final Variable param : _parameter) {
      if ((ap.getFormal().equals(param.getName()) && (param.getTod().getTy() instanceof BooleanType))) {
        return true;
      }
    }
    return false;
  }

  protected BAST _toAST(final Relation e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_in cannot be resolved");
  }

  protected BAST _toAST(final UniversalQuantification e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_all cannot be resolved"
      + "\nLITERAL_in cannot be resolved");
  }

  protected BAST _toAST(final NamedAssertion e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nASSERTION cannot be resolved"
      + "\nLABEL cannot be resolved"
      + "\nPARAMETERS cannot be resolved"
      + "\nASSERTION_FUNCTION cannot be resolved"
      + "\nLABEL cannot be resolved"
      + "\nPARAMETERS cannot be resolved"
      + "\nASSERTION_ENUMERATION cannot be resolved"
      + "\nLABEL cannot be resolved"
      + "\nPARAMETERS cannot be resolved");
  }

  protected BAST _toAST(final ActionSubclause e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nSUBPROGRAM_ANNEX cannot be resolved"
      + "\nLITERAL_pre cannot be resolved"
      + "\nLITERAL_post cannot be resolved"
      + "\nLITERAL_invariant cannot be resolved"
      + "\nDO_NOT_PROVE cannot be resolved");
  }

  protected BAST _toAST(final Action e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      BasicAction _basic = e.getBasic();
      boolean _tripleNotEquals = (_basic != null);
      if (_tripleNotEquals) {
        _xifexpression = this.toAST(e.getBasic());
      } else {
        BAST _xifexpression_1 = null;
        Alternative _if_fi = e.getIf_fi();
        boolean _tripleNotEquals_1 = (_if_fi != null);
        if (_tripleNotEquals_1) {
          _xifexpression_1 = this.toAST(e.getIf_fi());
        } else {
          BAST _xifexpression_2 = null;
          WhileLoop _wl = e.getWl();
          boolean _tripleNotEquals_2 = (_wl != null);
          if (_tripleNotEquals_2) {
            _xifexpression_2 = this.toAST(e.getWl());
          } else {
            BAST _xifexpression_3 = null;
            ForLoop _fl = e.getFl();
            boolean _tripleNotEquals_3 = (_fl != null);
            if (_tripleNotEquals_3) {
              _xifexpression_3 = this.toAST(e.getFl());
            } else {
              BAST _xifexpression_4 = null;
              DoUntilLoop _du = e.getDu();
              boolean _tripleNotEquals_4 = (_du != null);
              if (_tripleNotEquals_4) {
                _xifexpression_4 = this.toAST(e.getDu());
              } else {
                BAST _xifexpression_5 = null;
                ExistentialLatticeQuantification _elq = e.getElq();
                boolean _tripleNotEquals_5 = (_elq != null);
                if (_tripleNotEquals_5) {
                  _xifexpression_5 = this.toAST(e.getElq());
                } else {
                  BAST _xifexpression_6 = null;
                  UniversalLatticeQuantification _ulq = e.getUlq();
                  boolean _tripleNotEquals_6 = (_ulq != null);
                  if (_tripleNotEquals_6) {
                    _xifexpression_6 = this.toAST(e.getUlq());
                  }
                  _xifexpression_5 = _xifexpression_6;
                }
                _xifexpression_4 = _xifexpression_5;
              }
              _xifexpression_3 = _xifexpression_4;
            }
            _xifexpression_2 = _xifexpression_3;
          }
          _xifexpression_1 = _xifexpression_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xtrycatchfinallyexpression = _xifexpression;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception ex = (Exception)_t;
        BAST _xblockexpression = null;
        {
          ex.printStackTrace();
          _xblockexpression = ToAST.x;
        }
        _xtrycatchfinallyexpression = _xblockexpression;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }

  protected BAST _toAST(final ActualParameter e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nPARAMETER cannot be resolved");
  }

  protected BAST _toAST(final Alternative e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_if cannot be resolved"
      + "\nGUARD cannot be resolved");
  }

  protected BAST _toAST(final ArrayRangeList e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nCOMMA cannot be resolved");
  }

  protected BAST _toAST(final ArrayRange e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nDOTDOT cannot be resolved");
  }

  protected BAST _toAST(final ArrayType e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_array cannot be resolved"
      + "\nLITERAL_of cannot be resolved");
  }

  protected BAST _toAST(final AssertClause e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_assert cannot be resolved");
  }

  protected BAST _toAST(final AssertedAction e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nACTION cannot be resolved"
      + "\nP cannot be resolved"
      + "\nS cannot be resolved"
      + "\nQ cannot be resolved");
  }

  protected BAST _toAST(final Assignment e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nASSIGN cannot be resolved");
  }

  protected BAST _toAST(final BAAlternative e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_skip cannot be resolved");
  }

  protected BAST _toAST(final BasicAction e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_skip cannot be resolved");
  }

  protected BAST _toAST(final BehaviorActions e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nSEMICOLON cannot be resolved"
      + "\nAMPERSAND cannot be resolved");
  }

  protected BAST _toAST(final BehaviorTime e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nBEHAVIOR_TIME cannot be resolved");
  }

  protected BAST _toAST(final CaseChoice e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nIMP cannot be resolved");
  }

  protected BAST _toAST(final CaseExpression e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nCASE_EXPRESSION cannot be resolved");
  }

  protected BAST _toAST(final CatchClause e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_catch cannot be resolved");
  }

  protected BAST _toAST(final CatchClauseTerm e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nCOLON cannot be resolved"
      + "\nLITERAL_all cannot be resolved");
  }

  protected BAST _toAST(final CombinableOperation e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_fetchadd cannot be resolved"
      + "\nLITERAL_fetchor cannot be resolved"
      + "\nLITERAL_fetchxor cannot be resolved"
      + "\nLITERAL_fetchand cannot be resolved"
      + "\nLITERAL_swap cannot be resolved");
  }

  protected BAST _toAST(final CommunicationAction e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      SubprogramCall _pc = e.getPc();
      boolean _tripleNotEquals = (_pc != null);
      if (_tripleNotEquals) {
        _xifexpression = this.toAST(e.getPc());
      } else {
        BAST _xifexpression_1 = null;
        PortOutput _po = e.getPo();
        boolean _tripleNotEquals_1 = (_po != null);
        if (_tripleNotEquals_1) {
          _xifexpression_1 = this.toAST(e.getPo());
        } else {
          BAST _xifexpression_2 = null;
          PortInput _pi = e.getPi();
          boolean _tripleNotEquals_2 = (_pi != null);
          if (_tripleNotEquals_2) {
            _xifexpression_2 = this.toAST(e.getPi());
          }
          _xifexpression_1 = _xifexpression_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xtrycatchfinallyexpression = _xifexpression;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception ex = (Exception)_t;
        BAST _xblockexpression = null;
        {
          ex.printStackTrace();
          _xblockexpression = ToAST.x;
        }
        _xtrycatchfinallyexpression = _xblockexpression;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }

  protected BAST _toAST(final Computation e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_computation cannot be resolved");
  }

  protected BAST _toAST(final DoUntilLoop e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_do cannot be resolved"
      + "\nLITERAL_until cannot be resolved"
      + "\nLITERAL_invariant cannot be resolved"
      + "\nLITERAL_bound cannot be resolved");
  }

  protected BAST _toAST(final EnumerationType e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_enumeration cannot be resolved");
  }

  protected BAST _toAST(final ExistentialLatticeQuantification e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLCURLY cannot be resolved"
      + "\nRCURLY cannot be resolved"
      + "\nLITERAL_timeout cannot be resolved");
  }

  protected BAST _toAST(final ExpressionOrAny e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _elvis = null;
      Expression _exp = e.getExp();
      BAST _aST = null;
      if (_exp!=null) {
        _aST=this.toAST(_exp);
      }
      if (_aST != null) {
        _elvis = _aST;
      } else {
        BAST _makeBASTforID = this.makeBASTforID(e.getAny(), e);
        _elvis = _makeBASTforID;
      }
      _xtrycatchfinallyexpression = _elvis;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception ex = (Exception)_t;
        BAST _xblockexpression = null;
        {
          ex.printStackTrace();
          _xblockexpression = ToAST.x;
        }
        _xtrycatchfinallyexpression = _xblockexpression;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }

  protected BAST _toAST(final Expression e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_iff cannot be resolved"
      + "\nLITERAL_implies cannot be resolved");
  }

  protected BAST _toAST(final Disjunction e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_or cannot be resolved"
      + "\nLITERAL_cor cannot be resolved"
      + "\nLITERAL_xor cannot be resolved");
  }

  protected BAST _toAST(final Conjunction e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_and cannot be resolved"
      + "\nLITERAL_cand cannot be resolved");
  }

  protected BAST _toAST(final AddSub e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nPLUS cannot be resolved"
      + "\nMINUS cannot be resolved");
  }

  protected BAST _toAST(final MultDiv e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nDIVIDE cannot be resolved"
      + "\nLITERAL_mod cannot be resolved"
      + "\nLITERAL_rem cannot be resolved"
      + "\nTIMES cannot be resolved");
  }

  protected BAST _toAST(final Exp e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nEXP cannot be resolved");
  }

  protected BAST _toAST(final ForLoop e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_for cannot be resolved"
      + "\nLITERAL_in cannot be resolved"
      + "\nLITERAL_invariant cannot be resolved");
  }

  protected BAST _toAST(final FormalActual e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nCOLON cannot be resolved");
  }

  protected BAST _toAST(final FormalActualList e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nCOMMA cannot be resolved");
  }

  protected BAST _toAST(final GuardedAction e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nGUARD cannot be resolved");
  }

  protected BAST _toAST(final NameTick e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nTICK cannot be resolved");
  }

  protected BAST _toAST(final Quantity e) {
    return this.toAST(e.getNumber());
  }

  protected BAST _toAST(final QuantityType e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_integer cannot be resolved"
      + "\nDOTDOT cannot be resolved"
      + "\nLITERAL_real cannot be resolved"
      + "\nDOTDOT cannot be resolved"
      + "\nLITERAL_time cannot be resolved"
      + "\nLITERAL_real cannot be resolved"
      + "\nLITERAL_units cannot be resolved"
      + "\nDOTDOT cannot be resolved");
  }

  protected BAST _toAST(final ParenthesizedSubexpression e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nCASE_EXPRESSION cannot be resolved"
      + "\nCONDITIONAL cannot be resolved");
  }

  protected BAST _toAST(final PortInput e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nPORT_INPUT cannot be resolved");
  }

  protected BAST _toAST(final PortOutput e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nPORT_OUTPUT cannot be resolved");
  }

  protected BAST _toAST(final QuantifiedVariables e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_declare cannot be resolved");
  }

  protected BAST _toAST(final VariableDeclaration e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nCOLON cannot be resolved"
      + "\nTYPE cannot be resolved"
      + "\nASSIGN cannot be resolved"
      + "\nLITERAL_constant cannot be resolved"
      + "\nLITERAL_nonvolatile cannot be resolved"
      + "\nLITERAL_shared cannot be resolved"
      + "\nLITERAL_spread cannot be resolved"
      + "\nLITERAL_final cannot be resolved"
      + "\nSEMICOLON cannot be resolved");
  }

  protected BAST _toAST(final Range e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _makeBASTforRangeSymbol = this.makeBASTforRangeSymbol(e.getSym(), e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.addChild(this.toAST(e.getLower_bound()));
        it.addChild(this.toAST(e.getUpper_bound()));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_makeBASTforRangeSymbol, _function);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception ex = (Exception)_t;
        BAST _xblockexpression = null;
        {
          ex.printStackTrace();
          _xblockexpression = ToAST.x;
        }
        _xtrycatchfinallyexpression = _xblockexpression;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }

  protected BAST _toAST(final RecordField e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nCOLON cannot be resolved");
  }

  protected BAST _toAST(final RecordTerm e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nRECORD_TERM cannot be resolved");
  }

  protected BAST _toAST(final RecordType e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_record cannot be resolved");
  }

  protected BAST _toAST(final RecordValue e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nARROW cannot be resolved");
  }

  protected BAST _toAST(final SimultaneousAssignment e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nASSIGN cannot be resolved"
      + "\nCOMMA cannot be resolved"
      + "\nCOMMA cannot be resolved");
  }

  protected BAST _toAST(final Subexpression e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nUNARY_MINUS cannot be resolved"
      + "\nLITERAL_not cannot be resolved"
      + "\nLITERAL_abs cannot be resolved");
  }

  protected BAST _toAST(final TimedExpression e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nTICK cannot be resolved"
      + "\nAT_SIGN cannot be resolved"
      + "\nCARET cannot be resolved");
  }

  protected BAST _toAST(final TimedSubject e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _elvis = null;
      BAST _elvis_1 = null;
      BAST _elvis_2 = null;
      BAST _elvis_3 = null;
      Value _value = e.getValue();
      BAST _aST = null;
      if (_value!=null) {
        _aST=this.toAST(_value);
      }
      if (_aST != null) {
        _elvis_3 = _aST;
      } else {
        Invocation _invocation = e.getInvocation();
        BAST _aST_1 = null;
        if (_invocation!=null) {
          _aST_1=this.toAST(_invocation);
        }
        _elvis_3 = _aST_1;
      }
      if (_elvis_3 != null) {
        _elvis_2 = _elvis_3;
      } else {
        ParenthesizedSubexpression _ps = e.getPs();
        BAST _aST_2 = null;
        if (_ps!=null) {
          _aST_2=this.toAST(_ps);
        }
        _elvis_2 = _aST_2;
      }
      if (_elvis_2 != null) {
        _elvis_1 = _elvis_2;
      } else {
        ConditionalExpression _conditional = e.getConditional();
        BAST _aST_3 = null;
        if (_conditional!=null) {
          _aST_3=this.toAST(_conditional);
        }
        _elvis_1 = _aST_3;
      }
      if (_elvis_1 != null) {
        _elvis = _elvis_1;
      } else {
        RecordTerm _record = e.getRecord();
        BAST _aST_4 = null;
        if (_record!=null) {
          _aST_4=this.toAST(_record);
        }
        _elvis = _aST_4;
      }
      _xtrycatchfinallyexpression = _elvis;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception ex = (Exception)_t;
        BAST _xblockexpression = null;
        {
          ex.printStackTrace();
          _xblockexpression = ToAST.x;
        }
        _xtrycatchfinallyexpression = _xblockexpression;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }

  protected BAST _toAST(final SubprogramCall e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nPROCEDURE_CALL cannot be resolved");
  }

  protected BAST _toAST(final UniversalLatticeQuantification e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_forall cannot be resolved"
      + "\nCOMMA cannot be resolved"
      + "\nLITERAL_in cannot be resolved"
      + "\nDOTDOT cannot be resolved");
  }

  protected BAST _toAST(final Value e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_timeout cannot be resolved"
      + "\nLITERAL_now cannot be resolved"
      + "\nLITERAL_tops cannot be resolved");
  }

  protected BAST _toAST(final EnumerationValue e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nTICK cannot be resolved"
      + "\nID cannot be resolved"
      + "\nID cannot be resolved");
  }

  protected BAST _toAST(final Constant e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_true cannot be resolved"
      + "\nLITERAL_false cannot be resolved"
      + "\nLITERAL_null cannot be resolved");
  }

  protected BAST _toAST(final PropertyField e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLBRACKET cannot be resolved"
      + "\nRBRACKET cannot be resolved"
      + "\nLBRACKET cannot be resolved"
      + "\nRBRACKET cannot be resolved"
      + "\nPERIOD cannot be resolved"
      + "\nPERIOD cannot be resolved"
      + "\nLITERAL_upper_bound cannot be resolved"
      + "\nPERIOD cannot be resolved"
      + "\nLITERAL_lower_bound cannot be resolved"
      + "\nID cannot be resolved");
  }

  protected BAST _toAST(final PropertyReference e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nOCTOTHORPE cannot be resolved"
      + "\nLITERAL_self cannot be resolved"
      + "\nOCTOTHORPE cannot be resolved"
      + "\nOCTOTHORPE cannot be resolved");
  }

  protected BAST _toAST(final WhenThrow e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_when cannot be resolved"
      + "\nLITERAL_throw cannot be resolved");
  }

  protected BAST _toAST(final WhileLoop e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_while cannot be resolved"
      + "\nINVARIANT cannot be resolved"
      + "\nBOUND cannot be resolved");
  }

  protected BAST _toAST(final BehaviorTransition e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nTRANSITION cannot be resolved"
      + "\nLABEL cannot be resolved"
      + "\nSOURCE cannot be resolved"
      + "\nCONDITION cannot be resolved"
      + "\nDESTINATION cannot be resolved"
      + "\nACTION cannot be resolved"
      + "\nQ cannot be resolved");
  }

  protected BAST _toAST(final BehaviorState e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_state cannot be resolved"
      + "\nLITERAL_initial cannot be resolved"
      + "\nLITERAL_complete cannot be resolved"
      + "\nLITERAL_final cannot be resolved");
  }

  protected BAST _toAST(final BLESSSubclause e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nTHREAD_ANNEX cannot be resolved"
      + "\nLITERAL_states cannot be resolved"
      + "\nDO_NOT_PROVE cannot be resolved"
      + "\nSTOP cannot be resolved");
  }

  protected BAST _toAST(final DispatchCondition e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_dispatch cannot be resolved");
  }

  protected BAST _toAST(final DispatchConjunction e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_and cannot be resolved");
  }

  protected BAST _toAST(final DispatchExpression e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_or cannot be resolved");
  }

  protected BAST _toAST(final DispatchTrigger e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_timeout cannot be resolved"
      + "\nLPAREN cannot be resolved"
      + "\nRPAREN cannot be resolved"
      + "\nLITERAL_timeout cannot be resolved"
      + "\nLITERAL_timeout cannot be resolved");
  }

  protected BAST _toAST(final ExecuteCondition e) {
    BooleanExpression _eor = e.getEor();
    return this.toAST(((Expression) _eor));
  }

  protected BAST _toAST(final InternalCondition e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_dispatch cannot be resolved");
  }

  protected BAST _toAST(final InvariantClause e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_invariant cannot be resolved");
  }

  protected BAST _toAST(final IssueException e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_exception cannot be resolved");
  }

  protected BAST _toAST(final Transitions e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_transitions cannot be resolved");
  }

  protected BAST _toAST(final TriggerLogicalExpression e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_and cannot be resolved"
      + "\nLITERAL_or cannot be resolved"
      + "\nLITERAL_xor cannot be resolved"
      + "\nLITERAL_cand cannot be resolved"
      + "\nLITERAL_cor cannot be resolved");
  }

  protected BAST _toAST(final VariablesSection e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_variables cannot be resolved");
  }

  protected BAST _toAST(final BooleanType e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_boolean cannot be resolved");
  }

  protected BAST _toAST(final StringType e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_string cannot be resolved");
  }

  protected BAST _toAST(final TypeOrReference e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nThe method or field BLESStoASTLexer is undefined"
      + "\nLITERAL_time cannot be resolved"
      + "\nDUMMY cannot be resolved");
  }

  protected BAST _toAST(final Type e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _switchResult = null;
      boolean _matched = false;
      if (Objects.equal(e, ArrayType.class)) {
        _matched=true;
        _switchResult = this.toAST(((ArrayType) e));
      }
      if (!_matched) {
        if (Objects.equal(e, BooleanType.class)) {
          _matched=true;
          _switchResult = this.toAST(((BooleanType) e));
        }
      }
      if (!_matched) {
        if (Objects.equal(e, EnumerationType.class)) {
          _matched=true;
          _switchResult = this.toAST(((EnumerationType) e));
        }
      }
      if (!_matched) {
        if (Objects.equal(e, QuantityType.class)) {
          _matched=true;
          _switchResult = this.toAST(((QuantityType) e));
        }
      }
      if (!_matched) {
        if (Objects.equal(e, RecordType.class)) {
          _matched=true;
          _switchResult = this.toAST(((RecordType) e));
        }
      }
      if (!_matched) {
        if (Objects.equal(e, StringType.class)) {
          _matched=true;
          _switchResult = this.toAST(((StringType) e));
        }
      }
      _xtrycatchfinallyexpression = _switchResult;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception ex = (Exception)_t;
        BAST _xblockexpression = null;
        {
          ex.printStackTrace();
          _xblockexpression = ToAST.x;
        }
        _xtrycatchfinallyexpression = _xblockexpression;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }

  protected BAST _toAST(final ANumber e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _elvis = null;
      BAST _elvis_1 = null;
      String _lit = e.getLit();
      BAST _makeBASTforLIT = null;
      if (_lit!=null) {
        _makeBASTforLIT=this.makeBASTforLIT(_lit, e);
      }
      if (_makeBASTforLIT != null) {
        _elvis_1 = _makeBASTforLIT;
      } else {
        PropertyReference _property = e.getProperty();
        BAST _aST = null;
        if (_property!=null) {
          _aST=this.toAST(_property);
        }
        _elvis_1 = _aST;
      }
      if (_elvis_1 != null) {
        _elvis = _elvis_1;
      } else {
        PropertyConstant _propertyConstant = e.getPropertyConstant();
        String _qualifiedName = null;
        if (_propertyConstant!=null) {
          _qualifiedName=_propertyConstant.qualifiedName();
        }
        BAST _makeBASTforPropertyName = this.makeBASTforPropertyName(_qualifiedName, e);
        _elvis = _makeBASTforPropertyName;
      }
      _xtrycatchfinallyexpression = _elvis;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception ex = (Exception)_t;
        BAST _xblockexpression = null;
        {
          ex.printStackTrace();
          _xblockexpression = ToAST.x;
        }
        _xtrycatchfinallyexpression = _xblockexpression;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }

  protected BAST _toAST(final SubProgramParameter e) {
    BAST _elvis = null;
    BAST _elvis_1 = null;
    ValueName _value = null;
    if (e!=null) {
      _value=e.getValue();
    }
    BAST _aST = this.toAST(_value);
    if (_aST != null) {
      _elvis_1 = _aST;
    } else {
      Constant _constant = null;
      if (e!=null) {
        _constant=e.getConstant();
      }
      BAST _aST_1 = this.toAST(_constant);
      _elvis_1 = _aST_1;
    }
    if (_elvis_1 != null) {
      _elvis = _elvis_1;
    } else {
      ParenthesizedSubexpression _expression = null;
      if (e!=null) {
        _expression=e.getExpression();
      }
      BAST _aST_2 = this.toAST(_expression);
      _elvis = _aST_2;
    }
    return _elvis;
  }

  public BAST toAST(final Notifier e) {
    if (e instanceof ActionSubclause) {
      return _toAST((ActionSubclause)e);
    } else if (e instanceof BLESSSubclause) {
      return _toAST((BLESSSubclause)e);
    } else if (e instanceof AssertionLibrary) {
      return _toAST((AssertionLibrary)e);
    } else if (e instanceof BehaviorState) {
      return _toAST((BehaviorState)e);
    } else if (e instanceof BehaviorTransition) {
      return _toAST((BehaviorTransition)e);
    } else if (e instanceof Expression) {
      return _toAST((Expression)e);
    } else if (e instanceof NamedAssertion) {
      return _toAST((NamedAssertion)e);
    } else if (e instanceof Variable) {
      return _toAST((Variable)e);
    } else if (e instanceof ANumber) {
      return _toAST((ANumber)e);
    } else if (e instanceof Action) {
      return _toAST((Action)e);
    } else if (e instanceof ActualParameter) {
      return _toAST((ActualParameter)e);
    } else if (e instanceof AddSub) {
      return _toAST((AddSub)e);
    } else if (e instanceof Alternative) {
      return _toAST((Alternative)e);
    } else if (e instanceof ArrayRange) {
      return _toAST((ArrayRange)e);
    } else if (e instanceof ArrayRangeList) {
      return _toAST((ArrayRangeList)e);
    } else if (e instanceof ArrayType) {
      return _toAST((ArrayType)e);
    } else if (e instanceof AssertClause) {
      return _toAST((AssertClause)e);
    } else if (e instanceof AssertedAction) {
      return _toAST((AssertedAction)e);
    } else if (e instanceof Assertion) {
      return _toAST((Assertion)e);
    } else if (e instanceof AssertionEnumeration) {
      return _toAST((AssertionEnumeration)e);
    } else if (e instanceof AssertionFunctionValue) {
      return _toAST((AssertionFunctionValue)e);
    } else if (e instanceof Assignment) {
      return _toAST((Assignment)e);
    } else if (e instanceof BAAlternative) {
      return _toAST((BAAlternative)e);
    } else if (e instanceof BasicAction) {
      return _toAST((BasicAction)e);
    } else if (e instanceof BehaviorActions) {
      return _toAST((BehaviorActions)e);
    } else if (e instanceof BehaviorTime) {
      return _toAST((BehaviorTime)e);
    } else if (e instanceof BooleanType) {
      return _toAST((BooleanType)e);
    } else if (e instanceof CaseChoice) {
      return _toAST((CaseChoice)e);
    } else if (e instanceof CaseExpression) {
      return _toAST((CaseExpression)e);
    } else if (e instanceof CatchClause) {
      return _toAST((CatchClause)e);
    } else if (e instanceof CatchClauseTerm) {
      return _toAST((CatchClauseTerm)e);
    } else if (e instanceof CombinableOperation) {
      return _toAST((CombinableOperation)e);
    } else if (e instanceof CommunicationAction) {
      return _toAST((CommunicationAction)e);
    } else if (e instanceof Computation) {
      return _toAST((Computation)e);
    } else if (e instanceof ConditionValuePair) {
      return _toAST((ConditionValuePair)e);
    } else if (e instanceof ConditionalAssertionFunction) {
      return _toAST((ConditionalAssertionFunction)e);
    } else if (e instanceof ConditionalExpression) {
      return _toAST((ConditionalExpression)e);
    } else if (e instanceof Conjunction) {
      return _toAST((Conjunction)e);
    } else if (e instanceof Constant) {
      return _toAST((Constant)e);
    } else if (e instanceof CountingQuantification) {
      return _toAST((CountingQuantification)e);
    } else if (e instanceof Disjunction) {
      return _toAST((Disjunction)e);
    } else if (e instanceof DispatchCondition) {
      return _toAST((DispatchCondition)e);
    } else if (e instanceof DispatchConjunction) {
      return _toAST((DispatchConjunction)e);
    } else if (e instanceof DispatchExpression) {
      return _toAST((DispatchExpression)e);
    } else if (e instanceof DispatchTrigger) {
      return _toAST((DispatchTrigger)e);
    } else if (e instanceof DoUntilLoop) {
      return _toAST((DoUntilLoop)e);
    } else if (e instanceof EnumerationPair) {
      return _toAST((EnumerationPair)e);
    } else if (e instanceof EnumerationType) {
      return _toAST((EnumerationType)e);
    } else if (e instanceof EnumerationValue) {
      return _toAST((EnumerationValue)e);
    } else if (e instanceof ExecuteCondition) {
      return _toAST((ExecuteCondition)e);
    } else if (e instanceof ExistentialLatticeQuantification) {
      return _toAST((ExistentialLatticeQuantification)e);
    } else if (e instanceof ExistentialQuantification) {
      return _toAST((ExistentialQuantification)e);
    } else if (e instanceof Exp) {
      return _toAST((Exp)e);
    } else if (e instanceof ExpressionOrAny) {
      return _toAST((ExpressionOrAny)e);
    } else if (e instanceof ForLoop) {
      return _toAST((ForLoop)e);
    } else if (e instanceof FormalActual) {
      return _toAST((FormalActual)e);
    } else if (e instanceof FormalActualList) {
      return _toAST((FormalActualList)e);
    } else if (e instanceof FormalExpressionPair) {
      return _toAST((FormalExpressionPair)e);
    } else if (e instanceof GuardedAction) {
      return _toAST((GuardedAction)e);
    } else if (e instanceof IndexExpression) {
      return _toAST((IndexExpression)e);
    } else if (e instanceof IndexExpressionOrRange) {
      return _toAST((IndexExpressionOrRange)e);
    } else if (e instanceof InternalCondition) {
      return _toAST((InternalCondition)e);
    } else if (e instanceof InvariantClause) {
      return _toAST((InvariantClause)e);
    } else if (e instanceof Invocation) {
      return _toAST((Invocation)e);
    } else if (e instanceof IssueException) {
      return _toAST((IssueException)e);
    } else if (e instanceof LogicVariables) {
      return _toAST((LogicVariables)e);
    } else if (e instanceof ModeCondition) {
      return _toAST((ModeCondition)e);
    } else if (e instanceof MultDiv) {
      return _toAST((MultDiv)e);
    } else if (e instanceof NameTick) {
      return _toAST((NameTick)e);
    } else if (e instanceof NamelessAssertion) {
      return _toAST((NamelessAssertion)e);
    } else if (e instanceof NamelessEnumeration) {
      return _toAST((NamelessEnumeration)e);
    } else if (e instanceof NamelessFunction) {
      return _toAST((NamelessFunction)e);
    } else if (e instanceof ParenthesizedSubexpression) {
      return _toAST((ParenthesizedSubexpression)e);
    } else if (e instanceof PartialName) {
      return _toAST((PartialName)e);
    } else if (e instanceof PeriodShift) {
      return _toAST((PeriodShift)e);
    } else if (e instanceof PortInput) {
      return _toAST((PortInput)e);
    } else if (e instanceof PortOutput) {
      return _toAST((PortOutput)e);
    } else if (e instanceof ProductQuantification) {
      return _toAST((ProductQuantification)e);
    } else if (e instanceof PropertyField) {
      return _toAST((PropertyField)e);
    } else if (e instanceof PropertyReference) {
      return _toAST((PropertyReference)e);
    } else if (e instanceof QuantifiedVariables) {
      return _toAST((QuantifiedVariables)e);
    } else if (e instanceof Quantity) {
      return _toAST((Quantity)e);
    } else if (e instanceof QuantityType) {
      return _toAST((QuantityType)e);
    } else if (e instanceof Range) {
      return _toAST((Range)e);
    } else if (e instanceof RecordField) {
      return _toAST((RecordField)e);
    } else if (e instanceof RecordTerm) {
      return _toAST((RecordTerm)e);
    } else if (e instanceof RecordType) {
      return _toAST((RecordType)e);
    } else if (e instanceof RecordValue) {
      return _toAST((RecordValue)e);
    } else if (e instanceof Relation) {
      return _toAST((Relation)e);
    } else if (e instanceof SimultaneousAssignment) {
      return _toAST((SimultaneousAssignment)e);
    } else if (e instanceof StringType) {
      return _toAST((StringType)e);
    } else if (e instanceof SubProgramParameter) {
      return _toAST((SubProgramParameter)e);
    } else if (e instanceof Subexpression) {
      return _toAST((Subexpression)e);
    } else if (e instanceof SubprogramCall) {
      return _toAST((SubprogramCall)e);
    } else if (e instanceof SumQuantification) {
      return _toAST((SumQuantification)e);
    } else if (e instanceof TimedExpression) {
      return _toAST((TimedExpression)e);
    } else if (e instanceof TimedSubject) {
      return _toAST((TimedSubject)e);
    } else if (e instanceof Transitions) {
      return _toAST((Transitions)e);
    } else if (e instanceof TriggerLogicalExpression) {
      return _toAST((TriggerLogicalExpression)e);
    } else if (e instanceof TypeOrReference) {
      return _toAST((TypeOrReference)e);
    } else if (e instanceof UniversalLatticeQuantification) {
      return _toAST((UniversalLatticeQuantification)e);
    } else if (e instanceof UniversalQuantification) {
      return _toAST((UniversalQuantification)e);
    } else if (e instanceof Value) {
      return _toAST((Value)e);
    } else if (e instanceof ValueName) {
      return _toAST((ValueName)e);
    } else if (e instanceof VariableDeclaration) {
      return _toAST((VariableDeclaration)e);
    } else if (e instanceof VariableList) {
      return _toAST((VariableList)e);
    } else if (e instanceof VariablesSection) {
      return _toAST((VariablesSection)e);
    } else if (e instanceof WhenThrow) {
      return _toAST((WhenThrow)e);
    } else if (e instanceof WhileLoop) {
      return _toAST((WhileLoop)e);
    } else if (e instanceof Type) {
      return _toAST((Type)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}
