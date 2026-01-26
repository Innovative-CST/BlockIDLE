package java.util.stream;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

public interface IntStream extends BaseStream<Integer, IntStream> {
	IntStream filter(final IntPredicate p0);

	IntStream map(final IntUnaryOperator p0);

	<U> Stream<U> mapToObj(final IntFunction<? extends U> p0);

	LongStream mapToLong(final IntToLongFunction p0);

	DoubleStream mapToDouble(final IntToDoubleFunction p0);

	IntStream flatMap(final IntFunction<? extends IntStream> p0);

	default IntStream mapMulti(final IntMapMultiConsumer mapper) {
		throw new RuntimeException("Stub!");
	}

	IntStream distinct();

	IntStream sorted();

	IntStream peek(final IntConsumer p0);

	IntStream limit(final long p0);

	IntStream skip(final long p0);

	default IntStream takeWhile(final IntPredicate predicate) {
		throw new RuntimeException("Stub!");
	}

	default IntStream dropWhile(final IntPredicate predicate) {
		throw new RuntimeException("Stub!");
	}

	void forEach(final IntConsumer p0);

	void forEachOrdered(final IntConsumer p0);

	int[] toArray();

	int reduce(final int p0, final IntBinaryOperator p1);

	OptionalInt reduce(final IntBinaryOperator p0);

	<R> R collect(final Supplier<R> p0, final ObjIntConsumer<R> p1, final BiConsumer<R, R> p2);

	int sum();

	OptionalInt min();

	OptionalInt max();

	long count();

	OptionalDouble average();

	IntSummaryStatistics summaryStatistics();

	boolean anyMatch(final IntPredicate p0);

	boolean allMatch(final IntPredicate p0);

	boolean noneMatch(final IntPredicate p0);

	OptionalInt findFirst();

	OptionalInt findAny();

	LongStream asLongStream();

	DoubleStream asDoubleStream();

	Stream<Integer> boxed();

	IntStream sequential();

	IntStream parallel();

	PrimitiveIterator.OfInt iterator();

	Spliterator.OfInt spliterator();

	default Builder builder() {
		throw new RuntimeException("Stub!");
	}

	default IntStream empty() {
		throw new RuntimeException("Stub!");
	}

	default IntStream of(final int t) {
		throw new RuntimeException("Stub!");
	}

	default IntStream of(final int... values) {
		throw new RuntimeException("Stub!");
	}

	default IntStream iterate(final int seed, final IntUnaryOperator f) {
		throw new RuntimeException("Stub!");
	}

	default IntStream iterate(final int seed, final IntPredicate hasNext, final IntUnaryOperator next) {
		throw new RuntimeException("Stub!");
	}

	default IntStream generate(final IntSupplier s) {
		throw new RuntimeException("Stub!");
	}

	default IntStream range(final int startInclusive, final int endExclusive) {
		throw new RuntimeException("Stub!");
	}

	default IntStream rangeClosed(final int startInclusive, final int endInclusive) {
		throw new RuntimeException("Stub!");
	}

	default IntStream concat(final IntStream a, final IntStream b) {
		throw new RuntimeException("Stub!");
	}

	interface Builder extends IntConsumer {
		void accept(final int p0);

		default Builder add(final int t) {
			throw new RuntimeException("Stub!");
		}

		IntStream build();
	}

	@FunctionalInterface
	interface IntMapMultiConsumer {
		void accept(final int p0, final IntConsumer p1);
	}
}
