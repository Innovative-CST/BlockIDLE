package java.util;

public interface SortedSet<E> extends Set<E>, SequencedSet<E> {
	Comparator<? super E> comparator();

	SortedSet<E> subSet(final E p0, final E p1);

	SortedSet<E> headSet(final E p0);

	SortedSet<E> tailSet(final E p0);

	E first();

	E last();

	default Spliterator<E> spliterator() {
		throw new RuntimeException("Stub!");
	}

	default void addFirst(final E e) {
		throw new RuntimeException("Stub!");
	}

	default void addLast(final E e) {
		throw new RuntimeException("Stub!");
	}

	default E getFirst() {
		throw new RuntimeException("Stub!");
	}

	default E getLast() {
		throw new RuntimeException("Stub!");
	}

	default E removeFirst() {
		throw new RuntimeException("Stub!");
	}

	default E removeLast() {
		throw new RuntimeException("Stub!");
	}

	default SortedSet<E> reversed() {
		throw new RuntimeException("Stub!");
	}
}
