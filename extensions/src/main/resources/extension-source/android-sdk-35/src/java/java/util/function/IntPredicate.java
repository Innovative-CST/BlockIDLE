package java.util.function;

@FunctionalInterface
public interface IntPredicate {
	boolean test(final int p0);

	default IntPredicate and(final IntPredicate other) {
		throw new RuntimeException("Stub!");
	}

	default IntPredicate negate() {
		throw new RuntimeException("Stub!");
	}

	default IntPredicate or(final IntPredicate other) {
		throw new RuntimeException("Stub!");
	}
}
