package java.util.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;

public interface Stream<T> extends BaseStream<T, Stream<T>> {
	Stream<T> filter(final Predicate<? super T> p0);

	<R> Stream<R> map(final Function<? super T, ? extends R> p0);

	IntStream mapToInt(final ToIntFunction<? super T> p0);

	LongStream mapToLong(final ToLongFunction<? super T> p0);

	DoubleStream mapToDouble(final ToDoubleFunction<? super T> p0);

	<R> Stream<R> flatMap(final Function<? super T, ? extends Stream<? extends R>> p0);

	IntStream flatMapToInt(final Function<? super T, ? extends IntStream> p0);

	LongStream flatMapToLong(final Function<? super T, ? extends LongStream> p0);

	DoubleStream flatMapToDouble(final Function<? super T, ? extends DoubleStream> p0);

	default <R> Stream<R> mapMulti(final BiConsumer<? super T, ? super Consumer<R>> mapper) {
		throw new RuntimeException("Stub!");
	}

	default IntStream mapMultiToInt(final BiConsumer<? super T, ? super IntConsumer> mapper) {
		throw new RuntimeException("Stub!");
	}

	default LongStream mapMultiToLong(final BiConsumer<? super T, ? super LongConsumer> mapper) {
		throw new RuntimeException("Stub!");
	}

	default DoubleStream mapMultiToDouble(final BiConsumer<? super T, ? super DoubleConsumer> mapper) {
		throw new RuntimeException("Stub!");
	}

	Stream<T> distinct();

	Stream<T> sorted();

	Stream<T> sorted(final Comparator<? super T> p0);

	Stream<T> peek(final Consumer<? super T> p0);

	Stream<T> limit(final long p0);

	Stream<T> skip(final long p0);

	default Stream<T> takeWhile(final Predicate<? super T> predicate) {
		throw new RuntimeException("Stub!");
	}

	default Stream<T> dropWhile(final Predicate<? super T> predicate) {
		throw new RuntimeException("Stub!");
	}

	void forEach(final Consumer<? super T> p0);

	void forEachOrdered(final Consumer<? super T> p0);

	Object[] toArray();

	<A> A[] toArray(final IntFunction<A[]> p0);

	T reduce(final T p0, final BinaryOperator<T> p1);

	Optional<T> reduce(final BinaryOperator<T> p0);

	<U> U reduce(final U p0, final BiFunction<U, ? super T, U> p1, final BinaryOperator<U> p2);

	<R> R collect(final Supplier<R> p0, final BiConsumer<R, ? super T> p1, final BiConsumer<R, R> p2);

	<R, A> R collect(final Collector<? super T, A, R> p0);

	default List<T> toList() {
		throw new RuntimeException("Stub!");
	}

	Optional<T> min(final Comparator<? super T> p0);

	Optional<T> max(final Comparator<? super T> p0);

	long count();

	boolean anyMatch(final Predicate<? super T> p0);

	boolean allMatch(final Predicate<? super T> p0);

	boolean noneMatch(final Predicate<? super T> p0);

	Optional<T> findFirst();

	Optional<T> findAny();

	default <T> Builder<T> builder() {
		throw new RuntimeException("Stub!");
	}

	default <T> Stream<T> empty() {
		throw new RuntimeException("Stub!");
	}

	default <T> Stream<T> of(final T t) {
		throw new RuntimeException("Stub!");
	}

	default <T> Stream<T> ofNullable(final T t) {
		throw new RuntimeException("Stub!");
	}

	@SafeVarargs
	default <T> Stream<T> of(final T... values) {
		throw new RuntimeException("Stub!");
	}

	default <T> Stream<T> iterate(final T seed, final UnaryOperator<T> f) {
		throw new RuntimeException("Stub!");
	}

	default <T> Stream<T> iterate(final T seed, final Predicate<? super T> hasNext, final UnaryOperator<T> next) {
		throw new RuntimeException("Stub!");
	}

	default <T> Stream<T> generate(final Supplier<? extends T> s) {
		throw new RuntimeException("Stub!");
	}

	default <T> Stream<T> concat(final Stream<? extends T> a, final Stream<? extends T> b) {
		throw new RuntimeException("Stub!");
	}

	interface Builder<T> extends Consumer<T> {
		void accept(final T p0);

		default Builder<T> add(final T t) {
			throw new RuntimeException("Stub!");
		}

		Stream<T> build();
	}
}
