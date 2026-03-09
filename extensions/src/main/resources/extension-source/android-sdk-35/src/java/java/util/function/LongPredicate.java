package java.util.function;

@FunctionalInterface
public interface LongPredicate {
	boolean test(final long p0);

	default LongPredicate and(final LongPredicate other) {
		throw new RuntimeException("Stub!");
	}

	default LongPredicate negate() {
		throw new RuntimeException("Stub!");
	}

	default LongPredicate or(final LongPredicate other) {
		throw new RuntimeException("Stub!");
	}
}
