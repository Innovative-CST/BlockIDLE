package java.util;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

@FunctionalInterface
public interface Comparator<T> {
	int compare(final T p0, final T p1);

	boolean equals(final Object p0);

	default Comparator<T> reversed() {
		throw new RuntimeException("Stub!");
	}

	default Comparator<T> thenComparing(final Comparator<? super T> other) {
		throw new RuntimeException("Stub!");
	}

	default <U> Comparator<T> thenComparing(final Function<? super T, ? extends U> keyExtractor,
			final Comparator<? super U> keyComparator) {
		throw new RuntimeException("Stub!");
	}

	default <U extends Comparable<? super U>> Comparator<T> thenComparing(
			final Function<? super T, ? extends U> keyExtractor) {
		throw new RuntimeException("Stub!");
	}

	default Comparator<T> thenComparingInt(final ToIntFunction<? super T> keyExtractor) {
		throw new RuntimeException("Stub!");
	}

	default Comparator<T> thenComparingLong(final ToLongFunction<? super T> keyExtractor) {
		throw new RuntimeException("Stub!");
	}

	default Comparator<T> thenComparingDouble(final ToDoubleFunction<? super T> keyExtractor) {
		throw new RuntimeException("Stub!");
	}

	default <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
		throw new RuntimeException("Stub!");
	}

	default <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
		throw new RuntimeException("Stub!");
	}

	default <T> Comparator<T> nullsFirst(final Comparator<? super T> comparator) {
		throw new RuntimeException("Stub!");
	}

	default <T> Comparator<T> nullsLast(final Comparator<? super T> comparator) {
		throw new RuntimeException("Stub!");
	}

	default <T, U> Comparator<T> comparing(final Function<? super T, ? extends U> keyExtractor,
			final Comparator<? super U> keyComparator) {
		throw new RuntimeException("Stub!");
	}

	default <T, U extends Comparable<? super U>> Comparator<T> comparing(
			final Function<? super T, ? extends U> keyExtractor) {
		throw new RuntimeException("Stub!");
	}

	default <T> Comparator<T> comparingInt(final ToIntFunction<? super T> keyExtractor) {
		throw new RuntimeException("Stub!");
	}

	default <T> Comparator<T> comparingLong(final ToLongFunction<? super T> keyExtractor) {
		throw new RuntimeException("Stub!");
	}

	default <T> Comparator<T> comparingDouble(final ToDoubleFunction<? super T> keyExtractor) {
		throw new RuntimeException("Stub!");
	}
}
