package java.util.stream;

import java.util.Collection;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public final class Collectors {
	Collectors() {
		throw new RuntimeException("Stub!");
	}

	public static <T, C extends Collection<T>> Collector<T, ?, C> toCollection(final Supplier<C> collectionFactory) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Collector<T, ?, List<T>> toList() {
		throw new RuntimeException("Stub!");
	}

	public static <T> Collector<T, ?, List<T>> toUnmodifiableList() {
		throw new RuntimeException("Stub!");
	}

	public static <T> Collector<T, ?, Set<T>> toSet() {
		throw new RuntimeException("Stub!");
	}

	public static <T> Collector<T, ?, Set<T>> toUnmodifiableSet() {
		throw new RuntimeException("Stub!");
	}

	public static Collector<CharSequence, ?, String> joining() {
		throw new RuntimeException("Stub!");
	}

	public static Collector<CharSequence, ?, String> joining(final CharSequence delimiter) {
		throw new RuntimeException("Stub!");
	}

	public static Collector<CharSequence, ?, String> joining(final CharSequence delimiter, final CharSequence prefix,
			final CharSequence suffix) {
		throw new RuntimeException("Stub!");
	}

	public static <T, U, A, R> Collector<T, ?, R> mapping(final Function<? super T, ? extends U> mapper,
			final Collector<? super U, A, R> downstream) {
		throw new RuntimeException("Stub!");
	}

	public static <T, U, A, R> Collector<T, ?, R> flatMapping(
			final Function<? super T, ? extends Stream<? extends U>> mapper,
			final Collector<? super U, A, R> downstream) {
		throw new RuntimeException("Stub!");
	}

	public static <T, A, R> Collector<T, ?, R> filtering(final Predicate<? super T> predicate,
			final Collector<? super T, A, R> downstream) {
		throw new RuntimeException("Stub!");
	}

	public static <T, A, R, RR> Collector<T, A, RR> collectingAndThen(final Collector<T, A, R> downstream,
			final Function<R, RR> finisher) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Collector<T, ?, Long> counting() {
		throw new RuntimeException("Stub!");
	}

	public static <T> Collector<T, ?, Optional<T>> minBy(final Comparator<? super T> comparator) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Collector<T, ?, Optional<T>> maxBy(final Comparator<? super T> comparator) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Collector<T, ?, Integer> summingInt(final ToIntFunction<? super T> mapper) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Collector<T, ?, Long> summingLong(final ToLongFunction<? super T> mapper) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Collector<T, ?, Double> summingDouble(final ToDoubleFunction<? super T> mapper) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Collector<T, ?, Double> averagingInt(final ToIntFunction<? super T> mapper) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Collector<T, ?, Double> averagingLong(final ToLongFunction<? super T> mapper) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Collector<T, ?, Double> averagingDouble(final ToDoubleFunction<? super T> mapper) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Collector<T, ?, T> reducing(final T identity, final BinaryOperator<T> op) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Collector<T, ?, Optional<T>> reducing(final BinaryOperator<T> op) {
		throw new RuntimeException("Stub!");
	}

	public static <T, U> Collector<T, ?, U> reducing(final U identity, final Function<? super T, ? extends U> mapper,
			final BinaryOperator<U> op) {
		throw new RuntimeException("Stub!");
	}

	public static <T, K> Collector<T, ?, Map<K, List<T>>> groupingBy(
			final Function<? super T, ? extends K> classifier) {
		throw new RuntimeException("Stub!");
	}

	public static <T, K, A, D> Collector<T, ?, Map<K, D>> groupingBy(final Function<? super T, ? extends K> classifier,
			final Collector<? super T, A, D> downstream) {
		throw new RuntimeException("Stub!");
	}

	public static <T, K, D, A, M extends Map<K, D>> Collector<T, ?, M> groupingBy(
			final Function<? super T, ? extends K> classifier, final Supplier<M> mapFactory,
			final Collector<? super T, A, D> downstream) {
		throw new RuntimeException("Stub!");
	}

	public static <T, K> Collector<T, ?, ConcurrentMap<K, List<T>>> groupingByConcurrent(
			final Function<? super T, ? extends K> classifier) {
		throw new RuntimeException("Stub!");
	}

	public static <T, K, A, D> Collector<T, ?, ConcurrentMap<K, D>> groupingByConcurrent(
			final Function<? super T, ? extends K> classifier, final Collector<? super T, A, D> downstream) {
		throw new RuntimeException("Stub!");
	}

	public static <T, K, A, D, M extends ConcurrentMap<K, D>> Collector<T, ?, M> groupingByConcurrent(
			final Function<? super T, ? extends K> classifier, final Supplier<M> mapFactory,
			final Collector<? super T, A, D> downstream) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Collector<T, ?, Map<Boolean, List<T>>> partitioningBy(final Predicate<? super T> predicate) {
		throw new RuntimeException("Stub!");
	}

	public static <T, D, A> Collector<T, ?, Map<Boolean, D>> partitioningBy(final Predicate<? super T> predicate,
			final Collector<? super T, A, D> downstream) {
		throw new RuntimeException("Stub!");
	}

	public static <T, K, U> Collector<T, ?, Map<K, U>> toMap(final Function<? super T, ? extends K> keyMapper,
			final Function<? super T, ? extends U> valueMapper) {
		throw new RuntimeException("Stub!");
	}

	public static <T, K, U> Collector<T, ?, Map<K, U>> toUnmodifiableMap(
			final Function<? super T, ? extends K> keyMapper, final Function<? super T, ? extends U> valueMapper) {
		throw new RuntimeException("Stub!");
	}

	public static <T, K, U> Collector<T, ?, Map<K, U>> toMap(final Function<? super T, ? extends K> keyMapper,
			final Function<? super T, ? extends U> valueMapper, final BinaryOperator<U> mergeFunction) {
		throw new RuntimeException("Stub!");
	}

	public static <T, K, U> Collector<T, ?, Map<K, U>> toUnmodifiableMap(
			final Function<? super T, ? extends K> keyMapper, final Function<? super T, ? extends U> valueMapper,
			final BinaryOperator<U> mergeFunction) {
		throw new RuntimeException("Stub!");
	}

	public static <T, K, U, M extends Map<K, U>> Collector<T, ?, M> toMap(
			final Function<? super T, ? extends K> keyMapper, final Function<? super T, ? extends U> valueMapper,
			final BinaryOperator<U> mergeFunction, final Supplier<M> mapFactory) {
		throw new RuntimeException("Stub!");
	}

	public static <T, K, U> Collector<T, ?, ConcurrentMap<K, U>> toConcurrentMap(
			final Function<? super T, ? extends K> keyMapper, final Function<? super T, ? extends U> valueMapper) {
		throw new RuntimeException("Stub!");
	}

	public static <T, K, U> Collector<T, ?, ConcurrentMap<K, U>> toConcurrentMap(
			final Function<? super T, ? extends K> keyMapper, final Function<? super T, ? extends U> valueMapper,
			final BinaryOperator<U> mergeFunction) {
		throw new RuntimeException("Stub!");
	}

	public static <T, K, U, M extends ConcurrentMap<K, U>> Collector<T, ?, M> toConcurrentMap(
			final Function<? super T, ? extends K> keyMapper, final Function<? super T, ? extends U> valueMapper,
			final BinaryOperator<U> mergeFunction, final Supplier<M> mapFactory) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Collector<T, ?, IntSummaryStatistics> summarizingInt(final ToIntFunction<? super T> mapper) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Collector<T, ?, LongSummaryStatistics> summarizingLong(final ToLongFunction<? super T> mapper) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Collector<T, ?, DoubleSummaryStatistics> summarizingDouble(
			final ToDoubleFunction<? super T> mapper) {
		throw new RuntimeException("Stub!");
	}

	public static <T, R1, R2, R> Collector<T, ?, R> teeing(final Collector<? super T, ?, R1> downstream1,
			final Collector<? super T, ?, R2> downstream2, final BiFunction<? super R1, ? super R2, R> merger) {
		throw new RuntimeException("Stub!");
	}
}
