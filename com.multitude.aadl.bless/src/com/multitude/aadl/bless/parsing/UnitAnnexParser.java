package com.multitude.aadl.bless.parsing;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.modelsupport.errorreporting.ParseErrorReporter;
import org.osate.annexsupport.AnnexParseUtil;
import org.osate.annexsupport.AnnexParser;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.multitude.aadl.bless.parser.antlr.BLESSParser;
import com.multitude.aadl.bless.services.BLESSGrammarAccess;


public class UnitAnnexParser implements AnnexParser {

	@Inject
	private BLESSParser blessParser;

	// public static Set<String> baseUnitIDs = new HashSet<String>();

	public UnitAnnexParser() {
		Injector injector = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createFileURI("dummy.bless")).get(Injector.class);
		injector.injectMembers(this);
	}

	protected BLESSGrammarAccess getGrammarAccess() {
		return blessParser.getGrammarAccess();
	}

	@Override
	public AnnexLibrary parseAnnexLibrary(String annexName, String source, String filename, int line, int column,
			ParseErrorReporter errReporter) {
		AnnexLibrary eal = (AnnexLibrary) AnnexParseUtil.parse(blessParser, source,
				getGrammarAccess().getUnitLibraryRule(), filename, line, column, errReporter);
//		processLibrary(eal);
		return eal;
	}

	@Override
	public AnnexSubclause parseAnnexSubclause(String annexName, String source, String filename, int line, int column,
			ParseErrorReporter errReporter) {
		return null;
	}

//	private void processLibrary(AnnexLibrary eal)
//	{
//	for (UnitDeclaration ud : ((UnitLibrary)eal).getUnitDeclarations())
//		{
//			if (ud instanceof BaseDeclaration)
//				{
//					UnitStore.storeBase((BaseDeclaration)ud);
//					}
//			else if (ud instanceof DerivedDeclaration)
//				{
//					UnitStore.storeDerived((DerivedDeclaration)ud);
//					}
//			}
//	} // end of processLibrary

}