package java.util.function;

@FunctionalInterface
public interface BiFunction<T, U, R> {
	R apply(final T p0, final U p1);

	default <V> BiFunction<T, U, V> andThen(final Function<? super R, ? extends V> after) {
		throw new RuntimeException("Stub!");
	}
}
