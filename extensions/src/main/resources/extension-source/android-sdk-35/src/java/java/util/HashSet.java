package java.util;

import java.io.Serializable;

public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable {
	public HashSet() {
		throw new RuntimeException("Stub!");
	}

	public HashSet(@RecentlyNonNull final Collection<? extends E> c) {
		throw new RuntimeException("Stub!");
	}

	public HashSet(final int initialCapacity, final float loadFactor) {
		throw new RuntimeException("Stub!");
	}

	public HashSet(final int initialCapacity) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Iterator<E> iterator() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int size() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isEmpty() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean contains(@RecentlyNullable final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean add(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean remove(@RecentlyNullable final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void clear() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Object clone() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Spliterator<E> spliterator() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Object[] toArray() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public <T> T[] toArray(@RecentlyNonNull final T[] a) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> HashSet<T> newHashSet(final int numElements) {
		throw new RuntimeException("Stub!");
	}
}
