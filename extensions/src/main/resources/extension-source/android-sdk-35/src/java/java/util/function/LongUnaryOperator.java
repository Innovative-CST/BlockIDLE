package java.util.function;

@FunctionalInterface
public interface LongUnaryOperator {
	long applyAsLong(final long p0);

	default LongUnaryOperator compose(final LongUnaryOperator before) {
		throw new RuntimeException("Stub!");
	}

	default LongUnaryOperator andThen(final LongUnaryOperator after) {
		throw new RuntimeException("Stub!");
	}

	default LongUnaryOperator identity() {
		throw new RuntimeException("Stub!");
	}
}
