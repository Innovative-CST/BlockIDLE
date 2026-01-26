package java.time.zone;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneOffset;

public final class ZoneOffsetTransitionRule implements Serializable {
	ZoneOffsetTransitionRule() {
		throw new RuntimeException("Stub!");
	}

	public static ZoneOffsetTransitionRule of(final Month month, final int dayOfMonthIndicator,
			final DayOfWeek dayOfWeek, final LocalTime time, final boolean timeEndOfDay,
			final TimeDefinition timeDefinition, final ZoneOffset standardOffset, final ZoneOffset offsetBefore,
			final ZoneOffset offsetAfter) {
		throw new RuntimeException("Stub!");
	}

	public Month getMonth() {
		throw new RuntimeException("Stub!");
	}

	public int getDayOfMonthIndicator() {
		throw new RuntimeException("Stub!");
	}

	public DayOfWeek getDayOfWeek() {
		throw new RuntimeException("Stub!");
	}

	public LocalTime getLocalTime() {
		throw new RuntimeException("Stub!");
	}

	public boolean isMidnightEndOfDay() {
		throw new RuntimeException("Stub!");
	}

	public TimeDefinition getTimeDefinition() {
		throw new RuntimeException("Stub!");
	}

	public ZoneOffset getStandardOffset() {
		throw new RuntimeException("Stub!");
	}

	public ZoneOffset getOffsetBefore() {
		throw new RuntimeException("Stub!");
	}

	public ZoneOffset getOffsetAfter() {
		throw new RuntimeException("Stub!");
	}

	public ZoneOffsetTransition createTransition(final int year) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object otherRule) {
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

	public enum TimeDefinition {
		UTC, WALL, STANDARD;

		public LocalDateTime createDateTime(final LocalDateTime dateTime, final ZoneOffset standardOffset,
				final ZoneOffset wallOffset) {
			throw new RuntimeException("Stub!");
		}
	}
}
