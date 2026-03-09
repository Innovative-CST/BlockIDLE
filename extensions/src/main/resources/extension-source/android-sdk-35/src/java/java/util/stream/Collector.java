package java.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public interface Collector<T, A, R> {
	Supplier<A> supplier();

	BiConsumer<A, T> accumulator();

	BinaryOperator<A> combiner();

	Function<A, R> finisher();

	Set<Characteristics> characteristics();

	default <T, R> Collector<T, R, R> of(final Supplier<R> supplier, final BiConsumer<R, T> accumulator,
			final BinaryOperator<R> combiner, final Characteristics... characteristics) {
		throw new RuntimeException("Stub!");
	}

	default <T, A, R> Collector<T, A, R> of(final Supplier<A> supplier, final BiConsumer<A, T> accumulator,
			final BinaryOperator<A> combiner, final Function<A, R> finisher, final Characteristics... characteristics) {
		throw new RuntimeException("Stub!");
	}

	enum Characteristics {
		CONCURRENT, UNORDERED, IDENTITY_FINISH;
	}
}
