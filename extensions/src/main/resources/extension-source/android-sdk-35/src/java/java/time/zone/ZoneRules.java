package java.time.zone;

import java.io.Serializable;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;

public final class ZoneRules implements Serializable {
	ZoneRules() {
		throw new RuntimeException("Stub!");
	}

	public static ZoneRules of(final ZoneOffset baseStandardOffset, final ZoneOffset baseWallOffset,
			final List<ZoneOffsetTransition> standardOffsetTransitionList,
			final List<ZoneOffsetTransition> transitionList, final List<ZoneOffsetTransitionRule> lastRules) {
		throw new RuntimeException("Stub!");
	}

	public static ZoneRules of(final ZoneOffset offset) {
		throw new RuntimeException("Stub!");
	}

	public boolean isFixedOffset() {
		throw new RuntimeException("Stub!");
	}

	public ZoneOffset getOffset(final Instant instant) {
		throw new RuntimeException("Stub!");
	}

	public ZoneOffset getOffset(final LocalDateTime localDateTime) {
		throw new RuntimeException("Stub!");
	}

	public List<ZoneOffset> getValidOffsets(final LocalDateTime localDateTime) {
		throw new RuntimeException("Stub!");
	}

	public ZoneOffsetTransition getTransition(final LocalDateTime localDateTime) {
		throw new RuntimeException("Stub!");
	}

	public ZoneOffset getStandardOffset(final Instant instant) {
		throw new RuntimeException("Stub!");
	}

	public Duration getDaylightSavings(final Instant instant) {
		throw new RuntimeException("Stub!");
	}

	public boolean isDaylightSavings(final Instant instant) {
		throw new RuntimeException("Stub!");
	}

	public boolean isValidOffset(final LocalDateTime localDateTime, final ZoneOffset offset) {
		throw new RuntimeException("Stub!");
	}

	public ZoneOffsetTransition nextTransition(final Instant instant) {
		throw new RuntimeException("Stub!");
	}

	public ZoneOffsetTransition previousTransition(final Instant instant) {
		throw new RuntimeException("Stub!");
	}

	public List<ZoneOffsetTransition> getTransitions() {
		throw new RuntimeException("Stub!");
	}

	public List<ZoneOffsetTransitionRule> getTransitionRules() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object otherRules) {
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
