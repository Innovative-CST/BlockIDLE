package java.util;

import java.io.Serializable;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PriorityQueue<E> extends AbstractQueue<E> implements Serializable {
	public PriorityQueue() {
		throw new RuntimeException("Stub!");
	}

	public PriorityQueue(final int initialCapacity) {
		throw new RuntimeException("Stub!");
	}

	public PriorityQueue(final Comparator<? super E> comparator) {
		throw new RuntimeException("Stub!");
	}

	public PriorityQueue(final int initialCapacity, final Comparator<? super E> comparator) {
		throw new RuntimeException("Stub!");
	}

	public PriorityQueue(final Collection<? extends E> c) {
		throw new RuntimeException("Stub!");
	}

	public PriorityQueue(final PriorityQueue<? extends E> c) {
		throw new RuntimeException("Stub!");
	}

	public PriorityQueue(final SortedSet<? extends E> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean add(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean offer(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E peek() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean remove(final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean contains(final Object o) {
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
	public int size() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void clear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E poll() {
		throw new RuntimeException("Stub!");
	}

	public Comparator<? super E> comparator() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final Spliterator<E> spliterator() {
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
