package java.util.function;

@FunctionalInterface
public interface DoubleUnaryOperator {
	double applyAsDouble(final double p0);

	default DoubleUnaryOperator compose(final DoubleUnaryOperator before) {
		throw new RuntimeException("Stub!");
	}

	default DoubleUnaryOperator andThen(final DoubleUnaryOperator after) {
		throw new RuntimeException("Stub!");
	}

	default DoubleUnaryOperator identity() {
		throw new RuntimeException("Stub!");
	}
}
