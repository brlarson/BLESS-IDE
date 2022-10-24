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

import antlr.RecognitionException;

public class ActionAnnexParser implements AnnexParser
  {
  @Inject
  private BLESSParser blessParser;

  public static ActionAnnexParser eINSTANCE;

  public ActionAnnexParser()
    {
    Injector injector = IResourceServiceProvider.Registry.INSTANCE
        .getResourceServiceProvider(URI.createFileURI("dummy.bless")).get(Injector.class);
    injector.injectMembers(this);
    eINSTANCE = this; 
    }

  protected BLESSGrammarAccess getGrammarAccess() 
    {
    return blessParser.getGrammarAccess();
    }

  @Override
  public AnnexLibrary parseAnnexLibrary(String annexName, String source, String filename, int line, int column,
      ParseErrorReporter errReporter) throws RecognitionException
    {
    return null;
    }

  @Override
  public AnnexSubclause parseAnnexSubclause(String annexName, String source, String filename, int line, int column,
      ParseErrorReporter errReporter) throws RecognitionException
    {
    AnnexSubclause eal = (AnnexSubclause) AnnexParseUtil.parse(blessParser, source,
        getGrammarAccess().getActionSubclauseRule(), filename, line, column, errReporter);
//    processLibrary(eal);
    return eal;
    }

  }
