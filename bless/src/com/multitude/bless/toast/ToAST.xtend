package com.multitude.bless.toast

//see README

import com.multitude.aadl.bless.BlessControl
import com.multitude.aadl.bless.bLESS.ANumber
import com.multitude.aadl.bless.bLESS.Action
import com.multitude.aadl.bless.bLESS.ActionSubclause
import com.multitude.aadl.bless.bLESS.ActualParameter
import com.multitude.aadl.bless.bLESS.AddSub
import com.multitude.aadl.bless.bLESS.Alternative
import com.multitude.aadl.bless.bLESS.ArrayRange
import com.multitude.aadl.bless.bLESS.ArrayRangeList
import com.multitude.aadl.bless.bLESS.ArrayType
import com.multitude.aadl.bless.bLESS.AssertClause
import com.multitude.aadl.bless.bLESS.AssertedAction
import com.multitude.aadl.bless.bLESS.Assertion
import com.multitude.aadl.bless.bLESS.AssertionEnumeration
import com.multitude.aadl.bless.bLESS.AssertionFunctionValue
import com.multitude.aadl.bless.bLESS.AssertionLibrary
import com.multitude.aadl.bless.bLESS.Assignment
import com.multitude.aadl.bless.bLESS.BAAlternative
import com.multitude.aadl.bless.bLESS.BLESSAlternative
import com.multitude.aadl.bless.bLESS.BLESSSubclause
import com.multitude.aadl.bless.bLESS.BasicAction
import com.multitude.aadl.bless.bLESS.BehaviorActions
import com.multitude.aadl.bless.bLESS.BehaviorState
import com.multitude.aadl.bless.bLESS.BehaviorTime
import com.multitude.aadl.bless.bLESS.BehaviorTransition
import com.multitude.aadl.bless.bLESS.BooleanType
import com.multitude.aadl.bless.bLESS.CaseChoice
import com.multitude.aadl.bless.bLESS.CaseExpression
import com.multitude.aadl.bless.bLESS.CatchClause
import com.multitude.aadl.bless.bLESS.CatchClauseTerm
import com.multitude.aadl.bless.bLESS.CombinableOperation
import com.multitude.aadl.bless.bLESS.CommunicationAction
import com.multitude.aadl.bless.bLESS.Computation
import com.multitude.aadl.bless.bLESS.ConditionValuePair
import com.multitude.aadl.bless.bLESS.ConditionalAssertionFunction
import com.multitude.aadl.bless.bLESS.ConditionalExpression
import com.multitude.aadl.bless.bLESS.Conjunction
import com.multitude.aadl.bless.bLESS.Constant
import com.multitude.aadl.bless.bLESS.CountingQuantification
import com.multitude.aadl.bless.bLESS.Disjunction
import com.multitude.aadl.bless.bLESS.DispatchCondition
import com.multitude.aadl.bless.bLESS.DispatchConjunction
import com.multitude.aadl.bless.bLESS.DispatchExpression
import com.multitude.aadl.bless.bLESS.DispatchTrigger
import com.multitude.aadl.bless.bLESS.DoUntilLoop
import com.multitude.aadl.bless.bLESS.EnumerationPair
import com.multitude.aadl.bless.bLESS.EnumerationType
import com.multitude.aadl.bless.bLESS.EnumerationValue
import com.multitude.aadl.bless.bLESS.ExecuteCondition
import com.multitude.aadl.bless.bLESS.ExistentialLatticeQuantification
import com.multitude.aadl.bless.bLESS.ExistentialQuantification
import com.multitude.aadl.bless.bLESS.Exp
import com.multitude.aadl.bless.bLESS.Expression
import com.multitude.aadl.bless.bLESS.ExpressionOrAny
import com.multitude.aadl.bless.bLESS.ForLoop
import com.multitude.aadl.bless.bLESS.FormalActual
import com.multitude.aadl.bless.bLESS.FormalActualList
import com.multitude.aadl.bless.bLESS.FormalExpressionPair
import com.multitude.aadl.bless.bLESS.GuardedAction
import com.multitude.aadl.bless.bLESS.IndexExpression
import com.multitude.aadl.bless.bLESS.IndexExpressionOrRange
import com.multitude.aadl.bless.bLESS.InternalCondition
import com.multitude.aadl.bless.bLESS.InvariantClause
import com.multitude.aadl.bless.bLESS.Invocation
import com.multitude.aadl.bless.bLESS.IssueException
import com.multitude.aadl.bless.bLESS.LogicVariables
import com.multitude.aadl.bless.bLESS.ModeCondition
import com.multitude.aadl.bless.bLESS.MultDiv
import com.multitude.aadl.bless.bLESS.NameTick
import com.multitude.aadl.bless.bLESS.NamedAssertion
import com.multitude.aadl.bless.bLESS.NamelessAssertion
import com.multitude.aadl.bless.bLESS.NamelessEnumeration
import com.multitude.aadl.bless.bLESS.NamelessFunction
import com.multitude.aadl.bless.bLESS.ParenthesizedSubexpression
import com.multitude.aadl.bless.bLESS.PartialName
import com.multitude.aadl.bless.bLESS.PeriodShift
import com.multitude.aadl.bless.bLESS.PortInput
import com.multitude.aadl.bless.bLESS.PortOutput
import com.multitude.aadl.bless.bLESS.ProductQuantification
import com.multitude.aadl.bless.bLESS.PropertyField
import com.multitude.aadl.bless.bLESS.PropertyReference
import com.multitude.aadl.bless.bLESS.QuantifiedVariables
import com.multitude.aadl.bless.bLESS.Quantity
import com.multitude.aadl.bless.bLESS.QuantityType
import com.multitude.aadl.bless.bLESS.Range
import com.multitude.aadl.bless.bLESS.RecordField
import com.multitude.aadl.bless.bLESS.RecordTerm
import com.multitude.aadl.bless.bLESS.RecordType
import com.multitude.aadl.bless.bLESS.RecordValue
import com.multitude.aadl.bless.bLESS.Relation
import com.multitude.aadl.bless.bLESS.SimultaneousAssignment
import com.multitude.aadl.bless.bLESS.StringType
import com.multitude.aadl.bless.bLESS.SubProgramParameter
import com.multitude.aadl.bless.bLESS.Subexpression
import com.multitude.aadl.bless.bLESS.SubprogramCall
import com.multitude.aadl.bless.bLESS.SumQuantification
import com.multitude.aadl.bless.bLESS.TimedExpression
import com.multitude.aadl.bless.bLESS.TimedSubject
import com.multitude.aadl.bless.bLESS.Transitions
import com.multitude.aadl.bless.bLESS.TriggerLogicalExpression
import com.multitude.aadl.bless.bLESS.Type
import com.multitude.aadl.bless.bLESS.TypeOrReference
import com.multitude.aadl.bless.bLESS.UniversalLatticeQuantification
import com.multitude.aadl.bless.bLESS.UniversalQuantification
import com.multitude.aadl.bless.bLESS.Value
import com.multitude.aadl.bless.bLESS.ValueName
import com.multitude.aadl.bless.bLESS.Variable
import com.multitude.aadl.bless.bLESS.VariableDeclaration
import com.multitude.aadl.bless.bLESS.VariableList
import com.multitude.aadl.bless.bLESS.VariablesSection
import com.multitude.aadl.bless.bLESS.WhenThrow
import com.multitude.aadl.bless.bLESS.WhileLoop
import com.multitude.bless.antlr3generated.BLESS3Lexer
import com.multitude.bless.app.Global
import com.multitude.bless.tree.BAST
import java.util.ArrayList
import java.util.List
import org.antlr.runtime.CommonToken
import org.eclipse.emf.ecore.util.EcoreUtil
import org.osate.aadl2.Element
import org.osate.aadl2.SubprogramAccess
import org.osate.aadl2.SubprogramSubcomponent
import com.multitude.aadl.bless.bLESS.GhostVariables
import com.multitude.aadl.bless.bLESS.GhostVariable
import com.multitude.aadl.bless.bLESS.NullType
import com.multitude.aadl.bless.bLESS.EventTrigger

class ToAST {


public static final ToAST TOAST = new ToAST();	

public static BAST x = new BAST('x')

	
  def 
newBAST(Element e)
    {
    new BAST(e)
    }

  def BAST 
makeBASTforID(String id, Element parent)	
  {
  try {  
  	newBAST(parent) =>
  	  [
  	   myText = id
       token = new CommonToken(BLESS3Lexer.ID, id)
      ]	    
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of makeBASTforID

  def BAST
makeBASTforANumber(ANumber an, Element parent)
  {
  if (an.property !== null)
    return an.property.makeBASTforPropertyReference(parent)
  if (an.propertyConstant !== null)
    return  an.propertyConstant.qualifiedName().makeBASTforPropertyName(parent)
  if (an.lit.contains(".")) 
    makeBASTforREAL_LIT(an.lit,parent)
  else
    makeBASTforINT(an.lit,parent)
  }  

  def BAST
makeBASTforPropertyReference(PropertyReference pr, Element e)
  {
  if (pr.eIsProxy)
    EcoreUtil.resolve(pr,e)
  try {  
    newBAST(e) =>
      [
       myText = '#'
       token = new CommonToken(BLESS3Lexer.OCTOTHORPE, '#')
       if (pr.self) addChild(newBAST(e) =>
         [
         myText = 'self'
         token = new CommonToken(BLESS3Lexer.LITERAL_self, 'self')
         ])
       if (pr.pname !== null)
         addChild(makeBASTforPropertyName(pr.pname.qualifiedName(),e))
       else if (pr.spname !== null)
         addChild(makeBASTforPropertyName(pr.spname.qualifiedName(),e))
       else if (pr.component !== null)
         {
         addChild(pr.component.qualifiedName().makeBASTforComponentClassifier(e))
         addChild(makeBASTforPropertyName(pr.cpname.qualifiedName(),e))
         }
       for (f : pr.field)
         addChild(f.makeBASTforPropertyField(e))
      ] 
    } catch (Exception ex) {ex.printStackTrace x}
  }

//MAY NOT HANDLE .imp AT THE END
  def BAST
makeBASTforComponentClassifier(String s, Element e) 
  {
  newBAST(e) =>
    [
    myText = '::'
    token = new CommonToken(BLESS3Lexer.DOUBLE_COLON, '::')
    for (c : s?.getComponentClassifierStrings)
      addChild(c.makeBASTforID(e))
    ]  
  } 

  def List<String>
getComponentClassifierStrings(String s)
  {
  val ArrayList<String> retval = new ArrayList<String>()
  var l = 0
  var r = s.indexOf('::',l)
  while (l<s.length)
    {
    retval.add(s.substring(l,r))
    l = r+2
    r = s.indexOf('::',l)
    }
  retval
  }

  def BAST
makeBASTforPropertyField(PropertyField f, Element e) 
  {
  if (f.index !== null)
  newBAST(e) =>
    [
    myText = '['
    token = new CommonToken(BLESS3Lexer.LBRACKET, '[')
    addChild(f.index.makeBASTforINT(e))
    addChild(newBAST(e) =>
      [
      myText = ']'
      token = new CommonToken(BLESS3Lexer.RBRACKET, ']')
      ] )
    ]
  else if (f.variable !== null)
  newBAST(e) =>
    [
    myText = '['
    token = new CommonToken(BLESS3Lexer.LBRACKET, '[')
    addChild(f.variable.name.makeBASTforID(e))
    addChild(newBAST(e) =>
      [
      myText = ']'
      token = new CommonToken(BLESS3Lexer.RBRACKET, ']')
      ] )
    ]
  else if (f.pf !== null)
  newBAST(e) =>
    [
    myText = '.'
    token = new CommonToken(BLESS3Lexer.DOT, '.')
    addChild(f.pf.makeBASTforID(e))
    ]
  else if (f.upper !== null)
  newBAST(e) =>
    [
    myText = '.'
    token = new CommonToken(BLESS3Lexer.DOT, '.')
    addChild(newBAST(e) =>
      [
      myText = 'upper_bound'
      token = new CommonToken(BLESS3Lexer.LITERAL_upper_bound, 'upper_bound')
      ])
    ]
  else if (f.lower !== null)
  newBAST(e) =>
    [
    myText = '.'
    token = new CommonToken(BLESS3Lexer.DOT, '.')
    addChild(newBAST(e) =>
      [
      myText = 'lower_bound'
      token = new CommonToken(BLESS3Lexer.LITERAL_lower_bound, 'lower_bound')
      ])
    ]
  } 
   
/**
 * make a BAST node for an integer literal
 * used by AssertionValue , NaturalConstant
 */
  def BAST 
makeBASTforINT(String integer_literal, Element parent)
  {
  try {  
  	newBAST(parent) =>
  	  [
  	   myText = integer_literal
       token = new CommonToken(BLESS3Lexer.NUMBER, integer_literal)
      ]	
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of makeBASTforINT

/**
 * make a BAST node for a real literal
 * used by AssertionValue , ValueConstant
 */
  def BAST 
makeBASTforREAL_LIT(String real_literal, Element parent)
  {
   try {  
    newBAST(parent) =>
      [
       myText = real_literal
       token = new CommonToken(BLESS3Lexer.NUMBER, real_literal)
      ] 
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of makeBASTforREAL_LIT

/**
 * make a BAST node for a literal
 * eiter integer or float
 */
  def BAST 
makeBASTforLIT(String literal, Element parent)
  {
  if (literal.contains('.'))
    literal.makeBASTforREAL_LIT(parent)
  else
    literal.makeBASTforINT(parent)
  }  //end of makeBASTforLIT


/**
 * make a BAST node for a string literal
 * used by AssertionValue 
 */
  def BAST 
makeBASTforSTRING(String string_literal, Value parent)
  {   
  try {  
  	newBAST(parent) =>
  	  [
  	   myText = string_literal
       token = new CommonToken(BLESS3Lexer.AADL_STRING_LITERAL, string_literal)
      ]	
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of makeBASTforSTRING

/**
 * make a BAST node for a RangeSymbol : DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA;
 * used by LogicVariableDomain , Range
 */
  def BAST 
makeBASTforRangeSymbol(String mySymbol, Element parent)
  {
   try {  
  switch mySymbol
  	{
  	case '..' :
  	newBAST(parent) =>
  	  [
  	   myText = '..'
       token = new CommonToken(BLESS3Lexer.DOTDOT, '..')
      ]	
  	case ',.' :
  	newBAST(parent) =>
  	  [
  	   myText = ',.'
       token = new CommonToken(BLESS3Lexer.COMMADOT, ',.')
      ]	
  	case '.,' :
  	newBAST(parent) =>
  	  [
  	   myText = '.,'
       token = new CommonToken(BLESS3Lexer.DOTCOMMA, '.,')
      ]	
  	case ',,' :
  	newBAST(parent) =>
  	  [
  	   myText = ',,'
       token = new CommonToken(BLESS3Lexer.COMMACOMMA, ',,')
      ]	 		
  	}  //end of switch	
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of makeBASTforRangeSymbol

/**
 * make a BAST node for a RelationSymbol : '=' | '<>' | '<' | '<=' | '>=' | '>';	
 * used by PredicateRelation, ExpressionOrRelation 
 */
  def BAST 
makeBASTforRelationSymbol(String mySymbol, Element parent)
  {
   try {  
  switch mySymbol
  	{
  	case '=' :
  	newBAST(parent) =>
  	  [
  	   myText = '='
       token = new CommonToken(BLESS3Lexer.EQ, '=')
      ]	
  	case '<>' :
  	newBAST(parent) =>
  	  [
  	   myText = '<>'
       token = new CommonToken(BLESS3Lexer.NEQ, '<>')
      ]	
  	case '<' :
  	newBAST(parent) =>
  	  [
  	   myText = '<'
       token = new CommonToken(BLESS3Lexer.LT, '<')
      ]	
  	case '<=' :
  	newBAST(parent) =>
  	  [
  	   myText = '<='
       token = new CommonToken(BLESS3Lexer.AM, '<=')
      ]	 		
  	case '>=' :
  	newBAST(parent) =>
  	  [
  	   myText = '>='
       token = new CommonToken(BLESS3Lexer.AL, '>=')
      ]	 		
    case '>' :
    newBAST(parent) =>
      [
       myText = '>'
       token = new CommonToken(BLESS3Lexer.GT, '>')
      ]     
    case '!=' :
    newBAST(parent) =>
      [
       myText = '!='
       token = new CommonToken(BLESS3Lexer.OLD_NEQ, '!=')
      ]     
    case '+=' :
    newBAST(parent) =>
      [
       myText = '+='
       token = new CommonToken(BLESS3Lexer.PLUS_EQUALS, '+=')
      ]     
  	}  //end of switch	
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of makeBASTforRelationSymbol

/**
 * make a BAST node for an AADL Property
 * used by  
 */
  def BAST 
makeBASTforPropertyName(String property_name, Element e)
  {
  newBAST(e) =>
  	[
  	myText = "::"
    token = new CommonToken(BLESS3Lexer.DOUBLE_COLON, property_name)
    val ps = property_name.substring(0,property_name.indexOf("::"))
    val prop = property_name.substring(property_name.indexOf("::")+2, property_name.length)
    addChild(newBAST(e) =>
      [
      myText = ps
      token = new CommonToken(BLESS3Lexer.ID, ps)
      ])
    addChild(newBAST(e) =>
      [
      myText = prop
      token = new CommonToken(BLESS3Lexer.ID, prop)
      ])  
    ]	
  }  //end of makeBASTforPropertyName


/**
 * make a BAST node for an AADL component port
 * used by  
 */
  def BAST 
makeBASTforPort(String port_name, Element parent)
  {
   try {  
  	//currently, port names are simple identifiers,  extend to PORTNAME
  	newBAST(parent) =>
  	  [
  	   myText = port_name
       token = new CommonToken(BLESS3Lexer.ID, port_name)
      ]	
    } catch (Exception ex) {ex.printStackTrace x}  	
  }  //end of makeBASTforPort

/**
 * make a BAST node for an AADL_STRING_LITERAL
 * used by  
 */
  def BAST 
makeBASTforAADL_STRING_LITERAL(String theString, Element parent)
  {
   try {  
  newBAST(parent) =>
  	  [
  	   myText =theString
       token = new CommonToken(BLESS3Lexer.AADL_STRING_LITERAL, theString)
      ]	
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of makeBASTforAADL_STRING_LITERAL

/**
 * put Assertion into map
 *   if (putAssertionsIntoMap&&($cln!==null)&&($a.text!==null)) 
    if (Global.label_assertion_map.containsKey($a.text))
      throw new YouIdiot("Duplicate Assertion for \""+$a.text+"\"",$a.tree);
    else
      Global.label_assertion_map.put($a.text,$assertion_body.tree);}
 */
  def void
putAssertionIntoMap(String key, BAST b) 
  {
  try 
  {  
  if (!Global.label_assertion_map.containsKey(key))
        Global.label_assertion_map.put(key,b)  
//  	{
  	//find the duplicate and put out a marker for it too
//    YouIdiot.setErrorMarker("Assertion name \""+key+"\" has duplicates",
//    	  Global.label_assertion_map.get(key).line,
//    	  Global.label_assertion_map.get(key) );
//    Dump.it("Assertion name \""+key+"\" has duplicates")
//  	throw new YouIdiot("Assertion name \""+key+"\" has duplicates",b);
//  	  
//  	}
//  else
//    Global.label_assertion_map.put(key,b) 
  } 
//  catch (YouIdiot yi) {yi.handleException}
  catch (Exception ex) {ex.printStackTrace}
  } // end of putAssertionIntoMap

////////////////////////////////////////////////////////////////////////////////////////////////////
    
  def dispatch BAST
toAST(AssertionLibrary e)  	
  {
   try {  
//ghost variables not put into BAST  	
  	newBAST(e) =>
  	  [
       token = new CommonToken(BLESS3Lexer.ASSERTION_ANNEX, 'ASSERTION_ANNEX')
           //set my text
       myText = 'ASSERTION_ANNEX'
       //have ghost variables?
       if (e.ghosts!==null)
         addChild(e.ghosts.toAST)
       //put on assertions
       for (child : e.assertion_list)  //add  assertion_list+=NamedAssertion*
         addChild(child.toAST)      
      ]  	
     } catch (Exception ex) {ex.printStackTrace x}
  }  //end of toAST(AssertionLibrary

  def dispatch BAST
toAST(Assertion e)  	
  {
   try {  
  var BAST result=null	
  if (e.namedassertion!==null)
    {
    result=e.namedassertion.toAST 
    putAssertionIntoMap(e.namedassertion.name,result)
    }
  else if (e.namelessassertion!==null)	
    result=e.namelessassertion.toAST 
  else if (e.namelessfunction!==null)	
    result=e.namelessfunction.toAST 
  else if (e.namelessenumeration!==null)	
    result=e.namelessenumeration.toAST;
  result  
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of toAST(Assertion

////////////////////////////////////////////////////////////////////////////////////////////////////
  
//  AssertionEnumeration
//assertionEnumeration
//  :
//  ^( PLUS_ARROW inv=invocation )
//  |
//  ^( PLUS_ARROW ep=enumerationPair )
//  | 
//  ^( PLUS_ARROW ^( COMMA pair+=enumerationPair+ ) )
//  ;  
  def dispatch BAST
toAST(AssertionEnumeration e)  	
  {
    try {  
  	newBAST(e) =>
  	  [
        token = new CommonToken(BLESS3Lexer.PLUS_ARROW, '+=>')
        myText = '+=>'
          //add either a PredicateInvocation, or one or more EnumerationPair
        if (e.pred !== null)  
          addChild(e.pred.toAST)  
        else for (child : e.pair)  //add enumeration pairs
              addChild(child.toAST)                   
      ]
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of AssertionEnumeration

//sumQuantification:
//  ^( s=LITERAL_sum lv=logicVariables iw=in_which ^( LITERAL_of ex=expression ) )
  def dispatch BAST
toAST(SumQuantification e) 
  {
  try {  
  	newBAST(e) =>
  	  [
      token = new CommonToken(BLESS3Lexer.LITERAL_sum, 'sum')
      myText = 'sum'
      // put on the logic variables
      addChild(e.variables.toAST) 
      // put on in_which 
      if (e.in)
        addChild(newBAST(e)  =>
       	 [
       	 myText = 'in'
         token = new CommonToken(BLESS3Lexer.LITERAL_in, 'in')
         addChild(e.range.toAST)
       	 ] )
      else if (e.which)
        addChild(newBAST(e)  =>
         [
         myText = 'which'
         token = new CommonToken(BLESS3Lexer.LITERAL_which, 'which')
         addChild((e.condition as Expression).toAST)
         ] )
      // put on the "of"
      addChild(newBAST(e) =>
  	     [
         token = new CommonToken(BLESS3Lexer.LITERAL_of, 'of')
         myText = 'of'
         //put on the numeric expression
          addChild(e.numeric_expression.toAST)  
         ])
      ] 
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of SumQuantification

//productQuantification:
//  ^( p=LITERAL_product lv=logicVariables iw=in_which ^( LITERAL_of ex=expression ) )
  def dispatch BAST
toAST(ProductQuantification e) 
  {
  try {  
  	newBAST(e) =>
  	  [
      token = new CommonToken(BLESS3Lexer.LITERAL_product, 'product')
      myText = 'product'
      // put on the logic variables
      addChild(e.variables.toAST)  
      // put on in_which 
      if (e.in)
        addChild(newBAST(e)  =>
         [
         myText = 'in'
         token = new CommonToken(BLESS3Lexer.LITERAL_in, 'in')
         addChild(e.range.toAST)
         ] )
      else if (e.which)
        addChild(newBAST(e)  =>
         [
         myText = 'which'
         token = new CommonToken(BLESS3Lexer.LITERAL_which, 'which')
         addChild((e.condition as Expression).toAST)
         ] )
      // put on the "of"
      addChild(newBAST(e) =>
  	     [
         token = new CommonToken(BLESS3Lexer.LITERAL_of, 'of')
         myText = 'of'
         //put on the numeric expression
         addChild(e.numeric_expression.toAST)  
         ])
      ] 
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of ProductQuantification

//countingQuantification  :
//  ^( LITERAL_numberof lv=logicVariables iw=in_which ^( LITERAL_that ex=expression) ) 
  def dispatch BAST
toAST(CountingQuantification e) 
  {
  try {  
  	newBAST(e) =>
  	  [
      token = new CommonToken(BLESS3Lexer.LITERAL_numberof, 'numberof')
      myText = 'numberof'
      // put on the logic variables
      addChild(e.variables.toAST)  
      // put on in_which 
      if (e.in)
        addChild(newBAST(e)  =>
         [
         myText = 'in'
         token = new CommonToken(BLESS3Lexer.LITERAL_in, 'in')
         addChild(e.range.toAST)
         ] )
      else if (e.which)
        addChild(newBAST(e)  =>
         [
         myText = 'which'
         token = new CommonToken(BLESS3Lexer.LITERAL_which, 'which')
         addChild((e.condition as Expression).toAST)
         ] )
      // put on the "that"
      addChild(newBAST(e) =>
  	     [
         token = new CommonToken(BLESS3Lexer.LITERAL_that, 'that')
         myText = 'that'
         //put on the expression
         addChild((e.counted as Expression).toAST)  
         ])
      ] 
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of CountingQuantification


//assertionFunctionValue:
//  caf=conditionalAssertionFunction 
//  | exp=expression  
  def dispatch BAST
toAST(AssertionFunctionValue e) 
  {
  try 
    {  
    if (e.cexp!==null)
  	  e.cexp.toAST
    else if (e.pexp!==null) 
      (e.pexp as Expression).toAST
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }  //end of AssertionFunctionValue
  
//      ConditionValuePair :
// condition_value_pair : parenthesized_predicate IMP^ assertion_expression;
  def dispatch BAST
toAST(ConditionValuePair e)
  {
  try {  
    newBAST(e) =>  [
  	   myText = 'CVP'
       token = new CommonToken(BLESS3Lexer.CVP, 'CVP')
//must add parentheses around predicate       
       addChild(parenthesize((e.condition as Expression).toAST,e))  //condition = parenthesized_predicate
       addChild((e.expression as Expression).toAST)  //expression = assertion_expression
      ]	
    } catch (Exception ex) {ex.printStackTrace x}
  }   //end of ConditionValuePair

  def BAST
parenthesize(BAST pred, Element e)
  {
  if ((pred.getChildCount()==0) || pred.hasType(BLESS3Lexer.AT_SIGN)
        || pred.hasType(BLESS3Lexer.LBRACKET)) 
  return pred
  newBAST(e) =>  [
       myText = '('
       token = new CommonToken(BLESS3Lexer.LPAREN, '(')
       addChild(pred)
       addChild(newBAST(e) =>  [
       myText = ')'
       token = new CommonToken(BLESS3Lexer.RPAREN, ')')
       ])
       ] 
  }

//conditionalExpression:
//  ^( LPAREN ^( QQ pred=expression t=expression f=expression )  RPAREN )
  def dispatch BAST
toAST(ConditionalExpression e)
  {
  try 
    {  
    newBAST(e) =>  [
       myText = '('
       token = new CommonToken(BLESS3Lexer.LPAREN, '(')
       addChild(newBAST(e) =>  [
         myText = 'QQ'
         token = new CommonToken(BLESS3Lexer.QQ, 'QQ')
         addChild(e.pred.toAST)  //pred = predicate
         addChild(e.t.toAST)  //true choice, t = assertion_expression
         addChild(e.f.toAST)  //false choice f = assertion_expression
         ])	
       addChild(newBAST(e) =>  [
         myText = ')'
         token = new CommonToken(BLESS3Lexer.RPAREN, ')')
         ])
       ]
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }   //end of ConditionalAssertionExpression



//conditionalAssertionFunction :
//  ^( CONDITIONAL_ASSERTION_FUNCTION cvp+=conditionValuePair+ )
  def dispatch BAST
toAST(ConditionalAssertionFunction e)
  {
  try 
    {  
    newBAST(e) =>  [
  	   myText = 'CONDITIONAL_ASSERTION_FUNCTION' //['+e.locationReference.line+']'
       token = new CommonToken(BLESS3Lexer.CONDITIONAL_ASSERTION_FUNCTION, 'CONDITIONAL_ASSERTION_FUNCTION') //['+e.locationReference.line+']')
       for (child : e.cvp)  //add on the conditionValuePair children
         addChild(child.toAST)
      ]	
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }   //end of ConditionalAssertionFunction

//enumerationPair :
//  ^( IMP id=ID pred=predicate )
  def dispatch BAST
toAST(EnumerationPair e)
  {
  try 
    {  
    newBAST(e) =>  [
  	   myText = "->"
       token = new CommonToken(BLESS3Lexer.IMP, '->')
       addChild(e.enumeration_literal.makeBASTforID(e))
       addChild((e.predicate as Expression).toAST)  //predicate = predicate
      ]	
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }   //end of EnumerationPair

//existentialQuantification  :
//  ^( e=LITERAL_exists lv=logicVariables iw=in_which ^( LITERAL_are pred=predicate ) )
  def dispatch BAST
toAST(ExistentialQuantification e)
  {
  try 
    {  
    newBAST(e) =>  [
  	  myText = 'exists'
      token = new CommonToken(BLESS3Lexer.LITERAL_exists, 'exists')
      //add logicVariables
      addChild(e.variables.toAST)  
      // put on in_which 
      if (e.in)
        addChild(newBAST(e)  =>
         [
         myText = 'in'
         token = new CommonToken(BLESS3Lexer.LITERAL_in, 'in')
         addChild(e.range.toAST)
         ] )
      else if (e.which)
        addChild(newBAST(e)  =>
         [
         myText = 'which'
         token = new CommonToken(BLESS3Lexer.LITERAL_which, 'which')
         addChild((e.condition as Expression).toAST)
         ] )
      // put on the "that"
      addChild(newBAST(e) =>
         [
         token = new CommonToken(BLESS3Lexer.LITERAL_that, 'that')
         myText = 'that'
         //put on the expression
         addChild((e.predicate as Expression).toAST)  
         ])
      ]	
    } catch (Exception ex) {ex.printStackTrace x}
  }   //end of ExistentialQuantification


//variable : ^( TILDE id=ID tod=typeOrReference )
  def dispatch BAST
toAST(Variable e)
  {
  try
    {  
    newBAST(e) => [
      myText = '~' 
      token = new CommonToken(BLESS3Lexer.TILDE, '~')
      addChild(e.name.makeBASTforID(e))
      addChild(e.tod.toAST) 
      ]
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }   //end of Variable

//variableList:
//  v=variable
//  | ^( COMMA parameter+=variable+ )
   def dispatch BAST
toAST(VariableList e)
  {
  try 
    {  
    if (e.comma)
      newBAST(e) => [
        myText = ',' 
        token = new CommonToken(BLESS3Lexer.COMMA, ',')
        addChild(e.first.toAST)
        for (child : e.parameter)  
          addChild(child.toAST)  
        ]
    else	
	    e.first.toAST
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }   //end of VariableList

  
//indexExpressionOrRange:
//  ^( dd=DOTDOT lb=indexExpression ub=indexExpression )
//  | index=indexExpression
  def dispatch BAST
toAST(IndexExpressionOrRange e)
  {
  try 
    {  
	  if (e.dd) 
	    newBAST(e) =>  [
  	    myText = '..'
        token = new CommonToken(BLESS3Lexer.DOTDOT, '..')
        addChild(e.left_hand_side.toAST)  //variables = logic_variables
        addChild(e.right_hand_side.toAST)  //domain = logic_variable_domain
      ]	
    else  //just an index
      e.left_hand_side.toAST
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }   //end of IndexExpressionOrRange

//periodShift :
//  ^( um=UNARY_MINUS v=value )
//  |  ^( um=UNARY_MINUS ^( LPAREN ie=indexExpression RPAREN ) )
//  |  v=value
//  |  ^( LPAREN ie=indexExpression RPAREN )
  def dispatch BAST
toAST(PeriodShift e)
  {
  try 
    {  
	  if (e.unary_minus) 
	    newBAST(e) =>  [
  	    myText = '-'
        token = new CommonToken(BLESS3Lexer.UNARY_MINUS, '-')
        if (e.v!==null)
          addChild(e.v.toAST)  //v = value
        else if (e.index_expression!==null)  
          addChild(e.index_expression.parenthesize)  
      ]		
    else if (e.v!==null)
      e.v.toAST  //v = value
    else if (e.index_expression!==null)  
      e.index_expression.parenthesize  //domain = logic_variable_domain
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }   //end of PeriodShift

//indexExpression :
//  ^( m=MINUS l=periodShift r=periodShift )
//  | ^( m=LITERAL_div l=periodShift r=periodShift )
//  | ^( m=LITERAL_mod l=periodShift r=periodShift )
//  | ^( m=LITERAL_rem l=periodShift r=periodShift )
//  | ^( PLUS ps+=periodShift+ )
//  | ^( TIMES ps+=periodShift+ )
  def dispatch BAST
toAST(IndexExpression ie)
  {
  try 
    {  
  if (ie.sym !== null && ie.sym.equals('-'))
    {
    newBAST(ie) =>
      [
  	  myText = '-'
      token = new CommonToken(BLESS3Lexer.MINUS, '-')
      addChild(ie.l.toAST)
      addChild(ie.r.head.toAST)
      ]	
    }
  else if (ie.sym !== null && ie.sym.equals('div'))
    {
    newBAST(ie) =>
      [
  	  myText = 'div'
      token = new CommonToken(BLESS3Lexer.LITERAL_div, 'div')
      addChild(ie.l.toAST)
      addChild(ie.r.head.toAST)
      ]	
    }
  else if (ie.sym !== null && ie.sym.equals('mod'))
    {
    newBAST(ie) =>
      [
  	  myText = 'mod'
      token = new CommonToken(BLESS3Lexer.LITERAL_mod, 'mod')
      addChild(ie.l.toAST)
      addChild(ie.r.head.toAST)
      ]	
    }
  else if (ie.sym !== null && ie.sym.equals('+'))
    {
    newBAST(ie) =>
      [
  	  myText = '+'
      token = new CommonToken(BLESS3Lexer.PLUS, '+')
      addChild(ie.l.toAST)
      for (ch : ie.r)
        addChild(ch.toAST)
      ]	
    }
  else if (ie.sym !== null && ie.sym.equals('*'))
    {
    newBAST(ie) =>
      [
  	  myText = '*'
      token = new CommonToken(BLESS3Lexer.TIMES, '*')
      addChild(ie.l.toAST)
      for (ch : ie.r)
        addChild(ch.toAST)
      ]	
    }
  else ie.l.toAST	
    } 
    catch (Exception ex) {ex.printStackTrace x}
  }  // end of IndexExpression

  def BAST
parenthesize(IndexExpression ie)  
  {
  try {  
  newBAST(ie) =>  
    [  //left parenthesis is root
    myText = '('
    token = new CommonToken(BLESS3Lexer.LPAREN, '(')
    addChild(ie.toAST)  //first child is expression tree
    addChild(newBAST(ie) => 
       [  //right parenthesis is last child
       myText = ')'
       token = new CommonToken(BLESS3Lexer.RPAREN, ')') 
       ] )  
    ]     
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of parenthesize IndexExpression

//logicVariables :
//  ^( COMMA lv+=variable+ )
//  |  v=variable
  def dispatch BAST
toAST(LogicVariables e)
  {
  try 
    {  
    if (e.lv.size === 1)
      e.lv.head.toAST
    else  //ANTLR3 grammar has all logic variables the same type
	    newBAST(e) => [  //make ',' root
  	    myText = ','
        token = new CommonToken(BLESS3Lexer.COMMA, ',')
        for (v : e.lv)
         addChild(v.toAST)
      ]	
    } 
  catch (Exception ex) {ex.printStackTrace x}  	
  }   //end of LogicVariables

//modeCondition : ^( LITERAL_on tle=triggerLogicalExpression )
  def dispatch BAST
toAST(ModeCondition e)
  {
  try 
    {  
    newBAST(e) =>  [  
      myText = 'on'
      token = new CommonToken(BLESS3Lexer.LITERAL_on, 'on')
      addChild(e.tle.toAST)  	
  	  ]
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }  //end if ModeCondition

//valueName :
//  ^( id=ID DOLLAR pr=functionParameters )
//  | ^( id=ID ^( LBRACKET array_index+=indexExpressionOrRange+ ) ^( DOT pn+=partialName* )  )
//  |  ^( id=ID ^( DOT pn+=partialName+ )  )
//  | ^( q=QUESTION id=ID )
//  |  ^( TICK id=ID LITERAL_fresh )
//  | ^( TICK id=ID LITERAL_count )
//  | ^( TICK id=ID LITERAL_updated )
//  | id=ID
   def dispatch BAST
toAST(ValueName e)
  {
  try 
    {  
    if (e.lp) // function call
      newBAST(e) => [
        myText = e.id.name
        token = new CommonToken(BLESS3Lexer.ID, e.id.name)
        addChild(newBAST(e) => [
          myText = '$'
          token = new CommonToken(BLESS3Lexer.DOLLAR, '$')
          ])
        addChild(e.pr.toAST)
        ] 
    else if (e.lb)  //array index
      newBAST(e) => [
        myText = e.id.name
        token = new CommonToken(BLESS3Lexer.ID, e.id.name)
        addChild(newBAST(e) => [
          myText = '['
          token = new CommonToken(BLESS3Lexer.LBRACKET, '[')
          for (index : e.array_index)
            addChild(index.toAST)
          ])
        if (e.dot) //partial names in addition to array index?
          addChild(newBAST(e) =>  [
            myText = '.'
            token = new CommonToken(BLESS3Lexer.DOT, '.')
            for (partial_name: e.pn)  //then add the variables
              addChild(partial_name.toAST)
            ])
        ]  
	  else if (e.dot) //partial names?
	     newBAST(e) => [
        myText = e.id.name
        token = new CommonToken(BLESS3Lexer.ID, e.id.name)
        addChild(newBAST(e) =>  [
  	      myText = '.'
          token = new CommonToken(BLESS3Lexer.DOT, '.')
          for (partial_name: e.pn)  //then add the variables
            addChild(partial_name.toAST)
       	  ])
       	]
   else if (e.q) 
     newBAST(e) => [
       myText = '?'
       token = new CommonToken(BLESS3Lexer.QUESTION, '?')
       addChild(makeBASTforPort(e.id.name,e))
       ] 
   else if (e.fresh)
     makeBASTforPort(e.id.name+'\'fresh',e)
   else if (e.count)
     makeBASTforPort(e.id.name+'\'count',e)
   else if (e.updated)
      makeBASTforPort(e.id.name+'\'updated',e)
   else  //just id 
     e.id.name.makeBASTforID(e)
//      newBAST(e) =>  [
//       	myText = e.id.name
//       	token = new CommonToken(BLESS3Lexer.ID, e.id.name)
//        ]
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }   //end of ValueName

//formalExpressionPair : ^( COLON formal=ID actual=expression )
  def dispatch BAST
toAST(FormalExpressionPair e)
  {
  newBAST(e) => [
    myText = ':'
    token = new CommonToken(BLESS3Lexer.COLON, ':')
    addChild(e.formal.makeBASTforID(e))
    addChild(e.actual.toAST)
    ] 
  }   //end of FormalExpressionPair


//namelessAssertion : ^( ASSERTION pred=predicate )
  def dispatch BAST
toAST(NamelessAssertion e)
  {
  try 
    {  
	  newBAST(e) =>  [
  	   myText = 'ASSERTION'
       token = new CommonToken(BLESS3Lexer.ASSERTION, 'ASSERTION')
       addChild((e.predicate as Expression).toAST)
       ]
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }  //end of   NamelessAssertion   

//namelessFunction :
//  ^( ASSERTION_FUNCTION ^( LITERAL_returns tod=typeOrReference ) functionvalue=assertionFunctionValue )      
  def dispatch BAST
toAST(NamelessFunction e)
  {
  try 
    {  
	  newBAST(e) =>  [
  	   myText = 'ASSERTION_FUNCTION'
       token = new CommonToken(BLESS3Lexer.ASSERTION_FUNCTION, 'ASSERTION_FUNCTION')
       addChild(newBAST(e) => [
         myText = 'returns'
         token = new CommonToken(BLESS3Lexer.LITERAL_returns, 'returns')
         addChild(e.tod.toAST)
         ])
       addChild(e.functionvalue.toAST)
       ]
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }  //end of NamelessFunction

//namelessEnumeration : ^( ASSERTION_ENUMERATION inv=invocation )      
  def dispatch BAST
toAST(NamelessEnumeration e)
  {
  try 
    {  
	  newBAST(e) =>  [
  	   myText = 'ASSERTION_ENUMERATION'
       token = new CommonToken(BLESS3Lexer.ASSERTION_ENUMERATION, 'ASSERTION_ENUMERATION')
       addChild(e.enumeration.toAST)
       ]   
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }  //end of NamelessEnumeration


//partialName :
//  ^( record_id=ID ^( LBRACKET array_index+=indexExpressionOrRange ) )
//  | record_id=ID
  def dispatch BAST
toAST(PartialName e)
  {  //root is identifier
  try 
    {  
  	e.record_id.makeBASTforID(e) =>
  	  [  //any indexes?
  	  if (e.lb)
  	    addChild(newBAST(e) =>  
  	      [
          myText = '['
          token = new CommonToken(BLESS3Lexer.LBRACKET, '[')
          //add index children
          for (index : e.array_index)
            addChild(index.toAST)    
          ])
  	  ]
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }  //end of PartialName

//invocation :
//  ^( INVOKE id=ID )
//  | ^( INVOKE id=ID params+=actualParameter+ )
//  | ^( INVOKE id=ID exp=expression )
  def dispatch BAST
toAST(Invocation e)
  {
  newBAST(e) =>  
    [  //left parenthesis is root
  	myText = 'INVOKE['+e.label.name+']'
    token = new CommonToken(BLESS3Lexer.INVOKE, 'INVOKE['+e.label.name+']')
	  addChild(e.label.name.makeBASTforID(e))
	  if (e.actual_parameter!==null)	
	   	addChild(e.actual_parameter.toAST)   
	  else if (e.params!==null)	
	   	for (param : e.params) 
	   	  addChild(param.toAST)
	  ]  
  }  //end of Invocation

//  def boolean
//isPredicateParameter(NamedAssertion na, ActualParameter ap)
//  {  //VariableList has a "first" followed by params
//  if (ap.formal.equals(na.formals.first.name) && na.formals.first.tod.ty instanceof BooleanType)
//     return true; 
//  for (param : na.formals.parameter)
//    if (ap.formal.equals(param.name) && param.tod.ty instanceof BooleanType)
//      return true;
//  return false;  
//  }

// relation :
//  ^(EQ  lhs=addSub rhs=addSub )
//  |  ^(LT  lhs=addSub rhs=addSub )
//  |  ^(AM  lhs=addSub rhs=addSub )
//  |  ^(AL  lhs=addSub rhs=addSub )
//  |  ^(GT  lhs=addSub rhs=addSub )
//  |  ^(PLUS_EQUALS  lhs=addSub rhs=addSub )
//  |  ^(NEQ  lhs=addSub rhs=addSub )
//  |  ^(OLD_NEQ  lhs=addSub rhs=addSub )
//  |  ^(LITERAL_in lhs=addSub rng=range )
//  | as=addSub
  def dispatch BAST
toAST(Relation e)
  {
  try 
    {  
    if (e.in !== null)
      (newBAST(e) =>  
        [  
        myText = 'in'
        token = new CommonToken(BLESS3Lexer.LITERAL_in, 'in')
        addChild(e.l.toAST)   //s.b. only one
        addChild(e.range.toAST)
        ])
    else if (e.sym !== null)
      (e.sym.makeBASTforRelationSymbol(e) =>
         [  
         addChild(e.l.toAST)   
         addChild(e.r.toAST)  
         ])  
    else
      e.l.toAST   	
    }
  catch (Exception ex) {ex.printStackTrace x}
  }  //end of Relation
   
//universalQuantification : ^( a=LITERAL_all lv=logicVariables iw=in_which ^( LITERAL_are pred=predicate ) )
  def dispatch BAST
toAST(UniversalQuantification e)
  {
  try 
    {  
	  newBAST(e) =>  [  //make ^(all
  	  myText = 'all'  
      token = new CommonToken(BLESS3Lexer.LITERAL_all, 'all')
      //add logicVariables
      addChild(e.variables.toAST)  
      // put on in_which 
      if (e.in)
        addChild(newBAST(e)  =>
         [
         myText = 'in'
         token = new CommonToken(BLESS3Lexer.LITERAL_in, 'in')
         addChild(e.range.toAST)
         ] )
      else if (e.which)
        addChild(newBAST(e)  =>
         [
         myText = 'which'
         token = new CommonToken(BLESS3Lexer.LITERAL_which, 'which')
         addChild((e.condition as Expression).toAST)
         ] )
      // put on the "are"
      addChild(newBAST(e) =>
         [
         myText = 'are'
         token = new CommonToken(BLESS3Lexer.LITERAL_are, 'are')
         addChild((e.predicate as Expression).toAST)  
         ])
     ]	
     } 
  catch (Exception ex) {ex.printStackTrace x}
  }  //end of UniversalQuantification

//namedAssertion :
//  ^( ASSERTION ^( LABEL id=ID ) pred=predicate )
//  | ^( ASSERTION ^( LABEL id=ID ) ^( PARAMETERS formals=variableList ) pred=predicate )
//  | ^( ASSERTION_FUNCTION ^( LABEL id=ID ) ^( LITERAL_returns tod=typeOrReference ) functionvalue=assertionFunctionValue )
//  | ^( ASSERTION_FUNCTION ^( LABEL id=ID ) ^( PARAMETERS formals=variableList ) ^( LITERAL_returns tod=typeOrReference ) functionvalue=assertionFunctionValue )
//  | ^( ASSERTION_ENUMERATION ^( LABEL id=ID ) ^( TILDE assertionvariable=ID enumerationTy=ID ) enumeration=assertionEnumeration  ) 
  def dispatch BAST
toAST(NamedAssertion e)
  {
  try
    {  
    if (e.pred)  //regular ASSERTION
	    newBAST(e) => [  //make ^(ASSERTION root
  	    myText = 'ASSERTION['+e.name+']'  //ASSERTION root
        token = new CommonToken(BLESS3Lexer.ASSERTION, 'ASSERTION['+e.name+']')
        addChild(  //make LABEL subroot
	        newBAST(e) => [  //make ^(LABEL identifier)
  	        myText = 'LABEL'  //LABEL subroot
            token = new CommonToken(BLESS3Lexer.LABEL, 'LABEL')
            addChild(e.name.makeBASTforID(e))
          ])
       //if there are parameters
       if (e.formals !==null)    
	       addChild(newBAST(e) =>  
	    	   [  
  	       myText = 'PARAMETERS'  
           token = new CommonToken(BLESS3Lexer.PARAMETERS, 'PARAMETERS')
	         addChild(e.formals.toAST)
	         ])
       //finally, put the predicate on    
       addChild((e.predicate as Expression).toAST) //predicate=Predicate 
       ]	
   else if (e.func)  //ASSERTION_FUNCTION
	   newBAST(e) =>  [  //make ^(ASSERTION_FUNCTION root
  	   myText = 'ASSERTION_FUNCTION['+e.name+']'  
       token = new CommonToken(BLESS3Lexer.ASSERTION_FUNCTION, 'ASSERTION_FUNCTION['+e.name+']')
       addChild(  //make LABEL subroot
	       newBAST(e) =>  [  //make ^(LABEL identifier)
  	       myText = 'LABEL'  //LABEL subroot
           token = new CommonToken(BLESS3Lexer.LABEL, 'LABEL')
           addChild(e.name.makeBASTforID(e))
           ])
       //if there are parameters
       if (e.formals !==null)    
	       addChild(newBAST(e) =>  [  
  	       myText = 'PARAMETERS'  
           token = new CommonToken(BLESS3Lexer.PARAMETERS, 'PARAMETERS')
	         addChild(e.formals.toAST)])
	     //returns
       addChild(  //make LITERAL_returns subroot
         newBAST(e) =>  [  //make ^(LITERAL_returns tod)
           myText = 'returns'  //LITERAL_returns subroot
           token = new CommonToken(BLESS3Lexer.LITERAL_returns, 'returns')
           addChild(e.tod.toAST)
           ])
	     
       //finally, put the function on    
       addChild(e.functionvalue.toAST) // pfv=AssertionFunctionValue 
       ]
   else if (e.enumer)
	   newBAST(e) =>  [  //make ^(ASSERTION_ENUMERATION root
    	 myText = 'ASSERTION_ENUMERATION['+e.name+']'  //ASSERTION_ENUMERATION root
       token = new CommonToken(BLESS3Lexer.ASSERTION_ENUMERATION, 'ASSERTION_ENUMERATION['+e.name+']')
       addChild(  //make LABEL subroot
	       newBAST(e) =>  [  //make ^(LABEL identifier)
  	       myText = 'LABEL'  //LABEL subroot
           token = new CommonToken(BLESS3Lexer.LABEL, 'LABEL')
           addChild(e.name.makeBASTforID(e))
           ])
       //there is one parameter
       addChild(newBAST(e) =>  [  
  	       myText = '~' 
           token = new CommonToken(BLESS3Lexer.TILDE, '~')
           addChild(e.assertionvariable.makeBASTforID(e))   
           addChild(e.enumerationType.name.makeBASTforID(e))     
           ] )
       //finally, put the AssertionEnumeration on    
       addChild(e.enumeration.toAST) // ae=AssertionEnumeration 
       ]	
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }  //end of NamedAssertion


////////////////////////////  Action  //////////////////////////////////


//actionSubclause :
//  ^( ACTION_SUBCLAUSE (no_proof=DO_NOT_PROVE)? (tc=throwsClause)? (ac=assertClause)? 
//    ^( LITERAL_pre (precondition=assertion)? )
//    ^( LITERAL_post (postcondition=assertion)? ) 
//    ^( LITERAL_invariant (invariant=assertion)? ) 
//    elq=existentialLatticeQuantification )
  def dispatch BAST
toAST(ActionSubclause e)
  {
  try 
    {  
    newBAST(e) =>  [  
  	  myText = 'ACTION_SUBCLAUSE'  
      token = new CommonToken(BLESS3Lexer.ACTION_SUBCLAUSE, 'ACTION_SUBCLAUSE')
      if (e.no_proof)
        addChild(newBAST(e) => [  
        myText = "DO_NOT_PROVE"
        token = new CommonToken(BLESS3Lexer.DO_NOT_PROVE, "DO_NOT_PROVE")
        ] )  
      if (e.throws_clause!==null)
        addChild(e.throws_clause.toAST)  
      if (e.assert_clause!==null)
        addChild(e.assert_clause.toAST)
      addChild( newBAST(e) => [  //make LITERAL_pre
  	    myText = 'pre'  
        token = new CommonToken(BLESS3Lexer.LITERAL_pre, 'pre')
        if (e.precondition!==null) //have a precondition?
          addChild(e.precondition.toAST) //put on precondition
        ]	)
      addChild( newBAST(e) =>  
        [  //make LITERAL_post
  	    myText = 'post'  
        token = new CommonToken(BLESS3Lexer.LITERAL_post, 'post')
        if (e.postcondition!==null) //have a precondition?
          addChild(e.postcondition.toAST) //put on precondition
        ]	)
      addChild( newBAST(e) =>  
        [  //make LITERAL_invariant
  	    myText = 'post'  
        token = new CommonToken(BLESS3Lexer.LITERAL_invariant, 'invariant')
        if (e.invariant!==null) //have a invariant?
          addChild(e.invariant.toAST) //put on invariant
        ]	)
      addChild(e.elq.toAST)  // elq=ExistentialLatticeQuantification
      ]  
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }  //end of ActionSubclause

//action:
//  ba=basicAction
//  | if_fi=alternative
//  | wl=whileLoop
//  | fl=forLoop
//  | du=doUntilLoop
//  | elq=existentialLatticeQuantification //behavior_action_block
//  | ulq=universalLatticeQuantification   //forall_action
   def dispatch BAST
toAST(Action e)
  {
  try 
    {  
    e.basic?.toAST  ?: 
    e.if_fi?.toAST  ?: 
    e.wl?.toAST     ?: 
    e.fl?.toAST     ?: 
    e.du?.toAST     ?:
    e.elq?.toAST    ?: 
    e.ulq?.toAST 
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }  //end of Action

//actualParameter :
//  ^( COLON formal=ID actual=expression )
  def dispatch BAST
toAST(ActualParameter e)
  {
  try 
    {
    newBAST(e) =>  
      [  
  	  myText = ":"
      token = new CommonToken(BLESS3Lexer.COLON, ":")
      addChild(e.formal.makeBASTforID(e)) 
      addChild(e.actual.toAST)	
      ]
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }  //end of ActualParameter

//alternative : ^( LITERAL_if alt+=guardedAction+ )
  def dispatch BAST
toAST(Alternative e)
  {
  try {  
  val BLESSAlternative b = e.blessalt
	newBAST(e) =>  
	  [  //make ^( LITERAL_if  
  	myText = 'if'  //make left parenthesis
    token = new CommonToken(BLESS3Lexer.LITERAL_if, 'if')
    addChild(newBAST(e) =>
    	[
    	myText = ')~>'	
      token = new CommonToken(BLESS3Lexer.GUARD, ')~>')
      addChild((e.guard as Expression).toAST)
      addChild(b.action.toAST)
    	]  )  
    for (child : b.alternative)  //add  alternative+=GuardedAction
       addChild(child.toAST)  
    ]	
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of Alternative

//arrayRangeList :
//  nr=arrayRange
//  | ^(COMMA ranges+=arrayRange+)
  def dispatch BAST
toAST(ArrayRangeList e)
  {
  try {  
	if (e.comma)	
    newBAST(e) =>  
       [  
  	   myText = ","
       token = new CommonToken(BLESS3Lexer.COMMA, ",")
       for (child : e.range)  //add  range+=NaturalRange
         addChild(child.toAST) 	
       ]
  else  //just one range
    e.range.head.toAST
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of ArrayRangeList

//arrayRange :
//  n=aNumber
//  |  ^( DOTDOT lb=aNumber ub=aNumber )
  def dispatch BAST
toAST(ArrayRange e)
  {
  try {  
  if (e.ub === null)
    e.lb.toAST
  else	
    newBAST(e) =>  
       [  
  	   myText = ".."
       token = new CommonToken(BLESS3Lexer.DOTDOT, "..")
       addChild(e.lb.makeBASTforANumber(e)) 	
       addChild(e.ub.makeBASTforANumber(e)) 	
       ]
    } catch (Exception ex) {ex.printStackTrace x}
  }
  
//arrayType : ^(LITERAL_array arl=arrayRangeList LITERAL_of t=typeOrReference)
  def dispatch BAST
toAST(ArrayType e)
  {
  try 
    {  
	  newBAST(e) =>  
       [  
  	   myText = "array"
       token = new CommonToken(BLESS3Lexer.LITERAL_array, "array")
       addChild(e.array_ranges.toAST) 	//array_ranges=ArrayRangeList
       addChild(newBAST(e) =>  
          [  
  	      myText = "of"
          token = new CommonToken(BLESS3Lexer.LITERAL_of, "of") ] )
       addChild(e.typ.toAST) 	 //typ=Type
       ]
     } 
  catch (Exception ex) {ex.printStackTrace x}
  }  //end of ArrayType

//assertClause : ^( LITERAL_assert assertions+=namedAssertion+ )
  def dispatch BAST
toAST(AssertClause e)
  {
  try 
    {  
	  newBAST(e) =>  
       [  
  	   myText = "assert"
       token = new CommonToken(BLESS3Lexer.LITERAL_assert, "assert")
       for (child : e.assertions)  //add  (assertions+=Assertion)+
         {
         val namedAssertion = child.toAST  
         putAssertionIntoMap(child.name,namedAssertion)
         addChild(namedAssertion) 	   
         }
       ]
     } 
   catch (Exception ex) {ex.printStackTrace x}
   }  //end of AssertClause

//assertedAction :
//  ^( ACTION ^( P pre=assertion? ) ^( S s=action ) ^( Q post=assertion? ) )
  def dispatch BAST
toAST(AssertedAction e)
  {
  try 
    {  
	  newBAST(e) =>  
       [  //make ^( ACTION
  	   myText = "ACTION"
       token = new CommonToken(BLESS3Lexer.ACTION, "ACTION")
       //^( P["P"] $pre? )
       addChild(newBAST(e) =>  
         [  
  	     myText = "P"
         token = new CommonToken(BLESS3Lexer.P, "P")
         addChild(e.precondition?.toAST)
         ] ) 	
       //^( S["S"] s? )
       addChild(newBAST(e) =>  
         [  
  	     myText = "S"
         token = new CommonToken(BLESS3Lexer.S, "S")
         addChild(e.action.toAST)
         ] ) 	
       //^( Q["Q"] $post? )
       addChild(newBAST(e) =>  
         [  
  	     myText = "Q"
         token = new CommonToken(BLESS3Lexer.Q, "Q")
         addChild(e.postcondition?.toAST)
         ] ) 	
       ]
     } 
   catch (Exception ex) {ex.printStackTrace x}
   }  //end of AssertedAction

//assignment : ^( ASSIGN n=nameTick e=expressionOrAny )
  def dispatch BAST
toAST(Assignment e)
  {
  try 
    {  
	  newBAST(e) =>  
       [  
  	   myText = ":="
       token = new CommonToken(BLESS3Lexer.ASSIGN, ":=")
       addChild(e.lhs.toAST) 	
       addChild(e.rhs.toAST) 	
       ]
     } catch (Exception ex) {ex.printStackTrace x}
   }  //end of Assignment

//DEPRECATED
  def dispatch BAST
toAST(BAAlternative e)
  {
    newBAST(e) =>  
       [  
       myText = "skip"
       token = new CommonToken(BLESS3Lexer.LITERAL_skip, "skip")
       ]    
  }


//basicAction:
//  sk=LITERAL_skip
//  | ass=assignment
//  | ^( LITERAL_setmode mode=ID ) //[aadl2::Mode]
//  | wt=whenThrow
//  | co=combinableOperation
//  | ca=communicationAction 
//  | sa=simultaneousAssignment
//  | ie=issueException
  def dispatch BAST
toAST(BasicAction e)
  {
  try 
    {  
    e.assign?.toAST         ?:  
    e.when?.toAST           ?:
    e.comb?.toAST           ?:
    e.communication?.toAST  ?:  
    e.computation?.toAST    ?:
    e.multi_assign?.toAST   ?: 
    e.exc?.toAST            ?:    
    if (e.skip !== null)	
      newBAST(e) =>  
        [  
  	    myText = "skip"
        token = new CommonToken(BLESS3Lexer.LITERAL_skip, "skip")
        ]
    else if (e.mode!==null)
      newBAST(e) =>  
        [  
        myText = "setmode"
        token = new CommonToken(BLESS3Lexer.LITERAL_setmode, "setmode")
        addChild(e.mode.name.makeBASTforID(e))
        ] 
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }  //end of BasicAction


//behaviorActions  :
//  ^( SEMICOLON aa+=assertedAction+ )
//  | ^( AMPERSAND aa+=assertedAction+ )
//  | a=assertedAction
  def dispatch BAST
toAST(BehaviorActions e)
  {
  try {  
  if (e.semi)	 //sequential composition
    newBAST(e) =>  
       [  
  	   myText = ";"
       token = new CommonToken(BLESS3Lexer.SEMICOLON, ";")
       for (child : e.action)
         addChild(child.toAST)
       ]
  else if (e.amp)	//concurrent composition
    newBAST(e) =>  
       [  
  	   myText = "&"
       token = new CommonToken(BLESS3Lexer.AMPERSAND, "&")
       for (child : e.action)
         addChild(child.toAST)
       ]
  else  //just a single action
    e.action.head.toAST
     } catch (Exception ex) {ex.printStackTrace x}
  }  //end of BehaviorActions

//behaviorTime :
//  q=quantity
//  | vn=valueName
//  | ps=parenthesizedSubexpression
   def dispatch BAST
toAST(BehaviorTime e)
  {
  try 
    {  
	  e.quantity?.toAST  ?:
    e.value?.toAST  ?:
    e.duration?.toAST        
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }  //end of BehaviorTime

//caseChoice : ^( IMP bool=expression exp=expression )
  def dispatch BAST
toAST(CaseChoice e)
  {
  try 
    {  
	  newBAST(e) =>  
       [  //IMP as root
       myText = "->"
       token =  new CommonToken(BLESS3Lexer.IMP, "->")
       addChild((e.be as Expression).toAST)
       addChild(e.exp.toAST)
       ]
    } 
  catch (Exception ex) {ex.printStackTrace x}
	}  //end of CaseChoice
	
//caseExpression : ^( LITERAL_case cc+=caseChoice+ )
  def dispatch BAST
toAST(CaseExpression e)
  {
  try 
    {  
	  newBAST(e) =>  
       [  
  	   myText = "LITERAL_case"
       token = new CommonToken(BLESS3Lexer.LITERAL_case, "LITERAL_case")
       for (child : e.cc)
         addChild(child.toAST) 	
       ]
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }  //end of CaseExpression

//catchClause : ^( LITERAL_catch cct+=catchClauseTerm+ )
  def dispatch BAST
toAST(CatchClause e)
  {
  try 
    {  
	  newBAST(e) =>  
       [  
  	   myText = "catch"
       token = new CommonToken(BLESS3Lexer.LITERAL_catch, "catch")
       for (child : e.catches)
         addChild(child.toAST) 	
       ]
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }  //end of CatchClause


//catchClauseTerm :
//  ^( LPAREN exceptions+=ID+  colon=COLON act=basicAction RPAREN )
//  | ^( LPAREN LITERAL_all colon=COLON act=basicAction RPAREN )
  def dispatch BAST
toAST(CatchClauseTerm e)
  {
  try 
    {  
	  newBAST(e) =>  
       [  //LPAREN as root
  	   myText = "("
       token = new CommonToken(BLESS3Lexer.LPAREN, "(")
       if (e.all)
         addChild(newBAST(e) => [  
  	       myText = "all"
           token = new CommonToken(BLESS3Lexer.LITERAL_all, "all")
           ] )
       else //it has exception IDs
         for (child : e.exceptions)
           addChild(child.name.makeBASTforID(e)) 
       addChild(newBAST(e) => [  
         myText = ":"
         token = new CommonToken(BLESS3Lexer.COLON, ":")
         ])
       addChild(e.action.toAST)
       addChild(newBAST(e) => [  
         myText = ")"
         token = new CommonToken(BLESS3Lexer.RPAREN, ")")
         ])
       ]
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }  //end of CatchClauseTerm
  
//combinableOperation :
//  ^( fa=LITERAL_fetchadd target=ID arithmetic=expression result=ID )
//  | ^( fo=LITERAL_fetchor target=ID bool=expression result=ID )
//  | ^( fan=LITERAL_fetchand target=ID bool=expression result=ID )
//  | ^( fx=LITERAL_fetchxor target=ID bool=expression result=ID )
//  | ^( sw=LITERAL_swap target=ID reference=ID result=ID )
  def dispatch BAST
toAST(CombinableOperation e)
  {
  try {  
  if (e.f_add)	 //fetch-add
    newBAST(e) =>  
       [  
  	   myText = "fetchadd"
       token = new CommonToken(BLESS3Lexer.LITERAL_fetchadd, "fetchadd")
       addChild(e.target.name.makeBASTforID(e))
       addChild(e.arithmetic.toAST)
       addChild(e.result.name.makeBASTforID(e))
       ]
  else if (e.f_or)	 //fetch-or
    newBAST(e) =>  
       [  
  	   myText = "fetchor"
       token = new CommonToken(BLESS3Lexer.LITERAL_fetchor, "fetchor")
       addChild(e.target.name.makeBASTforID(e))
       addChild(e.bool.toAST)
       addChild(e.result.name.makeBASTforID(e))
       ]
  else if (e.f_xor)	 //fetch-xor
    newBAST(e) =>  
       [  
  	   myText = "fetchxor"
       token = new CommonToken(BLESS3Lexer.LITERAL_fetchxor, "fetchxor")
       addChild(e.target.name.makeBASTforID(e))
       addChild(e.bool.toAST)
       addChild(e.result.name.makeBASTforID(e))
       ]
  else if (e.f_and)	 //fetch-add
    newBAST(e) =>  
       [  
  	   myText = "fetchand"
       token = new CommonToken(BLESS3Lexer.LITERAL_fetchand, "fetchand")
       addChild(e.target.name.makeBASTforID(e))
       addChild(e.bool.toAST)
       addChild(e.result.name.makeBASTforID(e))
       ]
  else if (e.sw)	 //fetch-add
    newBAST(e) =>  
       [  
  	   myText = "swap"
       token = new CommonToken(BLESS3Lexer.LITERAL_swap, "swap")
       addChild(e.target.name.makeBASTforID(e))
       addChild(e.reference.name.makeBASTforID(e))
       addChild(e.result.name.makeBASTforID(e))
       ]
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }  //end of CombinableOperation

//communicationAction:
//  pc=subprogramCall
//  | po=portOutput
//  | pi=portInput
  def dispatch BAST
toAST(CommunicationAction e)
  {
  try 
    {  
    e.pc?.toAST  ?:
    e.po?.toAST  ?:
    e.pi?.toAST  
  // freeze action  port>> ignored  
//  else if (e.pause!==null)
//    newBAST(e) =>  
//       [  
//  	   myText = "pause"
//       token = new CommonToken(BLESS3Lexer.LITERAL_pause, "pause")      
//       ]    
    } 
  catch (Exception ex) {ex.printStackTrace x}
  }  //end of CommunicationAction


  def dispatch BAST
toAST(Computation e)
  {
  try {  
  newBAST(e) =>  
    [  
  	myText = "computation"
    token = new CommonToken(BLESS3Lexer.LITERAL_computation, "computation")
    addChild(e.lb.toAST)
    addChild(e.ub?.toAST)
    if (e.component!==null)
      addChild(newBAST(e) =>  
        [  
        myText = "binding"
        token = new CommonToken(BLESS3Lexer.LITERAL_binding, "binding")
        for (c : e.component)
          addChild(c.qualifiedName().makeBASTforPropertyName(e))
        ] )
    ]
    } 
  catch (Exception ex) {ex.printStackTrace x}    
  }

//doUntilLoop :
//  ^( LITERAL_do ^( LITERAL_until be=expression ) ^( INVARIANT inv=assertion? ) ^( BOUND bd=assertion? ) 
  def dispatch BAST
toAST(DoUntilLoop e)
  {
  try 
    {  
	  newBAST(e) =>  
       [  //'do' as root
  	   myText = "do"
       token = new CommonToken(BLESS3Lexer.LITERAL_do, "do")
       //'until' is first child
       addChild(newBAST(e) =>  
           [  //
  	       myText = "until"
           token = new CommonToken(BLESS3Lexer.LITERAL_until, "until")
           addChild((e.guard as Expression).toAST)
           ] )
       addChild(newBAST(e) =>  
           [  //
  	       myText = "invariant"
           token = new CommonToken(BLESS3Lexer.LITERAL_invariant, "invariant")
           //have invariant?
           if (e.invariant)  
             addChild(e.inv.toAST)
           ] )
       addChild(newBAST(e) =>  
           [  //
  	       myText = "bound"
           token = new CommonToken(BLESS3Lexer.LITERAL_bound, "bound")
           //have bound function?    
           if (e.bound)  
              addChild(e.bnd.toAST)
           ] )
       //finally, actions to do    
       addChild(e.actions.toAST)
       ]
     } 
   catch (Exception ex) {ex.printStackTrace x}    
   }  //end of DoUntilLoop
  
//enumerationType  :  ^(LITERAL_enumeration id+=ID+)
  def dispatch BAST
toAST(EnumerationType e)
  {
  try 
    {  
    newBAST(e) =>  
       [  
  	   myText = "enumeration"
       token = new CommonToken(BLESS3Lexer.LITERAL_enumeration, "enumeration")
       for (child : e.defining_enumeration_literal)  
         addChild(child.makeBASTforID(e)) 	
       ]
    } 
  catch (Exception ex) {ex.printStackTrace x}    
  }  //end of EnumerationType

//existentialLatticeQuantification :
//  ^( LCURLY ( qv=quantifiedVariables )? actions=behaviorActions RCURLY ( cc=catchClause )? )
  def dispatch BAST
toAST(ExistentialLatticeQuantification e)
  {
  try 
    {  
    newBAST(e) =>  
       [  
  	   myText = "{"
       token = new CommonToken(BLESS3Lexer.LCURLY, "{")
       if (e.quantified_variables!==null)
         addChild(e.quantified_variables.toAST) 	
       addChild(e.actions.toAST) 	
       addChild(  //add right curly
         newBAST(e) =>  [ 
           myText = '}'  //make right curly
           token = new CommonToken(BLESS3Lexer.RCURLY, '}') 
           ] )
//       if (e.timeout!==null)
//         addChild(  //add right curly
//           newBAST(e) =>  [ myText = 'timeout'  //make right curly
//             token = new CommonToken(BLESS3Lexer.LITERAL_timeout, 'timeout')     
//             addChild(e.timeout.toAST) ] ) 	        	
       if (e.catch_clause!==null)
         addChild(e.catch_clause.toAST)
         ]
    } 
  catch (Exception ex) {ex.printStackTrace x}    
  }  //end of ExistentialLatticeQuantification

//expressionOrAny :
//  exp=expression
//  | any=LITERAL_any
  def dispatch BAST
toAST(ExpressionOrAny e)
  {
  try 
    {  
    e.exp?.toAST ?:
    e.any?.makeBASTforID(e)
    } 
  catch (Exception ex) {ex.printStackTrace x}    
  }  // end of ExpressionOrAny

//expression : 
//  all=universalQuantification
//  | exists=existentialQuantification
//  | sum=sumQuantification
//  | product=productQuantification
//  | numberof=countingQuantification
//  | ^( iff=LITERAL_iff l=disjunction r=disjunction )
//  | ^( imp=LITERAL_implies l=disjunction r=disjunction )
  def dispatch BAST
toAST(Expression e)
  {
  try {  
  e.all?.toAST ?:
  e.exists?.toAST ?:
  e.sum?.toAST ?:
  e.product?.toAST ?:
  e.numberof?.toAST ?:
  if (e.sym === null)
    e.l?.toAST
  else if (e.sym.equals('iff'))
    (newBAST(e) =>
    [
    myText = 'iff'
    token =  new CommonToken(BLESS3Lexer.LITERAL_iff, 'iff')  
    addChild(e.l.toAST)	
    addChild(e.r.toAST)	
    ])
  else if (e.sym.equals('implies'))
    (newBAST(e) =>
    [
    myText = 'implies'
    token =  new CommonToken(BLESS3Lexer.LITERAL_implies, 'implies')  
    addChild(e.l.toAST)	
    addChild(e.r.toAST)	
    ])
    } catch (Exception ex) {ex.printStackTrace x}    
  }  //end of Expression

//disjunction :
//  ^( LITERAL_or c+=conjunction+ )
//  | ^( LITERAL_else c+=conjunction+ )
//  | ^( LITERAL_xor c+=conjunction+ )
//  | con=conjunction
  def dispatch BAST
toAST(Disjunction e)
  {
  try {  
  if (e.sym === null)
    e.l.toAST
  else if (e.sym.equals('or'))
    (newBAST(e) =>
    [
    myText = 'or'
    token =  new CommonToken(BLESS3Lexer.LITERAL_or, 'or')  
    addChild(e.l.toAST) 
    for (rchild : e.r)
      addChild(rchild.toAST)  
    ])
  else if (e.sym.equals('else'))
    (newBAST(e) =>
    [
    myText = 'else'
    token =  new CommonToken(BLESS3Lexer.LITERAL_else, 'else')  
    addChild(e.l.toAST) 
    for (rchild : e.r)
      addChild(rchild.toAST)  
    ])
  else if (e.sym.equals('xor'))
    (newBAST(e) =>
    [
    myText = 'xor'
    token =  new CommonToken(BLESS3Lexer.LITERAL_xor, 'xor')  
    addChild(e.l.toAST) 
    for (rchild : e.r)
      addChild(rchild.toAST)  
    ])
    } catch (Exception ex) {ex.printStackTrace x}    
  }  // end of disjunction

//conjunction :
//  ^( LITERAL_and r+=relation+ )
//  | ^( LITERAL_then r+=relation+ )
//  | rel=relation
  def dispatch BAST
toAST(Conjunction e)
  {
  try {  
  if (e.sym === null)
    e.l.toAST
  else if (e.sym.equals('and'))
    (newBAST(e) =>
    [
    myText = 'and'
    token =  new CommonToken(BLESS3Lexer.LITERAL_and, 'and')  
    addChild(e.l.toAST)	
    for (rchild : e.r)
      addChild(rchild.toAST)	
    ])    
  else if (e.sym.equals('then'))
    (newBAST(e) =>
    [
    myText = 'then'
    token =  new CommonToken(BLESS3Lexer.LITERAL_then, 'then')  
    addChild(e.l.toAST)	
    for (rchild : e.r)
      addChild(rchild.toAST)	
    ])    
    } catch (Exception ex) {ex.printStackTrace x}    
  }
  
//addSub :
//  ^( PLUS md+=multDiv+ )
//  | ^( MINUS l=multDiv r=multDiv )
//  | m=multDiv
  def dispatch BAST
toAST(AddSub e)
  {
  try {  
  if (e.sym === null)
    e.l.toAST
  else if (e.sym.equals('+'))  	
    (newBAST(e) =>
    [
    myText = '+'
    token =  new CommonToken(BLESS3Lexer.PLUS, '+')  
    addChild(e.l.toAST)	
    for (rchild : e.r)
      addChild(rchild.toAST)	
    ])    
  else if (e.sym.equals('-'))  	
    (newBAST(e) =>
    [
    myText = '-'
    token =  new CommonToken(BLESS3Lexer.MINUS, '-')  
    addChild(e.l.toAST)	
    addChild(e.r.head.toAST)	
    ])    
    } catch (Exception ex) {ex.printStackTrace x}    
  }  // end of AddSub

//multDiv :
//  ^( TIMES exp+=exponentiation+ )
//  | ^( DIVIDE l=exponentiation r=exponentiation )
//  | ^( LITERAL_div l=exponentiation r=exponentiation )
//  | ^( LITERAL_mod l=exponentiation r=exponentiation )
//  | ^( LITERAL_rem l=exponentiation r=exponentiation )
//  | e=exponentiation 
   def dispatch BAST
toAST(MultDiv e)
  {
  try {  
  if (e.sym === null)
    e.l.toAST
  else if (e.sym.equals('/'))  
    (newBAST(e) =>
    [
    myText = '/'
    token =  new CommonToken(BLESS3Lexer.DIVIDE, '/')  
    addChild(e.l.toAST) 
    addChild(e.r.head.toAST)  
    ])    
  else if (e.sym.equals('div'))  
    (newBAST(e) =>
    [
    myText = 'div'
    token =  new CommonToken(BLESS3Lexer.LITERAL_div, 'div')  
    addChild(e.l.toAST) 
    addChild(e.r.head.toAST)  
    ])    
  else if (e.sym.equals('mod'))  	
    (newBAST(e) =>
    [  
    myText = 'mod'
    token =  new CommonToken(BLESS3Lexer.LITERAL_mod, 'mod')  
    addChild(e.l.toAST)	
    addChild(e.r.head.toAST)	
    ])   
  else if (e.sym.equals('rem'))  	
    (newBAST(e) =>
    [
    myText = 'rem'
    token =  new CommonToken(BLESS3Lexer.LITERAL_rem, 'rem')  
    addChild(e.l.toAST)	
    addChild(e.r.head.toAST)	
    ])    
  else if (e.sym.equals('*'))  	
    (newBAST(e) =>
    [
    myText = '*'
    token =  new CommonToken(BLESS3Lexer.TIMES, '*')  
    addChild(e.l.toAST)	
    for (rchild : e.r)
      addChild(rchild.toAST)	
    ])      	
    } catch (Exception ex) {ex.printStackTrace x}    
  }  // end of MultDiv

//exponentiation :
//  ^( EXP l=subexpression r=subexpression )
//  | s=subexpression  
  def dispatch BAST
toAST(Exp e)
  {
  try {  
  if (e.sym === null)
    e.l.toAST
  else
    (newBAST(e) =>
    [  
    myText = '**'
    token =  new CommonToken(BLESS3Lexer.EXP, '**')  
    addChild(e.l.toAST)	
    addChild(e.r.toAST)	
    ])   
    } catch (Exception ex) {ex.printStackTrace x}      	
  }  // end of Exp
  
//forLoop  :
//  ^( LITERAL_for id=ID ^( LITERAL_in lb=expression ub=expression ) ^( INVARIANT inv=assertion? ) 
//      act=behaviorActions )
  def dispatch BAST
toAST(ForLoop e)
  {
  try {  
    newBAST(e) =>  
       [  
  	   myText = "for"
       token = new CommonToken(BLESS3Lexer.LITERAL_for, "for")
       addChild(e.count.name.makeBASTforID(e)) 	
       addChild( newBAST(e) =>  
         [  
  	     myText = "in"
         token = new CommonToken(BLESS3Lexer.LITERAL_in, "in")
         addChild(e.lower_bound.toAST) 	
         addChild(e.upper_bound.toAST) 	
         ] )
       addChild( newBAST(e) =>  
         [  
  	     myText = "invariant"
         token = new CommonToken(BLESS3Lexer.LITERAL_invariant, "invariant")
         addChild(e.inv?.toAST) 	
         ] )
       addChild(e.action.toAST) 	
       ]
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of ForLoop

//formalActual :
//  ^( COLON formal=ID actual=subProgramParameter )
//  | spp=subProgramParameter
  def dispatch BAST
toAST(FormalActual e)
  {
  try {  
  if (e.formal===null)
    e.actual.toAST
  else	
    newBAST(e) =>  
       [  
  	   myText = ":"
       token = new CommonToken(BLESS3Lexer.COLON, ":")
       addChild(e.formal.name.makeBASTforID(e))
       addChild(e.actual.toAST)
       ]
    } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of FormalActual
  
//formalActualList :
//  ^( COMMA fa+=formalActual+ )
//  | s=formalActual
  def dispatch BAST
toAST(FormalActualList e)
  {
  try {  
	if (e.comma)	
    newBAST(e) =>  
       [  
  	   myText = ","
       token = new CommonToken(BLESS3Lexer.COMMA, ",")
       for (child : e.variables)  
         addChild(child.toAST) 	
       ]
  else  //just one variable
    e.variables.head.toAST
    } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of FormalActualList

//ghostVariable : ^( LITERAL_def  id=ID tod=typeOrReference )
  def dispatch BAST
toAST(GhostVariable e)
  {
  newBAST(e) => 
    [
    myText = "def"
    token = new CommonToken(BLESS3Lexer.LITERAL_def, "def")
    addChild(e.name.makeBASTforID(e))
    addChild(e.tod.toAST)
    ]
  }  //end of GhostVariable

//ghostVariables : ^( LITERAL_ghost gv+=ghostVariable+ )
  def dispatch BAST
toAST(GhostVariables e)
  {
  newBAST(e) => 
    [
    myText = "ghost"
    token = new CommonToken(BLESS3Lexer.LITERAL_ghost, "ghost")
    for (child : e.gv)
      addChild(child.toAST)
    ]
  } //end of GhostVariables
  
//guardedAction : ^( GUARD exp=expression aa=assertedAction )
  def dispatch BAST
toAST(GuardedAction e)
  {
  try {  
  newBAST(e) =>  
     [  
  	 myText = ")~>"  //root is)~>
     token = new CommonToken(BLESS3Lexer.GUARD, ")~>")
     addChild( (e.guard as Expression).toAST) 
     addChild( e.action.toAST) 	
     ]
    } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of GuardedAction
 
//nameTick : 
//  ^( TICK vn=valueName )
//  | vn=valueName
  def dispatch BAST
toAST(NameTick e)
  {
  try {  
	if (e.tick)	
    newBAST(e) =>  
       [  
  	   myText = "'"
       token = new CommonToken(BLESS3Lexer.TICK, "'")
       addChild(e.value.toAST) 	
       ]
  else  //just one variable
    e.value.toAST
    } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of NameTick

//quantity :
//  ^( QUANTITY number=aNumber )
//  | ^( QUANTITY number=aNumber unit=ID )
//  | ^( QUANTITY number=aNumber LITERAL_scalar )
//  | ^( QUANTITY number=aNumber LITERAL_whole )
  def dispatch BAST
toAST(Quantity e)
  {
    newBAST(e) =>  
       [  
       myText = "QUANTITY"
       token = new CommonToken(BLESS3Lexer.QUANTITY, "QUANTITY")
       addChild(e.number.makeBASTforANumber(e))
       if (e.unit!==null)
         addChild(e.unit.name.makeBASTforID(e))
       else if (e.scalar)
         addChild(newBAST(e) =>  
           [  
           myText = "scalar"
           token = new CommonToken(BLESS3Lexer.LITERAL_scalar, "scalar")
           ] )  
       else if (e.whole)
         addChild(newBAST(e) =>  
           [  
           myText = "whole"
           token = new CommonToken(BLESS3Lexer.LITERAL_whole, "whole")
           ] )  
       ]
  }  // end of Quantity

//quantityType :
//  ^( LITERAL_quantity unit=ID )
//  | ^( LITERAL_quantity scalar=LITERAL_scalar )
//  | ^( LITERAL_quantity whole=LITERAL_whole )
//  | ^( LITERAL_quantity unit=ID ^(DOTDOT lb=aNumber ub=aNumber) )
//  | ^( LITERAL_quantity scalar=LITERAL_scalar ^(DOTDOT lb=aNumber ub=aNumber) )
//  | ^( LITERAL_quantity whole=LITERAL_whole ^(DOTDOT lb=aNumber ub=aNumber) )
//  | ^( LITERAL_quantity unit=ID ^(DOTDOT lb=aNumber ub=aNumber) ^(LITERAL_step step=aNumber) )
//  | ^( LITERAL_quantity scalar=LITERAL_scalar ^(DOTDOT lb=aNumber ub=aNumber) ^(LITERAL_step step=aNumber) )
//  | ^( LITERAL_quantity whole=LITERAL_whole ^(DOTDOT lb=aNumber ub=aNumber) ^(LITERAL_step step=aNumber) )
//  | ^( LITERAL_quantity unit=ID ^(LITERAL_representation representation=QCLREF ) )
//  | ^( LITERAL_quantity scalar=LITERAL_scalar ^(LITERAL_representation representation=QCLREF ) )
//  | ^( LITERAL_quantity whole=LITERAL_whole ^(LITERAL_representation representation=QCLREF ) )
//  | ^( LITERAL_quantity unit=ID ^(DOTDOT lb=aNumber ub=aNumber) ^(LITERAL_representation representation=QCLREF ) )
//  | ^( LITERAL_quantity scalar=LITERAL_scalar ^(DOTDOT lb=aNumber ub=aNumber) ^(LITERAL_representation representation=QCLREF ) )
//  | ^( LITERAL_quantity whole=LITERAL_whole ^(DOTDOT lb=aNumber ub=aNumber) ^(LITERAL_representation representation=QCLREF ) )
//  | ^( LITERAL_quantity unit=ID ^(DOTDOT lb=aNumber ub=aNumber) ^(LITERAL_step step=aNumber) ^(LITERAL_representation representation=QCLREF ) )
//  | ^( LITERAL_quantity scalar=LITERAL_scalar ^(DOTDOT lb=aNumber ub=aNumber) ^(LITERAL_step step=aNumber) ^(LITERAL_representation representation=QCLREF ) )
//  | ^( LITERAL_quantity whole=LITERAL_whole ^(DOTDOT lb=aNumber ub=aNumber) ^(LITERAL_step step=aNumber) ^(LITERAL_representation representation=QCLREF ) )
  def dispatch BAST
toAST(QuantityType e)
  {
  try 
    {  
    newBAST(e) =>  
    [  
  	myText = "quantity"
    token = new CommonToken(BLESS3Lexer.LITERAL_quantity, "quantity")
   if (e.whole !== null)  
      addChild(newBAST(e) =>  
        [  
  	    myText = "whole" 
        token = new CommonToken(BLESS3Lexer.LITERAL_whole, "whole")
        ]	)
    else if (e.scalar !== null)
      addChild(newBAST(e) =>  
        [  
        myText = "scalar" 
        token = new CommonToken(BLESS3Lexer.LITERAL_scalar, "scalar")
        ] )
    else  //it has a unit
      addChild(e.unit.name.makeBASTforID(e))
//    if (e.lb !== null)  //have range?
//      addChild(newBAST(e) =>  
//        [  
//  	    myText = ".."  //add range
//        token = new CommonToken(BLESS3Lexer.DOTDOT, "..")
//        addChild(e.lb.makeBASTforANumber(e))
//        addChild(e.ub.makeBASTforANumber(e))
//        ]	)
//    if (e.step!==null)  //have step?
//      addChild(newBAST(e) =>  
//        [  
//        myText = "step"  //add step
//        token = new CommonToken(BLESS3Lexer.LITERAL_step, "step")
//        addChild(e.step.makeBASTforANumber(e))
//        ] )
//    if (e.representation!==null)  //have representation?
//      addChild(newBAST(e) =>  
//        [  
//        myText = "representation"  //add representation
//        token = new CommonToken(BLESS3Lexer.LITERAL_representation, "representation")
//        addChild(e.representation.name.makeBASTforPropertyName(e))
//        ] )
    ]  //end of quantity
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of QuantityType

//parenthesizedSubexpression :
//  ^( LPAREN ex=expression RPAREN )
//  QQ is unparsed by conditionalExpression
//  | ^( LPAREN ^( QQ exp=expression t=expression f=expression ) RPAREN )
//  | ^( LPAREN ce=caseExpression RPAREN )
  def dispatch BAST
toAST(ParenthesizedSubexpression e)
  {  
  try 
    {  
    newBAST(e) =>  
       [  
       myText = "("
       token = new CommonToken(BLESS3Lexer.LPAREN, "(")
       if (e.caseexpression !== null)  //is this a conditional expression?
         addChild(e.caseexpression.toAST)
       else if (e.t !== null)
         addChild(newBAST(e) =>  
           [
           myText = 'QQ'
           token = new CommonToken(BLESS3Lexer.QQ, 'QQ')
           addChild(e.expression.toAST)  //exp=expression
           addChild(e.t.toAST)  //true choice, t = assertion_expression
           addChild(e.f.toAST)  //false choice f = assertion_expression
           ] )
       else //else it's a parenthesized subexpression
         addChild(e.expression.toAST) 
       addChild(newBAST(e) =>  
         [  
         myText = ")"
         token = new CommonToken(BLESS3Lexer.RPAREN, ")")
         ] )
       ]
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of ParenthesizedSubexpression

//portInput : ^( PORT_INPUT pn=ID n=valueName )
  def dispatch BAST
toAST(PortInput e)
  {
  try {  
  newBAST(e) =>  
    [  
  	myText = "PORT_INPUT["+e.port.name+"]"
    token = new CommonToken(BLESS3Lexer.PORT_INPUT, "PORT_INPUT["+e.port.name+"]")
    addChild(e.port.name.makeBASTforPort(e)) 	
    addChild(e.target.toAST) 	
    ]
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of PortInput

//portOutput : ^( PORT_OUTPUT pn=ID be=expression? )
  def dispatch BAST
toAST(PortOutput e)
  {
  try {  
  newBAST(e) =>  
    [  
  	myText = "PORT_OUTPUT["+e.port.name+"]"
    token = new CommonToken(BLESS3Lexer.PORT_OUTPUT, "PORT_OUTPUT["+e.port.name+"]")
    addChild(e.port.name.makeBASTforPort(e)) 	
    if (e.eor!==null)
      addChild(e.eor.toAST) 	
    ]
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of PortOutput

//quantifiedVariables : ^( LITERAL_declare decs+=variableDeclaration+ )
  def dispatch BAST
toAST(QuantifiedVariables e)
  {
  try {  
  newBAST(e) =>  
    [  
  	myText = "declare"
    token = new CommonToken(BLESS3Lexer.LITERAL_declare, "declare")
    for (child : e.variables )
      addChild(child.toAST) 	
    ]
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of QuantifiedVariables


//variableDeclaration :
//  ^( VARIABLE_DECLARATION v=variable ( ^( ASSIGN exp=expression ) )? a=assertion? 
//    nv=LITERAL_nonvolatile? sh=LITERAL_shared? c=LITERAL_constant? sp=LITERAL_spread? f=LITERAL_final? )
  def dispatch BAST
toAST(VariableDeclaration e)
  {  //same as BehaviorVariable
  try {  
	newBAST(e) =>  
       [
  	   myText = "VARIABLE_DECLARATION["+e.variable.name+"]"
       token = new CommonToken(BLESS3Lexer.VARIABLE_DECLARATION, 
           "VARIABLE_DECLARATION["+e.variable.name+"]")
       addChild(e.variable.toAST) 	
       if (e.assign)
         addChild( newBAST(e) =>  
           [  
           myText = ":="
           token = new CommonToken(BLESS3Lexer.ASSIGN, ":=")
           addChild(e.expression.toAST)   
           ] ) 
       //then the Assertion
       addChild(e.assertion?.toAST) 
//  "nonvolatile" "shared" "constant" "spread"  "final"     
       if (e.constant)
         addChild( newBAST(e) =>  
         [  
  	     myText = "constant"
         token = new CommonToken(BLESS3Lexer.LITERAL_constant, "constant")
         ] ) 
       else if (e.nonvolatile)
         addChild( newBAST(e) =>  
         [  
  	     myText = "nonvolatile"
         token = new CommonToken(BLESS3Lexer.LITERAL_nonvolatile, "nonvolatile")
         ] ) 
       else if (e.shared)
         addChild( newBAST(e) =>  
         [  
  	     myText = "shared"
         token = new CommonToken(BLESS3Lexer.LITERAL_shared, "shared")
         ] ) 
       else if (e.spread)
         addChild( newBAST(e) =>  
         [  
  	     myText = "spread"
         token = new CommonToken(BLESS3Lexer.LITERAL_spread, "spread")
         ] ) 
       else if (e.final)
         addChild( newBAST(e) =>  
         [  
  	     myText = "final"
         token = new CommonToken(BLESS3Lexer.LITERAL_final, "final")
         ] ) 
      ]
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of VariableDeclaration
  
//range :
//  ^( dd=DOTDOT lb=subexpression ub=subexpression )
//  |  ^( cd=COMMADOT lb=subexpression ub=subexpression )
//  |  ^( dc=DOTCOMMA lb=subexpression ub=subexpression )
//  |  ^( cc=COMMACOMMA lb=subexpression ub=subexpression )
  def dispatch BAST
toAST(Range e)
  {
  try {  
  e.sym.makeBASTforRangeSymbol(e) =>
    [  //add upper and lower bounds to range symbol
    addChild(e.lower_bound.toAST)
    addChild(e.upper_bound.toAST)
    ]   
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of Range

//recordField  :  ^(COLON df=ID ptd=typeOrReference)
  def dispatch BAST
toAST(RecordField e)
  {
  try {  
  newBAST(e) =>  
    [  
  	myText = ":"
    token = new CommonToken(BLESS3Lexer.COLON, ":")
    addChild(e.label.makeBASTforID(e))
    addChild(e.typ.toAST)
    ]   
    }
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of RecordField

//recordTerm : ^( RECORD_TERM typeid=ID prv+=recordValue+ )
  def dispatch BAST
toAST(RecordTerm e)
  {
  try {  
  newBAST(e) =>  
    [  //root is RECORD_TERM
  	myText = "RECORD_TERM["+e.record_type.name+"]"
    token = new CommonToken(BLESS3Lexer.RECORD_TERM, 
        "RECORD_TERM["+e.record_type.name+"]")
    addChild(e.record_type.name.makeBASTforID(e))
    for (child : e.record_value)  //add record_value+=RecordValue+
      addChild(child.toAST)
    ]   
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of RecordTerm

//recordType  :
//  ^(r=LITERAL_record rf+=recordField+)
//  | ^(r=LITERAL_variant rf+=recordField+)
  def dispatch BAST
toAST(RecordType e)
  {
  try 
    {
    if (e.record)  
      newBAST(e) =>  
        [  
        myText = "record"
        token = new CommonToken(BLESS3Lexer.LITERAL_record, "record")
        for (child : e.fields)  
          addChild(child.toAST)
        ]   
    else if (e.variant)  
      newBAST(e) =>  
        [  
        myText = "variant"
        token = new CommonToken(BLESS3Lexer.LITERAL_variant, "variant")
        for (child : e.fields)  
          addChild(child.toAST)
        ]   
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of RecordType

//recordValue : ^( ARROW field=ID v=value )
  def dispatch BAST
toAST(RecordValue e)
  {
  try {  
  newBAST(e) =>  
    [  
  	myText = "=>"
    token = new CommonToken(BLESS3Lexer.ARROW, "=>")
    addChild(e.label.makeBASTforID(e))
    addChild(e.aval.toAST)
    ]   
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of RecordValue

//simultaneousAssignment : ^( ASSIGN ^( COMMA lhs+=nameTick+ ) ^( COMMA rhs+=expressionOrAny+ ) )
  def dispatch BAST
toAST(SimultaneousAssignment e)
  {
  try {  
  newBAST(e) =>  
    [  
  	myText = ":="
    token = new CommonToken(BLESS3Lexer.ASSIGN, ":=")
    //left_comma
    addChild(newBAST(e) =>  
      [  
  	  myText = ","
      token = new CommonToken(BLESS3Lexer.COMMA, ",")
      for (left : e.lhs)
        addChild(left.toAST)
      ] )
    //right_comma
    addChild(newBAST(e) =>  
      [  
  	  myText = ","
      token = new CommonToken(BLESS3Lexer.COMMA, ",")
      for (right : e.rhs)
        addChild(right.toAST)
      ] )
    ]   
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of SimultaneousAssignment

//subexpression :
//  ^( n=LITERAL_not te=timedExpression )
//  | ^( m=UNARY_MINUS te=timedExpression )
//  | ^( s=LITERAL_abs te=timedExpression )
//  | ^( t=LITERAL_truncate te=timedExpression )
//  | ^( r=LITERAL_round te=timedExpression )
//  | te=timedExpression 
  def dispatch BAST
toAST(Subexpression e)
  {
  try 
    {  
    if (e.unary !== null) 
      newBAST(e) =>  
        [
        if (e.unary.unary_minus !== null)	 
  	      { 
  	  	  myText = "-"
  	  	  token = new CommonToken(BLESS3Lexer.UNARY_MINUS, "-")
  	      }
        else if (e.unary.not !== null)	 
  	      { 
  	  	  myText = "not"
  	  	  token = new CommonToken(BLESS3Lexer.LITERAL_not, "not")
  	      }
        else if (e.unary.absolute_value !== null)	 
  	      { 
  	  	  myText = "abs"
  	  	  token = new CommonToken(BLESS3Lexer.LITERAL_abs, "abs")
  	      }
        else if (e.unary.truncate !== null)	 
  	      { 
  	  	  myText = "truncate"
  	  	  token = new CommonToken(BLESS3Lexer.DUMMY, "truncate")
  	      }
        else if (e.unary.round !== null)	 
  	      { 
  	  	  myText = "round"
  	  	  token = new CommonToken(BLESS3Lexer.DUMMY, "round")
  	      }
  	    addChild(e.timed_expression.toAST)  
  	    ]
    else   
  	  e.timed_expression.toAST
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of subexpression

//timedExpression :
//  ^( TICK ts=timedSubject )
//  | ^( AT_SIGN ts=timedSubject se=subexpression )
//  | ^( CARET ts=timedSubject ps=periodShift )
//  | ts=timedSubject  
   def dispatch BAST
toAST(TimedExpression e)
  {
  try 
    {  
    if (e.tick !== null)
      newBAST(e) =>
        [
        myText = "\'"
        token = new CommonToken(BLESS3Lexer.TICK, "\'")
        addChild(e.subject.toAST)
        ]
    else if (e.at)
      newBAST(e) =>
        [
        myText = "@"
        token = new CommonToken(BLESS3Lexer.AT_SIGN, "@")
        addChild(e.subject.toAST)
        addChild(e.time.toAST)
        ]
    else if (e.caret)
      newBAST(e) =>
        [
        myText = "^"
        token = new CommonToken(BLESS3Lexer.CARET, "^")
        addChild(e.subject.toAST)
        addChild(e.shift.toAST)
        ]
    else
      e.subject.toAST 
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }	  //end of TimedExpression

//timedSubject :
//  ce=conditionalExpression
//  | ps=parenthesizedSubexpression 
//  | rt=recordTerm
//  | inv=invocation  
//  | v=value
  def dispatch BAST
toAST(TimedSubject e)
  {
  try 
    {  
    e.value?.toAST ?:
    e.invocation?.toAST ?:
    e.ps?.toAST ?:
    e.conditional?.toAST ?:
    e.record?.toAST
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  // end of TimedSubject

//subprogramCall : ^( SUBPROGRAM_INVOCATION id=ID fal=formalActualList? )
  def dispatch BAST
toAST(SubprogramCall e)
  {
  try 
    {  
    newBAST(e) =>  
      [  
  	  myText = "SUBPROGRAM_INVOCATION["+e.procedure+"]"
      token = new CommonToken(BLESS3Lexer.SUBPROGRAM_INVOCATION, "SUBPROGRAM_INVOCATION["+e.procedure+"]")
      if (e.procedure instanceof SubprogramAccess)
        addChild((e.procedure as SubprogramAccess).name.makeBASTforID(e))   
      else if (e.procedure instanceof SubprogramSubcomponent)
        addChild((e.procedure as SubprogramSubcomponent).name.makeBASTforID(e)) 
      else
        addChild("NOT_ACCESS_NOR_SUBPROGRAM".makeBASTforID(e))
      addChild(e.parameters?.toAST) 	//( '(' parameters=FormalActualList? ')' )?
      ]
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of SubprogramCall
 

//universalLatticeQuantification :
//  ^( LITERAL_forall lv+=ID+ ^( LITERAL_in lb=expression ub=expression ) elq=existentialLatticeQuantification )
  def dispatch BAST
toAST(UniversalLatticeQuantification e)
  {
  try 
    {  
    newBAST(e) =>  
      [  
  	  myText = "forall"
      token = new CommonToken(BLESS3Lexer.LITERAL_forall, "forall")
      for (v : e.variables)
        addChild(v.name.makeBASTforID(e))    
      addChild(newBAST(e) =>  //^($li $r)
        [  
  	    myText = "in"
        token = new CommonToken(BLESS3Lexer.LITERAL_in, "in")
        addChild(e.lower_bound.toAST)
        addChild(e.upper_bound.toAST)
        ] )
      addChild(e.elq.toAST) 	// elq=ExistentialLatticeQuantification
      ]
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of UniversalLatticeQuantification

//value :
//  vn=valueName
//  | c=constant
//  | to=LITERAL_timeout
//  | n=LITERAL_now
//  | t=LITERAL_tops
  def dispatch BAST
toAST(Value e)
  {
  try 
    {  
    if (e.value_name!==null)
      e.value_name.toAST  //get BAST from Name
    else if (e.constant!==null)
      e.constant.toAST  //Constant
    else if (e.timeout !== null) 
      newBAST(e) => [
  	     myText = 'timeout'
         token = new CommonToken(BLESS3Lexer.LITERAL_timeout, 'timeout')
        ] 
    else if (e.now !== null) 
      newBAST(e) => [
  	    myText = 'now'
        token = new CommonToken(BLESS3Lexer.LITERAL_now, 'now')
        ] 
    else if (e.tops !== null) 
      newBAST(e) => [
  	    myText = 'tops'
        token = new CommonToken(BLESS3Lexer.LITERAL_tops, 'tops')
       ] 
    else if (e.enum_val !== null)
      e.enum_val.toAST
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of Value

//enumerationValue : ^( TICK enumeration_type=ID enumeration_value=ID )
  def dispatch BAST
toAST(EnumerationValue e)
  {
  newBAST(e) => [
    myText = '\''
    token = new CommonToken(BLESS3Lexer.TICK, '\'')
    addChild(newBAST(e) => [
      myText = e.enumeration_type.name
      token = new CommonToken(BLESS3Lexer.ID, e.enumeration_type.name)     
      ]
      )
    addChild(newBAST(e) => [
      myText = e.enumeration_value
      token = new CommonToken(BLESS3Lexer.ID, e.enumeration_value)     
      ]
      )
    ] 
  }

  
//constant :
//  q=quantity
//  | s=AADL_STRING_LITERAL
//  | t=LITERAL_true
//  | f=LITERAL_false
//  | n=LITERAL_null
  def dispatch BAST
toAST(Constant e)
  {
  try 
    {  
    if (e.t !== null) 
      newBAST(e) => [
  	    myText = 'true'
        token = new CommonToken(BLESS3Lexer.LITERAL_true, 'true')
        ] 
    else if (e.f !== null) 
      newBAST(e) => [
  	    myText = 'false'
        token = new CommonToken(BLESS3Lexer.LITERAL_false, 'false')
        ] 
    else if (e.nul !== null) 
      newBAST(e) => [
  	    myText = 'null'
        token = new CommonToken(BLESS3Lexer.LITERAL_null, 'null')
        ] 
    else if (e.numeric_constant !==null)
      e.numeric_constant.toAST()
    else if (e.string_literal!==null) //string literal
      e.string_literal.makeBASTforAADL_STRING_LITERAL(e) 
     } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of ValueConstant

//propertyField :
//  ^( LBRACKET index=NUMBER )
//  | ^( LBRACKET var=ID )
//  | ^( DOT pf=ID )
//  | ^( DOT LITERAL_upper_bound )
//  | ^( DOT LITERAL_lower_bound )
  def dispatch BAST
toAST(PropertyField e)
  {
  try 
    {  
    if (e.index!==null)
  	  newBAST(e) =>
  	    [
  	    myText = "["	
        token = new CommonToken(BLESS3Lexer.LBRACKET, "[")
        addChild(e.index.makeBASTforINT(e))
  	    ]
    else if (e.variable!==null)
  	  newBAST(e) =>
  	    [
  	    myText = "["	
        token = new CommonToken(BLESS3Lexer.LBRACKET, "[")
        addChild(e.variable.name.makeBASTforID(e))
    	  ]
    else if (e.pf!==null)
  	  newBAST(e) =>
  	    [
  	    myText = "."	
        token = new CommonToken(BLESS3Lexer.DOT, ".")
        addChild(e.pf.makeBASTforID(e))
  	    ]
    else if (e.upper!==null)
  	  newBAST(e) =>
  	    [
  	    myText = "."	
        token = new CommonToken(BLESS3Lexer.DOT, ".")
        addChild(newBAST(e) =>[myText = "upper_bound"	
          token = new CommonToken(BLESS3Lexer.LITERAL_upper_bound, "upper_bound")])
  	    ]
    else if (e.lower!==null)
    	newBAST(e) =>
  	    [
  	    myText = "."	
        token = new CommonToken(BLESS3Lexer.DOT, ".")
        addChild(newBAST(e) =>[myText = "lower_bound"	
          token = new CommonToken(BLESS3Lexer.LITERAL_lower_bound, "lower_bound")])
    	  ]
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of PropertyField

//propertyReference :
//  ^(oct=OCTOTHORPE pname=QCLREF)
//  | ^(oct=OCTOTHORPE pname=QCLREF field+=propertyField+)
//  | ^(oct=OCTOTHORPE self=LITERAL_self pname=QCLREF )
//  | ^(oct=OCTOTHORPE self=LITERAL_self pname=QCLREF field+=propertyField+)
//  | ^(oct=OCTOTHORPE component=QCREF pname=QCLREF)
//  |  ^(oct=OCTOTHORPE component=QCREF pname=QCLREF field+=propertyField+)
  def dispatch BAST
toAST(PropertyReference e)
  {
  try 
    {  
    if (e.self)  //  self#ps::p
      {
      val sp = e.spname
      EcoreUtil.resolve(sp,e.eContainer)    
  	  newBAST(e) =>
  	    [
    	  myText = "#"	
        token = new CommonToken(BLESS3Lexer.OCTOTHORPE, "#")
        addChild(newBAST(e) =>
    	    [
    	    myText = "self"	
          token = new CommonToken(BLESS3Lexer.LITERAL_self, "self")
          ] )      
        addChild(sp.qualifiedName().makeBASTforPropertyName(e))
        for (f : e.field)
          addChild(f.toAST)  	  
        ]     
      }
    else if (e.component!==null)  //  uccr#ps::p
      {
      val cp = e.cpname
      EcoreUtil.resolve(cp,e.eContainer)
    	newBAST(e) =>
    	  [
    	  myText = "#"	
        token = new CommonToken(BLESS3Lexer.OCTOTHORPE, "#")
        addChild(e.component.qualifiedName().makeBASTforPropertyName(e))  //it's really a component name
        addChild(cp.qualifiedName().makeBASTforPropertyName(e))  	  
        for (f : e.field)
          addChild(f.toAST)  	  
        ]
      }
    else
      {
      val p = e.pname
      EcoreUtil.resolve(p,e.eContainer)
    	newBAST(e) =>   //  #ps::p
    	  [
    	  myText = "#"	
        token = new CommonToken(BLESS3Lexer.OCTOTHORPE, "#")
        addChild(p.qualifiedName().makeBASTforPropertyName(e))
        for (f : e.field)
          addChild(f.toAST)  	  
        ]   
       }
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of PropertyReference

//whenThrow:
//  ^( LITERAL_when LPAREN exp=expression RPAREN LITERAL_throw excep=ID  //[Exception]  
//      message=AADL_STRING_LITERAL? )  
  def dispatch BAST
toAST(WhenThrow e)
  {
  try
    {  
    newBAST(e) =>  
      [  
    	myText = "when"
      token = new CommonToken(BLESS3Lexer.LITERAL_when, "when")
      addChild(newBAST(e) =>  
        [  
        myText = "("
        token = new CommonToken(BLESS3Lexer.LPAREN, "(")
        ] )
      addChild(e.exp.toAST) //exp=Expression
      addChild(newBAST(e) =>  
        [  
        myText = ")"
        token = new CommonToken(BLESS3Lexer.RPAREN, ")")
        ] )
      addChild(newBAST(e) =>  // "throw"
        [  
  	    myText = "throw"
        token = new CommonToken(BLESS3Lexer.LITERAL_throw, "throw")
        ] )
      addChild(e.exception.name.makeBASTforID(e))  // exception=ID 
      ]
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of WhenThrow

//whileLoop  :
//  ^( LITERAL_while be=expression ^( INVARIANT inv=assertion? ) ^( BOUND bd=assertion? ) 
//      elq=existentialLatticeQuantification )
  def dispatch BAST
toAST(WhileLoop e)
  {
  try 
    {  
	  newBAST(e) =>  
       [  //'while' as root
  	   myText = "while"
       token = new CommonToken(BLESS3Lexer.LITERAL_while, "while")
       addChild((e.test as Expression).toAST)    
       addChild(newBAST(e) =>  
         [  
  	     myText = "invariant"
         token = new CommonToken(BLESS3Lexer.INVARIANT, "invariant")
         if (e.invariant)  
           addChild(e.inv.toAST)
         ] )
       addChild(newBAST(e) =>  
         [  
  	     myText = "bound"
         token = new CommonToken(BLESS3Lexer.BOUND, "bound")
         if (e.bound)  
           addChild(e.bound_function.toAST)
         ] )
       //finally, actions to do    
       addChild(e.elq.toAST)
       ]
     } 
   catch (Exception ex) {ex.printStackTrace x}       
   }  //end of WhileLoop


//behaviorTransition :
//  ^( TRANSITION ^( LABEL id=ID pr=priority? ) ^( SOURCE ssi+=ID+ ) 
//    ^( CONDITION bc=behaviorCondition? ) ^( DESTINATION dsi=ID )
//    ^( ACTION s=behaviorActions? ) ^( Q q=assertion? ) )
  def dispatch BAST
toAST(BehaviorTransition e)
  {
  try 
    {  
    newBAST(e) =>  
      [  //TRANSITION as root
  	  myText = "TRANSITION["+e.name+"]"
      token = new CommonToken(BLESS3Lexer.TRANSITION, "TRANSITION["+e.name+"]")
      addChild(newBAST(e) =>  // "LABEL"
        [  
  	    myText = "LABEL["+e.name+"]"
        token = new CommonToken(BLESS3Lexer.LABEL, "LABEL["+e.name+"]")
        addChild(e.name.makeBASTforID(e))
        //add Priority
        ] )
      addChild(newBAST(e) =>  // "SOURCE"
        [  
    	  myText = "SOURCE"
        token = new CommonToken(BLESS3Lexer.SOURCE, "SOURCE")
        for (source : e.sources)  //multiple source states
          addChild(source.name.makeBASTforID(e))
        ] )
      addChild(newBAST(e) =>  // "CONDITION"
        [  
    	  myText = "CONDITION"
        token = new CommonToken(BLESS3Lexer.CONDITION, "CONDITION")
        if (e.dispatch!==null)
          addChild(e.dispatch.toAST)  //either dispatch condition
        else if (e.execute!==null)
          addChild(e.execute.toAST)  //or execute condition
        else if (e.mode!==null)
          addChild(e.mode.toAST)  //or mode condition
        else if (e.internal!==null)
          addChild(e.internal.toAST)  //or internal condition      
        ] )
      addChild(newBAST(e) =>  // "DESTINATION"
        [  
    	  myText = "DESTINATION"
        token = new CommonToken(BLESS3Lexer.DESTINATION, "DESTINATION")
        addChild(e.destination.name.makeBASTforID(e))  //destination state
        ] )
      addChild(newBAST(e) =>  // "ACTION"
        [  
    	  myText = "ACTION"
        token = new CommonToken(BLESS3Lexer.ACTION, "ACTION")
        addChild(e.actions?.toAST)  //behavior=BehaviorActions 
        ] )
      addChild(newBAST(e) =>  // "Q"  Assertion during transition
        [  
    	  myText = "Q"
        token = new CommonToken(BLESS3Lexer.Q, "Q")
        addChild(e.ass?.toAST)  //ass=Assertion?
        ] )
      ]
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of BehaviorTransition
 

//behaviorState :
//  ^( LITERAL_state init=LITERAL_initial? com=LITERAL_complete? finl=LITERAL_final? i=ID a=assertion? )
  def dispatch BAST
toAST(BehaviorState e)
  {
  try 
    {  
    newBAST(e) =>  
      [  
    	myText = "state"
      token = new CommonToken(BLESS3Lexer.LITERAL_state, "state")
      if (e.initial)
        addChild(newBAST(e) =>  // "initial"
        [  
    	  myText = "initial"
        token = new CommonToken(BLESS3Lexer.LITERAL_initial, "initial")
        ] )
      if (e.complete)
        addChild(newBAST(e) =>  // "complete"
        [  
    	  myText = "complete"
        token = new CommonToken(BLESS3Lexer.LITERAL_complete, "complete")
        ] )
      if (e.final)
        addChild(newBAST(e) =>  // "final"
        [  
    	  myText = "final"
        token = new CommonToken(BLESS3Lexer.LITERAL_final, "final")
        ] )
      addChild(e.name.makeBASTforID(e))  //add name of state
      if (e.state_assertion!==null)
        addChild(e.state_assertion.toAST)  //add Assertion, if any
      ]
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of BehaviorState

//blessSubclause  :
//  ^( BLESS_SUBCLAUSE 
//    no_proof=DO_NOT_PROVE?
//    ac=assertClause?  
//    inv=invariantClause?
//    vs=variablesSection?
//    ss=statesSection?
//    t=transitions? )
  def dispatch BAST
toAST(BLESSSubclause e)
  {
  try 
    {  
    newBAST(e) =>  //THREAD_ANNEX as root
      [  
    	myText = "BLESS_SUBCLAUSE"
      token = new CommonToken(BLESS3Lexer.BLESS_SUBCLAUSE, "BLESS_SUBCLAUSE")
      if (e.no_proof)
         addChild(newBAST(e) =>  
        [  
        myText = "DO_NOT_PROVE"
        token = new CommonToken(BLESS3Lexer.DO_NOT_PROVE, "DO_NOT_PROVE")
        ] )    
      //assert_clause?
      if (e.assert_clause!==null)
        addChild(e.assert_clause.toAST)
      //invariant?
      if (e.invariant!==null)
        addChild(e.invariant.toAST)
      //variables?
      if (e.variables!==null)
        addChild(e.variables.toAST)
      //states?  
      if (e.statesSection !== null)
        addChild(newBAST(e) =>  // add states
        [  
    	  myText = "states"
        token = new CommonToken(BLESS3Lexer.LITERAL_states, "states")
        for (state : e.statesSection.states)  //add states+=BehaviorState+
          addChild(state.toAST)
        ] )
      //transitions?
      if (e.transitions!==null)
        addChild(e.transitions.toAST)
      ]
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of BLESSAnnexSubclause

//dispatchCondition : ^( LITERAL_dispatch de=dispatchExpression? )
  def dispatch BAST
toAST(DispatchCondition e)
  {
  try 
    {  
    newBAST(e) =>  //LITERAL_dispatch as root
      [  
    	myText = "dispatch"
      token = new CommonToken(BLESS3Lexer.LITERAL_dispatch, "dispatch")
      addChild(e.de?.toAST)  // de=DispatchExpression?
      ]
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of DispatchCondition

//dispatchConjunction :
//  ^( LITERAL_and tr+=dispatchTrigger+ )
//  | t=dispatchTrigger
  def dispatch BAST
toAST(DispatchConjunction e)
  {
  try 
    {  
    if (e.and) 
      newBAST(e) =>  //LITERAL_and as root
      [  
    	myText = "and"
      token = new CommonToken(BLESS3Lexer.LITERAL_and, "and")
      for (child : e.trigger)
        addChild(child.toAST)  
      ]
    else  //just one trigger
      e.trigger.head.toAST
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of DispatchConjunction

//dispatchExpression :
//  ^( LITERAL_or dc+=dispatchConjunction+ )
//  | c=dispatchConjunction
  def dispatch BAST
toAST(DispatchExpression e)
  {
    try {  
  if (e.or) newBAST(e) =>  //have or? disjunction of conjunctions
    [  
  	myText = "or"
    token = new CommonToken(BLESS3Lexer.LITERAL_or, "or")
    for (child : e.dc)
      addChild(child.toAST)  // dc+=DispatchConjunction
    ]
  else  //just one dispatch conjunction
    e.dc.head.toAST
     } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of DispatchExpression

//dispatchTrigger :
//  port=portName
//  | ^( LITERAL_timeout ( ^( LPAREN ports+=ID* ) )? time=behaviorTime? )
  def dispatch BAST
toAST(DispatchTrigger e)
  {
  try 
    {  
    if (e.timeout !== null && e.lp) 
      newBAST(e) =>  //timeout with port list
        [  
      	myText = "timeout"
        token = new CommonToken(BLESS3Lexer.LITERAL_timeout, "timeout")
         //LPAREN
        addChild(newBAST(e) =>  
          [  //
  	      myText = "("
          token = new CommonToken(BLESS3Lexer.LPAREN, "(")
        //port list
          for (p : e.ports)
            addChild(p.name.makeBASTforPort(e))    
          ] )
        //behavior_time
        addChild(e.time.toAST)   
        ]
    else if (e.timeout !== null && e.time!==null)  //completion relative timeout catch?
      newBAST(e) =>  
        [  
      	myText = "timeout"
        token = new CommonToken(BLESS3Lexer.LITERAL_timeout, "timeout")
        //behavior_time
        addChild(e.time.toAST)   
        ]
    else if (e.timeout !== null)  //just timeout?
      newBAST(e) =>  
        [  
      	myText = "timeout"
        token = new CommonToken(BLESS3Lexer.LITERAL_timeout, "timeout")
        ]
    else  //just a port
      e.port.port.name.makeBASTforPort(e)
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of DispatchTrigger


//executeCondition : expression
  def dispatch BAST
toAST(ExecuteCondition e)
  {
  (e.eor as Expression).toAST
  }  //end of ExecuteCondition


//internalCondition : ^( LITERAL_internal ports+=ID+ )
  def dispatch BAST
toAST(InternalCondition e)
  {
  try 
    {  
    newBAST(e) =>  
      [  
    	myText = "internal"
      token = new CommonToken(BLESS3Lexer.LITERAL_internal, "internal")
      addChild(makeBASTforPort(e.first.name,e))
      for (p : e.ports)
        addChild(makeBASTforPort(p.name,e))  
      ]
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of InternalCondition


//invariantClause : ^( LITERAL_invariant a=assertion )
  def dispatch BAST
toAST(InvariantClause e)
  {
  try 
    {  
    newBAST(e) =>  
      [  
    	myText = "invariant"
      token = new CommonToken(BLESS3Lexer.LITERAL_invariant, "invariant")
      addChild(e.inv.toAST)
      ]
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of InvariantClause

//issueException : ^( LITERAL_exception exception=ID message=AADL_STRING_LITERAL? )
  def dispatch BAST
toAST(IssueException e)
  {
  try 
    {  
    newBAST(e) =>  
      [  
    	myText = "exception"
      token = new CommonToken(BLESS3Lexer.LITERAL_exception, "exception")
      addChild(e.exception.name.makeBASTforID(e))
        if (e.message !== null)
      addChild(e.message.makeBASTforAADL_STRING_LITERAL(e))
      ]
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of InvariantClause

//transitions :  ^( LITERAL_transitions bt+=behaviorTransition+ )
  def dispatch BAST
toAST(Transitions e)
  {
  try 
    {  
    newBAST(e) =>  
      [  
    	myText = "transitions"
      token = new CommonToken(BLESS3Lexer.LITERAL_transitions, "transitions")
      for (child : e.bt)
        addChild(child.toAST)
      ]
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of Transitions

//triggerLogicalExpression :
//  ^( LITERAL_and et+=eventTrigger+ )
//  |  ^( LITERAL_or et+=eventTrigger+ )
//  |  ^( LITERAL_xor et+=eventTrigger+ )
//  |  ^( LITERAL_then et+=eventTrigger+ )
//  |  ^( LITERAL_else et+=eventTrigger+ )
//  | first=eventTrigger
  def dispatch BAST
toAST(TriggerLogicalExpression e)
  {
  try 
    {  
    if (e.op===null)
      e.first.toAST
    else switch e.op
      {
    	case 'and' : 
        newBAST(e) =>  
          [  
    	    myText = "and"
          token = new CommonToken(BLESS3Lexer.LITERAL_and, "and")
          addChild(e.first.toAST)
          for (tr : e.trigger)
            addChild(tr.toAST)
          ]
    	case 'or' : 
        newBAST(e) =>  
          [  
    	    myText = "or"
          token = new CommonToken(BLESS3Lexer.LITERAL_or, "or")
          addChild(e.first.toAST)
          for (tr : e.trigger)
            addChild(tr.toAST)
          ]
    	case 'xor' : 
        newBAST(e) =>  
          [  
  	      myText = "xor"
          token = new CommonToken(BLESS3Lexer.LITERAL_xor, "xor")
          addChild(e.first.toAST)
          for (tr : e.trigger)
            addChild(tr.toAST)
          ]
    	case 'then' : 
        newBAST(e) =>  
          [  
    	    myText = "then"
          token = new CommonToken(BLESS3Lexer.LITERAL_then, "then")
          addChild(e.first.toAST)
          for (tr : e.trigger)
            addChild(tr.toAST)
          ]
    	case 'else' :  
        newBAST(e) =>  
          [  
    	    myText = "else"
          token = new CommonToken(BLESS3Lexer.LITERAL_else, "else")
          addChild(e.first.toAST)
          for (tr : e.trigger)
            addChild(tr.toAST)
          ]  	
     	 }   //end of switch
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of TriggerLogicalExpression

//eventTrigger :
//  tr=modeTrigger
//  | ^( LPAREN tle=triggerLogicalExpression RPAREN )
//modeTrigger : ^(DOT mt+=ID+)
  def dispatch BAST
toAST(EventTrigger e)
  {
  try 
    {  
    e?.tle.toAST ?:
    newBAST(e) =>  
      [  
      myText = "."
      token = new CommonToken(BLESS3Lexer.DOT, ".")
      for (tr : e.sub)
        addChild(tr.makeBASTforID(e))
      ]     
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }



//variablesSection : ^( LITERAL_variables vd+=variableDeclaration+ )
  def dispatch BAST
toAST(VariablesSection e)
  {
  try 
    {  
    newBAST(e) =>  
      [  
    	myText = "variables"
      token = new CommonToken(BLESS3Lexer.LITERAL_variables, "variables")
      for (child : e.behavior_variables)
        addChild(child.toAST)
      ]
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of VariablesSection

  def dispatch BAST
toAST(BooleanType e)
  {
  try 
    {  
    newBAST(e) =>  
      [  
    	myText = "boolean"
      token = new CommonToken(BLESS3Lexer.LITERAL_boolean, "boolean")
    	]
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of BooleanType

  def dispatch BAST
toAST(StringType e)
  {
  try 
    {  
    newBAST(e) =>  
      [  
      myText = "string"
      token = new CommonToken(BLESS3Lexer.LITERAL_string, "string")
      ]
    } 
    catch (Exception ex) {ex.printStackTrace x}       
  }  //end of StringType

  def dispatch BAST
toAST(NullType e)
  {
  try 
    {  
    newBAST(e) =>  
      [  
      myText = "null"
      token = new CommonToken(BLESS3Lexer.LITERAL_null, "null")
      ]
    } 
    catch (Exception ex) {ex.printStackTrace x}       
  }  //end of NullType

//typeOrReference: ty=type |  ref=ID
  def dispatch BAST
toAST(TypeOrReference e)
  {
  try 
    {  
    e.ty?.toAST ?:
    {  
    if (e.ref !== null) 
      EcoreUtil.resolve(e.ref,e)
    if (e.ref?.name !== null)
      e.ref.name.makeBASTforID(e)
    else
      newBAST(e) =>  
        [  
  	    myText = "UNRESOLVED_TYPE_REFERENCE"
        token = new CommonToken(BLESS3Lexer.DUMMY, "UNRESOLVED_TYPE_REFERENCE")
  	    ]  
    }
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }

//type  : 
//  et=enumerationType
//  |  nt=quantityType
//  | at=arrayType
//  | rt=recordType
//  | bo=LITERAL_boolean | st=LITERAL_string  | nu=LITERAL_null 
  def dispatch BAST
toAST(Type e)
  {
  try 
    {  
    switch e
    {
    case ArrayType:
      toAST(e as ArrayType)	
    case BooleanType:
      toAST(e as BooleanType)	
    case EnumerationType:
      toAST(e as EnumerationType)	
    case NullType:
      toAST(e as NullType)  
    case QuantityType:
      toAST(e as QuantityType)  
    case RecordType:
      toAST(e as RecordType)	
    case StringType:
      toAST(e as StringType)	
    }	
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  // end of type

//aNumber:
// lit=NUMBER
// | property=propertyReference
// | propertyConstant=QCLREF 
  def dispatch BAST
toAST(ANumber e)
  {
  try 
    {
    e.lit?.makeBASTforLIT(e) ?:
    e.property?.toAST  ?:
    e.propertyConstant?.qualifiedName().makeBASTforPropertyName(e) 
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  // end of ANumber

//subProgramParameter: v=valueName | c=constant | ps=parenthesizedSubexpression
  def dispatch BAST
toAST(SubProgramParameter e)
  {
  try 
    {
    e?.value.toAST ?:
    e?.constant.toAST ?:
    e?.expression.toAST
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }	//end of SubProgramParameter
  
}
