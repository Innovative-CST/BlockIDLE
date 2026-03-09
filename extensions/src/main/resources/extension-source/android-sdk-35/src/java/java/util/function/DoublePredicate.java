package java.util.function;

@FunctionalInterface
public interface DoublePredicate {
	boolean test(final double p0);

	default DoublePredicate and(final DoublePredicate other) {
		throw new RuntimeException("Stub!");
	}

	default DoublePredicate negate() {
		throw new RuntimeException("Stub!");
	}

	default DoublePredicate or(final DoublePredicate other) {
		throw new RuntimeException("Stub!");
	}
}
