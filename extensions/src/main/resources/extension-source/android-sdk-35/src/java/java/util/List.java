package java.util;

import java.util.function.UnaryOperator;

public interface List<E> extends SequencedCollection<E>, Collection<E> {
	int size();

	boolean isEmpty();

	boolean contains(@RecentlyNullable final Object p0);

	@RecentlyNonNull
	Iterator<E> iterator();

	@RecentlyNonNull
	Object[] toArray();

	@RecentlyNonNull
	<T> T[] toArray(@RecentlyNonNull final T[] p0);

	boolean add(final E p0);

	boolean remove(@RecentlyNullable final Object p0);

	boolean containsAll(@RecentlyNonNull final Collection<?> p0);

	boolean addAll(@RecentlyNonNull final Collection<? extends E> p0);

	boolean addAll(final int p0, @RecentlyNonNull final Collection<? extends E> p1);

	boolean removeAll(@RecentlyNonNull final Collection<?> p0);

	boolean retainAll(@RecentlyNonNull final Collection<?> p0);

	default void replaceAll(@RecentlyNonNull final UnaryOperator<E> operator) {
		throw new RuntimeException("Stub!");
	}

	default void sort(@RecentlyNullable final Comparator<? super E> c) {
		throw new RuntimeException("Stub!");
	}

	void clear();

	boolean equals(@RecentlyNullable final Object p0);

	int hashCode();

	E get(final int p0);

	E set(final int p0, final E p1);

	void add(final int p0, final E p1);

	E remove(final int p0);

	int indexOf(@RecentlyNullable final Object p0);

	int lastIndexOf(@RecentlyNullable final Object p0);

	@RecentlyNonNull
	ListIterator<E> listIterator();

	@RecentlyNonNull
	ListIterator<E> listIterator(final int p0);

	@RecentlyNonNull
	List<E> subList(final int p0, final int p1);

	@RecentlyNonNull
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

	@RecentlyNonNull
	default List<E> reversed() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> List<E> of() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> List<E> of(@RecentlyNonNull final E e1) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> List<E> of(@RecentlyNonNull final E e1, @RecentlyNonNull final E e2) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> List<E> of(@RecentlyNonNull final E e1, @RecentlyNonNull final E e2, @RecentlyNonNull final E e3) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> List<E> of(@RecentlyNonNull final E e1, @RecentlyNonNull final E e2, @RecentlyNonNull final E e3,
			@RecentlyNonNull final E e4) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> List<E> of(@RecentlyNonNull final E e1, @RecentlyNonNull final E e2, @RecentlyNonNull final E e3,
			@RecentlyNonNull final E e4, @RecentlyNonNull final E e5) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> List<E> of(@RecentlyNonNull final E e1, @RecentlyNonNull final E e2, @RecentlyNonNull final E e3,
			@RecentlyNonNull final E e4, @RecentlyNonNull final E e5, @RecentlyNonNull final E e6) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> List<E> of(@RecentlyNonNull final E e1, @RecentlyNonNull final E e2, @RecentlyNonNull final E e3,
			@RecentlyNonNull final E e4, @RecentlyNonNull final E e5, @RecentlyNonNull final E e6,
			@RecentlyNonNull final E e7) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> List<E> of(@RecentlyNonNull final E e1, @RecentlyNonNull final E e2, @RecentlyNonNull final E e3,
			@RecentlyNonNull final E e4, @RecentlyNonNull final E e5, @RecentlyNonNull final E e6,
			@RecentlyNonNull final E e7, @RecentlyNonNull final E e8) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> List<E> of(@RecentlyNonNull final E e1, @RecentlyNonNull final E e2, @RecentlyNonNull final E e3,
			@RecentlyNonNull final E e4, @RecentlyNonNull final E e5, @RecentlyNonNull final E e6,
			@RecentlyNonNull final E e7, @RecentlyNonNull final E e8, @RecentlyNonNull final E e9) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> List<E> of(@RecentlyNonNull final E e1, @RecentlyNonNull final E e2, @RecentlyNonNull final E e3,
			@RecentlyNonNull final E e4, @RecentlyNonNull final E e5, @RecentlyNonNull final E e6,
			@RecentlyNonNull final E e7, @RecentlyNonNull final E e8, @RecentlyNonNull final E e9,
			@RecentlyNonNull final E e10) {
		throw new RuntimeException("Stub!");
	}

	@SafeVarargs
	@RecentlyNonNull
	default <E> List<E> of(@RecentlyNonNull final E... elements) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> List<E> copyOf(@RecentlyNonNull final Collection<? extends E> coll) {
		throw new RuntimeException("Stub!");
	}
}
