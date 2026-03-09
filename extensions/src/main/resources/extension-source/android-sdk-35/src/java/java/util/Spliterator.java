package java.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public interface Spliterator<T> {
	int CONCURRENT = 4096;
	int DISTINCT = 1;
	int IMMUTABLE = 1024;
	int NONNULL = 256;
	int ORDERED = 16;
	int SIZED = 64;
	int SORTED = 4;
	int SUBSIZED = 16384;

	boolean tryAdvance(final Consumer<? super T> p0);

	default void forEachRemaining(final Consumer<? super T> action) {
		throw new RuntimeException("Stub!");
	}

	Spliterator<T> trySplit();

	long estimateSize();

	default long getExactSizeIfKnown() {
		throw new RuntimeException("Stub!");
	}

	int characteristics();

	default boolean hasCharacteristics(final int characteristics) {
		throw new RuntimeException("Stub!");
	}

	default Comparator<? super T> getComparator() {
		throw new RuntimeException("Stub!");
	}

	interface OfDouble extends OfPrimitive<Double, DoubleConsumer, OfDouble> {
		OfDouble trySplit();

		boolean tryAdvance(final DoubleConsumer p0);

		default void forEachRemaining(final DoubleConsumer action) {
			throw new RuntimeException("Stub!");
		}

		default boolean tryAdvance(final Consumer<? super Double> action) {
			throw new RuntimeException("Stub!");
		}

		default void forEachRemaining(final Consumer<? super Double> action) {
			throw new RuntimeException("Stub!");
		}
	}

	interface OfInt extends OfPrimitive<Integer, IntConsumer, OfInt> {
		OfInt trySplit();

		boolean tryAdvance(final IntConsumer p0);

		default void forEachRemaining(final IntConsumer action) {
			throw new RuntimeException("Stub!");
		}

		default boolean tryAdvance(final Consumer<? super Integer> action) {
			throw new RuntimeException("Stub!");
		}

		default void forEachRemaining(final Consumer<? super Integer> action) {
			throw new RuntimeException("Stub!");
		}
	}

	interface OfLong extends OfPrimitive<Long, LongConsumer, OfLong> {
		OfLong trySplit();

		boolean tryAdvance(final LongConsumer p0);

		default void forEachRemaining(final LongConsumer action) {
			throw new RuntimeException("Stub!");
		}

		default boolean tryAdvance(final Consumer<? super Long> action) {
			throw new RuntimeException("Stub!");
		}

		default void forEachRemaining(final Consumer<? super Long> action) {
			throw new RuntimeException("Stub!");
		}
	}

	interface OfPrimitive<T, T_CONS, T_SPLITR extends OfPrimitive<T, T_CONS, T_SPLITR>> extends Spliterator<T> {
		T_SPLITR trySplit();

		boolean tryAdvance(final T_CONS p0);

		default void forEachRemaining(final T_CONS action) {
			throw new RuntimeException("Stub!");
		}
	}
}
