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
import com.multitude.aadl.bless.bLESS.Type;
import com.multitude.aadl.bless.bLESS.TypeOrReference;
import com.multitude.aadl.bless.parser.antlr.BLESSParser;
import com.multitude.aadl.bless.services.BLESSGrammarAccess;


public class TypeAnnexParser implements AnnexParser {

	@Inject
	private BLESSParser blessParser;

	// public static Set<String> baseUnitIDs = new HashSet<String>();
  public static TypeAnnexParser eINSTANCE;

	public TypeAnnexParser() {
		Injector injector = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createFileURI("dummy.bless")).get(Injector.class);
		injector.injectMembers(this);
    eINSTANCE = this;
	}

	protected BLESSGrammarAccess getGrammarAccess() {
		return blessParser.getGrammarAccess();
	}

	@Override
	public AnnexLibrary parseAnnexLibrary(String annexName, String source, String filename, int line, int offset,
			ParseErrorReporter errReporter) {
		AnnexLibrary eal = (AnnexLibrary) AnnexParseUtil.parse(blessParser, source,
				getGrammarAccess().getTypeLibraryRule(), filename, line, offset, errReporter);
//		processLibrary(eal);
		return eal;
	}

	@Override
	public AnnexSubclause parseAnnexSubclause(String annexName, String source, String filename, int line, int offset,
			ParseErrorReporter errReporter) {
		return null;
	}

  public Type parseType(String source, String filename, int line, int offset,
      ParseErrorReporter errReporter)
  {
    return (Type) AnnexParseUtil.parse(blessParser, source,
      getGrammarAccess().getTypeRule(), filename, line, offset, errReporter);
  }

  public TypeOrReference parseTypeOrReference(String source, String filename, int line, int offset,
      ParseErrorReporter errReporter) {
    return (TypeOrReference) AnnexParseUtil.parse(blessParser, source, getGrammarAccess().getTypeOrReferenceRule(),
        filename, line, offset, errReporter);
  }


}