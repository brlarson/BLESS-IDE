/**
 * (C) Multitude Corporation 2022
 */
package com.multitude.aadl.bless.validation;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.multitude.aadl.bless.BlessControl;
import com.multitude.aadl.bless.bLESS.ANumber;
import com.multitude.aadl.bless.bLESS.AddSub;
import com.multitude.aadl.bless.bLESS.ArrayRange;
import com.multitude.aadl.bless.bLESS.ArrayType;
import com.multitude.aadl.bless.bLESS.Assertion;
import com.multitude.aadl.bless.bLESS.AssertionFunctionValue;
import com.multitude.aadl.bless.bLESS.AssertionNumericExpression;
import com.multitude.aadl.bless.bLESS.Assignment;
import com.multitude.aadl.bless.bLESS.BLESSFactory;
import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.BehaviorState;
import com.multitude.aadl.bless.bLESS.BehaviorTime;
import com.multitude.aadl.bless.bLESS.BehaviorTransition;
import com.multitude.aadl.bless.bLESS.BooleanExpression;
import com.multitude.aadl.bless.bLESS.BooleanType;
import com.multitude.aadl.bless.bLESS.CaseChoice;
import com.multitude.aadl.bless.bLESS.CaseExpression;
import com.multitude.aadl.bless.bLESS.CombinableOperation;
import com.multitude.aadl.bless.bLESS.ConditionValuePair;
import com.multitude.aadl.bless.bLESS.ConditionalAssertionFunction;
import com.multitude.aadl.bless.bLESS.ConditionalExpression;
import com.multitude.aadl.bless.bLESS.Conjunction;
import com.multitude.aadl.bless.bLESS.Constant;
import com.multitude.aadl.bless.bLESS.CountingQuantification;
import com.multitude.aadl.bless.bLESS.Disjunction;
import com.multitude.aadl.bless.bLESS.DispatchTrigger;
import com.multitude.aadl.bless.bLESS.DoUntilLoop;
import com.multitude.aadl.bless.bLESS.EnumerationPair;
import com.multitude.aadl.bless.bLESS.EnumerationType;
import com.multitude.aadl.bless.bLESS.EnumerationValue;
import com.multitude.aadl.bless.bLESS.EventTrigger;
import com.multitude.aadl.bless.bLESS.ExecuteCondition;
import com.multitude.aadl.bless.bLESS.ExistentialQuantification;
import com.multitude.aadl.bless.bLESS.Exp;
import com.multitude.aadl.bless.bLESS.Expression;
import com.multitude.aadl.bless.bLESS.ForallVariable;
import com.multitude.aadl.bless.bLESS.FormalActual;
import com.multitude.aadl.bless.bLESS.FormalActualList;
import com.multitude.aadl.bless.bLESS.GhostVariable;
import com.multitude.aadl.bless.bLESS.IndexExpression;
import com.multitude.aadl.bless.bLESS.IndexExpressionOrRange;
import com.multitude.aadl.bless.bLESS.InvariantClause;
import com.multitude.aadl.bless.bLESS.Invocation;
import com.multitude.aadl.bless.bLESS.ModeCondition;
import com.multitude.aadl.bless.bLESS.MultDiv;
import com.multitude.aadl.bless.bLESS.NameTick;
import com.multitude.aadl.bless.bLESS.NamedAssertion;
import com.multitude.aadl.bless.bLESS.NamelessAssertion;
import com.multitude.aadl.bless.bLESS.NamelessFunction;
import com.multitude.aadl.bless.bLESS.NullType;
import com.multitude.aadl.bless.bLESS.NumericExpression;
import com.multitude.aadl.bless.bLESS.ParenthesizedSubexpression;
import com.multitude.aadl.bless.bLESS.PartialName;
import com.multitude.aadl.bless.bLESS.PeriodShift;
import com.multitude.aadl.bless.bLESS.PortInput;
import com.multitude.aadl.bless.bLESS.PortName;
import com.multitude.aadl.bless.bLESS.Predicate;
import com.multitude.aadl.bless.bLESS.ProductQuantification;
import com.multitude.aadl.bless.bLESS.PropertyReference;
import com.multitude.aadl.bless.bLESS.Quantity;
import com.multitude.aadl.bless.bLESS.QuantityType;
import com.multitude.aadl.bless.bLESS.Range;
import com.multitude.aadl.bless.bLESS.RecordField;
import com.multitude.aadl.bless.bLESS.RecordTerm;
import com.multitude.aadl.bless.bLESS.RecordType;
import com.multitude.aadl.bless.bLESS.RecordValue;
import com.multitude.aadl.bless.bLESS.Relation;
import com.multitude.aadl.bless.bLESS.RootDeclaration;
import com.multitude.aadl.bless.bLESS.SimultaneousAssignment;
import com.multitude.aadl.bless.bLESS.StatesSection;
import com.multitude.aadl.bless.bLESS.SubProgramParameter;
import com.multitude.aadl.bless.bLESS.Subexpression;
import com.multitude.aadl.bless.bLESS.SubprogramCall;
import com.multitude.aadl.bless.bLESS.SumQuantification;
import com.multitude.aadl.bless.bLESS.TimedExpression;
import com.multitude.aadl.bless.bLESS.TimedSubject;
import com.multitude.aadl.bless.bLESS.Transitions;
import com.multitude.aadl.bless.bLESS.Type;
import com.multitude.aadl.bless.bLESS.TypeDeclaration;
import com.multitude.aadl.bless.bLESS.TypeOrReference;
import com.multitude.aadl.bless.bLESS.UnaryOperator;
import com.multitude.aadl.bless.bLESS.UnitFactor;
import com.multitude.aadl.bless.bLESS.UnitFormula;
import com.multitude.aadl.bless.bLESS.UnitName;
import com.multitude.aadl.bless.bLESS.UniversalQuantification;
import com.multitude.aadl.bless.bLESS.Value;
import com.multitude.aadl.bless.bLESS.ValueName;
import com.multitude.aadl.bless.bLESS.Variable;
import com.multitude.aadl.bless.bLESS.VariableDeclaration;
import com.multitude.aadl.bless.bLESS.VariableList;
import com.multitude.aadl.bless.bLESS.WhileLoop;
import com.multitude.aadl.bless.maps.BlessMaps;
import com.multitude.aadl.bless.scoping.BlessIndex;
import com.multitude.aadl.bless.util.BlessUtil;
import com.multitude.aadl.bless.util.TypeUtil;
import com.multitude.aadl.bless.util.UnitRecord;
import com.multitude.aadl.bless.util.UnitUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.osate.aadl2.AadlInteger;
import org.osate.aadl2.AadlReal;
import org.osate.aadl2.AbstractNamedValue;
import org.osate.aadl2.CalledSubprogram;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.DataPort;
import org.osate.aadl2.EventDataPort;
import org.osate.aadl2.EventPort;
import org.osate.aadl2.Feature;
import org.osate.aadl2.IntegerLiteral;
import org.osate.aadl2.Mode;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.NamedValue;
import org.osate.aadl2.Parameter;
import org.osate.aadl2.Property;
import org.osate.aadl2.PropertyConstant;
import org.osate.aadl2.PropertyExpression;
import org.osate.aadl2.PropertyType;
import org.osate.aadl2.RangeValue;
import org.osate.aadl2.RealLiteral;
import org.osate.aadl2.SubprogramSubcomponent;
import org.osate.aadl2.SubprogramSubcomponentType;
import org.osate.aadl2.UnitLiteral;
import org.osate.aadl2.impl.SubprogramTypeImpl;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class BLESSValidator extends AbstractBLESSValidator {
  @Inject
  @Extension
  private TypeUtil _typeUtil;

  @Inject
  @Extension
  private UnitUtil _unitUtil;

  @Inject
  @Extension
  private BlessIndex _blessIndex;

  @Inject
  @Extension
  private BlessUtil _blessUtil;

  private boolean cacheUnits = false;

  private final Map<EObject, UnitRecord> unitRecordMap = new HashMap<EObject, UnitRecord>();

  @Override
  protected boolean isResponsible(final Map<Object, Object> context, final EObject eObject) {
    EPackage _ePackage = eObject.eClass().getEPackage();
    return Objects.equal(_ePackage, BLESSPackage.eINSTANCE);
  }

  public void fError(final String message, final EObject source, final EStructuralFeature feature) {
    boolean _firstMarkerHere = this._blessUtil.firstMarkerHere(source);
    if (_firstMarkerHere) {
      this.error(message, source, feature);
    }
  }

  public void fWarning(final String message, final EObject source, final EStructuralFeature feature) {
    boolean _firstMarkerHere = this._blessUtil.firstMarkerHere(source);
    if (_firstMarkerHere) {
      this.warning(message, source, feature);
    }
  }

  public void fError(final String message, final EObject source, final EStructuralFeature feature, final int index) {
    boolean _firstMarkerHere = this._blessUtil.firstMarkerHere(source);
    if (_firstMarkerHere) {
      this.error(message, source, feature, index);
    }
  }

  public void fError(final String message, final EObject source, final EStructuralFeature feature, final String code, final String... issueData) {
    boolean _firstMarkerHere = this._blessUtil.firstMarkerHere(source);
    if (_firstMarkerHere) {
      this.error(message, source, feature, code, issueData);
    }
  }

  public void fWarning(final String message, final EObject source, final EStructuralFeature feature, final int index) {
    boolean _firstMarkerHere = this._blessUtil.firstMarkerHere(source);
    if (_firstMarkerHere) {
      this.warning(message, source, feature, index);
    }
  }

  public void fWarning(final String message, final EObject source, final EStructuralFeature feature, final String code, final String... issueData) {
    boolean _firstMarkerHere = this._blessUtil.firstMarkerHere(source);
    if (_firstMarkerHere) {
      this.warning(message, source, feature, code, issueData);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkInvariantHasNoParameters(final InvariantClause ic) {
    Assertion _inv = ic.getInv();
    NamedAssertion _namedassertion = null;
    if (_inv!=null) {
      _namedassertion=_inv.getNamedassertion();
    }
    VariableList _formals = _namedassertion.getFormals();
    boolean _tripleNotEquals = (_formals != null);
    if (_tripleNotEquals) {
      this.fError("Assertions used as invariants must not have parameters.", ic.getInv().getNamedassertion(), 
        BLESSPackage.eINSTANCE.getNamedAssertion_Formals());
    }
  }

  @Check(CheckType.NORMAL)
  public void checkIfPositiveUnitFactor(final UnitFactor uf) {
    boolean _nonnegativeNumber = this._unitUtil.nonnegativeNumber(uf.getFactor());
    boolean _not = (!_nonnegativeNumber);
    if (_not) {
      this.fError("Unit factors must be positive", uf, 
        BLESSPackage.eINSTANCE.getUnitFactor_Factor());
    }
  }

  @Check(CheckType.NORMAL)
  public void checkQuantityLiteralLackingUnitIsWhole(final Constant c) {
    Quantity _numeric_constant = c.getNumeric_constant();
    boolean _tripleNotEquals = (_numeric_constant != null);
    if (_tripleNotEquals) {
      if ((((!c.getNumeric_constant().isScalar()) && (!c.getNumeric_constant().isWhole())) && (c.getNumeric_constant().getUnit() == null))) {
        boolean _contains = c.getNumeric_constant().getNumber().getLit().contains(".");
        if (_contains) {
          this.warning("quantity literal lacking unit must be integer", c, 
            BLESSPackage.eINSTANCE.getConstant_Numeric_constant());
        }
      }
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatUnitFormulaIsAllBaseUnit(final UnitFormula form) {
    final Consumer<UnitName> _function = (UnitName ul) -> {
      boolean _isBaseType = this._unitUtil.isBaseType(ul);
      boolean _not = (!_isBaseType);
      if (_not) {
        boolean _firstMarkerHere = this._blessUtil.firstMarkerHere(form);
        if (_firstMarkerHere) {
          String _name = ul.getName();
          String _plus = ("All units in a unit formula must be base types; \"" + _name);
          String _plus_1 = (_plus + "\" is not a base type.");
          this.error(_plus_1, form, 
            BLESSPackage.eINSTANCE.getUnitFormula_Top());
        }
      }
    };
    form.getTop().forEach(_function);
    final Consumer<UnitName> _function_1 = (UnitName ul) -> {
      boolean _isBaseType = this._unitUtil.isBaseType(ul);
      boolean _not = (!_isBaseType);
      if (_not) {
        boolean _firstMarkerHere = this._blessUtil.firstMarkerHere(form);
        if (_firstMarkerHere) {
          String _name = ul.getName();
          String _plus = ("All units in a unit formula must be base types; \"" + _name);
          String _plus_1 = (_plus + "\" is not a base type.");
          this.error(_plus_1, form, 
            BLESSPackage.eINSTANCE.getUnitFormula_Bottom());
        }
      }
    };
    form.getBottom().forEach(_function_1);
  }

  @Check(CheckType.NORMAL)
  public void checkSingleCharacterBaseUnit(final RootDeclaration ud) {
    if ((ud.isBase() && (ud.getUnitName().getName().length() > 1))) {
      this.fError("Base units must have single-character names", ud, 
        BLESSPackage.eINSTANCE.getRootDeclaration_UnitName());
    }
  }

  @Check
  public void arrayRangesHaveNaturalValues(final ArrayRange range) {
    boolean _and = false;
    ANumber _lb = range.getLb();
    String _lit = null;
    if (_lb!=null) {
      _lit=_lb.getLit();
    }
    boolean _tripleNotEquals = (_lit != null);
    if (!_tripleNotEquals) {
      _and = false;
    } else {
      boolean _or = false;
      ANumber _lb_1 = range.getLb();
      String _lit_1 = null;
      if (_lb_1!=null) {
        _lit_1=_lb_1.getLit();
      }
      boolean _contains = _lit_1.contains(".");
      if (_contains) {
        _or = true;
      } else {
        ANumber _lb_2 = range.getLb();
        String _lit_2 = null;
        if (_lb_2!=null) {
          _lit_2=_lb_2.getLit();
        }
        boolean _contains_1 = _lit_2.contains("-");
        _or = _contains_1;
      }
      _and = _or;
    }
    if (_and) {
      this.fError("Range bounds must be natural numbers", range.getLb(), 
        BLESSPackage.eINSTANCE.getANumber_Lit(), IssueCodes.RANGE_BOUNDS_MUST_BE_NATURAL);
    }
    boolean _and_1 = false;
    ANumber _ub = null;
    if (range!=null) {
      _ub=range.getUb();
    }
    String _lit_3 = null;
    if (_ub!=null) {
      _lit_3=_ub.getLit();
    }
    boolean _tripleNotEquals_1 = (_lit_3 != null);
    if (!_tripleNotEquals_1) {
      _and_1 = false;
    } else {
      boolean _or_1 = false;
      ANumber _ub_1 = null;
      if (range!=null) {
        _ub_1=range.getUb();
      }
      String _lit_4 = null;
      if (_ub_1!=null) {
        _lit_4=_ub_1.getLit();
      }
      boolean _contains_2 = _lit_4.contains(".");
      if (_contains_2) {
        _or_1 = true;
      } else {
        ANumber _ub_2 = null;
        if (range!=null) {
          _ub_2=range.getUb();
        }
        String _lit_5 = null;
        if (_ub_2!=null) {
          _lit_5=_ub_2.getLit();
        }
        boolean _contains_3 = _lit_5.contains("-");
        _or_1 = _contains_3;
      }
      _and_1 = _or_1;
    }
    if (_and_1) {
      this.fError("Range bounds must be natural numbers", range.getUb(), 
        BLESSPackage.eINSTANCE.getANumber_Lit(), IssueCodes.RANGE_BOUNDS_MUST_BE_NATURAL);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkForNullTypeDeclaration(final TypeDeclaration td) {
    Type _type = td.getType();
    if ((_type instanceof NullType)) {
      this.fError("Null is not allowed as a type declaration.", td, 
        BLESSPackage.eINSTANCE.getTypeDeclaration_Type(), IssueCodes.NULL_TYPE_DECLARATION_DISALLOWED);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatRecordTermsHaveRecordType(final RecordTerm rt) {
    Type _type = rt.getRecord_type().getType();
    boolean _not = (!(_type instanceof RecordType));
    if (_not) {
      this.fError("Record terms (values) must have record types.", rt.getRecord_type(), 
        BLESSPackage.eINSTANCE.getRecordTerm_Record_type(), IssueCodes.INCOMPATIBLE_TYPES);
    }
    Type _type_1 = rt.getRecord_type().getType();
    final RecordType ty = ((RecordType) _type_1);
    final HashMap<String, Type> rf = new HashMap<String, Type>();
    EList<RecordField> _fields = ty.getFields();
    for (final RecordField f : _fields) {
      Type _ty = f.getTyp().getTy();
      boolean _tripleNotEquals = (_ty != null);
      if (_tripleNotEquals) {
        rf.put(f.getLabel(), f.getTyp().getTy());
      } else {
        rf.put(f.getLabel(), f.getTyp().getRef().getType());
      }
    }
    EList<RecordValue> _record_value = rt.getRecord_value();
    for (final RecordValue rv : _record_value) {
      boolean _containsKey = rf.containsKey(rv.getLabel());
      if (_containsKey) {
        boolean _sameStructuralType = this._typeUtil.sameStructuralType(this.getType(rv.getAval()), rf.remove(rv.getLabel()));
        boolean _not_1 = (!_sameStructuralType);
        if (_not_1) {
          String _name = rt.getRecord_type().getName();
          String _plus = ("Record type \'" + _name);
          String _plus_1 = (_plus + "\' field with label \'");
          String _label = rv.getLabel();
          String _plus_2 = (_plus_1 + _label);
          String _plus_3 = (_plus_2 + "\' does not match type.");
          this.fError(_plus_3, rv, 
            BLESSPackage.eINSTANCE.getRecordValue_Aval(), IssueCodes.MISSING_RECORD_FIELD_LABEL);
        }
      } else {
        String _name_1 = rt.getRecord_type().getName();
        String _plus_4 = ("Record type \'" + _name_1);
        String _plus_5 = (_plus_4 + "\' does not have a field with label \'");
        String _label_1 = rv.getLabel();
        String _plus_6 = (_plus_5 + _label_1);
        String _plus_7 = (_plus_6 + "\'.");
        this.fError(_plus_7, rt, 
          BLESSPackage.eINSTANCE.getRecordTerm_Record_type(), IssueCodes.MISSING_RECORD_FIELD_LABEL);
      }
    }
    boolean _isEmpty = rf.isEmpty();
    boolean _not_2 = (!_isEmpty);
    if (_not_2) {
      String _name_2 = rt.getRecord_type().getName();
      String _plus_8 = ("Record type \'" + _name_2);
      String _plus_9 = (_plus_8 + "\' has unassigned fields: ");
      Set<String> _keySet = rf.keySet();
      String _plus_10 = (_plus_9 + _keySet);
      String _plus_11 = (_plus_10 + "\'.");
      this.fError(_plus_11, rt, 
        BLESSPackage.eINSTANCE.getRecordTerm_Record_type(), IssueCodes.UNASSIGNED_RECORD_FIELD_LABEL);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatAssertionEnumerationsHaveEnumerationTypeLabels(final NamedAssertion na) {
    boolean _isEnumer = na.isEnumer();
    if (_isEnumer) {
      if (((na.getEnumerationType() != null) && (!(na.getEnumerationType().getType() instanceof EnumerationType)))) {
        boolean _firstMarkerHere = this._blessUtil.firstMarkerHere(na);
        if (_firstMarkerHere) {
          this.fError("Assertion enumerations must have enumeration type parameters", na, 
            BLESSPackage.eINSTANCE.getNamedAssertion_EnumerationType(), IssueCodes.MUST_HAVE_ENUM_TYPE);
        }
      }
      Type _type = na.getEnumerationType().getType();
      final Set<String> et = IterableExtensions.<String>toSet(((EnumerationType) _type).getDefining_enumeration_literal());
      EList<EnumerationPair> _pair = na.getEnumeration().getPair();
      for (final EnumerationPair ePair : _pair) {
        boolean _contains = et.contains(ePair.getEnumeration_literal());
        boolean _not = (!_contains);
        if (_not) {
          boolean _firstMarkerHere_1 = this._blessUtil.firstMarkerHere(ePair);
          if (_firstMarkerHere_1) {
            String _enumeration_literal = ePair.getEnumeration_literal();
            String _plus = ("Assertion enumeration label \'" + _enumeration_literal);
            String _plus_1 = (_plus + "\' is not one of the literals in \'");
            String _name = na.getEnumerationType().getName();
            String _plus_2 = (_plus_1 + _name);
            String _plus_3 = (_plus_2 + "\' enumeration type");
            this.fError(_plus_3, ePair, 
              BLESSPackage.eINSTANCE.getEnumerationPair_Enumeration_literal(), IssueCodes.LABEL_NOT_IN_ENUM_TYPE);
          }
        }
      }
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatAssertionFunctionHasCompatibleUnits(final NamedAssertion a) {
    boolean _isFunc = a.isFunc();
    if (_isFunc) {
      boolean _sameStructuralType = this._typeUtil.sameStructuralType(this._typeUtil.getType(a.getTod()), this.getType(a.getFunctionvalue()));
      boolean _not = (!_sameStructuralType);
      if (_not) {
        this.fError("Operands of assertion functions must have compatible types", a, 
          BLESSPackage.eINSTANCE.getNamedAssertion_Func(), IssueCodes.INCOMPATIBLE_TYPES);
      } else {
        boolean _matchTopAndBottom = this.getUnitRecord(a.getTod()).matchTopAndBottom(this.getUnitRecord(a.getFunctionvalue()));
        boolean _not_1 = (!_matchTopAndBottom);
        if (_not_1) {
          String _string = this.getUnitRecord(a.getTod()).toString();
          String _plus = ("Return type of assertion function must have the same base units as its expression; " + _string);
          String _plus_1 = (_plus + " is not ");
          String _string_1 = this.getUnitRecord(a.getFunctionvalue()).toString();
          String _plus_2 = (_plus_1 + _string_1);
          this.fError(_plus_2, a, 
            BLESSPackage.eINSTANCE.getNamedAssertion_Func(), IssueCodes.INCOMPATIBLE_UNITS);
        }
      }
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatNamelessAssertionsHavePredicates(final NamelessAssertion n) {
    boolean _isBoolean = this.isBoolean(this.getType(n.getPredicate()));
    boolean _not = (!_isBoolean);
    if (_not) {
      this.fError("Nameless assertions must have boolean predicates", n, 
        BLESSPackage.eINSTANCE.getNamelessAssertion_Predicate(), IssueCodes.TYPE_MUST_BE_BOOLEAN);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatNamelessFunctionHaveQuantity(final NamelessFunction n) {
    Type _type = this.getType(n.getFunctionvalue());
    boolean _not = (!(_type instanceof QuantityType));
    if (_not) {
      this.fError("Nameless functions must have quantity function values", n, 
        BLESSPackage.eINSTANCE.getNamelessFunction_Functionvalue(), IssueCodes.MUST_BE_QUANTITY);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatNamedAssertionType(final NamedAssertion n) {
    if ((n.isPred() && (!this.isBoolean(this.getType(n.getPredicate()))))) {
      this.fError("Assertions must have boolean predicates.", n, 
        BLESSPackage.eINSTANCE.getNamedAssertion_Predicate(), IssueCodes.TYPE_MUST_BE_BOOLEAN);
    }
    if ((n.isFunc() && (!this._typeUtil.sameStructuralType(this.getType(n.getFunctionvalue()), this._typeUtil.getType(n.getTod()))))) {
      this.fError("Assertion functions must match their types.", n, 
        BLESSPackage.eINSTANCE.getNamedAssertion_Tod(), IssueCodes.MISMATCHED_UNITS);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkPortInputTarget(final PortInput n) {
    if ((((n.getTarget().isQ() || n.getTarget().isFresh()) || n.getTarget().isCount()) || n.getTarget().isUpdated())) {
      this.fError("Target of port input must be a variable name.", n, 
        BLESSPackage.eINSTANCE.getPortInput_Target(), IssueCodes.PORT_INPUT_MUST_TARGET_VARIABLE);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkAssignmentToInPort(final Assignment asgn) {
    final NamedElement vName = asgn.getLhs().getValue().getId();
    if (((vName instanceof DataPort) && (!((DataPort) vName).isOut()))) {
      this.fError("May not assign to in data port.", asgn, 
        BLESSPackage.eINSTANCE.getAssignment_Lhs(), IssueCodes.ASSIGNMENT_TO_IN_FEATURE);
    }
    if (((vName instanceof EventDataPort) && (!((EventDataPort) vName).isOut()))) {
      this.fError("May not assign to in event data port.", asgn, 
        BLESSPackage.eINSTANCE.getAssignment_Lhs(), IssueCodes.ASSIGNMENT_TO_IN_FEATURE);
    }
    if (((vName instanceof EventPort) && (!((EventPort) vName).isOut()))) {
      this.fError("May not assign to in event port.", asgn, 
        BLESSPackage.eINSTANCE.getAssignment_Lhs(), IssueCodes.ASSIGNMENT_TO_IN_FEATURE);
    }
    if (((vName instanceof Parameter) && (!((Parameter) vName).isOut()))) {
      this.fError("May not assign to in parameter.", asgn, 
        BLESSPackage.eINSTANCE.getAssignment_Lhs(), IssueCodes.ASSIGNMENT_TO_IN_FEATURE);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkPortIndexIsNaturalLiteral(final ValueName vn) {
    if ((((vn.getId() instanceof DataPort) || (vn.getId() instanceof EventPort)) || (vn.getId() instanceof EventDataPort))) {
      if (((vn.getArray_index() != null) && (vn.getArray_index().size() > 0))) {
        int _size = vn.getArray_index().size();
        boolean _greaterThan = (_size > 1);
        if (_greaterThan) {
          this.fError("Port arrays are one dimensional.", vn, 
            BLESSPackage.eINSTANCE.getValueName_Array_index(), IssueCodes.PORT_ARRAY_INDEX_ERROR);
        } else {
          IndexExpressionOrRange _head = IterableExtensions.<IndexExpressionOrRange>head(vn.getArray_index());
          if ((_head instanceof ANumber)) {
            IndexExpressionOrRange _head_1 = IterableExtensions.<IndexExpressionOrRange>head(vn.getArray_index());
            final ANumber num = ((ANumber) _head_1);
            if (((num.getLit() != null) && (num.getLit().contains(".") || num.getLit().contains("-")))) {
              this.fError("Port array index must be natural literal.", vn, 
                BLESSPackage.eINSTANCE.getValueName_Array_index(), IssueCodes.PORT_ARRAY_INDEX_ERROR);
            }
          } else {
            this.fError("Port array index must be natural literal.", vn, 
              BLESSPackage.eINSTANCE.getValueName_Array_index(), IssueCodes.PORT_ARRAY_INDEX_ERROR);
          }
        }
      }
    }
  }

  @Check(CheckType.NORMAL)
  public void checkPElhsIsWhole(final Relation r) {
    if (((r.getSym() != null) && r.getSym().equalsIgnoreCase("+="))) {
      AddSub _l = r.getL();
      if ((_l instanceof ValueName)) {
        AddSub _l_1 = r.getL();
        final Type ty = this.getType(((ValueName) _l_1));
        if ((ty instanceof QuantityType)) {
          boolean _isWhole = ((QuantityType) ty).isWhole();
          boolean _not = (!_isWhole);
          if (_not) {
            this.fError("+= only apples to whole variables.", r, 
              BLESSPackage.eINSTANCE.getRelation_L(), IssueCodes.PLUS_EQUALS_ERROR);
          }
        } else {
          this.fError("+= only apples to whole variables.", r, 
            BLESSPackage.eINSTANCE.getRelation_L(), IssueCodes.PLUS_EQUALS_ERROR);
        }
      } else {
        this.fError("+= only apples to whole variables.", r, 
          BLESSPackage.eINSTANCE.getRelation_L(), IssueCodes.PLUS_EQUALS_ERROR);
      }
    }
  }

  @Check(CheckType.NORMAL)
  public void checkNameTickValue(final NameTick n) {
    if ((n.isTick() && (((n.getValue().isQ() || n.getValue().isFresh()) || n.getValue().isCount()) || n.getValue().isUpdated()))) {
      this.fError("Must be a variable name to have \'.", n, 
        BLESSPackage.eINSTANCE.getPortInput_Target(), IssueCodes.PORT_INPUT_NOT_ALLOWED);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkSubProgramParameterValue(final SubProgramParameter n) {
    if ((((n.getValue().isQ() || n.getValue().isFresh()) || n.getValue().isCount()) || n.getValue().isUpdated())) {
      this.fError("Subprogram parameters may not be port input.", n, 
        BLESSPackage.eINSTANCE.getSubProgramParameter_Value(), IssueCodes.PORT_INPUT_NOT_ALLOWED);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkBehaviorTimeValue(final BehaviorTime n) {
    if ((((n.getValue().isQ() || n.getValue().isFresh()) || n.getValue().isCount()) || n.getValue().isUpdated())) {
      this.fError("Behavior time may not be port input.", n, 
        BLESSPackage.eINSTANCE.getBehaviorTime_Value(), IssueCodes.PORT_INPUT_NOT_ALLOWED);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkInvocationNumericExpression(final Invocation i) {
    if (((i.getActual_parameter() != null) && (!(this.getType(i.getActual_parameter()) instanceof QuantityType)))) {
      NamedAssertion _label = i.getLabel();
      String _name = null;
      if (_label!=null) {
        _name=_label.getName();
      }
      String _plus = ("Invocation of " + _name);
      String _plus_1 = (_plus + " with unlabeled parameter must be quantity.  Try ");
      NamedAssertion _label_1 = i.getLabel();
      String _name_1 = null;
      if (_label_1!=null) {
        _name_1=_label_1.getName();
      }
      String _plus_2 = (_plus_1 + _name_1);
      String _plus_3 = (_plus_2 + "(x:e)");
      this.fError(_plus_3, i, 
        BLESSPackage.eINSTANCE.getInvocation_Actual_parameter(), IssueCodes.MUST_BE_QUANTITY);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkDuplicateTransitionLabels(final Transitions trans) {
    final HashMap<String, BehaviorTransition> labels = new HashMap<String, BehaviorTransition>();
    EList<BehaviorTransition> _bt = trans.getBt();
    for (final BehaviorTransition t : _bt) {
      boolean _containsKey = labels.containsKey(t.getName());
      if (_containsKey) {
        String _name = t.getName();
        String _plus = ("Duplicate transition label \'" + _name);
        String _plus_1 = (_plus + "\'");
        this.fError(_plus_1, t, 
          BLESSPackage.eINSTANCE.getBehaviorTransition_Colon(), IssueCodes.DUPLICATE_TRANSITION_LABEL);
        String _name_1 = t.getName();
        String _plus_2 = ("Duplicate transition label \'" + _name_1);
        String _plus_3 = (_plus_2 + "\'");
        this.fError(_plus_3, labels.get(t.getName()), 
          BLESSPackage.eINSTANCE.getBehaviorTransition_Colon(), IssueCodes.DUPLICATE_TRANSITION_LABEL);
      } else {
        labels.put(t.getName(), t);
      }
    }
  }

  @Check(CheckType.NORMAL)
  public void checkProductQuantificationNumericExpression(final ProductQuantification pq) {
    if (((pq.getNumeric_expression() != null) && (!(this.getType(pq.getNumeric_expression()) instanceof QuantityType)))) {
      this.fError("product-of must be quantity.", pq, 
        BLESSPackage.eINSTANCE.getProductQuantification_Numeric_expression(), IssueCodes.MUST_BE_QUANTITY);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkSumQuantificationNumericExpression(final SumQuantification sq) {
    if (((sq.getNumeric_expression() != null) && (!(this.getType(sq.getNumeric_expression()) instanceof QuantityType)))) {
      this.fError("sum-of must be quantity.", sq, 
        BLESSPackage.eINSTANCE.getSumQuantification_Numeric_expression(), IssueCodes.MUST_BE_QUANTITY);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatBooleanExpressionsAreBoolean(final BooleanExpression be) {
    final Expression le = ((Expression) be);
    if (((le.getAll() != null) && (!this._typeUtil.sameStructuralType(this.getType(le.getAll()), this._typeUtil.booleanType())))) {
      this.fError("Universal quantification must be Boolean type.", le, 
        BLESSPackage.eINSTANCE.getExpression_All(), IssueCodes.TYPE_MUST_BE_BOOLEAN);
    }
    if (((le.getExists() != null) && (!this._typeUtil.sameStructuralType(this.getType(le.getExists()), this._typeUtil.booleanType())))) {
      this.fError("Existential quantification must be Boolean type.", le, 
        BLESSPackage.eINSTANCE.getExpression_Exists(), IssueCodes.TYPE_MUST_BE_BOOLEAN);
    }
    if (((le.getR() != null) && (!this._typeUtil.sameStructuralType(this.getType(le.getR()), this._typeUtil.booleanType())))) {
      this.fError("Consequents of implication must have Boolean type.", le, 
        BLESSPackage.eINSTANCE.getExpression_R(), IssueCodes.TYPE_MUST_BE_BOOLEAN);
    }
    if ((((le.getL() != null) && (le.getSym() != null)) && (!this._typeUtil.sameStructuralType(this.getType(le.getL()), this._typeUtil.booleanType())))) {
      this.fError("Premises of implication must have Boolean type.", le, 
        BLESSPackage.eINSTANCE.getExpression_L(), IssueCodes.TYPE_MUST_BE_BOOLEAN);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatRelationsHaveCompatibleUnits(final Relation r) {
    String _in = r.getIn();
    boolean _tripleNotEquals = (_in != null);
    if (_tripleNotEquals) {
      final UnitRecord rlur = this.getUnitRecord(r.getL());
      final UnitRecord rrur = this.getUnitRecord(r.getRange().getLower_bound());
      boolean _matchTopAndBottom = rlur.matchTopAndBottom(rrur);
      boolean _not = (!_matchTopAndBottom);
      if (_not) {
        String _string = rlur.toString();
        String _plus = ("Subject of \'in\' relation must have the same base units as lower bound of range; " + _string);
        String _plus_1 = (_plus + " is not ");
        String _string_1 = rrur.toString();
        String _plus_2 = (_plus_1 + _string_1);
        this.fError(_plus_2, r.getRange(), 
          BLESSPackage.eINSTANCE.getRange_Lower_bound(), IssueCodes.INCOMPATIBLE_UNITS);
      }
      final UnitRecord rubur = this.getUnitRecord(r.getRange().getUpper_bound());
      boolean _matchTopAndBottom_1 = rlur.matchTopAndBottom(rubur);
      boolean _not_1 = (!_matchTopAndBottom_1);
      if (_not_1) {
        String _string_2 = rlur.toString();
        String _plus_3 = ("Subject of \'in\' relation must have the same base units as upper bound of range; " + _string_2);
        String _plus_4 = (_plus_3 + " is not ");
        String _string_3 = rubur.toString();
        String _plus_5 = (_plus_4 + _string_3);
        this.fError(_plus_5, r.getRange(), 
          BLESSPackage.eINSTANCE.getRange_Upper_bound(), IssueCodes.INCOMPATIBLE_UNITS);
      }
    }
    if (((r.getSym() != null) && (!this._typeUtil.relationComparesNull(r)))) {
      final Type rlqt = this.getType(r.getL());
      final Type rrqt = this.getType(r.getR());
      if (((rlqt instanceof QuantityType) && (rrqt instanceof QuantityType))) {
        final UnitRecord rlur_1 = this.getUnitRecord(((QuantityType) rlqt));
        final UnitRecord rrur_1 = this.getUnitRecord(((QuantityType) rrqt));
        boolean _matchTopAndBottom_2 = rlur_1.matchTopAndBottom(rrur_1);
        boolean _not_2 = (!_matchTopAndBottom_2);
        if (_not_2) {
          String _sym = r.getSym();
          String _plus_6 = ("Operands of \'" + _sym);
          String _plus_7 = (_plus_6 + "\' must have the same base units; ");
          String _string_4 = this.getUnitRecord(r.getL()).toString();
          String _plus_8 = (_plus_7 + _string_4);
          String _plus_9 = (_plus_8 + " is not ");
          String _string_5 = this.getUnitRecord(r.getR()).toString();
          String _plus_10 = (_plus_9 + _string_5);
          this.fError(_plus_10, r, 
            BLESSPackage.eINSTANCE.getRelation_Sym(), IssueCodes.INCOMPATIBLE_UNITS);
        }
      } else {
        boolean _sameStructuralType = this._typeUtil.sameStructuralType(this.getType(r.getL()), this.getType(r.getR()));
        boolean _not_3 = (!_sameStructuralType);
        if (_not_3) {
          String _sym_1 = r.getSym();
          String _plus_11 = ("Operands of \'" + _sym_1);
          String _plus_12 = (_plus_11 + "\' must have compatible types.  ");
          String _typeString = this._typeUtil.typeString(this.getType(r.getL()));
          String _plus_13 = (_plus_12 + _typeString);
          String _plus_14 = (_plus_13 + " is not ");
          String _typeString_1 = this._typeUtil.typeString(this.getType(r.getR()));
          String _plus_15 = (_plus_14 + _typeString_1);
          this.fError(_plus_15, r, 
            BLESSPackage.eINSTANCE.getRelation_Sym(), IssueCodes.INCOMPATIBLE_TYPES);
        }
      }
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatAdditionHasCompatibleUnits(final AddSub a) {
    EList<MultDiv> _r = a.getR();
    for (final MultDiv t : _r) {
      boolean _matchTopAndBottom = this.getUnitRecord(a.getL()).matchTopAndBottom(this.getUnitRecord(t));
      boolean _not = (!_matchTopAndBottom);
      if (_not) {
        String _sym = a.getSym();
        String _plus = ("Operands of \'" + _sym);
        String _plus_1 = (_plus + 
          "\' must have the same base units; ");
        String _string = this.getUnitRecord(a.getL()).toString();
        String _plus_2 = (_plus_1 + _string);
        String _plus_3 = (_plus_2 + " is not ");
        String _string_1 = this.getUnitRecord(t).toString();
        String _plus_4 = (_plus_3 + _string_1);
        this.fError(_plus_4, a, 
          BLESSPackage.eINSTANCE.getAddSub_Sym(), IssueCodes.INCOMPATIBLE_UNITS);
      }
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatAssignmentHasCompatibleUnits(final Assignment a) {
    boolean _isNull = this.isNull(this.getType(a.getRhs().getExp()));
    if (_isNull) {
    } else {
      Type _type = this.getType(a.getLhs().getValue());
      Expression _exp = a.getRhs().getExp();
      Type _type_1 = null;
      if (_exp!=null) {
        _type_1=this.getType(_exp);
      }
      boolean _sameStructuralType = this._typeUtil.sameStructuralType(_type, _type_1);
      boolean _not = (!_sameStructuralType);
      if (_not) {
        String _typeString = this._typeUtil.typeString(this.getType(a.getLhs().getValue()));
        String _plus = ("Targets of assignment must have compatible types with their expressions.  " + _typeString);
        String _plus_1 = (_plus + " is not ");
        Expression _exp_1 = a.getRhs().getExp();
        Type _type_2 = null;
        if (_exp_1!=null) {
          _type_2=this.getType(_exp_1);
        }
        String _typeString_1 = this._typeUtil.typeString(_type_2);
        String _plus_2 = (_plus_1 + _typeString_1);
        this.fError(_plus_2, a, 
          BLESSPackage.eINSTANCE.getAssignment_Asgn(), IssueCodes.INCOMPATIBLE_TYPES);
      } else {
        boolean _and = false;
        if (!((this.getType(a.getLhs().getValue()) instanceof QuantityType) && (this.getType(a.getRhs().getExp()) instanceof QuantityType))) {
          _and = false;
        } else {
          UnitRecord _unitRecord = this.getUnitRecord(a.getLhs().getValue());
          Expression _exp_2 = a.getRhs().getExp();
          UnitRecord _unitRecord_1 = null;
          if (_exp_2!=null) {
            _unitRecord_1=this.getUnitRecord(_exp_2);
          }
          boolean _matchTopAndBottom = _unitRecord.matchTopAndBottom(_unitRecord_1);
          boolean _not_1 = (!_matchTopAndBottom);
          _and = _not_1;
        }
        if (_and) {
          String _string = this.getUnitRecord(a.getLhs().getValue()).toString();
          String _plus_3 = ("Target of assignment of must have the same base units as its expression; " + _string);
          String _plus_4 = (_plus_3 + " is not ");
          String _string_1 = this.getUnitRecord(a.getRhs().getExp()).toString();
          String _plus_5 = (_plus_4 + _string_1);
          this.fError(_plus_5, a, 
            BLESSPackage.eINSTANCE.getAssignment_Asgn(), IssueCodes.INCOMPATIBLE_UNITS);
        }
      }
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatVariableDelcarationAssignmentHasCompatibleUnits(final VariableDeclaration vd) {
    boolean _isAssign = vd.isAssign();
    if (_isAssign) {
      boolean _isNull = this.isNull(this.getType(vd.getExpression()));
      if (_isNull) {
      } else {
        Type _type = this._typeUtil.getType(vd.getVariable().getTod());
        if ((_type instanceof ArrayType)) {
          Type _type_1 = this._typeUtil.getType(vd.getVariable().getTod());
          final ArrayType art = ((ArrayType) _type_1);
          boolean _sameStructuralType = this._typeUtil.sameStructuralType(this._typeUtil.getType(art.getTyp()), this.getType(vd.getExpression()));
          boolean _not = (!_sameStructuralType);
          if (_not) {
            this.fError("Array variable declaration initialization expression must match its element type.", vd, 
              BLESSPackage.eINSTANCE.getVariableDeclaration_Expression(), IssueCodes.INCOMPATIBLE_TYPES);
          } else {
            boolean _and = false;
            if (!((this._typeUtil.getType(art.getTyp()) instanceof QuantityType) && (this.getType(vd.getExpression()) instanceof QuantityType))) {
              _and = false;
            } else {
              UnitRecord _unitRecord = this.getUnitRecord(art.getTyp());
              Expression _expression = vd.getExpression();
              UnitRecord _unitRecord_1 = null;
              if (_expression!=null) {
                _unitRecord_1=this.getUnitRecord(_expression);
              }
              boolean _matchTopAndBottom = _unitRecord.matchTopAndBottom(_unitRecord_1);
              boolean _not_1 = (!_matchTopAndBottom);
              _and = _not_1;
            }
            if (_and) {
              String _string = this.getUnitRecord(art.getTyp()).toString();
              String _plus = ("Array variable declaration initialization expression must have the same base units as its element type; " + _string);
              String _plus_1 = (_plus + " is not ");
              String _string_1 = this.getUnitRecord(vd.getExpression()).toString();
              String _plus_2 = (_plus_1 + _string_1);
              this.fError(_plus_2, vd, 
                BLESSPackage.eINSTANCE.getVariableDeclaration_Expression(), IssueCodes.INCOMPATIBLE_UNITS);
            }
          }
        } else {
          boolean _sameStructuralType_1 = this._typeUtil.sameStructuralType(this._typeUtil.getType(vd.getVariable().getTod()), this.getType(vd.getExpression()));
          boolean _not_2 = (!_sameStructuralType_1);
          if (_not_2) {
            this.fError("Variable declaration initialization expression must match its type.", vd, 
              BLESSPackage.eINSTANCE.getVariableDeclaration_Expression(), IssueCodes.INCOMPATIBLE_TYPES);
          } else {
            boolean _and_1 = false;
            if (!((this._typeUtil.getType(vd.getVariable().getTod()) instanceof QuantityType) && (this.getType(vd.getExpression()) instanceof QuantityType))) {
              _and_1 = false;
            } else {
              UnitRecord _unitRecord_2 = this.getUnitRecord(vd.getVariable().getTod());
              Expression _expression_1 = vd.getExpression();
              UnitRecord _unitRecord_3 = null;
              if (_expression_1!=null) {
                _unitRecord_3=this.getUnitRecord(_expression_1);
              }
              boolean _matchTopAndBottom_1 = _unitRecord_2.matchTopAndBottom(_unitRecord_3);
              boolean _not_3 = (!_matchTopAndBottom_1);
              _and_1 = _not_3;
            }
            if (_and_1) {
              String _string_2 = this.getUnitRecord(vd.getVariable().getTod()).toString();
              String _plus_3 = ("Variable declaration initialization expression must have the same base units; " + _string_2);
              String _plus_4 = (_plus_3 + " is not ");
              String _string_3 = this.getUnitRecord(vd.getExpression()).toString();
              String _plus_5 = (_plus_4 + _string_3);
              this.fError(_plus_5, vd, 
                BLESSPackage.eINSTANCE.getVariableDeclaration_Expression(), IssueCodes.INCOMPATIBLE_UNITS);
            }
          }
        }
      }
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatVariableDelcarationHasAssignment(final VariableDeclaration vd) {
    boolean _isAssign = vd.isAssign();
    boolean _not = (!_isAssign);
    if (_not) {
      this.fWarning("Variable declarations should have initialization assignments to prevent use of uninitialized values.", vd, BLESSPackage.eINSTANCE.getVariableDeclaration_Expression(), IssueCodes.INCOMPATIBLE_UNITS);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatSimultaneousAssignmentHasCompatibleUnits(final SimultaneousAssignment a) {
    int _size = a.getLhs().size();
    int _size_1 = a.getRhs().size();
    boolean _tripleNotEquals = (_size != _size_1);
    if (_tripleNotEquals) {
      this.fError("Simultaneous assignment must have the same number of targets as expressions", a, 
        BLESSPackage.eINSTANCE.getSimultaneousAssignment_Asgn(), IssueCodes.SIMULTANEOUS_ASSIGNMENT);
    } else {
      for (int i = 0; (i < a.getLhs().size()); i++) {
        {
          final ValueName target = a.getLhs().get(i).getValue();
          final Expression expression = a.getRhs().get(i).getExp();
          boolean _isNull = this.isNull(this.getType(expression));
          if (_isNull) {
          } else {
            Type _type = this.getType(target);
            Type _type_1 = null;
            if (expression!=null) {
              _type_1=this.getType(expression);
            }
            boolean _sameStructuralType = this._typeUtil.sameStructuralType(_type, _type_1);
            boolean _not = (!_sameStructuralType);
            if (_not) {
              String _typeString = this._typeUtil.typeString(this.getType(target));
              String _plus = ("Targets of simultaneous assignment must have compatible types with expressions.  " + _typeString);
              String _plus_1 = (_plus + " is not ");
              Type _type_2 = null;
              if (expression!=null) {
                _type_2=this.getType(expression);
              }
              String _typeString_1 = this._typeUtil.typeString(_type_2);
              String _plus_2 = (_plus_1 + _typeString_1);
              this.fError(_plus_2, a, 
                BLESSPackage.eINSTANCE.getSimultaneousAssignment_Lhs(), i);
            } else {
              UnitRecord _unitRecord = this.getUnitRecord(target);
              UnitRecord _unitRecord_1 = null;
              if (expression!=null) {
                _unitRecord_1=this.getUnitRecord(expression);
              }
              boolean _matchTopAndBottom = _unitRecord.matchTopAndBottom(_unitRecord_1);
              boolean _not_1 = (!_matchTopAndBottom);
              if (_not_1) {
                String _string = this.getUnitRecord(target).toString();
                String _plus_3 = ("Target of assignment of must have the same base units as its expression; " + _string);
                String _plus_4 = (_plus_3 + " is not ");
                String _string_1 = this.getUnitRecord(expression).toString();
                String _plus_5 = (_plus_4 + _string_1);
                this.fError(_plus_5, a, 
                  BLESSPackage.eINSTANCE.getSimultaneousAssignment_Lhs(), i);
              }
            }
          }
        }
      }
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatBoundFunctionsAreWhole(final WhileLoop a) {
    boolean _isWhole = this.isWhole(a.getBound_function());
    boolean _not = (!_isWhole);
    if (_not) {
      this.fError("Bound functions of while loops must be whole numbers", a, 
        BLESSPackage.eINSTANCE.getWhileLoop_Bound_function(), IssueCodes.MUST_BE_WHOLE_NUMBER);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatBoundFunctionsAreWhole(final DoUntilLoop a) {
    boolean _isWhole = this.isWhole(a.getBnd());
    boolean _not = (!_isWhole);
    if (_not) {
      this.fError("Bound functions of do-unitl loops must be whole numbers", a, 
        BLESSPackage.eINSTANCE.getWhileLoop_Bound_function(), IssueCodes.MUST_BE_WHOLE_NUMBER);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatNamelessFunctionHasCompatibleUnits(final NamelessFunction a) {
    boolean _matchTopAndBottom = this.getUnitRecord(a.getTod()).matchTopAndBottom(this.getUnitRecord(a.getFunctionvalue()));
    boolean _not = (!_matchTopAndBottom);
    if (_not) {
      String _string = this.getUnitRecord(a.getTod()).toString();
      String _plus = ("Return type of nameless function must have the same base units as its expression; " + _string);
      String _plus_1 = (_plus + " is not ");
      String _string_1 = this.getUnitRecord(a.getFunctionvalue()).toString();
      String _plus_2 = (_plus_1 + _string_1);
      this.fError(_plus_2, a, 
        BLESSPackage.eINSTANCE.getNamelessFunction_Func(), IssueCodes.INCOMPATIBLE_UNITS);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatTimeExpressionsHaveTimeUnits(final TimedExpression tse) {
    boolean _isAt = tse.isAt();
    if (_isAt) {
      boolean _equals = this.getUnitRecord(tse.getTime()).rootUnit.getName().equals("s");
      boolean _not = (!_equals);
      if (_not) {
        this.fError("time expressions must have time units", tse, 
          BLESSPackage.eINSTANCE.getTimedExpression_Time(), IssueCodes.MUST_HAVE_TIME_UNITS);
      }
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatPeriodShiftsHaveWholeNumbers(final PeriodShift ps) {
    if (((ps.getV() != null) && (!this.isWhole(ps.getV())))) {
      this.fError("Must be whole number", ps, 
        BLESSPackage.eINSTANCE.getPeriodShift_V(), IssueCodes.MUST_HAVE_INDEX_TYPE);
    }
    if (((ps.getIndex_expression() != null) && (!this.isWhole(ps.getIndex_expression())))) {
      this.fError("Index expression must be whole number", ps, 
        BLESSPackage.eINSTANCE.getPeriodShift_Index_expression(), IssueCodes.MUST_HAVE_INDEX_TYPE);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatRangesHaveCompatibleUnits(final Range range) {
    boolean _matchTopAndBottom = this.getUnitRecord(range.getLower_bound()).matchTopAndBottom(this.getUnitRecord(range.getUpper_bound()));
    boolean _not = (!_matchTopAndBottom);
    if (_not) {
      this.fError("Lower and upper bounds of ranges must have compatible units", range, 
        BLESSPackage.eINSTANCE.getRange_Sym(), IssueCodes.INCOMPATIBLE_TYPES);
    }
  }

  @Check(CheckType.NORMAL)
  public void checkTargetsOfCombinableOperationsAreShared(final CombinableOperation co) {
    EObject _eContainer = co.getTarget().eContainer();
    if ((_eContainer instanceof VariableDeclaration)) {
      EObject _eContainer_1 = co.getTarget().eContainer();
      final VariableDeclaration vd = ((VariableDeclaration) _eContainer_1);
      boolean _isShared = vd.isShared();
      boolean _not = (!_isShared);
      if (_not) {
        this.fError("Targets of combinable operations must be \'shared\'.", co, 
          BLESSPackage.eINSTANCE.getCombinableOperation_Target(), IssueCodes.COMBINABLE_OPERATION_TARGET_MUST_BE_SHARED);
      }
    }
  }

  @Check(CheckType.NORMAL)
  public void checkSubprogramInvocationParametersHavingExpressionsAreIn(final SubprogramCall sc) {
    FormalActualList _parameters = sc.getParameters();
    boolean _tripleNotEquals = (_parameters != null);
    if (_tripleNotEquals) {
      EList<FormalActual> _variables = sc.getParameters().getVariables();
      for (final FormalActual v : _variables) {
        ParenthesizedSubexpression _expression = v.getActual().getExpression();
        boolean _tripleNotEquals_1 = (_expression != null);
        if (_tripleNotEquals_1) {
          Parameter _formal = v.getFormal();
          boolean _tripleEquals = (_formal == null);
          if (_tripleEquals) {
            this.fError("Expression subprogram parameters must have formal identifier in subprogram call f:(e).", v, 
              BLESSPackage.eINSTANCE.getSubProgramParameter_Expression(), IssueCodes.SUBPROGRAM_CALL_EXPRESSION_PARAMETER_MUST_HAVE_FORMAL);
          } else {
            CalledSubprogram _procedure = sc.getProcedure();
            boolean _tripleEquals_1 = (_procedure == null);
            if (_tripleEquals_1) {
              this.fError("Subprogram call has null procedure!", sc, 
                BLESSPackage.eINSTANCE.getSubprogramCall_Procedure(), IssueCodes.MUST_NOT_BE_NULL);
            } else {
              List<Feature> _featuresOfComponent = this._blessUtil.getFeaturesOfComponent(sc.getProcedure());
              for (final Feature p : _featuresOfComponent) {
                if ((((p instanceof Parameter) && Objects.equal(((Parameter) p), v.getFormal())) && (!((Parameter) p).isIn()))) {
                  this.fError("Expression subprogram parameters must have \"in\" direction.", v, 
                    BLESSPackage.eINSTANCE.getFormalActual_Actual(), IssueCodes.SUBPROGRAM_CALL_EXPRESSION_PARAMETER_MUST_HAVE_FORMAL);
                }
              }
            }
          }
        }
      }
    }
  }

  @Check(CheckType.NORMAL)
  public void checkTimeoutBehaviorTimeHasTimeUnits(final DispatchTrigger dt) {
    BehaviorTime _time = dt.getTime();
    boolean _tripleNotEquals = (_time != null);
    if (_tripleNotEquals) {
      final UnitRecord ur = this.getUnitRecord(dt.getTime());
      if ((ur == null)) {
        this.fError("No unit definition found for timeout duration.", dt, 
          BLESSPackage.eINSTANCE.getDispatchTrigger_Time(), IssueCodes.UNIT_DEFINITION_NOT_FOUND);
      }
      boolean _equals = ur.rootUnit.getName().equals("s");
      boolean _not = (!_equals);
      if (_not) {
        String _name = ur.rootUnit.getName();
        String _plus = ("Timeout dispatch trigger must have time units, but has unit \'" + _name);
        String _plus_1 = (_plus + "\'.");
        this.fError(_plus_1, dt, 
          BLESSPackage.eINSTANCE.getDispatchTrigger_Time(), IssueCodes.MUST_HAVE_TIME_UNITS);
      }
    }
  }

  @Check(CheckType.NORMAL)
  public void checkExecuteConditionsHaveNoTickAtOrCaret(final TimedExpression te) {
    EObject parent = te.eContainer();
    while (((parent != null) && (!(parent instanceof ExecuteCondition)))) {
      parent = parent.eContainer();
    }
    if ((parent instanceof ExecuteCondition)) {
      String _tick = te.getTick();
      boolean _tripleNotEquals = (_tick != null);
      if (_tripleNotEquals) {
        this.fError("Execute conditions may not have \'.", te, 
          BLESSPackage.eINSTANCE.getTimedExpression_Tick(), IssueCodes.ILLEGAL_TIME_OPERATOR);
      } else {
        boolean _isAt = te.isAt();
        if (_isAt) {
          this.fError("Execute conditions may not have @.", te, 
            BLESSPackage.eINSTANCE.getTimedExpression_At(), IssueCodes.ILLEGAL_TIME_OPERATOR);
        } else {
          boolean _isCaret = te.isCaret();
          if (_isCaret) {
            this.fError("Execute conditions may not have ^.", te, 
              BLESSPackage.eINSTANCE.getTimedExpression_Caret(), IssueCodes.ILLEGAL_TIME_OPERATOR);
          }
        }
      }
    }
  }

  @Check(CheckType.NORMAL)
  public void checkTimedExpressionNotInAssertion(final TimedExpression te) {
    boolean _inAssertion = this._blessUtil.inAssertion(te);
    boolean _not = (!_inAssertion);
    if (_not) {
      String _tick = te.getTick();
      boolean _tripleNotEquals = (_tick != null);
      if (_tripleNotEquals) {
        this.fError("Actions may not have \'.", te, 
          BLESSPackage.eINSTANCE.getTimedExpression_Tick(), IssueCodes.ILLEGAL_TIME_OPERATOR);
      } else {
        boolean _isAt = te.isAt();
        if (_isAt) {
          this.fError("Actions may not have @.", te, 
            BLESSPackage.eINSTANCE.getTimedExpression_At(), IssueCodes.ILLEGAL_TIME_OPERATOR);
        } else {
          boolean _isCaret = te.isCaret();
          if (_isCaret) {
            this.fError("Actions may not have ^.", te, 
              BLESSPackage.eINSTANCE.getTimedExpression_Caret(), IssueCodes.ILLEGAL_TIME_OPERATOR);
          }
        }
      }
    }
  }

  @Check(CheckType.NORMAL)
  public void checkOnlyOneStateKind(final BehaviorState bs) {
    int kindCount = 0;
    boolean _isInitial = bs.isInitial();
    if (_isInitial) {
      kindCount++;
    }
    boolean _isComplete = bs.isComplete();
    if (_isComplete) {
      kindCount++;
    }
    boolean _isFinal = bs.isFinal();
    if (_isFinal) {
      kindCount++;
    }
    boolean _isMode = bs.isMode();
    if (_isMode) {
      kindCount++;
    }
    if ((kindCount > 1)) {
      this.warning("State has more than one kind", bs, BLESSPackage.eINSTANCE.getStatesSection_States());
    }
  }

  @Check(CheckType.NORMAL)
  public void checkMixedModeAndCompleteStates(final BLESSSubclause sub) {
    boolean hasComplete = false;
    boolean hasMode = false;
    EList<BehaviorState> _states = sub.getStatesSection().getStates();
    for (final BehaviorState state : _states) {
      {
        boolean _isComplete = state.isComplete();
        if (_isComplete) {
          hasComplete = true;
        }
        boolean _isMode = state.isMode();
        if (_isMode) {
          hasMode = true;
        }
      }
    }
    if ((hasComplete && hasMode)) {
      this.fError("Complete states and mode states may not be used together", sub, 
        BLESSPackage.eINSTANCE.getBLESSSubclause_StatesSection());
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatTransitionsLeavingModeStatesHaveModeConditions(final BehaviorTransition bt) {
    EList<BehaviorState> _sources = bt.getSources();
    for (final BehaviorState s : _sources) {
      if ((s.isMode() && (bt.getMode() == null))) {
        String _name = s.getName();
        String _plus = ("Transition leaving mode state \'" + _name);
        String _plus_1 = (_plus + "\' must have mode condition.");
        this.fError(_plus_1, bt, 
          BLESSPackage.eINSTANCE.getBehaviorTransition_Sources());
      }
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatTransitionsWithModeConditionsLeaveModeStates(final BehaviorTransition bt) {
    ModeCondition _mode = bt.getMode();
    boolean _tripleNotEquals = (_mode != null);
    if (_tripleNotEquals) {
      EList<BehaviorState> _sources = bt.getSources();
      for (final BehaviorState s : _sources) {
        boolean _isMode = s.isMode();
        boolean _not = (!_isMode);
        if (_not) {
          String _name = s.getName();
          String _plus = ("Transitions having mode conditions must leave mode states.  \'" + _name);
          String _plus_1 = (_plus + "\' is not mode state.");
          this.fError(_plus_1, bt, 
            BLESSPackage.eINSTANCE.getBehaviorTransition_Sources());
        }
      }
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatModeStatesAreReallyModes(final StatesSection ss) {
    final List<Mode> modes = this._blessUtil.getModes(ss);
    EList<BehaviorState> _states = ss.getStates();
    for (final BehaviorState state : _states) {
      boolean _isMode = state.isMode();
      if (_isMode) {
        boolean hasMode = false;
        for (final Mode m : modes) {
          String _name = m.getName();
          String _name_1 = state.getName();
          boolean _equals = Objects.equal(_name, _name_1);
          if (_equals) {
            hasMode = true;
          }
        }
        if ((!hasMode)) {
          String _name_2 = state.getName();
          String _plus = ("Mode state \'" + _name_2);
          String _plus_1 = (_plus + "\' is not a mode of this component:");
          String _string = modes.toString();
          String _plus_2 = (_plus_1 + _string);
          this.fError(_plus_2, ss, 
            BLESSPackage.eINSTANCE.getStatesSection_St());
        }
      }
    }
  }

  @Check(CheckType.NORMAL)
  public void checkThatEventTriggerNamesASubcomponent(final EventTrigger et) {
    final ComponentClassifier subcomponent = this._blessUtil.getSubcomponentFromListOfIDs(et, et.getSub());
    if ((subcomponent == null)) {
      this.fError("Event trigger must specify a subcomponent.", et, 
        BLESSPackage.eINSTANCE.getEventTrigger_Sub());
    }
  }

  @Check(CheckType.NORMAL)
  public void checkPortNamesForCodegen(final DispatchTrigger dt) {
    PortName _port = dt.getPort();
    boolean _tripleNotEquals = (_port != null);
    if (_tripleNotEquals) {
      boolean _equalsIgnoreCase = dt.getPort().getPort().getName().equalsIgnoreCase("halt");
      if (_equalsIgnoreCase) {
        this.fWarning("\"halt\" should not be used as a port name due to code generation name conflict.", dt, BLESSPackage.eINSTANCE.getDispatchTrigger_Port());
      }
    }
  }

  public boolean isBoolean(final Type t) {
    return (t instanceof BooleanType);
  }

  public boolean isScalar(final Type t) {
    return (this.isQuantity(t) && ((QuantityType) t).isScalar());
  }

  public boolean isQuantity(final Type t) {
    return (t instanceof QuantityType);
  }

  public boolean isNull(final Type t) {
    return (t instanceof NullType);
  }

  public boolean hasNestedAt(final TimedExpression s) {
    boolean _xblockexpression = false;
    {
      EObject container = s.eContainer();
      while ((container != null)) {
        {
          if (((container instanceof TimedExpression) && ((TimedExpression) container).isAt())) {
            return true;
          }
          container = container.eContainer();
        }
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }

  public Type getType(final AssertionFunctionValue afv) {
    Type _elvis = null;
    ConditionalAssertionFunction _cexp = afv.getCexp();
    Type _type = null;
    if (_cexp!=null) {
      _type=this.getType(_cexp);
    }
    if (_type != null) {
      _elvis = _type;
    } else {
      AssertionNumericExpression _pexp = afv.getPexp();
      Type _type_1 = null;
      if (_pexp!=null) {
        _type_1=this.getType(_pexp);
      }
      _elvis = _type_1;
    }
    return _elvis;
  }

  public Type getType(final ConditionalAssertionFunction afv) {
    Type _xblockexpression = null;
    {
      final Type cafType = this.getType(IterableExtensions.<ConditionValuePair>head(afv.getCvp()).getExpression());
      EList<ConditionValuePair> _cvp = afv.getCvp();
      for (final ConditionValuePair p : _cvp) {
        boolean _sameStructuralType = this._typeUtil.sameStructuralType(cafType, this.getType(p.getExpression()));
        boolean _not = (!_sameStructuralType);
        if (_not) {
          this.fError("Mismatched expression type of condition-value pairs", p, 
            BLESSPackage.eINSTANCE.getConditionValuePair_Expression(), IssueCodes.INCOMPATIBLE_TYPES);
        }
      }
      _xblockexpression = cafType;
    }
    return _xblockexpression;
  }

  public Type getType(final PeriodShift a) {
    Type _xblockexpression = null;
    {
      Value _v = a.getV();
      if (_v!=null) {
        this.getType(_v);
      }
      IndexExpression _index_expression = a.getIndex_expression();
      Type _type = null;
      if (_index_expression!=null) {
        _type=this.getType(_index_expression);
      }
      _xblockexpression = _type;
    }
    return _xblockexpression;
  }

  public Type getType(final IndexExpression a) {
    Type _xblockexpression = null;
    {
      boolean _isWhole = this.isWhole(a.getL());
      boolean _not = (!_isWhole);
      if (_not) {
        this.fError("Terms of index expression must have index type", a, 
          BLESSPackage.eINSTANCE.getIndexExpression_L(), IssueCodes.MUST_HAVE_INDEX_TYPE);
      }
      EList<PeriodShift> _r = a.getR();
      for (final PeriodShift r : _r) {
        boolean _isWhole_1 = this.isWhole(r);
        boolean _not_1 = (!_isWhole_1);
        if (_not_1) {
          this.fError("Terms of index expression must have index type", a, 
            BLESSPackage.eINSTANCE.getIndexExpression_R(), IssueCodes.MUST_HAVE_INDEX_TYPE);
        }
      }
      _xblockexpression = this.getType(a.getL());
    }
    return _xblockexpression;
  }

  public Type getType(final UniversalQuantification a) {
    Type _xblockexpression = null;
    {
      if ((a.isWhich() && (!this.isBoolean(this.getType(a.getCondition()))))) {
        this.fError("Condition for universal quantification must have boolean type.", a, BLESSPackage.eINSTANCE.getUniversalQuantification_Condition());
      }
      boolean _isBoolean = this.isBoolean(this.getType(a.getPredicate()));
      boolean _not = (!_isBoolean);
      if (_not) {
        this.fError("Predicate for universal quantification must have boolean type.", a, BLESSPackage.eINSTANCE.getUniversalQuantification_Predicate());
      }
      _xblockexpression = this._typeUtil.booleanType();
    }
    return _xblockexpression;
  }

  public Type getType(final Predicate a) {
    return this.getType(((Expression) a));
  }

  public Type getType(final AssertionNumericExpression a) {
    return this.getType(((Expression) a));
  }

  public Type getType(final BooleanExpression a) {
    return this.getType(((Expression) a));
  }

  public Type getType(final NumericExpression a) {
    return this.getType(((Expression) a));
  }

  public Type getType(final Subexpression a) {
    return this.getType(a.getTimed_expression());
  }

  public Type getType(final TimedExpression a) {
    Type _xblockexpression = null;
    {
      if ((a.isAt() && this.hasNestedAt(a))) {
        this.fError("Nesting of time expressions (@) disallowed.", a, BLESSPackage.eINSTANCE.getTimedExpression_Time());
      }
      _xblockexpression = this.getType(a.getSubject());
    }
    return _xblockexpression;
  }

  public Type getType(final TimedSubject a) {
    Type _elvis = null;
    Type _elvis_1 = null;
    Type _elvis_2 = null;
    Type _elvis_3 = null;
    ParenthesizedSubexpression _ps = a.getPs();
    Type _type = null;
    if (_ps!=null) {
      _type=this.getType(_ps);
    }
    if (_type != null) {
      _elvis_3 = _type;
    } else {
      Value _value = a.getValue();
      Type _type_1 = null;
      if (_value!=null) {
        _type_1=this.getType(_value);
      }
      _elvis_3 = _type_1;
    }
    if (_elvis_3 != null) {
      _elvis_2 = _elvis_3;
    } else {
      ConditionalExpression _conditional = a.getConditional();
      Type _type_2 = null;
      if (_conditional!=null) {
        _type_2=this.getType(_conditional);
      }
      _elvis_2 = _type_2;
    }
    if (_elvis_2 != null) {
      _elvis_1 = _elvis_2;
    } else {
      RecordTerm _record = a.getRecord();
      Type _type_3 = null;
      if (_record!=null) {
        _type_3=this.getType(_record);
      }
      _elvis_1 = _type_3;
    }
    if (_elvis_1 != null) {
      _elvis = _elvis_1;
    } else {
      Invocation _invocation = a.getInvocation();
      Type _type_4 = null;
      if (_invocation!=null) {
        _type_4=this.getType(_invocation);
      }
      _elvis = _type_4;
    }
    return _elvis;
  }

  public Type getType(final ParenthesizedSubexpression e) {
    Type _xblockexpression = null;
    {
      if ((((e.getExpression() != null) && (e.getT() != null)) && (e.getF() != null))) {
        boolean _isBoolean = this.isBoolean(this.getType(e.getExpression()));
        boolean _not = (!_isBoolean);
        if (_not) {
          this.fError("must have boolean type in conditional expression", e, BLESSPackage.eINSTANCE.getParenthesizedSubexpression_Expression());
        }
        boolean _sameStructuralType = this._typeUtil.sameStructuralType(this.getType(e.getT()), this.getType(e.getF()));
        boolean _not_1 = (!_sameStructuralType);
        if (_not_1) {
          this.fError("both alternatives in conditional expression must have same type", e, BLESSPackage.eINSTANCE.getParenthesizedSubexpression_T());
        }
        return this.getType(e.getT());
      }
      CaseExpression _caseexpression = e.getCaseexpression();
      boolean _tripleNotEquals = (_caseexpression != null);
      if (_tripleNotEquals) {
        return this.getType(e.getCaseexpression());
      }
      _xblockexpression = this.getType(e.getExpression());
    }
    return _xblockexpression;
  }

  public Type getType(final CaseExpression e) {
    Type _xblockexpression = null;
    {
      final Type t = this.getType(IterableExtensions.<CaseChoice>head(e.getCc()).getExp());
      EList<CaseChoice> _cc = e.getCc();
      for (final CaseChoice c : _cc) {
        {
          boolean _sameStructuralType = this._typeUtil.sameStructuralType(t, this.getType(c.getExp()));
          boolean _not = (!_sameStructuralType);
          if (_not) {
            this.fError("alternatives in case expression must have same type", c, BLESSPackage.eINSTANCE.getCaseChoice_Exp());
          }
          boolean _isBoolean = this.isBoolean(this.getType(c.getBe()));
          boolean _not_1 = (!_isBoolean);
          if (_not_1) {
            this.fError("must be boolean expression in case choice", c, BLESSPackage.eINSTANCE.getCaseChoice_Be());
          }
        }
      }
      _xblockexpression = t;
    }
    return _xblockexpression;
  }

  public Type getType(final Value e) {
    String _timeout = e.getTimeout();
    boolean _tripleNotEquals = (_timeout != null);
    if (_tripleNotEquals) {
      return this._typeUtil.booleanType();
    }
    if (((e.getNow() != null) || (e.getTops() != null))) {
      final QuantityType qt = BLESSFactory.eINSTANCE.createQuantityType();
      qt.setUnit(this._blessIndex.getTimeUnit(e));
      return qt;
    }
    ValueName _value_name = e.getValue_name();
    boolean _tripleNotEquals_1 = (_value_name != null);
    if (_tripleNotEquals_1) {
      final Type t = this.getType(e.getValue_name());
      if ((t == null)) {
        this.fError("null type for value", e, BLESSPackage.eINSTANCE.getValue_Value_name());
      }
      return t;
    }
    Constant _constant = e.getConstant();
    boolean _tripleNotEquals_2 = (_constant != null);
    if (_tripleNotEquals_2) {
      final Type t_1 = this.getType(e.getConstant());
      if ((t_1 == null)) {
        this.fError("null type for constant", e, BLESSPackage.eINSTANCE.getValue_Constant());
      }
      return t_1;
    }
    EnumerationValue _enum_val = e.getEnum_val();
    boolean _tripleNotEquals_3 = (_enum_val != null);
    if (_tripleNotEquals_3) {
      return e.getEnum_val().getEnumeration_type().getType();
    }
    return null;
  }

  public Type getType(final ConditionalExpression e) {
    Type _xblockexpression = null;
    {
      boolean _isBoolean = this.isBoolean(this.getType(e.getPred()));
      boolean _not = (!_isBoolean);
      if (_not) {
        this.fError("Discriminator (if e) of conditional expression must be boolean.", e, BLESSPackage.eINSTANCE.getConditionalExpression_Pred());
      }
      boolean _sameStructuralType = this._typeUtil.sameStructuralType(this.getType(e.getT()), this.getType(e.getF()));
      boolean _not_1 = (!_sameStructuralType);
      if (_not_1) {
        this.fError("Choices of conditional expression  (then x else y) must be have same structural type.", e, BLESSPackage.eINSTANCE.getConditionalExpression_T(), IssueCodes.INCOMPATIBLE_TYPES);
      }
      final UnitRecord tUnitRecord = this.getUnitRecord(e.getT());
      if ((tUnitRecord == null)) {
        this.fError("\'then\' branch of conditional expression has indeterminate units", e, 
          BLESSPackage.eINSTANCE.getConditionalExpression_T(), IssueCodes.INDETERMINATE_UNITS);
      }
      final UnitRecord fUnitRecord = this.getUnitRecord(e.getF());
      if ((fUnitRecord == null)) {
        this.fError("\'else\' branch of conditional expression has indeterminate units", e, 
          BLESSPackage.eINSTANCE.getConditionalExpression_F(), IssueCodes.INDETERMINATE_UNITS);
      }
      if ((((tUnitRecord != null) && (fUnitRecord != null)) && (!tUnitRecord.matchTopAndBottom(fUnitRecord)))) {
        String _string = this.getUnitRecord(e.getT()).toString();
        String _plus = ("Choices of conditional expression (then x else y) must have same root units \'" + _string);
        String _plus_1 = (_plus + 
          "\' is not \'");
        String _string_1 = this.getUnitRecord(e.getF()).toString();
        String _plus_2 = (_plus_1 + _string_1);
        this.fError(_plus_2, e, 
          BLESSPackage.eINSTANCE.getConditionalExpression_F(), IssueCodes.MISMATCHED_UNITS);
      }
      _xblockexpression = this.getType(e.getT());
    }
    return _xblockexpression;
  }

  public Type getType(final RecordTerm e) {
    return e.getRecord_type().getType();
  }

  public Type getType(final Invocation e) {
    boolean _isPred = e.getLabel().isPred();
    if (_isPred) {
      return this._typeUtil.booleanType();
    }
    boolean _isFunc = e.getLabel().isFunc();
    if (_isFunc) {
      return this._typeUtil.getType(e.getLabel().getTod());
    }
    boolean _isEnumer = e.getLabel().isEnumer();
    if (_isEnumer) {
      return this._typeUtil.booleanType();
    }
    return null;
  }

  public Type getType(final ExistentialQuantification a) {
    Type _xblockexpression = null;
    {
      if ((a.isWhich() && (!this.isBoolean(this.getType(a.getCondition()))))) {
        this.fError("Condition for existential quantification must have boolean type.", a, BLESSPackage.eINSTANCE.getExistentialQuantification_Condition());
      }
      boolean _isBoolean = this.isBoolean(this.getType(a.getPredicate()));
      boolean _not = (!_isBoolean);
      if (_not) {
        this.fError("Predicate for existential quantification must have boolean type.", a, BLESSPackage.eINSTANCE.getExistentialQuantification_Predicate());
      }
      _xblockexpression = this._typeUtil.booleanType();
    }
    return _xblockexpression;
  }

  public Type getType(final SumQuantification a) {
    Type _xblockexpression = null;
    {
      EList<Variable> _lv = a.getVariables().getLv();
      for (final Variable v : _lv) {
        boolean _isWhole = this.isWhole(v);
        boolean _not = (!_isWhole);
        if (_not) {
          this.fError("Logic variables of summing quantification must be whole numbers", v, BLESSPackage.eINSTANCE.getVariable_Tod());
        }
      }
      if ((a.isWhich() && (!this.isBoolean(this.getType(a.getCondition()))))) {
        this.fError("Condition for summing quantification must have boolean type.", a, BLESSPackage.eINSTANCE.getSumQuantification_Condition());
      }
      boolean _equals = a.getRange().getSym().equals("..");
      boolean _not_1 = (!_equals);
      if (_not_1) {
        this.fError("Range for summing quantification must be closed (..).", 
          a.getRange(), BLESSPackage.eINSTANCE.getRange_Sym());
      }
      boolean _isWhole_1 = this.isWhole(a.getRange().getLower_bound());
      boolean _not_2 = (!_isWhole_1);
      if (_not_2) {
        this.fError("Range lower bound for summing quantification must be whole number.", 
          a.getRange(), BLESSPackage.eINSTANCE.getRange_Lower_bound());
      }
      boolean _isWhole_2 = this.isWhole(a.getRange().getUpper_bound());
      boolean _not_3 = (!_isWhole_2);
      if (_not_3) {
        this.fError("Range upper bound for summing quantification must be whole number.", 
          a.getRange(), BLESSPackage.eINSTANCE.getRange_Upper_bound());
      }
      _xblockexpression = this.getType(a.getNumeric_expression());
    }
    return _xblockexpression;
  }

  public Type getType(final ProductQuantification a) {
    Type _xblockexpression = null;
    {
      if ((a.isWhich() && (!this.isBoolean(this.getType(a.getCondition()))))) {
        this.fError("Condition for product quantification must have boolean type.", a, BLESSPackage.eINSTANCE.getProductQuantification_Condition());
      }
      boolean _equals = a.getRange().getSym().equals("..");
      boolean _not = (!_equals);
      if (_not) {
        this.fError("Range for product quantification must be closed (..).", 
          a.getRange(), BLESSPackage.eINSTANCE.getRange_Sym());
      }
      boolean _isWhole = this.isWhole(a.getRange().getLower_bound());
      boolean _not_1 = (!_isWhole);
      if (_not_1) {
        this.fError("Range lower bound for product quantification must be whole number.", 
          a.getRange(), BLESSPackage.eINSTANCE.getRange_Lower_bound());
      }
      boolean _isWhole_1 = this.isWhole(a.getRange().getUpper_bound());
      boolean _not_2 = (!_isWhole_1);
      if (_not_2) {
        this.fError("Range upper bound for product quantification must be whole number.", 
          a.getRange(), BLESSPackage.eINSTANCE.getRange_Upper_bound());
      }
      boolean _isScalar = this.isScalar(this.getType(a.getNumeric_expression()));
      boolean _not_3 = (!_isScalar);
      if (_not_3) {
        this.fError("Numeric expression for product quantification must be scalar.", a, BLESSPackage.eINSTANCE.getProductQuantification_Numeric_expression());
      }
      _xblockexpression = this.getType(a.getNumeric_expression());
    }
    return _xblockexpression;
  }

  public Type getType(final CountingQuantification a) {
    Type _xblockexpression = null;
    {
      if ((a.isWhich() && (!this.isBoolean(this.getType(a.getCondition()))))) {
        this.fError("Condition for counting quantification must have boolean type.", a, BLESSPackage.eINSTANCE.getCountingQuantification_Condition());
      }
      boolean _equals = a.getRange().getSym().equals("..");
      boolean _not = (!_equals);
      if (_not) {
        this.fError("Range for counting quantification must be closed (..).", 
          a.getRange(), BLESSPackage.eINSTANCE.getRange_Sym());
      }
      boolean _isBoolean = this.isBoolean(this.getType(a.getCounted()));
      boolean _not_1 = (!_isBoolean);
      if (_not_1) {
        this.fError("Boolean-typed expression required for counting quantification.", a, BLESSPackage.eINSTANCE.getCountingQuantification_Counted());
      }
      _xblockexpression = this._typeUtil.makeWholeQuantity();
    }
    return _xblockexpression;
  }

  public Type getType(final Expression e) {
    if (((e.getSym() != null) && e.getSym().equals("iff"))) {
      Disjunction _l = e.getL();
      Type _type = null;
      if (_l!=null) {
        _type=this.getType(_l);
      }
      boolean _isBoolean = this.isBoolean(_type);
      boolean _not = (!_isBoolean);
      if (_not) {
        this.fError("Operands of if-and-only-in must be boolean.", e, BLESSPackage.eINSTANCE.getExpression_L(), IssueCodes.TYPE_MUST_BE_BOOLEAN);
      }
      Disjunction _r = e.getR();
      Type _type_1 = null;
      if (_r!=null) {
        _type_1=this.getType(_r);
      }
      boolean _isBoolean_1 = this.isBoolean(_type_1);
      boolean _not_1 = (!_isBoolean_1);
      if (_not_1) {
        this.fError("Operands of if-and-only-in must be boolean.", e, BLESSPackage.eINSTANCE.getExpression_R(), IssueCodes.TYPE_MUST_BE_BOOLEAN);
      }
      return this._typeUtil.booleanType();
    } else {
      if (((e.getSym() != null) && e.getSym().equals("implies"))) {
        Disjunction _l_1 = e.getL();
        Type _type_2 = null;
        if (_l_1!=null) {
          _type_2=this.getType(_l_1);
        }
        boolean _isBoolean_2 = this.isBoolean(_type_2);
        boolean _not_2 = (!_isBoolean_2);
        if (_not_2) {
          this.fError("Premise of implication must be boolean.", e, BLESSPackage.eINSTANCE.getExpression_L(), IssueCodes.TYPE_MUST_BE_BOOLEAN);
        }
        Disjunction _r_1 = e.getR();
        Type _type_3 = null;
        if (_r_1!=null) {
          _type_3=this.getType(_r_1);
        }
        boolean _isBoolean_3 = this.isBoolean(_type_3);
        boolean _not_3 = (!_isBoolean_3);
        if (_not_3) {
          this.fError("Consequent of implication must be boolean.", e, BLESSPackage.eINSTANCE.getExpression_R(), IssueCodes.TYPE_MUST_BE_BOOLEAN);
        }
        return this._typeUtil.booleanType();
      }
    }
    UniversalQuantification _all = e.getAll();
    boolean _tripleNotEquals = (_all != null);
    if (_tripleNotEquals) {
      return this.getType(e.getAll());
    }
    ExistentialQuantification _exists = e.getExists();
    boolean _tripleNotEquals_1 = (_exists != null);
    if (_tripleNotEquals_1) {
      return this.getType(e.getExists());
    }
    SumQuantification _sum = e.getSum();
    boolean _tripleNotEquals_2 = (_sum != null);
    if (_tripleNotEquals_2) {
      return this.getType(e.getSum());
    }
    ProductQuantification _product = e.getProduct();
    boolean _tripleNotEquals_3 = (_product != null);
    if (_tripleNotEquals_3) {
      return this.getType(e.getProduct());
    }
    CountingQuantification _numberof = e.getNumberof();
    boolean _tripleNotEquals_4 = (_numberof != null);
    if (_tripleNotEquals_4) {
      return this.getType(e.getNumberof());
    }
    Disjunction _l_2 = e.getL();
    boolean _tripleNotEquals_5 = (_l_2 != null);
    if (_tripleNotEquals_5) {
      return this.getType(e.getL());
    }
    return null;
  }

  public Type getType(final Conjunction e) {
    Type _xblockexpression = null;
    {
      String _sym = e.getSym();
      boolean _tripleNotEquals = (_sym != null);
      if (_tripleNotEquals) {
        boolean _isBoolean = this.isBoolean(this.getType(e.getL()));
        boolean _not = (!_isBoolean);
        if (_not) {
          this.fError("Operands of conjunction must be boolean.", e, BLESSPackage.eINSTANCE.getConjunction_L(), IssueCodes.TYPE_MUST_BE_BOOLEAN);
        }
        EList<Relation> _r = e.getR();
        for (final Relation r : _r) {
          boolean _isBoolean_1 = this.isBoolean(this.getType(r));
          boolean _not_1 = (!_isBoolean_1);
          if (_not_1) {
            this.fError("Operands of conjunction must be boolean.", e, BLESSPackage.eINSTANCE.getConjunction_R(), e.getR().indexOf(r));
          }
        }
      }
      _xblockexpression = this.getType(e.getL());
    }
    return _xblockexpression;
  }

  public Type getType(final Disjunction e) {
    Type _xblockexpression = null;
    {
      String _sym = e.getSym();
      boolean _tripleNotEquals = (_sym != null);
      if (_tripleNotEquals) {
        boolean _isBoolean = this.isBoolean(this.getType(e.getL()));
        boolean _not = (!_isBoolean);
        if (_not) {
          this.fError("Operands of disjunction must be boolean.", e, BLESSPackage.eINSTANCE.getDisjunction_L(), IssueCodes.TYPE_MUST_BE_BOOLEAN);
        }
        EList<Conjunction> _r = e.getR();
        for (final Conjunction r : _r) {
          boolean _isBoolean_1 = this.isBoolean(this.getType(r));
          boolean _not_1 = (!_isBoolean_1);
          if (_not_1) {
            this.fError("Operands of disjunction must be boolean.", e, BLESSPackage.eINSTANCE.getDisjunction_R(), e.getR().indexOf(r));
          }
        }
      }
      _xblockexpression = this.getType(e.getL());
    }
    return _xblockexpression;
  }

  public Type getType(final Relation e) {
    Type _xblockexpression = null;
    {
      String _sym = e.getSym();
      boolean _tripleNotEquals = (_sym != null);
      if (_tripleNotEquals) {
        boolean _isBoolean = this.isBoolean(this.getType(e.getL()));
        if (_isBoolean) {
          String _sym_1 = e.getSym();
          String _plus = ("Operands of " + _sym_1);
          String _plus_1 = (_plus + " must not be boolean.  Use \'iff\' instead of =");
          this.fError(_plus_1, e, BLESSPackage.eINSTANCE.getRelation_L(), IssueCodes.MUST_NOT_BE_BOOLEAN);
        }
        boolean _isBoolean_1 = this.isBoolean(this.getType(e.getR()));
        if (_isBoolean_1) {
          String _sym_2 = e.getSym();
          String _plus_2 = ("Operands of " + _sym_2);
          String _plus_3 = (_plus_2 + " must not be boolean.  Use \'iff\' instead of =");
          this.fError(_plus_3, e, BLESSPackage.eINSTANCE.getRelation_R(), IssueCodes.MUST_NOT_BE_BOOLEAN);
        }
        if ((this.isNull(this.getType(e.getR())) || this.isNull(this.getType(e.getL())))) {
          return this._typeUtil.booleanType();
        }
        if (((this.isQuantity(this.getType(e.getL())) && this.isQuantity(this.getType(e.getR()))) && (!this.getUnitRecord(e.getL()).matchTopAndBottom(this.getUnitRecord(e.getR()))))) {
          String _sym_3 = e.getSym();
          String _plus_4 = ("Operands of " + _sym_3);
          String _plus_5 = (_plus_4 + " must have root base units \'");
          String _string = this.getUnitRecord(e.getL()).toString();
          String _plus_6 = (_plus_5 + _string);
          String _plus_7 = (_plus_6 + 
            "\' is not \'");
          String _string_1 = this.getUnitRecord(e.getR()).toString();
          String _plus_8 = (_plus_7 + _string_1);
          this.fError(_plus_8, e, BLESSPackage.eINSTANCE.getRelation_Sym(), IssueCodes.MISMATCHED_UNITS);
        } else {
          boolean _sameStructuralType = this._typeUtil.sameStructuralType(this.getType(e.getL()), this.getType(e.getR()));
          boolean _not = (!_sameStructuralType);
          if (_not) {
            String _sym_4 = e.getSym();
            String _plus_9 = ("Operands of " + _sym_4);
            String _plus_10 = (_plus_9 + " must be have compatible types.");
            this.fError(_plus_10, e, BLESSPackage.eINSTANCE.getRelation_Sym(), IssueCodes.INCOMPATIBLE_TYPES);
          }
        }
        return this._typeUtil.booleanType();
      }
      String _in = e.getIn();
      boolean _tripleNotEquals_1 = (_in != null);
      if (_tripleNotEquals_1) {
        boolean _isQuantity = this.isQuantity(this.getType(e.getL()));
        boolean _not_1 = (!_isQuantity);
        if (_not_1) {
          this.fError("lhs of \'in\' must be quantity type.", e, BLESSPackage.eINSTANCE.getRelation_L(), IssueCodes.MUST_BE_QUANTITY);
        }
        boolean _isQuantity_1 = this.isQuantity(this.getType(e.getRange().getLower_bound()));
        boolean _not_2 = (!_isQuantity_1);
        if (_not_2) {
          this.fError("Lower bound of range must be have quantity type.", 
            e.getRange(), BLESSPackage.eINSTANCE.getRange_Lower_bound(), IssueCodes.MUST_BE_QUANTITY);
        } else {
          boolean _matchTopAndBottom = this.getUnitRecord(e.getL()).matchTopAndBottom(this.getUnitRecord(e.getRange().getLower_bound()));
          boolean _not_3 = (!_matchTopAndBottom);
          if (_not_3) {
            String _string_2 = this.getUnitRecord(e.getL()).toString();
            String _plus_11 = ("Lower bound of range must have same root units as subject \'" + _string_2);
            String _plus_12 = (_plus_11 + 
              "\' is not \'");
            String _string_3 = this.getUnitRecord(e.getRange().getLower_bound()).toString();
            String _plus_13 = (_plus_12 + _string_3);
            this.fError(_plus_13, e, BLESSPackage.eINSTANCE.getRange_Lower_bound(), IssueCodes.MISMATCHED_UNITS);
          }
        }
        boolean _isQuantity_2 = this.isQuantity(this.getType(e.getRange().getUpper_bound()));
        boolean _not_4 = (!_isQuantity_2);
        if (_not_4) {
          this.fError("Upper bound of range must be have quantity type.", 
            e.getRange(), BLESSPackage.eINSTANCE.getRange_Upper_bound(), IssueCodes.MUST_BE_QUANTITY);
        } else {
          boolean _matchTopAndBottom_1 = this.getUnitRecord(e.getL()).matchTopAndBottom(this.getUnitRecord(e.getRange().getUpper_bound()));
          boolean _not_5 = (!_matchTopAndBottom_1);
          if (_not_5) {
            String _string_4 = this.getUnitRecord(e.getL()).toString();
            String _plus_14 = ("Upper bound of range must have same root units as subject \'" + _string_4);
            String _plus_15 = (_plus_14 + 
              "\' is not \'");
            String _string_5 = this.getUnitRecord(e.getRange().getUpper_bound()).toString();
            String _plus_16 = (_plus_15 + _string_5);
            this.fError(_plus_16, e, BLESSPackage.eINSTANCE.getRange_Upper_bound(), IssueCodes.MISMATCHED_UNITS);
          }
        }
        return this._typeUtil.booleanType();
      }
      _xblockexpression = this.getType(e.getL());
    }
    return _xblockexpression;
  }

  public Type getType(final Exp e) {
    Type _xblockexpression = null;
    {
      Subexpression _r = e.getR();
      boolean _tripleNotEquals = (_r != null);
      if (_tripleNotEquals) {
        Type _type = this.getType(e.getL());
        boolean _not = (!(_type instanceof QuantityType));
        if (_not) {
          this.fError("Operands of ** must be have same structural type.", e, BLESSPackage.eINSTANCE.getExp_L(), IssueCodes.MUST_BE_QUANTITY);
        }
        Type _type_1 = this.getType(e.getR());
        boolean _not_1 = (!(_type_1 instanceof QuantityType));
        if (_not_1) {
          this.fError("Operands of ** must be have same structural type.", e, BLESSPackage.eINSTANCE.getExp_R(), IssueCodes.MUST_BE_QUANTITY);
        }
      }
      _xblockexpression = this.getType(e.getL());
    }
    return _xblockexpression;
  }

  public Type getType(final MultDiv e) {
    Type _xblockexpression = null;
    {
      String _sym = e.getSym();
      boolean _tripleNotEquals = (_sym != null);
      if (_tripleNotEquals) {
        Type _type = this.getType(e.getL());
        boolean _not = (!(_type instanceof QuantityType));
        if (_not) {
          String _sym_1 = e.getSym();
          String _plus = ("Operands of " + _sym_1);
          String _plus_1 = (_plus + " must be have quantity type.");
          this.fError(_plus_1, e, BLESSPackage.eINSTANCE.getMultDiv_L(), IssueCodes.MUST_BE_QUANTITY);
        }
        EList<Exp> _r = e.getR();
        for (final Exp r : _r) {
          Type _type_1 = this.getType(r);
          boolean _not_1 = (!(_type_1 instanceof QuantityType));
          if (_not_1) {
            String _sym_2 = e.getSym();
            String _plus_2 = ("Operands of " + _sym_2);
            String _plus_3 = (_plus_2 + " must be have quantity type.");
            this.fError(_plus_3, e, BLESSPackage.eINSTANCE.getMultDiv_R(), e.getR().indexOf(r));
          }
        }
      }
      _xblockexpression = this.getType(e.getL());
    }
    return _xblockexpression;
  }

  public Type getType(final AddSub e) {
    Type _xblockexpression = null;
    {
      String _sym = e.getSym();
      boolean _tripleNotEquals = (_sym != null);
      if (_tripleNotEquals) {
        Type _type = this.getType(e.getL());
        boolean _not = (!(_type instanceof QuantityType));
        if (_not) {
          String _sym_1 = e.getSym();
          String _plus = ("Operands of " + _sym_1);
          String _plus_1 = (_plus + " must be have same structural type.");
          this.fError(_plus_1, e, BLESSPackage.eINSTANCE.getAddSub_L(), IssueCodes.MUST_BE_QUANTITY);
        }
        EList<MultDiv> _r = e.getR();
        for (final MultDiv r : _r) {
          Type _type_1 = this.getType(r);
          boolean _not_1 = (!(_type_1 instanceof QuantityType));
          if (_not_1) {
            String _sym_2 = e.getSym();
            String _plus_2 = ("Operands of " + _sym_2);
            String _plus_3 = (_plus_2 + " must be have same structural type.");
            this.fError(_plus_3, e, BLESSPackage.eINSTANCE.getAddSub_R(), e.getR().indexOf(r));
          }
        }
      }
      _xblockexpression = this.getType(e.getL());
    }
    return _xblockexpression;
  }

  public Type getType(final ValueName a) {
    Type _xblockexpression = null;
    {
      if ((a.isFresh() || a.isUpdated())) {
        return this._typeUtil.booleanType();
      }
      boolean _isCount = a.isCount();
      if (_isCount) {
        return this._typeUtil.makeWholeQuantity();
      }
      NamedElement _id = a.getId();
      if ((_id instanceof ForallVariable)) {
        return this._typeUtil.makeWholeQuantity();
      }
      NamedElement _id_1 = a.getId();
      if ((_id_1 instanceof Variable)) {
        NamedElement _id_2 = a.getId();
        final Variable aid = ((Variable) _id_2);
        final Type nameRootType = this._typeUtil.getType(aid.getTod());
        boolean _isLb = a.isLb();
        if (_isLb) {
          if ((!(nameRootType instanceof ArrayType))) {
            String _name = aid.getName();
            String _plus = ("Variable name \'" + _name);
            String _plus_1 = (_plus + "\' has array index, but it\'s type is not array");
            this.fError(_plus_1, a, 
              BLESSPackage.eINSTANCE.getValueName_Id(), IssueCodes.TYPE_NOT_ARRAY);
          } else {
            int _size = a.getArray_index().size();
            int _size_1 = ((ArrayType) nameRootType).getArray_ranges().getRange().size();
            boolean _tripleNotEquals = (_size != _size_1);
            if (_tripleNotEquals) {
              String _name_1 = aid.getName();
              String _plus_2 = ("Variable name \'" + _name_1);
              String _plus_3 = (_plus_2 + 
                "\' must have as many array indices, as the dimension of its array type");
              this.fError(_plus_3, IterableExtensions.<IndexExpressionOrRange>last(a.getArray_index()), 
                BLESSPackage.eINSTANCE.getValueName_Array_index(), IssueCodes.INDICES_DONT_MATCH_ARRAY_DIMENSION);
            }
          }
          boolean _isDot = a.isDot();
          boolean _not = (!_isDot);
          if (_not) {
            return this._typeUtil.getType(((ArrayType) nameRootType).getTyp());
          } else {
            return this.getType(a.getPn(), this._typeUtil.getType(((ArrayType) nameRootType).getTyp()));
          }
        }
        boolean _isDot_1 = a.isDot();
        boolean _not_1 = (!_isDot_1);
        if (_not_1) {
          return nameRootType;
        } else {
          return this.getType(a.getPn(), nameRootType);
        }
      }
      NamedElement _id_3 = a.getId();
      if ((_id_3 instanceof GhostVariable)) {
        NamedElement _id_4 = a.getId();
        final GhostVariable aid_1 = ((GhostVariable) _id_4);
        final Type nameRootType_1 = this._typeUtil.getType(aid_1.getTod());
        boolean _isLb_1 = a.isLb();
        if (_isLb_1) {
          if ((!(nameRootType_1 instanceof ArrayType))) {
            String _name_2 = aid_1.getName();
            String _plus_4 = ("Ghost Variable name \'" + _name_2);
            String _plus_5 = (_plus_4 + "\' has array index, but it\'s type is not array");
            this.fError(_plus_5, a, 
              BLESSPackage.eINSTANCE.getValueName_Id(), IssueCodes.TYPE_NOT_ARRAY);
          } else {
            int _size_2 = a.getArray_index().size();
            int _size_3 = ((ArrayType) nameRootType_1).getArray_ranges().getRange().size();
            boolean _tripleNotEquals_1 = (_size_2 != _size_3);
            if (_tripleNotEquals_1) {
              String _name_3 = aid_1.getName();
              String _plus_6 = ("Ghost Variable name \'" + _name_3);
              String _plus_7 = (_plus_6 + 
                "\' must have as many array indices, as the dimension of its array type");
              this.fError(_plus_7, IterableExtensions.<IndexExpressionOrRange>last(a.getArray_index()), 
                BLESSPackage.eINSTANCE.getValueName_Array_index(), IssueCodes.INDICES_DONT_MATCH_ARRAY_DIMENSION);
            }
          }
          boolean _isDot_2 = a.isDot();
          boolean _not_2 = (!_isDot_2);
          if (_not_2) {
            return this._typeUtil.getType(((ArrayType) nameRootType_1).getTyp());
          } else {
            return this.getType(a.getPn(), this._typeUtil.getType(((ArrayType) nameRootType_1).getTyp()));
          }
        }
        boolean _isDot_3 = a.isDot();
        boolean _not_3 = (!_isDot_3);
        if (_not_3) {
          return nameRootType_1;
        } else {
          return this.getType(a.getPn(), nameRootType_1);
        }
      }
      NamedElement _id_5 = a.getId();
      if ((_id_5 instanceof Feature)) {
        NamedElement _id_6 = a.getId();
        final Feature aid_2 = ((Feature) _id_6);
        NamedElement _id_7 = a.getId();
        final Type featureType = this.getType(((Feature) _id_7));
        if ((featureType == null)) {
          this.fError(("BLESS::Typed properties of data components used as feature types must" + 
            " be a quantity, or the identifier of a type declared in a typedef annex library.  \""), a, 
            BLESSPackage.eINSTANCE.getValueName_Id(), IssueCodes.FEATURE_TYPED_ERROR);
          return this._typeUtil.booleanType();
        }
        boolean _isLb_2 = a.isLb();
        if (_isLb_2) {
          if ((!(featureType instanceof ArrayType))) {
            String _name_4 = aid_2.getName();
            String _plus_8 = ("Feature name \'" + _name_4);
            String _plus_9 = (_plus_8 + "\' has array index, but it\'s type is not array");
            this.fError(_plus_9, a, 
              BLESSPackage.eINSTANCE.getValueName_Id(), IssueCodes.TYPE_NOT_ARRAY);
          } else {
            int _size_4 = a.getArray_index().size();
            int _size_5 = ((ArrayType) featureType).getArray_ranges().getRange().size();
            boolean _tripleNotEquals_2 = (_size_4 != _size_5);
            if (_tripleNotEquals_2) {
              String _name_5 = aid_2.getName();
              String _plus_10 = ("Feature name \'" + _name_5);
              String _plus_11 = (_plus_10 + 
                "\' must have as many array indices, as the dimension of its array type");
              this.fError(_plus_11, IterableExtensions.<IndexExpressionOrRange>last(a.getArray_index()), 
                BLESSPackage.eINSTANCE.getValueName_Array_index(), IssueCodes.INDICES_DONT_MATCH_ARRAY_DIMENSION);
            }
          }
          boolean _isDot_4 = a.isDot();
          boolean _not_4 = (!_isDot_4);
          if (_not_4) {
            return this._typeUtil.getType(((ArrayType) featureType).getTyp());
          } else {
            return this.getType(a.getPn(), this._typeUtil.getType(((ArrayType) featureType).getTyp()));
          }
        }
        boolean _isDot_5 = a.isDot();
        boolean _not_5 = (!_isDot_5);
        if (_not_5) {
          return featureType;
        } else {
          return this.getType(a.getPn(), featureType);
        }
      }
      Type _xifexpression = null;
      NamedElement _id_8 = a.getId();
      if ((_id_8 instanceof SubprogramSubcomponent)) {
        Type _xblockexpression_1 = null;
        {
          NamedElement _id_9 = a.getId();
          final SubprogramSubcomponent sub = ((SubprogramSubcomponent) _id_9);
          SubprogramSubcomponentType _subprogramSubcomponentType = sub.getSubprogramSubcomponentType();
          final SubprogramTypeImpl st = ((SubprogramTypeImpl) _subprogramSubcomponentType);
          EList<Parameter> _ownedParameters = st.getOwnedParameters();
          for (final Parameter feat : _ownedParameters) {
            if (((!Objects.equal(feat, IterableExtensions.<Parameter>last(st.getOwnedParameters()))) && ((Parameter) feat).isOut())) {
              String _name_6 = a.getId().getName();
              String _plus_12 = ("Subprogram \'" + _name_6);
              String _plus_13 = (_plus_12 + " feature \'");
              String _plus_14 = (_plus_13 + 
                "\' must be \'in\' parameter");
              this.fError(_plus_14, a, 
                BLESSPackage.eINSTANCE.getValueName_Id(), IssueCodes.SUBPROGRAMS_USED_AS_FUNCTIONS);
            }
          }
          final Parameter outParameter = IterableExtensions.<Parameter>last(st.getOwnedParameters());
          boolean _isOut = ((Parameter) outParameter).isOut();
          boolean _not_6 = (!_isOut);
          if (_not_6) {
            String _name_7 = a.getId().getName();
            String _plus_15 = ("Subprogram \'" + _name_7);
            String _plus_16 = (_plus_15 + " feature \'");
            String _name_8 = outParameter.getName();
            String _plus_17 = (_plus_16 + _name_8);
            String _plus_18 = (_plus_17 + 
              "\' must be \'in\' parameter");
            this.fError(_plus_18, a, 
              BLESSPackage.eINSTANCE.getValueName_Id(), IssueCodes.SUBPROGRAMS_USED_AS_FUNCTIONS);
          }
          _xblockexpression_1 = this.getType(outParameter);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public Type getType(final Iterable<PartialName> pn, final Type typ) {
    Type _xblockexpression = null;
    {
      if ((typ instanceof RecordType)) {
        boolean _isVariant = ((RecordType) typ).isVariant();
        if (_isVariant) {
          this.fWarning("Using variant/union types requires run-time type checks which may not be enforced", IterableExtensions.<PartialName>head(pn), 
            BLESSPackage.eINSTANCE.getPartialName_Record_id(), IssueCodes.VARIANT_TYPES_DISCOURAGED);
        }
        EList<RecordField> _fields = ((RecordType) typ).getFields();
        for (final RecordField field : _fields) {
          boolean _equals = field.getLabel().equals(IterableExtensions.<PartialName>head(pn).getRecord_id());
          if (_equals) {
            if (((IterableExtensions.size(pn) == 1) && (!IterableExtensions.<PartialName>head(pn).isLb()))) {
              return this._typeUtil.getType(field.getTyp());
            } else {
              boolean _isLb = IterableExtensions.<PartialName>head(pn).isLb();
              if (_isLb) {
                final Type fieldType = this._typeUtil.getType(field.getTyp());
                if ((!(fieldType instanceof ArrayType))) {
                  String _record_id = IterableExtensions.<PartialName>head(pn).getRecord_id();
                  String _plus = ("Variable field \'" + _record_id);
                  String _plus_1 = (_plus + 
                    "\' has array index, but it\'s type is not array");
                  this.fError(_plus_1, IterableExtensions.<PartialName>head(pn), 
                    BLESSPackage.eINSTANCE.getPartialName_Record_id(), IssueCodes.TYPE_NOT_ARRAY);
                } else {
                  int _size = IterableExtensions.<PartialName>head(pn).getArray_index().size();
                  int _size_1 = ((ArrayType) fieldType).getArray_ranges().getRange().size();
                  boolean _tripleNotEquals = (_size != _size_1);
                  if (_tripleNotEquals) {
                    String _record_id_1 = IterableExtensions.<PartialName>head(pn).getRecord_id();
                    String _plus_2 = ("Variable field \'" + _record_id_1);
                    String _plus_3 = (_plus_2 + 
                      "\' must have as many array indices, as the dimension of its array type");
                    this.fError(_plus_3, 
                      IterableExtensions.<IndexExpressionOrRange>last(IterableExtensions.<PartialName>head(pn).getArray_index()), BLESSPackage.eINSTANCE.getValueName_Array_index(), 
                      IssueCodes.INDICES_DONT_MATCH_ARRAY_DIMENSION);
                  }
                }
                int _size_2 = IterableExtensions.size(pn);
                boolean _tripleEquals = (_size_2 == 1);
                if (_tripleEquals) {
                  return ((ArrayType) fieldType);
                } else {
                  return this.getType(IterableExtensions.<PartialName>tail(pn), this._typeUtil.getType(((ArrayType) fieldType).getTyp()));
                }
              } else {
                return this.getType(IterableExtensions.<PartialName>tail(pn), this._typeUtil.getType(field.getTyp()));
              }
            }
          }
        }
      }
      _xblockexpression = typ;
    }
    return _xblockexpression;
  }

  public Type getType(final Constant c) {
    Type _xblockexpression = null;
    {
      if (((c.getT() != null) || (c.getF() != null))) {
        return this._typeUtil.booleanType();
      }
      String _string_literal = c.getString_literal();
      boolean _tripleNotEquals = (_string_literal != null);
      if (_tripleNotEquals) {
        return this._typeUtil.stringType();
      }
      String _nul = c.getNul();
      boolean _tripleNotEquals_1 = (_nul != null);
      if (_tripleNotEquals_1) {
        return this._typeUtil.nullType();
      }
      Quantity _numeric_constant = c.getNumeric_constant();
      Type _type = null;
      if (_numeric_constant!=null) {
        _type=this.getType(_numeric_constant);
      }
      _xblockexpression = _type;
    }
    return _xblockexpression;
  }

  public Type getType(final Quantity q) {
    final QuantityType qt = BLESSFactory.eINSTANCE.createQuantityType();
    qt.setScalar(q.isScalar());
    qt.setUnit(q.getUnit());
    UnitName _unit = qt.getUnit();
    boolean _tripleEquals = (_unit == null);
    if (_tripleEquals) {
      qt.setScalar(true);
    }
    return qt;
  }

  public Type getType(final Feature f) {
    return this._typeUtil.getFeatureType(f);
  }

  public Type getType(final EnumerationValue ev) {
    return ev.getEnumeration_type().getType();
  }

  public UnitRecord getUnitRecord(final AddSub a) {
    UnitRecord _xblockexpression = null;
    {
      if ((this.cacheUnits && this.unitRecordMap.containsKey(a))) {
        return this.unitRecordMap.get(a);
      }
      String _sym = a.getSym();
      boolean _tripleEquals = (_sym == null);
      if (_tripleEquals) {
        return this.getUnitRecord(a.getL());
      }
      final UnitRecord retval = this.getUnitRecord(a.getL());
      if ((retval == null)) {
        String _string = a.getL().toString();
        String _plus = ("unit not found:  " + _string);
        this.fError(_plus, a, BLESSPackage.eINSTANCE.getAddSub_L(), IssueCodes.UNIT_DEFINITION_NOT_FOUND);
      }
      EList<MultDiv> _r = a.getR();
      for (final MultDiv r : _r) {
        boolean _matchTopAndBottom = retval.matchTopAndBottom(this.getUnitRecord(r));
        boolean _not = (!_matchTopAndBottom);
        if (_not) {
          String _sym_1 = a.getSym();
          String _plus_1 = ("Unit mismatch for " + _sym_1);
          String _plus_2 = (_plus_1 + " :  ");
          String _string_1 = this.getUnitRecord(r).toString();
          String _plus_3 = (_plus_2 + _string_1);
          String _plus_4 = (_plus_3 + 
            " is not ");
          String _string_2 = this.getUnitRecord(a.getL()).toString();
          String _plus_5 = (_plus_4 + _string_2);
          this.fError(_plus_5, a, BLESSPackage.eINSTANCE.getAddSub_Sym(), 
            IssueCodes.MISMATCHED_UNITS);
        }
      }
      if (this.cacheUnits) {
        this.unitRecordMap.put(a, retval);
      }
      _xblockexpression = retval;
    }
    return _xblockexpression;
  }

  public UnitRecord getUnitRecord(final MultDiv a) {
    UnitRecord _xblockexpression = null;
    {
      if ((this.cacheUnits && this.unitRecordMap.containsKey(a))) {
        return this.unitRecordMap.get(a);
      }
      String _sym = a.getSym();
      boolean _tripleEquals = (_sym == null);
      if (_tripleEquals) {
        return this.getUnitRecord(a.getL());
      }
      UnitRecord retval = this.getUnitRecord(a.getL());
      if ((retval == null)) {
        String _string = a.getL().toString();
        String _plus = ("unit not found:  " + _string);
        this.fError(_plus, a, BLESSPackage.eINSTANCE.getMultDiv_L(), IssueCodes.UNIT_DEFINITION_NOT_FOUND);
      } else {
        if (this.cacheUnits) {
          this.unitRecordMap.put(a, retval);
        }
      }
      String _sym_1 = a.getSym();
      boolean _tripleNotEquals = (_sym_1 != null);
      if (_tripleNotEquals) {
        boolean _equals = a.getSym().equals("*");
        if (_equals) {
          EList<Exp> _r = a.getR();
          for (final Exp rval : _r) {
            retval.multiply(this.getUnitRecord(rval));
          }
        } else {
          boolean _equals_1 = a.getSym().equals("/");
          if (_equals_1) {
            retval.divide(this.getUnitRecord(IterableExtensions.<Exp>head(a.getR())));
          } else {
            if ((a.getSym().equals("div") || a.getSym().equals("mod"))) {
              if ((!this.getUnitRecord(a.getL()).isWhole)) {
                String _sym_2 = a.getSym();
                String _plus_1 = ("Operands of \'" + _sym_2);
                String _plus_2 = (_plus_1 + "\' must be whole numbers.");
                this.fError(_plus_2, a, BLESSPackage.eINSTANCE.getMultDiv_L(), IssueCodes.MUST_BE_WHOLE_NUMBER);
              }
              if ((!this.getUnitRecord(IterableExtensions.<Exp>head(a.getR())).isWhole)) {
                String _sym_3 = a.getSym();
                String _plus_3 = ("Operands of \'" + _sym_3);
                String _plus_4 = (_plus_3 + "\' must be whole numbers.");
                this.fError(_plus_4, a, BLESSPackage.eINSTANCE.getMultDiv_R(), IssueCodes.MUST_BE_WHOLE_NUMBER);
              }
            }
          }
        }
      }
      _xblockexpression = retval;
    }
    return _xblockexpression;
  }

  public UnitRecord getUnitRecord(final Exp a) {
    UnitRecord _xblockexpression = null;
    {
      if ((this.cacheUnits && this.unitRecordMap.containsKey(a))) {
        return this.unitRecordMap.get(a);
      }
      String _sym = a.getSym();
      boolean _tripleEquals = (_sym == null);
      if (_tripleEquals) {
        return this.getUnitRecord(a.getL());
      }
      UnitRecord retval = this.getUnitRecord(a.getL());
      if ((retval == null)) {
        String _string = a.getL().toString();
        String _plus = ("unit not found:  " + _string);
        this.fError(_plus, a, BLESSPackage.eINSTANCE.getExp_L(), IssueCodes.UNIT_DEFINITION_NOT_FOUND);
      } else {
        if (this.cacheUnits) {
          this.unitRecordMap.put(a, retval);
        }
      }
      if (((a.getR() != null) && (!this.isScalar(this.getType(a.getR()))))) {
        this.fError("Exponents must be scalar.", a, BLESSPackage.eINSTANCE.getExp_L(), IssueCodes.MUST_BE_SCALAR);
      }
      if (((a.getR() != null) && (a.getR() instanceof Quantity))) {
        Subexpression _r = a.getR();
        final String exponent = ((Quantity) _r).getNumber().getLit();
        if ((exponent.contains(".") || exponent.contains("-"))) {
          this.fWarning("Exponents must be positive whole numbers for unit determination", a, BLESSPackage.eINSTANCE.getExp_L(), IssueCodes.MUST_BE_SCALAR);
        }
        final int exponent_as_int = Integer.parseInt(exponent);
        UnitRecord newRetVal = retval;
        for (int i = 1; (i < exponent_as_int); i++) {
          newRetVal.multiply(retval);
        }
        retval = newRetVal;
      } else {
        this.fError("Operands of ** must be whole scalar.", a, BLESSPackage.eINSTANCE.getExp_R(), IssueCodes.MUST_BE_SCALAR);
      }
      _xblockexpression = retval;
    }
    return _xblockexpression;
  }

  public UnitRecord getUnitRecord(final Subexpression a) {
    UnitRecord _xblockexpression = null;
    {
      UnaryOperator _unary = a.getUnary();
      boolean _tripleNotEquals = (_unary != null);
      if (_tripleNotEquals) {
        if (((a.getUnary().getTruncate() != null) || (a.getUnary().getRound() != null))) {
          if (this.getUnitRecord(a.getTimed_expression()).isScalar) {
            return this._unitUtil.whole();
          }
        }
      }
      _xblockexpression = this.getUnitRecord(a.getTimed_expression());
    }
    return _xblockexpression;
  }

  public UnitRecord getUnitRecord(final TimedExpression a) {
    return this.getUnitRecord(a.getSubject());
  }

  public UnitRecord getUnitRecord(final TimedSubject a) {
    UnitRecord _elvis = null;
    UnitRecord _elvis_1 = null;
    UnitRecord _elvis_2 = null;
    UnitRecord _elvis_3 = null;
    ParenthesizedSubexpression _ps = a.getPs();
    UnitRecord _unitRecord = null;
    if (_ps!=null) {
      _unitRecord=this.getUnitRecord(_ps);
    }
    if (_unitRecord != null) {
      _elvis_3 = _unitRecord;
    } else {
      Value _value = a.getValue();
      UnitRecord _unitRecord_1 = null;
      if (_value!=null) {
        _unitRecord_1=this.getUnitRecord(_value);
      }
      _elvis_3 = _unitRecord_1;
    }
    if (_elvis_3 != null) {
      _elvis_2 = _elvis_3;
    } else {
      ConditionalExpression _conditional = a.getConditional();
      UnitRecord _unitRecord_2 = null;
      if (_conditional!=null) {
        _unitRecord_2=this.getUnitRecord(_conditional);
      }
      _elvis_2 = _unitRecord_2;
    }
    if (_elvis_2 != null) {
      _elvis_1 = _elvis_2;
    } else {
      RecordTerm _record = a.getRecord();
      UnitRecord _unitRecord_3 = null;
      if (_record!=null) {
        _unitRecord_3=this.getUnitRecord(_record);
      }
      _elvis_1 = _unitRecord_3;
    }
    if (_elvis_1 != null) {
      _elvis = _elvis_1;
    } else {
      Invocation _invocation = a.getInvocation();
      UnitRecord _unitRecord_4 = null;
      if (_invocation!=null) {
        _unitRecord_4=this.getUnitRecord(_invocation);
      }
      _elvis = _unitRecord_4;
    }
    return _elvis;
  }

  public UnitRecord getUnitRecord(final ParenthesizedSubexpression a) {
    UnitRecord _xblockexpression = null;
    {
      this._unitUtil.nan();
      UnitRecord _elvis = null;
      UnitRecord _elvis_1 = null;
      Expression _t = a.getT();
      UnitRecord _unitRecord = null;
      if (_t!=null) {
        _unitRecord=this.getUnitRecord(_t);
      }
      if (_unitRecord != null) {
        _elvis_1 = _unitRecord;
      } else {
        Expression _expression = a.getExpression();
        UnitRecord _unitRecord_1 = null;
        if (_expression!=null) {
          _unitRecord_1=this.getUnitRecord(_expression);
        }
        _elvis_1 = _unitRecord_1;
      }
      if (_elvis_1 != null) {
        _elvis = _elvis_1;
      } else {
        CaseExpression _caseexpression = a.getCaseexpression();
        EList<CaseChoice> _cc = null;
        if (_caseexpression!=null) {
          _cc=_caseexpression.getCc();
        }
        UnitRecord _unitRecord_2 = this.getUnitRecord(IterableExtensions.<CaseChoice>head(_cc).getExp());
        _elvis = _unitRecord_2;
      }
      _xblockexpression = _elvis;
    }
    return _xblockexpression;
  }

  public UnitRecord getUnitRecord(final Expression a) {
    UnitRecord _xblockexpression = null;
    {
      if ((this.cacheUnits && this.unitRecordMap.containsKey(a))) {
        return this.unitRecordMap.get(a);
      }
      UnitRecord retval = this._unitUtil.nan();
      SumQuantification _sum = a.getSum();
      boolean _tripleNotEquals = (_sum != null);
      if (_tripleNotEquals) {
        retval = this.getUnitRecord(a.getSum());
      } else {
        ProductQuantification _product = a.getProduct();
        boolean _tripleNotEquals_1 = (_product != null);
        if (_tripleNotEquals_1) {
          retval = this.getUnitRecord(a.getProduct());
        } else {
          CountingQuantification _numberof = a.getNumberof();
          boolean _tripleNotEquals_2 = (_numberof != null);
          if (_tripleNotEquals_2) {
            retval = this.getUnitRecord(a.getNumberof());
          } else {
            String _sym = a.getSym();
            boolean _tripleNotEquals_3 = (_sym != null);
            if (_tripleNotEquals_3) {
              retval = this._unitUtil.nan();
            } else {
              Disjunction _l = a.getL();
              boolean _tripleNotEquals_4 = (_l != null);
              if (_tripleNotEquals_4) {
                retval = this.getUnitRecord(a.getL());
              }
            }
          }
        }
      }
      if ((retval != null)) {
        if (this.cacheUnits) {
          this.unitRecordMap.put(a, retval);
        }
      }
      _xblockexpression = retval;
    }
    return _xblockexpression;
  }

  public UnitRecord getUnitRecord(final Disjunction a) {
    UnitRecord _xifexpression = null;
    String _sym = a.getSym();
    boolean _tripleNotEquals = (_sym != null);
    if (_tripleNotEquals) {
      _xifexpression = this._unitUtil.nan();
    } else {
      _xifexpression = this.getUnitRecord(a.getL());
    }
    return _xifexpression;
  }

  public UnitRecord getUnitRecord(final Conjunction a) {
    UnitRecord _xifexpression = null;
    String _sym = a.getSym();
    boolean _tripleNotEquals = (_sym != null);
    if (_tripleNotEquals) {
      _xifexpression = this._unitUtil.nan();
    } else {
      _xifexpression = this.getUnitRecord(a.getL());
    }
    return _xifexpression;
  }

  public UnitRecord getUnitRecord(final Relation a) {
    UnitRecord _xifexpression = null;
    if (((a.getSym() != null) || (a.getIn() != null))) {
      _xifexpression = this._unitUtil.nan();
    } else {
      _xifexpression = this.getUnitRecord(a.getL());
    }
    return _xifexpression;
  }

  public UnitRecord getUnitRecord(final Value a) {
    UnitRecord _xblockexpression = null;
    {
      if ((this.cacheUnits && this.unitRecordMap.containsKey(a))) {
        return this.unitRecordMap.get(a);
      }
      UnitRecord retval = this._unitUtil.scalar();
      ValueName _value_name = a.getValue_name();
      boolean _tripleNotEquals = (_value_name != null);
      if (_tripleNotEquals) {
        retval = this.getUnitRecord(a.getValue_name());
      }
      Constant _constant = a.getConstant();
      boolean _tripleNotEquals_1 = (_constant != null);
      if (_tripleNotEquals_1) {
        retval = this.getUnitRecord(a.getConstant());
      }
      EnumerationValue _enum_val = a.getEnum_val();
      boolean _tripleNotEquals_2 = (_enum_val != null);
      if (_tripleNotEquals_2) {
        retval = this._unitUtil.nan();
      }
      if (((a.getNow() != null) || (a.getTops() != null))) {
        final QuantityType qt = BLESSFactory.eINSTANCE.createQuantityType();
        qt.setUnit(this._blessIndex.getTimeUnit(a));
        retval = this.getUnitRecord(qt);
      }
      if ((retval != null)) {
        if (this.cacheUnits) {
          this.unitRecordMap.put(a, retval);
        }
      }
      _xblockexpression = retval;
    }
    return _xblockexpression;
  }

  public UnitRecord getUnitRecord(final ConditionalExpression a) {
    UnitRecord _xblockexpression = null;
    {
      if ((this.cacheUnits && this.unitRecordMap.containsKey(a))) {
        return this.unitRecordMap.get(a);
      }
      final UnitRecord retval = this.getUnitRecord(a.getT());
      boolean _matchTopAndBottom = retval.matchTopAndBottom(this.getUnitRecord(a.getF()));
      boolean _not = (!_matchTopAndBottom);
      if (_not) {
        String _string = retval.toString();
        String _plus = ("True branch base units of \'" + _string);
        String _plus_1 = (_plus + "\'; false branch has base units of \'");
        String _string_1 = this.getUnitRecord(a.getF()).toString();
        String _plus_2 = (_plus_1 + _string_1);
        String _plus_3 = (_plus_2 + "\'");
        this.fError(_plus_3, a, BLESSPackage.eINSTANCE.getConditionalExpression_F(), IssueCodes.MISMATCHED_UNITS);
      }
      if (this.cacheUnits) {
        this.unitRecordMap.put(a, retval);
      }
      _xblockexpression = retval;
    }
    return _xblockexpression;
  }

  public UnitRecord getUnitRecord(final RecordTerm a) {
    UnitRecord _xblockexpression = null;
    {
      if ((this.cacheUnits && this.unitRecordMap.containsKey(a))) {
        return this.unitRecordMap.get(a);
      }
      final UnitRecord retval = this._unitUtil.nan();
      if (this.cacheUnits) {
        this.unitRecordMap.put(a, retval);
      }
      _xblockexpression = retval;
    }
    return _xblockexpression;
  }

  public UnitRecord getUnitRecord(final Invocation a) {
    UnitRecord _xblockexpression = null;
    {
      if ((this.cacheUnits && this.unitRecordMap.containsKey(a))) {
        return this.unitRecordMap.get(a);
      }
      UnitRecord retval = this._unitUtil.scalar();
      TypeOrReference _tod = a.getLabel().getTod();
      boolean _tripleNotEquals = (_tod != null);
      if (_tripleNotEquals) {
        Type _type = this._typeUtil.getType(a.getLabel().getTod());
        if ((_type instanceof QuantityType)) {
          Type _type_1 = this._typeUtil.getType(a.getLabel().getTod());
          final QuantityType t = ((QuantityType) _type_1);
          UnitName _unit = t.getUnit();
          boolean _tripleNotEquals_1 = (_unit != null);
          if (_tripleNotEquals_1) {
            retval = this._unitUtil.toUnitRecord(t.getUnit());
          }
        } else {
          this.fError("Return type of assertion invocation must be quantity type.", a, BLESSPackage.eINSTANCE.getInvocation_Label(), 
            IssueCodes.MUST_BE_QUANTITY);
        }
      }
      if ((retval == null)) {
        String _name = a.getLabel().getName();
        String _plus = ("unit not found for Invocation:  " + _name);
        this.fError(_plus, a, BLESSPackage.eINSTANCE.getInvocation_Label());
      } else {
        if (this.cacheUnits) {
          this.unitRecordMap.put(a, retval);
        }
      }
      _xblockexpression = retval;
    }
    return _xblockexpression;
  }

  public UnitRecord getUnitRecord(final SumQuantification a) {
    UnitRecord _xblockexpression = null;
    {
      if ((this.cacheUnits && this.unitRecordMap.containsKey(a))) {
        return this.unitRecordMap.get(a);
      }
      final UnitRecord retval = this.getUnitRecord(a.getNumeric_expression());
      if (this.cacheUnits) {
        this.unitRecordMap.put(a, retval);
      }
      _xblockexpression = retval;
    }
    return _xblockexpression;
  }

  public UnitRecord getUnitRecord(final ProductQuantification a) {
    UnitRecord _xblockexpression = null;
    {
      if ((this.cacheUnits && this.unitRecordMap.containsKey(a))) {
        return this.unitRecordMap.get(a);
      }
      final UnitRecord retval = this.getUnitRecord(a.getNumeric_expression());
      if ((!retval.isScalar)) {
        this.fError("Subject of product must be scalar.", a, BLESSPackage.eINSTANCE.getProductQuantification_Numeric_expression(), 
          IssueCodes.MUST_BE_SCALAR);
      } else {
        if (this.cacheUnits) {
          this.unitRecordMap.put(a, retval);
        }
      }
      _xblockexpression = retval;
    }
    return _xblockexpression;
  }

  public UnitRecord getUnitRecord(final CountingQuantification a) {
    UnitRecord _xblockexpression = null;
    {
      if ((this.cacheUnits && this.unitRecordMap.containsKey(a))) {
        return this.unitRecordMap.get(a);
      }
      final UnitRecord retval = this._unitUtil.whole();
      if (this.cacheUnits) {
        this.unitRecordMap.put(a, retval);
      }
      _xblockexpression = retval;
    }
    return _xblockexpression;
  }

  public UnitRecord getUnitRecord(final ValueName a) {
    UnitRecord _xblockexpression = null;
    {
      if ((this.cacheUnits && this.unitRecordMap.containsKey(a))) {
        return this.unitRecordMap.get(a);
      }
      UnitRecord retval = null;
      final Type itsType = this.getType(a);
      if ((itsType instanceof QuantityType)) {
        retval = this.getUnitRecord(((QuantityType) itsType));
      } else {
        retval = this._unitUtil.nan();
      }
      if ((retval != null)) {
        if (this.cacheUnits) {
          this.unitRecordMap.put(a, retval);
        }
      }
      _xblockexpression = retval;
    }
    return _xblockexpression;
  }

  public UnitRecord getUnitRecord(final Constant a) {
    UnitRecord _elvis = null;
    Quantity _numeric_constant = null;
    if (a!=null) {
      _numeric_constant=a.getNumeric_constant();
    }
    UnitRecord _unitRecord = this.getUnitRecord(_numeric_constant);
    if (_unitRecord != null) {
      _elvis = _unitRecord;
    } else {
      UnitRecord _nan = this._unitUtil.nan();
      _elvis = _nan;
    }
    return _elvis;
  }

  public UnitRecord getUnitRecord(final NumericExpression a) {
    return this.getUnitRecord(((Expression) a));
  }

  public UnitRecord getUnitRecord(final PropertyConstant a) {
    PropertyExpression _constantValue = a.getConstantValue();
    if ((_constantValue instanceof RealLiteral)) {
      PropertyExpression _constantValue_1 = a.getConstantValue();
      final RealLiteral rl = ((RealLiteral) _constantValue_1);
      UnitLiteral _unit = rl.getUnit();
      boolean _tripleEquals = (_unit == null);
      if (_tripleEquals) {
        return this._unitUtil.scalar();
      } else {
        boolean _unitMapContainsKey = BlessMaps.unitMapContainsKey(rl.getUnit().getName());
        if (_unitMapContainsKey) {
          return this._unitUtil.toUnitRecord(BlessMaps.unitMapGet(rl.getUnit().getName()));
        } else {
          String _name = rl.getUnit().getName();
          String _plus = ("No Unit annex definition for \"" + _name);
          String _plus_1 = (_plus + "\" was found; treated as scalar.");
          BlessControl.println(_plus_1);
          return this._unitUtil.scalar();
        }
      }
    } else {
      PropertyExpression _constantValue_2 = a.getConstantValue();
      if ((_constantValue_2 instanceof IntegerLiteral)) {
        PropertyExpression _constantValue_3 = a.getConstantValue();
        final IntegerLiteral rl_1 = ((IntegerLiteral) _constantValue_3);
        UnitLiteral _unit_1 = rl_1.getUnit();
        boolean _tripleEquals_1 = (_unit_1 == null);
        if (_tripleEquals_1) {
          return this._unitUtil.whole();
        } else {
          boolean _unitMapContainsKey_1 = BlessMaps.unitMapContainsKey(rl_1.getUnit().getName());
          if (_unitMapContainsKey_1) {
            return this._unitUtil.toUnitRecord(BlessMaps.unitMapGet(rl_1.getUnit().getName()));
          } else {
            String _name_1 = rl_1.getUnit().getName();
            String _plus_2 = ("No Unit annex definition for \"" + _name_1);
            String _plus_3 = (_plus_2 + "\" was found; treated as scalar.");
            BlessControl.println(_plus_3);
            return this._unitUtil.scalar();
          }
        }
      } else {
        PropertyExpression _constantValue_4 = a.getConstantValue();
        if ((_constantValue_4 instanceof RangeValue)) {
          PropertyExpression _constantValue_5 = a.getConstantValue();
          final RangeValue rl_2 = ((RangeValue) _constantValue_5);
          PropertyExpression _delta = rl_2.getDelta();
          boolean _tripleEquals_2 = (_delta == null);
          if (_tripleEquals_2) {
            return this._unitUtil.whole();
          } else {
            PropertyExpression _delta_1 = rl_2.getDelta();
            if ((_delta_1 instanceof RealLiteral)) {
              PropertyExpression _delta_2 = rl_2.getDelta();
              UnitLiteral _unit_2 = ((RealLiteral) _delta_2).getUnit();
              boolean _tripleNotEquals = (_unit_2 != null);
              if (_tripleNotEquals) {
                PropertyExpression _delta_3 = rl_2.getDelta();
                return this._unitUtil.toUnitRecord(BlessMaps.unitMapGet(((RealLiteral) _delta_3).getUnit().getName()));
              } else {
                return this._unitUtil.scalar();
              }
            } else {
              return this._unitUtil.whole();
            }
          }
        }
      }
    }
    return null;
  }

  public UnitLiteral getUnitLiteral(final Property p) {
    EList<EObject> _eContents = p.eContents();
    for (final EObject o : _eContents) {
      if (((o instanceof NamedValue) && (((NamedValue) o).getNamedValue() instanceof PropertyConstant))) {
        AbstractNamedValue _namedValue = ((NamedValue) o).getNamedValue();
        final PropertyConstant pc = ((PropertyConstant) _namedValue);
        PropertyExpression _constantValue = pc.getConstantValue();
        if ((_constantValue instanceof IntegerLiteral)) {
          PropertyExpression _constantValue_1 = pc.getConstantValue();
          return ((IntegerLiteral) _constantValue_1).getUnit();
        } else {
          PropertyExpression _constantValue_2 = pc.getConstantValue();
          if ((_constantValue_2 instanceof RealLiteral)) {
            PropertyExpression _constantValue_3 = pc.getConstantValue();
            return ((RealLiteral) _constantValue_3).getUnit();
          }
        }
      } else {
        if ((o instanceof IntegerLiteral)) {
          return ((IntegerLiteral) o).getUnit();
        } else {
          if ((o instanceof RealLiteral)) {
            return ((RealLiteral) o).getUnit();
          }
        }
      }
    }
    return null;
  }

  public UnitRecord getUnitRecord(final Property p) {
    final UnitLiteral ul = this.getUnitLiteral(p);
    boolean _unitMapContainsKey = BlessMaps.unitMapContainsKey(ul.getName());
    if (_unitMapContainsKey) {
      return this._unitUtil.toUnitRecord(BlessMaps.unitMapGet(ul.getName()));
    } else {
      return this._unitUtil.whole();
    }
  }

  public UnitRecord getUnitRecord(final PropertyReference a) {
    Property _pname = a.getPname();
    boolean _tripleNotEquals = (_pname != null);
    if (_tripleNotEquals) {
      final NamedElement ne = a.getPname();
      if ((ne instanceof PropertyConstant)) {
        final PropertyConstant pc = ((PropertyConstant) ne);
        boolean _eIsProxy = pc.eIsProxy();
        if (_eIsProxy) {
          EcoreUtil.resolve(pc, this._blessIndex.getResourceSet(a));
        }
        PropertyType _referencedPropertyType = pc.getReferencedPropertyType();
        boolean _tripleNotEquals_1 = (_referencedPropertyType != null);
        if (_tripleNotEquals_1) {
          return this.getUnitRecord(pc);
        }
      }
      if ((ne instanceof Property)) {
        final Property prop = ((Property) ne);
        boolean _eIsProxy_1 = prop.eIsProxy();
        if (_eIsProxy_1) {
          EcoreUtil.resolve(prop, this._blessIndex.getResourceSet(a));
        }
        PropertyType _referencedPropertyType_1 = prop.getReferencedPropertyType();
        boolean _tripleNotEquals_2 = (_referencedPropertyType_1 != null);
        if (_tripleNotEquals_2) {
          return this.getUnitRecord(prop);
        }
        PropertyType _ownedPropertyType = prop.getOwnedPropertyType();
        boolean _tripleNotEquals_3 = (_ownedPropertyType != null);
        if (_tripleNotEquals_3) {
          PropertyType _ownedPropertyType_1 = prop.getOwnedPropertyType();
          if ((_ownedPropertyType_1 instanceof AadlInteger)) {
            return this._unitUtil.whole();
          } else {
            PropertyType _ownedPropertyType_2 = prop.getOwnedPropertyType();
            if ((_ownedPropertyType_2 instanceof AadlReal)) {
              return this._unitUtil.scalar();
            }
          }
        }
      }
    }
    Property _spname = a.getSpname();
    boolean _tripleNotEquals_4 = (_spname != null);
    if (_tripleNotEquals_4) {
      return this.getUnitRecord(a.getSpname());
    }
    Property _cpname = a.getCpname();
    boolean _tripleNotEquals_5 = (_cpname != null);
    if (_tripleNotEquals_5) {
      return this.getUnitRecord(a.getCpname());
    }
    return null;
  }

  public UnitRecord getUnitRecord(final QuantityType a) {
    return this._unitUtil.toUnitRecord(a);
  }

  public UnitRecord getUnitRecord(final TypeOrReference a) {
    if (((a.getTy() != null) && (a.getTy() instanceof QuantityType))) {
      Type _ty = a.getTy();
      return this.getUnitRecord(((QuantityType) _ty));
    } else {
      if (((a.getRef() != null) && (a.getRef().getType() instanceof QuantityType))) {
        Type _type = a.getRef().getType();
        return this.getUnitRecord(((QuantityType) _type));
      } else {
        return this._unitUtil.nan();
      }
    }
  }

  public UnitRecord getUnitRecord(final AssertionFunctionValue a) {
    ConditionalAssertionFunction _cexp = a.getCexp();
    boolean _tripleNotEquals = (_cexp != null);
    if (_tripleNotEquals) {
      ConditionalAssertionFunction _cexp_1 = a.getCexp();
      return this.getUnitRecord(((ConditionalAssertionFunction) _cexp_1));
    } else {
      AssertionNumericExpression _pexp = a.getPexp();
      boolean _tripleNotEquals_1 = (_pexp != null);
      if (_tripleNotEquals_1) {
        AssertionNumericExpression _pexp_1 = a.getPexp();
        return this.getUnitRecord(((AssertionNumericExpression) _pexp_1));
      }
    }
    return null;
  }

  public UnitRecord getUnitRecord(final AssertionNumericExpression a) {
    return this.getUnitRecord(((Expression) a));
  }

  public UnitRecord getUnitRecord(final ConditionalAssertionFunction a) {
    return this.getUnitRecord(IterableExtensions.<ConditionValuePair>head(a.getCvp()).getExpression());
  }

  public UnitRecord getUnitRecord(final BehaviorTime a) {
    UnitRecord _elvis = null;
    UnitRecord _elvis_1 = null;
    Quantity _quantity = a.getQuantity();
    UnitRecord _unitRecord = null;
    if (_quantity!=null) {
      _unitRecord=this.getUnitRecord(_quantity);
    }
    if (_unitRecord != null) {
      _elvis_1 = _unitRecord;
    } else {
      ValueName _value = a.getValue();
      UnitRecord _unitRecord_1 = null;
      if (_value!=null) {
        _unitRecord_1=this.getUnitRecord(_value);
      }
      _elvis_1 = _unitRecord_1;
    }
    if (_elvis_1 != null) {
      _elvis = _elvis_1;
    } else {
      UnitRecord _unitRecord_2 = this.getUnitRecord(a.getDuration());
      _elvis = _unitRecord_2;
    }
    return _elvis;
  }

  public UnitRecord getUnitRecord(final ForallVariable p) {
    return this._unitUtil.whole();
  }

  public UnitRecord getUnitRecord(final EnumerationValue p) {
    return this._unitUtil.nan();
  }

  public UnitRecord getUnitRecord(final Quantity q) {
    UnitRecord _elvis = null;
    UnitName _unit = null;
    if (q!=null) {
      _unit=q.getUnit();
    }
    UnitRecord _unitRecord = this._unitUtil.toUnitRecord(_unit);
    if (_unitRecord != null) {
      _elvis = _unitRecord;
    } else {
      UnitRecord _scalar = this._unitUtil.scalar();
      _elvis = _scalar;
    }
    return _elvis;
  }

  public boolean isWhole(final Variable v) {
    return ((this._typeUtil.getType(v.getTod()) instanceof QuantityType) && ((QuantityType) this._typeUtil.getType(v.getTod())).isWhole());
  }

  public boolean isWhole(final ForallVariable v) {
    return true;
  }

  public boolean isWhole(final PeriodShift ps) {
    boolean _xblockexpression = false;
    {
      Value _v = ps.getV();
      boolean _tripleNotEquals = (_v != null);
      if (_tripleNotEquals) {
        return this.isWhole(ps.getV());
      }
      IndexExpression _index_expression = ps.getIndex_expression();
      boolean _tripleNotEquals_1 = (_index_expression != null);
      if (_tripleNotEquals_1) {
        return this.isWhole(ps.getIndex_expression());
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }

  public boolean isWhole(final IndexExpression ie) {
    boolean _xblockexpression = false;
    {
      boolean _isWhole = this.isWhole(ie.getL());
      boolean _not = (!_isWhole);
      if (_not) {
        return false;
      }
      EList<PeriodShift> _r = ie.getR();
      for (final PeriodShift r : _r) {
        boolean _isWhole_1 = this.isWhole(r);
        boolean _not_1 = (!_isWhole_1);
        if (_not_1) {
          return false;
        }
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }

  public boolean isWhole(final IndexExpressionOrRange ie) {
    boolean _xblockexpression = false;
    {
      boolean _isWhole = this.isWhole(ie.getLeft_hand_side());
      boolean _not = (!_isWhole);
      if (_not) {
        return false;
      }
      if (((ie.getRight_hand_side() != null) && (!this.isWhole(ie.getRight_hand_side())))) {
        return false;
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }

  public boolean isWhole(final Value v) {
    boolean _xblockexpression = false;
    {
      ValueName _value_name = v.getValue_name();
      boolean _tripleNotEquals = (_value_name != null);
      if (_tripleNotEquals) {
        Type _type = this.getType(v.getValue_name());
        if ((_type instanceof QuantityType)) {
          Type _type_1 = this.getType(v.getValue_name());
          return ((QuantityType) _type_1).isWhole();
        }
      }
      Constant _constant = v.getConstant();
      boolean _tripleNotEquals_1 = (_constant != null);
      if (_tripleNotEquals_1) {
        return this.isWhole(v.getConstant());
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }

  public boolean isWhole(final Feature f) {
    return true;
  }

  public boolean isWhole(final Constant c) {
    boolean _xblockexpression = false;
    {
      Quantity _numeric_constant = c.getNumeric_constant();
      boolean _tripleNotEquals = (_numeric_constant != null);
      if (_tripleNotEquals) {
        return this.isWhole(c.getNumeric_constant());
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }

  public boolean isWhole(final Quantity q) {
    return this.isWhole(q.getNumber());
  }

  public boolean isWhole(final ANumber n) {
    boolean _xblockexpression = false;
    {
      String _lit = n.getLit();
      boolean _tripleNotEquals = (_lit != null);
      if (_tripleNotEquals) {
        boolean _contains = n.getLit().contains(".");
        return (!_contains);
      }
      PropertyReference _property = n.getProperty();
      boolean _tripleNotEquals_1 = (_property != null);
      if (_tripleNotEquals_1) {
        return this.isWhole(n.getProperty());
      }
      PropertyConstant _propertyConstant = n.getPropertyConstant();
      boolean _tripleNotEquals_2 = (_propertyConstant != null);
      if (_tripleNotEquals_2) {
        return this.isWhole(n.getPropertyConstant());
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }

  public boolean isWhole(final PropertyConstant p) {
    return true;
  }

  public boolean isWhole(final PropertyReference p) {
    return true;
  }

  public boolean isWhole(final Subexpression s) {
    boolean _xblockexpression = false;
    {
      UnaryOperator _unary = s.getUnary();
      boolean _tripleNotEquals = (_unary != null);
      if (_tripleNotEquals) {
        if (((s.getUnary().getTruncate() != null) || (s.getUnary().getRound() != null))) {
          return true;
        }
      }
      _xblockexpression = this.isWhole(s.getTimed_expression());
    }
    return _xblockexpression;
  }

  public boolean isWhole(final TimedExpression e) {
    return this.isWhole(e.getSubject());
  }

  public boolean isWhole(final TimedSubject e) {
    boolean _xifexpression = false;
    ParenthesizedSubexpression _ps = e.getPs();
    boolean _tripleNotEquals = (_ps != null);
    if (_tripleNotEquals) {
      _xifexpression = this.isWhole(e.getPs());
    } else {
      boolean _xifexpression_1 = false;
      Value _value = e.getValue();
      boolean _tripleNotEquals_1 = (_value != null);
      if (_tripleNotEquals_1) {
        _xifexpression_1 = this.isWhole(e.getValue());
      } else {
        boolean _xifexpression_2 = false;
        ConditionalExpression _conditional = e.getConditional();
        boolean _tripleNotEquals_2 = (_conditional != null);
        if (_tripleNotEquals_2) {
          _xifexpression_2 = this.isWhole(e.getConditional());
        } else {
          boolean _xifexpression_3 = false;
          RecordTerm _record = e.getRecord();
          boolean _tripleNotEquals_3 = (_record != null);
          if (_tripleNotEquals_3) {
            _xifexpression_3 = false;
          } else {
            boolean _xifexpression_4 = false;
            Invocation _invocation = e.getInvocation();
            boolean _tripleNotEquals_4 = (_invocation != null);
            if (_tripleNotEquals_4) {
              _xifexpression_4 = this.isWhole(e.getInvocation());
            } else {
              _xifexpression_4 = false;
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

  public boolean isWhole(final ConditionalExpression e) {
    return (this.isWhole(e.getT()) && this.isWhole(e.getF()));
  }

  public boolean isWhole(final ParenthesizedSubexpression e) {
    boolean _xifexpression = false;
    Expression _expression = e.getExpression();
    boolean _tripleNotEquals = (_expression != null);
    if (_tripleNotEquals) {
      _xifexpression = this.isWhole(e.getExpression());
    } else {
      boolean _xifexpression_1 = false;
      CaseExpression _caseexpression = e.getCaseexpression();
      boolean _tripleNotEquals_1 = (_caseexpression != null);
      if (_tripleNotEquals_1) {
        _xifexpression_1 = this.isWhole(e.getCaseexpression());
      } else {
        _xifexpression_1 = false;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }

  public boolean isWhole(final CaseExpression e) {
    boolean _xblockexpression = false;
    {
      EList<CaseChoice> _cc = e.getCc();
      for (final CaseChoice casechoice : _cc) {
        boolean _isWhole = this.isWhole(casechoice.getExp());
        boolean _not = (!_isWhole);
        if (_not) {
          return false;
        }
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }

  public boolean isWhole(final Expression e) {
    boolean _xblockexpression = false;
    {
      SumQuantification _sum = e.getSum();
      boolean _tripleNotEquals = (_sum != null);
      if (_tripleNotEquals) {
        return this.isWhole(e.getSum().getNumeric_expression());
      }
      ProductQuantification _product = e.getProduct();
      boolean _tripleNotEquals_1 = (_product != null);
      if (_tripleNotEquals_1) {
        return this.isWhole(e.getProduct().getNumeric_expression());
      }
      CountingQuantification _numberof = e.getNumberof();
      boolean _tripleNotEquals_2 = (_numberof != null);
      if (_tripleNotEquals_2) {
        return true;
      }
      String _sym = e.getSym();
      boolean _tripleNotEquals_3 = (_sym != null);
      if (_tripleNotEquals_3) {
        return false;
      }
      _xblockexpression = this.isWhole(e.getL());
    }
    return _xblockexpression;
  }

  public boolean isWhole(final Disjunction e) {
    boolean _xblockexpression = false;
    {
      String _sym = e.getSym();
      boolean _tripleNotEquals = (_sym != null);
      if (_tripleNotEquals) {
        return false;
      }
      _xblockexpression = this.isWhole(e.getL());
    }
    return _xblockexpression;
  }

  public boolean isWhole(final Conjunction e) {
    boolean _xblockexpression = false;
    {
      String _sym = e.getSym();
      boolean _tripleNotEquals = (_sym != null);
      if (_tripleNotEquals) {
        return false;
      }
      _xblockexpression = this.isWhole(e.getL());
    }
    return _xblockexpression;
  }

  public boolean isWhole(final Relation e) {
    boolean _xblockexpression = false;
    {
      if (((e.getSym() != null) || (e.getIn() != null))) {
        return false;
      }
      _xblockexpression = this.isWhole(e.getL());
    }
    return _xblockexpression;
  }

  public boolean isWhole(final AddSub e) {
    boolean _xblockexpression = false;
    {
      boolean _isWhole = this.isWhole(e.getL());
      boolean _not = (!_isWhole);
      if (_not) {
        return false;
      }
      EList<MultDiv> _r = e.getR();
      for (final MultDiv r : _r) {
        boolean _isWhole_1 = this.isWhole(r);
        boolean _not_1 = (!_isWhole_1);
        if (_not_1) {
          return false;
        }
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }

  public boolean isWhole(final MultDiv e) {
    boolean _xblockexpression = false;
    {
      boolean _isWhole = this.isWhole(e.getL());
      boolean _not = (!_isWhole);
      if (_not) {
        return false;
      }
      EList<Exp> _r = e.getR();
      for (final Exp r : _r) {
        boolean _isWhole_1 = this.isWhole(r);
        boolean _not_1 = (!_isWhole_1);
        if (_not_1) {
          return false;
        }
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }

  public boolean isWhole(final Exp e) {
    boolean _xblockexpression = false;
    {
      boolean _isWhole = this.isWhole(e.getL());
      boolean _not = (!_isWhole);
      if (_not) {
        return false;
      }
      boolean _isWhole_1 = this.isWhole(e.getR());
      boolean _not_1 = (!_isWhole_1);
      if (_not_1) {
        return false;
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }

  public boolean isWhole(final NumericExpression e) {
    return this.isWhole(((Expression) e));
  }

  public boolean isWhole(final Invocation e) {
    return true;
  }
}
