package java.util.concurrent;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.Spliterator;

public class ConcurrentSkipListSet<E> extends AbstractSet<E> implements NavigableSet<E>, Cloneable, Serializable {
	public ConcurrentSkipListSet() {
		throw new RuntimeException("Stub!");
	}

	public ConcurrentSkipListSet(final Comparator<? super E> comparator) {
		throw new RuntimeException("Stub!");
	}

	public ConcurrentSkipListSet(final Collection<? extends E> c) {
		throw new RuntimeException("Stub!");
	}

	public ConcurrentSkipListSet(final SortedSet<E> s) {
		throw new RuntimeException("Stub!");
	}

	public ConcurrentSkipListSet<E> clone() {
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
	public boolean contains(final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean add(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean remove(final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void clear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Iterator<E> iterator() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Iterator<E> descendingIterator() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E lower(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E floor(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E ceiling(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E higher(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E pollFirst() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E pollLast() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Comparator<? super E> comparator() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E first() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E last() {
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
	public NavigableSet<E> subSet(final E fromElement, final boolean fromInclusive, final E toElement,
			final boolean toInclusive) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public NavigableSet<E> headSet(final E toElement, final boolean inclusive) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public NavigableSet<E> tailSet(final E fromElement, final boolean inclusive) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public NavigableSet<E> subSet(final E fromElement, final E toElement) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public NavigableSet<E> headSet(final E toElement) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public NavigableSet<E> tailSet(final E fromElement) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public NavigableSet<E> descendingSet() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Spliterator<E> spliterator() {
		throw new RuntimeException("Stub!");
	}
}
