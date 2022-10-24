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
import com.multitude.aadl.bless.bLESS.Assertion;
import com.multitude.aadl.bless.bLESS.NamedAssertion;
import com.multitude.aadl.bless.bLESS.NamelessAssertion;
import com.multitude.aadl.bless.bLESS.NamelessEnumeration;
import com.multitude.aadl.bless.bLESS.NamelessFunction;
import com.multitude.aadl.bless.bLESS.Type;
import com.multitude.aadl.bless.bLESS.TypeOrReference;
import com.multitude.aadl.bless.parser.antlr.BLESSParser;
import com.multitude.aadl.bless.services.BLESSGrammarAccess;


public class BlessAnnexParser implements AnnexParser {

	@Inject
	private BLESSParser blessParser;

	public static BlessAnnexParser eINSTANCE;

	// public static Set<String> baseUnitIDs = new HashSet<String>();

	public BlessAnnexParser() {
		Injector injector = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createFileURI("dummy.bless")).get(Injector.class);
		injector.injectMembers(this);
		eINSTANCE = this;
	}

	protected BLESSGrammarAccess getGrammarAccess() {
		return blessParser.getGrammarAccess();
	}

	@Override
	public AnnexLibrary parseAnnexLibrary(String annexName, String source, String filename, int line, int column,
			ParseErrorReporter errReporter) {
//		processLibrary(eal);
		return null;
	}

	@Override
	public AnnexSubclause parseAnnexSubclause(String annexName, String source, String filename, int line, int column,
			ParseErrorReporter errReporter) {
		AnnexSubclause eal = (AnnexSubclause) AnnexParseUtil.parse(blessParser, source,
				getGrammarAccess().getBLESSSubclauseRule(), filename, line, column, errReporter);
//		processLibrary(eal);
		return eal;
	}

	public Type parseType(String source, String filename, int line, int column,
			ParseErrorReporter errReporter)
	{
	  return (Type) AnnexParseUtil.parse(blessParser, source,
			getGrammarAccess().getTypeRule(), filename, line, column, errReporter);
	}

	public TypeOrReference parseTypeOrReference(String source, String filename, int line, int column,
			ParseErrorReporter errReporter) {
		return (TypeOrReference) AnnexParseUtil.parse(blessParser, source, getGrammarAccess().getTypeOrReferenceRule(),
				filename, line, column, errReporter);
	}

  public Assertion parseAssertion(String source, String filename, int line, int column,
      ParseErrorReporter errReporter)
  {
    return (Assertion) AnnexParseUtil.parse(blessParser, source,
      getGrammarAccess().getAssertionRule(), filename, line, column, errReporter);
  }

  public NamedAssertion 
parseNamedAssertion(String source, String filename, int line, int column, ParseErrorReporter errReporter)
  {
    return (NamedAssertion) AnnexParseUtil.parse(blessParser, source,
      getGrammarAccess().getNamedAssertionRule(), filename, line, column, errReporter);
  }

  public NamelessAssertion 
parseNamelessAssertion(String source, String filename, int line, int column, ParseErrorReporter errReporter)
  {
    return (NamelessAssertion) AnnexParseUtil.parse(blessParser, source,
      getGrammarAccess().getNamelessAssertionRule(), filename, line, column, errReporter);
  }

  public NamelessFunction 
parseNamelessFunction(String source, String filename, int line, int column, ParseErrorReporter errReporter)
  {
    return (NamelessFunction) AnnexParseUtil.parse(blessParser, source,
      getGrammarAccess().getNamelessFunctionRule(), filename, line, column, errReporter);
  }

  public NamelessEnumeration 
parseNamelessEnumeration(String source, String filename, int line, int column, ParseErrorReporter errReporter)
  {
    return (NamelessEnumeration) AnnexParseUtil.parse(blessParser, source,
      getGrammarAccess().getNamelessEnumerationRule(), filename, line, column, errReporter);
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