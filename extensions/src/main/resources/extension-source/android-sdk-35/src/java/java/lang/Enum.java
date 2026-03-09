package java.lang;

import java.io.Serializable;

public abstract class Enum<E extends Enum<E>> implements Comparable<E>, Serializable {
	protected Enum(@RecentlyNonNull final String name, final int ordinal) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public final String name() {
		throw new RuntimeException("Stub!");
	}

	public final int ordinal() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final boolean equals(@RecentlyNullable final Object other) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	protected final Object clone() throws CloneNotSupportedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final int compareTo(final E o) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public final Class<E> getDeclaringClass() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T extends Enum<T>> T valueOf(@RecentlyNonNull final Class<T> enumClass,
			@RecentlyNonNull final String name) {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected final void finalize() {
		throw new RuntimeException("Stub!");
	}
}
