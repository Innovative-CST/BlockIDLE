package java.util.concurrent.atomic;

import java.io.Serializable;
import java.util.function.LongBinaryOperator;

public class LongAccumulator extends Number implements Serializable {
	public LongAccumulator(final LongBinaryOperator accumulatorFunction, final long identity) {
		throw new RuntimeException("Stub!");
	}

	public void accumulate(final long x) {
		throw new RuntimeException("Stub!");
	}

	public long get() {
		throw new RuntimeException("Stub!");
	}

	public void reset() {
		throw new RuntimeException("Stub!");
	}

	public long getThenReset() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
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

	@Override
	public double doubleValue() {
		throw new RuntimeException("Stub!");
	}
}
