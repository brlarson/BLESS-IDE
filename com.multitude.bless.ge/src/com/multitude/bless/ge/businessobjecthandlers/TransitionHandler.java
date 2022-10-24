//TransitionHandler.java

package com.multitude.bless.ge.businessobjecthandlers;

import java.util.Optional;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osate.aadl2.Element;
import org.osate.aadl2.NamedElement;
import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.BehaviorTransition;
import com.multitude.bless.ge.util.BlessNamingUtil;
import com.multitude.bless.ge.util.BlessReferenceUtil;

import org.osate.ge.BusinessObjectContext;
import org.osate.ge.CanonicalBusinessObjectReference;
import org.osate.ge.GraphicalConfiguration;
import org.osate.ge.GraphicalConfigurationBuilder;
import org.osate.ge.RelativeBusinessObjectReference;
import org.osate.ge.businessobjecthandling.BusinessObjectHandler;
import org.osate.ge.businessobjecthandling.CanCopyContext;
import org.osate.ge.businessobjecthandling.CanDeleteContext;
import org.osate.ge.businessobjecthandling.CanRenameContext;
import org.osate.ge.businessobjecthandling.CustomDeleteContext;
import org.osate.ge.businessobjecthandling.CustomDeleter;
import org.osate.ge.businessobjecthandling.CustomRenamer;
import org.osate.ge.businessobjecthandling.GetGraphicalConfigurationContext;
import org.osate.ge.businessobjecthandling.GetNameContext;
import org.osate.ge.businessobjecthandling.IsApplicableContext;
import org.osate.ge.businessobjecthandling.ReferenceContext;
import org.osate.ge.businessobjecthandling.RenameContext;
import org.osate.ge.graphics.ArrowBuilder;
import org.osate.ge.graphics.ConnectionBuilder;
import org.osate.ge.graphics.Graphic;
import org.osate.ge.graphics.Style;
import org.osate.ge.query.ExecutableQuery;
import org.osate.ge.services.QueryService;

/**
 * Business Object Handler for {@link BehaviorTransition} objects.
 */
public class TransitionHandler implements BusinessObjectHandler, CustomDeleter, CustomRenamer 
{

	private static final ExecutableQuery<BehaviorTransition> 
	SRC_QUERY = ExecutableQuery.<BehaviorTransition> create(
			rootQuery -> rootQuery.parent().children().filterByBusinessObjectRelativeReference(bt -> {
// BA has "Declarative" versions of state machine elements			
//				if (bt instanceof DeclarativeBehaviorTransition) {
//					final DeclarativeBehaviorTransition dt = (DeclarativeBehaviorTransition) bt;
//					if (!dt.getSrcStates().isEmpty()) {
//						final Identifier src = dt.getSrcStates().get(0);
//						final BLESSSubclause ba = (BLESSSubclause) bt.getOwner();
//						return getState(ba, src.getId());
//					}
//				}
// BA returns only a single source state when there's more than one.
				return bt.getSources().get(0);
			}));

	private static final ExecutableQuery<BehaviorTransition> DST_QUERY = ExecutableQuery
			.create(rootQuery -> rootQuery.parent().children().filterByBusinessObjectRelativeReference(bt -> {
//				if (bt instanceof DeclarativeBehaviorTransition) {
//					final DeclarativeBehaviorTransition dt = (DeclarativeBehaviorTransition) bt;
//					final Identifier dest = dt.getDestState();
//					if (dest != null) {
//						final BLESSSubclause ba = (BLESSSubclause) bt.getOwner();
//						return getState(ba, dest.getId());
//					}
//				}

				return bt.getDestination();
			}));

	private static Element getState(final BLESSSubclause bsc, final String id) {
		return bsc.getChildren()
				.stream()
				.filter(c -> c instanceof NamedElement && id.equals(((NamedElement) c).getName()))
				.findAny()
				.orElse(null);
	}

	private static final Graphic TRANSITION_CONNECTION_GRAPHIC = ConnectionBuilder.create()
			.destinationTerminator(ArrowBuilder.create().small().filled().build())
			.build();

	@Override
	public boolean isApplicable(final IsApplicableContext ctx) {
		return ctx.getBusinessObject(BehaviorTransition.class).isPresent();
	}

	@Override
	public boolean canDelete(final CanDeleteContext ctx) {
		return true;
	}

	@Override
	public boolean canCopy(final CanCopyContext ctx) {
		return false;
	}

	@Override
	public boolean canRename(final CanRenameContext ctx) {
		return true;
	}

	@Override
	public CanonicalBusinessObjectReference getCanonicalReference(final ReferenceContext ctx) {
		final BehaviorTransition behaviorTransition = ctx.getBusinessObject(BehaviorTransition.class).orElseThrow();
		final BLESSSubclause blessAnnex = (BLESSSubclause) behaviorTransition.getOwner().getOwner();
		final int index = blessAnnex.getTransitions().getBt().indexOf(behaviorTransition);
		return new CanonicalBusinessObjectReference(BlessReferenceUtil.TRANSITION_TYPE, Integer.toString(index),
				ctx.getReferenceBuilder().getCanonicalReference(blessAnnex).encode());
	}

	@Override
	public RelativeBusinessObjectReference getRelativeReference(final ReferenceContext ctx) {
		final BehaviorTransition behaviorTransition = ctx.getBusinessObject(BehaviorTransition.class).orElseThrow();
		final String refSeg = getTransitionReference((BLESSSubclause) behaviorTransition.getOwner().getOwner(), behaviorTransition);
		return BlessReferenceUtil.getTransitionRelativeReference(refSeg);
	}

	private static String getTransitionReference(final BLESSSubclause behaviorAnnex,
			final BehaviorTransition behaviorTransition) {
		final String name = behaviorTransition.getName();
		if (name == null) {
			final int index = behaviorAnnex.getTransitions().getBt().indexOf(behaviorTransition);
			return Integer.toString(index);
		}

		return name;
	}

	@Override
	public String getNameForRenaming(final GetNameContext ctx) {
		return ctx.getBusinessObject(BehaviorTransition.class).map(BehaviorTransition::getName).get(); //.orElse("");
	}

	@Override
	public Optional<GraphicalConfiguration> getGraphicalConfiguration(final GetGraphicalConfigurationContext ctx) {
		final BusinessObjectContext boc = ctx.getBusinessObjectContext();
		final QueryService queryService = ctx.getQueryService();
		return Optional.of(GraphicalConfigurationBuilder.create()
				.graphic(TRANSITION_CONNECTION_GRAPHIC)
				.style(Style.EMPTY)
				.source(getSource(boc, queryService))
				.destination(getDestination(boc, queryService))
				.build());
	}

	private BusinessObjectContext getSource(final BusinessObjectContext boc, final QueryService queryService) {
		return queryService.getFirstBusinessObjectContextOrNull(SRC_QUERY, boc,
				boc.getBusinessObject(BehaviorTransition.class).orElseThrow());
	}

	private BusinessObjectContext getDestination(final BusinessObjectContext boc, final QueryService queryService) {
		return queryService.getFirstBusinessObjectContextOrNull(DST_QUERY, boc,
				boc.getBusinessObject(BehaviorTransition.class).orElseThrow());
	}

	@Override
	public String getName(final GetNameContext ctx) {
		return ctx.getBusinessObject(BehaviorTransition.class).map(BehaviorTransition::getName).get(); //.orElse("");
	}

	@Override
	public Optional<String> validateName(final RenameContext ctx) {
		// Allow removing name of transition
		final String newName = ctx.getNewName();
		if (newName.isEmpty()) {
			return Optional.empty();
		}

		return BlessNamingUtil.checkNameValidity(ctx);
	}

	@Override
	public void delete(final CustomDeleteContext ctx) {
		final BLESSSubclause behaviorAnnex = ctx.getContainerBusinessObject(BLESSSubclause.class).orElseThrow();
		// Find transition by URI.
		final BehaviorTransition behaviorTransition = (BehaviorTransition) behaviorAnnex.eResource()
				.getResourceSet()
				.getEObject(EcoreUtil.getURI(ctx.getReadonlyBoToDelete(BehaviorTransition.class).orElseThrow()), true);
		EcoreUtil.remove(behaviorTransition);
//		if (behaviorAnnex.getTransitions().getBt().isEmpty()) {
//			behaviorAnnex.unsetTransitions();
//		}
	}

	@Override
	public void rename(final RenameContext ctx) {
		final BehaviorTransition behaviorTransition = ctx.getBusinessObject(BehaviorTransition.class).orElseThrow();
		final String newName = ctx.getNewName();
		// An unnamed transition's name must be set to null
		behaviorTransition.setName(newName.isEmpty() ? "" : newName);
	}
}
