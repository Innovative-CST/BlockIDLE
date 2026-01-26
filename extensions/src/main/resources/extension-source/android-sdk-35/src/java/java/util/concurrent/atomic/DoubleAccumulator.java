package java.util.concurrent.atomic;

import java.io.Serializable;
import java.util.function.DoubleBinaryOperator;

public class DoubleAccumulator extends Number implements Serializable {
	public DoubleAccumulator(final DoubleBinaryOperator accumulatorFunction, final double identity) {
		throw new RuntimeException("Stub!");
	}

	public void accumulate(final double x) {
		throw new RuntimeException("Stub!");
	}

	public double get() {
		throw new RuntimeException("Stub!");
	}

	public void reset() {
		throw new RuntimeException("Stub!");
	}

	public double getThenReset() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public double doubleValue() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long longValue() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int intValue() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public float floatValue() {
		throw new RuntimeException("Stub!");
	}
}
