//BlessBusinessObjectProvider.java

package com.multitude.bless.ge;

import java.util.stream.Stream;

import org.osate.aadl2.Classifier;
import org.osate.aadl2.Element;
import org.osate.aadl2.Subcomponent;
import org.osate.ge.BusinessObjectProvider;
import org.osate.ge.BusinessObjectProviderContext;
import org.osate.ge.aadl2.GraphicalAnnexUtil;

import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.BehaviorTransition;
import com.multitude.aadl.bless.bLESS.DispatchCondition;
import com.multitude.aadl.bless.bLESS.ExecuteCondition;
import com.multitude.aadl.bless.bLESS.InternalCondition;
import com.multitude.aadl.bless.bLESS.ModeCondition;
import com.multitude.bless.ge.util.BlessReferenceUtil;

/**
 * Business object provider which provides behavior annex model elements to the OSATE graphical editor
 */
public class BlessBusinessObjectProvider implements BusinessObjectProvider {
	@Override
	public Stream<?> getChildBusinessObjects(final BusinessObjectProviderContext ctx) {
		final Object bo = ctx.getBusinessObjectContext().getBusinessObject();
		return getChildBusinessObjects(bo);
	}

/**
 * Returns {@link BehaviorAnnex} children of the business object
 */
private Stream<?> getChildBusinessObjects(final Object bo)
  {
  if (bo instanceof Classifier)
    {
    return getBLESSSubclauses((Classifier) bo);
    } 
  else if (bo instanceof Subcomponent)
    {
    final Subcomponent sc = (Subcomponent) bo;
    return getChildBusinessObjects(sc.getAllClassifier());
    } 
  else if (bo instanceof BLESSSubclause)
    {
    final BLESSSubclause   bsc = (BLESSSubclause) bo;
    Stream<Element>        cbo = Stream.empty();
    if (bsc.getAssert_clause() != null)
      cbo = Stream.concat(cbo, bsc.getAssert_clause().getAssertions().stream());
    if (bsc.getInvariant() != null)
      cbo = Stream.concat(cbo, Stream.of(bsc.getInvariant().getInv()));
    if (bsc.getVariables() != null)
      cbo = Stream.concat(cbo, bsc.getVariables().getBehavior_variables().stream());
    if (bsc.getStatesSection() != null)
      cbo = Stream.concat(cbo, bsc.getStatesSection().getStates().stream());
    if (bsc.getTransitions() != null)
      cbo = Stream.concat(cbo, bsc.getTransitions().getBt().stream());
    return cbo;

    } 
  else if (bo instanceof BehaviorTransition)
    {
    final BehaviorTransition bt = (BehaviorTransition) bo;
    if (bt.getDispatch() != null)
      {
      final DispatchCondition dc = bt.getDispatch();
      return Stream.of(dc);
      } else if (bt.getExecute() != null)
      {
      final ExecuteCondition dc = bt.getExecute();
      return Stream.of(dc);
      } else if (bt.getMode() != null)
      {
      final ModeCondition dc = bt.getMode();
      return Stream.of(dc);
      } else if (bt.getInternal() != null)
      {
      final InternalCondition dc = bt.getInternal();
      return Stream.of(dc);
      }
    }

  return Stream.empty();
  }

	/**
	 * Returns all behavior annexes owned by the classifier
	 */
	private static Stream<BLESSSubclause> getBLESSSubclauses(final Classifier c) {
		return GraphicalAnnexUtil.getAllParsedAnnexSubclauses(c, BlessReferenceUtil.ANNEX_NAME,
		    BLESSSubclause.class);
	}
}
