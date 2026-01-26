package java.util.concurrent;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CopyOnWriteArraySet<E> extends AbstractSet<E> implements Serializable {
	public CopyOnWriteArraySet() {
		throw new RuntimeException("Stub!");
	}

	public CopyOnWriteArraySet(final Collection<? extends E> c) {
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
	public Object[] toArray() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void clear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean remove(final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean add(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean addAll(final Collection<? extends E> c) {
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
	public Iterator<E> iterator() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean removeIf(final Predicate<? super E> filter) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void forEach(final Consumer<? super E> action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Spliterator<E> spliterator() {
		throw new RuntimeException("Stub!");
	}
}
