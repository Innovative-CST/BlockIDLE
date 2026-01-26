package java.lang;

import java.io.Serializable;

public final class Boolean implements Serializable, Comparable<Boolean> {
	public static final Boolean FALSE;
	public static final Boolean TRUE;
	public static final Class<Boolean> TYPE;

	@Deprecated
	public Boolean(final boolean value) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public Boolean(@RecentlyNullable final String s) {
		throw new RuntimeException("Stub!");
	}

	public static boolean parseBoolean(@RecentlyNullable final String s) {
		throw new RuntimeException("Stub!");
	}

	public boolean booleanValue() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Boolean valueOf(final boolean b) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Boolean valueOf(@RecentlyNullable final String s) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toString(final boolean b) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	public static int hashCode(final boolean value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	public static boolean getBoolean(@RecentlyNonNull final String name) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(@RecentlyNonNull final Boolean b) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(final boolean x, final boolean y) {
		throw new RuntimeException("Stub!");
	}

	public static boolean logicalAnd(final boolean a, final boolean b) {
		throw new RuntimeException("Stub!");
	}

	public static boolean logicalOr(final boolean a, final boolean b) {
		throw new RuntimeException("Stub!");
	}

	public static boolean logicalXor(final boolean a, final boolean b) {
		throw new RuntimeException("Stub!");
	}

	static {
		FALSE = null;
		TRUE = null;
		TYPE = null;
	}
}
