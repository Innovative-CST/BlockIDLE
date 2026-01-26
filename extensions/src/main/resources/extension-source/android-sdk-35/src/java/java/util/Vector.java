package java.util;

import java.io.Serializable;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Vector<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable {
	protected int capacityIncrement;
	protected int elementCount;
	@RecentlyNonNull
	protected Object[] elementData;

	public Vector(final int initialCapacity, final int capacityIncrement) {
		throw new RuntimeException("Stub!");
	}

	public Vector(final int initialCapacity) {
		throw new RuntimeException("Stub!");
	}

	public Vector() {
		throw new RuntimeException("Stub!");
	}

	public Vector(@RecentlyNonNull final Collection<? extends E> c) {
		throw new RuntimeException("Stub!");
	}

	public synchronized void copyInto(@RecentlyNonNull final Object[] anArray) {
		throw new RuntimeException("Stub!");
	}

	public synchronized void trimToSize() {
		throw new RuntimeException("Stub!");
	}

	public synchronized void ensureCapacity(final int minCapacity) {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setSize(final int newSize) {
		throw new RuntimeException("Stub!");
	}

	public synchronized int capacity() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized int size() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized boolean isEmpty() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Enumeration<E> elements() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean contains(@RecentlyNullable final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int indexOf(@RecentlyNullable final Object o) {
		throw new RuntimeException("Stub!");
	}

	public synchronized int indexOf(@RecentlyNullable final Object o, final int index) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized int lastIndexOf(@RecentlyNullable final Object o) {
		throw new RuntimeException("Stub!");
	}

	public synchronized int lastIndexOf(@RecentlyNullable final Object o, final int index) {
		throw new RuntimeException("Stub!");
	}

	public synchronized E elementAt(final int index) {
		throw new RuntimeException("Stub!");
	}

	public synchronized E firstElement() {
		throw new RuntimeException("Stub!");
	}

	public synchronized E lastElement() {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setElementAt(final E obj, final int index) {
		throw new RuntimeException("Stub!");
	}

	public synchronized void removeElementAt(final int index) {
		throw new RuntimeException("Stub!");
	}

	public synchronized void insertElementAt(final E obj, final int index) {
		throw new RuntimeException("Stub!");
	}

	public synchronized void addElement(final E obj) {
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean removeElement(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	public synchronized void removeAllElements() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized Object clone() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public synchronized Object[] toArray() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public synchronized <T> T[] toArray(@RecentlyNonNull final T[] a) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized E get(final int index) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized E set(final int index, final E element) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized boolean add(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean remove(@RecentlyNullable final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void add(final int index, final E element) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized E remove(final int index) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void clear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized boolean containsAll(@RecentlyNonNull final Collection<?> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean addAll(@RecentlyNonNull final Collection<? extends E> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean removeAll(@RecentlyNonNull final Collection<?> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean retainAll(@RecentlyNonNull final Collection<?> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean removeIf(@RecentlyNonNull final Predicate<? super E> filter) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized boolean addAll(final int index, @RecentlyNonNull final Collection<? extends E> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized boolean equals(@RecentlyNullable final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public synchronized String toString() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public synchronized List<E> subList(final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected synchronized void removeRange(final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public synchronized ListIterator<E> listIterator(final int index) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public synchronized ListIterator<E> listIterator() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public synchronized Iterator<E> iterator() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void forEach(@RecentlyNonNull final Consumer<? super E> action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void replaceAll(@RecentlyNonNull final UnaryOperator<E> operator) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void sort(@RecentlyNullable final Comparator<? super E> c) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Spliterator<E> spliterator() {
		throw new RuntimeException("Stub!");
	}
}
