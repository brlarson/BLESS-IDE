package com.multitude.aadl.bless.util;

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
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.EventPort;
import org.osate.aadl2.Feature;
import org.osate.aadl2.ModalPropertyValue;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.Property;
import org.osate.aadl2.PropertyAssociation;
import org.osate.aadl2.PropertyConstant;
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
      final RecordType bRecord = ((RecordType) b);
      EList<RecordField> _fields = ((RecordType) a).getFields();
      for (final RecordField aField : _fields) {
        boolean _recordHasFieldWith = this.recordHasFieldWith(bRecord, aField.getLabel(), this.getType(aField.getTyp()));
        boolean _not = (!_recordHasFieldWith);
        if (_not) {
          return false;
        }
      }
      return true;
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
    Type _elvis = null;
    Type _ty = null;
    if (tod!=null) {
      _ty=tod.getTy();
    }
    if (_ty != null) {
      _elvis = _ty;
    } else {
      TypeDeclaration _ref = null;
      if (tod!=null) {
        _ref=tod.getRef();
      }
      Type _type = _ref.getType();
      _elvis = _type;
    }
    return _elvis;
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
      for (int i = 0; (i < c.getRange().size()); i++) {
        boolean _sameArrayRange = this.sameArrayRange(c.getRange().get(i), d.getRange().get(i));
        boolean _not = (!_sameArrayRange);
        if (_not) {
          return false;
        }
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }

  public boolean sameArrayRange(final ArrayRange e, final ArrayRange f) {
    return (this.getStringValue(e.getLb()).equals(this.getStringValue(f.getLb())) && this.getStringValue(e.getUb()).equals(this.getStringValue(f.getUb())));
  }

  public String getStringValue(final ANumber n) {
    String _elvis = null;
    String _elvis_1 = null;
    String _elvis_2 = null;
    String _elvis_3 = null;
    String _lit = null;
    if (n!=null) {
      _lit=n.getLit();
    }
    if (_lit != null) {
      _elvis_3 = _lit;
    } else {
      PropertyReference _property = null;
      if (n!=null) {
        _property=n.getProperty();
      }
      Property _pname = null;
      if (_property!=null) {
        _pname=_property.getPname();
      }
      String _name = _pname.getName();
      _elvis_3 = _name;
    }
    if (_elvis_3 != null) {
      _elvis_2 = _elvis_3;
    } else {
      PropertyReference _property_1 = null;
      if (n!=null) {
        _property_1=n.getProperty();
      }
      Property _spname = null;
      if (_property_1!=null) {
        _spname=_property_1.getSpname();
      }
      String _name_1 = _spname.getName();
      _elvis_2 = _name_1;
    }
    if (_elvis_2 != null) {
      _elvis_1 = _elvis_2;
    } else {
      PropertyReference _property_2 = null;
      if (n!=null) {
        _property_2=n.getProperty();
      }
      ComponentClassifier _component = null;
      if (_property_2!=null) {
        _component=_property_2.getComponent();
      }
      String _string = _component.getPropertyValue(n.getProperty().getCpname()).toString();
      _elvis_1 = _string;
    }
    if (_elvis_1 != null) {
      _elvis = _elvis_1;
    } else {
      PropertyConstant _propertyConstant = null;
      if (n!=null) {
        _propertyConstant=n.getPropertyConstant();
      }
      String _string_1 = _propertyConstant.getConstantValue().toString();
      _elvis = _string_1;
    }
    return _elvis;
  }

  public boolean recordHasFieldWith(final RecordType r, final String label, final Type typ) {
    final Function1<RecordField, Boolean> _function = (RecordField u) -> {
      return Boolean.valueOf(((u.getLabel().compareTo(label) == 0) && this.sameStructuralType(this.getType(u.getTyp()), typ)));
    };
    return IterableExtensions.<RecordField>exists(r.getFields(), _function);
  }

  public boolean quantityTypesHaveSameUnits(final QuantityType a, final QuantityType b) {
    boolean _xblockexpression = false;
    {
      if (((a.getScalar() != null) && (b.getScalar() != null))) {
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
    boolean _startsWith_1 = str.startsWith("quantity");
    if (_startsWith_1) {
      final QuantityType qt = BLESSFactory.eINSTANCE.createQuantityType();
      boolean _endsWith = str.endsWith("scalar");
      if (_endsWith) {
        qt.setScalar("scalar");
        return qt;
      }
      boolean _endsWith_1 = str.endsWith("whole");
      if (_endsWith_1) {
        qt.setWhole("whole");
        return qt;
      }
      final UnitName un = BLESSFactory.eINSTANCE.createUnitName();
      int _lastIndexOf = str.lastIndexOf(" ");
      int _plus = (_lastIndexOf + 1);
      un.setName(str.substring(_plus));
      qt.setUnit(un);
      return qt;
    }
    if ((str.matches(this.idregex) && BlessMaps.typeMapContainsKey(str))) {
      return BlessMaps.typeMapGet(str).getType();
    }
    return null;
  }

  public QuantityType toQuantityType(final UnitRecord ur) {
    QuantityType _xblockexpression = null;
    {
      final QuantityType qt = BLESSFactory.eINSTANCE.createQuantityType();
      if ((ur.rootUnit != null)) {
        qt.setUnit(ur.rootUnit);
      } else {
        if (ur.isScalar) {
          qt.setScalar("scalar");
        } else {
          if (ur.isWhole) {
            qt.setWhole("whole");
          }
        }
      }
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
          String _scalar = qt.getScalar();
          boolean _tripleNotEquals_1 = (_scalar != null);
          if (_tripleNotEquals_1) {
            sb.append("scalar");
          }
          String _whole = qt.getWhole();
          boolean _tripleNotEquals_2 = (_whole != null);
          if (_tripleNotEquals_2) {
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
      ANumber _lb = ar.getLb();
      boolean _tripleNotEquals = (_lb != null);
      if (_tripleNotEquals) {
        String _lit = ar.getLb().getLit();
        boolean _tripleNotEquals_1 = (_lit != null);
        if (_tripleNotEquals_1) {
          sb.append(ar.getLb().getLit());
        } else {
          PropertyReference _property = ar.getLb().getProperty();
          boolean _tripleNotEquals_2 = (_property != null);
          if (_tripleNotEquals_2) {
            sb.append(ar.getLb().getProperty());
          } else {
            sb.append(ar.getLb().getPropertyConstant());
          }
        }
      }
      ANumber _ub = ar.getUb();
      boolean _tripleNotEquals_3 = (_ub != null);
      if (_tripleNotEquals_3) {
        sb.append("..");
        String _lit_1 = ar.getUb().getLit();
        boolean _tripleNotEquals_4 = (_lit_1 != null);
        if (_tripleNotEquals_4) {
          sb.append(ar.getUb().getLit());
        } else {
          PropertyReference _property_1 = ar.getUb().getProperty();
          boolean _tripleNotEquals_5 = (_property_1 != null);
          if (_tripleNotEquals_5) {
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
      wq.setWhole("whole");
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
