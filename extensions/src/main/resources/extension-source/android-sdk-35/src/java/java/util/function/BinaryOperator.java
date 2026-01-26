package java.util.function;

import java.util.Comparator;

@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T, T, T> {
	default <T> BinaryOperator<T> minBy(final Comparator<? super T> comparator) {
		throw new RuntimeException("Stub!");
	}

	default <T> BinaryOperator<T> maxBy(final Comparator<? super T> comparator) {
		throw new RuntimeException("Stub!");
	}
}
