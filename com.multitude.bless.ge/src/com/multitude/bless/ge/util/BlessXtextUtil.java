//BlessXtextUtil.java

package com.multitude.bless.ge.util;

import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.xbase.lib.Pair;
import org.osate.aadl2.Element;
import org.osate.ge.aadl2.AadlGraphicalEditorException;
import org.osate.ge.internal.ui.xtext.AgeXtextUtil;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.PeekingIterator;

/**
 * Utility class for working with Xtext documents and resources within the OSATE graphical editor's behavior annex plugin.
 *
 */
public class BlessXtextUtil {
	/**
	 * Private constructor to prevent instantiation.
	 */
	private BlessXtextUtil() {
	}

	/**
	 * Returns the source of the resource which contains the specified element. If an Xtext document is open for the resource, then the contents
	 * of the document will be returned.
	 * @param element the element for which to return the resource source text
	 * @return the source text of the resource which contains the specified element.
	 */
	public static String getText(final Element element) {
		final Resource resource = element.eResource();
		if (!(resource instanceof XtextResource)) {
			throw new AadlGraphicalEditorException("resource must be XtextResource");
		}

		final IXtextDocument xtextDocument = AgeXtextUtil.getDocumentByRootElement(element.getElementRoot());
		return getText(xtextDocument, (XtextResource) resource);
	}

	/**
	 * Returns the source contained in the Xtext document. If the Xtext document is null, then the source contained in the resource is returned.
	 * @param xtextDocument the {@link IXtextDocument} that contains the AADL source if not null
	 * @param xtextResource the {@link XtextResource} that contains the AADL source if the xtextDocument is null
	 * @return the complete source from the document or resource
	 */
	public static String getText(final IXtextDocument xtextDocument, final XtextResource xtextResource) {
		if (xtextDocument == null) {
			return xtextResource.getParseResult().getRootNode().getText();
		}

		return xtextDocument.get();
	}

	/**
	 * Finds the offset of the specified character in the specified string.  The character
	 * must be outside of any text that is bracketed by "{[" and "]}".
	 *
	 * @param str the string to search for the character
	 * @param ch the character to find in the string
	 *
	 * @throws RuntimeException if the character cannot be found
	 *
	 * @return the offset of the character in the string
	 */
	public static int findUncommentedTerminationChar(final String str, final char ch) {
		final ImmutableList<Character> openBrackets = ImmutableList.of('{', '[');
		final ImmutableList<Character> closeBrackets = ImmutableList.of('}', ']');
		final PeekingIterator<Character> charPeekingIt = Iterators.peekingIterator(Lists.charactersOf(str).iterator());
		for (int offset = 0; charPeekingIt.hasNext(); offset++) {
			final Character c = charPeekingIt.next();
			if (openBrackets.contains(c)) {
				// Find closing bracket before finding termination char
				offset = findClosingBracket(charPeekingIt, openBrackets, closeBrackets, offset);
			} else if (c == ch) {
				return offset;
			} else if (c == '-' && charPeekingIt.peek() == '-') {
				// Found comment, increase offset until end of line
				for (offset = offset + 1; charPeekingIt.hasNext(); offset++) {
					final Character tmp = charPeekingIt.next();
					if (tmp == '\n') {
						break;
					}
				}
			}
		}

		throw new RuntimeException("Cannot find terminating character");
	}

	private static int findClosingBracket(final Iterator<Character> charPeekingIt,
			final ImmutableList<Character> openBrackets, final ImmutableList<Character> closeBrackets, int offset) {
		int bracketsOpenCount = 1;
		for (; charPeekingIt.hasNext(); offset++) {
			final Character c = charPeekingIt.next();
			if (openBrackets.contains(c)) {
				bracketsOpenCount++;
			} else if (closeBrackets.contains(c)) {
				if (bracketsOpenCount == 1) {
					return offset + 1;
				} else {
					bracketsOpenCount--;
				}
			}
		}

		throw new RuntimeException("Could not find closing brackets.");
	}

	/**
	 * Finds the offset of the specified character pair in the specified string.
	 *
	 * @param str the string to search for the character pair
	 * @param charsToMatch the character pair to find in the string
	 *
	 * @throws RuntimeException if the character pair cannot be found
	 *
	 * @return the offset of the character pair in the string
	 */
	public static int findUncommentedCharPair(final String str, final Pair<Character, Character> charsToMatch) {
		final PeekingIterator<Character> charPeekingIt = Iterators
				.peekingIterator(str.chars().mapToObj(e -> (char) e).collect(Collectors.toList()).iterator());
		for (int offset = 0; charPeekingIt.hasNext(); offset++) {
			final Character c = charPeekingIt.next();
			if (Objects.equals(c, charsToMatch.getKey())
					&& Objects.equals(charPeekingIt.peek(), charsToMatch.getValue())) {
				return offset + 2;
			} else if (c == '-' && charPeekingIt.peek() == '-') {
				for (offset = offset + 1; charPeekingIt.hasNext(); offset++) {
					final Character tmp = charPeekingIt.next();
					if (tmp == '\n') {
						break;
					}
				}
			}
		}

		throw new RuntimeException("Cannot find character sequence " + charsToMatch.toString());
	}
}
