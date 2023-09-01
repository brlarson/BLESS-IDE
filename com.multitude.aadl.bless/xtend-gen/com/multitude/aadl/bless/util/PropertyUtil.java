package com.multitude.aadl.bless.util;

import com.google.inject.Inject;
import com.multitude.aadl.bless.bLESS.BLESSFactory;
import com.multitude.aadl.bless.bLESS.QuantityType;
import com.multitude.aadl.bless.bLESS.RecordField;
import com.multitude.aadl.bless.bLESS.Type;
import com.multitude.aadl.bless.bLESS.TypeOrReference;
import com.multitude.aadl.bless.bLESS.UnitName;
import com.multitude.aadl.bless.scoping.BlessIndex;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Extension;
import org.osate.aadl2.AadlBoolean;
import org.osate.aadl2.AadlInteger;
import org.osate.aadl2.AadlReal;
import org.osate.aadl2.AadlString;
import org.osate.aadl2.BasicProperty;
import org.osate.aadl2.ClassifierType;
import org.osate.aadl2.EnumerationLiteral;
import org.osate.aadl2.EnumerationType;
import org.osate.aadl2.NumberType;
import org.osate.aadl2.Property;
import org.osate.aadl2.PropertyExpression;
import org.osate.aadl2.PropertyType;
import org.osate.aadl2.RangeType;
import org.osate.aadl2.RecordType;
import org.osate.aadl2.ReferenceType;
import org.osate.aadl2.UnitsType;

@SuppressWarnings("all")
public class PropertyUtil {
  @Inject
  @Extension
  private BlessIndex _blessIndex;

  public UnitName getUnitName(final EObject context, final UnitsType e) {
    return this._blessIndex.findUnitNameFromString(context, e.getName());
  }

  public String toRealLiteral(final PropertyExpression e) {
    String _xifexpression = null;
    if ((e instanceof AadlReal)) {
      _xifexpression = ((AadlReal) e).toString();
    } else {
      _xifexpression = "not-a-real";
    }
    return _xifexpression;
  }

  public String toWholeLiteral(final PropertyExpression e) {
    String _xifexpression = null;
    if ((e instanceof AadlInteger)) {
      _xifexpression = ((AadlInteger) e).toString();
    } else {
      _xifexpression = "not-a-whole";
    }
    return _xifexpression;
  }

  public Type getType(final Property e) {
    Type _xblockexpression = null;
    {
      boolean _eIsProxy = e.eIsProxy();
      if (_eIsProxy) {
        EcoreUtil.resolve(e, this._blessIndex.getResourceSet(e));
      }
      Type _elvis = null;
      PropertyType _referencedPropertyType = e.getReferencedPropertyType();
      Type _type = null;
      if (_referencedPropertyType!=null) {
        _type=this.getType(_referencedPropertyType);
      }
      if (_type != null) {
        _elvis = _type;
      } else {
        Type _type_1 = this.getType(e.getOwnedPropertyType());
        _elvis = _type_1;
      }
      _xblockexpression = _elvis;
    }
    return _xblockexpression;
  }

  public Type getType(final BasicProperty e) {
    Type _xblockexpression = null;
    {
      boolean _eIsProxy = e.eIsProxy();
      if (_eIsProxy) {
        EcoreUtil.resolve(e, this._blessIndex.getResourceSet(e));
      }
      Type _elvis = null;
      PropertyType _referencedPropertyType = e.getReferencedPropertyType();
      Type _type = null;
      if (_referencedPropertyType!=null) {
        _type=this.getType(_referencedPropertyType);
      }
      if (_type != null) {
        _elvis = _type;
      } else {
        Type _type_1 = this.getType(e.getOwnedPropertyType());
        _elvis = _type_1;
      }
      _xblockexpression = _elvis;
    }
    return _xblockexpression;
  }

  public Type getType(final PropertyType e) {
    Type _xblockexpression = null;
    {
      boolean _eIsProxy = e.eIsProxy();
      if (_eIsProxy) {
        EcoreUtil.resolve(e, this._blessIndex.getResourceSet(e));
      }
      Type _switchResult = null;
      boolean _matched = false;
      if (e instanceof AadlBoolean) {
        _matched=true;
        _switchResult = BLESSFactory.eINSTANCE.createBooleanType();
      }
      if (!_matched) {
        if (e instanceof AadlString) {
          _matched=true;
          _switchResult = BLESSFactory.eINSTANCE.createStringType();
        }
      }
      if (!_matched) {
        if (e instanceof AadlReal) {
          _matched=true;
          _switchResult = this.getType(((AadlReal) e));
        }
      }
      if (!_matched) {
        if (e instanceof AadlInteger) {
          _matched=true;
          _switchResult = this.getType(((AadlInteger) e));
        }
      }
      if (!_matched) {
        if (e instanceof RangeType) {
          _matched=true;
          _switchResult = this.getType(((RangeType) e));
        }
      }
      if (!_matched) {
        if (e instanceof UnitsType) {
          _matched=true;
          _switchResult = null;
        }
      }
      if (!_matched) {
        if (e instanceof ClassifierType) {
          _matched=true;
          _switchResult = null;
        }
      }
      if (!_matched) {
        if (e instanceof ReferenceType) {
          _matched=true;
          _switchResult = null;
        }
      }
      if (!_matched) {
        if (e instanceof RecordType) {
          _matched=true;
          _switchResult = this.getType(((RecordType) e));
        }
      }
      if (!_matched) {
        if (e instanceof EnumerationType) {
          _matched=true;
          _switchResult = this.getType(((EnumerationType) e));
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }

  public Type getType(final RecordType e) {
    com.multitude.aadl.bless.bLESS.RecordType _xblockexpression = null;
    {
      final com.multitude.aadl.bless.bLESS.RecordType retval = BLESSFactory.eINSTANCE.createRecordType();
      EList<BasicProperty> _ownedFields = e.getOwnedFields();
      for (final BasicProperty rt : _ownedFields) {
        retval.getFields().add(this.toBlessRecordField(rt));
      }
      _xblockexpression = retval;
    }
    return _xblockexpression;
  }

  public RecordField toBlessRecordField(final BasicProperty rt) {
    RecordField _xblockexpression = null;
    {
      final RecordField retval = BLESSFactory.eINSTANCE.createRecordField();
      retval.setLabel(rt.getName());
      final TypeOrReference tod = BLESSFactory.eINSTANCE.createTypeOrReference();
      tod.setTy(this.getType(rt));
      retval.setTyp(tod);
      _xblockexpression = retval;
    }
    return _xblockexpression;
  }

  public Type getType(final AadlBoolean e) {
    return BLESSFactory.eINSTANCE.createBooleanType();
  }

  public Type getType(final AadlString e) {
    return BLESSFactory.eINSTANCE.createStringType();
  }

  public Type getType(final EnumerationType e) {
    com.multitude.aadl.bless.bLESS.EnumerationType _xblockexpression = null;
    {
      com.multitude.aadl.bless.bLESS.EnumerationType et = BLESSFactory.eINSTANCE.createEnumerationType();
      EList<EnumerationLiteral> _ownedLiterals = e.getOwnedLiterals();
      for (final EnumerationLiteral lit : _ownedLiterals) {
        et.getDefining_enumeration_literal().add(lit.getName());
      }
      _xblockexpression = et;
    }
    return _xblockexpression;
  }

  public Type getType(final AadlReal e) {
    QuantityType _xblockexpression = null;
    {
      QuantityType ar = BLESSFactory.eINSTANCE.createQuantityType();
      UnitsType _referencedUnitsType = e.getReferencedUnitsType();
      boolean _tripleNotEquals = (_referencedUnitsType != null);
      if (_tripleNotEquals) {
        ar.setUnit(this.getUnitName(e, e.getReferencedUnitsType()));
      } else {
        ar.setScalar("scalar");
      }
      _xblockexpression = ar;
    }
    return _xblockexpression;
  }

  public Type getType(final AadlInteger e) {
    QuantityType _xblockexpression = null;
    {
      QuantityType ar = BLESSFactory.eINSTANCE.createQuantityType();
      UnitsType _referencedUnitsType = e.getReferencedUnitsType();
      boolean _tripleNotEquals = (_referencedUnitsType != null);
      if (_tripleNotEquals) {
        ar.setUnit(this.getUnitName(e, e.getReferencedUnitsType()));
      } else {
        ar.setWhole("whole");
      }
      _xblockexpression = ar;
    }
    return _xblockexpression;
  }

  public Type getType(final RangeType e) {
    NumberType _ownedNumberType = e.getOwnedNumberType();
    boolean _tripleNotEquals = (_ownedNumberType != null);
    if (_tripleNotEquals) {
      NumberType _ownedNumberType_1 = e.getOwnedNumberType();
      if ((_ownedNumberType_1 instanceof AadlInteger)) {
        NumberType _ownedNumberType_2 = e.getOwnedNumberType();
        return this.getType(((AadlInteger) _ownedNumberType_2));
      }
      NumberType _ownedNumberType_3 = e.getOwnedNumberType();
      if ((_ownedNumberType_3 instanceof AadlReal)) {
        NumberType _ownedNumberType_4 = e.getOwnedNumberType();
        return this.getType(((AadlReal) _ownedNumberType_4));
      }
    } else {
      return this.getType(e.getReferencedNumberType());
    }
    return null;
  }
}
