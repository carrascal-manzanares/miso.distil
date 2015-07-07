/*
 * generated by Xtext
 */
package miso.carrascal.codeGenerator.serializer;

import com.google.inject.Inject;
import java.util.List;
import miso.carrascal.codeGenerator.services.RulesGrammarAccess;
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
public abstract class AbstractRulesSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RulesGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Artifact___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_4__q;
	protected AbstractElementAlias match_MultiService___LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RulesGrammarAccess) access;
		match_Artifact___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getArtifactAccess().getLeftSquareBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getArtifactAccess().getRightSquareBracketKeyword_3_4()));
		match_MultiService___LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getMultiServiceAccess().getLeftSquareBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getMultiServiceAccess().getRightSquareBracketKeyword_2_2()));
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
			if(match_Artifact___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_4__q.equals(syntax))
				emit_Artifact___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultiService___LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q.equals(syntax))
				emit_MultiService___LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=EString (ambiguity) '{' '}' (rule end)
	 *     name=EString (ambiguity) '{' attributes+=Attribute
	 */
	protected void emit_Artifact___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=EString (ambiguity) '{' 'services : ' services+=[Service|EString]
	 *     name=EString (ambiguity) '{' 'when : ' when+=OnService
	 */
	protected void emit_MultiService___LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
