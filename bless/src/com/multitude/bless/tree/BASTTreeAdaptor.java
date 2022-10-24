package com.multitude.bless.tree;


import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;

public class BASTTreeAdaptor extends CommonTreeAdaptor
{
public Object create(Token payload)
	{
	return new BAST(payload);
	}

public Object errorNode(TokenStream input, Token start, Token stop,
		RecognitionException e)
	{
	BASTErrorNode t = new BASTErrorNode(input, start, stop, e);
	// Dump.it("returning error node '"+t+"' @index="+input.index());
	return t;
	}

}
