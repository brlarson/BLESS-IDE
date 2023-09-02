package com.multitude.aadl.bless.util;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.multitude.aadl.bless.bLESS.BLESSFactory;
import com.multitude.aadl.bless.bLESS.QuantityType;
import com.multitude.aadl.bless.bLESS.RootDeclaration;
import com.multitude.aadl.bless.bLESS.UnitFactor;
import com.multitude.aadl.bless.bLESS.UnitName;
import com.multitude.aadl.bless.exception.ValidationException;
import com.multitude.aadl.bless.scoping.BlessIndex;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class UnitUtil {
  @Inject
  @Extension
  private BlessIndex _blessIndex;

  public UnitName nullUnitName() {
    return BLESSFactory.eINSTANCE.createUnitName();
  }

  /**
   * is this string a negative number?
   */
  public boolean nonnegativeNumber(final String s) {
    boolean _startsWith = s.startsWith("-");
    return (!_startsWith);
  }

  /**
   * is this UnitName a base type?
   */
  public boolean isBaseType(final UnitName ul) {
    boolean _xblockexpression = false;
    {
      EObject _eContainer = null;
      if (ul!=null) {
        _eContainer=ul.eContainer();
      }
      if ((_eContainer instanceof RootDeclaration)) {
        EObject _eContainer_1 = ul.eContainer();
        return ((RootDeclaration) _eContainer_1).isBase();
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }

  /**
   * is this identifier all letters
   */
  public boolean allLetters(final String s) {
    boolean _xblockexpression = false;
    {
      final char[] chars = s.toCharArray();
      int _size = ((List<Character>)Conversions.doWrapArray(chars)).size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for (final Integer i : _doubleDotLessThan) {
        if (((!((chars[(i).intValue()] >= 'a') && (chars[(i).intValue()] <= 'z'))) && (!((chars[(i).intValue()] >= 'A') && (chars[(i).intValue()] <= 'Z'))))) {
          return false;
        }
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }

  public boolean sameUnitRoot(final UnitName u1, final UnitName u2) {
    return ((u1.getName().compareTo(u2.getName()) == 0) || Objects.equal(this._blessIndex.getRootUnit(u1), this._blessIndex.getRootUnit(u2)));
  }

  public boolean sameUnitRoot(final Iterable<UnitName> unitSet) {
    boolean _xblockexpression = false;
    {
      final Function1<UnitName, UnitName> _function = (UnitName u) -> {
        return this._blessIndex.getRootUnit(u);
      };
      final Iterable<UnitName> rootSet = IterableExtensions.<UnitName, UnitName>map(unitSet, _function);
      final Function1<UnitName, Boolean> _function_1 = (UnitName r) -> {
        UnitName _last = IterableExtensions.<UnitName>last(rootSet);
        return Boolean.valueOf(Objects.equal(_last, r));
      };
      _xblockexpression = IterableExtensions.<UnitName>forall(rootSet, _function_1);
    }
    return _xblockexpression;
  }

  public UnitRecord toUnitRecord(final QuantityType t) {
    UnitRecord _xblockexpression = null;
    {
      final UnitRecord ur = new UnitRecord();
      final UnitName un = t.getUnit();
      String _scalar = t.getScalar();
      boolean _tripleNotEquals = (_scalar != null);
      ur.isScalar = _tripleNotEquals;
      String _whole = t.getWhole();
      boolean _tripleNotEquals_1 = (_whole != null);
      ur.isWhole = _tripleNotEquals_1;
      try {
        if ((un != null)) {
          ur.rootUnit = this._blessIndex.getRootUnit(un);
          if ((ur.rootUnit == null)) {
            String _name = un.getName();
            String _plus = ("No root unit forund for unit \"" + _name);
            String _plus_1 = (_plus + "\"");
            throw new ValidationException(_plus_1);
          }
          RootDeclaration rd = this._blessIndex.getRootDeclaration(ur.rootUnit);
          ur.isBase = rd.isBase();
          if (ur.isBase) {
            ur.top.add(ur.rootUnit.getName());
          } else {
            EList<UnitName> _top = rd.getFormula().getTop();
            for (final UnitName unt : _top) {
              ur.top.add(unt.getName());
            }
            EList<UnitName> _bottom = rd.getFormula().getBottom();
            for (final UnitName b : _bottom) {
              ur.bottom.add(b.getName());
            }
          }
          ur.isScalar = false;
          ur.isWhole = false;
        }
      } catch (final Throwable _t) {
        if (_t instanceof ValidationException) {
          final ValidationException ve = (ValidationException)_t;
          ve.handleException();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = ur;
    }
    return _xblockexpression;
  }

  public UnitRecord toUnitRecord(final UnitName unit) {
    UnitRecord _xblockexpression = null;
    {
      UnitRecord retval = null;
      EObject _eContainer = unit.eContainer();
      if ((_eContainer instanceof RootDeclaration)) {
        EObject _eContainer_1 = unit.eContainer();
        final RootDeclaration root = ((RootDeclaration) _eContainer_1);
        boolean _isBase = root.isBase();
        if (_isBase) {
          boolean _isBaseType = this.isBaseType(unit);
          UnitName _rootUnit = this._blessIndex.getRootUnit(unit);
          EList<UnitName> _singletonEList = ECollections.<UnitName>singletonEList(unit);
          EList<UnitName> _emptyEList = ECollections.<UnitName>emptyEList();
          UnitRecord _unitRecord = new UnitRecord(_isBaseType, unit, _rootUnit, _singletonEList, _emptyEList, false, false, false, 1.0);
          retval = _unitRecord;
        } else {
          boolean _isBaseType_1 = this.isBaseType(unit);
          UnitName _rootUnit_1 = this._blessIndex.getRootUnit(unit);
          EList<UnitName> _top = root.getFormula().getTop();
          EList<UnitName> _bottom = root.getFormula().getBottom();
          UnitRecord _unitRecord_1 = new UnitRecord(_isBaseType_1, unit, _rootUnit_1, _top, _bottom, false, false, false, 1.0);
          retval = _unitRecord_1;
        }
      } else {
        final RootDeclaration root_1 = this._blessIndex.getRootDeclaration(unit);
        EObject _eContainer_2 = unit.eContainer();
        final UnitFactor uf = ((UnitFactor) _eContainer_2);
        boolean _isBase_1 = root_1.isBase();
        if (_isBase_1) {
          boolean _isBaseType_2 = this.isBaseType(unit);
          UnitName _rootUnit_2 = this._blessIndex.getRootUnit(unit);
          EList<UnitName> _singletonEList_1 = ECollections.<UnitName>singletonEList(root_1.getUnitName());
          EList<UnitName> _emptyEList_1 = ECollections.<UnitName>emptyEList();
          boolean _equals = uf.getOp().equals("*");
          boolean _equals_1 = uf.getOp().equals("/");
          Double _valueOf = Double.valueOf(uf.getFactor());
          UnitRecord _unitRecord_2 = new UnitRecord(_isBaseType_2, unit, _rootUnit_2, _singletonEList_1, _emptyEList_1, false, _equals, _equals_1, (_valueOf).doubleValue());
          retval = _unitRecord_2;
        } else {
          boolean _isBaseType_3 = this.isBaseType(unit);
          UnitName _rootUnit_3 = this._blessIndex.getRootUnit(unit);
          EList<UnitName> _top_1 = root_1.getFormula().getTop();
          EList<UnitName> _bottom_1 = root_1.getFormula().getBottom();
          boolean _equals_2 = uf.getOp().equals("*");
          boolean _equals_3 = uf.getOp().equals("/");
          Double _valueOf_1 = Double.valueOf(uf.getFactor());
          UnitRecord _unitRecord_3 = new UnitRecord(_isBaseType_3, unit, _rootUnit_3, _top_1, _bottom_1, false, _equals_2, _equals_3, (_valueOf_1).doubleValue());
          retval = _unitRecord_3;
        }
      }
      _xblockexpression = retval;
    }
    return _xblockexpression;
  }

  public UnitRecord scalar() {
    return new UnitRecord(false, null, null, null, null, true, false, false, 1.0, false, false);
  }

  public UnitRecord whole() {
    return new UnitRecord(false, null, null, null, null, false, false, false, 1.0, true, false);
  }

  public UnitRecord nan() {
    return new UnitRecord(false, null, null, null, null, false, false, false, 1.0, false, true);
  }

  public EList<UnitName> sort(final EList<UnitName> list) {
    Collections.<UnitName>sort(list, 
      new Comparator<UnitName>() {
        @Override
        public int compare(final UnitName o1, final UnitName o2) {
          return o1.getName().compareTo(o2.getName());
        }
      });
    return list;
  }

  public boolean hasTimeUnit(final UnitName u) {
    boolean _xblockexpression = false;
    {
      final UnitName un = this._blessIndex.findUnitNameFromString(u, "s");
      _xblockexpression = this.sameUnitRoot(u, un);
    }
    return _xblockexpression;
  }

  public String getConversionToRootUnit(final UnitName u) {
    final UnitRecord rec = this.toUnitRecord(u);
    String _xifexpression = null;
    if (rec.multiplyFactor) {
      _xifexpression = " / ";
    } else {
      _xifexpression = " * ";
    }
    return (_xifexpression + Double.valueOf(rec.conversionFactor));
  }

  public String getConversionFromRootUnit(final UnitName u) {
    final UnitRecord rec = this.toUnitRecord(u);
    String _xifexpression = null;
    if (rec.multiplyFactor) {
      _xifexpression = " * ";
    } else {
      _xifexpression = " / ";
    }
    return (_xifexpression + Double.valueOf(rec.conversionFactor));
  }
}
