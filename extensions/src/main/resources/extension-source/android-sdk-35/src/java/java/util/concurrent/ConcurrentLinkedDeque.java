package java.util.concurrent;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConcurrentLinkedDeque<E> extends AbstractCollection<E> implements Deque<E>, Serializable {
	public ConcurrentLinkedDeque() {
		throw new RuntimeException("Stub!");
	}

	public ConcurrentLinkedDeque(final Collection<? extends E> c) {
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
	public boolean offerFirst(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean offerLast(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E peekFirst() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E peekLast() {
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
	public E pollFirst() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E pollLast() {
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
	public boolean offer(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean add(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E poll() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E peek() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E remove() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E pop() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E element() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void push(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean removeFirstOccurrence(final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean removeLastOccurrence(final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean contains(final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isEmpty() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int size() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean remove(final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean addAll(final Collection<? extends E> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void clear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Object[] toArray() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <T> T[] toArray(final T[] a) {
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
	public Spliterator<E> spliterator() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean removeIf(final Predicate<? super E> filter) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void forEach(final Consumer<? super E> action) {
		throw new RuntimeException("Stub!");
	}
}
