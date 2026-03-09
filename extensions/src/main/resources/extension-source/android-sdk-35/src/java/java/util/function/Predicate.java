package java.util.function;

@FunctionalInterface
public interface Predicate<T> {
	boolean test(final T p0);

	default Predicate<T> and(final Predicate<? super T> other) {
		throw new RuntimeException("Stub!");
	}

	default Predicate<T> negate() {
		throw new RuntimeException("Stub!");
	}

	default Predicate<T> or(final Predicate<? super T> other) {
		throw new RuntimeException("Stub!");
	}

	default <T> Predicate<T> isEqual(final Object targetRef) {
		throw new RuntimeException("Stub!");
	}

	default <T> Predicate<T> not(final Predicate<? super T> target) {
		throw new RuntimeException("Stub!");
	}
}
