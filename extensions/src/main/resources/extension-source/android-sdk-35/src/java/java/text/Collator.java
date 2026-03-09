package java.text;

import java.util.Comparator;
import java.util.Locale;

public abstract class Collator implements Comparator<Object>, Cloneable {
	public static final int CANONICAL_DECOMPOSITION = 1;
	public static final int FULL_DECOMPOSITION = 2;
	public static final int IDENTICAL = 3;
	public static final int NO_DECOMPOSITION = 0;
	public static final int PRIMARY = 0;
	public static final int SECONDARY = 1;
	public static final int TERTIARY = 2;

	protected Collator() {
		throw new RuntimeException("Stub!");
	}

	public static synchronized Collator getInstance() {
		throw new RuntimeException("Stub!");
	}

	public static Collator getInstance(final Locale desiredLocale) {
		throw new RuntimeException("Stub!");
	}

	public abstract int compare(final String p0, final String p1);

	@Override
	public int compare(final Object o1, final Object o2) {
		throw new RuntimeException("Stub!");
	}

	public abstract CollationKey getCollationKey(final String p0);

	public boolean equals(final String source, final String target) {
		throw new RuntimeException("Stub!");
	}

	public synchronized int getStrength() {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setStrength(final int newStrength) {
		throw new RuntimeException("Stub!");
	}

	public synchronized int getDecomposition() {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setDecomposition(final int decompositionMode) {
		throw new RuntimeException("Stub!");
	}

	public static synchronized Locale[] getAvailableLocales() {
		throw new RuntimeException("Stub!");
	}

	public Object clone() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object that) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract int hashCode();
}
