package java.util.stream;

import java.util.LongSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

public interface LongStream extends BaseStream<Long, LongStream> {
	LongStream filter(final LongPredicate p0);

	LongStream map(final LongUnaryOperator p0);

	<U> Stream<U> mapToObj(final LongFunction<? extends U> p0);

	IntStream mapToInt(final LongToIntFunction p0);

	DoubleStream mapToDouble(final LongToDoubleFunction p0);

	LongStream flatMap(final LongFunction<? extends LongStream> p0);

	default LongStream mapMulti(final LongMapMultiConsumer mapper) {
		throw new RuntimeException("Stub!");
	}

	LongStream distinct();

	LongStream sorted();

	LongStream peek(final LongConsumer p0);

	LongStream limit(final long p0);

	LongStream skip(final long p0);

	default LongStream takeWhile(final LongPredicate predicate) {
		throw new RuntimeException("Stub!");
	}

	default LongStream dropWhile(final LongPredicate predicate) {
		throw new RuntimeException("Stub!");
	}

	void forEach(final LongConsumer p0);

	void forEachOrdered(final LongConsumer p0);

	long[] toArray();

	long reduce(final long p0, final LongBinaryOperator p1);

	OptionalLong reduce(final LongBinaryOperator p0);

	<R> R collect(final Supplier<R> p0, final ObjLongConsumer<R> p1, final BiConsumer<R, R> p2);

	long sum();

	OptionalLong min();

	OptionalLong max();

	long count();

	OptionalDouble average();

	LongSummaryStatistics summaryStatistics();

	boolean anyMatch(final LongPredicate p0);

	boolean allMatch(final LongPredicate p0);

	boolean noneMatch(final LongPredicate p0);

	OptionalLong findFirst();

	OptionalLong findAny();

	DoubleStream asDoubleStream();

	Stream<Long> boxed();

	LongStream sequential();

	LongStream parallel();

	PrimitiveIterator.OfLong iterator();

	Spliterator.OfLong spliterator();

	default Builder builder() {
		throw new RuntimeException("Stub!");
	}

	default LongStream empty() {
		throw new RuntimeException("Stub!");
	}

	default LongStream of(final long t) {
		throw new RuntimeException("Stub!");
	}

	default LongStream of(final long... values) {
		throw new RuntimeException("Stub!");
	}

	default LongStream iterate(final long seed, final LongUnaryOperator f) {
		throw new RuntimeException("Stub!");
	}

	default LongStream iterate(final long seed, final LongPredicate hasNext, final LongUnaryOperator next) {
		throw new RuntimeException("Stub!");
	}

	default LongStream generate(final LongSupplier s) {
		throw new RuntimeException("Stub!");
	}

	default LongStream range(final long startInclusive, final long endExclusive) {
		throw new RuntimeException("Stub!");
	}

	default LongStream rangeClosed(final long startInclusive, final long endInclusive) {
		throw new RuntimeException("Stub!");
	}

	default LongStream concat(final LongStream a, final LongStream b) {
		throw new RuntimeException("Stub!");
	}

	interface Builder extends LongConsumer {
		void accept(final long p0);

		default Builder add(final long t) {
			throw new RuntimeException("Stub!");
		}

		LongStream build();
	}

	@FunctionalInterface
	interface LongMapMultiConsumer {
		void accept(final long p0, final LongConsumer p1);
	}
}
