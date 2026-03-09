package java.util;

import java.io.Serializable;

public abstract class EnumSet<E extends Enum<E>> extends AbstractSet<E> implements Cloneable, Serializable {
	EnumSet() {
		throw new RuntimeException("Stub!");
	}

	public static <E extends Enum<E>> EnumSet<E> noneOf(final Class<E> elementType) {
		throw new RuntimeException("Stub!");
	}

	public static <E extends Enum<E>> EnumSet<E> allOf(final Class<E> elementType) {
		throw new RuntimeException("Stub!");
	}

	public static <E extends Enum<E>> EnumSet<E> copyOf(final EnumSet<E> s) {
		throw new RuntimeException("Stub!");
	}

	public static <E extends Enum<E>> EnumSet<E> copyOf(final Collection<E> c) {
		throw new RuntimeException("Stub!");
	}

	public static <E extends Enum<E>> EnumSet<E> complementOf(final EnumSet<E> s) {
		throw new RuntimeException("Stub!");
	}

	public static <E extends Enum<E>> EnumSet<E> of(final E e) {
		throw new RuntimeException("Stub!");
	}

	public static <E extends Enum<E>> EnumSet<E> of(final E e1, final E e2) {
		throw new RuntimeException("Stub!");
	}

	public static <E extends Enum<E>> EnumSet<E> of(final E e1, final E e2, final E e3) {
		throw new RuntimeException("Stub!");
	}

	public static <E extends Enum<E>> EnumSet<E> of(final E e1, final E e2, final E e3, final E e4) {
		throw new RuntimeException("Stub!");
	}

	public static <E extends Enum<E>> EnumSet<E> of(final E e1, final E e2, final E e3, final E e4, final E e5) {
		throw new RuntimeException("Stub!");
	}

	@SafeVarargs
	public static <E extends Enum<E>> EnumSet<E> of(final E first, final E... rest) {
		throw new RuntimeException("Stub!");
	}

	public static <E extends Enum<E>> EnumSet<E> range(final E from, final E to) {
		throw new RuntimeException("Stub!");
	}

	public EnumSet<E> clone() {
		throw new RuntimeException("Stub!");
	}
}
