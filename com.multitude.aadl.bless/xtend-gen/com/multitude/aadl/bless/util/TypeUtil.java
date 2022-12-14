package com.multitude.aadl.bless.util;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.multitude.aadl.bless.bLESS.ANumber;
import com.multitude.aadl.bless.bLESS.AddSub;
import com.multitude.aadl.bless.bLESS.ArrayRange;
import com.multitude.aadl.bless.bLESS.ArrayRangeList;
import com.multitude.aadl.bless.bLESS.ArrayType;
import com.multitude.aadl.bless.bLESS.BLESSFactory;
import com.multitude.aadl.bless.bLESS.BooleanType;
import com.multitude.aadl.bless.bLESS.EnumerationType;
import com.multitude.aadl.bless.bLESS.Exp;
import com.multitude.aadl.bless.bLESS.MultDiv;
import com.multitude.aadl.bless.bLESS.PropertyReference;
import com.multitude.aadl.bless.bLESS.Quantity;
import com.multitude.aadl.bless.bLESS.QuantityType;
import com.multitude.aadl.bless.bLESS.RecordField;
import com.multitude.aadl.bless.bLESS.RecordType;
import com.multitude.aadl.bless.bLESS.Relation;
import com.multitude.aadl.bless.bLESS.StringType;
import com.multitude.aadl.bless.bLESS.Subexpression;
import com.multitude.aadl.bless.bLESS.Type;
import com.multitude.aadl.bless.bLESS.TypeDeclaration;
import com.multitude.aadl.bless.bLESS.TypeOrReference;
import com.multitude.aadl.bless.bLESS.UnitName;
import com.multitude.aadl.bless.bLESS.Value;
import com.multitude.aadl.bless.maps.BlessMaps;
import com.multitude.aadl.bless.scoping.BlessIndex;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.EventPort;
import org.osate.aadl2.Feature;
import org.osate.aadl2.ModalPropertyValue;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.PropertyAssociation;
import org.osate.aadl2.PropertyExpression;
import org.osate.aadl2.StringLiteral;
import org.osate.aadl2.modelsupport.util.AadlUtil;

@SuppressWarnings("all")
public class TypeUtil {
  @Inject
  @Extension
  private UnitUtil _unitUtil;

  @Inject
  @Extension
  private BlessUtil _blessUtil;

  @Inject
  @Extension
  private BlessIndex _blessIndex;

  public Type booleanType() {
    return BLESSFactory.eINSTANCE.createBooleanType();
  }

  public Type stringType() {
    return BLESSFactory.eINSTANCE.createStringType();
  }

  public Type nullType() {
    return BLESSFactory.eINSTANCE.createNullType();
  }

  public boolean sameStructuralType(final Type a, final Type b) {
    if (((a instanceof EnumerationType) && (b instanceof EnumerationType))) {
      return IterableExtensions.elementsEqual(((EnumerationType) a).getDefining_enumeration_literal(), ((EnumerationType) b).getDefining_enumeration_literal());
    }
    if (((a instanceof QuantityType) && (b instanceof QuantityType))) {
      return true;
    }
    if (((a instanceof ArrayType) && (b instanceof ArrayType))) {
      return (this.sameArrayRangeLists(((ArrayType) a).getArray_ranges(), ((ArrayType) b).getArray_ranges()) && this.sameStructuralType(this.getType(((ArrayType) a).getTyp()), this.getType(((ArrayType) b).getTyp())));
    }
    if (((a instanceof RecordType) && (b instanceof RecordType))) {
      final Function1<RecordField, Boolean> _function = (RecordField f) -> {
        return Boolean.valueOf(this.recordHasFieldWith(((RecordType) b), f.getLabel(), this.getType(f.getTyp())));
      };
      return IterableExtensions.<RecordField>forall(((RecordType) a).getFields(), _function);
    }
    if (((a instanceof BooleanType) && (b instanceof BooleanType))) {
      return true;
    }
    if (((a instanceof StringType) && (b instanceof StringType))) {
      return true;
    }
    return false;
  }

  public Type getType(final TypeOrReference tod) {
    Type _xblockexpression = null;
    {
      if (tod!=null) {
        tod.getTy();
      }
      TypeDeclaration _ref = null;
      if (tod!=null) {
        _ref=tod.getRef();
      }
      _xblockexpression = _ref.getType();
    }
    return _xblockexpression;
  }

  public boolean sameArrayRangeLists(final ArrayRangeList c, final ArrayRangeList d) {
    boolean _xblockexpression = false;
    {
      int _size = c.getRange().size();
      int _size_1 = d.getRange().size();
      boolean _notEquals = (_size != _size_1);
      if (_notEquals) {
        return false;
      }
      _xblockexpression = IterableExtensions.elementsEqual(c.getRange(), d.getRange());
    }
    return _xblockexpression;
  }

  public boolean sameArrayRange(final ArrayRange e, final ArrayRange f) {
    return (Objects.equal(e.getLb(), f.getLb()) && Objects.equal(e.getUb(), f.getUb()));
  }

  public boolean recordHasFieldWith(final RecordType r, final String label, final Type typ) {
    final Function1<RecordField, Boolean> _function = (RecordField u) -> {
      return Boolean.valueOf((u.getLabel().equalsIgnoreCase(label) && this.sameStructuralType(this.getType(u.getTyp()), typ)));
    };
    return IterableExtensions.<RecordField>exists(r.getFields(), _function);
  }

  public boolean quantityTypesHaveSameUnits(final QuantityType a, final QuantityType b) {
    boolean _xblockexpression = false;
    {
      if ((a.isScalar() && b.isScalar())) {
        return true;
      }
      if (((a.getUnit() == null) || a.getUnit().equals(this._unitUtil.nullUnitName()))) {
        return false;
      }
      if (((b.getUnit() == null) || b.getUnit().equals(this._unitUtil.nullUnitName()))) {
        return false;
      }
      boolean _equals = a.getUnit().equals(b.getUnit());
      if (_equals) {
        return true;
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }

  public UnitName getUnitName(final Quantity q) {
    UnitName _elvis = null;
    UnitName _unit = q.getUnit();
    if (_unit != null) {
      _elvis = _unit;
    } else {
      UnitName _nullUnitName = this._unitUtil.nullUnitName();
      _elvis = _nullUnitName;
    }
    return _elvis;
  }

  private final String idregex = "[a-zA-Z][[_]?[a-zA-Z0-9]]*";

  public Type getFeatureType(final Feature f) {
    boolean _typeMapIsNull = BlessMaps.typeMapIsNull();
    if (_typeMapIsNull) {
      BlessMaps.makeTypeMap(this._blessIndex.getVisibleTypeDeclarations(f.eResource()));
    }
    if ((f instanceof EventPort)) {
      return this.booleanType();
    }
    final Classifier c = f.getClassifier();
    EList<PropertyAssociation> _ownedPropertyAssociations = c.getOwnedPropertyAssociations();
    for (final PropertyAssociation pa : _ownedPropertyAssociations) {
      boolean _equalsIgnoreCase = pa.getProperty().getQualifiedName().equalsIgnoreCase("BLESS::Typed");
      if (_equalsIgnoreCase) {
        PropertyExpression _ownedValue = IterableExtensions.<ModalPropertyValue>head(pa.getOwnedValues()).getOwnedValue();
        final String str = ((StringLiteral) _ownedValue).getValue();
        return this.getTypeOfString(str);
      }
    }
    return null;
  }

  public Type getTypeOfString(final String str) {
    boolean _startsWith = str.startsWith("boolean");
    if (_startsWith) {
      return this.booleanType();
    }
    if ((str.matches(this.idregex) && BlessMaps.typeMapContainsKey(str))) {
      return BlessMaps.typeMapGet(str).getType();
    }
    boolean _startsWith_1 = str.startsWith("quantity");
    if (_startsWith_1) {
      final QuantityType qt = BLESSFactory.eINSTANCE.createQuantityType();
      boolean _endsWith = str.endsWith("scalar");
      if (_endsWith) {
        qt.setScalar(true);
        return qt;
      }
      boolean _endsWith_1 = str.endsWith("whole");
      if (_endsWith_1) {
        qt.setWhole(true);
        return qt;
      }
      final UnitName un = BLESSFactory.eINSTANCE.createUnitName();
      int _lastIndexOf = str.lastIndexOf(" ");
      int _plus = (_lastIndexOf + 1);
      un.setName(str.substring(_plus));
      qt.setUnit(un);
      return qt;
    }
    return null;
  }

  public QuantityType toQuantityType(final UnitRecord ur) {
    QuantityType _xblockexpression = null;
    {
      final QuantityType qt = BLESSFactory.eINSTANCE.createQuantityType();
      qt.setScalar(ur.isScalar);
      qt.setUnit(ur.rootUnit);
      qt.setWhole(ur.isWhole);
      _xblockexpression = qt;
    }
    return _xblockexpression;
  }

  public String typeString(final Type t) {
    String _xblockexpression = null;
    {
      final StringBuffer sb = new StringBuffer();
      boolean _matched = false;
      if (t instanceof EnumerationType) {
        _matched=true;
        sb.append("enumeration ( ");
        final EnumerationType et = ((EnumerationType) t);
        EList<String> _defining_enumeration_literal = et.getDefining_enumeration_literal();
        for (final String lit : _defining_enumeration_literal) {
          sb.append((lit + " "));
        }
        sb.append(")");
      }
      if (!_matched) {
        if (t instanceof QuantityType) {
          _matched=true;
          final QuantityType qt = ((QuantityType) t);
          sb.append("quantity ");
          UnitName _unit = qt.getUnit();
          boolean _tripleNotEquals = (_unit != null);
          if (_tripleNotEquals) {
            sb.append(qt.getUnit().getName());
          }
          boolean _isScalar = qt.isScalar();
          if (_isScalar) {
            sb.append("scalar");
          }
          boolean _isWhole = qt.isWhole();
          if (_isWhole) {
            sb.append("whole");
          }
        }
      }
      if (!_matched) {
        if (t instanceof ArrayType) {
          _matched=true;
          final ArrayType at = ((ArrayType) t);
          String _typeString = this.typeString(at.getArray_ranges());
          String _plus = ("array [" + _typeString);
          String _plus_1 = (_plus + "] of ");
          String _typeString_1 = this.typeString(at.getTyp());
          String _plus_2 = (_plus_1 + _typeString_1);
          sb.append(_plus_2);
        }
      }
      if (!_matched) {
        if (t instanceof RecordType) {
          _matched=true;
          final RecordType rt = ((RecordType) t);
          String _xifexpression = null;
          boolean _isRecord = rt.isRecord();
          if (_isRecord) {
            _xifexpression = "record (";
          } else {
            _xifexpression = "variant (";
          }
          sb.append(_xifexpression);
          sb.append(this.typeString(IterableExtensions.<RecordField>head(rt.getFields())));
          Iterable<RecordField> _tail = IterableExtensions.<RecordField>tail(rt.getFields());
          for (final RecordField r : _tail) {
            String _typeString = this.typeString(r);
            String _plus = (", " + _typeString);
            sb.append(_plus);
          }
          sb.append(")");
        }
      }
      if (!_matched) {
        if (t instanceof BooleanType) {
          _matched=true;
          sb.append("boolean");
        }
      }
      if (!_matched) {
        if (t instanceof StringType) {
          _matched=true;
          sb.append("string");
        }
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }

  public String typeString(final RecordField rf) {
    String _label = rf.getLabel();
    String _plus = (_label + ":");
    String _typeString = this.typeString(rf.getTyp());
    return (_plus + _typeString);
  }

  public String typeString(final TypeOrReference tod) {
    if ((tod != null)) {
      TypeDeclaration _ref = tod.getRef();
      boolean _tripleNotEquals = (_ref != null);
      if (_tripleNotEquals) {
        return tod.getRef().getName();
      } else {
        return this.typeString(tod.getTy());
      }
    }
    return null;
  }

  public String typeString(final ArrayRangeList arl) {
    String _xblockexpression = null;
    {
      final StringBuffer sb = new StringBuffer();
      sb.append(this.typeString(IterableExtensions.<ArrayRange>head(arl.getRange())));
      Iterable<ArrayRange> _tail = IterableExtensions.<ArrayRange>tail(arl.getRange());
      for (final ArrayRange r : _tail) {
        String _typeString = this.typeString(r);
        String _plus = (", " + _typeString);
        sb.append(_plus);
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }

  public String typeString(final ArrayRange ar) {
    String _xblockexpression = null;
    {
      final StringBuffer sb = new StringBuffer();
      String _lit = ar.getLb().getLit();
      boolean _tripleNotEquals = (_lit != null);
      if (_tripleNotEquals) {
        sb.append(ar.getLb().getLit());
      } else {
        PropertyReference _property = ar.getLb().getProperty();
        boolean _tripleNotEquals_1 = (_property != null);
        if (_tripleNotEquals_1) {
          sb.append(ar.getLb().getProperty());
        } else {
          sb.append(ar.getLb().getPropertyConstant());
        }
      }
      ANumber _ub = ar.getUb();
      boolean _tripleNotEquals_2 = (_ub != null);
      if (_tripleNotEquals_2) {
        sb.append("..");
        String _lit_1 = ar.getUb().getLit();
        boolean _tripleNotEquals_3 = (_lit_1 != null);
        if (_tripleNotEquals_3) {
          sb.append(ar.getUb().getLit());
        } else {
          PropertyReference _property_1 = ar.getUb().getProperty();
          boolean _tripleNotEquals_4 = (_property_1 != null);
          if (_tripleNotEquals_4) {
            sb.append(ar.getUb().getProperty());
          } else {
            sb.append(ar.getUb().getPropertyConstant());
          }
        }
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }

  public Type makeWholeQuantity() {
    QuantityType _xblockexpression = null;
    {
      QuantityType wq = BLESSFactory.eINSTANCE.createQuantityType();
      wq.setWhole(true);
      _xblockexpression = wq;
    }
    return _xblockexpression;
  }

  public boolean isInTypedefAnnex(final EObject o) {
    boolean _xblockexpression = false;
    {
      NamedElement _containingAnnex = AadlUtil.getContainingAnnex(o);
      boolean _tripleEquals = (_containingAnnex == null);
      if (_tripleEquals) {
        return false;
      }
      NamedElement _containingAnnex_1 = AadlUtil.getContainingAnnex(o);
      String _name = null;
      if (_containingAnnex_1!=null) {
        _name=_containingAnnex_1.getName();
      }
      _xblockexpression = _name.equalsIgnoreCase("Typedef");
    }
    return _xblockexpression;
  }

  public boolean relationComparesNull(final Relation r) {
    boolean _xblockexpression = false;
    {
      if (((r.getSym() != null) && ((r.getSym().equals("=") || r.getSym().equals("!=")) || r.getSym().equals("<>")))) {
        if ((((r.getL() != null) && (((AddSub) r.getL()).getSym() == null)) && (((AddSub) r.getL()).getL() != null))) {
          AddSub _l = r.getL();
          MultDiv _l_1 = ((AddSub) _l).getL();
          final MultDiv multDiv = ((MultDiv) _l_1);
          if (((((multDiv.getSym() == null) && (multDiv.getL() != null)) && (((Exp) multDiv.getL()).getSym() == null)) && (((Exp) multDiv.getL()).getL() != null))) {
            Exp _l_2 = multDiv.getL();
            Subexpression _l_3 = ((Exp) _l_2).getL();
            final Subexpression subexpression = ((Subexpression) _l_3);
            if (((subexpression.getUnary() == null) && (subexpression.getTimed_expression().getSubject().getValue() != null))) {
              Value _value = subexpression.getTimed_expression().getSubject().getValue();
              final Value value = ((Value) _value);
              if (((value.getConstant() != null) && (value.getConstant().getNul() != null))) {
                return true;
              }
            }
          }
        }
        if ((((r.getR() != null) && (((AddSub) r.getR()).getSym() == null)) && (((AddSub) r.getR()).getL() != null))) {
          AddSub _r = r.getR();
          MultDiv _l_4 = ((AddSub) _r).getL();
          final MultDiv multDiv_1 = ((MultDiv) _l_4);
          if (((((multDiv_1.getSym() == null) && (multDiv_1.getL() != null)) && (((Exp) multDiv_1.getL()).getSym() == null)) && (((Exp) multDiv_1.getL()).getL() != null))) {
            Exp _l_5 = multDiv_1.getL();
            Subexpression _l_6 = ((Exp) _l_5).getL();
            final Subexpression subexpression_1 = ((Subexpression) _l_6);
            if (((subexpression_1.getUnary() == null) && (subexpression_1.getTimed_expression().getSubject().getValue() != null))) {
              Value _value_1 = subexpression_1.getTimed_expression().getSubject().getValue();
              final Value value_1 = ((Value) _value_1);
              if (((value_1.getConstant() != null) && (value_1.getConstant().getNul() != null))) {
                return true;
              }
            }
          }
        }
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }

  public String convertQuantityToArtTime(final Quantity q) {
    String _xblockexpression = null;
    {
      UnitName _unit = q.getUnit();
      boolean _tripleEquals = (_unit == null);
      if (_tripleEquals) {
        return "**no unit for quantity***";
      }
      final UnitName un = q.getUnit();
      boolean _hasTimeUnit = this._unitUtil.hasTimeUnit(un);
      boolean _not = (!_hasTimeUnit);
      if (_not) {
        return "***quantity must have time unit***";
      }
      final UnitRecord unit_record = this._unitUtil.toUnitRecord(un);
      String _xifexpression = null;
      if (unit_record.multiplyFactor) {
        String _xblockexpression_1 = null;
        {
          final double mf = (unit_record.conversionFactor * 1000);
          _xblockexpression_1 = (("* s64\"" + Double.valueOf(mf)) + "\"");
        }
        _xifexpression = _xblockexpression_1;
      } else {
        String _xblockexpression_2 = null;
        {
          final double df = (unit_record.conversionFactor / 1000.0);
          _xblockexpression_2 = (("/ s64\"" + Double.valueOf(df)) + "\"");
        }
        _xifexpression = _xblockexpression_2;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
