package com.multitude.aadl.bless.util;

import com.multitude.aadl.bless.bLESS.UnitName;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class UnitRecord {
  public boolean isBase = false;

  public UnitName rootUnit;

  public UnitName myUnit;

  public double conversionFactor = 1.0;

  public List<String> top = new ArrayList<String>();

  public List<String> bottom = new ArrayList<String>();

  public boolean isScalar = false;

  public boolean multiplyFactor = false;

  public boolean divideFactor = false;

  public boolean isWhole = false;

  public boolean notANumber = false;

  public UnitRecord() {
  }

  public UnitRecord(final boolean isbase, final UnitName myunit, final UnitName rootunit, final EList<UnitName> t, final EList<UnitName> b, final boolean isscalar, final boolean mult, final boolean div, final double factor) {
    this.isBase = isbase;
    this.myUnit = myunit;
    this.rootUnit = rootunit;
    if ((t != null)) {
      for (final UnitName un : t) {
        this.top.add(un.getName());
      }
    }
    if ((b != null)) {
      for (final UnitName un_1 : b) {
        this.bottom.add(un_1.getName());
      }
    }
    this.isScalar = isscalar;
    this.multiplyFactor = mult;
    this.divideFactor = div;
    this.conversionFactor = factor;
  }

  public UnitRecord(final boolean isbase, final UnitName myunit, final UnitName rootunit, final List<String> t, final List<String> b, final boolean isscalar, final boolean mult, final boolean div, final double factor, final boolean iswhole, final boolean nan) {
    this.isBase = isbase;
    this.myUnit = myunit;
    this.rootUnit = rootunit;
    this.top = t;
    this.bottom = b;
    this.isScalar = isscalar;
    this.multiplyFactor = mult;
    this.divideFactor = div;
    this.conversionFactor = factor;
    this.isWhole = iswhole;
    this.notANumber = nan;
  }

  public UnitRecord copy() {
    return new UnitRecord(this.isBase, this.myUnit, this.rootUnit, this.top, this.bottom, this.isScalar, this.multiplyFactor, this.divideFactor, this.conversionFactor, 
      this.isWhole, this.notANumber);
  }

  public void sort() {
    if (this.top!=null) {
      IterableExtensions.<String>sort(this.top);
    }
    if (this.bottom!=null) {
      IterableExtensions.<String>sort(this.bottom);
    }
  }

  public void removeCommonUnits() {
    this.sort();
    Iterator<String> topIter = this.top.iterator();
    List<String> newTop = new ArrayList<String>();
    while (topIter.hasNext()) {
      {
        String un = topIter.next();
        boolean _contains = this.bottom.contains(un);
        if (_contains) {
          this.bottom.remove(un);
        } else {
          newTop.add(un);
        }
      }
    }
    this.top = newTop;
  }

  public void multiply(final UnitRecord ur) {
    if (ur.isScalar) {
      return;
    }
    this.top.addAll(ur.top);
    this.bottom.addAll(ur.bottom);
    this.removeCommonUnits();
    this.isScalar = (this.top.isEmpty() && this.bottom.isEmpty());
  }

  public void divide(final UnitRecord ur) {
    this.top.addAll(ur.bottom);
    this.bottom.addAll(ur.top);
    final Comparator<String> _function = (String o1, String o2) -> {
      return o1.compareTo(o2);
    };
    this.top.sort(_function);
    this.removeCommonUnits();
    this.isScalar = (this.top.isEmpty() && this.bottom.isEmpty());
  }

  public boolean sameRootUnit(final UnitRecord ur) {
    if ((((this.rootUnit != null) && (ur.rootUnit != null)) && (this.rootUnit == ur.rootUnit))) {
      return true;
    } else {
      return (this.top.equals(ur.top) && this.bottom.equals(ur.bottom));
    }
  }

  public boolean matchTopAndBottom(final UnitRecord ur) {
    if ((this.notANumber && ur.notANumber)) {
      return true;
    }
    if ((this.notANumber && (!ur.notANumber))) {
      return false;
    }
    if (((!this.notANumber) && ur.notANumber)) {
      return false;
    }
    if (((this.isScalar || this.isWhole) && (ur.isScalar || ur.isWhole))) {
      return true;
    }
    if (((!(this.isScalar || this.isWhole)) && (ur.isScalar || ur.isWhole))) {
      return false;
    }
    if (((this.isScalar || this.isWhole) && (!(ur.isScalar || ur.isWhole)))) {
      return false;
    }
    if (((this.top == null) && (ur.top != null))) {
      return false;
    }
    if (((this.top != null) && (ur.top == null))) {
      return false;
    }
    if (((this.bottom == null) && (ur.bottom != null))) {
      return false;
    }
    if (((this.bottom != null) && (ur.bottom == null))) {
      return false;
    }
    if ((((this.top != null) && (ur.top != null)) && (this.top.size() != ur.top.size()))) {
      return false;
    }
    if ((((this.bottom != null) && (ur.bottom != null)) && (this.bottom.size() != ur.bottom.size()))) {
      return false;
    }
    this.sort();
    ur.sort();
    if ((this.top != null)) {
      for (int t = 0; (t < this.top.size()); t++) {
        boolean _contentEquals = this.top.get(t).contentEquals(ur.top.get(t));
        boolean _not = (!_contentEquals);
        if (_not) {
          return false;
        }
      }
    }
    if ((this.bottom != null)) {
      for (int b = 0; (b < this.bottom.size()); b++) {
        boolean _contentEquals = this.bottom.get(b).contentEquals(ur.bottom.get(b));
        boolean _not = (!_contentEquals);
        if (_not) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer();
    if (this.isScalar) {
      sb.append("scalar");
    } else {
      if (this.isWhole) {
        sb.append("whole");
      } else {
        if (this.notANumber) {
          sb.append("not-a-number");
        } else {
          if (((this.top == null) || this.top.isEmpty())) {
            sb.append("1");
          } else {
            if ((this.top != null)) {
              for (final String t : this.top) {
                sb.append(t);
              }
            }
          }
          if (((this.bottom != null) && (!this.bottom.isEmpty()))) {
            sb.append("/");
            for (final String b : this.bottom) {
              sb.append(b);
            }
          }
        }
      }
    }
    return sb.toString();
  }
}
