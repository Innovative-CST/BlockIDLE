package java.util.function;

@FunctionalInterface
public interface BiPredicate<T, U> {
	boolean test(final T p0, final U p1);

	default BiPredicate<T, U> and(final BiPredicate<? super T, ? super U> other) {
		throw new RuntimeException("Stub!");
	}

	default BiPredicate<T, U> negate() {
		throw new RuntimeException("Stub!");
	}

	default BiPredicate<T, U> or(final BiPredicate<? super T, ? super U> other) {
		throw new RuntimeException("Stub!");
	}
}
