/*
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.33.0
 from BLESS.xtext, by BRL 
 */
package com.multitude.aadl.bless.serializer;

import com.google.inject.Inject;
import com.multitude.aadl.bless.services.BLESSGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractBLESSSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BLESSGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BehaviorState_SemicolonKeyword_8_q;
	protected AbstractElementAlias match_BehaviorTransition_SemicolonKeyword_10_q;
	protected AbstractElementAlias match_BehaviorTransition___LeftCurlyBracketKeyword_8_0_RightCurlyBracketKeyword_8_2__q;
	protected AbstractElementAlias match_DispatchTrigger_OrKeyword_1_1_0_2_0_q;
	protected AbstractElementAlias match_RecordValue_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_VariableDeclaration_SemicolonKeyword_4_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BLESSGrammarAccess) access;
		match_BehaviorState_SemicolonKeyword_8_q = new TokenAlias(false, true, grammarAccess.getBehaviorStateAccess().getSemicolonKeyword_8());
		match_BehaviorTransition_SemicolonKeyword_10_q = new TokenAlias(false, true, grammarAccess.getBehaviorTransitionAccess().getSemicolonKeyword_10());
		match_BehaviorTransition___LeftCurlyBracketKeyword_8_0_RightCurlyBracketKeyword_8_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getBehaviorTransitionAccess().getLeftCurlyBracketKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getBehaviorTransitionAccess().getRightCurlyBracketKeyword_8_2()));
		match_DispatchTrigger_OrKeyword_1_1_0_2_0_q = new TokenAlias(false, true, grammarAccess.getDispatchTriggerAccess().getOrKeyword_1_1_0_2_0());
		match_RecordValue_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getRecordValueAccess().getSemicolonKeyword_3());
		match_VariableDeclaration_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_4());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getDOTDOTRule())
			return getDOTDOTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTIMESRule())
			return getTIMESToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal DOTDOT: '..';
	 */
	protected String getDOTDOTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "..";
	}
	
	/**
	 * TIMES : '*';
	 */
	protected String getTIMESToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "*";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_BehaviorState_SemicolonKeyword_8_q.equals(syntax))
				emit_BehaviorState_SemicolonKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_BehaviorTransition_SemicolonKeyword_10_q.equals(syntax))
				emit_BehaviorTransition_SemicolonKeyword_10_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_BehaviorTransition___LeftCurlyBracketKeyword_8_0_RightCurlyBracketKeyword_8_2__q.equals(syntax))
				emit_BehaviorTransition___LeftCurlyBracketKeyword_8_0_RightCurlyBracketKeyword_8_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DispatchTrigger_OrKeyword_1_1_0_2_0_q.equals(syntax))
				emit_DispatchTrigger_OrKeyword_1_1_0_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RecordValue_SemicolonKeyword_3_q.equals(syntax))
				emit_RecordValue_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_VariableDeclaration_SemicolonKeyword_4_q.equals(syntax))
				emit_VariableDeclaration_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     complete?='complete' 'state' (ambiguity) (rule end)
	 *     final?='final' 'state' (ambiguity) (rule end)
	 *     initial?='initial' 'state' (ambiguity) (rule end)
	 *     mode?='mode' 'state' (ambiguity) (rule end)
	 *     name=ID ':' 'state' (ambiguity) (rule end)
	 *     state_assertion=Assertion (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_BehaviorState_SemicolonKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     actions=BehaviorActions '}' (ambiguity) (rule end)
	 *     ass=Assertion (ambiguity) (rule end)
	 *     destination=[BehaviorState|ID] ('{' '}')? (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_BehaviorTransition_SemicolonKeyword_10_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     destination=[BehaviorState|ID] (ambiguity) ';'? (rule end)
	 *     destination=[BehaviorState|ID] (ambiguity) ass=Assertion
	 
	 * </pre>
	 */
	protected void emit_BehaviorTransition___LeftCurlyBracketKeyword_8_0_RightCurlyBracketKeyword_8_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'or'?
	 *
	 * This ambiguous syntax occurs at:
	 *     ports+=[NamedElement|ID] (ambiguity) ports+=[NamedElement|ID]
	 
	 * </pre>
	 */
	protected void emit_DispatchTrigger_OrKeyword_1_1_0_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     aval=Value (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_RecordValue_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     assertion=Assertion (ambiguity) (rule end)
	 *     constant?='constant' (ambiguity) (rule end)
	 *     expression=Expression (ambiguity) (rule end)
	 *     final?='final' (ambiguity) (rule end)
	 *     nonvolatile?='nonvolatile' (ambiguity) (rule end)
	 *     shared?='shared' (ambiguity) (rule end)
	 *     spread?='spread' (ambiguity) (rule end)
	 *     variable=Variable (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_VariableDeclaration_SemicolonKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
