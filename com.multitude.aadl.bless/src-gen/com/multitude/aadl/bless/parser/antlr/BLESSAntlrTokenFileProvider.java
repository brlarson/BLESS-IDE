/*
 * (C) Multitude Corporation 2021
 * generated by Xtext 2.27.0
 from BLESS.xtext, by BRL 
 */
package com.multitude.aadl.bless.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BLESSAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/multitude/aadl/bless/parser/antlr/internal/InternalBLESS.tokens");
	}
}