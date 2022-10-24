package com.multitude.aadl.bless.scoping;

import java.util.Collections;
import java.util.List;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class BlessImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  @Override
  public List<ImportNormalizer> getImplicitImports(final boolean ignoreCase) {
    QualifiedName _create = QualifiedName.create("SI", "SI_public", "Unit", "Unit");
    ImportNormalizer _importNormalizer = new ImportNormalizer(_create, true, ignoreCase);
    QualifiedName _create_1 = QualifiedName.create("BLESS_Types", "BLESS_Types_public", "Typedef", "Typedef");
    ImportNormalizer _importNormalizer_1 = new ImportNormalizer(_create_1, true, ignoreCase);
    return Collections.<ImportNormalizer>unmodifiableList(CollectionLiterals.<ImportNormalizer>newArrayList(_importNormalizer, _importNormalizer_1));
  }
}
