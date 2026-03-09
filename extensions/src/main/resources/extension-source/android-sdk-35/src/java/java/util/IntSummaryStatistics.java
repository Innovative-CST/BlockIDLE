package java.util;

import java.util.function.IntConsumer;

public class IntSummaryStatistics implements IntConsumer {
	public IntSummaryStatistics() {
		throw new RuntimeException("Stub!");
	}

	public IntSummaryStatistics(final long count, final int min, final int max, final long sum)
			throws IllegalArgumentException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void accept(final int value) {
		throw new RuntimeException("Stub!");
	}

	public void combine(final IntSummaryStatistics other) {
		throw new RuntimeException("Stub!");
	}

	public final long getCount() {
		throw new RuntimeException("Stub!");
	}

	public final long getSum() {
		throw new RuntimeException("Stub!");
	}

	public final int getMin() {
		throw new RuntimeException("Stub!");
	}

	public final int getMax() {
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
