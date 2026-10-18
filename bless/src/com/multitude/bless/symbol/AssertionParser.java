//AssertionParser.java

package com.multitude.bless.symbol;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import com.multitude.bless.antlr3generated.BLESS3Lexer;
import com.multitude.bless.antlr3generated.BLESS3Parser;
import com.multitude.bless.record.PackageRecord;
import com.multitude.bless.tree.BAST;
import com.multitude.bless.tree.BASTTreeAdaptor;

/**
 * @author brl
 * Parses BLESS Assertion text (e.g. BLESS::Invariant and BLESS::Assertion property values) into BAST.
 * Moved from LoadBLESS.parseAssertion, which now delegates here, so the proof engine
 * can parse assertions without the AADL front end.
 */
public class AssertionParser
{

  public static BAST
parseAssertion(String text, int line, int column, boolean putAssertionsIntoMap, PackageRecord pr)
  throws RecognitionException
    {
// set up ANTLR string reader
 //KLUDGE FOR MISSING formal=ID IN INVOCATION
    CharStream spec = new ANTLRStringStream(text.replace(":=", "%%%").replace(":", " : ").replace("%%%", ":="));
    BLESS3Lexer lexer = new BLESS3Lexer(spec);
    CommonTokenStream tokens = new CommonTokenStream();
//    BAST.tokens = tokens;
    tokens.setTokenSource(lexer);

    BLESS3Parser parser = new BLESS3Parser(tokens);
    parser.setStartingLine(line);
    parser.setTreeAdaptor(new BASTTreeAdaptor());
    parser.currentPackageRecord = pr;
//parser.putAssertionsIntoMap = putAssertionsIntoMap; // put Assertions found into map?
    BAST tb = null;
//   try {
    tb = parser.assertion().getTree();
//    } catch (UnwantedTokenException re)
//      {
//      Dump.it("/nDon\'t include units for numeric literals in BLESS::Assertion property strings.\n");
//      }
    return tb;
    } // end of parseAssertion

}  //end of AssertionParser
