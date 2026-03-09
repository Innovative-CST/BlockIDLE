package java.time.zone;

import java.io.Serializable;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public final class ZoneOffsetTransition implements Comparable<ZoneOffsetTransition>, Serializable {
	ZoneOffsetTransition() {
		throw new RuntimeException("Stub!");
	}

	public static ZoneOffsetTransition of(final LocalDateTime transition, final ZoneOffset offsetBefore,
			final ZoneOffset offsetAfter) {
		throw new RuntimeException("Stub!");
	}

	public Instant getInstant() {
		throw new RuntimeException("Stub!");
	}

	public long toEpochSecond() {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime getDateTimeBefore() {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime getDateTimeAfter() {
		throw new RuntimeException("Stub!");
	}

	public ZoneOffset getOffsetBefore() {
		throw new RuntimeException("Stub!");
	}

	public ZoneOffset getOffsetAfter() {
		throw new RuntimeException("Stub!");
	}

	public Duration getDuration() {
		throw new RuntimeException("Stub!");
	}

	public boolean isGap() {
		throw new RuntimeException("Stub!");
	}

	public boolean isOverlap() {
		throw new RuntimeException("Stub!");
	}

	public boolean isValidOffset(final ZoneOffset offset) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(final ZoneOffsetTransition transition) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object other) {
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
