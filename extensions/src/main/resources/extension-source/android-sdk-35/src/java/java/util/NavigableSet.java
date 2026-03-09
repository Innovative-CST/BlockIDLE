package java.util;

public interface NavigableSet<E> extends SortedSet<E> {
	E lower(final E p0);

	E floor(final E p0);

	E ceiling(final E p0);

	E higher(final E p0);

	E pollFirst();

	E pollLast();

	Iterator<E> iterator();

	NavigableSet<E> descendingSet();

	Iterator<E> descendingIterator();

	NavigableSet<E> subSet(final E p0, final boolean p1, final E p2, final boolean p3);

	NavigableSet<E> headSet(final E p0, final boolean p1);

	NavigableSet<E> tailSet(final E p0, final boolean p1);

	SortedSet<E> subSet(final E p0, final E p1);

	SortedSet<E> headSet(final E p0);

	SortedSet<E> tailSet(final E p0);

	default E removeFirst() {
		throw new RuntimeException("Stub!");
	}

	default E removeLast() {
		throw new RuntimeException("Stub!");
	}

	default NavigableSet<E> reversed() {
		throw new RuntimeException("Stub!");
	}
}
