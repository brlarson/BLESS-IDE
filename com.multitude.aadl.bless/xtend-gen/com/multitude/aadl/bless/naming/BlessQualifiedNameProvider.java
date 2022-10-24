package com.multitude.aadl.bless.naming;

import com.multitude.aadl.bless.bLESS.ArrayType;
import com.multitude.aadl.bless.bLESS.CountingQuantification;
import com.multitude.aadl.bless.bLESS.ExistentialLatticeQuantification;
import com.multitude.aadl.bless.bLESS.ExistentialQuantification;
import com.multitude.aadl.bless.bLESS.ForallVariable;
import com.multitude.aadl.bless.bLESS.NamedAssertion;
import com.multitude.aadl.bless.bLESS.NamelessAssertion;
import com.multitude.aadl.bless.bLESS.NamelessEnumeration;
import com.multitude.aadl.bless.bLESS.NamelessFunction;
import com.multitude.aadl.bless.bLESS.ProductQuantification;
import com.multitude.aadl.bless.bLESS.RecordField;
import com.multitude.aadl.bless.bLESS.RecordType;
import com.multitude.aadl.bless.bLESS.StatesSection;
import com.multitude.aadl.bless.bLESS.SumQuantification;
import com.multitude.aadl.bless.bLESS.TypeDeclaration;
import com.multitude.aadl.bless.bLESS.UniversalLatticeQuantification;
import com.multitude.aadl.bless.bLESS.UniversalQuantification;
import com.multitude.aadl.bless.bLESS.Variable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;

@SuppressWarnings("all")
public class BlessQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  private IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();

  private static int recordCount = 1;

  private static int variantCount = 1;

  private static int arrayCount = 1;

  private static int naCount = 1;

  private static int nfCount = 1;

  private static int neCount = 1;

  private static int allCount = 1;

  private static int existsCount = 1;

  private static int sumCount = 1;

  private static int productCount = 1;

  private static int numberofCount = 1;

  private static int elqCount = 1;

  private static int ulqCount = 1;

  private static int tbd = 1;

  @Override
  public QualifiedName getFullyQualifiedName(final EObject obj) {
    QualifiedName _switchResult = null;
    boolean _matched = false;
    if (obj instanceof NamedAssertion) {
      _matched=true;
      QualifiedName _xifexpression = null;
      if (((((NamedAssertion) obj).getName() != null) && (((NamedAssertion) obj).getName().length() > 0))) {
        _xifexpression = this.myContaintersQualifiedName(obj).append(((NamedAssertion) obj).getName());
      } else {
        QualifiedName _myContaintersQualifiedName = this.myContaintersQualifiedName(obj);
        int _plusPlus = BlessQualifiedNameProvider.tbd++;
        String _plus = ("TBD" + Integer.valueOf(_plusPlus));
        _xifexpression = _myContaintersQualifiedName.append(_plus);
      }
      _switchResult = _xifexpression;
    }
    if (!_matched) {
      if (obj instanceof NamelessAssertion) {
        _matched=true;
        int _plusPlus = BlessQualifiedNameProvider.naCount++;
        String _plus = ("NamelessAssertion" + Integer.valueOf(_plusPlus));
        _switchResult = this.converter.toQualifiedName(_plus);
      }
    }
    if (!_matched) {
      if (obj instanceof NamelessFunction) {
        _matched=true;
        int _plusPlus = BlessQualifiedNameProvider.nfCount++;
        String _plus = ("NamelessFunction" + Integer.valueOf(_plusPlus));
        _switchResult = this.converter.toQualifiedName(_plus);
      }
    }
    if (!_matched) {
      if (obj instanceof NamelessEnumeration) {
        _matched=true;
        int _plusPlus = BlessQualifiedNameProvider.neCount++;
        String _plus = ("NamelessEnumeration" + Integer.valueOf(_plusPlus));
        _switchResult = this.converter.toQualifiedName(_plus);
      }
    }
    if (!_matched) {
      if (obj instanceof UniversalQuantification) {
        _matched=true;
        QualifiedName _elvis = null;
        QualifiedName _myContaintersQualifiedName = this.myContaintersQualifiedName(obj);
        QualifiedName _append = null;
        if (_myContaintersQualifiedName!=null) {
          int _plusPlus = BlessQualifiedNameProvider.allCount++;
          String _plus = ("all" + Integer.valueOf(_plusPlus));
          _append=_myContaintersQualifiedName.append(_plus);
        }
        if (_append != null) {
          _elvis = _append;
        } else {
          int _plusPlus_1 = BlessQualifiedNameProvider.allCount++;
          String _plus_1 = ("all" + Integer.valueOf(_plusPlus_1));
          QualifiedName _qualifiedName = this.converter.toQualifiedName(_plus_1);
          _elvis = _qualifiedName;
        }
        _switchResult = _elvis;
      }
    }
    if (!_matched) {
      if (obj instanceof UniversalLatticeQuantification) {
        _matched=true;
        QualifiedName _elvis = null;
        QualifiedName _myContaintersQualifiedName = this.myContaintersQualifiedName(obj);
        QualifiedName _append = null;
        if (_myContaintersQualifiedName!=null) {
          int _plusPlus = BlessQualifiedNameProvider.ulqCount++;
          String _plus = ("ULQ" + Integer.valueOf(_plusPlus));
          _append=_myContaintersQualifiedName.append(_plus);
        }
        if (_append != null) {
          _elvis = _append;
        } else {
          int _plusPlus_1 = BlessQualifiedNameProvider.ulqCount++;
          String _plus_1 = ("ULQ" + Integer.valueOf(_plusPlus_1));
          QualifiedName _qualifiedName = this.converter.toQualifiedName(_plus_1);
          _elvis = _qualifiedName;
        }
        _switchResult = _elvis;
      }
    }
    if (!_matched) {
      if (obj instanceof ExistentialLatticeQuantification) {
        _matched=true;
        QualifiedName _elvis = null;
        QualifiedName _myContaintersQualifiedName = this.myContaintersQualifiedName(obj);
        QualifiedName _append = null;
        if (_myContaintersQualifiedName!=null) {
          int _plusPlus = BlessQualifiedNameProvider.elqCount++;
          String _plus = ("ELQ" + Integer.valueOf(_plusPlus));
          _append=_myContaintersQualifiedName.append(_plus);
        }
        if (_append != null) {
          _elvis = _append;
        } else {
          int _plusPlus_1 = BlessQualifiedNameProvider.elqCount++;
          String _plus_1 = ("ELQ" + Integer.valueOf(_plusPlus_1));
          QualifiedName _qualifiedName = this.converter.toQualifiedName(_plus_1);
          _elvis = _qualifiedName;
        }
        _switchResult = _elvis;
      }
    }
    if (!_matched) {
      if (obj instanceof ExistentialQuantification) {
        _matched=true;
        QualifiedName _elvis = null;
        QualifiedName _myContaintersQualifiedName = this.myContaintersQualifiedName(obj);
        QualifiedName _append = null;
        if (_myContaintersQualifiedName!=null) {
          int _plusPlus = BlessQualifiedNameProvider.existsCount++;
          String _plus = ("exists" + Integer.valueOf(_plusPlus));
          _append=_myContaintersQualifiedName.append(_plus);
        }
        if (_append != null) {
          _elvis = _append;
        } else {
          int _plusPlus_1 = BlessQualifiedNameProvider.existsCount++;
          String _plus_1 = ("exists" + Integer.valueOf(_plusPlus_1));
          QualifiedName _qualifiedName = this.converter.toQualifiedName(_plus_1);
          _elvis = _qualifiedName;
        }
        _switchResult = _elvis;
      }
    }
    if (!_matched) {
      if (obj instanceof SumQuantification) {
        _matched=true;
        QualifiedName _elvis = null;
        QualifiedName _myContaintersQualifiedName = this.myContaintersQualifiedName(obj);
        QualifiedName _append = null;
        if (_myContaintersQualifiedName!=null) {
          int _plusPlus = BlessQualifiedNameProvider.sumCount++;
          String _plus = ("sum" + Integer.valueOf(_plusPlus));
          _append=_myContaintersQualifiedName.append(_plus);
        }
        if (_append != null) {
          _elvis = _append;
        } else {
          int _plusPlus_1 = BlessQualifiedNameProvider.sumCount++;
          String _plus_1 = ("sum" + Integer.valueOf(_plusPlus_1));
          QualifiedName _qualifiedName = this.converter.toQualifiedName(_plus_1);
          _elvis = _qualifiedName;
        }
        _switchResult = _elvis;
      }
    }
    if (!_matched) {
      if (obj instanceof ProductQuantification) {
        _matched=true;
        QualifiedName _elvis = null;
        QualifiedName _myContaintersQualifiedName = this.myContaintersQualifiedName(obj);
        QualifiedName _append = null;
        if (_myContaintersQualifiedName!=null) {
          int _plusPlus = BlessQualifiedNameProvider.productCount++;
          String _plus = ("product" + Integer.valueOf(_plusPlus));
          _append=_myContaintersQualifiedName.append(_plus);
        }
        if (_append != null) {
          _elvis = _append;
        } else {
          int _plusPlus_1 = BlessQualifiedNameProvider.productCount++;
          String _plus_1 = ("product" + Integer.valueOf(_plusPlus_1));
          QualifiedName _qualifiedName = this.converter.toQualifiedName(_plus_1);
          _elvis = _qualifiedName;
        }
        _switchResult = _elvis;
      }
    }
    if (!_matched) {
      if (obj instanceof CountingQuantification) {
        _matched=true;
        QualifiedName _elvis = null;
        QualifiedName _myContaintersQualifiedName = this.myContaintersQualifiedName(obj);
        QualifiedName _append = null;
        if (_myContaintersQualifiedName!=null) {
          int _plusPlus = BlessQualifiedNameProvider.numberofCount++;
          String _plus = ("numberof" + Integer.valueOf(_plusPlus));
          _append=_myContaintersQualifiedName.append(_plus);
        }
        if (_append != null) {
          _elvis = _append;
        } else {
          int _plusPlus_1 = BlessQualifiedNameProvider.numberofCount++;
          String _plus_1 = ("numberof" + Integer.valueOf(_plusPlus_1));
          QualifiedName _qualifiedName = this.converter.toQualifiedName(_plus_1);
          _elvis = _qualifiedName;
        }
        _switchResult = _elvis;
      }
    }
    if (!_matched) {
      if (obj instanceof ForallVariable) {
        _matched=true;
        _switchResult = this.myContaintersQualifiedName(obj).append(((ForallVariable)obj).getName());
      }
    }
    if (!_matched) {
      if (obj instanceof Variable) {
        _matched=true;
        _switchResult = this.myContaintersQualifiedName(obj).append(((Variable)obj).getName());
      }
    }
    if (!_matched) {
      if (obj instanceof TypeDeclaration) {
        _matched=true;
        QualifiedName _xifexpression = null;
        if (((((TypeDeclaration) obj).getName() != null) && (((TypeDeclaration) obj).getName().length() > 0))) {
          _xifexpression = this.myContaintersQualifiedName(obj).append(((TypeDeclaration) obj).getName());
        } else {
          QualifiedName _myContaintersQualifiedName = this.myContaintersQualifiedName(obj);
          int _plusPlus = BlessQualifiedNameProvider.tbd++;
          String _plus = ("TBD" + Integer.valueOf(_plusPlus));
          _xifexpression = _myContaintersQualifiedName.append(_plus);
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (obj instanceof RecordType) {
        _matched=true;
        QualifiedName _xifexpression = null;
        boolean _isRecord = ((RecordType) obj).isRecord();
        if (_isRecord) {
          int _plusPlus = BlessQualifiedNameProvider.recordCount++;
          String _plus = ("Record" + Integer.valueOf(_plusPlus));
          _xifexpression = this.converter.toQualifiedName(_plus);
        } else {
          QualifiedName _xifexpression_1 = null;
          boolean _isVariant = ((RecordType) obj).isVariant();
          if (_isVariant) {
            int _plusPlus_1 = BlessQualifiedNameProvider.variantCount++;
            String _plus_1 = ("Variant" + Integer.valueOf(_plusPlus_1));
            _xifexpression_1 = this.converter.toQualifiedName(_plus_1);
          }
          _xifexpression = _xifexpression_1;
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (obj instanceof RecordField) {
        _matched=true;
        QualifiedName _xifexpression = null;
        if (((((RecordField) obj).getLabel() != null) && (((RecordField) obj).getLabel().length() > 0))) {
          _xifexpression = this.myContaintersQualifiedName(obj).append(((RecordField) obj).getLabel());
        } else {
          QualifiedName _myContaintersQualifiedName = this.myContaintersQualifiedName(obj);
          int _plusPlus = BlessQualifiedNameProvider.tbd++;
          String _plus = ("TBD" + Integer.valueOf(_plusPlus));
          _xifexpression = _myContaintersQualifiedName.append(_plus);
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (obj instanceof ArrayType) {
        _matched=true;
        int _plusPlus = BlessQualifiedNameProvider.arrayCount++;
        String _plus = ("ArrayType" + Integer.valueOf(_plusPlus));
        _switchResult = this.converter.toQualifiedName(_plus);
      }
    }
    if (!_matched) {
      if (obj instanceof StatesSection) {
        _matched=true;
        QualifiedName _elvis = null;
        QualifiedName _myContaintersQualifiedName = this.myContaintersQualifiedName(obj);
        QualifiedName _append = null;
        if (_myContaintersQualifiedName!=null) {
          _append=_myContaintersQualifiedName.append("states");
        }
        if (_append != null) {
          _elvis = _append;
        } else {
          QualifiedName _qualifiedName = this.converter.toQualifiedName("states");
          _elvis = _qualifiedName;
        }
        _switchResult = _elvis;
      }
    }
    if (!_matched) {
      _switchResult = super.getFullyQualifiedName(obj);
    }
    return _switchResult;
  }

  public QualifiedName myContaintersQualifiedName(final EObject obj) {
    QualifiedName _xblockexpression = null;
    {
      final QualifiedName fqn = this.getFullyQualifiedName(obj.eContainer());
      if (((fqn != null) && (fqn.getSegmentCount() > 0))) {
        return fqn;
      }
      final QualifiedName cqn = this.myContaintersQualifiedName(obj.eContainer());
      if (((cqn != null) && (cqn.getSegmentCount() > 0))) {
        return cqn;
      }
      _xblockexpression = QualifiedName.create("bless_root");
    }
    return _xblockexpression;
  }
}
