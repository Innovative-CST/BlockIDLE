package java.util;

import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class LongSummaryStatistics implements LongConsumer, IntConsumer {
	public LongSummaryStatistics() {
		throw new RuntimeException("Stub!");
	}

	public LongSummaryStatistics(final long count, final long min, final long max, final long sum)
			throws IllegalArgumentException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void accept(final int value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void accept(final long value) {
		throw new RuntimeException("Stub!");
	}

	public void combine(final LongSummaryStatistics other) {
		throw new RuntimeException("Stub!");
	}

	public final long getCount() {
		throw new RuntimeException("Stub!");
	}

	public final long getSum() {
		throw new RuntimeException("Stub!");
	}

	public final long getMin() {
		throw new RuntimeException("Stub!");
	}

	public final long getMax() {
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
