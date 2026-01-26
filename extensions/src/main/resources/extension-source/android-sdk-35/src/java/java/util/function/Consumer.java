package java.util.function;

@FunctionalInterface
public interface Consumer<T> {
	void accept(final T p0);

	default Consumer<T> andThen(final Consumer<? super T> after) {
		throw new RuntimeException("Stub!");
	}
}
