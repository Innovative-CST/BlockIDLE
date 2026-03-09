package java.util.function;

@FunctionalInterface
public interface BiConsumer<T, U> {
	void accept(final T p0, final U p1);

	default BiConsumer<T, U> andThen(final BiConsumer<? super T, ? super U> after) {
		throw new RuntimeException("Stub!");
	}
}
