package java.util.stream;

import java.util.Spliterator;
import java.util.function.Supplier;

public final class StreamSupport {
	StreamSupport() {
		throw new RuntimeException("Stub!");
	}

	public static <T> Stream<T> stream(final Spliterator<T> spliterator, final boolean parallel) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Stream<T> stream(final Supplier<? extends Spliterator<T>> supplier, final int characteristics,
			final boolean parallel) {
		throw new RuntimeException("Stub!");
	}

	public static IntStream intStream(final Spliterator.OfInt spliterator, final boolean parallel) {
		throw new RuntimeException("Stub!");
	}

	public static IntStream intStream(final Supplier<? extends Spliterator.OfInt> supplier, final int characteristics,
			final boolean parallel) {
		throw new RuntimeException("Stub!");
	}

	public static LongStream longStream(final Spliterator.OfLong spliterator, final boolean parallel) {
		throw new RuntimeException("Stub!");
	}

	public static LongStream longStream(final Supplier<? extends Spliterator.OfLong> supplier,
			final int characteristics, final boolean parallel) {
		throw new RuntimeException("Stub!");
	}

	public static DoubleStream doubleStream(final Spliterator.OfDouble spliterator, final boolean parallel) {
		throw new RuntimeException("Stub!");
	}

	public static DoubleStream doubleStream(final Supplier<? extends Spliterator.OfDouble> supplier,
			final int characteristics, final boolean parallel) {
		throw new RuntimeException("Stub!");
	}
}
