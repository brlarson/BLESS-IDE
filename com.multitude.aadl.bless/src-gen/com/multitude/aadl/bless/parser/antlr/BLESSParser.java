/*
 * (C) Multitude Corporation 2023
 * generated by Xtext 2.27.0
 from BLESS.xtext, by BRL 
 */
package com.multitude.aadl.bless.parser.antlr;

import com.google.inject.Inject;
import com.multitude.aadl.bless.parser.antlr.internal.InternalBLESSParser;
import com.multitude.aadl.bless.services.BLESSGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class BLESSParser extends AbstractAntlrParser {

	@Inject
	private BLESSGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalBLESSParser createParser(XtextTokenStream stream) {
		return new InternalBLESSParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "BLESSGrammarRoots";
	}

	public BLESSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BLESSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
