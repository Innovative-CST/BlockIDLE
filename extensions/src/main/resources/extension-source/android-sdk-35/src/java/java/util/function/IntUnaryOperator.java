package java.util.function;

@FunctionalInterface
public interface IntUnaryOperator {
	int applyAsInt(final int p0);

	default IntUnaryOperator compose(final IntUnaryOperator before) {
		throw new RuntimeException("Stub!");
	}

	default IntUnaryOperator andThen(final IntUnaryOperator after) {
		throw new RuntimeException("Stub!");
	}

	default IntUnaryOperator identity() {
		throw new RuntimeException("Stub!");
	}
}
