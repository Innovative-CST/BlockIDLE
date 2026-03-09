package java.text;

import java.util.Locale;

public abstract class BreakIterator implements Cloneable {
	public static final int DONE = -1;

	protected BreakIterator() {
		throw new RuntimeException("Stub!");
	}

	public Object clone() {
		throw new RuntimeException("Stub!");
	}

	public abstract int first();

	public abstract int last();

	public abstract int next(final int p0);

	public abstract int next();

	public abstract int previous();

	public abstract int following(final int p0);

	public int preceding(final int offset) {
		throw new RuntimeException("Stub!");
	}

	public boolean isBoundary(final int offset) {
		throw new RuntimeException("Stub!");
	}

	public abstract int current();

	public abstract CharacterIterator getText();

	public void setText(final String newText) {
		throw new RuntimeException("Stub!");
	}

	public abstract void setText(final CharacterIterator p0);

	public static BreakIterator getWordInstance() {
		throw new RuntimeException("Stub!");
	}

	public static BreakIterator getWordInstance(final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	public static BreakIterator getLineInstance() {
		throw new RuntimeException("Stub!");
	}

	public static BreakIterator getLineInstance(final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	public static BreakIterator getCharacterInstance() {
		throw new RuntimeException("Stub!");
	}

	public static BreakIterator getCharacterInstance(final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	public static BreakIterator getSentenceInstance() {
		throw new RuntimeException("Stub!");
	}

	public static BreakIterator getSentenceInstance(final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	public static synchronized Locale[] getAvailableLocales() {
		throw new RuntimeException("Stub!");
	}
}
