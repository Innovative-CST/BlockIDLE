package java.util;

public interface Set<E> extends Collection<E> {
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

	boolean retainAll(@RecentlyNonNull final Collection<?> p0);

	boolean removeAll(@RecentlyNonNull final Collection<?> p0);

	void clear();

	boolean equals(@RecentlyNullable final Object p0);

	int hashCode();

	@RecentlyNonNull
	default Spliterator<E> spliterator() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> Set<E> of() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> Set<E> of(@RecentlyNonNull final E e1) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> Set<E> of(@RecentlyNonNull final E e1, @RecentlyNonNull final E e2) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> Set<E> of(@RecentlyNonNull final E e1, @RecentlyNonNull final E e2, @RecentlyNonNull final E e3) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> Set<E> of(@RecentlyNonNull final E e1, @RecentlyNonNull final E e2, @RecentlyNonNull final E e3,
			@RecentlyNonNull final E e4) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> Set<E> of(@RecentlyNonNull final E e1, @RecentlyNonNull final E e2, @RecentlyNonNull final E e3,
			@RecentlyNonNull final E e4, @RecentlyNonNull final E e5) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> Set<E> of(@RecentlyNonNull final E e1, @RecentlyNonNull final E e2, @RecentlyNonNull final E e3,
			@RecentlyNonNull final E e4, @RecentlyNonNull final E e5, @RecentlyNonNull final E e6) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> Set<E> of(@RecentlyNonNull final E e1, @RecentlyNonNull final E e2, @RecentlyNonNull final E e3,
			@RecentlyNonNull final E e4, @RecentlyNonNull final E e5, @RecentlyNonNull final E e6,
			@RecentlyNonNull final E e7) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> Set<E> of(@RecentlyNonNull final E e1, @RecentlyNonNull final E e2, @RecentlyNonNull final E e3,
			@RecentlyNonNull final E e4, @RecentlyNonNull final E e5, @RecentlyNonNull final E e6,
			@RecentlyNonNull final E e7, @RecentlyNonNull final E e8) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> Set<E> of(@RecentlyNonNull final E e1, @RecentlyNonNull final E e2, @RecentlyNonNull final E e3,
			@RecentlyNonNull final E e4, @RecentlyNonNull final E e5, @RecentlyNonNull final E e6,
			@RecentlyNonNull final E e7, @RecentlyNonNull final E e8, @RecentlyNonNull final E e9) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> Set<E> of(@RecentlyNonNull final E e1, @RecentlyNonNull final E e2, @RecentlyNonNull final E e3,
			@RecentlyNonNull final E e4, @RecentlyNonNull final E e5, @RecentlyNonNull final E e6,
			@RecentlyNonNull final E e7, @RecentlyNonNull final E e8, @RecentlyNonNull final E e9,
			@RecentlyNonNull final E e10) {
		throw new RuntimeException("Stub!");
	}

	@SafeVarargs
	@RecentlyNonNull
	default <E> Set<E> of(@RecentlyNonNull final E... elements) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <E> Set<E> copyOf(@RecentlyNonNull final Collection<? extends E> coll) {
		throw new RuntimeException("Stub!");
	}
}
