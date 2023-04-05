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
import com.multitude.aadl.bless.bLESS.BLESSAlternative;
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
import com.multitude.aadl.bless.bLESS.EventTrigger;
import com.multitude.aadl.bless.bLESS.ExecuteCondition;
import com.multitude.aadl.bless.bLESS.ExistentialLatticeQuantification;
import com.multitude.aadl.bless.bLESS.ExistentialQuantification;
import com.multitude.aadl.bless.bLESS.Exp;
import com.multitude.aadl.bless.bLESS.Expression;
import com.multitude.aadl.bless.bLESS.ExpressionOrAny;
import com.multitude.aadl.bless.bLESS.ForLoop;
import com.multitude.aadl.bless.bLESS.ForallVariable;
import com.multitude.aadl.bless.bLESS.FormalActual;
import com.multitude.aadl.bless.bLESS.FormalActualList;
import com.multitude.aadl.bless.bLESS.FormalExpressionPair;
import com.multitude.aadl.bless.bLESS.GhostVariable;
import com.multitude.aadl.bless.bLESS.GhostVariables;
import com.multitude.aadl.bless.bLESS.GuardedAction;
import com.multitude.aadl.bless.bLESS.IndexExpression;
import com.multitude.aadl.bless.bLESS.IndexExpressionOrRange;
import com.multitude.aadl.bless.bLESS.InternalCondition;
import com.multitude.aadl.bless.bLESS.InvariantClause;
import com.multitude.aadl.bless.bLESS.Invocation;
import com.multitude.aadl.bless.bLESS.IssueException;
import com.multitude.aadl.bless.bLESS.LogicVariables;
import com.multitude.aadl.bless.bLESS.LogicalOperator;
import com.multitude.aadl.bless.bLESS.ModeCondition;
import com.multitude.aadl.bless.bLESS.MultDiv;
import com.multitude.aadl.bless.bLESS.NameTick;
import com.multitude.aadl.bless.bLESS.NamedAssertion;
import com.multitude.aadl.bless.bLESS.NamelessAssertion;
import com.multitude.aadl.bless.bLESS.NamelessEnumeration;
import com.multitude.aadl.bless.bLESS.NamelessFunction;
import com.multitude.aadl.bless.bLESS.NullType;
import com.multitude.aadl.bless.bLESS.NumericExpression;
import com.multitude.aadl.bless.bLESS.ParenthesizedSubexpression;
import com.multitude.aadl.bless.bLESS.PartialName;
import com.multitude.aadl.bless.bLESS.PeriodShift;
import com.multitude.aadl.bless.bLESS.PortInput;
import com.multitude.aadl.bless.bLESS.PortOutput;
import com.multitude.aadl.bless.bLESS.Predicate;
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
import com.multitude.aadl.bless.bLESS.StatesSection;
import com.multitude.aadl.bless.bLESS.StringType;
import com.multitude.aadl.bless.bLESS.SubProgramParameter;
import com.multitude.aadl.bless.bLESS.Subexpression;
import com.multitude.aadl.bless.bLESS.SubprogramCall;
import com.multitude.aadl.bless.bLESS.SumQuantification;
import com.multitude.aadl.bless.bLESS.ThrowsClause;
import com.multitude.aadl.bless.bLESS.TimedExpression;
import com.multitude.aadl.bless.bLESS.TimedSubject;
import com.multitude.aadl.bless.bLESS.Transitions;
import com.multitude.aadl.bless.bLESS.TriggerLogicalExpression;
import com.multitude.aadl.bless.bLESS.Type;
import com.multitude.aadl.bless.bLESS.TypeDeclaration;
import com.multitude.aadl.bless.bLESS.TypeOrReference;
import com.multitude.aadl.bless.bLESS.UnaryOperator;
import com.multitude.aadl.bless.bLESS.UnitName;
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
import com.multitude.bless.antlr3generated.BLESS3Lexer;
import com.multitude.bless.app.Global;
import com.multitude.bless.tree.BAST;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.antlr.runtime.CommonToken;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.osate.aadl2.CalledSubprogram;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.Element;
import org.osate.aadl2.Mode;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.Parameter;
import org.osate.aadl2.Port;
import org.osate.aadl2.Property;
import org.osate.aadl2.PropertyConstant;
import org.osate.aadl2.SubprogramAccess;
import org.osate.aadl2.SubprogramSubcomponent;

@SuppressWarnings("all")
public class ToAST {
  public static final ToAST TOAST = new ToAST();

  public static BAST x = new BAST("x");

  public BAST newBAST(final Element e) {
    return new BAST(e);
  }

  public BAST makeBASTforID(final String id, final Element parent) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(parent);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = id;
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.ID, id);
        it.token = _commonToken;
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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
    BAST _xblockexpression = null;
    {
      boolean _eIsProxy = pr.eIsProxy();
      if (_eIsProxy) {
        EcoreUtil.resolve(pr, e);
      }
      BAST _xtrycatchfinallyexpression = null;
      try {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = "#";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.OCTOTHORPE, "#");
          it.token = _commonToken;
          boolean _isSelf = pr.isSelf();
          if (_isSelf) {
            BAST _newBAST_1 = this.newBAST(e);
            final Procedure1<BAST> _function_1 = (BAST it_1) -> {
              it_1.myText = "self";
              CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_self, "self");
              it_1.token = _commonToken_1;
            };
            BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
            it.addChild(_doubleArrow);
          }
          Property _pname = pr.getPname();
          boolean _tripleNotEquals = (_pname != null);
          if (_tripleNotEquals) {
            it.addChild(this.makeBASTforPropertyName(pr.getPname().qualifiedName(), e));
          } else {
            Property _spname = pr.getSpname();
            boolean _tripleNotEquals_1 = (_spname != null);
            if (_tripleNotEquals_1) {
              it.addChild(this.makeBASTforPropertyName(pr.getSpname().qualifiedName(), e));
            } else {
              ComponentClassifier _component = pr.getComponent();
              boolean _tripleNotEquals_2 = (_component != null);
              if (_tripleNotEquals_2) {
                it.addChild(this.makeBASTforComponentClassifier(pr.getComponent().qualifiedName(), e));
                it.addChild(this.makeBASTforPropertyName(pr.getCpname().qualifiedName(), e));
              }
            }
          }
          EList<PropertyField> _field = pr.getField();
          for (final PropertyField f : _field) {
            it.addChild(this.makeBASTforPropertyField(f, e));
          }
        };
        _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return _xblockexpression;
  }

  public BAST makeBASTforComponentClassifier(final String s, final Element e) {
    BAST _newBAST = this.newBAST(e);
    final Procedure1<BAST> _function = (BAST it) -> {
      it.myText = "::";
      CommonToken _commonToken = new CommonToken(BLESS3Lexer.DOUBLE_COLON, "::");
      it.token = _commonToken;
      List<String> _componentClassifierStrings = null;
      if (s!=null) {
        _componentClassifierStrings=this.getComponentClassifierStrings(s);
      }
      for (final String c : _componentClassifierStrings) {
        it.addChild(this.makeBASTforINT(c, e));
      }
    };
    return ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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
    BAST _xifexpression = null;
    String _index = f.getIndex();
    boolean _tripleNotEquals = (_index != null);
    if (_tripleNotEquals) {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "[";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LBRACKET, "[");
        it.token = _commonToken;
        it.addChild(this.makeBASTforINT(f.getIndex(), e));
        BAST _newBAST_1 = this.newBAST(e);
        final Procedure1<BAST> _function_1 = (BAST it_1) -> {
          it_1.myText = "]";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.RBRACKET, "]");
          it_1.token = _commonToken_1;
        };
        BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        it.addChild(_doubleArrow);
      };
      _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
    } else {
      BAST _xifexpression_1 = null;
      Variable _variable = f.getVariable();
      boolean _tripleNotEquals_1 = (_variable != null);
      if (_tripleNotEquals_1) {
        BAST _newBAST_1 = this.newBAST(e);
        final Procedure1<BAST> _function_1 = (BAST it) -> {
          it.myText = "[";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.LBRACKET, "[");
          it.token = _commonToken;
          it.addChild(this.makeBASTforID(f.getVariable().getName(), e));
          BAST _newBAST_2 = this.newBAST(e);
          final Procedure1<BAST> _function_2 = (BAST it_1) -> {
            it_1.myText = "]";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.RBRACKET, "]");
            it_1.token = _commonToken_1;
          };
          BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
          it.addChild(_doubleArrow);
        };
        _xifexpression_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
      } else {
        BAST _xifexpression_2 = null;
        String _pf = f.getPf();
        boolean _tripleNotEquals_2 = (_pf != null);
        if (_tripleNotEquals_2) {
          BAST _newBAST_2 = this.newBAST(e);
          final Procedure1<BAST> _function_2 = (BAST it) -> {
            it.myText = ".";
            CommonToken _commonToken = new CommonToken(BLESS3Lexer.DOT, ".");
            it.token = _commonToken;
            it.addChild(this.makeBASTforID(f.getPf(), e));
          };
          _xifexpression_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
        } else {
          BAST _xifexpression_3 = null;
          String _upper = f.getUpper();
          boolean _tripleNotEquals_3 = (_upper != null);
          if (_tripleNotEquals_3) {
            BAST _newBAST_3 = this.newBAST(e);
            final Procedure1<BAST> _function_3 = (BAST it) -> {
              it.myText = ".";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.DOT, ".");
              it.token = _commonToken;
              BAST _newBAST_4 = this.newBAST(e);
              final Procedure1<BAST> _function_4 = (BAST it_1) -> {
                it_1.myText = "upper_bound";
                CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_upper_bound, "upper_bound");
                it_1.token = _commonToken_1;
              };
              BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_4, _function_4);
              it.addChild(_doubleArrow);
            };
            _xifexpression_3 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
          } else {
            BAST _xifexpression_4 = null;
            String _lower = f.getLower();
            boolean _tripleNotEquals_4 = (_lower != null);
            if (_tripleNotEquals_4) {
              BAST _newBAST_4 = this.newBAST(e);
              final Procedure1<BAST> _function_4 = (BAST it) -> {
                it.myText = ".";
                CommonToken _commonToken = new CommonToken(BLESS3Lexer.DOT, ".");
                it.token = _commonToken;
                BAST _newBAST_5 = this.newBAST(e);
                final Procedure1<BAST> _function_5 = (BAST it_1) -> {
                  it_1.myText = "lower_bound";
                  CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_lower_bound, "lower_bound");
                  it_1.token = _commonToken_1;
                };
                BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_5, _function_5);
                it.addChild(_doubleArrow);
              };
              _xifexpression_4 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_4, _function_4);
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }

  /**
   * make a BAST node for an integer literal
   * used by AssertionValue , NaturalConstant
   */
  public BAST makeBASTforINT(final String integer_literal, final Element parent) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(parent);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = integer_literal;
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.NUMBER, integer_literal);
        it.token = _commonToken;
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  /**
   * make a BAST node for a real literal
   * used by AssertionValue , ValueConstant
   */
  public BAST makeBASTforREAL_LIT(final String real_literal, final Element parent) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(parent);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = real_literal;
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.NUMBER, real_literal);
        it.token = _commonToken;
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(parent);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = string_literal;
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.AADL_STRING_LITERAL, string_literal);
        it.token = _commonToken;
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  /**
   * make a BAST node for a RangeSymbol : DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA;
   * used by LogicVariableDomain , Range
   */
  public BAST makeBASTforRangeSymbol(final String mySymbol, final Element parent) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _switchResult = null;
      if (mySymbol != null) {
        switch (mySymbol) {
          case "..":
            BAST _newBAST = this.newBAST(parent);
            final Procedure1<BAST> _function = (BAST it) -> {
              it.myText = "..";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.DOTDOT, "..");
              it.token = _commonToken;
            };
            _switchResult = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
            break;
          case ",.":
            BAST _newBAST_1 = this.newBAST(parent);
            final Procedure1<BAST> _function_1 = (BAST it) -> {
              it.myText = ",.";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.COMMADOT, ",.");
              it.token = _commonToken;
            };
            _switchResult = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
            break;
          case ".,":
            BAST _newBAST_2 = this.newBAST(parent);
            final Procedure1<BAST> _function_2 = (BAST it) -> {
              it.myText = ".,";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.DOTCOMMA, ".,");
              it.token = _commonToken;
            };
            _switchResult = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
            break;
          case ",,":
            BAST _newBAST_3 = this.newBAST(parent);
            final Procedure1<BAST> _function_3 = (BAST it) -> {
              it.myText = ",,";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.COMMACOMMA, ",,");
              it.token = _commonToken;
            };
            _switchResult = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
            break;
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

  /**
   * make a BAST node for a RelationSymbol : '=' | '<>' | '<' | '<=' | '>=' | '>';
   * used by PredicateRelation, ExpressionOrRelation
   */
  public BAST makeBASTforRelationSymbol(final String mySymbol, final Element parent) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _switchResult = null;
      if (mySymbol != null) {
        switch (mySymbol) {
          case "=":
            BAST _newBAST = this.newBAST(parent);
            final Procedure1<BAST> _function = (BAST it) -> {
              it.myText = "=";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.EQ, "=");
              it.token = _commonToken;
            };
            _switchResult = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
            break;
          case "<>":
            BAST _newBAST_1 = this.newBAST(parent);
            final Procedure1<BAST> _function_1 = (BAST it) -> {
              it.myText = "<>";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.NEQ, "<>");
              it.token = _commonToken;
            };
            _switchResult = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
            break;
          case "<":
            BAST _newBAST_2 = this.newBAST(parent);
            final Procedure1<BAST> _function_2 = (BAST it) -> {
              it.myText = "<";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.LT, "<");
              it.token = _commonToken;
            };
            _switchResult = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
            break;
          case "<=":
            BAST _newBAST_3 = this.newBAST(parent);
            final Procedure1<BAST> _function_3 = (BAST it) -> {
              it.myText = "<=";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.AM, "<=");
              it.token = _commonToken;
            };
            _switchResult = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
            break;
          case ">=":
            BAST _newBAST_4 = this.newBAST(parent);
            final Procedure1<BAST> _function_4 = (BAST it) -> {
              it.myText = ">=";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.AL, ">=");
              it.token = _commonToken;
            };
            _switchResult = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_4, _function_4);
            break;
          case ">":
            BAST _newBAST_5 = this.newBAST(parent);
            final Procedure1<BAST> _function_5 = (BAST it) -> {
              it.myText = ">";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.GT, ">");
              it.token = _commonToken;
            };
            _switchResult = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_5, _function_5);
            break;
          case "!=":
            BAST _newBAST_6 = this.newBAST(parent);
            final Procedure1<BAST> _function_6 = (BAST it) -> {
              it.myText = "!=";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.OLD_NEQ, "!=");
              it.token = _commonToken;
            };
            _switchResult = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_6, _function_6);
            break;
          case "+=":
            BAST _newBAST_7 = this.newBAST(parent);
            final Procedure1<BAST> _function_7 = (BAST it) -> {
              it.myText = "+=";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.PLUS_EQUALS, "+=");
              it.token = _commonToken;
            };
            _switchResult = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_7, _function_7);
            break;
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

  /**
   * make a BAST node for an AADL Property
   * used by
   */
  public BAST makeBASTforPropertyName(final String property_name, final Element parent) {
    BAST _newBAST = this.newBAST(parent);
    final Procedure1<BAST> _function = (BAST it) -> {
      it.myText = property_name;
      CommonToken _commonToken = new CommonToken(BLESS3Lexer.QCLREF, property_name);
      it.token = _commonToken;
    };
    return ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
  }

  /**
   * make a BAST node for an AADL component port
   * used by
   */
  public BAST makeBASTforPort(final String port_name, final Element parent) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(parent);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = port_name;
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.ID, port_name);
        it.token = _commonToken;
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  /**
   * make a BAST node for an AADL_STRING_LITERAL
   * used by
   */
  public BAST makeBASTforAADL_STRING_LITERAL(final String theString, final Element parent) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(parent);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = theString;
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.AADL_STRING_LITERAL, theString);
        it.token = _commonToken;
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.ASSERTION_ANNEX, "ASSERTION_ANNEX");
        it.token = _commonToken;
        it.myText = "ASSERTION_ANNEX";
        GhostVariables _ghosts = e.getGhosts();
        boolean _tripleNotEquals = (_ghosts != null);
        if (_tripleNotEquals) {
          it.addChild(this.toAST(e.getGhosts()));
        }
        EList<NamedAssertion> _assertion_list = e.getAssertion_list();
        for (final NamedAssertion child : _assertion_list) {
          it.addChild(this.toAST(child));
        }
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.PLUS_ARROW, "+=>");
        it.token = _commonToken;
        it.myText = "+=>";
        Invocation _pred = e.getPred();
        boolean _tripleNotEquals = (_pred != null);
        if (_tripleNotEquals) {
          it.addChild(this.toAST(e.getPred()));
        } else {
          int _size = e.getPair().size();
          boolean _equals = (_size == 1);
          if (_equals) {
            it.addChild(this.toAST(IterableExtensions.<EnumerationPair>head(e.getPair())));
          } else {
            BAST _newBAST_1 = this.newBAST(e);
            final Procedure1<BAST> _function_1 = (BAST it_1) -> {
              CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.COMMA, ",");
              it_1.token = _commonToken_1;
              it_1.myText = ",";
              EList<EnumerationPair> _pair = e.getPair();
              for (final EnumerationPair child : _pair) {
                it_1.addChild(this.toAST(child));
              }
            };
            BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
            it.addChild(_doubleArrow);
          }
        }
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final SumQuantification e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_sum, "sum");
        it.token = _commonToken;
        it.myText = "sum";
        it.addChild(this.toAST(e.getVariables()));
        boolean _isIn = e.isIn();
        if (_isIn) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it_1) -> {
            it_1.myText = "in";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_in, "in");
            it_1.token = _commonToken_1;
            it_1.addChild(this.toAST(e.getRange()));
          };
          BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
          it.addChild(_doubleArrow);
        } else {
          boolean _isWhich = e.isWhich();
          if (_isWhich) {
            BAST _newBAST_2 = this.newBAST(e);
            final Procedure1<BAST> _function_2 = (BAST it_1) -> {
              it_1.myText = "which";
              CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_which, "which");
              it_1.token = _commonToken_1;
              Predicate _condition = e.getCondition();
              it_1.addChild(this.toAST(((Expression) _condition)));
            };
            BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
            it.addChild(_doubleArrow_1);
          }
        }
        BAST _newBAST_3 = this.newBAST(e);
        final Procedure1<BAST> _function_3 = (BAST it_1) -> {
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_of, "of");
          it_1.token = _commonToken_1;
          it_1.myText = "of";
          it_1.addChild(this.toAST(e.getNumeric_expression()));
        };
        BAST _doubleArrow_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
        it.addChild(_doubleArrow_2);
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final ProductQuantification e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_product, "product");
        it.token = _commonToken;
        it.myText = "product";
        it.addChild(this.toAST(e.getVariables()));
        boolean _isIn = e.isIn();
        if (_isIn) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it_1) -> {
            it_1.myText = "in";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_in, "in");
            it_1.token = _commonToken_1;
            it_1.addChild(this.toAST(e.getRange()));
          };
          BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
          it.addChild(_doubleArrow);
        } else {
          boolean _isWhich = e.isWhich();
          if (_isWhich) {
            BAST _newBAST_2 = this.newBAST(e);
            final Procedure1<BAST> _function_2 = (BAST it_1) -> {
              it_1.myText = "which";
              CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_which, "which");
              it_1.token = _commonToken_1;
              Predicate _condition = e.getCondition();
              it_1.addChild(this.toAST(((Expression) _condition)));
            };
            BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
            it.addChild(_doubleArrow_1);
          }
        }
        BAST _newBAST_3 = this.newBAST(e);
        final Procedure1<BAST> _function_3 = (BAST it_1) -> {
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_of, "of");
          it_1.token = _commonToken_1;
          it_1.myText = "of";
          it_1.addChild(this.toAST(e.getNumeric_expression()));
        };
        BAST _doubleArrow_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
        it.addChild(_doubleArrow_2);
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final CountingQuantification e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_numberof, "numberof");
        it.token = _commonToken;
        it.myText = "numberof";
        it.addChild(this.toAST(e.getVariables()));
        boolean _isIn = e.isIn();
        if (_isIn) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it_1) -> {
            it_1.myText = "in";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_in, "in");
            it_1.token = _commonToken_1;
            it_1.addChild(this.toAST(e.getRange()));
          };
          BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
          it.addChild(_doubleArrow);
        } else {
          boolean _isWhich = e.isWhich();
          if (_isWhich) {
            BAST _newBAST_2 = this.newBAST(e);
            final Procedure1<BAST> _function_2 = (BAST it_1) -> {
              it_1.myText = "which";
              CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_which, "which");
              it_1.token = _commonToken_1;
              Predicate _condition = e.getCondition();
              it_1.addChild(this.toAST(((Expression) _condition)));
            };
            BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
            it.addChild(_doubleArrow_1);
          }
        }
        BAST _newBAST_3 = this.newBAST(e);
        final Procedure1<BAST> _function_3 = (BAST it_1) -> {
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_that, "that");
          it_1.token = _commonToken_1;
          it_1.myText = "that";
          Predicate _counted = e.getCounted();
          it_1.addChild(this.toAST(((Expression) _counted)));
        };
        BAST _doubleArrow_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
        it.addChild(_doubleArrow_2);
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "->";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.IMP, "->");
        it.token = _commonToken;
        Predicate _condition = e.getCondition();
        it.addChild(this.parenthesize(this.toAST(((Expression) _condition)), e));
        AssertionNumericExpression _expression = e.getExpression();
        it.addChild(this.toAST(((Expression) _expression)));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  public BAST parenthesize(final BAST pred, final Element e) {
    BAST _xblockexpression = null;
    {
      if ((((pred.getChildCount() == 0) || pred.hasType(BLESS3Lexer.AT_SIGN)) || pred.hasType(BLESS3Lexer.LBRACKET))) {
        return pred;
      }
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "(";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LPAREN, "(");
        it.token = _commonToken;
        it.addChild(pred);
        BAST _newBAST_1 = this.newBAST(e);
        final Procedure1<BAST> _function_1 = (BAST it_1) -> {
          it_1.myText = ")";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.RPAREN, ")");
          it_1.token = _commonToken_1;
        };
        BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        it.addChild(_doubleArrow);
      };
      _xblockexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
    }
    return _xblockexpression;
  }

  protected BAST _toAST(final ConditionalExpression e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "(";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LPAREN, "(");
        it.token = _commonToken;
        BAST _newBAST_1 = this.newBAST(e);
        final Procedure1<BAST> _function_1 = (BAST it_1) -> {
          it_1.myText = "QQ";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.QQ, "QQ");
          it_1.token = _commonToken_1;
          it_1.addChild(this.toAST(e.getPred()));
          it_1.addChild(this.toAST(e.getT()));
          it_1.addChild(this.toAST(e.getF()));
        };
        BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        it.addChild(_doubleArrow);
        BAST _newBAST_2 = this.newBAST(e);
        final Procedure1<BAST> _function_2 = (BAST it_1) -> {
          it_1.myText = ")";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.RPAREN, ")");
          it_1.token = _commonToken_1;
        };
        BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
        it.addChild(_doubleArrow_1);
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final ConditionalAssertionFunction e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "CONDITIONAL_ASSERTION_FUNCTION";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.CONDITIONAL_ASSERTION_FUNCTION, "CONDITIONAL_ASSERTION_FUNCTION");
        it.token = _commonToken;
        EList<ConditionValuePair> _cvp = e.getCvp();
        for (final ConditionValuePair child : _cvp) {
          it.addChild(this.toAST(child));
        }
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final EnumerationPair e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "->";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.IMP, "->");
        it.token = _commonToken;
        it.addChild(this.makeBASTforID(e.getEnumeration_literal(), e));
        Predicate _predicate = e.getPredicate();
        it.addChild(this.toAST(((Expression) _predicate)));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final ExistentialQuantification e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "exists";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_exists, "exists");
        it.token = _commonToken;
        it.addChild(this.toAST(e.getVariables()));
        boolean _isIn = e.isIn();
        if (_isIn) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it_1) -> {
            it_1.myText = "in";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_in, "in");
            it_1.token = _commonToken_1;
            it_1.addChild(this.toAST(e.getRange()));
          };
          BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
          it.addChild(_doubleArrow);
        } else {
          boolean _isWhich = e.isWhich();
          if (_isWhich) {
            BAST _newBAST_2 = this.newBAST(e);
            final Procedure1<BAST> _function_2 = (BAST it_1) -> {
              it_1.myText = "which";
              CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_which, "which");
              it_1.token = _commonToken_1;
              Predicate _condition = e.getCondition();
              it_1.addChild(this.toAST(((Expression) _condition)));
            };
            BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
            it.addChild(_doubleArrow_1);
          }
        }
        BAST _newBAST_3 = this.newBAST(e);
        final Procedure1<BAST> _function_3 = (BAST it_1) -> {
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_that, "that");
          it_1.token = _commonToken_1;
          it_1.myText = "that";
          Predicate _predicate = e.getPredicate();
          it_1.addChild(this.toAST(((Expression) _predicate)));
        };
        BAST _doubleArrow_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
        it.addChild(_doubleArrow_2);
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final Variable e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "~";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.TILDE, "~");
        it.token = _commonToken;
        it.addChild(this.makeBASTforID(e.getName(), e));
        it.addChild(this.toAST(e.getTod()));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final VariableList e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      boolean _isComma = e.isComma();
      if (_isComma) {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = ",";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.COMMA, ",");
          it.token = _commonToken;
          it.addChild(this.toAST(e.getFirst()));
          EList<Variable> _parameter = e.getParameter();
          for (final Variable child : _parameter) {
            it.addChild(this.toAST(child));
          }
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
      } else {
        _xifexpression = this.toAST(e.getFirst());
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

  protected BAST _toAST(final IndexExpressionOrRange e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      boolean _isDd = e.isDd();
      if (_isDd) {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = "..";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.DOTDOT, "..");
          it.token = _commonToken;
          it.addChild(this.toAST(e.getLeft_hand_side()));
          it.addChild(this.toAST(e.getRight_hand_side()));
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
      } else {
        _xifexpression = this.toAST(e.getLeft_hand_side());
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

  protected BAST _toAST(final PeriodShift e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      boolean _isUnary_minus = e.isUnary_minus();
      if (_isUnary_minus) {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = "-";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.UNARY_MINUS, "-");
          it.token = _commonToken;
          Value _v = e.getV();
          boolean _tripleNotEquals = (_v != null);
          if (_tripleNotEquals) {
            it.addChild(this.toAST(e.getV()));
          } else {
            IndexExpression _index_expression = e.getIndex_expression();
            boolean _tripleNotEquals_1 = (_index_expression != null);
            if (_tripleNotEquals_1) {
              it.addChild(this.parenthesize(e.getIndex_expression()));
            }
          }
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
      } else {
        BAST _xifexpression_1 = null;
        Value _v = e.getV();
        boolean _tripleNotEquals = (_v != null);
        if (_tripleNotEquals) {
          _xifexpression_1 = this.toAST(e.getV());
        } else {
          BAST _xifexpression_2 = null;
          IndexExpression _index_expression = e.getIndex_expression();
          boolean _tripleNotEquals_1 = (_index_expression != null);
          if (_tripleNotEquals_1) {
            _xifexpression_2 = this.parenthesize(e.getIndex_expression());
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

  protected BAST _toAST(final IndexExpression ie) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      if (((ie.getSym() != null) && ie.getSym().equals("-"))) {
        BAST _newBAST = this.newBAST(ie);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = "-";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.MINUS, "-");
          it.token = _commonToken;
          it.addChild(this.toAST(ie.getL()));
          it.addChild(this.toAST(IterableExtensions.<PeriodShift>head(ie.getR())));
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
      } else {
        BAST _xifexpression_1 = null;
        if (((ie.getSym() != null) && ie.getSym().equals("div"))) {
          BAST _newBAST_1 = this.newBAST(ie);
          final Procedure1<BAST> _function_1 = (BAST it) -> {
            it.myText = "div";
            CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_div, "div");
            it.token = _commonToken;
            it.addChild(this.toAST(ie.getL()));
            it.addChild(this.toAST(IterableExtensions.<PeriodShift>head(ie.getR())));
          };
          _xifexpression_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        } else {
          BAST _xifexpression_2 = null;
          if (((ie.getSym() != null) && ie.getSym().equals("mod"))) {
            BAST _newBAST_2 = this.newBAST(ie);
            final Procedure1<BAST> _function_2 = (BAST it) -> {
              it.myText = "mod";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_mod, "mod");
              it.token = _commonToken;
              it.addChild(this.toAST(ie.getL()));
              it.addChild(this.toAST(IterableExtensions.<PeriodShift>head(ie.getR())));
            };
            _xifexpression_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
          } else {
            BAST _xifexpression_3 = null;
            if (((ie.getSym() != null) && ie.getSym().equals("+"))) {
              BAST _newBAST_3 = this.newBAST(ie);
              final Procedure1<BAST> _function_3 = (BAST it) -> {
                it.myText = "+";
                CommonToken _commonToken = new CommonToken(BLESS3Lexer.PLUS, "+");
                it.token = _commonToken;
                it.addChild(this.toAST(ie.getL()));
                EList<PeriodShift> _r = ie.getR();
                for (final PeriodShift ch : _r) {
                  it.addChild(this.toAST(ch));
                }
              };
              _xifexpression_3 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
            } else {
              BAST _xifexpression_4 = null;
              if (((ie.getSym() != null) && ie.getSym().equals("*"))) {
                BAST _newBAST_4 = this.newBAST(ie);
                final Procedure1<BAST> _function_4 = (BAST it) -> {
                  it.myText = "*";
                  CommonToken _commonToken = new CommonToken(BLESS3Lexer.TIMES, "*");
                  it.token = _commonToken;
                  it.addChild(this.toAST(ie.getL()));
                  EList<PeriodShift> _r = ie.getR();
                  for (final PeriodShift ch : _r) {
                    it.addChild(this.toAST(ch));
                  }
                };
                _xifexpression_4 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_4, _function_4);
              } else {
                _xifexpression_4 = this.toAST(ie.getL());
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

  public BAST parenthesize(final IndexExpression ie) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(ie);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "(";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LPAREN, "(");
        it.token = _commonToken;
        it.addChild(this.toAST(ie));
        BAST _newBAST_1 = this.newBAST(ie);
        final Procedure1<BAST> _function_1 = (BAST it_1) -> {
          it_1.myText = ")";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.RPAREN, ")");
          it_1.token = _commonToken_1;
        };
        BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        it.addChild(_doubleArrow);
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final LogicVariables e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      int _size = e.getLv().size();
      boolean _tripleEquals = (_size == 1);
      if (_tripleEquals) {
        _xifexpression = this.toAST(IterableExtensions.<Variable>head(e.getLv()));
      } else {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = ",";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.COMMA, ",");
          it.token = _commonToken;
          EList<Variable> _lv = e.getLv();
          for (final Variable v : _lv) {
            it.addChild(this.toAST(v));
          }
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final ModeCondition e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "on";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_on, "on");
        it.token = _commonToken;
        it.addChild(this.toAST(e.getTle()));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final ValueName e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      boolean _isLp = e.isLp();
      if (_isLp) {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = e.getId().getName();
          String _name = e.getId().getName();
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.ID, _name);
          it.token = _commonToken;
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it_1) -> {
            it_1.myText = "$";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.DOLLAR, "$");
            it_1.token = _commonToken_1;
          };
          BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
          it.addChild(_doubleArrow);
          it.addChild(this.toAST(e.getPr()));
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
      } else {
        BAST _xifexpression_1 = null;
        boolean _isLb = e.isLb();
        if (_isLb) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it) -> {
            it.myText = e.getId().getName();
            String _name = e.getId().getName();
            CommonToken _commonToken = new CommonToken(BLESS3Lexer.ID, _name);
            it.token = _commonToken;
            BAST _newBAST_2 = this.newBAST(e);
            final Procedure1<BAST> _function_2 = (BAST it_1) -> {
              it_1.myText = "[";
              CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LBRACKET, "[");
              it_1.token = _commonToken_1;
              EList<IndexExpressionOrRange> _array_index = e.getArray_index();
              for (final IndexExpressionOrRange index : _array_index) {
                it_1.addChild(this.toAST(index));
              }
            };
            BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
            it.addChild(_doubleArrow);
            boolean _isDot = e.isDot();
            if (_isDot) {
              BAST _newBAST_3 = this.newBAST(e);
              final Procedure1<BAST> _function_3 = (BAST it_1) -> {
                it_1.myText = ".";
                CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.DOT, ".");
                it_1.token = _commonToken_1;
                EList<PartialName> _pn = e.getPn();
                for (final PartialName partial_name : _pn) {
                  it_1.addChild(this.toAST(partial_name));
                }
              };
              BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
              it.addChild(_doubleArrow_1);
            }
          };
          _xifexpression_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        } else {
          BAST _xifexpression_2 = null;
          boolean _isDot = e.isDot();
          if (_isDot) {
            BAST _newBAST_2 = this.newBAST(e);
            final Procedure1<BAST> _function_2 = (BAST it) -> {
              it.myText = ".";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.DOT, ".");
              it.token = _commonToken;
              EList<PartialName> _pn = e.getPn();
              for (final PartialName partial_name : _pn) {
                it.addChild(this.toAST(partial_name));
              }
            };
            _xifexpression_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
          } else {
            BAST _xifexpression_3 = null;
            boolean _isQ = e.isQ();
            if (_isQ) {
              BAST _newBAST_3 = this.newBAST(e);
              final Procedure1<BAST> _function_3 = (BAST it) -> {
                it.myText = "?";
                CommonToken _commonToken = new CommonToken(BLESS3Lexer.QUESTION, "?");
                it.token = _commonToken;
                it.addChild(this.makeBASTforPort(e.getId().getName(), e));
              };
              _xifexpression_3 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
            } else {
              BAST _xifexpression_4 = null;
              boolean _isFresh = e.isFresh();
              if (_isFresh) {
                String _name = e.getId().getName();
                String _plus = (_name + "\'fresh");
                _xifexpression_4 = this.makeBASTforPort(_plus, e);
              } else {
                BAST _xifexpression_5 = null;
                boolean _isCount = e.isCount();
                if (_isCount) {
                  String _name_1 = e.getId().getName();
                  String _plus_1 = (_name_1 + "\'count");
                  _xifexpression_5 = this.makeBASTforPort(_plus_1, e);
                } else {
                  BAST _xifexpression_6 = null;
                  boolean _isUpdated = e.isUpdated();
                  if (_isUpdated) {
                    String _name_2 = e.getId().getName();
                    String _plus_2 = (_name_2 + "\'updated");
                    _xifexpression_6 = this.makeBASTforPort(_plus_2, e);
                  } else {
                    BAST _newBAST_4 = this.newBAST(e);
                    final Procedure1<BAST> _function_4 = (BAST it) -> {
                      it.myText = e.getId().getName();
                      String _name_3 = e.getId().getName();
                      CommonToken _commonToken = new CommonToken(BLESS3Lexer.ID, _name_3);
                      it.token = _commonToken;
                    };
                    _xifexpression_6 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_4, _function_4);
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

  protected BAST _toAST(final FormalExpressionPair e) {
    BAST _newBAST = this.newBAST(e);
    final Procedure1<BAST> _function = (BAST it) -> {
      it.myText = ":";
      CommonToken _commonToken = new CommonToken(BLESS3Lexer.COLON, ":");
      it.token = _commonToken;
      it.addChild(this.makeBASTforID(e.getFormal(), e));
      it.addChild(this.toAST(e.getActual()));
    };
    return ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
  }

  protected BAST _toAST(final NamelessAssertion e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "ASSERTION";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.ASSERTION, "ASSERTION");
        it.token = _commonToken;
        Predicate _predicate = e.getPredicate();
        it.addChild(this.toAST(((Expression) _predicate)));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final NamelessFunction e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "ASSERTION_FUNCTION";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.ASSERTION_FUNCTION, "ASSERTION_FUNCTION");
        it.token = _commonToken;
        BAST _newBAST_1 = this.newBAST(e);
        final Procedure1<BAST> _function_1 = (BAST it_1) -> {
          it_1.myText = "returns";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_returns, "returns");
          it_1.token = _commonToken_1;
          it_1.addChild(this.toAST(e.getTod()));
        };
        BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        it.addChild(_doubleArrow);
        it.addChild(this.toAST(e.getFunctionvalue()));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final NamelessEnumeration e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "ASSERTION_ENUMERATION";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.ASSERTION_ENUMERATION, "ASSERTION_ENUMERATION");
        it.token = _commonToken;
        it.addChild(this.toAST(e.getEnumeration()));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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
    BAST _newBAST = this.newBAST(e);
    final Procedure1<BAST> _function = (BAST it) -> {
      String _name = e.getLabel().getName();
      String _plus = ("INVOKE[" + _name);
      String _plus_1 = (_plus + "]");
      it.myText = _plus_1;
      String _name_1 = e.getLabel().getName();
      String _plus_2 = ("INVOKE[" + _name_1);
      String _plus_3 = (_plus_2 + "]");
      CommonToken _commonToken = new CommonToken(BLESS3Lexer.INVOKE, _plus_3);
      it.token = _commonToken;
      it.addChild(this.makeBASTforID(e.getLabel().getName(), e));
      NumericExpression _actual_parameter = e.getActual_parameter();
      boolean _tripleNotEquals = (_actual_parameter != null);
      if (_tripleNotEquals) {
        it.addChild(this.toAST(e.getActual_parameter()));
      } else {
        EList<ActualParameter> _params = e.getParams();
        boolean _tripleNotEquals_1 = (_params != null);
        if (_tripleNotEquals_1) {
          EList<ActualParameter> _params_1 = e.getParams();
          for (final ActualParameter param : _params_1) {
            it.addChild(this.toAST(param));
          }
        }
      }
    };
    return ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
  }

  protected BAST _toAST(final Relation e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      String _in = e.getIn();
      boolean _tripleNotEquals = (_in != null);
      if (_tripleNotEquals) {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = "in";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_in, "in");
          it.token = _commonToken;
          it.addChild(this.toAST(e.getL()));
          it.addChild(this.toAST(e.getRange()));
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
      } else {
        BAST _xifexpression_1 = null;
        String _sym = e.getSym();
        boolean _tripleNotEquals_1 = (_sym != null);
        if (_tripleNotEquals_1) {
          BAST _makeBASTforRelationSymbol = this.makeBASTforRelationSymbol(e.getSym(), e);
          final Procedure1<BAST> _function_1 = (BAST it) -> {
            it.addChild(this.toAST(e.getL()));
            it.addChild(this.toAST(e.getR()));
          };
          _xifexpression_1 = ObjectExtensions.<BAST>operator_doubleArrow(_makeBASTforRelationSymbol, _function_1);
        } else {
          _xifexpression_1 = this.toAST(e.getL());
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

  protected BAST _toAST(final UniversalQuantification e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "all";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_all, "all");
        it.token = _commonToken;
        it.addChild(this.toAST(e.getVariables()));
        boolean _isIn = e.isIn();
        if (_isIn) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it_1) -> {
            it_1.myText = "in";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_in, "in");
            it_1.token = _commonToken_1;
            it_1.addChild(this.toAST(e.getRange()));
          };
          BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
          it.addChild(_doubleArrow);
        } else {
          boolean _isWhich = e.isWhich();
          if (_isWhich) {
            BAST _newBAST_2 = this.newBAST(e);
            final Procedure1<BAST> _function_2 = (BAST it_1) -> {
              it_1.myText = "which";
              CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_which, "which");
              it_1.token = _commonToken_1;
              Predicate _condition = e.getCondition();
              it_1.addChild(this.toAST(((Expression) _condition)));
            };
            BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
            it.addChild(_doubleArrow_1);
          }
        }
        BAST _newBAST_3 = this.newBAST(e);
        final Procedure1<BAST> _function_3 = (BAST it_1) -> {
          it_1.myText = "are";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_are, "are");
          it_1.token = _commonToken_1;
          Predicate _predicate = e.getPredicate();
          it_1.addChild(this.toAST(((Expression) _predicate)));
        };
        BAST _doubleArrow_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
        it.addChild(_doubleArrow_2);
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final NamedAssertion e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      boolean _isPred = e.isPred();
      if (_isPred) {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          String _name = e.getName();
          String _plus = ("ASSERTION[" + _name);
          String _plus_1 = (_plus + "]");
          it.myText = _plus_1;
          String _name_1 = e.getName();
          String _plus_2 = ("ASSERTION[" + _name_1);
          String _plus_3 = (_plus_2 + "]");
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.ASSERTION, _plus_3);
          it.token = _commonToken;
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it_1) -> {
            it_1.myText = "LABEL";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LABEL, "LABEL");
            it_1.token = _commonToken_1;
            it_1.addChild(this.makeBASTforID(e.getName(), e));
          };
          BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
          it.addChild(_doubleArrow);
          VariableList _formals = e.getFormals();
          boolean _tripleNotEquals = (_formals != null);
          if (_tripleNotEquals) {
            BAST _newBAST_2 = this.newBAST(e);
            final Procedure1<BAST> _function_2 = (BAST it_1) -> {
              it_1.myText = "PARAMETERS";
              CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.PARAMETERS, "PARAMETERS");
              it_1.token = _commonToken_1;
              it_1.addChild(this.toAST(e.getFormals()));
            };
            BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
            it.addChild(_doubleArrow_1);
          }
          Predicate _predicate = e.getPredicate();
          it.addChild(this.toAST(((Expression) _predicate)));
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
      } else {
        BAST _xifexpression_1 = null;
        boolean _isFunc = e.isFunc();
        if (_isFunc) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it) -> {
            String _name = e.getName();
            String _plus = ("ASSERTION_FUNCTION[" + _name);
            String _plus_1 = (_plus + "]");
            it.myText = _plus_1;
            String _name_1 = e.getName();
            String _plus_2 = ("ASSERTION_FUNCTION[" + _name_1);
            String _plus_3 = (_plus_2 + "]");
            CommonToken _commonToken = new CommonToken(BLESS3Lexer.ASSERTION_FUNCTION, _plus_3);
            it.token = _commonToken;
            BAST _newBAST_2 = this.newBAST(e);
            final Procedure1<BAST> _function_2 = (BAST it_1) -> {
              it_1.myText = "LABEL";
              CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LABEL, "LABEL");
              it_1.token = _commonToken_1;
              it_1.addChild(this.makeBASTforID(e.getName(), e));
            };
            BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
            it.addChild(_doubleArrow);
            VariableList _formals = e.getFormals();
            boolean _tripleNotEquals = (_formals != null);
            if (_tripleNotEquals) {
              BAST _newBAST_3 = this.newBAST(e);
              final Procedure1<BAST> _function_3 = (BAST it_1) -> {
                it_1.myText = "PARAMETERS";
                CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.PARAMETERS, "PARAMETERS");
                it_1.token = _commonToken_1;
                it_1.addChild(this.toAST(e.getFormals()));
              };
              BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
              it.addChild(_doubleArrow_1);
            }
            it.addChild(this.toAST(e.getFunctionvalue()));
          };
          _xifexpression_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        } else {
          BAST _xifexpression_2 = null;
          boolean _isEnumer = e.isEnumer();
          if (_isEnumer) {
            BAST _newBAST_2 = this.newBAST(e);
            final Procedure1<BAST> _function_2 = (BAST it) -> {
              String _name = e.getName();
              String _plus = ("ASSERTION_ENUMERATION[" + _name);
              String _plus_1 = (_plus + "]");
              it.myText = _plus_1;
              String _name_1 = e.getName();
              String _plus_2 = ("ASSERTION_ENUMERATION[" + _name_1);
              String _plus_3 = (_plus_2 + "]");
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.ASSERTION_ENUMERATION, _plus_3);
              it.token = _commonToken;
              BAST _newBAST_3 = this.newBAST(e);
              final Procedure1<BAST> _function_3 = (BAST it_1) -> {
                it_1.myText = "LABEL";
                CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LABEL, "LABEL");
                it_1.token = _commonToken_1;
                it_1.addChild(this.makeBASTforID(e.getName(), e));
              };
              BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
              it.addChild(_doubleArrow);
              BAST _newBAST_4 = this.newBAST(e);
              final Procedure1<BAST> _function_4 = (BAST it_1) -> {
                it_1.myText = "~";
                CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.TILDE, "~");
                it_1.token = _commonToken_1;
                it_1.addChild(this.makeBASTforID(e.getAssertionvariable(), e));
                it_1.addChild(this.makeBASTforID(e.getEnumerationType().getName(), e));
              };
              BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_4, _function_4);
              it.addChild(_doubleArrow_1);
              it.addChild(this.toAST(e.getEnumeration()));
            };
            _xifexpression_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
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

  protected BAST _toAST(final ActionSubclause e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "ACTION_SUBCLAUSE";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.ACTION_SUBCLAUSE, "ACTION_SUBCLAUSE");
        it.token = _commonToken;
        boolean _isNo_proof = e.isNo_proof();
        if (_isNo_proof) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it_1) -> {
            it_1.myText = "DO_NOT_PROVE";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.DO_NOT_PROVE, "DO_NOT_PROVE");
            it_1.token = _commonToken_1;
          };
          BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
          it.addChild(_doubleArrow);
        }
        ThrowsClause _throws_clause = e.getThrows_clause();
        boolean _tripleNotEquals = (_throws_clause != null);
        if (_tripleNotEquals) {
          it.addChild(this.toAST(e.getThrows_clause()));
        }
        AssertClause _assert_clause = e.getAssert_clause();
        boolean _tripleNotEquals_1 = (_assert_clause != null);
        if (_tripleNotEquals_1) {
          it.addChild(this.toAST(e.getAssert_clause()));
        }
        BAST _newBAST_2 = this.newBAST(e);
        final Procedure1<BAST> _function_2 = (BAST it_1) -> {
          it_1.myText = "pre";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_pre, "pre");
          it_1.token = _commonToken_1;
          Assertion _precondition = e.getPrecondition();
          boolean _tripleNotEquals_2 = (_precondition != null);
          if (_tripleNotEquals_2) {
            it_1.addChild(this.toAST(e.getPrecondition()));
          }
        };
        BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
        it.addChild(_doubleArrow_1);
        BAST _newBAST_3 = this.newBAST(e);
        final Procedure1<BAST> _function_3 = (BAST it_1) -> {
          it_1.myText = "post";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_post, "post");
          it_1.token = _commonToken_1;
          Assertion _postcondition = e.getPostcondition();
          boolean _tripleNotEquals_2 = (_postcondition != null);
          if (_tripleNotEquals_2) {
            it_1.addChild(this.toAST(e.getPostcondition()));
          }
        };
        BAST _doubleArrow_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
        it.addChild(_doubleArrow_2);
        BAST _newBAST_4 = this.newBAST(e);
        final Procedure1<BAST> _function_4 = (BAST it_1) -> {
          it_1.myText = "post";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_invariant, "invariant");
          it_1.token = _commonToken_1;
          Assertion _invariant = e.getInvariant();
          boolean _tripleNotEquals_2 = (_invariant != null);
          if (_tripleNotEquals_2) {
            it_1.addChild(this.toAST(e.getInvariant()));
          }
        };
        BAST _doubleArrow_3 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_4, _function_4);
        it.addChild(_doubleArrow_3);
        it.addChild(this.toAST(e.getElq()));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final Action e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _elvis = null;
      BAST _elvis_1 = null;
      BAST _elvis_2 = null;
      BAST _elvis_3 = null;
      BAST _elvis_4 = null;
      BAST _elvis_5 = null;
      BasicAction _basic = e.getBasic();
      BAST _aST = null;
      if (_basic!=null) {
        _aST=this.toAST(_basic);
      }
      if (_aST != null) {
        _elvis_5 = _aST;
      } else {
        Alternative _if_fi = e.getIf_fi();
        BAST _aST_1 = null;
        if (_if_fi!=null) {
          _aST_1=this.toAST(_if_fi);
        }
        _elvis_5 = _aST_1;
      }
      if (_elvis_5 != null) {
        _elvis_4 = _elvis_5;
      } else {
        WhileLoop _wl = e.getWl();
        BAST _aST_2 = null;
        if (_wl!=null) {
          _aST_2=this.toAST(_wl);
        }
        _elvis_4 = _aST_2;
      }
      if (_elvis_4 != null) {
        _elvis_3 = _elvis_4;
      } else {
        ForLoop _fl = e.getFl();
        BAST _aST_3 = null;
        if (_fl!=null) {
          _aST_3=this.toAST(_fl);
        }
        _elvis_3 = _aST_3;
      }
      if (_elvis_3 != null) {
        _elvis_2 = _elvis_3;
      } else {
        DoUntilLoop _du = e.getDu();
        BAST _aST_4 = null;
        if (_du!=null) {
          _aST_4=this.toAST(_du);
        }
        _elvis_2 = _aST_4;
      }
      if (_elvis_2 != null) {
        _elvis_1 = _elvis_2;
      } else {
        ExistentialLatticeQuantification _elq = e.getElq();
        BAST _aST_5 = null;
        if (_elq!=null) {
          _aST_5=this.toAST(_elq);
        }
        _elvis_1 = _aST_5;
      }
      if (_elvis_1 != null) {
        _elvis = _elvis_1;
      } else {
        UniversalLatticeQuantification _ulq = e.getUlq();
        BAST _aST_6 = null;
        if (_ulq!=null) {
          _aST_6=this.toAST(_ulq);
        }
        _elvis = _aST_6;
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

  protected BAST _toAST(final ActualParameter e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = ":";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.COLON, ":");
        it.token = _commonToken;
        it.addChild(this.makeBASTforID(e.getFormal(), e));
        it.addChild(this.toAST(e.getActual()));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final Alternative e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xblockexpression = null;
      {
        final BLESSAlternative b = e.getBlessalt();
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = "if";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_if, "if");
          it.token = _commonToken;
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it_1) -> {
            it_1.myText = ")~>";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.GUARD, ")~>");
            it_1.token = _commonToken_1;
            BooleanExpression _guard = e.getGuard();
            it_1.addChild(this.toAST(((Expression) _guard)));
            it_1.addChild(this.toAST(b.getAction()));
          };
          BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
          it.addChild(_doubleArrow);
          EList<GuardedAction> _alternative = b.getAlternative();
          for (final GuardedAction child : _alternative) {
            it.addChild(this.toAST(child));
          }
        };
        _xblockexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final ArrayRangeList e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      boolean _isComma = e.isComma();
      if (_isComma) {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = ",";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.COMMA, ",");
          it.token = _commonToken;
          EList<ArrayRange> _range = e.getRange();
          for (final ArrayRange child : _range) {
            it.addChild(this.toAST(child));
          }
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
      } else {
        _xifexpression = this.toAST(IterableExtensions.<ArrayRange>head(e.getRange()));
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

  protected BAST _toAST(final ArrayRange e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      ANumber _ub = e.getUb();
      boolean _tripleEquals = (_ub == null);
      if (_tripleEquals) {
        _xifexpression = this.toAST(e.getLb());
      } else {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = "..";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.DOTDOT, "..");
          it.token = _commonToken;
          it.addChild(this.makeBASTforANumber(e.getLb(), e));
          it.addChild(this.makeBASTforANumber(e.getUb(), e));
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final ArrayType e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "array";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_array, "array");
        it.token = _commonToken;
        it.addChild(this.toAST(e.getArray_ranges()));
        BAST _newBAST_1 = this.newBAST(e);
        final Procedure1<BAST> _function_1 = (BAST it_1) -> {
          it_1.myText = "of";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_of, "of");
          it_1.token = _commonToken_1;
        };
        BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        it.addChild(_doubleArrow);
        it.addChild(this.toAST(e.getTyp()));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final AssertClause e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "assert";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_assert, "assert");
        it.token = _commonToken;
        EList<NamedAssertion> _assertions = e.getAssertions();
        for (final NamedAssertion child : _assertions) {
          {
            final BAST namedAssertion = this.toAST(child);
            this.putAssertionIntoMap(child.getName(), namedAssertion);
            it.addChild(namedAssertion);
          }
        }
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final AssertedAction e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "ACTION";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.ACTION, "ACTION");
        it.token = _commonToken;
        BAST _newBAST_1 = this.newBAST(e);
        final Procedure1<BAST> _function_1 = (BAST it_1) -> {
          it_1.myText = "P";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.P, "P");
          it_1.token = _commonToken_1;
          Assertion _precondition = e.getPrecondition();
          BAST _aST = null;
          if (_precondition!=null) {
            _aST=this.toAST(_precondition);
          }
          it_1.addChild(_aST);
        };
        BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        it.addChild(_doubleArrow);
        BAST _newBAST_2 = this.newBAST(e);
        final Procedure1<BAST> _function_2 = (BAST it_1) -> {
          it_1.myText = "S";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.S, "S");
          it_1.token = _commonToken_1;
          it_1.addChild(this.toAST(e.getAction()));
        };
        BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
        it.addChild(_doubleArrow_1);
        BAST _newBAST_3 = this.newBAST(e);
        final Procedure1<BAST> _function_3 = (BAST it_1) -> {
          it_1.myText = "Q";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.Q, "Q");
          it_1.token = _commonToken_1;
          Assertion _postcondition = e.getPostcondition();
          BAST _aST = null;
          if (_postcondition!=null) {
            _aST=this.toAST(_postcondition);
          }
          it_1.addChild(_aST);
        };
        BAST _doubleArrow_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
        it.addChild(_doubleArrow_2);
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final Assignment e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = ":=";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.ASSIGN, ":=");
        it.token = _commonToken;
        it.addChild(this.toAST(e.getLhs()));
        it.addChild(this.toAST(e.getRhs()));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final BAAlternative e) {
    BAST _newBAST = this.newBAST(e);
    final Procedure1<BAST> _function = (BAST it) -> {
      it.myText = "skip";
      CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_skip, "skip");
      it.token = _commonToken;
    };
    return ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
  }

  protected BAST _toAST(final BasicAction e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _elvis = null;
      BAST _elvis_1 = null;
      BAST _elvis_2 = null;
      BAST _elvis_3 = null;
      BAST _elvis_4 = null;
      BAST _elvis_5 = null;
      BAST _elvis_6 = null;
      Assignment _assign = e.getAssign();
      BAST _aST = null;
      if (_assign!=null) {
        _aST=this.toAST(_assign);
      }
      if (_aST != null) {
        _elvis_6 = _aST;
      } else {
        WhenThrow _when = e.getWhen();
        BAST _aST_1 = null;
        if (_when!=null) {
          _aST_1=this.toAST(_when);
        }
        _elvis_6 = _aST_1;
      }
      if (_elvis_6 != null) {
        _elvis_5 = _elvis_6;
      } else {
        CombinableOperation _comb = e.getComb();
        BAST _aST_2 = null;
        if (_comb!=null) {
          _aST_2=this.toAST(_comb);
        }
        _elvis_5 = _aST_2;
      }
      if (_elvis_5 != null) {
        _elvis_4 = _elvis_5;
      } else {
        CommunicationAction _communication = e.getCommunication();
        BAST _aST_3 = null;
        if (_communication!=null) {
          _aST_3=this.toAST(_communication);
        }
        _elvis_4 = _aST_3;
      }
      if (_elvis_4 != null) {
        _elvis_3 = _elvis_4;
      } else {
        Computation _computation = e.getComputation();
        BAST _aST_4 = null;
        if (_computation!=null) {
          _aST_4=this.toAST(_computation);
        }
        _elvis_3 = _aST_4;
      }
      if (_elvis_3 != null) {
        _elvis_2 = _elvis_3;
      } else {
        SimultaneousAssignment _multi_assign = e.getMulti_assign();
        BAST _aST_5 = null;
        if (_multi_assign!=null) {
          _aST_5=this.toAST(_multi_assign);
        }
        _elvis_2 = _aST_5;
      }
      if (_elvis_2 != null) {
        _elvis_1 = _elvis_2;
      } else {
        IssueException _exc = e.getExc();
        BAST _aST_6 = null;
        if (_exc!=null) {
          _aST_6=this.toAST(_exc);
        }
        _elvis_1 = _aST_6;
      }
      if (_elvis_1 != null) {
        _elvis = _elvis_1;
      } else {
        BAST _xifexpression = null;
        String _skip = e.getSkip();
        boolean _tripleNotEquals = (_skip != null);
        if (_tripleNotEquals) {
          BAST _newBAST = this.newBAST(e);
          final Procedure1<BAST> _function = (BAST it) -> {
            it.myText = "skip";
            CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_skip, "skip");
            it.token = _commonToken;
          };
          _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
        } else {
          BAST _xifexpression_1 = null;
          Mode _mode = e.getMode();
          boolean _tripleNotEquals_1 = (_mode != null);
          if (_tripleNotEquals_1) {
            BAST _newBAST_1 = this.newBAST(e);
            final Procedure1<BAST> _function_1 = (BAST it) -> {
              it.myText = "setmode";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_setmode, "setmode");
              it.token = _commonToken;
              it.addChild(this.makeBASTforID(e.getMode().getName(), e));
            };
            _xifexpression_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
          }
          _xifexpression = _xifexpression_1;
        }
        _elvis = _xifexpression;
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

  protected BAST _toAST(final BehaviorActions e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      boolean _isSemi = e.isSemi();
      if (_isSemi) {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = ";";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.SEMICOLON, ";");
          it.token = _commonToken;
          EList<AssertedAction> _action = e.getAction();
          for (final AssertedAction child : _action) {
            it.addChild(this.toAST(child));
          }
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
      } else {
        BAST _xifexpression_1 = null;
        boolean _isAmp = e.isAmp();
        if (_isAmp) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it) -> {
            it.myText = "&";
            CommonToken _commonToken = new CommonToken(BLESS3Lexer.AMPERSAND, "&");
            it.token = _commonToken;
            EList<AssertedAction> _action = e.getAction();
            for (final AssertedAction child : _action) {
              it.addChild(this.toAST(child));
            }
          };
          _xifexpression_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        } else {
          _xifexpression_1 = this.toAST(IterableExtensions.<AssertedAction>head(e.getAction()));
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

  protected BAST _toAST(final BehaviorTime e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _elvis = null;
      BAST _elvis_1 = null;
      Quantity _quantity = e.getQuantity();
      BAST _aST = null;
      if (_quantity!=null) {
        _aST=this.toAST(_quantity);
      }
      if (_aST != null) {
        _elvis_1 = _aST;
      } else {
        ValueName _value = e.getValue();
        BAST _aST_1 = null;
        if (_value!=null) {
          _aST_1=this.toAST(_value);
        }
        _elvis_1 = _aST_1;
      }
      if (_elvis_1 != null) {
        _elvis = _elvis_1;
      } else {
        ParenthesizedSubexpression _duration = e.getDuration();
        BAST _aST_2 = null;
        if (_duration!=null) {
          _aST_2=this.toAST(_duration);
        }
        _elvis = _aST_2;
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

  protected BAST _toAST(final CaseChoice e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "->";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.IMP, "->");
        it.token = _commonToken;
        BooleanExpression _be = e.getBe();
        it.addChild(this.toAST(((Expression) _be)));
        it.addChild(this.toAST(e.getExp()));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final CaseExpression e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "LITERAL_case";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_case, "LITERAL_case");
        it.token = _commonToken;
        EList<CaseChoice> _cc = e.getCc();
        for (final CaseChoice child : _cc) {
          it.addChild(this.toAST(child));
        }
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final CatchClause e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "catch";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_catch, "catch");
        it.token = _commonToken;
        EList<CatchClauseTerm> _catches = e.getCatches();
        for (final CatchClauseTerm child : _catches) {
          it.addChild(this.toAST(child));
        }
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final CatchClauseTerm e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "(";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LPAREN, "(");
        it.token = _commonToken;
        boolean _isAll = e.isAll();
        if (_isAll) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it_1) -> {
            it_1.myText = "all";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_all, "all");
            it_1.token = _commonToken_1;
          };
          BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
          it.addChild(_doubleArrow);
        } else {
          EList<com.multitude.aadl.bless.bLESS.Exception> _exceptions = e.getExceptions();
          for (final com.multitude.aadl.bless.bLESS.Exception child : _exceptions) {
            it.addChild(this.makeBASTforID(child.getName(), e));
          }
        }
        BAST _newBAST_2 = this.newBAST(e);
        final Procedure1<BAST> _function_2 = (BAST it_1) -> {
          it_1.myText = ":";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.COLON, ":");
          it_1.token = _commonToken_1;
        };
        BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
        it.addChild(_doubleArrow_1);
        it.addChild(this.toAST(e.getAction()));
        BAST _newBAST_3 = this.newBAST(e);
        final Procedure1<BAST> _function_3 = (BAST it_1) -> {
          it_1.myText = ")";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.RPAREN, ")");
          it_1.token = _commonToken_1;
        };
        BAST _doubleArrow_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
        it.addChild(_doubleArrow_2);
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final CombinableOperation e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      boolean _isF_add = e.isF_add();
      if (_isF_add) {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = "fetchadd";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_fetchadd, "fetchadd");
          it.token = _commonToken;
          it.addChild(this.makeBASTforID(e.getTarget().getName(), e));
          it.addChild(this.toAST(e.getArithmetic()));
          it.addChild(this.makeBASTforID(e.getResult().getName(), e));
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
      } else {
        BAST _xifexpression_1 = null;
        boolean _isF_or = e.isF_or();
        if (_isF_or) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it) -> {
            it.myText = "fetchor";
            CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_fetchor, "fetchor");
            it.token = _commonToken;
            it.addChild(this.makeBASTforID(e.getTarget().getName(), e));
            it.addChild(this.toAST(e.getBool()));
            it.addChild(this.makeBASTforID(e.getResult().getName(), e));
          };
          _xifexpression_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        } else {
          BAST _xifexpression_2 = null;
          boolean _isF_xor = e.isF_xor();
          if (_isF_xor) {
            BAST _newBAST_2 = this.newBAST(e);
            final Procedure1<BAST> _function_2 = (BAST it) -> {
              it.myText = "fetchxor";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_fetchxor, "fetchxor");
              it.token = _commonToken;
              it.addChild(this.makeBASTforID(e.getTarget().getName(), e));
              it.addChild(this.toAST(e.getBool()));
              it.addChild(this.makeBASTforID(e.getResult().getName(), e));
            };
            _xifexpression_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
          } else {
            BAST _xifexpression_3 = null;
            boolean _isF_and = e.isF_and();
            if (_isF_and) {
              BAST _newBAST_3 = this.newBAST(e);
              final Procedure1<BAST> _function_3 = (BAST it) -> {
                it.myText = "fetchand";
                CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_fetchand, "fetchand");
                it.token = _commonToken;
                it.addChild(this.makeBASTforID(e.getTarget().getName(), e));
                it.addChild(this.toAST(e.getBool()));
                it.addChild(this.makeBASTforID(e.getResult().getName(), e));
              };
              _xifexpression_3 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
            } else {
              BAST _xifexpression_4 = null;
              boolean _isSw = e.isSw();
              if (_isSw) {
                BAST _newBAST_4 = this.newBAST(e);
                final Procedure1<BAST> _function_4 = (BAST it) -> {
                  it.myText = "swap";
                  CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_swap, "swap");
                  it.token = _commonToken;
                  it.addChild(this.makeBASTforID(e.getTarget().getName(), e));
                  it.addChild(this.makeBASTforID(e.getReference().getName(), e));
                  it.addChild(this.makeBASTforID(e.getResult().getName(), e));
                };
                _xifexpression_4 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_4, _function_4);
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

  protected BAST _toAST(final CommunicationAction e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _elvis = null;
      BAST _elvis_1 = null;
      SubprogramCall _pc = e.getPc();
      BAST _aST = null;
      if (_pc!=null) {
        _aST=this.toAST(_pc);
      }
      if (_aST != null) {
        _elvis_1 = _aST;
      } else {
        PortOutput _po = e.getPo();
        BAST _aST_1 = null;
        if (_po!=null) {
          _aST_1=this.toAST(_po);
        }
        _elvis_1 = _aST_1;
      }
      if (_elvis_1 != null) {
        _elvis = _elvis_1;
      } else {
        PortInput _pi = e.getPi();
        BAST _aST_2 = null;
        if (_pi!=null) {
          _aST_2=this.toAST(_pi);
        }
        _elvis = _aST_2;
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

  protected BAST _toAST(final Computation e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "computation";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_computation, "computation");
        it.token = _commonToken;
        it.addChild(this.toAST(e.getLb()));
        BehaviorTime _ub = e.getUb();
        BAST _aST = null;
        if (_ub!=null) {
          _aST=this.toAST(_ub);
        }
        it.addChild(_aST);
        EList<ComponentClassifier> _component = e.getComponent();
        boolean _tripleNotEquals = (_component != null);
        if (_tripleNotEquals) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it_1) -> {
            it_1.myText = "binding";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_binding, "binding");
            it_1.token = _commonToken_1;
            EList<ComponentClassifier> _component_1 = e.getComponent();
            for (final ComponentClassifier c : _component_1) {
              it_1.addChild(this.makeBASTforPropertyName(c.qualifiedName(), e));
            }
          };
          BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
          it.addChild(_doubleArrow);
        }
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final DoUntilLoop e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "do";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_do, "do");
        it.token = _commonToken;
        BAST _newBAST_1 = this.newBAST(e);
        final Procedure1<BAST> _function_1 = (BAST it_1) -> {
          it_1.myText = "until";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_until, "until");
          it_1.token = _commonToken_1;
          BooleanExpression _guard = e.getGuard();
          it_1.addChild(this.toAST(((Expression) _guard)));
        };
        BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        it.addChild(_doubleArrow);
        BAST _newBAST_2 = this.newBAST(e);
        final Procedure1<BAST> _function_2 = (BAST it_1) -> {
          it_1.myText = "invariant";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_invariant, "invariant");
          it_1.token = _commonToken_1;
          boolean _isInvariant = e.isInvariant();
          if (_isInvariant) {
            it_1.addChild(this.toAST(e.getInv()));
          }
        };
        BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
        it.addChild(_doubleArrow_1);
        BAST _newBAST_3 = this.newBAST(e);
        final Procedure1<BAST> _function_3 = (BAST it_1) -> {
          it_1.myText = "bound";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_bound, "bound");
          it_1.token = _commonToken_1;
          boolean _isBound = e.isBound();
          if (_isBound) {
            it_1.addChild(this.toAST(e.getBnd()));
          }
        };
        BAST _doubleArrow_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
        it.addChild(_doubleArrow_2);
        it.addChild(this.toAST(e.getActions()));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final EnumerationType e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "enumeration";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_enumeration, "enumeration");
        it.token = _commonToken;
        EList<String> _defining_enumeration_literal = e.getDefining_enumeration_literal();
        for (final String child : _defining_enumeration_literal) {
          it.addChild(this.makeBASTforID(child, e));
        }
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final ExistentialLatticeQuantification e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "{";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LCURLY, "{");
        it.token = _commonToken;
        QuantifiedVariables _quantified_variables = e.getQuantified_variables();
        boolean _tripleNotEquals = (_quantified_variables != null);
        if (_tripleNotEquals) {
          it.addChild(this.toAST(e.getQuantified_variables()));
        }
        it.addChild(this.toAST(e.getActions()));
        BAST _newBAST_1 = this.newBAST(e);
        final Procedure1<BAST> _function_1 = (BAST it_1) -> {
          it_1.myText = "}";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.RCURLY, "}");
          it_1.token = _commonToken_1;
        };
        BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        it.addChild(_doubleArrow);
        CatchClause _catch_clause = e.getCatch_clause();
        boolean _tripleNotEquals_1 = (_catch_clause != null);
        if (_tripleNotEquals_1) {
          it.addChild(this.toAST(e.getCatch_clause()));
        }
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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
        String _any = e.getAny();
        BAST _makeBASTforID = null;
        if (_any!=null) {
          _makeBASTforID=this.makeBASTforID(_any, e);
        }
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
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _elvis = null;
      BAST _elvis_1 = null;
      BAST _elvis_2 = null;
      BAST _elvis_3 = null;
      BAST _elvis_4 = null;
      UniversalQuantification _all = e.getAll();
      BAST _aST = null;
      if (_all!=null) {
        _aST=this.toAST(_all);
      }
      if (_aST != null) {
        _elvis_4 = _aST;
      } else {
        ExistentialQuantification _exists = e.getExists();
        BAST _aST_1 = null;
        if (_exists!=null) {
          _aST_1=this.toAST(_exists);
        }
        _elvis_4 = _aST_1;
      }
      if (_elvis_4 != null) {
        _elvis_3 = _elvis_4;
      } else {
        SumQuantification _sum = e.getSum();
        BAST _aST_2 = null;
        if (_sum!=null) {
          _aST_2=this.toAST(_sum);
        }
        _elvis_3 = _aST_2;
      }
      if (_elvis_3 != null) {
        _elvis_2 = _elvis_3;
      } else {
        ProductQuantification _product = e.getProduct();
        BAST _aST_3 = null;
        if (_product!=null) {
          _aST_3=this.toAST(_product);
        }
        _elvis_2 = _aST_3;
      }
      if (_elvis_2 != null) {
        _elvis_1 = _elvis_2;
      } else {
        CountingQuantification _numberof = e.getNumberof();
        BAST _aST_4 = null;
        if (_numberof!=null) {
          _aST_4=this.toAST(_numberof);
        }
        _elvis_1 = _aST_4;
      }
      if (_elvis_1 != null) {
        _elvis = _elvis_1;
      } else {
        BAST _xifexpression = null;
        String _sym = e.getSym();
        boolean _tripleEquals = (_sym == null);
        if (_tripleEquals) {
          Disjunction _l = e.getL();
          BAST _aST_5 = null;
          if (_l!=null) {
            _aST_5=this.toAST(_l);
          }
          _xifexpression = _aST_5;
        } else {
          BAST _xifexpression_1 = null;
          boolean _equals = e.getSym().equals("iff");
          if (_equals) {
            BAST _newBAST = this.newBAST(e);
            final Procedure1<BAST> _function = (BAST it) -> {
              it.myText = "iff";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_iff, "iff");
              it.token = _commonToken;
              it.addChild(this.toAST(e.getL()));
              it.addChild(this.toAST(e.getR()));
            };
            _xifexpression_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
          } else {
            BAST _xifexpression_2 = null;
            boolean _equals_1 = e.getSym().equals("implies");
            if (_equals_1) {
              BAST _newBAST_1 = this.newBAST(e);
              final Procedure1<BAST> _function_1 = (BAST it) -> {
                it.myText = "implies";
                CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_implies, "implies");
                it.token = _commonToken;
                it.addChild(this.toAST(e.getL()));
                it.addChild(this.toAST(e.getR()));
              };
              _xifexpression_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
            }
            _xifexpression_1 = _xifexpression_2;
          }
          _xifexpression = _xifexpression_1;
        }
        _elvis = _xifexpression;
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

  protected BAST _toAST(final Disjunction e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      String _sym = e.getSym();
      boolean _tripleEquals = (_sym == null);
      if (_tripleEquals) {
        _xifexpression = this.toAST(e.getL());
      } else {
        BAST _xifexpression_1 = null;
        boolean _equals = e.getSym().equals("or");
        if (_equals) {
          BAST _newBAST = this.newBAST(e);
          final Procedure1<BAST> _function = (BAST it) -> {
            it.myText = "or";
            CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_or, "or");
            it.token = _commonToken;
            it.addChild(this.toAST(e.getL()));
            EList<Conjunction> _r = e.getR();
            for (final Conjunction rchild : _r) {
              it.addChild(this.toAST(rchild));
            }
          };
          _xifexpression_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
        } else {
          BAST _xifexpression_2 = null;
          boolean _equals_1 = e.getSym().equals("else");
          if (_equals_1) {
            BAST _newBAST_1 = this.newBAST(e);
            final Procedure1<BAST> _function_1 = (BAST it) -> {
              it.myText = "else";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_else, "else");
              it.token = _commonToken;
              it.addChild(this.toAST(e.getL()));
              EList<Conjunction> _r = e.getR();
              for (final Conjunction rchild : _r) {
                it.addChild(this.toAST(rchild));
              }
            };
            _xifexpression_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
          } else {
            BAST _xifexpression_3 = null;
            boolean _equals_2 = e.getSym().equals("xor");
            if (_equals_2) {
              BAST _newBAST_2 = this.newBAST(e);
              final Procedure1<BAST> _function_2 = (BAST it) -> {
                it.myText = "xor";
                CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_xor, "xor");
                it.token = _commonToken;
                it.addChild(this.toAST(e.getL()));
                EList<Conjunction> _r = e.getR();
                for (final Conjunction rchild : _r) {
                  it.addChild(this.toAST(rchild));
                }
              };
              _xifexpression_3 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
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

  protected BAST _toAST(final Conjunction e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      String _sym = e.getSym();
      boolean _tripleEquals = (_sym == null);
      if (_tripleEquals) {
        _xifexpression = this.toAST(e.getL());
      } else {
        BAST _xifexpression_1 = null;
        boolean _equals = e.getSym().equals("and");
        if (_equals) {
          BAST _newBAST = this.newBAST(e);
          final Procedure1<BAST> _function = (BAST it) -> {
            it.myText = "and";
            CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_and, "and");
            it.token = _commonToken;
            it.addChild(this.toAST(e.getL()));
            EList<Relation> _r = e.getR();
            for (final Relation rchild : _r) {
              it.addChild(this.toAST(rchild));
            }
          };
          _xifexpression_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
        } else {
          BAST _xifexpression_2 = null;
          boolean _equals_1 = e.getSym().equals("then");
          if (_equals_1) {
            BAST _newBAST_1 = this.newBAST(e);
            final Procedure1<BAST> _function_1 = (BAST it) -> {
              it.myText = "then";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_then, "then");
              it.token = _commonToken;
              it.addChild(this.toAST(e.getL()));
              EList<Relation> _r = e.getR();
              for (final Relation rchild : _r) {
                it.addChild(this.toAST(rchild));
              }
            };
            _xifexpression_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
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

  protected BAST _toAST(final AddSub e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      String _sym = e.getSym();
      boolean _tripleEquals = (_sym == null);
      if (_tripleEquals) {
        _xifexpression = this.toAST(e.getL());
      } else {
        BAST _xifexpression_1 = null;
        boolean _equals = e.getSym().equals("+");
        if (_equals) {
          BAST _newBAST = this.newBAST(e);
          final Procedure1<BAST> _function = (BAST it) -> {
            it.myText = "+";
            CommonToken _commonToken = new CommonToken(BLESS3Lexer.PLUS, "+");
            it.token = _commonToken;
            it.addChild(this.toAST(e.getL()));
            EList<MultDiv> _r = e.getR();
            for (final MultDiv rchild : _r) {
              it.addChild(this.toAST(rchild));
            }
          };
          _xifexpression_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
        } else {
          BAST _xifexpression_2 = null;
          boolean _equals_1 = e.getSym().equals("-");
          if (_equals_1) {
            BAST _newBAST_1 = this.newBAST(e);
            final Procedure1<BAST> _function_1 = (BAST it) -> {
              it.myText = "-";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.MINUS, "-");
              it.token = _commonToken;
              it.addChild(this.toAST(e.getL()));
              it.addChild(this.toAST(IterableExtensions.<MultDiv>head(e.getR())));
            };
            _xifexpression_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
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

  protected BAST _toAST(final MultDiv e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      String _sym = e.getSym();
      boolean _tripleEquals = (_sym == null);
      if (_tripleEquals) {
        _xifexpression = this.toAST(e.getL());
      } else {
        BAST _xifexpression_1 = null;
        boolean _equals = e.getSym().equals("/");
        if (_equals) {
          BAST _newBAST = this.newBAST(e);
          final Procedure1<BAST> _function = (BAST it) -> {
            it.myText = "/";
            CommonToken _commonToken = new CommonToken(BLESS3Lexer.DIVIDE, "/");
            it.token = _commonToken;
            it.addChild(this.toAST(e.getL()));
            it.addChild(this.toAST(IterableExtensions.<Exp>head(e.getR())));
          };
          _xifexpression_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
        } else {
          BAST _xifexpression_2 = null;
          boolean _equals_1 = e.getSym().equals("div");
          if (_equals_1) {
            BAST _newBAST_1 = this.newBAST(e);
            final Procedure1<BAST> _function_1 = (BAST it) -> {
              it.myText = "div";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_div, "div");
              it.token = _commonToken;
              it.addChild(this.toAST(e.getL()));
              it.addChild(this.toAST(IterableExtensions.<Exp>head(e.getR())));
            };
            _xifexpression_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
          } else {
            BAST _xifexpression_3 = null;
            boolean _equals_2 = e.getSym().equals("mod");
            if (_equals_2) {
              BAST _newBAST_2 = this.newBAST(e);
              final Procedure1<BAST> _function_2 = (BAST it) -> {
                it.myText = "mod";
                CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_mod, "mod");
                it.token = _commonToken;
                it.addChild(this.toAST(e.getL()));
                it.addChild(this.toAST(IterableExtensions.<Exp>head(e.getR())));
              };
              _xifexpression_3 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
            } else {
              BAST _xifexpression_4 = null;
              boolean _equals_3 = e.getSym().equals("rem");
              if (_equals_3) {
                BAST _newBAST_3 = this.newBAST(e);
                final Procedure1<BAST> _function_3 = (BAST it) -> {
                  it.myText = "rem";
                  CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_rem, "rem");
                  it.token = _commonToken;
                  it.addChild(this.toAST(e.getL()));
                  it.addChild(this.toAST(IterableExtensions.<Exp>head(e.getR())));
                };
                _xifexpression_4 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
              } else {
                BAST _xifexpression_5 = null;
                boolean _equals_4 = e.getSym().equals("*");
                if (_equals_4) {
                  BAST _newBAST_4 = this.newBAST(e);
                  final Procedure1<BAST> _function_4 = (BAST it) -> {
                    it.myText = "*";
                    CommonToken _commonToken = new CommonToken(BLESS3Lexer.TIMES, "*");
                    it.token = _commonToken;
                    it.addChild(this.toAST(e.getL()));
                    EList<Exp> _r = e.getR();
                    for (final Exp rchild : _r) {
                      it.addChild(this.toAST(rchild));
                    }
                  };
                  _xifexpression_5 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_4, _function_4);
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

  protected BAST _toAST(final Exp e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      String _sym = e.getSym();
      boolean _tripleEquals = (_sym == null);
      if (_tripleEquals) {
        _xifexpression = this.toAST(e.getL());
      } else {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = "**";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.EXP, "**");
          it.token = _commonToken;
          it.addChild(this.toAST(e.getL()));
          it.addChild(this.toAST(e.getR()));
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final ForLoop e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "for";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_for, "for");
        it.token = _commonToken;
        it.addChild(this.makeBASTforID(e.getCount().getName(), e));
        BAST _newBAST_1 = this.newBAST(e);
        final Procedure1<BAST> _function_1 = (BAST it_1) -> {
          it_1.myText = "in";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_in, "in");
          it_1.token = _commonToken_1;
          it_1.addChild(this.toAST(e.getLower_bound()));
          it_1.addChild(this.toAST(e.getUpper_bound()));
        };
        BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        it.addChild(_doubleArrow);
        BAST _newBAST_2 = this.newBAST(e);
        final Procedure1<BAST> _function_2 = (BAST it_1) -> {
          it_1.myText = "invariant";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_invariant, "invariant");
          it_1.token = _commonToken_1;
          NamelessAssertion _inv = e.getInv();
          BAST _aST = null;
          if (_inv!=null) {
            _aST=this.toAST(_inv);
          }
          it_1.addChild(_aST);
        };
        BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
        it.addChild(_doubleArrow_1);
        it.addChild(this.toAST(e.getAction()));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final FormalActual e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      Parameter _formal = e.getFormal();
      boolean _tripleEquals = (_formal == null);
      if (_tripleEquals) {
        _xifexpression = this.toAST(e.getActual());
      } else {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = ":";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.COLON, ":");
          it.token = _commonToken;
          it.addChild(this.makeBASTforID(e.getFormal().getName(), e));
          it.addChild(this.toAST(e.getActual()));
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final FormalActualList e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      boolean _isComma = e.isComma();
      if (_isComma) {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = ",";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.COMMA, ",");
          it.token = _commonToken;
          EList<FormalActual> _variables = e.getVariables();
          for (final FormalActual child : _variables) {
            it.addChild(this.toAST(child));
          }
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
      } else {
        _xifexpression = this.toAST(IterableExtensions.<FormalActual>head(e.getVariables()));
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

  protected BAST _toAST(final GhostVariable e) {
    BAST _newBAST = this.newBAST(e);
    final Procedure1<BAST> _function = (BAST it) -> {
      it.myText = "def";
      CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_def, "def");
      it.token = _commonToken;
      it.addChild(this.makeBASTforID(e.getName(), e));
      it.addChild(this.toAST(e.getTod()));
    };
    return ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
  }

  protected BAST _toAST(final GhostVariables e) {
    BAST _newBAST = this.newBAST(e);
    final Procedure1<BAST> _function = (BAST it) -> {
      it.myText = "ghost";
      CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_ghost, "ghost");
      it.token = _commonToken;
      EList<GhostVariable> _gv = e.getGv();
      for (final GhostVariable child : _gv) {
        it.addChild(this.toAST(child));
      }
    };
    return ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
  }

  protected BAST _toAST(final GuardedAction e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = ")~>";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.GUARD, ")~>");
        it.token = _commonToken;
        BooleanExpression _guard = e.getGuard();
        it.addChild(this.toAST(((Expression) _guard)));
        it.addChild(this.toAST(e.getAction()));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final NameTick e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      boolean _isTick = e.isTick();
      if (_isTick) {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = "\'";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.TICK, "\'");
          it.token = _commonToken;
          it.addChild(this.toAST(e.getValue()));
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
      } else {
        _xifexpression = this.toAST(e.getValue());
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

  protected BAST _toAST(final Quantity e) {
    BAST _newBAST = this.newBAST(e);
    final Procedure1<BAST> _function = (BAST it) -> {
      it.myText = "QUANTITY";
      CommonToken _commonToken = new CommonToken(BLESS3Lexer.QUANTITY, "QUANTITY");
      it.token = _commonToken;
      it.addChild(this.makeBASTforANumber(e.getNumber(), e));
      UnitName _unit = e.getUnit();
      boolean _tripleNotEquals = (_unit != null);
      if (_tripleNotEquals) {
        it.addChild(this.makeBASTforID(e.getUnit().getName(), e));
      } else {
        boolean _isScalar = e.isScalar();
        if (_isScalar) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it_1) -> {
            it_1.myText = "scalar";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_scalar, "scalar");
            it_1.token = _commonToken_1;
          };
          BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
          it.addChild(_doubleArrow);
        } else {
          boolean _isWhole = e.isWhole();
          if (_isWhole) {
            BAST _newBAST_2 = this.newBAST(e);
            final Procedure1<BAST> _function_2 = (BAST it_1) -> {
              it_1.myText = "whole";
              CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_whole, "whole");
              it_1.token = _commonToken_1;
            };
            BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
            it.addChild(_doubleArrow_1);
          }
        }
      }
    };
    return ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
  }

  protected BAST _toAST(final QuantityType e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "quantity";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_quantity, "quantity");
        it.token = _commonToken;
        String _whole = e.getWhole();
        boolean _tripleNotEquals = (_whole != null);
        if (_tripleNotEquals) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it_1) -> {
            it_1.myText = "whole";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_whole, "whole");
            it_1.token = _commonToken_1;
            it_1.addChild(this.makeBASTforID(e.getUnit().getName(), e));
          };
          BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
          it.addChild(_doubleArrow);
        } else {
          String _scalar = e.getScalar();
          boolean _tripleNotEquals_1 = (_scalar != null);
          if (_tripleNotEquals_1) {
            BAST _newBAST_2 = this.newBAST(e);
            final Procedure1<BAST> _function_2 = (BAST it_1) -> {
              it_1.myText = "scalar";
              CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_scalar, "scalar");
              it_1.token = _commonToken_1;
              it_1.addChild(this.makeBASTforID(e.getUnit().getName(), e));
            };
            BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
            it.addChild(_doubleArrow_1);
          } else {
            it.addChild(this.makeBASTforID(e.getUnit().getName(), e));
          }
        }
        ANumber _lb = e.getLb();
        boolean _tripleNotEquals_2 = (_lb != null);
        if (_tripleNotEquals_2) {
          BAST _newBAST_3 = this.newBAST(e);
          final Procedure1<BAST> _function_3 = (BAST it_1) -> {
            it_1.myText = "..";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.DOTDOT, "..");
            it_1.token = _commonToken_1;
            it_1.addChild(this.makeBASTforANumber(e.getLb(), e));
            it_1.addChild(this.makeBASTforANumber(e.getUb(), e));
          };
          BAST _doubleArrow_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
          it.addChild(_doubleArrow_2);
        }
        ANumber _step = e.getStep();
        boolean _tripleNotEquals_3 = (_step != null);
        if (_tripleNotEquals_3) {
          BAST _newBAST_4 = this.newBAST(e);
          final Procedure1<BAST> _function_4 = (BAST it_1) -> {
            it_1.myText = "step";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_step, "step");
            it_1.token = _commonToken_1;
            it_1.addChild(this.makeBASTforANumber(e.getStep(), e));
          };
          BAST _doubleArrow_3 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_4, _function_4);
          it.addChild(_doubleArrow_3);
        }
        PropertyConstant _representation = e.getRepresentation();
        boolean _tripleNotEquals_4 = (_representation != null);
        if (_tripleNotEquals_4) {
          BAST _newBAST_5 = this.newBAST(e);
          final Procedure1<BAST> _function_5 = (BAST it_1) -> {
            it_1.myText = "representation";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_representation, "representation");
            it_1.token = _commonToken_1;
            it_1.addChild(this.makeBASTforPropertyName(e.getRepresentation().getName(), e));
          };
          BAST _doubleArrow_4 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_5, _function_5);
          it.addChild(_doubleArrow_4);
        }
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final ParenthesizedSubexpression e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "(";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LPAREN, "(");
        it.token = _commonToken;
        CaseExpression _caseexpression = e.getCaseexpression();
        boolean _tripleNotEquals = (_caseexpression != null);
        if (_tripleNotEquals) {
          it.addChild(this.toAST(e.getCaseexpression()));
        } else {
          Expression _t = e.getT();
          boolean _tripleNotEquals_1 = (_t != null);
          if (_tripleNotEquals_1) {
            BAST _newBAST_1 = this.newBAST(e);
            final Procedure1<BAST> _function_1 = (BAST it_1) -> {
              it_1.myText = "QQ";
              CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.QQ, "QQ");
              it_1.token = _commonToken_1;
              it_1.addChild(this.toAST(e.getExpression()));
              it_1.addChild(this.toAST(e.getT()));
              it_1.addChild(this.toAST(e.getF()));
            };
            BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
            it.addChild(_doubleArrow);
          } else {
            it.addChild(this.toAST(e.getExpression()));
          }
        }
        BAST _newBAST_2 = this.newBAST(e);
        final Procedure1<BAST> _function_2 = (BAST it_1) -> {
          it_1.myText = ")";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.RPAREN, ")");
          it_1.token = _commonToken_1;
        };
        BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
        it.addChild(_doubleArrow_1);
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final PortInput e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        String _name = e.getPort().getName();
        String _plus = ("PORT_INPUT[" + _name);
        String _plus_1 = (_plus + "]");
        it.myText = _plus_1;
        String _name_1 = e.getPort().getName();
        String _plus_2 = ("PORT_INPUT[" + _name_1);
        String _plus_3 = (_plus_2 + "]");
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.PORT_INPUT, _plus_3);
        it.token = _commonToken;
        it.addChild(this.makeBASTforPort(e.getPort().getName(), e));
        it.addChild(this.toAST(e.getTarget()));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final PortOutput e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        String _name = e.getPort().getName();
        String _plus = ("PORT_OUTPUT[" + _name);
        String _plus_1 = (_plus + "]");
        it.myText = _plus_1;
        String _name_1 = e.getPort().getName();
        String _plus_2 = ("PORT_OUTPUT[" + _name_1);
        String _plus_3 = (_plus_2 + "]");
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.PORT_OUTPUT, _plus_3);
        it.token = _commonToken;
        it.addChild(this.makeBASTforPort(e.getPort().getName(), e));
        Expression _eor = e.getEor();
        boolean _tripleNotEquals = (_eor != null);
        if (_tripleNotEquals) {
          it.addChild(this.toAST(e.getEor()));
        }
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final QuantifiedVariables e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "declare";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_declare, "declare");
        it.token = _commonToken;
        EList<VariableDeclaration> _variables = e.getVariables();
        for (final VariableDeclaration child : _variables) {
          it.addChild(this.toAST(child));
        }
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final VariableDeclaration e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        String _name = e.getVariable().getName();
        String _plus = ("VARIABLE_DECLARATION[" + _name);
        String _plus_1 = (_plus + "]");
        it.myText = _plus_1;
        String _name_1 = e.getVariable().getName();
        String _plus_2 = ("VARIABLE_DECLARATION[" + _name_1);
        String _plus_3 = (_plus_2 + "]");
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.VARIABLE_DECLARATION, _plus_3);
        it.token = _commonToken;
        it.addChild(this.toAST(e.getVariable()));
        boolean _isAssign = e.isAssign();
        if (_isAssign) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it_1) -> {
            it_1.myText = ":=";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.ASSIGN, ":=");
            it_1.token = _commonToken_1;
            it_1.addChild(this.toAST(e.getExpression()));
          };
          BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
          it.addChild(_doubleArrow);
        }
        Assertion _assertion = e.getAssertion();
        BAST _aST = null;
        if (_assertion!=null) {
          _aST=this.toAST(_assertion);
        }
        it.addChild(_aST);
        boolean _isConstant = e.isConstant();
        if (_isConstant) {
          BAST _newBAST_2 = this.newBAST(e);
          final Procedure1<BAST> _function_2 = (BAST it_1) -> {
            it_1.myText = "constant";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_constant, "constant");
            it_1.token = _commonToken_1;
          };
          BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
          it.addChild(_doubleArrow_1);
        } else {
          boolean _isNonvolatile = e.isNonvolatile();
          if (_isNonvolatile) {
            BAST _newBAST_3 = this.newBAST(e);
            final Procedure1<BAST> _function_3 = (BAST it_1) -> {
              it_1.myText = "nonvolatile";
              CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_nonvolatile, "nonvolatile");
              it_1.token = _commonToken_1;
            };
            BAST _doubleArrow_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
            it.addChild(_doubleArrow_2);
          } else {
            boolean _isShared = e.isShared();
            if (_isShared) {
              BAST _newBAST_4 = this.newBAST(e);
              final Procedure1<BAST> _function_4 = (BAST it_1) -> {
                it_1.myText = "shared";
                CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_shared, "shared");
                it_1.token = _commonToken_1;
              };
              BAST _doubleArrow_3 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_4, _function_4);
              it.addChild(_doubleArrow_3);
            } else {
              boolean _isSpread = e.isSpread();
              if (_isSpread) {
                BAST _newBAST_5 = this.newBAST(e);
                final Procedure1<BAST> _function_5 = (BAST it_1) -> {
                  it_1.myText = "spread";
                  CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_spread, "spread");
                  it_1.token = _commonToken_1;
                };
                BAST _doubleArrow_4 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_5, _function_5);
                it.addChild(_doubleArrow_4);
              } else {
                boolean _isFinal = e.isFinal();
                if (_isFinal) {
                  BAST _newBAST_6 = this.newBAST(e);
                  final Procedure1<BAST> _function_6 = (BAST it_1) -> {
                    it_1.myText = "final";
                    CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_final, "final");
                    it_1.token = _commonToken_1;
                  };
                  BAST _doubleArrow_5 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_6, _function_6);
                  it.addChild(_doubleArrow_5);
                }
              }
            }
          }
        }
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = ":";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.COLON, ":");
        it.token = _commonToken;
        it.addChild(this.makeBASTforID(e.getLabel(), e));
        it.addChild(this.toAST(e.getTyp()));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final RecordTerm e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        String _name = e.getRecord_type().getName();
        String _plus = ("RECORD_TERM[" + _name);
        String _plus_1 = (_plus + "]");
        it.myText = _plus_1;
        String _name_1 = e.getRecord_type().getName();
        String _plus_2 = ("RECORD_TERM[" + _name_1);
        String _plus_3 = (_plus_2 + "]");
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.RECORD_TERM, _plus_3);
        it.token = _commonToken;
        it.addChild(this.makeBASTforID(e.getRecord_type().getName(), e));
        EList<RecordValue> _record_value = e.getRecord_value();
        for (final RecordValue child : _record_value) {
          it.addChild(this.toAST(child));
        }
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final RecordType e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      boolean _isRecord = e.isRecord();
      if (_isRecord) {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = "record";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_record, "record");
          it.token = _commonToken;
          EList<RecordField> _fields = e.getFields();
          for (final RecordField child : _fields) {
            it.addChild(this.toAST(child));
          }
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
      } else {
        BAST _xifexpression_1 = null;
        boolean _isVariant = e.isVariant();
        if (_isVariant) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it) -> {
            it.myText = "variant";
            CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_variant, "variant");
            it.token = _commonToken;
            EList<RecordField> _fields = e.getFields();
            for (final RecordField child : _fields) {
              it.addChild(this.toAST(child));
            }
          };
          _xifexpression_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
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

  protected BAST _toAST(final RecordValue e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "=>";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.ARROW, "=>");
        it.token = _commonToken;
        it.addChild(this.makeBASTforID(e.getLabel(), e));
        it.addChild(this.toAST(e.getAval()));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final SimultaneousAssignment e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = ":=";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.ASSIGN, ":=");
        it.token = _commonToken;
        BAST _newBAST_1 = this.newBAST(e);
        final Procedure1<BAST> _function_1 = (BAST it_1) -> {
          it_1.myText = ",";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.COMMA, ",");
          it_1.token = _commonToken_1;
          EList<NameTick> _lhs = e.getLhs();
          for (final NameTick left : _lhs) {
            it_1.addChild(this.toAST(left));
          }
        };
        BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        it.addChild(_doubleArrow);
        BAST _newBAST_2 = this.newBAST(e);
        final Procedure1<BAST> _function_2 = (BAST it_1) -> {
          it_1.myText = ",";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.COMMA, ",");
          it_1.token = _commonToken_1;
          EList<ExpressionOrAny> _rhs = e.getRhs();
          for (final ExpressionOrAny right : _rhs) {
            it_1.addChild(this.toAST(right));
          }
        };
        BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
        it.addChild(_doubleArrow_1);
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final Subexpression e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      UnaryOperator _unary = e.getUnary();
      boolean _tripleNotEquals = (_unary != null);
      if (_tripleNotEquals) {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          String _unary_minus = e.getUnary().getUnary_minus();
          boolean _tripleNotEquals_1 = (_unary_minus != null);
          if (_tripleNotEquals_1) {
            it.myText = "-";
            CommonToken _commonToken = new CommonToken(BLESS3Lexer.UNARY_MINUS, "-");
            it.token = _commonToken;
          } else {
            String _not = e.getUnary().getNot();
            boolean _tripleNotEquals_2 = (_not != null);
            if (_tripleNotEquals_2) {
              it.myText = "not";
              CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_not, "not");
              it.token = _commonToken_1;
            } else {
              String _absolute_value = e.getUnary().getAbsolute_value();
              boolean _tripleNotEquals_3 = (_absolute_value != null);
              if (_tripleNotEquals_3) {
                it.myText = "abs";
                CommonToken _commonToken_2 = new CommonToken(BLESS3Lexer.LITERAL_abs, "abs");
                it.token = _commonToken_2;
              } else {
                String _truncate = e.getUnary().getTruncate();
                boolean _tripleNotEquals_4 = (_truncate != null);
                if (_tripleNotEquals_4) {
                  it.myText = "truncate";
                  CommonToken _commonToken_3 = new CommonToken(BLESS3Lexer.DUMMY, "truncate");
                  it.token = _commonToken_3;
                } else {
                  String _round = e.getUnary().getRound();
                  boolean _tripleNotEquals_5 = (_round != null);
                  if (_tripleNotEquals_5) {
                    it.myText = "round";
                    CommonToken _commonToken_4 = new CommonToken(BLESS3Lexer.DUMMY, "round");
                    it.token = _commonToken_4;
                  }
                }
              }
            }
          }
          it.addChild(this.toAST(e.getTimed_expression()));
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
      } else {
        _xifexpression = this.toAST(e.getTimed_expression());
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

  protected BAST _toAST(final TimedExpression e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      String _tick = e.getTick();
      boolean _tripleNotEquals = (_tick != null);
      if (_tripleNotEquals) {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = "\'";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.TICK, "\'");
          it.token = _commonToken;
          it.addChild(this.toAST(e.getSubject()));
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
      } else {
        BAST _xifexpression_1 = null;
        boolean _isAt = e.isAt();
        if (_isAt) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it) -> {
            it.myText = "@";
            CommonToken _commonToken = new CommonToken(BLESS3Lexer.AT_SIGN, "@");
            it.token = _commonToken;
            it.addChild(this.toAST(e.getSubject()));
            it.addChild(this.toAST(e.getTime()));
          };
          _xifexpression_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        } else {
          BAST _xifexpression_2 = null;
          boolean _isCaret = e.isCaret();
          if (_isCaret) {
            BAST _newBAST_2 = this.newBAST(e);
            final Procedure1<BAST> _function_2 = (BAST it) -> {
              it.myText = "^";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.CARET, "^");
              it.token = _commonToken;
              it.addChild(this.toAST(e.getSubject()));
              it.addChild(this.toAST(e.getShift()));
            };
            _xifexpression_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
          } else {
            _xifexpression_2 = this.toAST(e.getSubject());
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
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        CalledSubprogram _procedure = e.getProcedure();
        String _plus = ("SUBPROGRAM_INVOCATION[" + _procedure);
        String _plus_1 = (_plus + "]");
        it.myText = _plus_1;
        CalledSubprogram _procedure_1 = e.getProcedure();
        String _plus_2 = ("SUBPROGRAM_INVOCATION[" + _procedure_1);
        String _plus_3 = (_plus_2 + "]");
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.SUBPROGRAM_INVOCATION, _plus_3);
        it.token = _commonToken;
        CalledSubprogram _procedure_2 = e.getProcedure();
        if ((_procedure_2 instanceof SubprogramAccess)) {
          CalledSubprogram _procedure_3 = e.getProcedure();
          it.addChild(this.makeBASTforID(((SubprogramAccess) _procedure_3).getName(), e));
        } else {
          CalledSubprogram _procedure_4 = e.getProcedure();
          if ((_procedure_4 instanceof SubprogramSubcomponent)) {
            CalledSubprogram _procedure_5 = e.getProcedure();
            it.addChild(this.makeBASTforID(((SubprogramSubcomponent) _procedure_5).getName(), e));
          } else {
            it.addChild(this.makeBASTforID("NOT_ACCESS_NOR_SUBPROGRAM", e));
          }
        }
        FormalActualList _parameters = e.getParameters();
        BAST _aST = null;
        if (_parameters!=null) {
          _aST=this.toAST(_parameters);
        }
        it.addChild(_aST);
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final UniversalLatticeQuantification e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "forall";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_forall, "forall");
        it.token = _commonToken;
        EList<ForallVariable> _variables = e.getVariables();
        for (final ForallVariable v : _variables) {
          it.addChild(this.makeBASTforID(v.getName(), e));
        }
        BAST _newBAST_1 = this.newBAST(e);
        final Procedure1<BAST> _function_1 = (BAST it_1) -> {
          it_1.myText = "in";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_in, "in");
          it_1.token = _commonToken_1;
          it_1.addChild(this.toAST(e.getLower_bound()));
          it_1.addChild(this.toAST(e.getUpper_bound()));
        };
        BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        it.addChild(_doubleArrow);
        it.addChild(this.toAST(e.getElq()));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final Value e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      ValueName _value_name = e.getValue_name();
      boolean _tripleNotEquals = (_value_name != null);
      if (_tripleNotEquals) {
        _xifexpression = this.toAST(e.getValue_name());
      } else {
        BAST _xifexpression_1 = null;
        Constant _constant = e.getConstant();
        boolean _tripleNotEquals_1 = (_constant != null);
        if (_tripleNotEquals_1) {
          _xifexpression_1 = this.toAST(e.getConstant());
        } else {
          BAST _xifexpression_2 = null;
          String _timeout = e.getTimeout();
          boolean _tripleNotEquals_2 = (_timeout != null);
          if (_tripleNotEquals_2) {
            BAST _newBAST = this.newBAST(e);
            final Procedure1<BAST> _function = (BAST it) -> {
              it.myText = "timeout";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_timeout, "timeout");
              it.token = _commonToken;
            };
            _xifexpression_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
          } else {
            BAST _xifexpression_3 = null;
            String _now = e.getNow();
            boolean _tripleNotEquals_3 = (_now != null);
            if (_tripleNotEquals_3) {
              BAST _newBAST_1 = this.newBAST(e);
              final Procedure1<BAST> _function_1 = (BAST it) -> {
                it.myText = "now";
                CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_now, "now");
                it.token = _commonToken;
              };
              _xifexpression_3 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
            } else {
              BAST _xifexpression_4 = null;
              String _tops = e.getTops();
              boolean _tripleNotEquals_4 = (_tops != null);
              if (_tripleNotEquals_4) {
                BAST _newBAST_2 = this.newBAST(e);
                final Procedure1<BAST> _function_2 = (BAST it) -> {
                  it.myText = "tops";
                  CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_tops, "tops");
                  it.token = _commonToken;
                };
                _xifexpression_4 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
              } else {
                BAST _xifexpression_5 = null;
                EnumerationValue _enum_val = e.getEnum_val();
                boolean _tripleNotEquals_5 = (_enum_val != null);
                if (_tripleNotEquals_5) {
                  _xifexpression_5 = this.toAST(e.getEnum_val());
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

  protected BAST _toAST(final EnumerationValue e) {
    BAST _newBAST = this.newBAST(e);
    final Procedure1<BAST> _function = (BAST it) -> {
      it.myText = "\'";
      CommonToken _commonToken = new CommonToken(BLESS3Lexer.TICK, "\'");
      it.token = _commonToken;
      BAST _newBAST_1 = this.newBAST(e);
      final Procedure1<BAST> _function_1 = (BAST it_1) -> {
        it_1.myText = e.getEnumeration_type().getName();
        String _name = e.getEnumeration_type().getName();
        CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.ID, _name);
        it_1.token = _commonToken_1;
      };
      BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
      it.addChild(_doubleArrow);
      BAST _newBAST_2 = this.newBAST(e);
      final Procedure1<BAST> _function_2 = (BAST it_1) -> {
        it_1.myText = e.getEnumeration_value();
        String _enumeration_value = e.getEnumeration_value();
        CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.ID, _enumeration_value);
        it_1.token = _commonToken_1;
      };
      BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
      it.addChild(_doubleArrow_1);
    };
    return ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
  }

  protected BAST _toAST(final Constant e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      String _t = e.getT();
      boolean _tripleNotEquals = (_t != null);
      if (_tripleNotEquals) {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = "true";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_true, "true");
          it.token = _commonToken;
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
      } else {
        BAST _xifexpression_1 = null;
        String _f = e.getF();
        boolean _tripleNotEquals_1 = (_f != null);
        if (_tripleNotEquals_1) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it) -> {
            it.myText = "false";
            CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_false, "false");
            it.token = _commonToken;
          };
          _xifexpression_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        } else {
          BAST _xifexpression_2 = null;
          String _nul = e.getNul();
          boolean _tripleNotEquals_2 = (_nul != null);
          if (_tripleNotEquals_2) {
            BAST _newBAST_2 = this.newBAST(e);
            final Procedure1<BAST> _function_2 = (BAST it) -> {
              it.myText = "null";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_null, "null");
              it.token = _commonToken;
            };
            _xifexpression_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
          } else {
            BAST _xifexpression_3 = null;
            Quantity _numeric_constant = e.getNumeric_constant();
            boolean _tripleNotEquals_3 = (_numeric_constant != null);
            if (_tripleNotEquals_3) {
              _xifexpression_3 = this.toAST(e.getNumeric_constant());
            } else {
              BAST _xifexpression_4 = null;
              String _string_literal = e.getString_literal();
              boolean _tripleNotEquals_4 = (_string_literal != null);
              if (_tripleNotEquals_4) {
                _xifexpression_4 = this.makeBASTforAADL_STRING_LITERAL(e.getString_literal(), e);
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
    } catch (final Throwable _t_1) {
      if (_t_1 instanceof Exception) {
        final Exception ex = (Exception)_t_1;
        BAST _xblockexpression = null;
        {
          ex.printStackTrace();
          _xblockexpression = ToAST.x;
        }
        _xtrycatchfinallyexpression = _xblockexpression;
      } else {
        throw Exceptions.sneakyThrow(_t_1);
      }
    }
    return _xtrycatchfinallyexpression;
  }

  protected BAST _toAST(final PropertyField e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      String _index = e.getIndex();
      boolean _tripleNotEquals = (_index != null);
      if (_tripleNotEquals) {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = "[";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.LBRACKET, "[");
          it.token = _commonToken;
          it.addChild(this.makeBASTforINT(e.getIndex(), e));
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
      } else {
        BAST _xifexpression_1 = null;
        Variable _variable = e.getVariable();
        boolean _tripleNotEquals_1 = (_variable != null);
        if (_tripleNotEquals_1) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it) -> {
            it.myText = "[";
            CommonToken _commonToken = new CommonToken(BLESS3Lexer.LBRACKET, "[");
            it.token = _commonToken;
            it.addChild(this.makeBASTforID(e.getVariable().getName(), e));
          };
          _xifexpression_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        } else {
          BAST _xifexpression_2 = null;
          String _pf = e.getPf();
          boolean _tripleNotEquals_2 = (_pf != null);
          if (_tripleNotEquals_2) {
            BAST _newBAST_2 = this.newBAST(e);
            final Procedure1<BAST> _function_2 = (BAST it) -> {
              it.myText = ".";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.DOT, ".");
              it.token = _commonToken;
              it.addChild(this.makeBASTforID(e.getPf(), e));
            };
            _xifexpression_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
          } else {
            BAST _xifexpression_3 = null;
            String _upper = e.getUpper();
            boolean _tripleNotEquals_3 = (_upper != null);
            if (_tripleNotEquals_3) {
              BAST _newBAST_3 = this.newBAST(e);
              final Procedure1<BAST> _function_3 = (BAST it) -> {
                it.myText = ".";
                CommonToken _commonToken = new CommonToken(BLESS3Lexer.DOT, ".");
                it.token = _commonToken;
                BAST _newBAST_4 = this.newBAST(e);
                final Procedure1<BAST> _function_4 = (BAST it_1) -> {
                  it_1.myText = "upper_bound";
                  CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_upper_bound, "upper_bound");
                  it_1.token = _commonToken_1;
                };
                BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_4, _function_4);
                it.addChild(_doubleArrow);
              };
              _xifexpression_3 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
            } else {
              BAST _xifexpression_4 = null;
              String _lower = e.getLower();
              boolean _tripleNotEquals_4 = (_lower != null);
              if (_tripleNotEquals_4) {
                BAST _newBAST_4 = this.newBAST(e);
                final Procedure1<BAST> _function_4 = (BAST it) -> {
                  it.myText = ".";
                  CommonToken _commonToken = new CommonToken(BLESS3Lexer.DOT, ".");
                  it.token = _commonToken;
                  BAST _newBAST_5 = this.newBAST(e);
                  final Procedure1<BAST> _function_5 = (BAST it_1) -> {
                    it_1.myText = "lower_bound";
                    CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_lower_bound, "lower_bound");
                    it_1.token = _commonToken_1;
                  };
                  BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_5, _function_5);
                  it.addChild(_doubleArrow);
                };
                _xifexpression_4 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_4, _function_4);
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

  protected BAST _toAST(final PropertyReference e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      boolean _isSelf = e.isSelf();
      if (_isSelf) {
        BAST _xblockexpression = null;
        {
          final Property sp = e.getSpname();
          EcoreUtil.resolve(sp, e.eContainer());
          BAST _newBAST = this.newBAST(e);
          final Procedure1<BAST> _function = (BAST it) -> {
            it.myText = "#";
            CommonToken _commonToken = new CommonToken(BLESS3Lexer.OCTOTHORPE, "#");
            it.token = _commonToken;
            BAST _newBAST_1 = this.newBAST(e);
            final Procedure1<BAST> _function_1 = (BAST it_1) -> {
              it_1.myText = "self";
              CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_self, "self");
              it_1.token = _commonToken_1;
            };
            BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
            it.addChild(_doubleArrow);
            it.addChild(this.makeBASTforPropertyName(sp.qualifiedName(), e));
            EList<PropertyField> _field = e.getField();
            for (final PropertyField f : _field) {
              it.addChild(this.toAST(f));
            }
          };
          _xblockexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
        }
        _xifexpression = _xblockexpression;
      } else {
        BAST _xifexpression_1 = null;
        ComponentClassifier _component = e.getComponent();
        boolean _tripleNotEquals = (_component != null);
        if (_tripleNotEquals) {
          BAST _xblockexpression_1 = null;
          {
            final Property cp = e.getCpname();
            EcoreUtil.resolve(cp, e.eContainer());
            BAST _newBAST = this.newBAST(e);
            final Procedure1<BAST> _function = (BAST it) -> {
              it.myText = "#";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.OCTOTHORPE, "#");
              it.token = _commonToken;
              it.addChild(this.makeBASTforPropertyName(e.getComponent().qualifiedName(), e));
              it.addChild(this.makeBASTforPropertyName(cp.qualifiedName(), e));
              EList<PropertyField> _field = e.getField();
              for (final PropertyField f : _field) {
                it.addChild(this.toAST(f));
              }
            };
            _xblockexpression_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
          }
          _xifexpression_1 = _xblockexpression_1;
        } else {
          BAST _xblockexpression_2 = null;
          {
            final Property p = e.getPname();
            EcoreUtil.resolve(p, e.eContainer());
            BAST _newBAST = this.newBAST(e);
            final Procedure1<BAST> _function = (BAST it) -> {
              it.myText = "#";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.OCTOTHORPE, "#");
              it.token = _commonToken;
              it.addChild(this.makeBASTforPropertyName(p.qualifiedName(), e));
              EList<PropertyField> _field = e.getField();
              for (final PropertyField f : _field) {
                it.addChild(this.toAST(f));
              }
            };
            _xblockexpression_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
          }
          _xifexpression_1 = _xblockexpression_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xtrycatchfinallyexpression = _xifexpression;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception ex = (Exception)_t;
        BAST _xblockexpression_3 = null;
        {
          ex.printStackTrace();
          _xblockexpression_3 = ToAST.x;
        }
        _xtrycatchfinallyexpression = _xblockexpression_3;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }

  protected BAST _toAST(final WhenThrow e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "when";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_when, "when");
        it.token = _commonToken;
        BAST _newBAST_1 = this.newBAST(e);
        final Procedure1<BAST> _function_1 = (BAST it_1) -> {
          it_1.myText = "(";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LPAREN, "(");
          it_1.token = _commonToken_1;
        };
        BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        it.addChild(_doubleArrow);
        it.addChild(this.toAST(e.getExp()));
        BAST _newBAST_2 = this.newBAST(e);
        final Procedure1<BAST> _function_2 = (BAST it_1) -> {
          it_1.myText = ")";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.RPAREN, ")");
          it_1.token = _commonToken_1;
        };
        BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
        it.addChild(_doubleArrow_1);
        BAST _newBAST_3 = this.newBAST(e);
        final Procedure1<BAST> _function_3 = (BAST it_1) -> {
          it_1.myText = "throw";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_throw, "throw");
          it_1.token = _commonToken_1;
        };
        BAST _doubleArrow_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
        it.addChild(_doubleArrow_2);
        it.addChild(this.makeBASTforID(e.getException().getName(), e));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final WhileLoop e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "while";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_while, "while");
        it.token = _commonToken;
        BooleanExpression _test = e.getTest();
        it.addChild(this.toAST(((Expression) _test)));
        BAST _newBAST_1 = this.newBAST(e);
        final Procedure1<BAST> _function_1 = (BAST it_1) -> {
          it_1.myText = "invariant";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.INVARIANT, "invariant");
          it_1.token = _commonToken_1;
          boolean _isInvariant = e.isInvariant();
          if (_isInvariant) {
            it_1.addChild(this.toAST(e.getInv()));
          }
        };
        BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        it.addChild(_doubleArrow);
        BAST _newBAST_2 = this.newBAST(e);
        final Procedure1<BAST> _function_2 = (BAST it_1) -> {
          it_1.myText = "bound";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.BOUND, "bound");
          it_1.token = _commonToken_1;
          boolean _isBound = e.isBound();
          if (_isBound) {
            it_1.addChild(this.toAST(e.getBound_function()));
          }
        };
        BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
        it.addChild(_doubleArrow_1);
        it.addChild(this.toAST(e.getElq()));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final BehaviorTransition e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        String _name = e.getName();
        String _plus = ("TRANSITION[" + _name);
        String _plus_1 = (_plus + "]");
        it.myText = _plus_1;
        String _name_1 = e.getName();
        String _plus_2 = ("TRANSITION[" + _name_1);
        String _plus_3 = (_plus_2 + "]");
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.TRANSITION, _plus_3);
        it.token = _commonToken;
        BAST _newBAST_1 = this.newBAST(e);
        final Procedure1<BAST> _function_1 = (BAST it_1) -> {
          String _name_2 = e.getName();
          String _plus_4 = ("LABEL[" + _name_2);
          String _plus_5 = (_plus_4 + "]");
          it_1.myText = _plus_5;
          String _name_3 = e.getName();
          String _plus_6 = ("LABEL[" + _name_3);
          String _plus_7 = (_plus_6 + "]");
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LABEL, _plus_7);
          it_1.token = _commonToken_1;
          it_1.addChild(this.makeBASTforID(e.getName(), e));
        };
        BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        it.addChild(_doubleArrow);
        BAST _newBAST_2 = this.newBAST(e);
        final Procedure1<BAST> _function_2 = (BAST it_1) -> {
          it_1.myText = "SOURCE";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.SOURCE, "SOURCE");
          it_1.token = _commonToken_1;
          EList<BehaviorState> _sources = e.getSources();
          for (final BehaviorState source : _sources) {
            it_1.addChild(this.makeBASTforID(source.getName(), e));
          }
        };
        BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
        it.addChild(_doubleArrow_1);
        BAST _newBAST_3 = this.newBAST(e);
        final Procedure1<BAST> _function_3 = (BAST it_1) -> {
          it_1.myText = "CONDITION";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.CONDITION, "CONDITION");
          it_1.token = _commonToken_1;
          DispatchCondition _dispatch = e.getDispatch();
          boolean _tripleNotEquals = (_dispatch != null);
          if (_tripleNotEquals) {
            it_1.addChild(this.toAST(e.getDispatch()));
          } else {
            ExecuteCondition _execute = e.getExecute();
            boolean _tripleNotEquals_1 = (_execute != null);
            if (_tripleNotEquals_1) {
              it_1.addChild(this.toAST(e.getExecute()));
            } else {
              ModeCondition _mode = e.getMode();
              boolean _tripleNotEquals_2 = (_mode != null);
              if (_tripleNotEquals_2) {
                it_1.addChild(this.toAST(e.getMode()));
              } else {
                InternalCondition _internal = e.getInternal();
                boolean _tripleNotEquals_3 = (_internal != null);
                if (_tripleNotEquals_3) {
                  it_1.addChild(this.toAST(e.getInternal()));
                }
              }
            }
          }
        };
        BAST _doubleArrow_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
        it.addChild(_doubleArrow_2);
        BAST _newBAST_4 = this.newBAST(e);
        final Procedure1<BAST> _function_4 = (BAST it_1) -> {
          it_1.myText = "DESTINATION";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.DESTINATION, "DESTINATION");
          it_1.token = _commonToken_1;
          it_1.addChild(this.makeBASTforID(e.getDestination().getName(), e));
        };
        BAST _doubleArrow_3 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_4, _function_4);
        it.addChild(_doubleArrow_3);
        BAST _newBAST_5 = this.newBAST(e);
        final Procedure1<BAST> _function_5 = (BAST it_1) -> {
          it_1.myText = "ACTION";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.ACTION, "ACTION");
          it_1.token = _commonToken_1;
          BehaviorActions _actions = e.getActions();
          BAST _aST = null;
          if (_actions!=null) {
            _aST=this.toAST(_actions);
          }
          it_1.addChild(_aST);
        };
        BAST _doubleArrow_4 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_5, _function_5);
        it.addChild(_doubleArrow_4);
        BAST _newBAST_6 = this.newBAST(e);
        final Procedure1<BAST> _function_6 = (BAST it_1) -> {
          it_1.myText = "Q";
          CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.Q, "Q");
          it_1.token = _commonToken_1;
          Assertion _ass = e.getAss();
          BAST _aST = null;
          if (_ass!=null) {
            _aST=this.toAST(_ass);
          }
          it_1.addChild(_aST);
        };
        BAST _doubleArrow_5 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_6, _function_6);
        it.addChild(_doubleArrow_5);
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final BehaviorState e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "state";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_state, "state");
        it.token = _commonToken;
        boolean _isInitial = e.isInitial();
        if (_isInitial) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it_1) -> {
            it_1.myText = "initial";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_initial, "initial");
            it_1.token = _commonToken_1;
          };
          BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
          it.addChild(_doubleArrow);
        }
        boolean _isComplete = e.isComplete();
        if (_isComplete) {
          BAST _newBAST_2 = this.newBAST(e);
          final Procedure1<BAST> _function_2 = (BAST it_1) -> {
            it_1.myText = "complete";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_complete, "complete");
            it_1.token = _commonToken_1;
          };
          BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
          it.addChild(_doubleArrow_1);
        }
        boolean _isFinal = e.isFinal();
        if (_isFinal) {
          BAST _newBAST_3 = this.newBAST(e);
          final Procedure1<BAST> _function_3 = (BAST it_1) -> {
            it_1.myText = "final";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_final, "final");
            it_1.token = _commonToken_1;
          };
          BAST _doubleArrow_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
          it.addChild(_doubleArrow_2);
        }
        it.addChild(this.makeBASTforID(e.getName(), e));
        Assertion _state_assertion = e.getState_assertion();
        boolean _tripleNotEquals = (_state_assertion != null);
        if (_tripleNotEquals) {
          it.addChild(this.toAST(e.getState_assertion()));
        }
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final BLESSSubclause e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "BLESS_SUBCLAUSE";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.BLESS_SUBCLAUSE, "BLESS_SUBCLAUSE");
        it.token = _commonToken;
        boolean _isNo_proof = e.isNo_proof();
        if (_isNo_proof) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it_1) -> {
            it_1.myText = "DO_NOT_PROVE";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.DO_NOT_PROVE, "DO_NOT_PROVE");
            it_1.token = _commonToken_1;
          };
          BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
          it.addChild(_doubleArrow);
        }
        AssertClause _assert_clause = e.getAssert_clause();
        boolean _tripleNotEquals = (_assert_clause != null);
        if (_tripleNotEquals) {
          it.addChild(this.toAST(e.getAssert_clause()));
        }
        InvariantClause _invariant = e.getInvariant();
        boolean _tripleNotEquals_1 = (_invariant != null);
        if (_tripleNotEquals_1) {
          it.addChild(this.toAST(e.getInvariant()));
        }
        VariablesSection _variables = e.getVariables();
        boolean _tripleNotEquals_2 = (_variables != null);
        if (_tripleNotEquals_2) {
          it.addChild(this.toAST(e.getVariables()));
        }
        StatesSection _statesSection = e.getStatesSection();
        boolean _tripleNotEquals_3 = (_statesSection != null);
        if (_tripleNotEquals_3) {
          BAST _newBAST_2 = this.newBAST(e);
          final Procedure1<BAST> _function_2 = (BAST it_1) -> {
            it_1.myText = "states";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LITERAL_states, "states");
            it_1.token = _commonToken_1;
            EList<BehaviorState> _states = e.getStatesSection().getStates();
            for (final BehaviorState state : _states) {
              it_1.addChild(this.toAST(state));
            }
          };
          BAST _doubleArrow_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
          it.addChild(_doubleArrow_1);
        }
        Transitions _transitions = e.getTransitions();
        boolean _tripleNotEquals_4 = (_transitions != null);
        if (_tripleNotEquals_4) {
          it.addChild(this.toAST(e.getTransitions()));
        }
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final DispatchCondition e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "dispatch";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_dispatch, "dispatch");
        it.token = _commonToken;
        DispatchExpression _de = e.getDe();
        BAST _aST = null;
        if (_de!=null) {
          _aST=this.toAST(_de);
        }
        it.addChild(_aST);
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final DispatchConjunction e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      boolean _isAnd = e.isAnd();
      if (_isAnd) {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = "and";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_and, "and");
          it.token = _commonToken;
          EList<DispatchTrigger> _trigger = e.getTrigger();
          for (final DispatchTrigger child : _trigger) {
            it.addChild(this.toAST(child));
          }
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
      } else {
        _xifexpression = this.toAST(IterableExtensions.<DispatchTrigger>head(e.getTrigger()));
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

  protected BAST _toAST(final DispatchExpression e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      boolean _isOr = e.isOr();
      if (_isOr) {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = "or";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_or, "or");
          it.token = _commonToken;
          EList<DispatchConjunction> _dc = e.getDc();
          for (final DispatchConjunction child : _dc) {
            it.addChild(this.toAST(child));
          }
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
      } else {
        _xifexpression = this.toAST(IterableExtensions.<DispatchConjunction>head(e.getDc()));
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

  protected BAST _toAST(final DispatchTrigger e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      if (((e.getTimeout() != null) && e.isLp())) {
        BAST _newBAST = this.newBAST(e);
        final Procedure1<BAST> _function = (BAST it) -> {
          it.myText = "timeout";
          CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_timeout, "timeout");
          it.token = _commonToken;
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it_1) -> {
            it_1.myText = "(";
            CommonToken _commonToken_1 = new CommonToken(BLESS3Lexer.LPAREN, "(");
            it_1.token = _commonToken_1;
            EList<NamedElement> _ports = e.getPorts();
            for (final NamedElement p : _ports) {
              it_1.addChild(this.makeBASTforPort(p.getName(), e));
            }
          };
          BAST _doubleArrow = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
          it.addChild(_doubleArrow);
          it.addChild(this.toAST(e.getTime()));
        };
        _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
      } else {
        BAST _xifexpression_1 = null;
        if (((e.getTimeout() != null) && (e.getTime() != null))) {
          BAST _newBAST_1 = this.newBAST(e);
          final Procedure1<BAST> _function_1 = (BAST it) -> {
            it.myText = "timeout";
            CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_timeout, "timeout");
            it.token = _commonToken;
            it.addChild(this.toAST(e.getTime()));
          };
          _xifexpression_1 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
        } else {
          BAST _xifexpression_2 = null;
          String _timeout = e.getTimeout();
          boolean _tripleNotEquals = (_timeout != null);
          if (_tripleNotEquals) {
            BAST _newBAST_2 = this.newBAST(e);
            final Procedure1<BAST> _function_2 = (BAST it) -> {
              it.myText = "timeout";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_timeout, "timeout");
              it.token = _commonToken;
            };
            _xifexpression_2 = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
          } else {
            _xifexpression_2 = this.makeBASTforPort(e.getPort().getPort().getName(), e);
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

  protected BAST _toAST(final ExecuteCondition e) {
    BooleanExpression _eor = e.getEor();
    return this.toAST(((Expression) _eor));
  }

  protected BAST _toAST(final InternalCondition e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "internal";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_internal, "internal");
        it.token = _commonToken;
        it.addChild(this.makeBASTforPort(e.getFirst().getName(), e));
        EList<Port> _ports = e.getPorts();
        for (final Port p : _ports) {
          it.addChild(this.makeBASTforPort(p.getName(), e));
        }
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final InvariantClause e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "invariant";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_invariant, "invariant");
        it.token = _commonToken;
        it.addChild(this.toAST(e.getInv()));
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final IssueException e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "exception";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_exception, "exception");
        it.token = _commonToken;
        it.addChild(this.makeBASTforID(e.getException().getName(), e));
        String _message = e.getMessage();
        boolean _tripleNotEquals = (_message != null);
        if (_tripleNotEquals) {
          it.addChild(this.makeBASTforAADL_STRING_LITERAL(e.getMessage(), e));
        }
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final Transitions e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "transitions";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_transitions, "transitions");
        it.token = _commonToken;
        EList<BehaviorTransition> _bt = e.getBt();
        for (final BehaviorTransition child : _bt) {
          it.addChild(this.toAST(child));
        }
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final TriggerLogicalExpression e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _xifexpression = null;
      LogicalOperator _op = e.getOp();
      boolean _tripleEquals = (_op == null);
      if (_tripleEquals) {
        _xifexpression = this.toAST(e.getFirst());
      } else {
        BAST _switchResult = null;
        LogicalOperator _op_1 = e.getOp();
        boolean _matched = false;
        if (Objects.equal(_op_1, "and")) {
          _matched=true;
          BAST _newBAST = this.newBAST(e);
          final Procedure1<BAST> _function = (BAST it) -> {
            it.myText = "and";
            CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_and, "and");
            it.token = _commonToken;
            it.addChild(this.toAST(e.getFirst()));
            EList<EventTrigger> _trigger = e.getTrigger();
            for (final EventTrigger tr : _trigger) {
              it.addChild(this.toAST(tr));
            }
          };
          _switchResult = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
        }
        if (!_matched) {
          if (Objects.equal(_op_1, "or")) {
            _matched=true;
            BAST _newBAST_1 = this.newBAST(e);
            final Procedure1<BAST> _function_1 = (BAST it) -> {
              it.myText = "or";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_or, "or");
              it.token = _commonToken;
              it.addChild(this.toAST(e.getFirst()));
              EList<EventTrigger> _trigger = e.getTrigger();
              for (final EventTrigger tr : _trigger) {
                it.addChild(this.toAST(tr));
              }
            };
            _switchResult = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_1, _function_1);
          }
        }
        if (!_matched) {
          if (Objects.equal(_op_1, "xor")) {
            _matched=true;
            BAST _newBAST_2 = this.newBAST(e);
            final Procedure1<BAST> _function_2 = (BAST it) -> {
              it.myText = "xor";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_xor, "xor");
              it.token = _commonToken;
              it.addChild(this.toAST(e.getFirst()));
              EList<EventTrigger> _trigger = e.getTrigger();
              for (final EventTrigger tr : _trigger) {
                it.addChild(this.toAST(tr));
              }
            };
            _switchResult = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_2, _function_2);
          }
        }
        if (!_matched) {
          if (Objects.equal(_op_1, "then")) {
            _matched=true;
            BAST _newBAST_3 = this.newBAST(e);
            final Procedure1<BAST> _function_3 = (BAST it) -> {
              it.myText = "then";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_then, "then");
              it.token = _commonToken;
              it.addChild(this.toAST(e.getFirst()));
              EList<EventTrigger> _trigger = e.getTrigger();
              for (final EventTrigger tr : _trigger) {
                it.addChild(this.toAST(tr));
              }
            };
            _switchResult = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_3, _function_3);
          }
        }
        if (!_matched) {
          if (Objects.equal(_op_1, "else")) {
            _matched=true;
            BAST _newBAST_4 = this.newBAST(e);
            final Procedure1<BAST> _function_4 = (BAST it) -> {
              it.myText = "else";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_else, "else");
              it.token = _commonToken;
              it.addChild(this.toAST(e.getFirst()));
              EList<EventTrigger> _trigger = e.getTrigger();
              for (final EventTrigger tr : _trigger) {
                it.addChild(this.toAST(tr));
              }
            };
            _switchResult = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST_4, _function_4);
          }
        }
        _xifexpression = _switchResult;
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

  protected BAST _toAST(final VariablesSection e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "variables";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_variables, "variables");
        it.token = _commonToken;
        EList<VariableDeclaration> _behavior_variables = e.getBehavior_variables();
        for (final VariableDeclaration child : _behavior_variables) {
          it.addChild(this.toAST(child));
        }
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final BooleanType e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "boolean";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_boolean, "boolean");
        it.token = _commonToken;
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final StringType e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "string";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_string, "string");
        it.token = _commonToken;
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final NullType e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _newBAST = this.newBAST(e);
      final Procedure1<BAST> _function = (BAST it) -> {
        it.myText = "null";
        CommonToken _commonToken = new CommonToken(BLESS3Lexer.LITERAL_null, "null");
        it.token = _commonToken;
      };
      _xtrycatchfinallyexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
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

  protected BAST _toAST(final TypeOrReference e) {
    BAST _xtrycatchfinallyexpression = null;
    try {
      BAST _elvis = null;
      Type _ty = e.getTy();
      BAST _aST = null;
      if (_ty!=null) {
        _aST=this.toAST(_ty);
      }
      if (_aST != null) {
        _elvis = _aST;
      } else {
        BAST _xblockexpression = null;
        {
          TypeDeclaration _ref = e.getRef();
          boolean _tripleNotEquals = (_ref != null);
          if (_tripleNotEquals) {
            EcoreUtil.resolve(e.getRef(), e);
          }
          BAST _xifexpression = null;
          TypeDeclaration _ref_1 = e.getRef();
          String _name = null;
          if (_ref_1!=null) {
            _name=_ref_1.getName();
          }
          boolean _tripleNotEquals_1 = (_name != null);
          if (_tripleNotEquals_1) {
            _xifexpression = this.makeBASTforID(e.getRef().getName(), e);
          } else {
            BAST _newBAST = this.newBAST(e);
            final Procedure1<BAST> _function = (BAST it) -> {
              it.myText = "UNRESOLVED_TYPE_REFERENCE";
              CommonToken _commonToken = new CommonToken(BLESS3Lexer.DUMMY, "UNRESOLVED_TYPE_REFERENCE");
              it.token = _commonToken;
            };
            _xifexpression = ObjectExtensions.<BAST>operator_doubleArrow(_newBAST, _function);
          }
          _xblockexpression = _xifexpression;
        }
        _elvis = _xblockexpression;
      }
      _xtrycatchfinallyexpression = _elvis;
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
        if (Objects.equal(e, NullType.class)) {
          _matched=true;
          _switchResult = this.toAST(((NullType) e));
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
    BAST _xtrycatchfinallyexpression = null;
    try {
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
    } else if (e instanceof GhostVariable) {
      return _toAST((GhostVariable)e);
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
    } else if (e instanceof GhostVariables) {
      return _toAST((GhostVariables)e);
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
    } else if (e instanceof NullType) {
      return _toAST((NullType)e);
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
