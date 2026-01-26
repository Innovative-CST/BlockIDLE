package java.util.concurrent;

import java.io.Serializable;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PriorityBlockingQueue<E> extends AbstractQueue<E> implements BlockingQueue<E>, Serializable {
	public PriorityBlockingQueue() {
		throw new RuntimeException("Stub!");
	}

	public PriorityBlockingQueue(final int initialCapacity) {
		throw new RuntimeException("Stub!");
	}

	public PriorityBlockingQueue(final int initialCapacity, final Comparator<? super E> comparator) {
		throw new RuntimeException("Stub!");
	}

	public PriorityBlockingQueue(final Collection<? extends E> c) {
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
	public void put(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean offer(final E e, final long timeout, final TimeUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E poll() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E take() throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E poll(final long timeout, final TimeUnit unit) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E peek() {
		throw new RuntimeException("Stub!");
	}

	public Comparator<? super E> comparator() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int size() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int remainingCapacity() {
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
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int drainTo(final Collection<? super E> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int drainTo(final Collection<? super E> c, final int maxElements) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void clear() {
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
