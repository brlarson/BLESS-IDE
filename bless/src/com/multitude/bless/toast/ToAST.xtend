package com.multitude.bless.toast

//see README

import com.google.inject.Inject
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
//import com.multitude.aadl.bless.bLESS.NumericConstant
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
//import com.multitude.aadl.bless.bLESS.TransitionLabel
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
import com.multitude.bless.antlr3generated.BLESStoASTLexer
import com.multitude.bless.app.Global
import com.multitude.bless.tree.BAST
import java.util.ArrayList
import java.util.List
import org.antlr.runtime.CommonToken
import org.eclipse.emf.ecore.util.EcoreUtil
import org.osate.aadl2.Element
import org.osate.aadl2.SubprogramAccess
import org.osate.aadl2.SubprogramSubcomponent
import com.multitude.aadl.bless.bLESS.BAAlternative
import com.multitude.aadl.bless.util.BlessUtil
import com.multitude.aadl.bless.bLESS.FormalExpressionPair

//import com.multitude.aadl.bless.bLESS.PortValue

//import edu.ksu.bless.assertion.subbless.ActionAnnexSubclause

class ToAST {

@Inject extension BlessUtil
//@Inject extension AssertionUtil

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
       token = new CommonToken(BLESStoASTLexer.ID, id)
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
       token = new CommonToken(BLESStoASTLexer.OCTOTHORPE, '#')
       if (pr.self) addChild(newBAST(e) =>
         [
         myText = 'self'
         token = new CommonToken(BLESStoASTLexer.LITERAL_self, 'self')
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


  def BAST
makeBASTforComponentClassifier(String s, Element e) 
  {
  newBAST(e) =>
    [
    myText = '::'
    token = new CommonToken(BLESStoASTLexer.DOUBLE_COLON, '::')
    for (c : s?.getComponentClassifierStrings)
      addChild(c.makeBASTforINT(e))
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
    token = new CommonToken(BLESStoASTLexer.LBRACKET, '[')
    addChild(f.index.makeBASTforINT(e))
    addChild(newBAST(e) =>
      [
      myText = ']'
      token = new CommonToken(BLESStoASTLexer.RBRACKET, ']')
      ] )
    ]
  else if (f.variable !== null)
  newBAST(e) =>
    [
    myText = '['
    token = new CommonToken(BLESStoASTLexer.LBRACKET, '[')
    addChild(f.variable.name.makeBASTforID(e))
    addChild(newBAST(e) =>
      [
      myText = ']'
      token = new CommonToken(BLESStoASTLexer.RBRACKET, ']')
      ] )
    ]
  else if (f.pf !== null)
  newBAST(e) =>
    [
    myText = '.'
    token = new CommonToken(BLESStoASTLexer.PERIOD, '.')
    addChild(f.pf.makeBASTforID(e))
    ]
  else if (f.upper !== null)
  newBAST(e) =>
    [
    myText = '.'
    token = new CommonToken(BLESStoASTLexer.PERIOD, '.')
    addChild(newBAST(e) =>
      [
      myText = 'upper_bound'
      token = new CommonToken(BLESStoASTLexer.LITERAL_upper_bound, 'upper_bound')
      ])
    ]
  else if (f.lower !== null)
  newBAST(e) =>
    [
    myText = '.'
    token = new CommonToken(BLESStoASTLexer.PERIOD, '.')
    addChild(newBAST(e) =>
      [
      myText = 'lower_bound'
      token = new CommonToken(BLESStoASTLexer.LITERAL_lower_bound, 'lower_bound')
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
       token = new CommonToken(BLESStoASTLexer.INTEGER_LIT, integer_literal)
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
       token = new CommonToken(BLESStoASTLexer.REAL_LIT, real_literal)
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
       token = new CommonToken(BLESStoASTLexer.AADL_STRING_LITERAL, string_literal)
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
       token = new CommonToken(BLESStoASTLexer.DOTDOT, '..')
      ]	
  	case ',.' :
  	newBAST(parent) =>
  	  [
  	   myText = ',.'
       token = new CommonToken(BLESStoASTLexer.COMMADOT, ',.')
      ]	
  	case '.,' :
  	newBAST(parent) =>
  	  [
  	   myText = '.,'
       token = new CommonToken(BLESStoASTLexer.DOTCOMMA, '.,')
      ]	
  	case ',,' :
  	newBAST(parent) =>
  	  [
  	   myText = ',,'
       token = new CommonToken(BLESStoASTLexer.COMMACOMMA, ',,')
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
       token = new CommonToken(BLESStoASTLexer.EQ, '=')
      ]	
  	case '<>' :
  	newBAST(parent) =>
  	  [
  	   myText = '<>'
       token = new CommonToken(BLESStoASTLexer.NEQ, '<>')
      ]	
  	case '<' :
  	newBAST(parent) =>
  	  [
  	   myText = '<'
       token = new CommonToken(BLESStoASTLexer.LT, '<')
      ]	
  	case '<=' :
  	newBAST(parent) =>
  	  [
  	   myText = '<='
       token = new CommonToken(BLESStoASTLexer.AM, '<=')
      ]	 		
  	case '>=' :
  	newBAST(parent) =>
  	  [
  	   myText = '>='
       token = new CommonToken(BLESStoASTLexer.AL, '>=')
      ]	 		
  	case '>' :
  	newBAST(parent) =>
  	  [
  	   myText = '>'
       token = new CommonToken(BLESStoASTLexer.GT, '>')
      ]	 		
  	}  //end of switch	
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of makeBASTforRelationSymbol
  
/**
 * make a BAST node for a time_unit : LITERAL_ps | LITERAL_us | LITERAL_ms | LITERAL_sec | LITERAL_min | LITERAL_hr    ;	
 * used by BehaviorTime 
 */
  def BAST 
makeBASTforTimeUnit(String myUnit, BehaviorTime parent)
  {
   try {  
  switch myUnit
  	{
  	case 'ps' :
  	newBAST(parent) =>
  	  [
  	   myText = 'ps'
       token = new CommonToken(BLESStoASTLexer.LITERAL_ps, 'ps')
      ]	
  	case 'us' :
  	newBAST(parent) =>
  	  [
  	   myText = 'us'
       token = new CommonToken(BLESStoASTLexer.LITERAL_us, 'us')
      ]	
  	case 'ms' :
  	newBAST(parent) =>
  	  [
  	   myText = 'ms'
       token = new CommonToken(BLESStoASTLexer.LITERAL_ms, 'ms')
      ]	
  	case 'sec' :
  	newBAST(parent) =>
  	  [
  	   myText = 'sec'
       token = new CommonToken(BLESStoASTLexer.LITERAL_sec, 'sec')
      ]	 		
  	case 'min' :
  	newBAST(parent) =>
  	  [
  	   myText = 'min'
       token = new CommonToken(BLESStoASTLexer.LITERAL_min, 'min')
      ]	 		
  	case 'hr' :
  	newBAST(parent) =>
  	  [
  	   myText = 'hr'
       token = new CommonToken(BLESStoASTLexer.LITERAL_hr, 'hr')
      ]	 		
  	}  //end of switch	
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of makeBASTforTimeUnit


/**
 * make a BAST node for an AADL Property
 * used by  
 */
  def BAST 
makeBASTforPropertyName(String property_name, Element parent)
  {
//   try {  
//  	if (property_name.equalsIgnoreCase("BLESS_Types::Time")
//  		//||property_name.equalsIgnoreCase("BA2015_Types::Time")
//  		)
//  	  {
//  	  newBAST(parent) =>
//  	    [
//  	    myText = 'time'
//        token = new CommonToken(BLESStoASTLexer.LITERAL_time, 'time')
//        ]  
//      }	
//  	else
//  	{  
  if (property_name === null)
    {
    BlessControl.println('Property name was empty on line '+parent?.locationReference?.line+
      ' in component '+parent?.containingClassifier?.qualifiedName())  
    return newBAST(parent) =>
      [
       myText = '::'
       token = new CommonToken(BLESStoASTLexer.DOUBLE_COLON, '::')
       addChild('NO'.makeBASTforID(parent))
       addChild('NAME'.makeBASTforID(parent))
      ] 
    }
  if (!property_name.contains('::'))
    {
    BlessControl.println('Property name had no :: \''+property_name+'\' on line '+parent?.locationReference?.line+
      ' in component '+parent?.containingClassifier?.qualifiedName())  
    return newBAST(parent) =>
      [
       myText = '::'
       token = new CommonToken(BLESStoASTLexer.DOUBLE_COLON, '::')
       addChild('NO'.makeBASTforID(parent))
       addChild(property_name.makeBASTforID(parent))
      ] 
    }
  // otherwise make regular tree
  	val String property_set = property_name.substring(0,property_name.indexOf('::'))
  	val String property_id = property_name.substring(property_name.indexOf('::')+2,property_name.length)
  	newBAST(parent) =>
  	  [
  	   myText = '::'
       token = new CommonToken(BLESStoASTLexer.DOUBLE_COLON, '::')
       addChild(property_set.makeBASTforID(parent))
       addChild(property_id.makeBASTforID(parent))
      ]	
      
//    }
//    } catch (Exception ex) {ex.printStackTrace x}
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
       token = new CommonToken(BLESStoASTLexer.ID, port_name)
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
       token = new CommonToken(BLESStoASTLexer.AADL_STRING_LITERAL, theString)
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
       token = new CommonToken(BLESStoASTLexer.ASSERTION_ANNEX, 'ASSERTION_ANNEX')
           //set my text
       myText = 'ASSERTION_ANNEX'
          //put on children
       for (child : e.assertion_list)  //add  assertion_list+=NamedAssertion*
         {
         val namedAssertion = child.toAST  
         putAssertionIntoMap(child.name,namedAssertion)
         addChild(namedAssertion)      
         }
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
  
//  def dispatch BAST
//toAST(ActualParameter e)  	
//  {
//  	newBAST(e) =>
//  	  [
//        	//make fake token with BLESStoASTLexer type
//        token = new CommonToken(BLESStoASTLexer.PARAMETER, 'PARAMETER')
//           //set my text
//        myText = 'PARAMETER'
//          // put the formal ID as first child
//        addChild(makeBASTforID(e.formal,e))  
//          //put the expression as second child
//        addChild(e.actual.toAST)  
//      ]
//  }

//SHOULD FLOW THROUGH
//Assertion 
//assertion : ll=LASS! ab=assertion_body RASS!
//  def dispatch BAST
//toAST(Assertion e )
//  {  //no AST node generated, but setPartOfAssertion afterwards
//  var b=(e.assert?.toAST ?: e.nameless?.toAST ?: e.function?.toAST ?: e.enumeration?.toAST)
//  b.setPartOfAssertion  
//  b  
//  }  //end of Assertion 

//  AssertionEnumeration
//assertion_enumeration :
//  (PLUS_ARROW^ enumeration_pair (COMMA! enumeration_pair)* )  //to define the Assertion enumeration
//  | (PLUS_ARROW^ predicate_invocation)  //to use the Assertion enumeration
  def dispatch BAST
toAST(AssertionEnumeration e)  	
  {
    try {  
  	newBAST(e) =>
  	  [
        token = new CommonToken(BLESStoASTLexer.PLUS_ARROW, '+=>')
        myText = '+=>'
          //add either a PredicateInvocation, or one or more EnumerationPair
        if (e.pred !== null)  
          addChild(e.pred.toAST)  
        else for (child : e.pair)  //add enumeration pairs
          addChild(child.toAST)  
      ]
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of AssertionEnumeration

//AssertionExpression
//assertion_expression :   
//  sum=SumQuantification
//  |
//  product=ProductQuantification
//  |
//  numberof=CountingQuantification
//  |
//  assertion_subexpression   
//  ( 
//  ( PLUS assertion_subexpression )+
//    -> ^( PLUS assertion_subexpression+ )    
//  | 
//  ( TIMES assertion_subexpression )+   
//    -> ^( TIMES assertion_subexpression+ )    
//  | 
//  MINUS assertion_subexpression   
//    -> ^( MINUS assertion_subexpression+ )    
//  | 
//  DIVIDE assertion_subexpression    
//    -> ^( DIVIDE assertion_subexpression+ )    
//  | 
//  EXP assertion_subexpression    
//    -> ^( EXP assertion_subexpression+ )    
//  | 
//  LITERAL_mod assertion_subexpression  
//    -> ^( LITERAL_mod assertion_subexpression+ )
//  |
//  LITERAL_rem assertion_subexpression  
//    -> ^( LITERAL_rem assertion_subexpression+ )
//  | //or just one assertion_subexpression
//    -> assertion_subexpression
//  )
//  ; 

//  def dispatch BAST
//toAST(AssertionExpression e) 
//  {
////infix expressions
//  if (e.sym!==null)
//  switch (e?.sym)
//    {
//    	case '+' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.PLUS, '+')
//          myText = '+' 
//          addChild(e.left_hand_side.toAST)
//          for (child : e.right_hand_side)  //add on the r.h.s children
//            addChild(child.toAST) ]
//    	case '*' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.TIMES, '*')
//          myText = '*' 
//          addChild(e.left_hand_side.toAST)
//          for (child : e.right_hand_side)  //add on the r.h.s children
//            addChild(child.toAST) ]
//    	case '-' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.MINUS, '-')
//          myText = '-' 
//          addChild(e.left_hand_side.toAST)
//          addChild(e.right_hand_side.head.toAST) ]
//    	case '/' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.DIVIDE, '/')
//          myText = '/' 
//          addChild(e.left_hand_side.toAST)
//          addChild(e.right_hand_side.head.toAST) ]
//    	case '**' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.EXP, '**')
//          myText = '**' 
//          addChild(e.left_hand_side.toAST)
//          addChild(e.right_hand_side.head.toAST) ]
//    	case 'mod' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.LITERAL_mod, 'mod')
//          myText = 'mod' 
//          addChild(e.left_hand_side.toAST)
//          addChild(e.right_hand_side.head.toAST) ]
//    	case 'rem' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.LITERAL_rem, 'rem')
//          myText = 'rem' 
//          addChild(e.left_hand_side.toAST)
//          addChild(e.right_hand_side.head.toAST) ]
////    	default : e.left_hand_side.toAST
//    } //end of switch
//  else if (e.sum!==null)
//    e.sum.toAST //=SumQuantification
//  else if (e.product!==null)
//    e.product.toAST  //=ProductQuantification
//  else if (e.numberof!==null)
//    e.numberof.toAST  //=CountingQuantification
//  else if (e.left_hand_side!==null)
//    e.left_hand_side.toAST 
//  }  //end of AssertionExpression


  def dispatch BAST
toAST(SumQuantification e) 
  {
    try {  
////sum  	
//  if (e.sum)
  	newBAST(e) =>
  	  [
        token = new CommonToken(BLESStoASTLexer.LITERAL_sum, 'sum')
           //set my text
        myText = 'sum'
          // put on the logic variables
        addChild(e.variables.toAST)  
          // put on the logic variable domain
       addChild(newBAST(e)  =>
       	 [
       	 myText = 'in'
         token = new CommonToken(BLESStoASTLexer.LITERAL_in, 'in')
         if (e.in)
       	   addChild(e.range.toAST)
       	 else if (e.which)
        	   addChild((e.condition as Expression).toAST)
       	 ] )
          // put on the "of"
        addChild(newBAST(e) =>
  	       [
           token = new CommonToken(BLESStoASTLexer.LITERAL_of, 'of')
           myText = 'of'
           ])
          //put on the assertion expression
        addChild(e.numeric_expression.toAST)  
      ] 
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of SumQuantification

  def dispatch BAST
toAST(ProductQuantification e) 
  {
    try {  
////product
//  if (e.product)
  	newBAST(e) =>
  	  [
        token = new CommonToken(BLESStoASTLexer.LITERAL_product, 'product')
           //set my text
        myText = 'product'
          // put on the logic variables
        addChild(e.variables.toAST)  
          // put on the logic variable domain
       addChild(newBAST(e)  =>
       	 [
       	 myText = 'in'
         token = new CommonToken(BLESStoASTLexer.LITERAL_in, 'in')
         if (e.in)
       	   addChild(e.range.toAST)
       	 else if (e.which)
        	   addChild((e.condition as Expression).toAST)
       	 ] )
          // put on the "of"
        addChild(newBAST(e) =>
  	       [
           token = new CommonToken(BLESStoASTLexer.LITERAL_of, 'of')
           myText = 'of'
           ])
          //put on the assertion expression
        addChild(e.numeric_expression.toAST)  
      ] 
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of ProductQuantification

//ignore array sizes
//  def dispatch BAST
//toAST(Declarator e) 
//  {
//  e.variable.makeBASTforID(e) 	
//  }  //end of Declarator


  def dispatch BAST
toAST(CountingQuantification e) 
  {
    try {  
////numberof  
//  if (e.numberof)
  	newBAST(e) =>
  	  [
      token = new CommonToken(BLESStoASTLexer.LITERAL_numberof, 'numberof')
           //set my text
      myText = 'numberof'
          // put on the logic variables
      addChild(e.variables.toAST)  
          // put on the logic variable domain
      addChild(newBAST(e)  =>
       	 [
       	 myText = 'in'
         token = new CommonToken(BLESStoASTLexer.LITERAL_in, 'in')
         if (e.in)
       	   addChild(e.range.toAST)
       	 else if (e.which)
        	   addChild((e.condition as Expression).toAST)
       	 ] )
          // put on the "that"
      addChild(newBAST(e) =>
  	       [
           token = new CommonToken(BLESStoASTLexer.LITERAL_that, 'that')
           myText = 'that'
           ])
          //put on the subpredicate
      addChild((e.counted as Expression).toAST)  
      ] 
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of CountingQuantification

//| AssertionFunctionInvocation
//still maps into predicate_invocation (not split out from PredicateInvocation)
//  def dispatch BAST
//toAST(Invocation e) 
//  {
//    newBAST(e) =>  
//      [
//  	   myText = 'INVOKE_FUNCTION['+e.assertion_function_identifier //.name
//  	      +']'
//       token = new CommonToken(BLESStoASTLexer.INVOKE_FUNCTION, 
//		'INVOKE_FUNCTION['+e.assertion_function_identifier+']')
//	   addChild(e.assertion_function_identifier //.name
//	      .makeBASTforID(e) =>
//	     [
//         if(e.actual_parameter!==null)
//	       addChild(e.actual_parameter.toAST)   //actual_parameter=AssertionExpression
//	     else	
//	   	   for (child : e.params) addChild(child.toAST) //(params+=ActualAssertionParameter ( ',' params+=ActualAssertionParameter )*)
//         ])	        
//      ]	
//  }  //end of AssertionFunctionInvocation


//| AssertionFunctionValue
  def dispatch BAST
toAST(AssertionFunctionValue e) 
  {
  try {  
  if (e.cexp!==null)
  	e.cexp.toAST
  else if (e.pexp!==null) 
  	 (e.pexp as Expression).toAST
     } catch (Exception ex) {ex.printStackTrace x}
  }  //end of AssertionFunctionValue

//   AssertionName :
//name 
//  : pn1=partial_name ( d=PERIOD pn2+=partial_name )*
//    // if there's a dot, make it the root
//    -> {d!==null}? ^( $d $pn1 $pn2+ )
//    -> $pn1 ;
//  def dispatch BAST
//toAST(AssertionName e)
//  {
//	if (e.dot) 
//	  newBAST(e) =>  [
//  	   myText = '.'
//       token = new CommonToken(BLESStoASTLexer.PERIOD, '.')
//       addChild(
//       	  e.id.makeBASTforID(e) => [
//            for (index: e.array_index)  //then add the variables
//              addChild(index.toAST)  	  	
//       	  ]   
//         )
//       for (partial_name: e.pn)  //then add the variables
//         addChild(partial_name.toAST)
//      ]		
//    else
//       e.id.makeBASTforID(e) => [
//         for (index: e.array_index)  //then add the variables
//           addChild(index.toAST)  	  	
//       ]   
//   
//  }   //end of Name

//assertion_range : ^( rs=range_symbol lb=assertion_expression ub=assertion_expression )
//  def dispatch BAST
//toAST(Range e)
//  {
//  e.sym.makeBASTforRangeSymbol(e) =>
//       	  [  //add upper and lower bounds to range symbol
//       	  	addChild(e.lower_bound.toAST)
//       	  	addChild(e.upper_bound.toAST)
//       	  ]   
//  }	//end of AssertionRange

//  AssertionRecordTerm
//assertion_record_term :LPAREN^ assertion_record_value+ RPAREN ;
//  def dispatch BAST
//toAST(RecordTerm e)
//  {
//  newBAST(e) =>  
//    [  //left parenthesis is root
//  	myText = '('
//    token = new CommonToken(BLESStoASTLexer.LPAREN, '(')
//    for (child : e.record_value)  // record_value+=AssertionRecordValue+
//      addChild(child.toAST)  //
//    addChild(newBAST(e) => 
//       [  //right parenthesis is last child
//  	   myText = ')'
//       token = new CommonToken(BLESStoASTLexer.RPAREN, ')') 
//       ] )  
//    ]		 	
//  }  //end of AssertionRecordTerm

//   AssertionRecordValue
//assertion_record_value : ID ARROW^ value SEMICOLON! ;
//  def dispatch BAST
//toAST(RecordValue e)
//  {
//  newBAST(e) =>  
//    [  //arrow parenthesis is root
//  	myText = '=>'
//    token = new CommonToken(BLESStoASTLexer.ARROW, '=>')
//    addChild(e.field.makeBASTforID(e))  //field=ID  //[RecordField] 
//    addChild(e.aval.toAST)  
//    ]		 	
//  }  //end of AssertionRecordValue

  
//| AssertionSubexpression
//assertion_subexpression  : ( m=MINUS )? ( 
//  ts=timed_expression
//    -> {m!==null}? ^( UNARY_MINUS[$m] $ts )
//    -> $ts 
// |  d=LITERAL_def definedLogicVariable=assertion_parameter
//    -> ^($d $definedLogicVariable)  )
//  def dispatch BAST
//toAST(Subexpression e) 
//  {
//  if (e.minus)
//    newBAST(e) =>  
//      [
//  	   myText = '-'
//       token = new CommonToken(BLESStoASTLexer.UNARY_MINUS, '-')
//       addChild(e.timed_expression.toAST)
//  	  ]
//  else if (e.abs)
//    newBAST(e) =>  
//      [
//  	   myText = 'abs'
//       token = new CommonToken(BLESStoASTLexer.LITERAL_abs, 'abs') 
//       addChild(e.timed_expression.toAST)
//  	  ]
//  else if (e.timed_expression!==null)
//  	e.timed_expression.toAST
//  else if (e.atc!==null)
//  	e.atc.toAST
////no 'def' in current Xtext grammar 	
//  }  //end of AssertionSubexpression

//  AssertionType
//  assertion_type : LITERAL_boolean | LITERAL_natural | LITERAL_integer | LITERAL_rational | LITERAL_real | LITERAL_complex
// | unique_component_classifier_reference;
//  def dispatch BAST
//toAST(AssertionType e) 
//  {
//  	newBAST(e) =>
//  	  [
//     	switch (e)   
//     	  {
//     	  	BooleanType:  token = new CommonToken(BLESStoASTLexer.LITERAL_boolean, 'boolean')
//     	  	case 'natural':  token = new CommonToken(BLESStoASTLexer.LITERAL_natural, 'natural')
//     	  	case 'integer':  token = new CommonToken(BLESStoASTLexer.LITERAL_integer, 'integer')
//     	  	case 'rational':  token = new CommonToken(BLESStoASTLexer.LITERAL_rational, 'rational')
//     	  	case 'real':  token = new CommonToken(BLESStoASTLexer.LITERAL_real, 'real')
//     	  	case 'complex':  token = new CommonToken(BLESStoASTLexer.LITERAL_complex, 'complex')
//     	  	case 'time':  token = new CommonToken(BLESStoASTLexer.LITERAL_time, 'time')  	  	  		  	  
//     	  }   
//     
//   	  ]
//     	//or  need to figure out data classifier reference
//     	// it may be just a resolved Element referent 	
//     	//| aadl_data_component_type=[aadl2::DataClassifier|PNAME]
//  }  //end of AssertionType
//  

//  def dispatch BAST
//toAST(AssertionTypeConversion e)
//  {
//  if (e.natural)	
//  newBAST(e) =>  
//    [  
//  	myText = "natural"
//    token = new CommonToken(BLESStoASTLexer.LITERAL_natural, "natural")
//    addChild(e.ps.toAST) 	
//    ]
//  else if (e.integer)	
//  newBAST(e) =>  
//    [  
//  	myText = "integer"
//    token = new CommonToken(BLESStoASTLexer.LITERAL_integer, "integer")
//    addChild(e.ps.toAST) 	
//    ]
//  else if (e.rational)	
//  newBAST(e) =>  
//    [  
//  	myText = "rational"
//    token = new CommonToken(BLESStoASTLexer.LITERAL_rational, "rational")
//    addChild(e.ps.toAST) 	
//    ]
//  else if (e.real)	
//  newBAST(e) =>  
//    [  
//  	myText = "real"
//    token = new CommonToken(BLESStoASTLexer.LITERAL_real, "real")
//    addChild(e.ps.toAST) 	
//    ]
//  else if (e.complex)	
//  newBAST(e) =>  
//    [  
//  	myText = "complex"
//    token = new CommonToken(BLESStoASTLexer.LITERAL_complex, "complex")
//    addChild(e.ps.toAST) 	
//    ]
//  else if (e.time)	
//  newBAST(e) =>  
//    [  
//  	myText = "time"
//    token = new CommonToken(BLESStoASTLexer.LITERAL_time, "time")
//    addChild(e.ps.toAST) 	
//    ]
//  }  //end of AssertionTypeConversion

//  def dispatch BAST
//toAST(Value e)
//  {
////  | nam=Name
//  if (e.nam!==null)
//     e.nam.toAST  //get BAST from Name
////  | port=ID  //[aadl2::Port] 
//////  	  ( question?='?' |   no p? inside Assertions
////  	  ( '\'' fresh?='fresh' | '\'' count?='count' )?
////for now port=ID  will be aadl2::Port, need to test for fresh and count usage
//  else if (e.port!==null)
//     e.port.name.makeBASTforPort(e)
//////  | function_call=FunctionCall
////     e.function_call.toAST ?: //get BAST from PredicateInvocation
////  | integer_literal=INTEGER_LIT
//  else if (e.function!==null)
//    {
//    e.function.toAST
//    }	
//  else if (e.constant!==null)
//    {
//    e.constant.toAST	
////    if (e.constant.integer_literal!==null)
////      e.constant.integer_literal.makeBASTforINT(e) 
//////  | real_literal=REAL_LIT 
////    else if (e.constant.real_literal!==null)
////      e.constant.real_literal.makeBASTforREAL_LIT(e) 
//////  | string_literal=STRING  //AADL_STRING_LITERAL
////    else if (e.constant.string_literal!==null)
////      e.constant.string_literal.makeBASTforSTRING(e) 
//    }
////  | ( inmode='in' 'mode' '(' modes+=[aadl2::Mode|ID]+ ')' )
////  | timeout?='timeout'
//  else if (e.timeout!==null) 
//    newBAST(e) => [
//  	   myText = 'timeout'
//       token = new CommonToken(BLESStoASTLexer.LITERAL_timeout, 'timeout')
//      ] 
////  | now='now'
//    else if (e.now!==null) newBAST(e) => [
//  	   myText = 'now'
//       token = new CommonToken(BLESStoASTLexer.LITERAL_now, 'now')
//      ] 
////  | tops='tops'
//    else if (e.tops!==null) newBAST(e) => [
//  	   myText = 'tops'
//       token = new CommonToken(BLESStoASTLexer.LITERAL_tops, 'tops')
//      ] 
////  | nul='null'
//    else if (e.nul!==null) newBAST(e) => [
//  	   myText = 'null'
//       token = new CommonToken(BLESStoASTLexer.LITERAL_null, 'null')
//      ]    
//  }  //end of AssertionValue
  
//      ConditionValuePair :
// condition_value_pair : parenthesized_predicate IMP^ assertion_expression;
  def dispatch BAST
toAST(ConditionValuePair e)
  {
  try {  
    newBAST(e) =>  [
  	   myText = '->'
       token = new CommonToken(BLESStoASTLexer.IMP, '->')
//must add parentheses around predicate       
       addChild(parenthesize((e.condition as Expression).toAST,e))  //condition = parenthesized_predicate
       addChild((e.expression as Expression).toAST)  //expression = assertion_expression
      ]	
    } catch (Exception ex) {ex.printStackTrace x}
  }   //end of ConditionValuePair

  def BAST
parenthesize(BAST pred, Element e)
  {
  if ((pred.getChildCount()==0) || pred.hasType(BLESStoASTLexer.AT_SIGN)
        || pred.hasType(BLESStoASTLexer.LBRACKET)) 
  return pred
  newBAST(e) =>  [
       myText = '('
       token = new CommonToken(BLESStoASTLexer.LPAREN, '(')
       addChild(pred)
       addChild(newBAST(e) =>  [
       myText = ')'
       token = new CommonToken(BLESStoASTLexer.RPAREN, ')')
       ])
       ] 
  }


//      ConditionalAssertionExpression :
//conditional_assertion_expression :
//    LPAREN p=predicate q=QQ t=/*true*/assertion_expression COLON f=/*false*/assertion_expression RPAREN
//    -> ^($q $p $t $f) ;
  def dispatch BAST
toAST(ConditionalExpression e)
  {
  try {  
    newBAST(e) =>  [
  	   myText = 'CONDITIONAL'
       token = new CommonToken(BLESStoASTLexer.CONDITIONAL, 'CONDITIONAL')
       addChild(e.pred.toAST)  //pred = predicate
       addChild(e.t.toAST)  //true choice, t = assertion_expression
       addChild(e.f.toAST)  //false choice f = assertion_expression
      ]	
    } catch (Exception ex) {ex.printStackTrace x}
  }   //end of ConditionalAssertionExpression



//      ConditionalAssertionFunction :
 //conditional_assertion_function:
//  ( cvp+=condition_value_pair ( c=COMMA cvp+=condition_value_pair (COMMA cvp+=condition_value_pair)* ) )
//    -> ^(CONDITIONAL_FUNCTION[$c,
//        "CONDITIONAL_FUNCTION["+Integer.toString($c.getLine()+startingLine)+"]"] 
//        $cvp+) ;
  def dispatch BAST
toAST(ConditionalAssertionFunction e)
  {
  try {  
    newBAST(e) =>  [
  	   myText = 'CONDITIONAL_FUNCTION' //['+e.locationReference.line+']'
       token = new CommonToken(BLESStoASTLexer.CONDITIONAL_FUNCTION, 'CONDITIONAL_FUNCTION') //['+e.locationReference.line+']')
       for (child : e.cvp)  //add on the condition_value_pair children
         addChild(child.toAST)
      ]	
    } catch (Exception ex) {ex.printStackTrace x}
  }   //end of ConditionalAssertionFunction

//  def dispatch BAST
//toAST(ConstantNumberRange e)
//  {
//  if (!e.lb_unary_minus&&!e.ub_unary_minus)
//    newBAST(e) =>  [
//  	   myText = '..'
//       token = new CommonToken(BLESStoASTLexer.DOTDOT, '..')
//       addChild(e.lb.toAST)  //add lower bound
//       addChild(e.ub.toAST)  //add upper bound
//      ]	
//  else if (e.lb_unary_minus&&!e.ub_unary_minus)
//    newBAST(e) =>  [
//  	   myText = '..'
//       token = new CommonToken(BLESStoASTLexer.DOTDOT, '..')
//       addChild(newBAST(e) =>  [
//  	      myText = '-'
//          token = new CommonToken(BLESStoASTLexer.UNARY_MINUS, '-')
//          addChild(e.lb.toAST)  //add lower bound
//          ])
//       addChild(e.ub.toAST)  //add upper bound
//      ]	
//  else if (!e.lb_unary_minus&&e.ub_unary_minus)
//    newBAST(e) =>  [
//  	   myText = '..'
//       token = new CommonToken(BLESStoASTLexer.DOTDOT, '..')
//       addChild(e.lb.toAST)
//       addChild(newBAST(e) =>  [
//  	      myText = '-'
//          token = new CommonToken(BLESStoASTLexer.UNARY_MINUS, '-')
//          addChild(e.ub.toAST)
//          ])  //add upper bound
//      ]	
//  else if (e.lb_unary_minus&&e.ub_unary_minus)
//    newBAST(e) =>  [
//  	   myText = '..'
//       token = new CommonToken(BLESStoASTLexer.DOTDOT, '..')
//       addChild(newBAST(e) =>  [
//  	      myText = '-'
//          token = new CommonToken(BLESStoASTLexer.UNARY_MINUS, '-')
//          addChild(e.lb.toAST)  //add lower bound
//          ])
//       addChild(newBAST(e) =>  [
//  	      myText = '-'
//          token = new CommonToken(BLESStoASTLexer.UNARY_MINUS, '-')
//          addChild(e.ub.toAST)
//          ])  //add upper bound
//      ]		
//  }  //end of ConstantNumberRange

//      EnumerationPair :
//enumeration_pair : /*enumeration_literal_*/ID^ IMP! predicate;
  def dispatch BAST
toAST(EnumerationPair e)
  {
  try {  
    newBAST(e) =>  [
  	   myText = e.enumeration_literal
       token = new CommonToken(BLESStoASTLexer.ID, e.enumeration_literal)
       addChild((e.predicate as Expression).toAST)  //predicate = predicate
      ]	
    } catch (Exception ex) {ex.printStackTrace x}
  }   //end of EnumerationPair

//      ExistentialQuantification :
//existential_quantification : e=LITERAL_exists^ logic_variables logic_variable_domain t=LITERAL_that! predicate;
  def dispatch BAST
toAST(ExistentialQuantification e)
  {
  try {  
    newBAST(e) =>  [
  	   myText = 'exists'
       token = new CommonToken(BLESStoASTLexer.LITERAL_exists, 'exists')
       if (e.variables!==null)
         addChild(e.variables.toAST)  //variables = logic_variables
       addChild(newBAST(e)  =>
       	 [
       	 myText = 'in'
         token = new CommonToken(BLESStoASTLexer.LITERAL_in, 'in')
         if (e.in)
       	   addChild(e.range.toAST)
       	 else if (e.which)
        	   addChild(e.condition.toAST)
       	 ] )
       addChild((e.predicate as Expression).toAST)  //predicate = predicate
      ]	
    } catch (Exception ex) {ex.printStackTrace x}
  }   //end of ExistentialQuantification


//      ExpressionOrRange :
//expression_or_range :  expression ( range_symbol^ expression )?  ;
//  def dispatch BAST
//toAST(ExpressionOrRange e)
//  {
//	e.expression.toAST ?:
//	e.range.toAST
//  }   //end of ExpressionOrRange

//      FormalAssertionParameter
  def dispatch BAST
toAST(Variable e)
  {
  e.name.makeBASTforID(e)
  try {  
    newBAST(e) => [
      token = new CommonToken(BLESStoASTLexer.TILDE, '~')
          myText = '~' 
          addChild(e.name.makeBASTforID(e))
//NEED TO FAKE IN type_name 
          if (e.tod.ref !== null) 
            addChild(e.tod.ref.name.makeBASTforID(e)) 
          else  //make dummy type name for type       
            addChild(newBAST(e) => [
             token = new CommonToken(BLESStoASTLexer.ID, 'dummytype')
             myText = 'dummytype' 
          	 ]
          ) ]
    } catch (Exception ex) {ex.printStackTrace x}
  }   //end of FormalAssertionParameter

//      FormalAssertionParameterList
  def dispatch BAST
toAST(VariableList e)
  {
  try {  
  if (e.comma)
    newBAST(e) => [
      token = new CommonToken(BLESStoASTLexer.COMMA, ',')
          myText = ',' 
          addChild(e.first.toAST)
          for (child : e.parameter)  
            addChild(child.toAST)  ]
  else	
	  e.first.toAST
    } catch (Exception ex) {ex.printStackTrace x}
  }   //end of FormalAssertionParameterList

//   IntegerExpression
//maps onto expression : a1=subexpression ( o=PLUS  )?
//infix expressions
//  def dispatch BAST
//toAST(IntegerExpression e)
//  {
//  if (e.sym!==null)	
//    switch e.sym
//    {
//    	case '+' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.PLUS, '+')
//          myText = '+' 
//          addChild(e.first.toAST)
//          for (child : e.added)  //add on the r.h.s children
//            addChild(child.toAST) ]
//    	case '*' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.TIMES, '*')
//          myText = '*' 
//          addChild(e.first.toAST)
//          for (child : e.multiplied)  //add on the r.h.s children
//            addChild(child.toAST) ]
//    	case '-' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.MINUS, '-')
//          myText = '-' 
//          addChild(e.first.toAST)
//          addChild(e.subtracted.toAST)  //add on the r.h.s children
//            ]
//    	case '/' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.DIVIDE, '/')
//          myText = '/' 
//          addChild(e.first.toAST)
//          addChild(e.divided.toAST) ]
////    	case '**' : newBAST(e) => [
////          token = new CommonToken(BLESStoASTLexer.EXP, '**')
////          myText = '**' 
////          addChild(e.left_hand_side.toAST)
////          for (child : e.right_hand_side)  //add on the r.h.s children
////            addChild(child.toAST) ]
//    	case 'mod' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.LITERAL_mod, 'mod')
//          myText = 'mod' 
//          addChild(e.first.toAST)
//          addChild(e.divided.toAST)]
////    	case 'rem' : newBAST(e) => [
////          token = new CommonToken(BLESStoASTLexer.LITERAL_rem, 'rem')
////          myText = '*' 
////          addChild(e.left_hand_side.toAST)
////          for (child : e.right_hand_side)  //add on the r.h.s children
////            addChild(child.toAST) ]	
//    	default : e.first.toAST
//    } //end of switch
//    else if (e.first!==null) e.first.toAST
//  }  //end of IntegerExpression
  
//  IndexExpressionOrRange
//used only in PartialName
  def dispatch BAST
toAST(IndexExpressionOrRange e)
  {
  try {  
	if (e.dd) 
	  newBAST(e) =>  [
  	   myText = '..'
       token = new CommonToken(BLESStoASTLexer.DOTDOT, '..')
       addChild(e.left_hand_side.toAST)  //variables = logic_variables
       addChild(e.right_hand_side.toAST)  //domain = logic_variable_domain
      ]	
    else  //just an index
    e.left_hand_side.toAST
    } catch (Exception ex) {ex.printStackTrace x}
  }   //end of IndexExpressionOrRange

//      PeriodShift :
//maps onto subexpression
  def dispatch BAST
toAST(PeriodShift e)
  {
  try {  
	if (e.unary_minus) 
	  newBAST(e) =>  [
  	   myText = '-'
       token = new CommonToken(BLESStoASTLexer.UNARY_MINUS, '-')
       if (e.v!==null)
         addChild(e.v.toAST)  //v = value
       else if (e.index_expression!==null)  
         addChild(e.index_expression.parenthesize)  //domain = logic_variable_domain
      ]		
    else  if (e.v!==null)
        e.v.toAST  //v = value
    else if (e.index_expression!==null)  
         e.index_expression.parenthesize  //domain = logic_variable_domain
    } catch (Exception ex) {ex.printStackTrace x}
  }   //end of PeriodShift

/** make IntegerExpression into parenthesized_subexpression */
  def BAST
parenthesize(IndexExpression ie)  
  {
  try {  
  newBAST(ie) =>  
    [  //left parenthesis is root
  	myText = '('
    token = new CommonToken(BLESStoASTLexer.LPAREN, '(')
    addChild(ie.toAST)  //first child is expression tree
    addChild(newBAST(ie) => 
       [  //right parenthesis is last child
  	   myText = ')'
       token = new CommonToken(BLESStoASTLexer.RPAREN, ')') 
       ] )  
    ]		 	
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of parenthesize


  def dispatch BAST
toAST(IndexExpression ie)
  {
  try {  
  if (ie.sym !== null && ie.sym.equals('-'))
    {
    newBAST(ie) =>
      [
  	  myText = '-'
      token = new CommonToken(BLESStoASTLexer.MINUS, '-')
      addChild(ie.l.toAST)
      addChild(ie.r.head.toAST)
      ]	
    }
  else if (ie.sym !== null && ie.sym.equals('div'))
    {
    newBAST(ie) =>
      [
  	  myText = '/'
      token = new CommonToken(BLESStoASTLexer.DIVIDE, '/')
      addChild(ie.l.toAST)
      addChild(ie.r.head.toAST)
      ]	
    }
  else if (ie.sym !== null && ie.sym.equals('mod'))
    {
    newBAST(ie) =>
      [
  	  myText = 'mod'
      token = new CommonToken(BLESStoASTLexer.LITERAL_mod, '/')
      addChild(ie.l.toAST)
      addChild(ie.r.head.toAST)
      ]	
    }
  else if (ie.sym !== null && ie.sym.equals('+'))
    {
    newBAST(ie) =>
      [
  	  myText = '+'
      token = new CommonToken(BLESStoASTLexer.PLUS, '+')
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
      token = new CommonToken(BLESStoASTLexer.TIMES, '*')
      addChild(ie.l.toAST)
      for (ch : ie.r)
        addChild(ch.toAST)
      ]	
    }
  else ie.l.toAST	
    } catch (Exception ex) {ex.printStackTrace x}
  }  // end of IndexExpression


//      LogicVariableDomain :
//logic_variable_domain :  
//  i=LITERAL_in   
//  ( 
//    ( assertion_expression range_symbol ) => 
//  l=assertion_expression rs=range_symbol r=assertion_expression 
//    -> ^($i ^( $rs $l $r ) )
//  | 
//  predicate 
//    -> ^( $i predicate )
//  )  ; 
//  def dispatch BAST
//toAST(LogicVariableDomain e)
//  {
//	newBAST(e) =>  [  //make 'in' root
//  	   myText = 'in'
//       token = new CommonToken(BLESStoASTLexer.LITERAL_in, 'in')
//       if (e.range!==null)
//         addChild( //range_symol subroot
//       	  e.range.makeBASTforRangeSymbol(e) =>
//       	  [  //add upper and lower bounds to range symbol
//       	  	addChild(e.lower_bound.toAST)
//       	  	addChild(e.upper_bound.toAST)
//       	  ] )  
//       //or perhaps a predicate
//      else if (e.pred!==null)
//        addChild(e.pred.toAST) 
//      ]		
//  }   //end of LogicVariableDomain


//      LogicVariables :
//logic_variables : i+=identifier (COMMA i+=identifier)* coln=COLON aty=assertion_type 
//    -> ^( $coln $aty $i+ )  ; 
  def dispatch BAST
toAST(LogicVariables e)
  {
  try {  
  if (e.lv.size === 1)
	newBAST(e) =>  
	  [  //make ':' root
  	myText = ':'
    token = new CommonToken(BLESStoASTLexer.COLON, ':')
    addChild( //assertion_type is first child
       e.lv.head.tod.toAST)
    addChild(e.lv.head.name.makeBASTforID(e.lv.head))
    ]	
  else  //ANTLR3 grammar has all logic variables the same type
	newBAST(e) =>  
	  [  //make ':' root
  	myText = ':'
    token = new CommonToken(BLESStoASTLexer.COLON, ':')
    addChild( //assertion_type is first child
       e.lv.head.tod.toAST)
    for (v : e.lv)
      addChild(v.name.makeBASTforID(v))
    ]	
    } catch (Exception ex) {ex.printStackTrace x}  	
  }   //end of LogicVariables


  def dispatch BAST
toAST(ModeCondition e)
  {
   try {  
  newBAST(e) =>  [  
    myText = 'on'
    token = new CommonToken(BLESStoASTLexer.LITERAL_on, 'on')
    addChild(e.tle.toAST)  	
  	]
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end if ModeCondition

//      Name :
//name 
//  : pn1=partial_name ( d=PERIOD pn2+=partial_name )*
//    // if there's a dot, make it the root
//    -> {d!==null}? ^( $d $pn1 $pn2+ )
//    -> $pn1 ;
  def dispatch BAST
toAST(ValueName e)
  {
  try {  
	if (e.dot) 
	  newBAST(e) =>  [
  	   myText = '.'
       token = new CommonToken(BLESStoASTLexer.PERIOD, '.')
       addChild(  //put on id[i1][i2]
       	 newBAST(e) =>  [
       	 	myText = e.id.name
       	 	token = new CommonToken(BLESStoASTLexer.ID, e.id.name)
       	 	for (index : e.array_index)
       	 	  addChild(index.toAST)
       	 ]
       )
       for (partial_name: e.pn)  //then add the variables
         addChild(partial_name.toAST)
      ]	
   else if (e.fresh)
     makeBASTforPort(e.id.name+'\'fresh',e)
//   newBAST(e) => [
//       myText = '\''
//       token = new CommonToken(BLESStoASTLexer.TICK, '\'')
//       addChild(makeBASTforPort(e.id.name,e))
//       addChild(   
//         newBAST(e) => [
//         myText = 'fresh'
//         token = new CommonToken(BLESStoASTLexer.LITERAL_fresh, 'fresh')
//         ])
//      ] 
  else if (e.count)
     makeBASTforPort(e.id.name+'\'count',e)
//   newBAST(e) => [
//       myText = '\''
//       token = new CommonToken(BLESStoASTLexer.TICK, '\'')
//       addChild(makeBASTforPort(e.id.name,e))
//       addChild(   
//         newBAST(e) => [
//         myText = 'count'
//         token = new CommonToken(BLESStoASTLexer.LITERAL_count, 'count')
//         ])
//      ] 
  else if (e.updated)
      makeBASTforPort(e.id.name+'\'updated',e)
//   newBAST(e) => [
//       myText = '\''
//       token = new CommonToken(BLESStoASTLexer.TICK, '\'')
//       addChild(makeBASTforPort(e.id.name,e))
//       addChild(   
//         newBAST(e) => [
//         myText = 'updated'
//         token = new CommonToken(BLESStoASTLexer.LITERAL_updated, 'updated')
//         ])
//      ] 
  else if (e.q) // && !e.containedInAssignment)  // && !AssertionUtil.containedInAssertion(e))
   newBAST(e) => [
       myText = '?'
       token = new CommonToken(BLESStoASTLexer.QUESTION, '?')
       addChild(makeBASTforPort(e.id.name,e))
      ] 
  else if (e.lp) // function call
   newBAST(e) => [
       myText = 'FUNCTION_CALL['+e.id.name+']'
       token = new CommonToken(BLESStoASTLexer.FUNCTION_CALL, 'FUNCTION_CALL['+e.id.name+']')
       addChild(makeBASTforID(e.id.name,e))
       if (e.pr !== null)
       for (parameter : e.pr.parameters)
         addChild(parameter.toAST)
      ] 
  else  //just id with optional [i1][i2]
      newBAST(e) =>  [
       	myText = e.id.name
       	token = new CommonToken(BLESStoASTLexer.ID, e.id.name)
       	for (index : e.array_index)
       	 	addChild(index.toAST)
      ]
    } catch (Exception ex) {ex.printStackTrace x}
  }   //end of Name

//FormalExpressionPair: formal=ID  //[aadl2::Parameter] ':' actual=Expression ;
//formal_expression_pair : formal=ID COLON^ actual=expression ;
  def dispatch BAST
toAST(FormalExpressionPair e)
  {
  newBAST(e) => [
       myText = '->'
       token = new CommonToken(BLESStoASTLexer.ARROW, '->')
       addChild(makeBASTforID(e.formal,e))
       addChild(e.actual.toAST)
      ] 
  }


//      NamelessAssertion :
//NamelessAssertion:
//	pred=Predicate | ':=' pfv=AssertionFunctionValue | ae=AssertionEnumeration ;
//maps onto assertion_body
//  pred=>ASSERTION  pfv=>ASSERTION_FUNCTION  ae=>ASSERTION_ENUMERATION
//just no parameters
  def dispatch BAST
toAST(NamelessAssertion e)
  {
  try {  
	  newBAST(e) =>  [
  	   myText = 'ASSERTION'
       token = new CommonToken(BLESStoASTLexer.ASSERTION, 'ASSERTION')
       addChild((e.predicate as Expression).toAST)
       ]
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of   NamelessAssertion   
       
  def dispatch BAST
toAST(NamelessFunction e)
  {
  try {  
	  newBAST(e) =>  [
  	   myText = 'ASSERTION_FUNCTION'
       token = new CommonToken(BLESStoASTLexer.ASSERTION_FUNCTION, 'ASSERTION_FUNCTION')
       //ignore return type
       addChild(e.functionvalue.toAST)
       ]
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of NamelessFunction
       
  def dispatch BAST
toAST(NamelessEnumeration e)
  {
  try {  
	  newBAST(e) =>  [
  	   myText = 'ASSERTION_ENUMERATION'
       token = new CommonToken(BLESStoASTLexer.ASSERTION_ENUMERATION, 'ASSERTION_ENUMERATION')
       addChild(e.enumeration.toAST)
       ]   
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of NamelessEnumeration

//      ParenthesizedPredicate :
//parenthesized_predicate  :  LPAREN^ predicate RPAREN  ; 
//  def dispatch BAST
//toAST(ParenthesizedPredicate e)
//  {
//  newBAST(e) =>  
//    [  //left parenthesis is root
//  	myText = '('
//    token = new CommonToken(BLESStoASTLexer.LPAREN, '(')
//    addChild(e.predicate.toAST)  //first child is predicate
//    addChild(newBAST(e) => 
//       [  //right parenthesis is last child
//  	   myText = ')'
//       token = new CommonToken(BLESStoASTLexer.RPAREN, ')') 
//       ] )  
//    ]		 	
//  }  //end of ParenthesizedPredicate


//      ParenthesizedPredicateExpression :
//parenthesized_assertion_expression :
//  cpe=conditional_assertion_expression  -> $cpe
//  | art=assertion_record_term -> $art  
//  | lp=LPAREN pe=assertion_expression rp=RPAREN
//    -> ^($lp $pe $rp) ;
//  def dispatch BAST
//toAST(ParenthesizedPredicateExpression e)
//  {
//  if (e.cae!==null)	 //have a ConditionalAssertionExpression?
//    e.cae.toAST
//  else if (e.caf!==null)	 //have a ConditionalAssertionFunction?
//    e.caf.toAST
//  else if (e.rec!==null)	 //have a AssertionRecordTerm?
//    e.rec.toAST
//  else if (e.pred_ex!==null)	 //have a AssertionExpression?
//	newBAST(e) =>  [  //make ^(LPAREN ae RPAREN)
//  	   myText = '('  //make left parenthesis
//       token = new CommonToken(BLESStoASTLexer.LPAREN, '(')
//       addChild(e.pred_ex.toAST)
//       addChild(  //add right parenthesis
//         newBAST(e) =>  [ myText = ')'  //make right parenthesis
//           token = new CommonToken(BLESStoASTLexer.RPAREN, ')') ]  )
//       ]   
//  }  //end of ParenthesizedPredicateExpression


//      PartialName
//partial_name : identifier   
//  ( LBRACKET index+=expression_or_range RBRACKET )* 
//  -> {index!==null}? ^( identifier $index+ )  
//  -> identifier; 
  def dispatch BAST
toAST(PartialName e)
  {  //root is identifier
  try {  
  	e.record_id.makeBASTforID(e) =>
  	 [  //add index children, if any
  	 for (index : e.array_index)
  	   addChild(index.toAST)	
  	 ]
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of PartialName

//      Predicate :
//predicate 
//  :  
//  universal_quantification
//  |
//  existential_quantification
//  | 
//  subpredicate   
//    ( 
//    ( LITERAL_and^ subpredicate ( LITERAL_and! subpredicate )*) 
//    | 
//    ( LITERAL_or^ subpredicate ( LITERAL_or! subpredicate )* )   
//    | 
//    ( LITERAL_xor^ subpredicate ( LITERAL_xor! subpredicate )* )  
//    | 
//    imp=LITERAL_implies^ predicate    
//    | 
//    i=LITERAL_iff^ subpredicate   
//    | 
//    a=IMP^ predicate 
//    )?  
//  ; 
//  def dispatch BAST
//toAST(Predicate e)
//  {
//  	if (e.existential_quantification!==null)
//  	  e.existential_quantification.toAST 
//  	else if (e.universal_quantification!==null)
//  	  e.universal_quantification.toAST
//  	else if (e.sym!==null)
//  	  switch e.sym
//  	  {
//  	  case 'and' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.LITERAL_and, 'and')
//          myText = 'and' 
//          addChild(e.term.toAST)
//          for (child : e.moreTerms)  //add on the r.h.s children
//            addChild(child.toAST) ]
//  	  case 'or' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.LITERAL_or, 'or')
//          myText = 'or' 
//          addChild(e.term.toAST)
//          for (child : e.moreTerms)  //add on the r.h.s children
//            addChild(child.toAST) ]
//  	  case 'xor' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.LITERAL_xor, 'xor')
//          myText = 'xor' 
//          addChild(e.term.toAST)
//          for (child : e.moreTerms)  //add on the r.h.s children
//            addChild(child.toAST) ]
//  	  case '->' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.IMP, '->')
//          myText = '->' 
//          addChild(e.term.toAST)
//          addChild(e.consequent.toAST) ]
//  	  case 'implies' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.LITERAL_implies, 'implies')
//          myText = 'implies' 
//          addChild(e.term.toAST)
//          addChild(e.consequent.toAST) ]
//  	  case 'iff' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.LITERAL_iff, 'iff')
//          myText = 'iff' 
//          addChild(e.term.toAST)
//          addChild(e.logical_equivalent.toAST) ]
////  	  default : e.term.toAST	
//  	  }  //end of switch
//  	else 
//  	  e.term.toAST
//  }  //end of Predicate

//      PredicateInvocation :
//predicate_invocation 
//  : 
//  i=identifier lp=LPAREN RPAREN
//    -> ^( INVOKE[$lp,"INVOKE["+Integer.toString($lp.getLine()+startingLine)+"]"] 
//        $i )
//  |
//  i=identifier lp=LPAREN exp=assertion_expression RPAREN
//    -> ^( INVOKE[$lp,"INVOKE["+Integer.toString($lp.getLine()+startingLine)+"]"] 
//        ^( $i  $exp ) )
//  |
//  i=identifier lp=LPAREN params+=actual_assertion_parameter ( COMMA params+=actual_assertion_parameter )+  RPAREN
//    -> ^( INVOKE[$lp,"INVOKE["+Integer.toString($lp.getLine()+startingLine)+"]"] 
//        ^( $i $params+) ) ;

// Invocation can be either predicate_invocation or assertion_function_invocation
  def dispatch BAST
toAST(Invocation e)
  {
  try { 
  if (e.isPredicate) 
  newBAST(e) =>  
    [  //left parenthesis is root
  	myText = 'INVOKE['+e.label.name+']'
    token = new CommonToken(BLESStoASTLexer.INVOKE, 'INVOKE['+e.label.name+']')
	  addChild(e.label.name.makeBASTforID(e) =>
	   	 [
	   	 if (e.actual_parameter!==null)	
	   	 	addChild(e.actual_parameter.toAST)   //actual_parameter=AssertionExpression
	   	 if (e.params!==null)	
	   	   for (child : e.params) addChild(child.toAST) //(params+=ActualAssertionParameter ( ',' params+=ActualAssertionParameter )*)
	   	 ])
    ]		 	
  else
  newBAST(e) =>  
    [  //left parenthesis is root
    myText = 'INVOKE_FUNCTION['+e.label.name+']'
    token = new CommonToken(BLESStoASTLexer.INVOKE_FUNCTION, 'INVOKE_FUNCTION['+e.label.name+']')
    addChild(e.label.name.makeBASTforID(e) =>
       [
       if (e.actual_parameter!==null) 
        addChild(e.actual_parameter.toAST)   //actual_parameter=AssertionExpression
       if (e.params!==null) 
         for (child : e.params) addChild(child.toAST) //(params+=ActualAssertionParameter ( ',' params+=ActualAssertionParameter )*)
       ])
    ]           
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of PredicateInvocation

  def boolean
isPredicate(Invocation e)
  {
  if (e.eContainer instanceof AssertionEnumeration)  
    true 
  else if (e.label.pred || e.label.enumer)
    true
  else false  //it's an assertion function    
  }


//      PredicateRelation :
//maps onto subpredicate
  def dispatch BAST
toAST(Relation e)
  {
   try {  
//  if (e.plusequal)
//     newBAST(e) =>  
//       [ 
//  	   myText = '+='
//       token = new CommonToken(BLESStoASTLexer.PLUS_EQUALS, '+=')
//       addChild(e.target.toAST)  //add target=Name
//       addChild(e.increment.toAST)  //add increment=AssertionSubexpression     
//       ]
//  else 
  if (e.in !== null)
     (newBAST(e) =>  
         [  
         myText = 'in'
         token = new CommonToken(BLESStoASTLexer.LITERAL_in, 'in')
         addChild(e.l.toAST)   //s.b. only one
         addChild(e.range.toAST)
         ]).parenthesize(e)
  else if (e.sym !== null)
      (e.sym.makeBASTforRelationSymbol(e) =>
         [  
         addChild(e.l.toAST)   
         addChild(e.r.toAST)  
         ]).parenthesize(e)  
  else
    e.l.toAST   	
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of PredicateRelation
 

//      SubPredicate :
//
//  def dispatch BAST
//toAST(SubPredicate e)
//  {
//  if (e.not)
//    newBAST(e) =>  
//       [  
//  	   myText = 'not'
//       token = new CommonToken(BLESStoASTLexer.LITERAL_not, 'not')
//       addChild(e.subsub.toAST)
//       ]
//  else
//    e.subsub.toAST
//  }  //end of SubPredicate

//  SubSubPredicate
//  def dispatch BAST
//toAST(SubSubPredicate e)
//  {
//  if (e.t!==null)  //t?='true' 
//    newBAST(e) =>  
//       [  
//  	   myText = 'true'
//       token = new CommonToken(BLESStoASTLexer.LITERAL_true, 'true')
//       ]
//  else if (e.f!==null)  //f?='false'
//    newBAST(e) =>  
//       [  
//  	   myText = 'false'
//       token = new CommonToken(BLESStoASTLexer.LITERAL_false, 'false')
//       ]
//  else if (e.st!==null)  //st?='stop'
//    newBAST(e) =>  
//       [  
//  	   myText = 'stop'
//       token = new CommonToken(BLESStoASTLexer.LITERAL_stop, 'stop')
//       ]
//   else if (e.variable!==null)
//    newBAST(e) =>  
//       [  
//  	   myText = 'def'
//       token = new CommonToken(BLESStoASTLexer.LITERAL_def, 'def')
//       addChild(e.variable.makeBASTforID(e))  //may change to assertion_parameter
//       ]    
////  else if (e.def)  // def?='def' variable=LogicVariables
////    newBAST(e) =>  
////       [  
////  	   myText = 'def'
////       token = new CommonToken(BLESStoASTLexer.LITERAL_def, 'def')
////       addChild(e.variables.toAST)
////       ]
//  else if (e.relation!==null)
//    e.relation.toAST // relation=PredicateRelation 
////  else if (e.invocation!==null)
////    e.invocation.toAST  // invocation=PredicateInvocation
//  else if (e.timedpredicate!==null)
//    e.timedpredicate.toAST //predicate=TimedPredicate
//  else if (e.event!==null)
//    e.event.toAST //event=Event  
//  }  //end of SubSubPredicate

//      TimedExpression :
//split off subject from grammar production to make Xtend easier
//timed_expression :
//  (v=value | parenthesized_assertion_expression | predicate_invocation)
//  (TICK^ |  AT_SIGN^ subexpression  |  CARET^ period_shift )?  ;
//  def dispatch BAST
//toAST(TimedExpression e)
//  {
//  if (e.tick)	
//    newBAST(e) =>  
//       [  
//  	   myText = "'"
//       token = new CommonToken(BLESStoASTLexer.TICK, "'")
//       addChild(e.subject.toAST)
//       ]
//  else if (e.at)	
//    newBAST(e) =>  
//       [  
//  	   myText = "@"
//       token = new CommonToken(BLESStoASTLexer.AT_SIGN, "@")
//       addChild(e.subject.toAST)
//       addChild(e.time.toAST)  // at?='@' time=AssertionSubexpression
//       ]
//  else if (e.caret)	
//    newBAST(e) =>  
//       [  
//  	   myText = "^"
//       token = new CommonToken(BLESStoASTLexer.CARET, "^")
//       addChild(e.subject.toAST)
//       addChild(e.shift.toAST)  //  caret?='^' periods=PeriodShift 
//       ]
//  else
//    e.subject.toAST
//  }  //end of TimedExpression

//      TimedExpressionSubject :
//timed_expression:  (v=value | parenthesized_assertion_expression | predicate_invocation)
//  followed by optional ' ^ or @
//  def dispatch BAST
//toAST(TimedExpressionSubject e)
//  {
//  if (e.value!==null)	
//    e.value.toAST   //value=AssertionValue |
//  else if (e.expression!==null)	
//    e.expression.toAST  //expression=ParenthesizedPredicateExpression
//  else if (e.function!==null)	
//    e.function.toAST  //  function=AssertionFunctionInvocation
//  }  //end of TimedExpressionSubject

//TimedPredicateSubject: name=Name | predicate=ParenthesizedPredicate | invocation=PredicateInvocation  
//  def dispatch BAST
//toAST(TimedPredicateSubject e)
//  {
//  if (e.aname!==null)	
//    e.aname.toAST   //value=AssertionValue |
//  else if (e.predicate!==null)	
//    e.predicate.toAST  //expression=ParenthesizedPredicateExpression
//  else if (e.invocation!==null)	
//    e.invocation.toAST  //  function=AssertionFunctionInvocation
//  }  //end of TimedExpressionSubject

//      TimedPredicate :
//timed_predicate  : (name | parenthesized_predicate | predicate_invocation)
//  (TICK^ |  AT_SIGN^ subexpression  |  CARET^ period_shift )?  ;
//  def dispatch BAST
//toAST(TimedPredicate e)
//  {
//  if (e.tick)	
//    newBAST(e) =>  
//       [  
//  	   myText = "'"
//       token = new CommonToken(BLESStoASTLexer.TICK, "'")
//       addChild(e.subject.toAST)
//       ]
//  else if (e.at)	
//    newBAST(e) =>  
//       [  
//  	   myText = "@"
//       token = new CommonToken(BLESStoASTLexer.AT_SIGN, "@")
//       addChild(e.subject.toAST)
//       addChild(e.time.toAST)  // at?='@' time=AssertionSubexpression
//       ]
//  else if (e.caret)	
//    newBAST(e) =>  
//       [  
//  	   myText = "^"
//       token = new CommonToken(BLESStoASTLexer.CARET, "^")
//       addChild(e.subject.toAST)
//       addChild(e.shift.toAST)  //  caret?='^' periods=PeriodShift 
//       ]
//  else
//    e.subject.toAST
//  }  //end of TimedPredicate

//| TimeExpression
//
//  def dispatch BAST
//toAST(TimeExpression e)
//  {
//  if (e.sym!==null)	
//    switch (e.sym)
//    {
//    	case '+' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.PLUS, '+')
//          myText = '+' 
//          addChild(e.left_hand_side.toAST)
//          for (child : e.right_hand_side)  //add on the r.h.s children
//            addChild(child.toAST) ]
//    	case '*' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.TIMES, '*')
//          myText = '*' 
//          addChild(e.left_hand_side.toAST)
//          for (child : e.right_hand_side)  //add on the r.h.s children
//            addChild(child.toAST) ]
//    	case '-' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.MINUS, '-')
//          myText = '-' 
//          addChild(e.left_hand_side.toAST)
//          for (child : e.right_hand_side)  //add on the r.h.s children
//            addChild(child.toAST) ]
//    	case '/' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.DIVIDE, '/')
//          myText = '/' 
//          addChild(e.left_hand_side.toAST)
//          for (child : e.right_hand_side)  //add on the r.h.s children
//            addChild(child.toAST) ]
//    	case '**' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.EXP, '**')
//          myText = '**' 
//          addChild(e.left_hand_side.toAST)
//          for (child : e.right_hand_side)  //add on the r.h.s children
//            addChild(child.toAST) ]
//    	case 'mod' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.LITERAL_mod, 'mod')
//          myText = 'mod' 
//          addChild(e.left_hand_side.toAST)
//          for (child : e.right_hand_side)  //add on the r.h.s children
//            addChild(child.toAST) ]
//    	case 'rem' : newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.LITERAL_rem, 'rem')
//          myText = 'rem' 
//          addChild(e.left_hand_side.toAST)
//          for (child : e.right_hand_side)  //add on the r.h.s children
//            addChild(child.toAST) ]	
//    	default : e.left_hand_side.toAST
//    } //end of switch
//  else  //otherwise, just l.h.s.
//    e.left_hand_side.toAST 
//  }  //end of TimeExpression
   
//| TimeSubexpression
//  def dispatch BAST
//toAST(TimeSubexpression e)
//  {
//  if (e.unary_minus)  
//    newBAST(e) =>  
//    [  
//  	myText = "-"
//    token = new CommonToken(BLESStoASTLexer.UNARY_MINUS, "-")
//    if (e.value!==null)
//      addChild(e.value.toAST)	// value=Value
//    else if (e.af!==null) 
//      addChild(e.af.toAST)  //af=AssertionFunctionInvocation
//    else   //'(' expression=TimeExpression ')'
//      addChild(newBAST(e) =>  [  //make ^(LPAREN ae RPAREN)
//  	   myText = '('  //make left parenthesis
//       token = new CommonToken(BLESStoASTLexer.LPAREN, '(')
//       addChild(e.expression.toAST)
//       addChild(  //add right parenthesis
//         newBAST(e) =>  [ myText = ')'  //make right parenthesis
//           token = new CommonToken(BLESStoASTLexer.RPAREN, ')') ]  )
//       ] ) 	//ps=ParenthesizedSubexpression
//    ]
//  else if (e.value!==null)
//    e.value.toAST 
//  else if (e.af!==null) 
//    e.af.toAST  //af=AssertionFunctionInvocation
//  else  
//    newBAST(e) =>  [  //make ^(LPAREN ae RPAREN)
//  	   myText = '('  //make left parenthesis
//       token = new CommonToken(BLESStoASTLexer.LPAREN, '(')
//       addChild(e.expression.toAST)
//       addChild(  //add right parenthesis
//         newBAST(e) =>  [ myText = ')'  //make right parenthesis
//           token = new CommonToken(BLESStoASTLexer.RPAREN, ')') ]  )
//       ]   
//  }  //end of TimeSubexpression
  
//      UniversalQuantification :
//universal_quantification : a=LITERAL_all^ logic_variables logic_variable_domain r=LITERAL_are! predicate ;
  def dispatch BAST
toAST(UniversalQuantification e)
  {
   try {  
	newBAST(e) =>  [  //make ^(all
  	   myText = 'all'  
       token = new CommonToken(BLESStoASTLexer.LITERAL_all, 'all')
       addChild(e.variables.toAST)
       addChild(newBAST(e)  =>
       	 [
       	 myText = 'in'
         token = new CommonToken(BLESStoASTLexer.LITERAL_in, 'in')
         if (e.in)
       	   addChild(e.range.toAST)
       	 else if (e.which)
        	   addChild((e.condition as Expression).toAST)
       	 ] )
       addChild((e.predicate as Expression).toAST) ]	
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of UniversalQuantification



//from Assertion.xtext grammar Element returns aadl2::Element:

//NamedAssertion
//mapped onto assertion_body
//  ( a=identifier cln=COLON lv+=identifier* COLON p=predicate )
//    -> {lv!==null}? ^(ASSERTION[$p.tree.getToken(),"ASSERTION["+Integer.toString($p.tree.getLine()+startingLine)+"]"]  
//        ^(LABEL $a ) ^(PARAMETERS $lv+ )  $p )
//    ->  ^(ASSERTION[$p.tree.getToken(),"ASSERTION["+Integer.toString($p.tree.getLine()+startingLine)+"]"]
//        ^(LABEL $a )  $p )
  def dispatch BAST
toAST(NamedAssertion e)
  {
   try {  
  if (e.pred)  //regular ASSERTION
	newBAST(e) =>  
	  [  //make ^(ASSERTION root
  	  myText = 'ASSERTION['+e.name+']'  //ASSERTION root
      token = new CommonToken(BLESStoASTLexer.ASSERTION, 'ASSERTION['+e.name+']')
      addChild(  //make LABEL subroot
	      newBAST(e) =>  
	      [  //make ^(LABEL identifier)
  	    myText = 'LABEL'  //LABEL subroot
        token = new CommonToken(BLESStoASTLexer.LABEL, 'LABEL')
        addChild(e.name.makeBASTforID(e))
        ] )
   //if there are parameters
      if (e.formals !==null)    
	      addChild(newBAST(e) =>  
	    	 [  
  	     myText = 'PARAMETERS'  
         token = new CommonToken(BLESStoASTLexer.PARAMETERS, 'PARAMETERS')
	       addChild(e.formals.toAST)
	       ])
   //finally, put the predicate on    
       addChild((e.predicate as Expression).toAST) //predicate=Predicate 
       ]	
  else if (e.func)  //ASSERTION_FUNCTION
	newBAST(e) =>  [  //make ^(ASSERTION_FUNCTION root
  	   myText = 'ASSERTION_FUNCTION['+e.name+']'  
       token = new CommonToken(BLESStoASTLexer.ASSERTION_FUNCTION, 
          'ASSERTION_FUNCTION['+e.name+']')
       addChild(  //make LABEL subroot
	       newBAST(e) =>  [  //make ^(LABEL identifier)
  	       myText = 'LABEL'  //LABEL subroot
           token = new CommonToken(BLESStoASTLexer.LABEL, 'LABEL')
           addChild(e.name.makeBASTforID(e))
           ] )
       //if there are parameters
       if (e.formals !==null)    
	     addChild(newBAST(e) =>  [  
  	       myText = 'PARAMETERS'  
           token = new CommonToken(BLESStoASTLexer.PARAMETERS, 'PARAMETERS')
	         addChild(e.formals.toAST)])
       //finally, put the function on    
       addChild(e.functionvalue.toAST) // pfv=AssertionFunctionValue 
       ]
    else if (e.enumer)
	newBAST(e) =>  [  //make ^(ASSERTION_ENUMERATION root
  	   myText = 'ASSERTION_ENUMERATION['+e.name+']'  //ASSERTION_ENUMERATION root
       token = new CommonToken(BLESStoASTLexer.ASSERTION_ENUMERATION, 
          'ASSERTION_ENUMERATION['+e.name+']')
       addChild(  //make LABEL subroot
	     newBAST(e) =>  [  //make ^(LABEL identifier)
  	       myText = 'LABEL'  //LABEL subroot
           token = new CommonToken(BLESStoASTLexer.LABEL, 'LABEL')
           addChild(e.name.makeBASTforID(e))
           ] )
       //there is one parameter
       addChild(newBAST(e) =>  [  //make ^(PARAMETERS lv+)
  	       myText = 'PARAMETERS'  //LABEL subroot
           token = new CommonToken(BLESStoASTLexer.PARAMETERS, 'PARAMETERS')
           addChild(e.assertionvariable.makeBASTforID(e))    //add child to PARAMETERS node     
           ] )
       //finally, put the AssertionEnumeration on    
       addChild(e.enumeration.toAST) // ae=AssertionEnumeration 
       ]	
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of NamedAssertion

//| NamedFunction
//mapped onto assertion_body
//  def dispatch BAST
//toAST(NamedFunction e)
//  {
//	newBAST(e) =>  [  //make ^(ASSERTION_FUNCTION root
//  	   myText = 'ASSERTION_FUNCTION['+e.nam+']'  
// // 	   myText = 'ASSERTION_FUNCTION['+e.name+']'  
//       token = new CommonToken(BLESStoASTLexer.ASSERTION_FUNCTION, 
//          'ASSERTION_FUNCTION['+e.nam+']')
////       token = new CommonToken(BLESStoASTLexer.ASSERTION_FUNCTION, 
////          'ASSERTION_FUNCTION['+e.name+']')
//       addChild(  //make LABEL subroot
//	     newBAST(e) =>  [  //make ^(LABEL identifier)
//  	       myText = 'LABEL'  //LABEL subroot
//           token = new CommonToken(BLESStoASTLexer.LABEL, 'LABEL')
//           addChild(e.nam.makeBASTforID(e))
////           addChild(e.name.makeBASTforID(e))
//           ] )
//       //if there are parameters
//       if (e.formals !==null)    
//	     addChild(newBAST(e) =>  [  
//  	       myText = 'PARAMETERS'  
//           token = new CommonToken(BLESStoASTLexer.PARAMETERS, 'PARAMETERS')
//	         addChild(e.formals.toAST)])
//       //finally, put the function on    
//       addChild(e.functionvalue.toAST) // pfv=AssertionFunctionValue 
//       ]	
//  }  //end of NamedFunction

//| NamedEnumeration
//mapped onto assertion_body
//  def dispatch BAST
//toAST(NamedEnumeration e)
//  {
//	newBAST(e) =>  [  //make ^(ASSERTION_FUNCTION root
//  	   myText = 'ASSERTION_ENUMERATION['+e.nam+']'  //ASSERTION_ENUMERATION root
//       token = new CommonToken(BLESStoASTLexer.ASSERTION_ENUMERATION, 
//          'ASSERTION_ENUMERATION['+e.nam+']')
////  	   myText = 'ASSERTION_ENUMERATION['+e.name+']'  //ASSERTION_ENUMERATION root
////       token = new CommonToken(BLESStoASTLexer.ASSERTION_ENUMERATION, 
////          'ASSERTION_ENUMERATION['+e.name+']')
//       addChild(  //make LABEL subroot
//	     newBAST(e) =>  [  //make ^(LABEL identifier)
//  	       myText = 'LABEL'  //LABEL subroot
//           token = new CommonToken(BLESStoASTLexer.LABEL, 'LABEL')
//           addChild(e.nam.makeBASTforID(e))
////           addChild(e.name.makeBASTforID(e))
//           ] )
//       //there is one parameter
//       addChild(newBAST(e) =>  [  //make ^(PARAMETERS lv+)
//  	       myText = 'PARAMETERS'  //LABEL subroot
//           token = new CommonToken(BLESStoASTLexer.PARAMETERS, 'PARAMETERS')
//           addChild(e.assertionvariable.makeBASTforID(e))    //add child to PARAMETERS node     
//           ] )
//       //finally, put the AssertionEnumeration on    
//       addChild(e.enumeration.toAST) // ae=AssertionEnumeration 
//       ]	
//  }  //end of NamedEnumeration


//| LogicVariable
//  def dispatch BAST
//toAST(LogicVariable e)
//  {
//  	e.id.makeBASTforID(e)
//  }  //end of LogicVariable

////////////////////////////  Action  //////////////////////////////////

// from SubBLESS.xtext  Element returns aadl2::Element:

//	ActionAnnexSubclause
//maps to subprogram_behavior :
//  ANNEX_START?
//  //no_proof="DO_NOT_PROVE"?
////  av=availability?  
//  ac=assert_clause?
//  ( pr=LITERAL_pre p1=assertion )?
//  ( po=LITERAL_post p2=assertion )?
//  elq=existential_lattice_quantification
//  ANNEX_END?
//  //  ->{no_proof!==null}? ^( SUBPROGRAM_ANNEX )
//    -> {pr==null & po==null}? ^(SUBPROGRAM_ANNEX $ac? $elq)
//    -> {pr!==null & po==null}? ^(SUBPROGRAM_ANNEX $ac? ^($pr $p1)  $elq)
//    -> {pr==null & po!==null}? ^(SUBPROGRAM_ANNEX $ac? ^($po $p2) $elq)
//    -> ^(SUBPROGRAM_ANNEX $ac? ^($pr $p1) ^($po $p2) $elq)
  def dispatch BAST
toAST(ActionSubclause e)
  {
   try {  
  newBAST(e) =>  [  
  	myText = 'SUBPROGRAM_ANNEX'  //SUBPROGRAM_ANNEX subroot
    token = new CommonToken(BLESStoASTLexer.SUBPROGRAM_ANNEX, 'SUBPROGRAM_ANNEX')
    addChild(e.assert_clause?.toAST)
    if (e.precondition!==null) //have a precondition?
      addChild(   //make LITERAL_pre
        newBAST(e) =>  
       [  //make LITERAL_pre
  	   myText = 'pre'  
       token = new CommonToken(BLESStoASTLexer.LITERAL_pre, 'pre')
       addChild(e.precondition.toAST) //put on precondition
       ]	 )
    if (e.postcondition!==null) //have a precondition?
      addChild(   //make LITERAL_post
        newBAST(e) =>  
       [  //make LITERAL_post
  	   myText = 'post'  
       token = new CommonToken(BLESStoASTLexer.LITERAL_post, 'post')
       addChild(e.postcondition.toAST) //put on precondition
       ]	 )
    if (e.invariant!==null) //have a invariant?
      addChild(   //make LITERAL_invariant
        newBAST(e) =>  
       [  //make LITERAL_invariant
  	   myText = 'post'  
       token = new CommonToken(BLESStoASTLexer.LITERAL_invariant, 'invariant')
       addChild(e.invariant.toAST) //put on invariant
       ]	 )
    addChild(e.elq.toAST)  // elq=ExistentialLatticeQuantification
    if (e.no_proof)
      addChild(newBAST(e) =>  
      [  
  	  myText = "DO_NOT_PROVE"
      token = new CommonToken(BLESStoASTLexer.DO_NOT_PROVE, "DO_NOT_PROVE")
      ] )    
    ]  
     } catch (Exception ex) {ex.printStackTrace x}
  }  //end of ActionAnnexSubclause

//	| Action
  def dispatch BAST
toAST(Action e)
  {
   try {  
  if (e.basic!==null)	
    e.basic.toAST 
  else if (e.if_fi!==null)	
    e.if_fi.toAST 
  else if (e.wl!==null)	
    e.wl.toAST 
  else if (e.fl!==null)	
    e.fl.toAST 
  else if (e.du!==null)	
    e.du.toAST 
  else if (e.elq!==null)	
    e.elq.toAST 
  else if (e.ulq!==null)	
    e.ulq.toAST 
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of Action

//	| ActualParameter
  def dispatch BAST
toAST(ActualParameter e)
  {
   try {  
  newBAST(e) =>  
     [  
  	 myText = "PARAMETER"
     token = new CommonToken(BLESStoASTLexer.PARAMETER, "PARAMETER")
     addChild(e.formal.makeBASTforID(e)) 
     addChild(e.actual.toAST)	
     ]
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of ActualParameter

//	| Alternative
  def dispatch BAST
toAST(Alternative e)
  {
  try {  
  val BLESSAlternative b = e.blessalt
	newBAST(e) =>  
	  [  //make ^( LITERAL_if  
  	myText = 'if'  //make left parenthesis
    token = new CommonToken(BLESStoASTLexer.LITERAL_if, 'if')
    addChild(newBAST(e) =>
    	[
    	myText = ')~>'	
      token = new CommonToken(BLESStoASTLexer.GUARD, ')~>')
      addChild((e.guard as Expression).toAST)
      addChild(b.action.toAST)
    	]  )  
    for (child : b.alternative)  //add  alternative+=GuardedAction
       addChild(child.toAST)  
    ]	
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of Alternative

//	| ArrayRangeList
//array_range_list  : natural_range ( COMMA^ natural_range ( COMMA! natural_range )* )?  ;
  def dispatch BAST
toAST(ArrayRangeList e)
  {
  try {  
	if (e.comma)	
    newBAST(e) =>  
       [  
  	   myText = ","
       token = new CommonToken(BLESStoASTLexer.COMMA, ",")
       for (child : e.range)  //add  range+=NaturalRange
       addChild(child.toAST) 	
       ]
  else  //just one range
    e.range.head.toAST
    } catch (Exception ex) {ex.printStackTrace x}
  }  //end of ArrayRangeList

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
       token = new CommonToken(BLESStoASTLexer.DOTDOT, "..")
       addChild(e.lb.makeBASTforANumber(e)) 	
       addChild(e.ub.makeBASTforANumber(e)) 	
       ]
    } catch (Exception ex) {ex.printStackTrace x}
  }
//	| ArrayType
//array_type : LITERAL_array^ LBRACKET! array_range_list RBRACKET! LITERAL_of type ;
  def dispatch BAST
toAST(ArrayType e)
  {
  try {  
	newBAST(e) =>  
       [  
  	   myText = "array"
       token = new CommonToken(BLESStoASTLexer.LITERAL_array, "array")
       addChild(e.array_ranges.toAST) 	//array_ranges=ArrayRangeList
       addChild(newBAST(e) =>  
          [  
  	      myText = "of"
          token = new CommonToken(BLESStoASTLexer.LITERAL_of, "of") ] )
       addChild(e.typ.toAST) 	 //typ=Type
       ]
    } catch (Exception ex) {ex.printStackTrace x}
   }  //end of ArrayType

//	| AssertClause
  def dispatch BAST
toAST(AssertClause e)
  {
  try {  
	newBAST(e) =>  
       [  
  	   myText = "assert"
       token = new CommonToken(BLESStoASTLexer.LITERAL_assert, "assert")
       for (child : e.assertions)  //add  (assertions+=Assertion)+
         {
         val namedAssertion = child.toAST  
         putAssertionIntoMap(child.name,namedAssertion)
         addChild(namedAssertion) 	   
         }
       ]
     } catch (Exception ex) {ex.printStackTrace x}
   }  //end of AssertClause

//	| AssertedAction
//asserted_action :
//  pre=assertion?  //precondition
//  s=action
//  post=assertion? //postcondition
//    -> 
//    ^( ACTION[$s.tree.getToken(),"ACTION["+Integer.toString($s.tree.getLine()+startingLine)+"]"]       
//        ^( P["P"] $pre? ) 
//        ^( S[$s.tree.getToken(),"S["+Integer.toString($s.tree.getLine()+startingLine)+"]"] $s ) 
//        ^( Q["Q"] $post? )  ) ;  
  def dispatch BAST
toAST(AssertedAction e)
  {
  try {  
	newBAST(e) =>  
       [  //make ^( ACTION
  	   myText = "ACTION"
       token = new CommonToken(BLESStoASTLexer.ACTION, "ACTION")
       //^( P["P"] $pre? )
       addChild(newBAST(e) =>  
         [  
  	     myText = "P"
         token = new CommonToken(BLESStoASTLexer.P, "P")
         addChild(e.precondition?.toAST)
         ] ) 	
       //^( S["S"] s? )
       addChild(newBAST(e) =>  
         [  
  	     myText = "S"
         token = new CommonToken(BLESStoASTLexer.S, "S")
         addChild(e.action.toAST)
         ] ) 	
       //^( Q["Q"] $post? )
       addChild(newBAST(e) =>  
         [  
  	     myText = "Q"
         token = new CommonToken(BLESStoASTLexer.Q, "Q")
         addChild(e.postcondition?.toAST)
         ] ) 	
       ]
     } catch (Exception ex) {ex.printStackTrace x}
   }  //end of AssertedAction

//	| Assignment
//assignment  : nt=name_tick a=ASSIGN eort=expression_or_record_term -> ^($a $nt $eort)
  def dispatch BAST
toAST(Assignment e)
  {
  try {  
	newBAST(e) =>  
       [  
  	   myText = ":="
       token = new CommonToken(BLESStoASTLexer.ASSIGN, ":=")
       addChild(e.lhs.toAST) 	
       addChild(e.rhs.toAST) 	
       ]
     } catch (Exception ex) {ex.printStackTrace x}
   }  //end of Assignment

//	| Availability
//availability  : LITERAL_availability^  availability_subexpression
//  def dispatch BAST
//toAST(Availability e)
//  {
//	newBAST(e) =>  
//       [  
//  	   myText = "availability"
//       token = new CommonToken(BLESStoASTLexer.LITERAL_availability, "availability")
//       addChild(e.sub_expression.toAST) 	
//       ]
//   }  //end of Availability
// 
//	| AvailabilityExpression
//availability_expression : 
//  ae+=availability_subexpression
//  (
//    ( dna=LITERAL_and ae+=availability_subexpression )+
//    |
//    ( ro=LITERAL_or ae+=availability_subexpression )+
//    |
//    ( rox=LITERAL_xor ae+=availability_subexpression )+    
//  )?
//    -> {dna!==null}? ^($dna $ae+)
//    -> {ro!==null}? ^($ro $ae+)
//    -> {rox!==null}? ^($rox $ae+)
//    -> $ae ;
//  def dispatch BAST
//toAST(AvailabilityExpression e)
//  {
//  if (e.and)	
//    newBAST(e) =>  
//       [  
//  	   myText = "and"
//       token = new CommonToken(BLESStoASTLexer.LITERAL_and, "and")
//       for (child : e.subexpressions)
//         addChild(child.toAST)
//       ]
//  if (e.or)	
//    newBAST(e) =>  
//       [  
//  	   myText = "or"
//       token = new CommonToken(BLESStoASTLexer.LITERAL_or, "or")
//       for (child : e.subexpressions)
//         addChild(child.toAST)
//       ]
//  if (e.xor)	
//    newBAST(e) =>  
//       [  
//  	   myText = "xor"
//       token = new CommonToken(BLESStoASTLexer.LITERAL_xor, "xor")
//       for (child : e.subexpressions)
//         addChild(child.toAST)
//       ]
//  else
//    e.subexpressions.head.toAST
//  }  //end of AvailabilityExpression


//	| AvailabilitySubexpression
//availability_subexpression   :
//  ( n=LITERAL_not )?
//  ( 
//  id=/*product_line_engieering_*/identifier
//  |
//  l=LPAREN ae=availability_expression RPAREN
//  )
//    -> {n!==null&&id!==null}? ^($n $id)
//    -> {n!==null&&ae!==null}? ^($n ^($l $ae) )
//    -> {ae!==null}? ^($l $ae)
//    -> $id ; 
//  def dispatch BAST
//toAST(AvailabilitySubexpression e)
//  {
//  if (e.not)	
//    newBAST(e) =>  
//       [  
//  	   myText = "not"
//       token = new CommonToken(BLESStoASTLexer.LITERAL_not, "not")
//       if (e.ple!==null)
//         addChild(e.ple.makeBASTforID(e))    //either ple=ID
//       else if (e.availability!==null)
//       	 addChild(e.availability.toAST)   //or availability=AvailabilityExpression
//       ]
//  }  //end of AvailabilitySubexpression

  def dispatch BAST
toAST(BAAlternative e)
  {
    newBAST(e) =>  
       [  
       myText = "skip"
       token = new CommonToken(BLESStoASTLexer.LITERAL_skip, "skip")
       ]    
  }


//	| BasicAction
//basic_action :
//  LITERAL_skip
//  | assignment
//////MUST CHECK THAT IN Action NONE OF THE FOLLOWING ARE USED///////
//  | communication_action 
//  | timed_action
//  | LITERAL_setmode /*mode_*/identifier
//  | when_throw
//  | combinable_operation
//  | simultaneous_assignment  ; 
  def dispatch BAST
toAST(BasicAction e)
  {
  try {  
  if (e.skip !== null)	
    newBAST(e) =>  
       [  
  	   myText = "skip"
       token = new CommonToken(BLESStoASTLexer.LITERAL_skip, "skip")
       ]
   else if (e.assign!==null)
     e.assign.toAST    
   else if (e.when!==null)
     e.when.toAST    
   else if (e.comb!==null)
     e.comb.toAST    
   else if (e.communication!==null)
     e.communication.toAST    
   else if (e.computation!==null)
     e.computation.toAST    
   else if (e.multi_assign!==null)
     e.multi_assign.toAST    
   else if (e.exc!==null)
     e.exc.toAST    
     } catch (Exception ex) {ex.printStackTrace x}
  }  //end of BasicAction


//	| BehaviorActions
//behavior_actions  : 
//  aa=asserted_action
//    (
//    ( c=SEMICOLON as+=asserted_action ( SEMICOLON as+=asserted_action )* )
//    |
//    ( amp=AMPERSAND ac+=asserted_action ( AMPERSAND ac+=asserted_action )* )
//    )?
//    -> {c!==null}? ^( $c $aa $as+ )
//    -> {amp!==null}? ^( $amp $aa $ac+ )
//    -> $aa
  def dispatch BAST
toAST(BehaviorActions e)
  {
  try {  
  if (e.semi)	 //sequential composition
    newBAST(e) =>  
       [  
  	   myText = ";"
       token = new CommonToken(BLESStoASTLexer.SEMICOLON, ";")
       for (child : e.action)
         addChild(child.toAST)
       ]
  else if (e.amp)	//concurrent composition
    newBAST(e) =>  
       [  
  	   myText = "&"
       token = new CommonToken(BLESStoASTLexer.AMPERSAND, "&")
       for (child : e.action)
         addChild(child.toAST)
       ]
  else  //just a single action
    e.action.head.toAST
     } catch (Exception ex) {ex.printStackTrace x}
  }  //end of BehaviorActions

//	| BehaviorTime
//behavior_time :
//  duration=expression /*unit_*/u=time_unit
//    -> ^( BEHAVIOR_TIME["BEHAVIOR_TIME"] $duration $u )
  def dispatch BAST
toAST(BehaviorTime e)
  {
  try {  
	newBAST(e) =>  
       [  
  	   myText = "BEHAVIOR_TIME"
       token = new CommonToken(BLESStoASTLexer.BEHAVIOR_TIME, "BEHAVIOR_TIME")
       if (e.quantity !== null)
         addChild(e.quantity.toAST) 
       else if (e.value !== null)	
         addChild(e.value.toAST) 
       else if (e.duration !== null)
         addChild(e.duration.toAST)        
//       addChild('sec'.makeBASTforTimeUnit(e)) 	time_unit is optional
       ]
      } catch (Exception ex) {ex.printStackTrace x}
   }  //end of BehaviorTime


//	| BehaviorVariable
//behavior_variable :
//  dec=declarators c=COLON 
//  ( p=LITERAL_nonvolatile | s=LITERAL_shared | con=LITERAL_constant | sp=LITERAL_spread )? 
//  t=type ( agn=ASSIGN e=expression )? 
//  ass=assertion?  //added August 2010 for DDD.aadl
//  semi=SEMICOLON
//    -> {e!==null}? ^($c $dec ^(TYPE["TYPE"] $t) ^( $agn $e ) $ass? $p? $s? $con? $sp? $semi)
//    -> ^($c $dec ^(TYPE["TYPE"] $t) $ass? $p? $s? $con? $sp? $semi)
//  def dispatch BAST
//toAST(BehaviorVariable e)
//  {
//	newBAST(e) =>  
//       [  //COLON is root
//  	   myText = ":"
//       token = new CommonToken(BLESStoASTLexer.COLON, ":")
//       if (e.comma)
//         addChild(newBAST(e) =>  
//         [  
//  	     myText = ","
//         token = new CommonToken(BLESStoASTLexer.COMMA, ",")
//         for (v : e.variable_names)
//           addChild(v.toAST) 	//may have multiple variable labels in single declaration 
//         ] )
//       else  //only one, so no comma, but the for loop should have only one name
//         for (v : e.variable_names)
//           addChild(v.toAST) 	 
//       //types follow next
//       addChild( newBAST(e) =>  
//         [  
//  	     myText = "TYPE"
//         token = new CommonToken(BLESStoASTLexer.TYPE, "TYPE")
//         addChild(e.type.toAST) 	
//         ] ) 	
//       //then the initialization :=e, if any
//       if (e.assign)
//       addChild( newBAST(e) =>  
//         [  
//  	     myText = ":="
//         token = new CommonToken(BLESStoASTLexer.ASSIGN, ":=")
//         addChild(e.expression.toAST) 	
//         ] ) 
//       //then the Assertion, if any
//       if (e.assertion!==null)
//         addChild(e.assertion.toAST)	
//       //then any of the flags
//       if (e.nonvolitile)
//       addChild( newBAST(e) =>  
//         [  
//  	     myText = "nonvolatile"
//         token = new CommonToken(BLESStoASTLexer.LITERAL_nonvolatile, "nonvolatile")
//         ] ) 
//       if (e.shared)
//       addChild( newBAST(e) =>  
//         [  
//  	     myText = "shared"
//         token = new CommonToken(BLESStoASTLexer.LITERAL_shared, "shared")
//         ] ) 
//       if (e.constant)
//       addChild( newBAST(e) =>  
//         [  
//  	     myText = "constant"
//         token = new CommonToken(BLESStoASTLexer.LITERAL_constant, "constant")
//         ] ) 
//       if (e.spread)
//       addChild( newBAST(e) =>  
//         [  
//  	     myText = "spread"
//         token = new CommonToken(BLESStoASTLexer.LITERAL_spread, "spread")
//         ] ) 
//       //finally, always include the semicolon!
//       addChild( newBAST(e) =>  
//         [  
//  	     myText = ";"
//         token = new CommonToken(BLESStoASTLexer.SEMICOLON, ";")
//         ] )  
//       ]
//   }  //end of BehaviorVariable


// CaseChoice
  def dispatch BAST
toAST(CaseChoice e)
  {
  try {  
	newBAST(e) =>  
       [  //IMP as root
       myText = "->"
       token =  new CommonToken(BLESStoASTLexer.IMP, "->")
       addChild((e.be as Expression).toAST)
       addChild(e.exp.toAST)
       ]
      } catch (Exception ex) {ex.printStackTrace x}
	}  //end of CaseChoice
	
// CaseExpression
  def dispatch BAST
toAST(CaseExpression e)
  {
  try {  
	newBAST(e) =>  
       [  
  	   myText = "CASE_EXPRESSION"
       token = new CommonToken(BLESStoASTLexer.CASE_EXPRESSION, "CASE_EXPRESSION")
       for (child : e.cc)
         addChild(child.toAST) 	
       ]
      } catch (Exception ex) {ex.printStackTrace x}
   }  //end of CaseExpression

//	| CatchClause
//catch_clause : LITERAL_catch^ catch_clause_term+ ;
  def dispatch BAST
toAST(CatchClause e)
  {
  try {  
	newBAST(e) =>  
       [  
  	   myText = "catch"
       token = new CommonToken(BLESStoASTLexer.LITERAL_catch, "catch")
       for (child : e.catches)
         addChild(child.toAST) 	
       ]
      } catch (Exception ex) {ex.printStackTrace x}
   }  //end of CatchClause


//	| CatchClauseTerm
//catch_clause_term :  
//  LPAREN ( ei+=/*exception_*/identifier+ | a=LITERAL_all ) c=COLON ba=basic_action RPAREN
//    -> {a!==null}? ^($c $a $ba)
//    -> ^($c $ei+ $ba)
  def dispatch BAST
toAST(CatchClauseTerm e)
  {
  try {  
	newBAST(e) =>  
       [  //COLON as root
  	   myText = ":"
       token = new CommonToken(BLESStoASTLexer.COLON, ":")
       if (e.all)
         addChild(newBAST(e) =>  
           [  //
  	       myText = "all"
           token = new CommonToken(BLESStoASTLexer.LITERAL_all, "all")
           ] )
       else //it has exception IDs
         for (child : e.exceptions)
           addChild(child.name.makeBASTforID(e)) 
       //finally the action
       addChild(e.action.toAST)
       ]
      } catch (Exception ex) {ex.printStackTrace x}
   }  //end of CatchClauseTerm
  
//	| CombinableOperation
  def dispatch BAST
toAST(CombinableOperation e)
  {
  try {  
  if (e.f_add)	 //fetch-add
    newBAST(e) =>  
       [  
  	   myText = "fetchadd"
       token = new CommonToken(BLESStoASTLexer.LITERAL_fetchadd, "fetchadd")
       addChild(e.target.name.makeBASTforID(e))
       addChild(e.arithmetic.toAST)
       addChild(e.result.name.makeBASTforID(e))
       ]
  else if (e.f_or)	 //fetch-or
    newBAST(e) =>  
       [  
  	   myText = "fetchor"
       token = new CommonToken(BLESStoASTLexer.LITERAL_fetchor, "fetchor")
       addChild(e.target.name.makeBASTforID(e))
       addChild(e.bool.toAST)
       addChild(e.result.name.makeBASTforID(e))
       ]
  else if (e.f_xor)	 //fetch-xor
    newBAST(e) =>  
       [  
  	   myText = "fetchxor"
       token = new CommonToken(BLESStoASTLexer.LITERAL_fetchxor, "fetchxor")
       addChild(e.target.name.makeBASTforID(e))
       addChild(e.bool.toAST)
       addChild(e.result.name.makeBASTforID(e))
       ]
  else if (e.f_and)	 //fetch-add
    newBAST(e) =>  
       [  
  	   myText = "fetchand"
       token = new CommonToken(BLESStoASTLexer.LITERAL_fetchand, "fetchand")
       addChild(e.target.name.makeBASTforID(e))
       addChild(e.bool.toAST)
       addChild(e.result.name.makeBASTforID(e))
       ]
  else if (e.sw)	 //fetch-add
    newBAST(e) =>  
       [  
  	   myText = "swap"
       token = new CommonToken(BLESStoASTLexer.LITERAL_swap, "swap")
       addChild(e.target.name.makeBASTforID(e))
       addChild(e.reference.name.makeBASTforID(e))
       addChild(e.result.name.makeBASTforID(e))
       ]
      } catch (Exception ex) {ex.printStackTrace x}
  }  //end of CombinableOperation

//	| CommunicationAction
  def dispatch BAST
toAST(CommunicationAction e)
  {
  try {  
  if (e.pc!==null)	
    e.pc.toAST 
  else if (e.po!==null)	
    e.po.toAST 
  else if (e.pi!==null)	
    e.pi.toAST 
  // freeze action  port>> ignored  
//  else if (e.pause!==null)
//    newBAST(e) =>  
//       [  
//  	   myText = "pause"
//       token = new CommonToken(BLESStoASTLexer.LITERAL_pause, "pause")      
//       ]    
      } catch (Exception ex) {ex.printStackTrace x}
  }  //end of CommunicationAction


//  def dispatch BAST
//toAST(ComplexLiteral e)
//  {
//  newBAST(e) =>  
//    [  
//  	myText = "COMPLEX"
//    token = new CommonToken(BLESStoASTLexer.COMPLEX, "COMPLEX")
//    if (e.up)
//      addChild(newBAST(e) =>  
//        [  
//  	    myText = "-"
//        token = new CommonToken(BLESStoASTLexer.UNARY_MINUS, "-")
//      	addChild(e.real.makeBASTforREAL_LIT(e))
//      	])
//    else
//      addChild(e.real.makeBASTforREAL_LIT(e))
//    if (e.down)
//      addChild(newBAST(e) =>  
//        [  
//  	    myText = "-"
//        token = new CommonToken(BLESStoASTLexer.UNARY_MINUS, "-")
//      	addChild(e.imaginary.makeBASTforREAL_LIT(e))
//      	])
//    else
//      addChild(e.imaginary.makeBASTforREAL_LIT(e))
//    ]
//  }  //end of ComplexLiteral

  def dispatch BAST
toAST(Computation e)
  {
  try {  
  newBAST(e) =>  
    [  
  	myText = "computation"
    token = new CommonToken(BLESStoASTLexer.LITERAL_computation, "computation")
    addChild(e.lb.toAST)
    if (e.ub!==null)
      addChild(e.ub.toAST)
    ]
      } catch (Exception ex) {ex.printStackTrace x}    
  }

//	| Declarators
//  def dispatch BAST
//toAST(Declarators e)
//  {
//	if (e.comma)	
//    newBAST(e) =>  
//       [  
//  	   myText = ","
//       token = new CommonToken(BLESStoASTLexer.COMMA, ",")
//       for (child : e.behavior_variable)  
//         addChild(child.toAST) 	
//       ]
//  else  //just one variable
//    e.behavior_variable.head.toAST
// }  //end of Declarators

//	| DoUntilLoop
  def dispatch BAST
toAST(DoUntilLoop e)
  {
  try {  
	newBAST(e) =>  
       [  //'do' as root
  	   myText = "do"
       token = new CommonToken(BLESStoASTLexer.LITERAL_do, "do")
       //'until is first child
       addChild(newBAST(e) =>  
           [  //
  	       myText = "until"
           token = new CommonToken(BLESStoASTLexer.LITERAL_until, "until")
           addChild((e.guard as Expression).toAST)
           ] )
       //have invariant?
       if (e.invariant)  
         addChild(newBAST(e) =>  
           [  //
  	       myText = "invariant"
           token = new CommonToken(BLESStoASTLexer.LITERAL_invariant, "invariant")
           addChild(e.inv.toAST)
           ] )
       //have bound function?    
       if (e.bound)  
         addChild(newBAST(e) =>  
           [  //
  	       myText = "bound"
           token = new CommonToken(BLESStoASTLexer.LITERAL_bound, "bound")
           addChild(e.bnd.toAST)
           ] )
       //finally, actions to do    
       addChild(e.actions.toAST)
       ]
      } catch (Exception ex) {ex.printStackTrace x}    
   }  //end of DoUntilLoop

//	| EnumerationLiteral
//  def dispatch BAST
//toAST(EnumerationLiteral e)
//  {
//  try {  
//  	e.name.makeBASTforID(e)
//      } catch (Exception ex) {ex.printStackTrace x}    
//  }  //end of EnumerationLiteral
  
//	| EnumerationType
//enumeration_type :  LITERAL_enumeration^ LPAREN! /*defining_enumeration_literal_*/ identifier (COMMA! identifier)* RPAREN!
  def dispatch BAST
toAST(EnumerationType e)
  {
  try {  
    newBAST(e) =>  
       [  
  	   myText = "enumeration"
       token = new CommonToken(BLESStoASTLexer.LITERAL_enumeration, "enumeration")
       for (child : e.defining_enumeration_literal)  
         addChild(child.makeBASTforID(e)) 	
       ]
      } catch (Exception ex) {ex.printStackTrace x}    
  }  //end of EnumerationType

// '<' id=ID '>' = id@now
//  def dispatch BAST
//toAST(Event e)
//  {
//    newBAST(e) =>  
//       [  
//  	   myText = "@"
//       token = new CommonToken(BLESStoASTLexer.AT_SIGN, "@")
//       addChild(e.id.makeBASTforID(e))
//       addChild(newBAST(e) =>  
//           [  //
//  	       myText = "now"
//           token = new CommonToken(BLESStoASTLexer.LITERAL_now, "now")
//           ])        
//       ]
// }  //end of Event
 
//EventExpression returns EventExpression:
//	not?='not'? event=Event
//	| events+=EventSubExpression and?='and' events+=EventSubExpression ('and' events+=EventSubExpression)*
//	| events+=EventSubExpression or?='or' events+=EventSubExpression ('or' events+=EventSubExpression)*
//	| happened=Event '-' didnt=Event
//  def dispatch BAST
//toAST(EventExpression e)
//  {
//  if (e.not)	
//    newBAST(e) =>  
//       [  
//  	   myText = "not"
//       token = new CommonToken(BLESStoASTLexer.LITERAL_not, "not")
//       addChild(e.event.toAST)
//       ]
//  else if (e.event!==null)
//    e.event.toAST
//  else if (e.and)
//    newBAST(e) =>  
//       [  
//  	   myText = "and"
//       token = new CommonToken(BLESStoASTLexer.LITERAL_and, "and")
//       for (child : e.events)  
//            addChild(child.toAST)
//       ]
//  else if (e.or)
//    newBAST(e) =>  
//       [  
//  	   myText = "or"
//       token = new CommonToken(BLESStoASTLexer.LITERAL_or, "or")
//       for (child : e.events)  
//            addChild(child.toAST)
//       ]
//  else if (e.happened!==null)  // <a> - <b> = <a> and not <b>
//    newBAST(e) =>  
//       [  
//  	   myText = "and"
//       token = new CommonToken(BLESStoASTLexer.LITERAL_and, "and")
//       addChild(e.happened.toAST)
//       addChild(    newBAST(e) =>  
//         [  
//  	     myText = "not"
//         token = new CommonToken(BLESStoASTLexer.LITERAL_not, "not")
//         addChild(e.didnt.toAST)
//         ])
//       ]
// }  //end of EventExpression

//	'(' parenthesized=EventExpression ')' | event=Event
//  def dispatch BAST
//toAST(EventSubExpression e)
//  {
//  if (e.parenthesized!==null)	
//    e.parenthesized.toAST
//  else if (e.event!==null)	
//    e.event.toAST  	
//  }  //end of EventSubexpression
// 
//  def dispatch BAST
//toAST(EventTrigger e)
//  {
//  if (e.port!==null)	
//    newBAST(e) =>  
//       [  
//  	   myText = "."
//       token = new CommonToken(BLESStoASTLexer.PERIOD, ".")
//       for (s : e.sub)
//         addChild(s.makeBASTforID(e))
//       addChild(e.port.makeBASTforID(e))
//       ]
//  else if (e.tle!==null)	
//    newBAST(e) =>  
//       [  
//  	   myText = "."
//       token = new CommonToken(BLESStoASTLexer.PERIOD, ".")
//       addChild(e.tle.toAST)
//       ]      	
//  }  //end of EventTrigger
 

//	| ExistentialLatticeQuantification
//existential_lattice_quantification : quantified_variables?
//  LCURLY^  behavior_actions RCURLY  catch_clause? ;
  def dispatch BAST
toAST(ExistentialLatticeQuantification e)
  {
  try {  
    newBAST(e) =>  
       [  
  	   myText = "{"
       token = new CommonToken(BLESStoASTLexer.LCURLY, "{")
       if (e.quantified_variables!==null)
         addChild(e.quantified_variables.toAST) 	
       addChild(e.actions.toAST) 	
       addChild(  //add right curly
         newBAST(e) =>  [ myText = '}'  //make right curly
           token = new CommonToken(BLESStoASTLexer.RCURLY, '}') ]  )
       if (e.timeout!==null)
         addChild(  //add right curly
           newBAST(e) =>  [ myText = 'timeout'  //make right curly
             token = new CommonToken(BLESStoASTLexer.LITERAL_timeout, 'timeout')     
             addChild(e.timeout.toAST) ] ) 	        	
       if (e.catch_clause!==null)
         addChild(e.catch_clause.toAST)
         ]
       } catch (Exception ex) {ex.printStackTrace x}    
 }  //end of ExistentialLatticeQuantification

  def dispatch BAST
toAST(ExpressionOrAny e)
  {
  try {  
  e.exp?.toAST ?:
  e.any.makeBASTforID(e)
      } catch (Exception ex) {ex.printStackTrace x}    
  }

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
    e.l.toAST
  else if (e.sym.equals('iff'))
    (newBAST(e) =>
    [
    myText = 'iff'
    token =  new CommonToken(BLESStoASTLexer.LITERAL_iff, 'iff')  
    addChild(e.l.toAST)	
    addChild(e.r.toAST)	
    ]).parenthesize(e)
  else if (e.sym.equals('implies'))
    (newBAST(e) =>
    [
    myText = 'implies'
    token =  new CommonToken(BLESStoASTLexer.LITERAL_implies, 'implies')  
    addChild(e.l.toAST)	
    addChild(e.r.toAST)	
    ]).parenthesize(e)
      } catch (Exception ex) {ex.printStackTrace x}    
  }  //end of Expression

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
    token =  new CommonToken(BLESStoASTLexer.LITERAL_or, 'or')  
    addChild(e.l.toAST) 
    for (rchild : e.r)
      addChild(rchild.toAST)  
    ]).parenthesize(e)
  else if (e.sym.equals('else'))
    (newBAST(e) =>
    [
    myText = 'cor'
    token =  new CommonToken(BLESStoASTLexer.LITERAL_cor, 'cor')  
    addChild(e.l.toAST) 
    for (rchild : e.r)
      addChild(rchild.toAST)  
    ]).parenthesize(e)
  else if (e.sym.equals('xor'))
    (newBAST(e) =>
    [
    myText = 'xor'
    token =  new CommonToken(BLESStoASTLexer.LITERAL_xor, 'xor')  
    addChild(e.l.toAST) 
    for (rchild : e.r)
      addChild(rchild.toAST)  
    ]).parenthesize(e)
      } catch (Exception ex) {ex.printStackTrace x}    
  }  // end of disjunction

//  def dispatch BAST
//toAST(Disjunction e)
//  {
//  try {  
//  if (e.sym === null)
//    e.l.toAST
//  else if (e.sym.equals('or'))
//    newBAST(e) =>
//    [
//    myText = 'or'
//    token =  new CommonToken(BLESStoASTLexer.LITERAL_or, 'or')  
//    addChild(e.l.toAST.parenthesize(e)) 
//    for (rchild : e.r)
//      addChild(rchild.toAST.parenthesize(e))  
//    ]
//  else if (e.sym.equals('else'))
//    newBAST(e) =>
//    [
//    myText = 'cor'
//    token =  new CommonToken(BLESStoASTLexer.LITERAL_cor, 'cor')  
//    addChild(e.l.toAST.parenthesize(e)) 
//    for (rchild : e.r)
//      addChild(rchild.toAST.parenthesize(e))  
//    ]
//  else if (e.sym.equals('xor'))
//    newBAST(e) =>
//    [
//    myText = 'xor'
//    token =  new CommonToken(BLESStoASTLexer.LITERAL_xor, 'xor')  
//    addChild(e.l.toAST.parenthesize(e)) 
//    for (rchild : e.r)
//      addChild(rchild.toAST.parenthesize(e))  
//    ]
//      } catch (Exception ex) {ex.printStackTrace x}    
//  }  // end of disjunction
  
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
    token =  new CommonToken(BLESStoASTLexer.LITERAL_and, 'and')  
    addChild(e.l.toAST)	
    for (rchild : e.r)
      addChild(rchild.toAST)	
    ]).parenthesize(e)    
  else if (e.sym.equals('then'))
    (newBAST(e) =>
    [
    myText = 'cand'
    token =  new CommonToken(BLESStoASTLexer.LITERAL_cand, 'cand')  
    addChild(e.l.toAST)	
    for (rchild : e.r)
      addChild(rchild.toAST)	
    ]).parenthesize(e)    
      } catch (Exception ex) {ex.printStackTrace x}    
  }
  
 
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
    token =  new CommonToken(BLESStoASTLexer.PLUS, '+')  
    addChild(e.l.toAST)	
    for (rchild : e.r)
      addChild(rchild.toAST)	
    ]).parenthesize(e)    
  else if (e.sym.equals('-'))  	
    (newBAST(e) =>
    [
    myText = '-'
    token =  new CommonToken(BLESStoASTLexer.MINUS, '-')  
    addChild(e.l.toAST)	
    addChild(e.r.head.toAST)	
    ]).parenthesize(e)    
      } catch (Exception ex) {ex.printStackTrace x}    
  }  // end of AddSub
  
   def dispatch BAST
toAST(MultDiv e)
  {
  try {  
  if (e.sym === null)
    e.l.toAST
  else if (e.sym.equals('/') || e.sym.equals('div')) //there is no 'div' inBLESStoAST.g 	
    (newBAST(e) =>
    [
    myText = '/'
    token =  new CommonToken(BLESStoASTLexer.DIVIDE, '/')  
    addChild(e.l.toAST)	
    addChild(e.r.head.toAST)	
    ]).parenthesize(e)    
  else if (e.sym.equals('mod'))  	
    (newBAST(e) =>
    [  
    myText = 'mod'
    token =  new CommonToken(BLESStoASTLexer.LITERAL_mod, 'mod')  
    addChild(e.l.toAST)	
    addChild(e.r.head.toAST)	
    ]).parenthesize(e)    
  else if (e.sym.equals('rem'))  	
    (newBAST(e) =>
    [
    myText = 'rem'
    token =  new CommonToken(BLESStoASTLexer.LITERAL_rem, 'rem')  
    addChild(e.l.toAST)	
    addChild(e.r.head.toAST)	
    ]).parenthesize(e)    
  else if (e.sym.equals('*'))  	
    (newBAST(e) =>
    [
    myText = '*'
    token =  new CommonToken(BLESStoASTLexer.TIMES, '*')  
    addChild(e.l.toAST)	
    for (rchild : e.r)
      addChild(rchild.toAST)	
    ]).parenthesize(e)      	
      } catch (Exception ex) {ex.printStackTrace x}    
  }  // end of MultDiv
  
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
    token =  new CommonToken(BLESStoASTLexer.EXP, '**')  
    addChild(e.l.toAST)	
    addChild(e.r.toAST)	
    ]).parenthesize(e)    
      } catch (Exception ex) {ex.printStackTrace x}      	
  }  // end of Exp
  
 
//	| ExpressionOrRecordTerm
//  def dispatch BAST
//toAST(ExpressionOrRecordTerm e)
//  {
//  if (e.exp!==null)	
//    e.exp.toAST 
//  else if (e.record!==null)
//    e.record.toAST  
//  else if (e.any!==null)
//    newBAST(e) => [
//          token = new CommonToken(BLESStoASTLexer.LITERAL_any, 'any')
//          myText = 'any']  
//  }  //end of ExpressionOrRecordTerm

//	| ExpressionOrRelation
//  def dispatch BAST
//toAST(ExpressionOrRelation e)
//  {
////  if (e.rt!==null)	
////    e.rt.toAST 	//record term?
////  else 
//  if (e.r!==null)  //have relation symbol?
//    e.r.makeBASTforRelationSymbol(e) =>
//       [  //add multiple terms to relation symbol
//       for (child : e.sub)  
//         addChild(child.toAST) 
//       ] 
//  else      //otherwise
//    e.exp.toAST  	//just an expression
//  }  //end of ExpressionOrRelation

//	| ForLoop
  def dispatch BAST
toAST(ForLoop e)
  {
  try {  
    newBAST(e) =>  
       [  
  	   myText = "for"
       token = new CommonToken(BLESStoASTLexer.LITERAL_for, "for")
       addChild(e.count.name.makeBASTforID(e)) 	
//       addChild(e.count.toAST) 	
       addChild( newBAST(e) =>  
         [  
  	     myText = "in"
         token = new CommonToken(BLESStoASTLexer.LITERAL_in, "in")
         addChild(e.lower_bound.toAST) 	
         addChild(e.upper_bound.toAST) 	
         ] )
       addChild( newBAST(e) =>  
         [  
  	     myText = "invariant"
         token = new CommonToken(BLESStoASTLexer.LITERAL_invariant, "invariant")
         addChild(e?.inv?.toAST) 	
         ] )
       addChild(e.action.toAST) 	
       ]
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of ForLoop

//	| FormalActual a NamedElement
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
       token = new CommonToken(BLESStoASTLexer.COLON, ":")
       addChild(e.formal.name.makeBASTforID(e))
       if (e.actual.constant !== null)
         addChild(e.actual.constant.toAST)
       else if (e.actual.value !== null)
         addChild(e.actual.value.toAST)
       else if (e.actual.expression !== null)
         addChild(e.actual.expression.toAST)
       ]
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of FormalActual
  
//	| FormalActualList
  def dispatch BAST
toAST(FormalActualList e)
  {
  try {  
	if (e.comma)	
    newBAST(e) =>  
       [  
  	   myText = ","
       token = new CommonToken(BLESStoASTLexer.COMMA, ",")
       for (child : e.variables)  
         addChild(child.toAST) 	
       ]
  else  //just one variable
    e.variables.head.toAST
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of FormalActualList

//	| FormalExpressionPair
//  def dispatch BAST
//toAST(FormalExpressionPair e)
//  {
//  try {  
//  newBAST(e) =>  
//     [  
//  	 myText = "=>"
//       token = new CommonToken(BLESStoASTLexer.ARROW, "=>")
//       addChild( e.formal.makeBASTforID(e)) 	
//       addChild( e.actual.toAST) 	
//       ]
//      } catch (Exception ex) {ex.printStackTrace x}       
//  }  //end of FormalExpressionPair

//	| FunctionCall
//function_call : 
//  ( /*package_*/p+=identifier DOUBLE_COLON )*
//  id=/*function_*/identifier lp=LPAREN DOLLAR function_parameters? RPAREN
//  -> {p!==null}? ^(FUNCTION_CALL[$lp,"FUNCTION_CALL"] ^(DOUBLE_COLON $p+) $id function_parameters? )
//  -> ^(FUNCTION_CALL[$lp,"FUNCTION_CALL"] $id function_parameters? )
//  ;
//  def dispatch BAST
//toAST(FunctionCall e)
//  {
//  try {  
//  newBAST(e) =>  
//     [  
//  	 myText = "FUNCTION_CALL"  //root is FUNCTION_CALL
//       token = new CommonToken(BLESStoASTLexer.FUNCTION_CALL, "FUNCTION_CALL")
//       addChild(newBAST(e) =>  
//         [  //package ids
//  	     myText = "::"  //root is FUNCTION_CALL
//         token = new CommonToken(BLESStoASTLexer.DOUBLE_COLON, "::")
//         for (child : e.pack)  
//           addChild(child.makeBASTforID(e)) 	        
//         ])
//       addChild(e.func.makeBASTforID(e))  //function id
//       addChild( e.parameters?.toAST) 	//function parameters
//       ]
//      } catch (Exception ex) {ex.printStackTrace x}       
//  }  //end of FunctionCall
 
//	| FunctionParameters
//  def dispatch BAST
//toAST(FunctionParameters e)
//  {
//  try {  
//	if (e.comma)	
//    newBAST(e) =>  
//       [  
//  	   myText = ","
//       token = new CommonToken(BLESStoASTLexer.COMMA, ",")
//       for (child : e.parameters)  
//         addChild(child.toAST) 	
//       ]
//  else  //just one variable
//    e.parameters.head.toAST
//      } catch (Exception ex) {ex.printStackTrace x}       
//  }  //end of FunctionParameters


//	| GuardedAction
//guarded_action :  LPAREN! /*boolean_*/expression_or_relation GUARD^ behavior_actions ;
  def dispatch BAST
toAST(GuardedAction e)
  {
  try {  
  newBAST(e) =>  
     [  
  	 myText = ")~>"  //root is)~>
       token = new CommonToken(BLESStoASTLexer.GUARD, ")~>")
       addChild( (e.guard as Expression).toAST) 
       addChild( e.action.toAST) 	
       ]
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of GuardedAction
 
//	| LatticeVariables
//lattice_variables : i+=identifier (COMMA^ i+=identifier)* -> ^( $coln $ty $i+ )  ;
//  def dispatch BAST
//toAST(LatticeVariables e)
//  {
//  if (e.comma)	
//  newBAST(e) =>  
//     [  
//  	 myText = ","  // : for root
//       token = new CommonToken(BLESStoASTLexer.COMMA, ",")
//       addChild(e.first.makeBASTforID(e))  //last ty=Type
//       for (child : e.lv)  //add lv+=Variable (',' lv+=Variable)*
//         addChild(child.makeBASTforID(e)) 	
// //        addChild(child.toAST) 	
//       ]
//   else
//     e.first.makeBASTforID(e)
//   }  //end of LatticeVariables

//	| NameTick
  def dispatch BAST
toAST(NameTick e)
  {
  try {  
	if (e.tick)	
    newBAST(e) =>  
       [  
  	   myText = "'"
       token = new CommonToken(BLESStoASTLexer.TICK, "'")
       addChild(e.value.toAST) 	
       ]
  else  //just one variable
    e.value.toAST
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of NameTick

//	| NaturalConstant
//  def dispatch BAST
//toAST(NaturalConstant e)
//  {
//  if (e.integer!==null)	
//    e.integer.makeBASTforINT(e)   //test for non-zero
//  else if (e.identifier!==null)
//    e.identifier.makeBASTforID(e) 
//  //nat_prop is considered to be either a String or a Property, the opposite of what's needed!
////  (e.nat_prop as Property).toAST  //.makeBASTforPropertyName(e)
//  }  //end of NaturalConstant
  
//	| NaturalRange
//  def dispatch BAST
//toAST(NaturalRange e)
//  {
//  newBAST(e) =>  
//    [  
//  	myText = ".."
//    token = new CommonToken(BLESStoASTLexer.DOTDOT, "..")
//    addChild(e.lb.toAST) 	//lower bound
//    addChild(e.ub.toAST) 	//upper bound
//    ]
//  }  //end of NaturalRange

//	| NumberRange
//  def dispatch BAST
//toAST(NumberRange e)
//  {
//  e.range.toAST
//  }  //end of NumberRange


  def dispatch BAST
toAST(Quantity e)
  {
  e.number.toAST
  }  // end of quantity

  def dispatch BAST
toAST(QuantityType e)
  {
  try {  
  if (e.whole)  
    newBAST(e) =>  
    [  
  	myText = "integer"
    token = new CommonToken(BLESStoASTLexer.LITERAL_integer, "integer")
//    if (e.unit !== null)  //have units?
//      addChild(newBAST(e) =>  
//        [  
//  	    myText = "units"  //add units
//        token = new CommonToken(BLESStoASTLexer.LITERAL_units, "units")
//        addChild(e.unit.name.makeBASTforID(e))
//        ]	)
    if (e.lb !== null)  //have range?
      addChild(newBAST(e) =>  
        [  
  	    myText = ".."  //add units
        token = new CommonToken(BLESStoASTLexer.DOTDOT, "..")
        addChild(e.lb.makeBASTforANumber(e))
        addChild(e.ub.makeBASTforANumber(e))
        ]	)
    ]  //end of integer
  else if (e.scalar)
    newBAST(e) =>  
    [  
  	myText = "real"
    token = new CommonToken(BLESStoASTLexer.LITERAL_real, "real")
    if (e.lb !== null)  //have range?
      addChild(newBAST(e) =>  
        [  
  	    myText = ".."  //add units
        token = new CommonToken(BLESStoASTLexer.DOTDOT, "..")
        addChild(e.lb.makeBASTforANumber(e))
        addChild(e.ub.makeBASTforANumber(e))
        ]	)
    ]  //end of real
  else if (e.unit !== null && e.unit.name !== null && e.unit.name.equals('s'))
    newBAST(e) =>  
    [  
  	myText = "time"
    token = new CommonToken(BLESStoASTLexer.LITERAL_time, "time")
    ]  //end of time_literal
  else
  newBAST(e) =>  
    [  
  	myText = "real"
    token = new CommonToken(BLESStoASTLexer.LITERAL_real, "real")
    if (e.unit !== null)
      addChild(newBAST(e) =>  
        [  
  	    myText = "units"  //add units
        token = new CommonToken(BLESStoASTLexer.LITERAL_units, "units")
        if (e.unit.name !== null)
          addChild(e.unit.name.makeBASTforID(e))
        ]	)
    if (e.lb !== null)  //have range?
      addChild(newBAST(e) =>  
        [  
  	    myText = ".."  //add units
        token = new CommonToken(BLESStoASTLexer.DOTDOT, "..")
        addChild(e.lb.makeBASTforANumber(e))
        addChild(e.ub.makeBASTforANumber(e))
        ]	)
    ]  
  } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  //end of QuantityType

//  def dispatch BAST
//toAST(NumericConstant e)
//  {  
//  try {  
//    e.quantity?.toAST ?:
//    e.property?.toAST ?:
//    e.propertyConstant.qualifiedName().makeBASTforPropertyName(e)
////     ?:
////  	newBAST(e) =>
////  	  [
////  	  myText = "NumericConstant error"	
////      token = new CommonToken(BLESStoASTLexer.ID, "error")
////      ]
//      } catch (Exception ex) {ex.printStackTrace x}       
//  }  //end of NumericConstant
//   


//	| ParenthesizedSubexpression
  def dispatch BAST
toAST(ParenthesizedSubexpression e)
  {  
  try {  
   if (e.caseexpression !== null)  //is this a conditional expression?
     newBAST(e) =>  
       [  
  	   myText = "CASE_EXPRESSION"
       token = new CommonToken(BLESStoASTLexer.CASE_EXPRESSION, "CASE_EXPRESSION")
       for (c : e.caseexpression.cc)
         addChild(c.toAST) 	
       ]
  else if (e.t !== null)
    newBAST(e) =>  [
  	   myText = 'CONDITIONAL'
       token = new CommonToken(BLESStoASTLexer.CONDITIONAL, 'CONDITIONAL')
       addChild(e.expression.toAST)  //pred = predicate
       addChild(e.t.toAST)  //true choice, t = assertion_expression
       addChild(e.f.toAST)  //false choice f = assertion_expression
      ]	
  //else it's a parenthesized subexpression
  else
    e.expression.toAST.parenthesize(e) 
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of ParenthesizedSubexpression

//	| PortInput
//port_input :   
//    pn2=port_name QUESTION LPAREN n=/*local_variable_ or outgoing_port_ or outgoing_parameter_*/name RPAREN   //input
//     -> ^( PORT_INPUT[$pn2.tree.getToken(),
//      "PORT_INPUT["+Integer.toString($pn2.tree.getLine() //+startingLine
//      )+"]"] $pn2 $n )
  def dispatch BAST
toAST(PortInput e)
  {
  try {  
  newBAST(e) =>  
    [  
  	myText = "PORT_INPUT["+e.port.name+"]"
    token = new CommonToken(BLESStoASTLexer.PORT_INPUT, "PORT_INPUT["+e.port.name+"]")
    addChild(e.port.name.makeBASTforPort(e)) 	//port=PORTNAME //[aadl2::Port|PORTNAME]
    addChild(e.target.toAST) 	//variable=Name
    ]
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of PortInput

//	| PortOutput
  def dispatch BAST
toAST(PortOutput e)
  {
  try {  
  newBAST(e) =>  
    [  
  	myText = "PORT_OUTPUT["+e.port.name+"]"
    token = new CommonToken(BLESStoASTLexer.PORT_OUTPUT, "PORT_OUTPUT["+e.port.name+"]")
    addChild(e.port.name.makeBASTforPort(e)) 	//port=PORTNAME //[aadl2::Port|PORTNAME]
    if (e.eor!==null)
      addChild(e.eor.toAST) 	//( '(' eor=ExpressionOrRelation ')' )?
    ]
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of PortOutput

//	| QuantifiedVariables
  def dispatch BAST
toAST(QuantifiedVariables e)
  {
  try {  
  newBAST(e) =>  
    [  
  	myText = "declare"
    token = new CommonToken(BLESStoASTLexer.LITERAL_declare, "declare")
    for (child : e.variables )
      addChild(child.toAST) 	
    ]
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of QuantifiedVariables


//  def dispatch BAST
//toAST(RationalLiteral e)
//  {
//  newBAST(e) =>  
//    [  
//  	myText = "RATIONAL"
//    token = new CommonToken(BLESStoASTLexer.RATIONAL, "RATIONAL")
//    if (e.up)
//      addChild(newBAST(e) =>  
//        [  
//  	    myText = "-"
//        token = new CommonToken(BLESStoASTLexer.UNARY_MINUS, "-")
//      	addChild(e.dividend.makeBASTforINT(e))
//      	])
//    else
//      addChild(e.dividend.makeBASTforINT(e))
//    if (e.down)
//      addChild(newBAST(e) =>  
//        [  
//  	    myText = "-"
//        token = new CommonToken(BLESStoASTLexer.UNARY_MINUS, "-")
//      	addChild(e.divisor.makeBASTforINT(e))
//      	])
//    else
//      addChild(e.divisor.makeBASTforINT(e))
//    ]
//  }  //end of RationalLiteral

//VariableDeclaration:
//  variable_names+=ID ( comma?=',' variable_names+=ID 
//  	  ( ',' variable_names+=ID)* )?
//  ':' constant?='constant'?  //? was missing causing grammar errors in RateControl.aadl
//  type=Type 
//    ( assign?=':=' expression=Expression )? 
//  assertion=Assertion?  
//  ';'
  def dispatch BAST
toAST(VariableDeclaration e)
  {  //same as BehaviorVariable
  try {  
	newBAST(e) =>  
       [  //COLON is root
  	   myText = ":"
       token = new CommonToken(BLESStoASTLexer.COLON, ":")
       addChild(e.variable.name.makeBASTforID(e)) 	//may have multiple variable labels in single declaration 
//         addChild(v.toAST) 	//may have multiple variable labels in single declaration 
       //types follow next
       addChild( newBAST(e) =>  
         [  
  	     myText = "TYPE"
         token = new CommonToken(BLESStoASTLexer.TYPE, "TYPE")
         addChild(e.variable.tod.toAST) 	
         ] ) 	
       //then the initialization :=e, if any
       if (e.assign)
       addChild( newBAST(e) =>  
         [  
  	     myText = ":="
         token = new CommonToken(BLESStoASTLexer.ASSIGN, ":=")
         addChild(e.expression.toAST) 	
         ] ) 
       //then the Assertion
       addChild(e.assertion?.toAST)	
       //then any of the flags
//  "nonvolatile" "shared" "constant" "spread"  "final"     
       if (e.constant)
         addChild( newBAST(e) =>  
         [  
  	     myText = "constant"
         token = new CommonToken(BLESStoASTLexer.LITERAL_constant, "constant")
         ] ) 
       else if (e.nonvolatile)
         addChild( newBAST(e) =>  
         [  
  	     myText = "nonvolatile"
         token = new CommonToken(BLESStoASTLexer.LITERAL_nonvolatile, "nonvolatile")
         ] ) 
       else if (e.shared)
         addChild( newBAST(e) =>  
         [  
  	     myText = "shared"
         token = new CommonToken(BLESStoASTLexer.LITERAL_shared, "shared")
         ] ) 
       else if (e.spread)
         addChild( newBAST(e) =>  
         [  
  	     myText = "spread"
         token = new CommonToken(BLESStoASTLexer.LITERAL_spread, "spread")
         ] ) 
       else if (e.final)
         addChild( newBAST(e) =>  
         [  
  	     myText = "final"
         token = new CommonToken(BLESStoASTLexer.LITERAL_final, "final")
         ] ) 
       //finally, always include the semicolon!
       addChild( newBAST(e) =>  
         [  
  	     myText = ";"
         token = new CommonToken(BLESStoASTLexer.SEMICOLON, ";")
         ] )  
       ]
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of VariableDeclaration
  
//	| Range
  def dispatch BAST
toAST(Range e)
  {
  try {  
  e.sym.makeBASTforRangeSymbol(e) =>
    [  //add upper and lower bounds to range symbol
    addChild(e.lower_bound.toAST)
    addChild(e.upper_bound.toAST)
    ]   
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of Range

//	| RecordField
  def dispatch BAST
toAST(RecordField e)
  {
  try {  
  newBAST(e) =>  
    [  
  	myText = ":"
    token = new CommonToken(BLESStoASTLexer.COLON, ":")
    addChild(e.label.makeBASTforID(e))
    addChild(e.typ.toAST)
    ]   
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of RecordField

//	| RecordTerm
  def dispatch BAST
toAST(RecordTerm e)
  {
  try {  
  newBAST(e) =>  
    [  //root is LPAREN
  	myText = "("
    token = new CommonToken(BLESStoASTLexer.LPAREN, "(")
    for (child : e.record_value)  //add record_value+=RecordValue+
      addChild(child.toAST)
    addChild(newBAST(e) =>  
      [  //final )
  	  myText = ")"
      token = new CommonToken(BLESStoASTLexer.RPAREN, ")")
      ] )
    ]   
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of RecordTerm

//	| RecordType
  def dispatch BAST
toAST(RecordType e)
  {
  try {  
  newBAST(e) =>  
    [  
  	myText = "record"
    token = new CommonToken(BLESStoASTLexer.LITERAL_record, "record")
    for (child : e.fields)  //add '(' fields+=RecordField+ ')'
      addChild(child.toAST)
    ]   
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of RecordType

//	| RecordValue
  def dispatch BAST
toAST(RecordValue e)
  {
  try {  
  newBAST(e) =>  
    [  
  	myText = "=>"
    token = new CommonToken(BLESStoASTLexer.ARROW, "=>")
    addChild(e.label.makeBASTforID(e))
    addChild(e.aval.toAST)
    ]   
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of RecordValue

//	| SimultaneousAssignment
//simultaneous_assignment  :
//  LPAREN lhs+=name_tick ( left_comma=COMMA lhs+=name_tick )+ 
//  a=ASSIGN rhs+=expression_or_record_term ( right_comma=COMMA rhs+=expression_or_record_term )+ RPAREN
//    -> ^($a ^($left_comma $lhs+ )  ^($right_comma $rhs+ )  ;
  def dispatch BAST
toAST(SimultaneousAssignment e)
  {
  try {  
  newBAST(e) =>  
    [  
  	myText = ":="
    token = new CommonToken(BLESStoASTLexer.ASSIGN, ":=")
    //left_comma
    addChild(newBAST(e) =>  
      [  
  	  myText = ","
      token = new CommonToken(BLESStoASTLexer.COMMA, ",")
      for (left : e.lhs)
        addChild(left.toAST)
      ] )
    //right_comma
    addChild(newBAST(e) =>  
      [  
  	  myText = ","
      token = new CommonToken(BLESStoASTLexer.COMMA, ",")
      for (right : e.rhs)
        addChild(right.toAST)
      ] )
    ]   
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of SimultaneousAssignment

//	| Subexpression
  def dispatch BAST
toAST(Subexpression e)
  {
  try {  
  if (e.unary !== null && !(e.unary.truncate !== null || e.unary.round !== null))  //unary minus?
    newBAST(e) =>  
    [
    if (e.unary.unary_minus !== null)	 
  	  { 
  	  	myText = "-"
  	  	token = new CommonToken(BLESStoASTLexer.UNARY_MINUS, "-")
  	  }
    else if (e.unary.not !== null)	 
  	  { 
  	  	myText = "not"
  	  	token = new CommonToken(BLESStoASTLexer.LITERAL_not, "not")
  	  }
    else if (e.unary.absolute_value !== null)	 
  	  { 
  	  	myText = "abs"
  	  	token = new CommonToken(BLESStoASTLexer.LITERAL_abs, "abs")
  	  }
//DON'T MAKE BAST FOR TURNCATE OR ROUND  	  
//    else if (e.unary.truncate !== null)	 
//  	  { 
//  	  	myText = "truncate"
//  	  	token = new CommonToken(BLESStoASTLexer.DUMMY, "truncate")
//  	  }
//    else if (e.unary.round !== null)	 
//  	  { 
//  	  	myText = "round"
//  	  	token = new CommonToken(BLESStoASTLexer.DUMMY, "round")
//  	  }
  	addChild(e.timed_expression.toAST)  
  	]
  else   
  	e.timed_expression.toAST
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of subexpression
   
   def dispatch BAST
toAST(TimedExpression e)
  {
  try {  
  if (e.tick !== null)
    newBAST(e) =>
      [
      myText = "\'"
      token = new CommonToken(BLESStoASTLexer.TICK, "\'")
      addChild(e.subject.toAST)
      ]
   else if (e.at)
      newBAST(e) =>
      [
      myText = "@"
      token = new CommonToken(BLESStoASTLexer.AT_SIGN, "@")
      addChild(e.subject.toAST)
      addChild(e.time.toAST)
      ]
   else if (e.caret)
      newBAST(e) =>
      [
      myText = "^"
      token = new CommonToken(BLESStoASTLexer.CARET, "^")
      addChild(e.subject.toAST)
      addChild(e.shift.toAST)
      ]
  else
    e.subject.toAST 
      } catch (Exception ex) {ex.printStackTrace x}       
  }	  //end of TimedExpression

   def dispatch BAST
toAST(TimedSubject e)
  {
   try {  
  e.value?.toAST ?:
  e.invocation?.toAST ?:
  e.ps?.toAST ?:
  e.conditional?.toAST ?:
  e.record?.toAST
      } catch (Exception ex) {ex.printStackTrace x}       
  }  // end of TimedSubject

//	| SubprogramCall
//procedure_call :  
//  /*requires_subprogram_*/p=identifier /*no '!'*/ LPAREN spb=formal_actual_list? RPAREN 
//    -> ^( PROCEDURE_CALL[$p.tree.getToken(),
//      "PROCEDURE_CALL["+Integer.toString($p.tree.getLine() //+startingLine
//      )+"]"] $p $spb? ) ;
  def dispatch BAST
toAST(SubprogramCall e)
  {
   try {  
  newBAST(e) =>  
    [  
  	myText = "PROCEDURE_CALL["+e.procedure+"]"
    token = new CommonToken(BLESStoASTLexer.PROCEDURE_CALL, "PROCEDURE_CALL["+e.procedure+"]")
    if (e.procedure instanceof SubprogramAccess)
      addChild((e.procedure as SubprogramAccess).name.makeBASTforID(e))   
    else if (e.procedure instanceof SubprogramSubcomponent)
      addChild((e.procedure as SubprogramSubcomponent).name.makeBASTforID(e)) 
    else
      addChild("NOT_ACCESS_NOR_SUBPROGRAM".makeBASTforID(e))
    addChild(e.parameters?.toAST) 	//( '(' parameters=FormalActualList? ')' )?
    ]
     } catch (Exception ex) {ex.printStackTrace x}       
   }  //end of SubprogramCall
 
//	| TimedAction
//  def dispatch BAST
//toAST(Computation e)
//  {
//  newBAST(e) =>  
//    [  
//  	myText = "computation"
//    token = new CommonToken(BLESStoASTLexer.LITERAL_computation, "computation")
//    addChild(e.lb.toAST) 	
//    addChild(e.ub?.toAST) 	//( ',' ub=BehaviorTime )?
//    ]
//  }  //end of TimedAction

//  def dispatch BAST
//toAST(BooleanType e)
//  {
//    newBAST(e) =>  
//      [  
//  	  myText = "boolean"
//      token = new CommonToken(BLESStoASTLexer.LITERAL_boolean, "boolean")
//      ]
//   }
//
//  def dispatch BAST
//toAST(StringType e)
//  {
//    newBAST(e) =>  
//      [  
//  	  myText = "string"
//      token = new CommonToken(BLESStoASTLexer.LITERAL_string, "string")
//      ]
//   }


//	| Type
//  def dispatch BAST
//toAST(Type e)
//  {
//   //data_component_reference=[aadl2::DataClassifier|DCCR]
//  //may want to link to the subject instead
////  if (e.aadl_data_component_type!==null)
////    e.aadl_data_component_type.qualifiedName().makeBASTforPropertyName(e) 
//  if (e.data_component_reference!==null)
//    {
////    if (e.data_component_reference.hasName())	
//      e.data_component_reference.qualifiedName().makeBASTforPropertyName(e) 
//    
//    }
//  else if (e.bt!==null)
//    newBAST(e) =>  
//      [  
//  	  myText = "boolean"
//      token = new CommonToken(BLESStoASTLexer.LITERAL_boolean, "boolean")
//      ]
//  else if (e.st!==null)
//    newBAST(e) =>  
//      [  
//  	  myText = "string"
//      token = new CommonToken(BLESStoASTLexer.LITERAL_string, "string")
//      ]
//  else if (e.et!==null)
//    e.et.toAST   //et=EnumerationType
//  else if (e.nt!==null)
//    e.nt.toAST   //nt=NumberType
//  else if (e.at!==null)
//    e.at.toAST   //at=ArrayType
//  else if (e.rt!==null)
//    e.rt.toAST   //rt=RecordType
//  else //it must be variant
//    e.vt.toAST     //vt=VariantType     
//  }  //end of Type

//  def dispatch BAST
//toAST(TypeConversion e)
//  {
//  if (e.natural)	
//  newBAST(e) =>  
//    [  
//  	myText = "natural"
//    token = new CommonToken(BLESStoASTLexer.LITERAL_natural, "natural")
//    addChild(e.ps.toAST) 	
//    ]
//  else if (e.integer)	
//  newBAST(e) =>  
//    [  
//  	myText = "integer"
//    token = new CommonToken(BLESStoASTLexer.LITERAL_integer, "integer")
//    addChild(e.ps.toAST) 	
//    ]
//  else if (e.rational)	
//  newBAST(e) =>  
//    [  
//  	myText = "rational"
//    token = new CommonToken(BLESStoASTLexer.LITERAL_rational, "rational")
//    addChild(e.ps.toAST) 	
//    ]
//  else if (e.real)	
//  newBAST(e) =>  
//    [  
//  	myText = "real"
//    token = new CommonToken(BLESStoASTLexer.LITERAL_real, "real")
//    addChild(e.ps.toAST) 	
//    ]
//  else if (e.complex)	
//  newBAST(e) =>  
//    [  
//  	myText = "complex"
//    token = new CommonToken(BLESStoASTLexer.LITERAL_complex, "complex")
//    addChild(e.ps.toAST) 	
//    ]
//  else if (e.time)	
//  newBAST(e) =>  
//    [  
//  	myText = "time"
//    token = new CommonToken(BLESStoASTLexer.LITERAL_time, "time")
//    addChild(e.ps.toAST) 	
//    ]
//  }  //end of TypeConversion

//  def dispatch BAST
//toAST(TypeName e)
//  {
//  if (e.data_component_reference!==null)
//    e.data_component_reference.qualifiedName().makeBASTforPropertyName(e) 
//  else if (e.natural)	
//  newBAST(e) =>  
//    [  
//  	myText = "natural"
//    token = new CommonToken(BLESStoASTLexer.LITERAL_natural, "natural")
//    ]
//  else if (e.integer)	
//  newBAST(e) =>  
//    [  
//  	myText = "integer"
//    token = new CommonToken(BLESStoASTLexer.LITERAL_integer, "integer")
//    ]
//  else if (e.rational)	
//  newBAST(e) =>  
//    [  
//  	myText = "rational"
//    token = new CommonToken(BLESStoASTLexer.LITERAL_rational, "rational")
//    ]
//  else if (e.real)	
//  newBAST(e) =>  
//    [  
//  	myText = "real"
//    token = new CommonToken(BLESStoASTLexer.LITERAL_real, "real")
//    ]
//  else if (e.complex)	
//  newBAST(e) =>  
//    [  
//  	myText = "complex"
//    token = new CommonToken(BLESStoASTLexer.LITERAL_complex, "complex")
//    ]
//  else if (e.time)	
//  newBAST(e) =>  
//    [  
//  	myText = "time"
//    token = new CommonToken(BLESStoASTLexer.LITERAL_time, "time")
//    ]
//  else if (e.string)	
//  newBAST(e) =>  
//    [  
//  	myText = "string"
//    token = new CommonToken(BLESStoASTLexer.LITERAL_string, "string")
//    ]
//  }  //end of TypeName


//  UniversalLatticeQuantification
//universal_lattice_quantification : 
//  lf=LITERAL_forall   
//  lv=lattice_variables li=LITERAL_in r=range  
////  av=availability? 
//  elq=existential_lattice_quantification
//    -> ^($lf $lv ^($li $r) $elq )  ;
  def dispatch BAST
toAST(UniversalLatticeQuantification e)
  {
   try {  
  newBAST(e) =>  
    [  
  	myText = "forall"
    token = new CommonToken(BLESStoASTLexer.LITERAL_forall, "forall")
    if (e.variables.size > 1)  //multiple forall variables
      addChild(newBAST(e) =>  
      [  
      myText = ","
      token = new CommonToken(BLESStoASTLexer.COMMA, ",")
      for (v : e.variables)
        addChild(v.name.makeBASTforID(e))   
      ] )
    else
       addChild(e.variables.head.name.makeBASTforID(e)) 	//one forall variables
    addChild(newBAST(e) =>  //^($li $r)
      [  
  	  myText = "in"
      token = new CommonToken(BLESStoASTLexer.LITERAL_in, "in")
      addChild(newBAST(e) =>
        [  
        myText = ".."
        token = new CommonToken(BLESStoASTLexer.DOTDOT, "..")
        addChild(e.lower_bound.toAST)
        addChild(e.upper_bound.toAST)
        ]
      ) 	 
      ] )
    addChild(e.elq.toAST) 	// elq=ExistentialLatticeQuantification
    ]
     } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of UniversalLatticeQuantification

//	| Value
  def dispatch BAST
toAST(Value e)
  {
   try {  
  if (e.value_name!==null)
    e.value_name.toAST  //get BAST from Name
  else if (e.constant!==null)
    e.constant.toAST  //Constant
  else if (e.timeout !== null) 
     newBAST(e) => [
  	   myText = 'timeout'
       token = new CommonToken(BLESStoASTLexer.LITERAL_timeout, 'timeout')
      ] 
//  | now?='now'
    else if (e.now !== null) 
      newBAST(e) => [
  	   myText = 'now'
       token = new CommonToken(BLESStoASTLexer.LITERAL_now, 'now')
      ] 
//  | tops?='tops'
    else if (e.tops !== null) 
      newBAST(e) => [
  	   myText = 'tops'
       token = new CommonToken(BLESStoASTLexer.LITERAL_tops, 'tops')
      ] 
    else if (e.enum_val !== null)
      e.enum_val.toAST
    } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of Value

//  | EnumerationValue
  def dispatch BAST
toAST(EnumerationValue e)
  {
  newBAST(e) => [
    myText = '\''
    token = new CommonToken(BLESStoASTLexer.TICK, '\'')
    addChild(newBAST(e) => [
      myText = e.enumeration_type.name
      token = new CommonToken(BLESStoASTLexer.ID, e.enumeration_type.name)     
      ]
      )
    addChild(newBAST(e) => [
      myText = e.enumeration_value
      token = new CommonToken(BLESStoASTLexer.ID, e.enumeration_value)     
      ]
      )
    ] 
  }

  
//	| ValueConstant
  def dispatch BAST
toAST(Constant e)
  {
   try {  
//  	if (e.property!==null)
//  	  e.property.toAST
//  	  (e.property as NamedElement).qualifiedName().makeBASTforPropertyName(e)
//    else 
    if (e.t !== null) 
      newBAST(e) => [
  	   myText = 'true'
       token = new CommonToken(BLESStoASTLexer.LITERAL_true, 'true')
      ] 
    else if (e.f !== null) 
      newBAST(e) => [
  	   myText = 'false'
       token = new CommonToken(BLESStoASTLexer.LITERAL_false, 'false')
      ] 
    else if (e.nul !== null) 
      newBAST(e) => [
  	   myText = 'null'
       token = new CommonToken(BLESStoASTLexer.LITERAL_null, 'null')
      ] 
    else if (e.numeric_constant !==null)
      e.numeric_constant.toAST()
//    else if (e.integer_literal!==null)   //intger literal
//      e.integer_literal.makeBASTforINT(e) 
//    else if (e.real_literal!==null)  //real literal
//      e.real_literal.makeBASTforREAL_LIT(e) 
    else if (e.string_literal!==null) //string literal
      e.string_literal.makeBASTforAADL_STRING_LITERAL(e) 
//    else if (e.property!==null) //AADL property
//      (e.property as NamedElement).qualifiedName().makeBASTforPropertyName(e)
//    else if (e.constant!==null) //AADL property constant
//      e.constant.qualifiedName().makeBASTforPropertyName(e)
     } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of ValueConstant

//	| Variable
//THIS SHOULD BECOME A NamedElement
//  def dispatch BAST
//toAST(Variable e)
//  {
////  e.name.makeBASTforID(e)
//  }  //end of Variable


//  def dispatch BAST
//toAST(PropertyConstant e)
//  {
//  	e.constant.qualifiedName().makeBASTforPropertyName(e)
//  }  //end of Property

  def dispatch BAST
toAST(PropertyField e)
  {
    try {  
    if (e.index!==null)
  	newBAST(e) =>
  	  [
  	  myText = "["	
      token = new CommonToken(BLESStoASTLexer.LBRACKET, "[")
      addChild(e.index.makeBASTforINT(e))
      addChild(newBAST(e) =>[myText = "]"	
        token = new CommonToken(BLESStoASTLexer.RBRACKET, "]")])
  	  ]
    else if (e.variable!==null)
  	newBAST(e) =>
  	  [
  	  myText = "["	
      token = new CommonToken(BLESStoASTLexer.LBRACKET, "[")
      addChild(e.variable.toAST)
      addChild(newBAST(e) =>[myText = "]"	
        token = new CommonToken(BLESStoASTLexer.RBRACKET, "]")])
  	  ]
    else if (e.pf!==null)
  	newBAST(e) =>
  	  [
  	  myText = "."	
      token = new CommonToken(BLESStoASTLexer.PERIOD, ".")
      addChild(e.pf.makeBASTforID(e))
  	  ]
    else if (e.upper!==null)
  	newBAST(e) =>
  	  [
  	  myText = "."	
      token = new CommonToken(BLESStoASTLexer.PERIOD, ".")
      addChild(newBAST(e) =>[myText = "upper_bound"	
        token = new CommonToken(BLESStoASTLexer.LITERAL_upper_bound, "upper_bound")])
  	  ]
    else if (e.lower!==null)
  	newBAST(e) =>
  	  [
  	  myText = "."	
      token = new CommonToken(BLESStoASTLexer.PERIOD, ".")
      addChild(newBAST(e) =>[myText = "lower_bound"	
        token = new CommonToken(BLESStoASTLexer.LITERAL_lower_bound, "lower_bound")])
  	  ]
    else
  	newBAST(e) =>
  	  [
  	  myText = "error"	
      token = new CommonToken(BLESStoASTLexer.ID, "error")
      ]
     } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of PropertyField

//  def dispatch BAST
//toAST(PropertyName e)
//  {
//  var property = e.simple
////  EcoreUtil.resolve(property,)    	
//  property.qualifiedName().makeBASTforPropertyName(e)
//  }  //end of PropertyName

  def dispatch BAST
toAST(PropertyReference e)
  {
    try {  
  val p = e.pname
  EcoreUtil.resolve(p,e.eContainer)
  if (e.self)  //  self#ps::p
  	newBAST(e) =>
  	  [
  	  myText = "#"	
      token = new CommonToken(BLESStoASTLexer.OCTOTHORPE, "#")
      addChild(newBAST(e) =>
  	    [
  	    myText = "self"	
        token = new CommonToken(BLESStoASTLexer.LITERAL_self, "self")
        ] )      
      addChild(p.qualifiedName().makeBASTforPropertyName(e))
      for (f : e.field)
        addChild(f.toAST)  	  
      ]
//  else if (e.pname!==null)  //subcomponent#ps::p  THERE IS NO SUBCOMPONENT IN GRAMMAR FOR PropertyReference
//  	newBAST(e) =>
//  	  [
//  	  myText = "#"	
//      token = new CommonToken(BLESStoASTLexer.OCTOTHORPE, "#")
////      addChild(e.component_element.makeBASTforID(e))
//      addChild(e.pname.qualifiedName().makeBASTforPropertyName(e))  	  
//      for (f : e.field)
//        addChild(f.toAST)  	  
//      ]
  else if (e.component!==null)  //  uccr#ps::p
  	newBAST(e) =>
  	  [
  	  myText = "#"	
      token = new CommonToken(BLESStoASTLexer.OCTOTHORPE, "#")
      addChild(e.component.qualifiedName().makeBASTforPropertyName(e))
      addChild(p.qualifiedName().makeBASTforPropertyName(e))  	  
      for (f : e.field)
        addChild(f.toAST)  	  
      ]
  else
  	newBAST(e) =>   //  #ps::p
  	  [
  	  myText = "#"	
      token = new CommonToken(BLESStoASTLexer.OCTOTHORPE, "#")
      addChild(p.qualifiedName().makeBASTforPropertyName(e))
      for (f : e.field)
        addChild(f.toAST)  	  
      ]
     } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of PropertyReference



//	| VariantType
//variant_type : LITERAL_variant^ //LBRACKET! /*discriminant_*/identifier RBRACKET! LPAREN! record_field+ RPAREN!
//  def dispatch BAST
//toAST(VariantType e)
//  {
//  newBAST(e) =>  
//    [  
//  	myText = "variant"
//    token = new CommonToken(BLESStoASTLexer.LITERAL_variant, "variant")
//    for (field : e.fields)
//      addChild(field.toAST) 	//lv=LatticeVariables
//    ]
//  }  //end of VariantType

//	| WhenThrow
//when_throw : LITERAL_when^ LPAREN! /*boolean_*/expression RPAREN! LITERAL_throw /*exception_*/identifier
  def dispatch BAST
toAST(WhenThrow e)
  {
    try {  
  newBAST(e) =>  
    [  
  	myText = "when"
    token = new CommonToken(BLESStoASTLexer.LITERAL_when, "when")
    addChild(e.exp.toAST) //exp=Expression
    addChild(newBAST(e) =>  // "throw"
      [  
  	  myText = "throw"
      token = new CommonToken(BLESStoASTLexer.LITERAL_throw, "throw")
      ] )
    addChild(e.exception.name.makeBASTforID(e))  // exception=ID 
    ]
     } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of WhenThrow

//	| WhileLoop
//while_loop : lw=LITERAL_while  
//  LPAREN be=/*boolean_*/expression_or_relation RPAREN
////  av=availability?  
//  ( LITERAL_invariant inv=assertion )?
//  ( LITERAL_bound bd=/*integer_*/expression )?  
//  elq=existential_lattice_quantification
//    -> ^($lw $be ^(INVARIANT[$lw,"INVARIANT"] $inv?) ^(BOUND[$lw,"BOUND"] $bd?) $elq ) ;
  def dispatch BAST
toAST(WhileLoop e)
  {
    try {  
	newBAST(e) =>  
       [  //'while' as root
  	   myText = "while"
       token = new CommonToken(BLESStoASTLexer.LITERAL_while, "while")
       //expression_or_relation
       addChild((e.test as Expression).toAST)    
       //have invariant?
       if (e.invariant)  
         addChild(newBAST(e) =>  
           [  //
  	       myText = "invariant"
           token = new CommonToken(BLESStoASTLexer.INVARIANT, "invariant")
           addChild(e.inv.toAST)
           ] )
       //have bound function?    
       if (e.bound)  
         addChild(newBAST(e) =>  
           [  //
  	       myText = "bound"
           token = new CommonToken(BLESStoASTLexer.BOUND, "bound")
           addChild(e.bound_function.toAST)
           ] )
       //finally, actions to do    
       addChild(e.elq.toAST)
       ]
     } catch (Exception ex) {ex.printStackTrace x}       
   }  //end of WhileLoop


//elements from BLESS.xtext

//	  BehaviorTransition
//behavior_transition :
//  ( btl=behavior_transition_label COLON )?
//  /*source_state_*/ssi+=identifier ( COMMA /*source_state_*/ssi+=identifier )*
//  x=LCON bc=behavior_condition? RCON
//  /*destination_state*/dsi=identifier 
//  ( LCURLY s=behavior_actions RCURLY | EMPTY_CURLY )
//  q=assertion? semi=SEMICOLON
//    -> 
//      ^( TRANSITION[$x,"TRANSITION["+Integer.toString($x.getLine()+startingLine)+"]"] 
//      ^( LABEL[$x,"LABEL["+Integer.toString($x.getLine()+startingLine)+"]"] $btl? ) 
//      ^( SOURCE[$x,"SOURCE["+Integer.toString($x.getLine()+startingLine)+"]"] $ssi+ ) 
//      ^( CONDITION[$x,"CONDITION["+Integer.toString($x.getLine()+startingLine)+"]"] $bc? ) 
//      ^( DESTINATION[$x,"DESTINATION["+Integer.toString($x.getLine()+startingLine)+"]"] $dsi ) 
//      ^( ACTION[$x,"ACTION["+Integer.toString($x.getLine()+startingLine)+"]"] $s? ) 
//      ^( Q[$semi,"Q["+Integer.toString($semi.getLine()+startingLine)+"]"] $q?) 
//      ) ; 
  def dispatch BAST
toAST(BehaviorTransition e)
  {
    try {  
  newBAST(e) =>  
    [  //TRANSITION as root
  	myText = "TRANSITION["+e.name+"]"
    token = new CommonToken(BLESStoASTLexer.TRANSITION, "TRANSITION["+e.name+"]")
    addChild(newBAST(e) =>  // "LABEL"
      [  
  	  myText = "LABEL["+e.name+"]"
      token = new CommonToken(BLESStoASTLexer.LABEL, "LABEL["+e.name+"]")
      addChild(e.name.makeBASTforID(e))
      ] )
    addChild(newBAST(e) =>  // "SOURCE"
      [  
  	  myText = "SOURCE"
      token = new CommonToken(BLESStoASTLexer.SOURCE, "SOURCE")
      for (source : e.sources)  //multiple source states
        addChild(source.name.makeBASTforID(e))
      ] )
    addChild(newBAST(e) =>  // "CONDITION"
      [  
  	  myText = "CONDITION"
      token = new CommonToken(BLESStoASTLexer.CONDITION, "CONDITION")
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
      token = new CommonToken(BLESStoASTLexer.DESTINATION, "DESTINATION")
      addChild(e.destination.name.makeBASTforID(e))  //destination state
      ] )
    addChild(newBAST(e) =>  // "ACTION"
      [  
  	  myText = "ACTION"
      token = new CommonToken(BLESStoASTLexer.ACTION, "ACTION")
      addChild(e.actions?.toAST)  //behavior=BehaviorActions 
      ] )
    addChild(newBAST(e) =>  // "Q"  Assertion during transition
      [  
  	  myText = "Q"
      token = new CommonToken(BLESStoASTLexer.Q, "Q")
      addChild(e.ass?.toAST)  //ass=Assertion?
      ] )
    ]
     } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of BehaviorTransition
 

//	BehaviorState
//behavior_state : i=identifier 
//  COLON (init=LITERAL_initial | com=LITERAL_complete | finl=LITERAL_final)? st=LITERAL_state a=assertion? SEMICOLON
//    -> ^( LITERAL_state[$st,"state["+Integer.toString($st.getLine()+startingLine)+"]"] $init? $com? $finl? $i $a? )
  def dispatch BAST
toAST(BehaviorState e)
  {
    try {  
  newBAST(e) =>  
    [  
  	myText = "state"
    token = new CommonToken(BLESStoASTLexer.LITERAL_state, "state")
    if (e.initial)
      addChild(newBAST(e) =>  // "initial"
      [  
  	  myText = "initial"
      token = new CommonToken(BLESStoASTLexer.LITERAL_initial, "initial")
      ] )
    if (e.complete)
      addChild(newBAST(e) =>  // "complete"
      [  
  	  myText = "complete"
      token = new CommonToken(BLESStoASTLexer.LITERAL_complete, "complete")
      ] )
    if (e.final)
      addChild(newBAST(e) =>  // "final"
      [  
  	  myText = "final"
      token = new CommonToken(BLESStoASTLexer.LITERAL_final, "final")
      ] )
    addChild(e.name.makeBASTforID(e))  //add name of state
    if (e.state_assertion!==null)
      addChild(e.state_assertion.toAST)  //add Assertion, if any
    ]
     } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of BehaviorState

//	| BLESSAnnexSubclause
//maps onto thread_behavior
//thread_behavior :
//  ANNEX_START?
//  //no_proof="DO_NOT_PROVE"?
////  av=availability?
//  ac=assert_clause?
//  inv=invariant_clause?
//  sv=variables?
//  s=LITERAL_states ( bs+=behavior_state )+
//  tran=transitions
//  ANNEX_END?
//  //  ->{no_proof!==null}? ^( THREAD_ANNEX[$s,"THREAD_ANNEX"+(startingLine>0?"["+startingLine+"]":"")] )
//    -> ^( THREAD_ANNEX[$s,"THREAD_ANNEX"+(startingLine>0?"["+startingLine+"]":"")]
//        ^( LITERAL_states[$s,"states["+Integer.toString($s.getLine()+startingLine)+"]"] $bs+ ) 
//        $ac? $inv? $sv? $tran STOP ) ; 
  def dispatch BAST
toAST(BLESSSubclause e)
  {
    try {  
  newBAST(e) =>  //THREAD_ANNEX as root
    [  
  	myText = "THREAD_ANNEX"
    token = new CommonToken(BLESStoASTLexer.THREAD_ANNEX, "THREAD_ANNEX")
    if (e.statesSection !== null)
      addChild(newBAST(e) =>  // add states
      [  
  	  myText = "states"
      token = new CommonToken(BLESStoASTLexer.LITERAL_states, "states")
      for (state : e.statesSection.states)  //add states+=BehaviorState+
        addChild(state.toAST)
      ] )
    //assert_clause?
    if (e.assert_clause!==null)
      addChild(e.assert_clause.toAST)
    //invariant
    if (e.invariant!==null)
      addChild(e.invariant.toAST)
    //variables?
    if (e.variables!==null)
      addChild(e.variables.toAST)
    //transitions?
    if (e.transitions!==null)
      addChild(e.transitions.toAST)
    if (e.no_proof)
      addChild(newBAST(e) =>  
      [  
  	  myText = "DO_NOT_PROVE"
      token = new CommonToken(BLESStoASTLexer.DO_NOT_PROVE, "DO_NOT_PROVE")
      ] )    
    //add STOP at end
    addChild(newBAST(e) =>  
      [  
  	  myText = "STOP"
      token = new CommonToken(BLESStoASTLexer.STOP, "STOP")
      ] )
    ]
     } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of BLESSAnnexSubclause

//	| DispatchCondition
//dispatch_condition  :  'on'! LITERAL_dispatch^  dispatch_expression? 
  def dispatch BAST
toAST(DispatchCondition e)
  {
    try {  
  newBAST(e) =>  //LITERAL_dispatch as root
    [  
  	myText = "dispatch"
    token = new CommonToken(BLESStoASTLexer.LITERAL_dispatch, "dispatch")
    addChild(e.de?.toAST)  // de=DispatchExpression?
    ]
     } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of DispatchCondition

//	| DispatchConjunction
//
  def dispatch BAST
toAST(DispatchConjunction e)
  {
    try {  
  if (e.and) 
   newBAST(e) =>  //LITERAL_and as root
    [  
  	myText = "and"
    token = new CommonToken(BLESStoASTLexer.LITERAL_and, "and")
    for (child : e.trigger)
      addChild(child.toAST)  // de=DispatchExpression?
    ]
  else  //just one trigger
    e.trigger.head.toAST
     } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of DispatchConjunction

//	| DispatchExpression
//dispatch_expression :
//  dc=dispatch_conjunction ( o=LITERAL_or dc2+=dispatch_conjunction )*
//    -> {o!==null}? ^($o $dc $dc2+)
//    -> $dc
//  |
//  stop=LITERAL_stop
//    -> $stop  ;
  def dispatch BAST
toAST(DispatchExpression e)
  {
    try {  
  if (e.or) newBAST(e) =>  //have or? disjunction of conjunctions
    [  
  	myText = "or"
    token = new CommonToken(BLESStoASTLexer.LITERAL_or, "or")
    for (child : e.dc)
      addChild(child.toAST)  // dc+=DispatchConjunction
    ]
  else  //just one dispatch conjunction
    e.dc.head.toAST
     } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of DispatchExpression

//	| DispatchTrigger
//dispatch_trigger :
// LITERAL_timeout^ LPAREN /*in_event_port_ or in_event_data_port*/identifier+ RPAREN  behavior_time 
//  | LITERAL_timeout^ 
//  | /*in_event_port_ or in_event_data_port*/identifier  ;
  def dispatch BAST
toAST(DispatchTrigger e)
  {
    try {  
  if (e.stop !== null) newBAST(e) =>  //is stop?
    [  
  	myText = "stop"
    token = new CommonToken(BLESStoASTLexer.LITERAL_stop, "stop")
    ]
  else if (e.timeout !== null && e.lp) newBAST(e) =>  //timeout with port list
    [  
  	myText = "timeout"
    token = new CommonToken(BLESStoASTLexer.LITERAL_timeout, "timeout")
       //LPAREN
       addChild(newBAST(e) =>  
           [  //
  	       myText = "("
           token = new CommonToken(BLESStoASTLexer.LPAREN, "(")
           ] )
       //port list
       for (p : e.ports)
         addChild(p.name.makeBASTforPort(e))    
       //RPAREN
       addChild(newBAST(e) =>  
           [  //
  	       myText = ")"
           token = new CommonToken(BLESStoASTLexer.RPAREN, ")")
           ] )
       //behavior_time
       addChild(e.time.toAST)   
    ]
  else if (e.timeout !== null && e.time!==null)  //completion relative timeout catch?
    newBAST(e) =>  
    [  
  	myText = "timeout"
    token = new CommonToken(BLESStoASTLexer.LITERAL_timeout, "timeout")
    //behavior_time
    addChild(e.time.toAST)   
    ]
  else if (e.timeout !== null)  //just timeout?
    newBAST(e) =>  
    [  
  	myText = "timeout"
    token = new CommonToken(BLESStoASTLexer.LITERAL_timeout, "timeout")
    ]
  else  //just a port
    e.port.port.name.makeBASTforPort(e)
     } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of DispatchTrigger


//	| ExecuteCondition
  def dispatch BAST
toAST(ExecuteCondition e)
  {
  (e.eor as Expression).toAST
  }  //end of ExecuteCondition


//internal condition looks like dispatch condition
  def dispatch BAST
toAST(InternalCondition e)
  {
    try {  
  newBAST(e) =>  //have or?
    [  
  	myText = "dispatch"
    token = new CommonToken(BLESStoASTLexer.LITERAL_dispatch, "dispatch")
    addChild(makeBASTforPort(e.first.name,e))
    for (p : e.ports)
      addChild(makeBASTforPort(p.name,e))  // dc+=DispatchConjunction
    ]
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of InternalCondition


//	| InvariantClause
//invariant_clause : li=LITERAL_invariant inv=assertion
//    -> ^(LITERAL_invariant[$li,"invariant["+Integer.toString($li.getLine()+startingLine)+"]"] $inv  )
  def dispatch BAST
toAST(InvariantClause e)
  {
    try {  
  newBAST(e) =>  
    [  
  	myText = "invariant"
    token = new CommonToken(BLESStoASTLexer.LITERAL_invariant, "invariant")
    addChild(e.inv.toAST)
    ]
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of InvariantClause

//issue_exception :  ^(LITERAL_exception exception_state=ID message=AADL_STRING_LITERAL)
  def dispatch BAST
toAST(IssueException e)
  {
    try {  
  newBAST(e) =>  
    [  
  	myText = "exception"
    token = new CommonToken(BLESStoASTLexer.LITERAL_exception, "exception")
    addChild(e.exception.name.makeBASTforID(e))
      if (e.message !== null)
    addChild(e.message.makeBASTforAADL_STRING_LITERAL(e))
    ]
      } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of InvariantClause

//	| TransitionLabel
//behavior_transition_label : id=identifier ( LBRACKET lit=INTEGER_LIT RBRACKET )? -> ^( $id $lit? )
//  def dispatch BAST
//toAST(TransitionLabel e)
//  {
//    try {  
//  e.id.makeBASTforID(e) =>  
//    [  
//    if (e.priority!==null) 	
//  	  addChild(e.priority.priority.makeBASTforINT(e))
//    ]
//    } catch (Exception ex) {ex.printStackTrace x}       
//  }  //end of TransitionLabel

//	| Transitions
//transitions : t=LITERAL_transitions bt+=behavior_transition+
//    -> ^( LITERAL_transitions[$t,"transitions["+Integer.toString($t.getLine()+startingLine)+"]"] $bt+ )
  def dispatch BAST
toAST(Transitions e)
  {
  try {  
  newBAST(e) =>  
    [  
  	myText = "transitions"
    token = new CommonToken(BLESStoASTLexer.LITERAL_transitions, "transitions")
    for (child : e.bt)
      addChild(child.toAST)
    ]
    } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of Transitions

  def dispatch BAST
toAST(TriggerLogicalExpression e)
  {
  try {  
  if (e.op===null)
    e.first.toAST
  else
    switch e.op
    {
  	case 'and' : 
      newBAST(e) =>  
        [  
  	    myText = "and"
        token = new CommonToken(BLESStoASTLexer.LITERAL_and, "and")
        addChild(e.first.toAST)
        for (tr : e.trigger)
          addChild(tr.toAST)
        ]
  	case 'or' : 
      newBAST(e) =>  
        [  
  	    myText = "or"
        token = new CommonToken(BLESStoASTLexer.LITERAL_or, "or")
        addChild(e.first.toAST)
        for (tr : e.trigger)
          addChild(tr.toAST)
        ]
  	case 'xor' : 
      newBAST(e) =>  
        [  
  	    myText = "xor"
        token = new CommonToken(BLESStoASTLexer.LITERAL_xor, "xor")
        addChild(e.first.toAST)
        for (tr : e.trigger)
          addChild(tr.toAST)
        ]
  	case 'then' :  //and then = cand
      newBAST(e) =>  
        [  
  	    myText = "cand"
        token = new CommonToken(BLESStoASTLexer.LITERAL_cand, "cand")
        addChild(e.first.toAST)
        for (tr : e.trigger)
          addChild(tr.toAST)
        ]
  	case 'else' :  //or else = cor
      newBAST(e) =>  
        [  
  	    myText = "cor"
        token = new CommonToken(BLESStoASTLexer.LITERAL_cor, "cor")
        addChild(e.first.toAST)
        for (tr : e.trigger)
          addChild(tr.toAST)
        ]  	
  	}   //end of switch
    } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of TriggerLogicalExpression

//	| Variables
//variables  :  v=LITERAL_variables ( bv+=behavior_variable )+ 
//    -> ^( LITERAL_variables[$v,"variables["+Integer.toString($v.getLine()+startingLine)+"]"] $bv* )
  def dispatch BAST
toAST(VariablesSection e)
  {
  try {  
  newBAST(e) =>  
    [  
  	myText = "variables"
    token = new CommonToken(BLESStoASTLexer.LITERAL_variables, "variables")
    for (child : e.behavior_variables)
      addChild(child.toAST)
    ]
    } catch (Exception ex) {ex.printStackTrace x}       
  }  //end of Variables

  def dispatch BAST
toAST(BooleanType e)
  {
  try {  
  newBAST(e) =>  
    [  
  	myText = "boolean"
    token = new CommonToken(BLESStoASTLexer.LITERAL_boolean, "boolean")
  	]
     } catch (Exception ex) {ex.printStackTrace x}       
  }

  def dispatch BAST
toAST(StringType e)
  {
  try {  
  newBAST(e) =>  
    [  
  	myText = "string"
    token = new CommonToken(BLESStoASTLexer.LITERAL_string, "string")
  	]
    } catch (Exception ex) {ex.printStackTrace x}       
  }

  def dispatch BAST
toAST(TypeOrReference e)
  {
  try {  
  e.ty?.toAST ?:
    {  
    if (e.ref !== null) EcoreUtil.resolve(e.ref,e)
    if (e.ref?.name !==null && e.ref?.name.equals('time'))
    newBAST(e) =>  
      [  
    	myText = "time"
      token = new CommonToken(BLESStoASTLexer.LITERAL_time, "time")
    	]  
    else if (e.ref?.type !== null)
      e.ref.type.toAST
    else
      newBAST(e) =>  
        [  
  	    myText = "UNRESOLVED_TYPE_REFERENCE"
        token = new CommonToken(BLESStoASTLexer.DUMMY, "UNRESOLVED_TYPE_REFERENCE")
  	    ]  
    }
    } catch (Exception ex) {ex.printStackTrace x}       
  }

  def dispatch BAST
toAST(Type e)
  {
  try {  
  switch e
    {
    case ArrayType:
      toAST(e as ArrayType)	
    case BooleanType:
      toAST(e as BooleanType)	
    case EnumerationType:
      toAST(e as EnumerationType)	
    case QuantityType:
      toAST(e as QuantityType)	
    case RecordType:
      toAST(e as RecordType)	
    case StringType:
      toAST(e as StringType)	
    }	
    } catch (Exception ex) {ex.printStackTrace x}       
  }  // end of type

  def dispatch BAST
toAST(ANumber e)
  {
  try 
    {
    e.lit?.makeBASTforLIT(e) ?:
    e.property?.toAST  ?:
    e.propertyConstant?.qualifiedName().makeBASTforPropertyName(e) 
//    ELVIS OPERATOR FAILS TO RETURN TREE GENERATED FOR PORPERTY CONSTANT NAME!!!!!!!
//      ?:    
//    newBAST(e) =>  
//        [  
//        myText = "UNRESOLVED_NUMBER_REFERENCE"
//        token = new CommonToken(BLESStoASTLexer.DUMMY, "UNRESOLVED_NUMBER_REFERENCE")
//        ]  
    } 
  catch (Exception ex) {ex.printStackTrace x}       
  }  // end of ANumber


  def dispatch BAST
toAST(SubProgramParameter e)
  {
    e?.value.toAST ?:
    e?.constant.toAST ?:
    e?.expression.toAST
  }	//end of SubProgramParameter
  
}
