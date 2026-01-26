package java.util.concurrent;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CopyOnWriteArrayList<E> implements List<E>, RandomAccess, Cloneable, Serializable {
	public CopyOnWriteArrayList() {
		throw new RuntimeException("Stub!");
	}

	public CopyOnWriteArrayList(@RecentlyNonNull final Collection<? extends E> c) {
		throw new RuntimeException("Stub!");
	}

	public CopyOnWriteArrayList(@RecentlyNonNull final E[] toCopyIn) {
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
	public int indexOf(@RecentlyNullable final Object o) {
		throw new RuntimeException("Stub!");
	}

	public int indexOf(@RecentlyNullable final E e, final int index) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int lastIndexOf(@RecentlyNullable final Object o) {
		throw new RuntimeException("Stub!");
	}

	public int lastIndexOf(@RecentlyNullable final E e, final int index) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Object clone() {
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

	@Override
	public E get(final int index) {
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
	public E set(final int index, final E element) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean add(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void add(final int index, final E element) {
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
	public E remove(final int index) {
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
	public boolean remove(@RecentlyNullable final Object o) {
		throw new RuntimeException("Stub!");
	}

	public boolean addIfAbsent(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean containsAll(@RecentlyNonNull final Collection<?> c) {
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

	public int addAllAbsent(@RecentlyNonNull final Collection<? extends E> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void clear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean addAll(@RecentlyNonNull final Collection<? extends E> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean addAll(final int index, @RecentlyNonNull final Collection<? extends E> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void forEach(@RecentlyNonNull final Consumer<? super E> action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean removeIf(@RecentlyNonNull final Predicate<? super E> filter) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void replaceAll(@RecentlyNonNull final UnaryOperator<E> operator) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void sort(@RecentlyNullable final Comparator<? super E> c) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Iterator<E> iterator() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public ListIterator<E> listIterator() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public ListIterator<E> listIterator(final int index) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Spliterator<E> spliterator() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public List<E> subList(final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public List<E> reversed() {
		throw new RuntimeException("Stub!");
	}
}
