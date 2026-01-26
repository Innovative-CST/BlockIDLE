package java.util;

import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface Collection<E> extends Iterable<E> {
	int size();

	boolean isEmpty();

	boolean contains(@RecentlyNullable final Object p0);

	@RecentlyNonNull
	Iterator<E> iterator();

	@RecentlyNonNull
	Object[] toArray();

	@RecentlyNonNull
	<T> T[] toArray(@RecentlyNonNull final T[] p0);

	@RecentlyNonNull
	default <T> T[] toArray(@RecentlyNonNull final IntFunction<T[]> generator) {
		throw new RuntimeException("Stub!");
	}

	boolean add(final E p0);

	boolean remove(@RecentlyNullable final Object p0);

	boolean containsAll(@RecentlyNonNull final Collection<?> p0);

	boolean addAll(@RecentlyNonNull final Collection<? extends E> p0);

	boolean removeAll(@RecentlyNonNull final Collection<?> p0);

	default boolean removeIf(@RecentlyNonNull final Predicate<? super E> filter) {
		throw new RuntimeException("Stub!");
	}

	boolean retainAll(@RecentlyNonNull final Collection<?> p0);

	void clear();

	boolean equals(@RecentlyNullable final Object p0);

	int hashCode();

	@RecentlyNonNull
	default Spliterator<E> spliterator() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default Stream<E> stream() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default Stream<E> parallelStream() {
		throw new RuntimeException("Stub!");
	}
}
