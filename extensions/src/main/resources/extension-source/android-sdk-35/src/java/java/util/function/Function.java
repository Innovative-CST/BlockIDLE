package java.util.function;

@FunctionalInterface
public interface Function<T, R> {
	R apply(final T p0);

	default <V> Function<V, R> compose(final Function<? super V, ? extends T> before) {
		throw new RuntimeException("Stub!");
	}

	default <V> Function<T, V> andThen(final Function<? super R, ? extends V> after) {
		throw new RuntimeException("Stub!");
	}

	default <T> Function<T, T> identity() {
		throw new RuntimeException("Stub!");
	}
}
