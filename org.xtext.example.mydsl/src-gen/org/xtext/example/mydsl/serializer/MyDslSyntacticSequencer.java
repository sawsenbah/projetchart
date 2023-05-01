/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_CreateChart_RightParenthesisKeyword_13_q;
	protected AbstractElementAlias match_CsvLoader_RightParenthesisKeyword_4_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_CreateChart_RightParenthesisKeyword_13_q = new TokenAlias(false, true, grammarAccess.getCreateChartAccess().getRightParenthesisKeyword_13());
		match_CsvLoader_RightParenthesisKeyword_4_q = new TokenAlias(false, true, grammarAccess.getCsvLoaderAccess().getRightParenthesisKeyword_4());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_CreateChart_RightParenthesisKeyword_13_q.equals(syntax))
				emit_CreateChart_RightParenthesisKeyword_13_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CsvLoader_RightParenthesisKeyword_4_q.equals(syntax))
				emit_CsvLoader_RightParenthesisKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ')'?
	 *
	 * This ambiguous syntax occurs at:
	 *     xlabel=EString ',' 'ylabel : ' (ambiguity) (rule end)
	 *     ylabel+=EString (ambiguity) (rule end)
	 */
	protected void emit_CreateChart_RightParenthesisKeyword_13_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ')'?
	 *
	 * This ambiguous syntax occurs at:
	 *     path=EString (ambiguity) (rule end)
	 */
	protected void emit_CsvLoader_RightParenthesisKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}