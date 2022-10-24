package com.multitude.aadl.bless.scoping

//may wish to use BLESS files instead

import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider

class BlessImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {


	
//	override getImplicitImports(boolean ignoreCase) {
//	  val importNormalizers = newArrayList
//	  importNormalizers.add( new ImportNormalizer(QualifiedName.create("SI", "SI_public", "Unit", "Unit"), true, ignoreCase)) 
//    importNormalizers.add( new ImportNormalizer(QualifiedName.create("BLESS_Types", "BLESS_Types_public", "Typedef", "Typedef"), true, ignoreCase))
//		importNormalizers
//	}

	override getImplicitImports(boolean ignoreCase) {
		#[new ImportNormalizer(QualifiedName.create("SI", "SI_public", "Unit", "Unit"), true, ignoreCase)
		  ,new ImportNormalizer(QualifiedName.create("BLESS_Types", "BLESS_Types_public", "Typedef", "Typedef"), true, ignoreCase)
		]
	}

//  override protected getImplicitImports(boolean ignoreCase) {
//    BLESSPredeclaredFiles.predeclaredBLESSNames.map[new ImportNormalizer(QualifiedName.create(it), true, ignoreCase)].toList
//    }

}
