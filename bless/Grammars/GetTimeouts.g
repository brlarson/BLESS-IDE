//GetTimeouts.g
//find all the timeout dispatch triggers for Slang generation

tree grammar GetTimeouts;

options
{
tokenVocab=BLESStoAST;
ASTLabelType=BAST;
output=AST;
filter=true;  //tree pattern matching mode
//backtrack=true;
}


@header 
{
//copyright 2022 Multitude Corporation
package com.multitude.bless.antlr3generated;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import com.multitude.bless.tree.BAST;
import java.util.Set;
import java.util.HashSet;
}

//suppress automatic exception handling
@rulecatch { }

@members
{
public Set<BAST> timeouts = new HashSet<BAST>();
}

topdown
  :	
  get_timeout
  ;

get_timeout
  :
  ^(t=LITERAL_timeout e+=.* {timeouts.add($t);} )
  ;