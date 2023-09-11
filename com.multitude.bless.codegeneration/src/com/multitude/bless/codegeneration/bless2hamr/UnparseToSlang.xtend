//Unparse.xtend

// Unparse BLESS directly from the Xtext-generated EMF using StringTemplate


package com.multitude.bless.codegeneration.bless2hamr

import com.google.inject.Inject
import com.multitude.aadl.bless.bLESS.ANumber
import com.multitude.aadl.bless.bLESS.Action
import com.multitude.aadl.bless.bLESS.AddSub
import com.multitude.aadl.bless.bLESS.Alternative
import com.multitude.aadl.bless.bLESS.AssertedAction
import com.multitude.aadl.bless.bLESS.Assignment
import com.multitude.aadl.bless.bLESS.BasicAction
import com.multitude.aadl.bless.bLESS.BehaviorActions
import com.multitude.aadl.bless.bLESS.BehaviorTime
import com.multitude.aadl.bless.bLESS.CaseExpression
import com.multitude.aadl.bless.bLESS.CombinableOperation
import com.multitude.aadl.bless.bLESS.CommunicationAction
import com.multitude.aadl.bless.bLESS.Computation
import com.multitude.aadl.bless.bLESS.ConditionalExpression
import com.multitude.aadl.bless.bLESS.Conjunction
import com.multitude.aadl.bless.bLESS.Constant
import com.multitude.aadl.bless.bLESS.Disjunction
import com.multitude.aadl.bless.bLESS.DispatchCondition
import com.multitude.aadl.bless.bLESS.DispatchConjunction
import com.multitude.aadl.bless.bLESS.DispatchExpression
import com.multitude.aadl.bless.bLESS.DispatchTrigger
import com.multitude.aadl.bless.bLESS.DoUntilLoop
import com.multitude.aadl.bless.bLESS.EnumerationValue
import com.multitude.aadl.bless.bLESS.ExecuteCondition
import com.multitude.aadl.bless.bLESS.ExistentialLatticeQuantification
import com.multitude.aadl.bless.bLESS.Exp
import com.multitude.aadl.bless.bLESS.Expression
import com.multitude.aadl.bless.bLESS.ExpressionOrAny
import com.multitude.aadl.bless.bLESS.ForLoop
import com.multitude.aadl.bless.bLESS.FunctionParameters
import com.multitude.aadl.bless.bLESS.IndexExpression
import com.multitude.aadl.bless.bLESS.IndexExpressionOrRange
import com.multitude.aadl.bless.bLESS.Invocation
import com.multitude.aadl.bless.bLESS.IssueException
import com.multitude.aadl.bless.bLESS.MultDiv
import com.multitude.aadl.bless.bLESS.NameTick
import com.multitude.aadl.bless.bLESS.ParenthesizedSubexpression
import com.multitude.aadl.bless.bLESS.PartialName
import com.multitude.aadl.bless.bLESS.PeriodShift
import com.multitude.aadl.bless.bLESS.PortInput
import com.multitude.aadl.bless.bLESS.PortOutput
import com.multitude.aadl.bless.bLESS.PropertyField
import com.multitude.aadl.bless.bLESS.PropertyReference
import com.multitude.aadl.bless.bLESS.Quantity
import com.multitude.aadl.bless.bLESS.QuantityType
import com.multitude.aadl.bless.bLESS.Range
import com.multitude.aadl.bless.bLESS.RecordTerm
import com.multitude.aadl.bless.bLESS.Relation
import com.multitude.aadl.bless.bLESS.SimultaneousAssignment
import com.multitude.aadl.bless.bLESS.Subexpression
import com.multitude.aadl.bless.bLESS.SubprogramCall
import com.multitude.aadl.bless.bLESS.TimedExpression
import com.multitude.aadl.bless.bLESS.TimedSubject
import com.multitude.aadl.bless.bLESS.TypeOrReference
import com.multitude.aadl.bless.bLESS.UnaryOperator
import com.multitude.aadl.bless.bLESS.UniversalLatticeQuantification
import com.multitude.aadl.bless.bLESS.Value
import com.multitude.aadl.bless.bLESS.ValueName
import com.multitude.aadl.bless.bLESS.VariableDeclaration
import com.multitude.aadl.bless.bLESS.WhenThrow
import com.multitude.aadl.bless.bLESS.WhileLoop
import com.multitude.aadl.bless.util.TypeUtil
import com.multitude.aadl.bless.util.UnitUtil
import com.multitude.aadl.bless.validation.BLESSValidator
import org.osate.aadl2.DataPort
import org.osate.aadl2.EventDataPort
import org.osate.aadl2.EventPort
import org.osate.aadl2.Port
import org.osate.aadl2.StringLiteral
import org.stringtemplate.v4.ST
import org.stringtemplate.v4.STGroupFile
import org.osate.aadl2.PropertyExpression
import org.osate.xtext.aadl2.properties.util.PropertyUtils
import org.osate.aadl2.Classifier
import org.osate.aadl2.IntegerLiteral
import com.multitude.aadl.bless.scoping.BlessIndex
import org.osate.aadl2.RealLiteral
import org.osate.aadl2.DataType

class UnparseToSlang {

@Inject extension BLESSValidator
@Inject extension UnitUtil
@Inject extension TypeUtil
@Inject extension BlessIndex

STGroupFile stgf = new STGroupFile(getClass().getResource("slang.stg"), "UTF-8", '$', '$')
String singletonName = ""
public Classifier classifier;

  def String
makeTimeoutID(DispatchTrigger dt) 
  {
  val sb = new StringBuffer("timeout_");
  for (p : dt.ports)
    sb.append(p.name+"_");
  if (dt.time.quantity !== null)
    {
    sb.append(dt.time.quantity.number.ANumberString)
    if (dt.time.quantity.unit !== null)
      sb.append("_" + dt.time.quantity.unit.name)  
    }
  else if (dt.time.value !== null)
    {
    sb.append(dt.time.value.id.name)  
    }
  return sb.toString();  
  } 

  def String
getANumberString(ANumber an)
  {
  an.lit?.toString ?:
  an.property?.pname?.name ?:
  an.property?.spname?.name ?:
  an.property?.cpname?.name ?:
  an.propertyConstant?.name
  }
  
  def dispatch ST
toST(String s)
  {
  stgf.getInstanceOf("id").add("s", s)
  }

  def dispatch ST
toST(Expression e)
  {
//  e.all?.toST ?:
//  e.exists?.toST ?:
//  e.sum?.toST ?:
//  e.product?.toST ?:
//  e.numberof?.toST ?:
  if (e.sym === null)
    e.l.toST
  else if (e.sym.equals('iff'))
    {
    val st = stgf.getInstanceOf("iff")
    st.add("l", e.l.toST) 
    st.add("r", e.r.toST)
    st 
    }
  else if (e.sym.equals('implies'))
    {
    val st = stgf.getInstanceOf("implies")
    st.add("l", e.l.toST) 
    st.add("r", e.r.toST) 
    st
    }
  }  //end of Expression
  
  def dispatch ST
toST(Disjunction e)
  {
  if (e.sym === null)
    e.l.toST
  else if (e.sym.equals('or'))
    {
    val st = stgf.getInstanceOf("l_or")
    st.add("bs", e.l.toST)
    for (r : e.r)
      st.add("bs", r.toST)
    st    
    }    
  else if (e.sym.equals('else'))
    {
    val st = stgf.getInstanceOf("l_cor")
    st.add("bs", e.l.toST)
    for (r : e.r)
      st.add("bs", r.toST)
    st    
    }    
  else if (e.sym.equals('xor'))
    {
    val st = stgf.getInstanceOf("l_xor")
    st.add("bs", e.l.toST)
    for (r : e.r)
      st.add("bs", r.toST)
    st    
    }    
  }  //end of Disjunction

  def dispatch ST
toST(Conjunction e)
  {
  if (e.sym === null)
    e.l.toST
  else if (e.sym.equals('and'))
    {
    val st = stgf.getInstanceOf("l_and")
    st.add("bs", e.l.toST)
    for (r : e.r)
      st.add("bs", r.toST)
    st    
    }    
  else if (e.sym.equals('then'))
    {
    val st = stgf.getInstanceOf("l_cand")
    st.add("bs", e.l.toST)
    for (r : e.r)
      st.add("bs", r.toST)
    st    
    }    
  }  //end of Conjunction

  def String
makeSlangRelationOperator(String op)
  {
  if (op.equals("=")) 
    "=="
  else if (op.equals("<>")) 
    "!="
  else if (op.equals("+="))
    "fetchadd"
  else op 
  } 
   
  def dispatch ST
toST(Relation e)
  {
  if (e.sym !== null)
    {
    val st = stgf.getInstanceOf("relation")
    st.add("l", e.l.toST)
    st.add("sym", makeSlangRelationOperator(e.sym))
    st.add("r", e.r.toST)
    st    
    }    
  else if (e.in !== null)
    {
    val st = stgf.getInstanceOf("relation")
    st.add("l", e.l.toST)
    st.add("sym", e.in)
    st.add("r", e.range.toST)
    st    
    } 
  else   
    e.l.toST
  }  //end of Relation

  def dispatch ST
toST(AddSub e)
  {
  if (e.sym === null)
    e.l.toST
  else 
    {
    val st = stgf.getInstanceOf("arithmetic")
    st.add("t", e.l.toST)
    st.add("sym", e.sym)
    for (r : e.r)
      st.add("t",r.toST)
    st
    }
  }  //end of AddSub
  
  def dispatch ST
toST(MultDiv e)
  {
  if (e.sym === null)
    e.l.toST
  else 
    {
    val st = stgf.getInstanceOf("arithmetic")
    st.add("t", e.l.toST)
    st.add("sym", e.sym)
    for (r : e.r)
      st.add("t",r.toST)
    st
    }
  }  //end of MultDiv
  
  def dispatch ST
toST(Exp e)
  {
  if (e.sym === null)
    e.l.toST
  else 
    {
    val st = stgf.getInstanceOf("arithmetic")
    st.add("t", e.l.toST)
    st.add("sym", e.sym)
    st.add("t",e.r.toST)
    st
    }
  }  //end of Exp
  
  def dispatch ST
toST(Subexpression e)
  {
  if (e.unary === null)
    e.timed_expression.toST
  else 
    {
    val st = stgf.getInstanceOf("unary")
    st.add("u", e.unary.toST)
    st.add("e",e.timed_expression.toST)
    st
    }
  }  //end of Subexpression
  
  def dispatch ST
toST(UnaryOperator e)
  {
  if (e.not !== null)
    stgf.getInstanceOf("id").add("s", "!")
  else if (e.unary_minus !== null)
    stgf.getInstanceOf("id").add("s", " -")
  else if (e.absolute_value !== null)
    stgf.getInstanceOf("id").add("s", " abs")
  else if (e.truncate !== null)
    stgf.getInstanceOf("id").add("s", " truncate")
  else if (e.round !== null)
    stgf.getInstanceOf("id").add("s", " round")
  }  //end of UnaryOperator
  
  def dispatch ST
toST(TimedExpression e)
  {  //ignore all temporal operators generating Slang
  e.subject.toST
  }  //end of TimedExpression
 
  def dispatch ST
toST(TimedSubject e)
  {
  e.value?.toST ?:
  e.invocation?.toST ?:
  e.ps?.toST ?:
  e.conditional?.toST ?:
  e.record?.toST
  }  //end of TimedSubject
 
  
  def dispatch ST
toST(ParenthesizedSubexpression e)
  {
  val p = stgf.getInstanceOf("parentheses")
  if (e.t !== null) //conditional expression
    {
    val ce = stgf.getInstanceOf("if_assign_exp")
    ce.add("b", e.expression.toST) 
    ce.add("t", e.t.toST) 
    ce.add("f", e.f.toST) 
    p.add("e", ce)
    }
  else if (e.caseexpression !== null)
    p.add("e", e.caseexpression.toST)
  else  //just an expression
    p.add("e", e.expression.toST)
  p
  }  //end of ParenthesizedSubexpression
    
  def dispatch ST
toST(CaseExpression e)
  {
  }  //end of CaseExpression
  
  def dispatch ST
toST(Value e)
  {
  if (e.value_name !== null)
    {  //convert to root unit
    val rec = e.value_name.getUnitRecord
    val factor = toST((rec.multiplyFactor ? " / " : " * ")+rec.conversionFactor)
    stgf.getInstanceOf("valueToRootUnit").add("value", e.value_name.toST).add("conversion", factor)
    }
  else if (e.constant !== null)
    e.constant.toST
  else if (e.enum_val !== null)
    e.enum_val.toST
  else if (e.now !== null)
    toST(BlessBehaviorProvider.slangTimestamp)
  else 
    toST("tops")
//  e.timeout?.toString.toST ?:
//  e.now?.toString.toST ?:
//  e.tops?.toString.toST   
  }  //end of Value
  
  def dispatch ST
toST(ValueName e)
  {
  if (e.id instanceof EventPort) 
       stgf.getInstanceOf("eventPort").add("p", e.id.name)
  else if (e.id instanceof DataPort)
       stgf.getInstanceOf("dataPort").add("p", e.id.name).add("unit", getUnitLiteral(e.id as Port))
  else if (e.id instanceof EventDataPort)
       stgf.getInstanceOf("dataPort").add("p", e.id.name).add("unit", getUnitLiteral(e.id as Port))    
  else if (e.lp)
    {  //subprogram invocation
    val si = stgf.getInstanceOf("invoke")
    si.add("label", e.id.name)
    if (e.pr !== null)
      si.add("params", e.pr.toST)
    si
    }
  else
    {  //variable name
    val valueName = stgf.getInstanceOf("valueName")
    valueName.add("id", e.id.name)
    for (ai : e.array_index)
      {  //array index
      val i  = stgf.getInstanceOf("index") 
      i.add("i", ai.toST)
      valueName.add("indx", i)
      }
    for (pn : e.pn)
      {  //more partial names
      valueName.add("pnames", pn)
      }
    valueName  
    }
  }  //end of ValueName

  def String
getUnitLiteral(Port e) 
  {
  val classifier = e.classifier
  for (pa : classifier.ownedPropertyAssociations)  
    if (pa.property.getQualifiedName.equalsIgnoreCase('BLESS::Typed'))
      {
      val str = (pa.ownedValues.get(0).ownedValue as StringLiteral).value
      val bless_typed = str.getTypeOfString(e)
//      val bless_typed = str.getTypeOfString
      if (bless_typed instanceof QuantityType)
        return (bless_typed as QuantityType).unit.name
      }    
  "value"  
  } 
  
  def dispatch ST
toST(PartialName e)
  {
  val partialName = stgf.getInstanceOf("partialName")
  partialName.add("rec", e.record_id)
    for (ai : e.array_index)
      {  //array index
      val i  = stgf.getInstanceOf("index") 
      i.add("i", ai.toST)
      partialName.add("indx", i)
      }
  partialName
  }  //end of PartialName
  
  def dispatch ST
toST(FunctionParameters e)
  {
  val fp = stgf.getInstanceOf("csl")
  for (p : e.parameters)
    {
    val fa = stgf.getInstanceOf("formal_actual")
    fa.add("formal", p.formal)
    fa.add("actual", p.actual.toST)
    fp.add("items", fa)
    }
  fp
  }  //end of FunctionParameters
  
  def dispatch ST
toST(IndexExpressionOrRange e)
  {
  if (e.dd)  
    {  //it's a range
    val r = stgf.getInstanceOf("relation") 
    r.add("l", e.left_hand_side.toST)
    r.add("sym", "..")
    r.add("r", e.right_hand_side.toST)
    r
    }
  else
    e.left_hand_side.toST
  }  //end of IndexExpressionOrRange

  
  def dispatch ST
toST(IndexExpression e)
  {
  if (e.sym === null)
    e.l.toST
  else
    {
    val ie = stgf.getInstanceOf("arithmetic")  
    ie.add("sym", e.sym)
    ie.add("t", e.l.toST)
    for (r : e.r)
      ie.add("t", r.toST)
    ie
    }
  }  //end of IndexExpression
  
  def dispatch ST
toST(PeriodShift e)
  {
  if (e.unary_minus)
    {
    val um = stgf.getInstanceOf("unary")  
    um.add("u", "-")
    if (e.v !== null)
      um.add("e", e.v.toST)
    else
      {
      val ie = stgf.getInstanceOf("index")
      ie.add("i", e.index_expression.toST)
      um.add("e", ie) 
      }
    um
    }
  else if (e.v !== null)
    e.v.toST
  else
    {
    val ie = stgf.getInstanceOf("index")
    ie.add("i", e.index_expression.toST)
    ie      
    } 
  }  //end of PeriodShift
  
  def dispatch ST
toST(Constant e)
  {
  if (e.t !== null)
    toST("T")
  else if (e.f !== null)
    toST("F")
  else if (e.nul !== null)
    toST("Empty")
  else if (e.string_literal !== null)
    e.string_literal.toString.toST
  else  // numeric constant
    {  //convert to root unit
    val rec = e.numeric_constant.getUnitRecord
    val factor = toST((rec.multiplyFactor ? " / " : " * ")+rec.conversionFactor)
    stgf.getInstanceOf("valueToRootUnit").add("value", e.numeric_constant.toST).add("conversion", factor)
    }
  }  //end of Constant

  
  def dispatch ST
toST(Quantity e)
  {
  e.number.toST  //ignoring unit for now
  }  //end of Quantity

  
  def dispatch ST
toST(ANumber e)
  {
  if (e.lit !== null)
    {
    val lit = e.lit.toString
    if (lit.contains('.'))
      ("f32\""+lit+"\"").toST
    else
      ("s64\""+lit+"\"").toST
    }
  else if (e.property !== null)
    e.property.toST
  else if (e.propertyConstant !== null)
//    e.propertyConstant.name.replaceAll("::","_").toST
    {
    e.propertyConstant.constantValue.toString.toST 
    }
  }  //end of ANumber
  
  def dispatch ST
toST(PropertyReference e)
  {
//  val pr = stgf.getInstanceOf("propertyReference")
  if (e.pname !== null)
    {
    val PropertyExpression pe = PropertyUtils.getSimplePropertyValue(classifier,e.pname)
    if (pe instanceof IntegerLiteral)
      {
      val unitName = e.pname.findUnitNameFromString((pe as IntegerLiteral).unit.name)
      if (unitName.hasTimeUnit)
        {
        val String s = "s64\""+(pe as IntegerLiteral).value.toString + "\""
        s.toST
        }
      else
        {
        val String s = "s64\""+(pe as IntegerLiteral).value.toString + "\""
        s.toST 
        }
      }
    else if (pe instanceof RealLiteral)
      ( "f32\"" +(pe as RealLiteral).value.toString + "\"" ).toST
    }
  else if (e.self)
    {
    val PropertyExpression pe = PropertyUtils.getSimplePropertyValue(classifier,e.spname)
    if (pe instanceof IntegerLiteral)
      {
      val unitName = e.pname.findUnitNameFromString((pe as IntegerLiteral).unit.name)
      if (unitName.hasTimeUnit)
        {
        val String s = "s64\""+(pe as IntegerLiteral).value.toString + "\""
        s.toST
        }
      else
        {
        val String s = "s64\""+(pe as IntegerLiteral).value.toString + "\""
        s.toST 
        }
      }
    else if (pe instanceof RealLiteral)
      ( "f32\"" +(pe as RealLiteral).value.toString + "\"" ).toST
    }
  else if (e.component !== null)
    {
    val PropertyExpression pe = PropertyUtils.getSimplePropertyValue(classifier,e.cpname)
    if (pe instanceof IntegerLiteral)
      {
      val unitName = e.pname.findUnitNameFromString((pe as IntegerLiteral).unit.name)
      if (unitName.hasTimeUnit)
        {
        val String s = "s64\""+(pe as IntegerLiteral).value.toString + "\""
        s.toST
        }
      else
        {
        val String s = "s64\""+(pe as IntegerLiteral).value.toString + "\""
        s.toST 
        }
      }
    else if (pe instanceof RealLiteral)
      ( "f32\"" +(pe as RealLiteral).value.toString + "\"" ).toST
    }
//  for (f : e.field)
//    pr.add("f", f.toST)      
//  pr
  }  //end of PropertyReference
  
  def dispatch ST
toST(PropertyField e)
  {
  if (e.index !== null)  //literal
    stgf.getInstanceOf("index").add("t", e.index.toString.toST)
  else if (e.variable !== null)  //variable
    stgf.getInstanceOf("index").add("t", e.variable.name.toString.toST)
  else if (e.pf !== null)  //record label
    stgf.getInstanceOf("dotID").add("t", e.pf.toString.toST)
  else if (e.upper !== null)  //upper_bound
    stgf.getInstanceOf("dotID").add("t", e.upper.toString.toST)
  else if (e.lower !== null)  //lower_bound
    stgf.getInstanceOf("dotID").add("t", e.lower.toString.toST)
  }  //end of PropertyField
  
  def dispatch ST
toST(EnumerationValue e)
  {
  stgf.getInstanceOf("dotSeparator").add("s", singletonName.toST)
                                    .add("s", e.enumeration_type.toString.toST)
                                    .add("s", e.enumeration_value.toString.toST)
  }  //end of EnumerationValue
  
  def dispatch ST
toST(ConditionalExpression e)
  {
  val p = stgf.getInstanceOf("parentheses")
  val ce = stgf.getInstanceOf("if_assign_exp")
  ce.add("b", e.pred.toST) 
  ce.add("t", e.t.toST) 
  ce.add("f", e.f.toST) 
  p.add("e", ce)
  }  //end of ConditionalExpression
  
  def dispatch ST
toST(RecordTerm e)
  {
  toST("RecordTerm")  
  }  //end of RecordTerm
  
  def dispatch ST
toST(Invocation e)
  {
  toST("Invocation")  
  }  //end of Invocation
  
  def dispatch ST
toST(Range e)
  {
  toST("Range")  
  }  //end of Range
  
  def dispatch ST
toST(ExecuteCondition e)
  {  //BooleanExpression is an Expression
  val be = e.eor as Expression
  be.toST  
  }  //end of ExecuteCondition
  
  def dispatch ST
toST(DispatchCondition e)
  {  //ignore "on dispatch"
  if (e.de === null)
    toST("true")
  else
    e.de.toST  
  }

  def dispatch ST
toST(DispatchExpression e)
  {  //ignore "on dispatch"
  if (e.dc === null)
    toST("true")
  else
    {
    val de = stgf.getInstanceOf("l_or")
    for (dc : e.dc)
      de.add("bs", dc.toST)
    de  
    }
  }  //end of DispatchExpression

  def dispatch ST
toST(DispatchConjunction e)
  {  //ignore "on dispatch"
  if (e.trigger === null)
    toST("true")
  else
    {
    val de = stgf.getInstanceOf("l_and")
    for (trigger : e.trigger)
      de.add("bs", trigger.toST)
    de  
    }
  }  //end of DispatchExpression

  def dispatch ST
toST(DispatchTrigger e)
  {  //ignore "on dispatch"
  if (e.port !== null)
    stgf.getInstanceOf("eventPort").add("p", "api."+e.port.port.name)     
  else
    stgf.getInstanceOf("eventPort").add("p", makeTimeoutID(e))     
  }  //end of DispatchTrigger

  
  def dispatch ST
toST(BehaviorTime e)
  {  //to determine api timeout name
  if (e.quantity !== null)
    {
    val q = stgf.getInstanceOf("timeoutQuantity")
    if (e.quantity.number.lit !== null) 
      q.add("number", e.quantity.number.lit.toST)
    else
      q.add("number", toST("property"))
    if (e.quantity.unit !== null)
      q.add("unit", e.quantity.unit.toST)
    else if (e.quantity.scalar !== null)
      q.add("unit", toST("scalar"))
    else if (e.quantity.whole !== null)
      q.add("unit", toST("whole"))
    q  
    }
  else if (e.value !== null)
    e.value.toST
  else
    toST("duration")    
  }  //end of BehaviorTime
 
  def dispatch ST
toST(BehaviorActions e) 
  {  //no distinction between sequential and concurrent composition
  val act = stgf.getInstanceOf("actions")
  for (ac : e.action)
    act.add("a", ac.toST)
  act
  }  //end of BehaviorActions
 
  def dispatch ST
toST(AssertedAction e) 
  {  
  e.action.toST
  }  //end of AssertedAction
 
  def dispatch ST
toST(Action e) 
  {  
  e.basic?.toST ?:
  e.if_fi?.toST ?:
  e.wl?.toST ?:
  e.fl?.toST ?:
  e.du?.toST ?:
  e.elq?.toST ?:
  e.ulq?.toST  
  }  //end of Action
 
  def dispatch ST
toST(BasicAction e) 
  {  
  e.skip?.toST ?:
  e.assign?.toST ?:
//  e.mode?.toST ?:  //no setmode yet
  e.when?.toST ?:
  e.comb?.toST ?:
  e.communication?.toST ?:
  e.computation?.toST ?:
  e.multi_assign?.toST ?:
  e.exc?.toST  
  }  //end of BasicAction

  def dispatch ST
toST(Assignment e) 
  { // need to convert from root unit to the unit of lhs 
  val rec = e.lhs.getUnitRecord
  val factor = toST((rec.multiplyFactor ? " * " : " / ")+rec.conversionFactor) 
  val rhsST = stgf.getInstanceOf("expressionfromRootUnit").add("expression", e.rhs.toST).add("conversion", factor)
  stgf.getInstanceOf("assign").add("lhs", e.lhs.toST).add("e", rhsST)
  }  //end of Assignment

  def dispatch ST
toST(ExpressionOrAny e) 
  {
  e.exp?.toST ?:
  toST("any")    // "any" is deprecated
  }  //end of ExpressionOrAny

  def dispatch ST
toST(WhenThrow e) 
  {  

  }  //end of WhenThrow

  def dispatch ST
toST(CombinableOperation e) 
  {  

  }  //end of CombinableOperation

  def dispatch ST
toST(CommunicationAction e) 
  {  
  e.pc?.toST ?:
  e.po?.toST ?:
  e.pi?.toST ?:
  toST("error in communication action")
  }  //end of CommunicationAction

  def dispatch ST
toST(SubprogramCall e) 
  {  
  var call = stgf.getInstanceOf("invoke")
  if (e.parameters !== null)
  for (p : e.parameters.variables)
    {
    var fa =  stgf.getInstanceOf("formal_actual")
    if (p.formal !== null)
      fa.add("formal", p.formal.name.toST) 
    fa.add("actual", p.actual.toST) 
    }
  call
  }  //end of SubprogramCall

  def dispatch ST
toST(PortOutput e) 
  {
  if (e.eor !== null)  //has parameter
    {
    val name = (e.port.featureClassifier as DataType).name
    stgf.getInstanceOf("port_output").add("p", e.port.name.toST).add("ty",name).add("e", e.eor.toST)
    }
  else
    toST("api.put_"+e.port.name+"()")
  }  //end of PortOutput

  def dispatch ST
toST(PortInput e) 
  {  
  stgf.getInstanceOf("assign").add("lhs", e.target.toST).add("e", toST("api.get_"+e.port.name+"().get"))
  }  //end of PortInput

  def dispatch ST
toST(Computation e) 
  {  
  toST("error in computation action")
  }  //end of Computation

  def dispatch ST
toST(SimultaneousAssignment e) 
  {  
  toST("no simultaneous assignment, yet")
  }  //end of SimultaneousAssignment

  def dispatch ST
toST(IssueException e) 
  {  
  toST("no issue exception")
  }  //end of IssueException

  def dispatch ST
toST(Alternative e) 
  {  
  val actions = stgf.getInstanceOf("actions")
  val first = stgf.getInstanceOf("ifClause")
  first.add("guard", (e.guard as Expression).toST)
  first.add("action", e.blessalt.action.toST)
  actions.add("a", first)
  for (ga : e.blessalt.alternative)
    {
    val others = stgf.getInstanceOf("ifClause")
    others.add("guard", (ga.guard as Expression).toST) 
    others.add("action", ga.action.toST)
    actions.add("a", others)
    }
  actions
  }  //end of Alternative

  def dispatch ST
toST(WhileLoop e) 
  {  
  val wh = stgf.getInstanceOf("while")
  wh.add("guard", (e.test as Expression).toST)
  wh.add("elq", e.elq.toST)
  wh
  }  //end of WhileLoop

  def dispatch ST
toST(ForLoop e) 
  {  
  val fl = stgf.getInstanceOf("for")
  fl.add("v", e.count.name)
  fl.add("lb", e.lower_bound.toST)
  fl.add("ub", e.upper_bound.toST)
  fl.add("a", e.action.toST)
  fl
  }  //end of ForLoop

  def dispatch ST
toST(DoUntilLoop e) 
  {  
  val do_until = stgf.getInstanceOf("do_until")
  do_until.add("guard", (e.guard as Expression).toST)
  do_until.add("actions", e.actions.toST)
  do_until
  }  //end of DoUntilLoop

  def dispatch ST
toST(ExistentialLatticeQuantification e) 
  {  
  val block = stgf.getInstanceOf("block")
  if (e.quantified_variables !== null)
    for (v : e.quantified_variables.variables)
      block.add("a", v.toST)
  block.add("a", e.actions.toST)
  block
  }  //end of ExistentialLatticeQuantification

  def dispatch ST
toST(VariableDeclaration e) 
  {  
  val decl = stgf.getInstanceOf("decl")
  if (e.final)
    decl.add("v", toST("val"))
  else
    decl.add("v", toST("var"))
  decl.add("i", e.variable.name.toST)
  decl.add("t", e.variable.tod.toST)
  if (e.expression !== null)
    decl.add("e", e.expression.toST)
  else
    decl.add("e", toST("default_value"))
  decl
  }  //end of VariableDeclaration

  def dispatch ST
toST(TypeOrReference e) 
  {  
  toST("type or reference")
  }  //end of TypeOrReference


  def dispatch ST
toST(UniversalLatticeQuantification e) 
  {  

  }  //end of UniversalLatticeQuantification

  def dispatch ST
toST(NameTick e) 
  {  
  e.value.toST
  }  //end of NameTick


  
}
