package java.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public interface PrimitiveIterator<T, T_CONS> extends Iterator<T> {
	void forEachRemaining(final T_CONS p0);

	interface OfDouble extends PrimitiveIterator<Double, DoubleConsumer> {
		double nextDouble();

		default void forEachRemaining(final DoubleConsumer action) {
			throw new RuntimeException("Stub!");
		}

		default Double next() {
			throw new RuntimeException("Stub!");
		}

		default void forEachRemaining(final Consumer<? super Double> action) {
			throw new RuntimeException("Stub!");
		}
	}

	interface OfInt extends PrimitiveIterator<Integer, IntConsumer> {
		int nextInt();

		default void forEachRemaining(final IntConsumer action) {
			throw new RuntimeException("Stub!");
		}

		default Integer next() {
			throw new RuntimeException("Stub!");
		}

		default void forEachRemaining(final Consumer<? super Integer> action) {
			throw new RuntimeException("Stub!");
		}
	}

	interface OfLong extends PrimitiveIterator<Long, LongConsumer> {
		long nextLong();

		default void forEachRemaining(final LongConsumer action) {
			throw new RuntimeException("Stub!");
		}

		default Long next() {
			throw new RuntimeException("Stub!");
		}

		default void forEachRemaining(final Consumer<? super Long> action) {
			throw new RuntimeException("Stub!");
		}
	}
}
