package java.util;

import java.util.function.DoubleConsumer;

public class DoubleSummaryStatistics implements DoubleConsumer {
	public DoubleSummaryStatistics() {
		throw new RuntimeException("Stub!");
	}

	public DoubleSummaryStatistics(final long count, final double min, final double max, final double sum)
			throws IllegalArgumentException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void accept(final double value) {
		throw new RuntimeException("Stub!");
	}

	public void combine(final DoubleSummaryStatistics other) {
		throw new RuntimeException("Stub!");
	}

	public final long getCount() {
		throw new RuntimeException("Stub!");
	}

	public final double getSum() {
		throw new RuntimeException("Stub!");
	}

	public final double getMin() {
		throw new RuntimeException("Stub!");
	}

	public final double getMax() {
		throw new RuntimeException("Stub!");
	}

	public final double getAverage() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
