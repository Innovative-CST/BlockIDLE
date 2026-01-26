package java.util;

import java.io.Serializable;

public class LinkedHashSet<E> extends HashSet<E> implements SequencedSet<E>, Set<E>, Cloneable, Serializable {
	public LinkedHashSet(final int initialCapacity, final float loadFactor) {
		throw new RuntimeException("Stub!");
	}

	public LinkedHashSet(final int initialCapacity) {
		throw new RuntimeException("Stub!");
	}

	public LinkedHashSet() {
		throw new RuntimeException("Stub!");
	}

	public LinkedHashSet(final Collection<? extends E> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Spliterator<E> spliterator() {
		throw new RuntimeException("Stub!");
	}

	public static <T> LinkedHashSet<T> newLinkedHashSet(final int numElements) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void addFirst(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void addLast(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E getFirst() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E getLast() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E removeFirst() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E removeLast() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public SequencedSet<E> reversed() {
		throw new RuntimeException("Stub!");
	}
}
