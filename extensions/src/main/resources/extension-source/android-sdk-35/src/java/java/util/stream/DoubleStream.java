package java.util.stream;

import java.util.DoubleSummaryStatistics;
import java.util.OptionalDouble;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

public interface DoubleStream extends BaseStream<Double, DoubleStream> {
	DoubleStream filter(final DoublePredicate p0);

	DoubleStream map(final DoubleUnaryOperator p0);

	<U> Stream<U> mapToObj(final DoubleFunction<? extends U> p0);

	IntStream mapToInt(final DoubleToIntFunction p0);

	LongStream mapToLong(final DoubleToLongFunction p0);

	DoubleStream flatMap(final DoubleFunction<? extends DoubleStream> p0);

	default DoubleStream mapMulti(final DoubleMapMultiConsumer mapper) {
		throw new RuntimeException("Stub!");
	}

	DoubleStream distinct();

	DoubleStream sorted();

	DoubleStream peek(final DoubleConsumer p0);

	DoubleStream limit(final long p0);

	DoubleStream skip(final long p0);

	default DoubleStream takeWhile(final DoublePredicate predicate) {
		throw new RuntimeException("Stub!");
	}

	default DoubleStream dropWhile(final DoublePredicate predicate) {
		throw new RuntimeException("Stub!");
	}

	void forEach(final DoubleConsumer p0);

	void forEachOrdered(final DoubleConsumer p0);

	double[] toArray();

	double reduce(final double p0, final DoubleBinaryOperator p1);

	OptionalDouble reduce(final DoubleBinaryOperator p0);

	<R> R collect(final Supplier<R> p0, final ObjDoubleConsumer<R> p1, final BiConsumer<R, R> p2);

	double sum();

	OptionalDouble min();

	OptionalDouble max();

	long count();

	OptionalDouble average();

	DoubleSummaryStatistics summaryStatistics();

	boolean anyMatch(final DoublePredicate p0);

	boolean allMatch(final DoublePredicate p0);

	boolean noneMatch(final DoublePredicate p0);

	OptionalDouble findFirst();

	OptionalDouble findAny();

	Stream<Double> boxed();

	DoubleStream sequential();

	DoubleStream parallel();

	PrimitiveIterator.OfDouble iterator();

	Spliterator.OfDouble spliterator();

	default Builder builder() {
		throw new RuntimeException("Stub!");
	}

	default DoubleStream empty() {
		throw new RuntimeException("Stub!");
	}

	default DoubleStream of(final double t) {
		throw new RuntimeException("Stub!");
	}

	default DoubleStream of(final double... values) {
		throw new RuntimeException("Stub!");
	}

	default DoubleStream iterate(final double seed, final DoubleUnaryOperator f) {
		throw new RuntimeException("Stub!");
	}

	default DoubleStream iterate(final double seed, final DoublePredicate hasNext, final DoubleUnaryOperator next) {
		throw new RuntimeException("Stub!");
	}

	default DoubleStream generate(final DoubleSupplier s) {
		throw new RuntimeException("Stub!");
	}

	default DoubleStream concat(final DoubleStream a, final DoubleStream b) {
		throw new RuntimeException("Stub!");
	}

	interface Builder extends DoubleConsumer {
		void accept(final double p0);

		default Builder add(final double t) {
			throw new RuntimeException("Stub!");
		}

		DoubleStream build();
	}

	@FunctionalInterface
	interface DoubleMapMultiConsumer {
		void accept(final double p0, final DoubleConsumer p1);
	}
}
