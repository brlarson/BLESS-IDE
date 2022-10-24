//BlessNamingUtil.java

package com.multitude.bless.ge.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.DataSubcomponent;
import org.osate.aadl2.Element;
import org.osate.aadl2.Mode;
import org.osate.aadl2.NamedElement;
import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.BehaviorState;
import com.multitude.aadl.bless.bLESS.BehaviorTransition;
import com.multitude.aadl.bless.bLESS.VariableDeclaration;

import org.osate.ge.aadl2.internal.util.AgeAadlUtil;
import org.osate.ge.businessobjecthandling.RenameContext;

/**
 * Utility class for naming behavior annex elements
 *
 */
public final class BlessNamingUtil {
	/**
	 * Private constructor to prevent instantiation.
	 */
	private BlessNamingUtil() {
	}

	private final static Set<String> RESERVED_WORDS; // Set which compares entries base on a case-insensitive comparison
	static {
		RESERVED_WORDS = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		RESERVED_WORDS.addAll(Arrays.asList(
		    "abs", "all", "and", "any", "are", "array", "assert", "base", "bound", "binding", "boolean", 
		    "case", "catch", "classifier", "complete", "computation", "constant",
				"count", "declare", "def", "dispatch", "div", "do", "else", "elsif", "end", "enumeration", "exists", "exception",
				"false", "fi", "final", "for", "forall", "fresh", "frozen", "ghost",
				"if", "iff", "implies", "in", "initial", "internal", "invariant", "is", "lower_bound", "mod", "not", "now", "numberof", "nonvolatile", "null",
				"of", "on", "or", "otherwise", "pre", "post", "product", "quantity", "record", "reference", "representation", "returns", "round",
				"rem", "scalar", "self", "shared", "skip", "spread", "state", "states", "step", "stop", "string", "sum", 
				"that", "then", "throw", "throws", "timeout", "tops", "transitions", "true", "truncate", "type",
				"union", "until", "updated", "upper_bound", "variables", "variant", "while", "which", "whole",
				"xor"));
	}

	/**
	 * Creates a new unique identifier
	 * @param ba the behavior annex for which the identifier must be unique
	 * @param baseIdentifier the identifier to start with when building the identifier. If this identifier is unique, it will be returned.
	 * @return a new unique identifier
	 */
	public static String buildUniqueIdentifier(final BLESSSubclause ba, final String baseIdentifier) {
		final Set<String> existingIdentifiers = buildNameSet(ba);
		return buildUniqueIdentifier(existingIdentifiers, baseIdentifier);
	}

	private static String buildUniqueIdentifier(final Set<String> existingIdentifiers, final String baseIdentifier) {
		// Resolve naming conflicts
		String newIdentifier = baseIdentifier;
		boolean done = false;
		int num = 1;
		do {
			if (existingIdentifiers.contains(newIdentifier.toLowerCase())) {
				num++;
				newIdentifier = baseIdentifier + num;
			} else {
				done = true;
			}
		} while (!done);

		return newIdentifier;
	}

private static Set<String> buildNameSet(final BLESSSubclause ba)
  {
  final Set<String> names = new HashSet<String>();
  if (ba.getStatesSection() != null)
    addToNameSet(names, ba.getStatesSection().getStates());
  if (ba.getVariables() != null)
    for (VariableDeclaration vd : ba.getVariables().getBehavior_variables())
      names.add(vd.getVariable().getName());
  if (ba.getTransitions() != null)
    for (BehaviorTransition bt : ba.getTransitions().getBt())
      names.add(bt.getName());
  return names;
  }

	private static void addToNameSet(final Set<String> names, final Collection<? extends NamedElement> elements) {
		for (final NamedElement el : elements) {
			if (el.getName() != null) {
				names.add(el.getName().toLowerCase());
			}
		}
	}

	/**
	 * Determines whether a specified string is a valid AADL identifier
	 * @param value
	 * @return
	 */
	private static boolean isValidIdentifier(final String value) {
		if (RESERVED_WORDS.contains(value)) {
			return false;
		}

		return value.matches("[a-zA-Z]([_]?[a-zA-Z0-9])*+");
	}

	/**
	 * Returns whether an behavior annex element is conflicting with features, modes, or data subcomponents.
	 */
	private static boolean nameIsConflictingInClassifiers(final Classifier classifier,
			final String newName) {
		final Stream.Builder<String> builder = Stream.builder();
		classifier.getAllFeatures().forEach(feature -> builder.add(feature.getName()));

		if (classifier instanceof ComponentImplementation) {
			((ComponentImplementation) classifier).getAllSubcomponents().stream()
					.filter(sc -> sc instanceof DataSubcomponent)
					.forEach(sc -> builder.add(AgeAadlUtil.getRootRefinedElement(sc).getName()));
		}

		return builder.build().anyMatch(name -> newName.equalsIgnoreCase(name));
	}

	/**
	 * Check if behavior element new name is valid.
	 * @param ctx the context containing the information regarding the proposed rename
	 * @return empty if the name is valid. Otherwise returns the error message
	 */
	public static Optional<String> checkNameValidity(final RenameContext ctx) {
		final NamedElement ne = ctx.getBusinessObject(NamedElement.class).orElseThrow();
		final String newName = ctx.getNewName();
		return checkNameValidity(ne, newName);
	}

	/**
	 * Check if behavior element new name is valid.
	 * @param ne the named element to check
	 * @param newName the proposed name
	 * @return empty if the name is valid.  Otherwise return the error message
	 */
	public static Optional<String> checkNameValidity(final NamedElement ne, final String newName) {
		if (newName.equalsIgnoreCase(ne.getName())) {
			return Optional.empty();
		}

		if (!BlessNamingUtil.isValidIdentifier(newName)) {
			return Optional.of("The specified name is not a valid AADL identifier");
		}

		// Check for conflicts in the owning behavior annex
		final Element owner = ne.getOwner();
		if (BlessNamingUtil.isNameInUseInBehaviorAnnex(owner, newName)) {
			return Optional.of("The specified name conflicts with an existing member of the behavior annex.");
		}

		if (ne instanceof BehaviorState) {
			final BehaviorState behaviorState = (BehaviorState) ne;
			final Optional<String> modeNameMatch = getModeNames(behaviorState.getContainingClassifier())
					.filter(modeName -> newName.equalsIgnoreCase(modeName)).findAny();
			// States can match mode names
			if (modeNameMatch.isPresent()) {
				return Optional.empty();
			}
		}

		// Check for conflicts of modes, features, and data subcomponents, including inherited elements.
		if (BlessNamingUtil.nameIsConflictingInClassifiers(ne.getContainingClassifier(),
				newName)) {
			return Optional.of("The specified name conflicts with an existing element.");
		}

		return Optional.empty();
	}

	private static Stream<String> getModeNames(final Classifier classifier) {
		if (classifier instanceof ComponentClassifier) {
			return ((ComponentClassifier) classifier).getAllModes().stream().map(Mode::getName);
		}

		return Stream.empty();
	}

	private static boolean isNameInUseInBehaviorAnnex(final Element owner, final String newName) {
		return owner.getChildren().stream().anyMatch(child -> {
			if (child instanceof NamedElement) {
				final NamedElement ne = (NamedElement) child;
				return newName.equalsIgnoreCase(ne.getName());
			}

			return false;
		});
	}
}
