package java.time.temporal;

import java.io.Serializable;

public final class ValueRange implements Serializable {
	ValueRange() {
		throw new RuntimeException("Stub!");
	}

	public static ValueRange of(final long min, final long max) {
		throw new RuntimeException("Stub!");
	}

	public static ValueRange of(final long min, final long maxSmallest, final long maxLargest) {
		throw new RuntimeException("Stub!");
	}

	public static ValueRange of(final long minSmallest, final long minLargest, final long maxSmallest,
			final long maxLargest) {
		throw new RuntimeException("Stub!");
	}

	public boolean isFixed() {
		throw new RuntimeException("Stub!");
	}

	public long getMinimum() {
		throw new RuntimeException("Stub!");
	}

	public long getLargestMinimum() {
		throw new RuntimeException("Stub!");
	}

	public long getSmallestMaximum() {
		throw new RuntimeException("Stub!");
	}

	public long getMaximum() {
		throw new RuntimeException("Stub!");
	}

	public boolean isIntValue() {
		throw new RuntimeException("Stub!");
	}

	public boolean isValidValue(final long value) {
		throw new RuntimeException("Stub!");
	}

	public boolean isValidIntValue(final long value) {
		throw new RuntimeException("Stub!");
	}

	public long checkValidValue(final long value, final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	public int checkValidIntValue(final long value, final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
