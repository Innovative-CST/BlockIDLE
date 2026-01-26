package java.time.temporal;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.Locale;

public final class WeekFields implements Serializable {
	public static final WeekFields ISO;
	public static final WeekFields SUNDAY_START;
	public static final TemporalUnit WEEK_BASED_YEARS;

	WeekFields() {
		throw new RuntimeException("Stub!");
	}

	public static WeekFields of(final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	public static WeekFields of(final DayOfWeek firstDayOfWeek, final int minimalDaysInFirstWeek) {
		throw new RuntimeException("Stub!");
	}

	public DayOfWeek getFirstDayOfWeek() {
		throw new RuntimeException("Stub!");
	}

	public int getMinimalDaysInFirstWeek() {
		throw new RuntimeException("Stub!");
	}

	public TemporalField dayOfWeek() {
		throw new RuntimeException("Stub!");
	}

	public TemporalField weekOfMonth() {
		throw new RuntimeException("Stub!");
	}

	public TemporalField weekOfYear() {
		throw new RuntimeException("Stub!");
	}

	public TemporalField weekOfWeekBasedYear() {
		throw new RuntimeException("Stub!");
	}

	public TemporalField weekBasedYear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object object) {
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

	static {
		ISO = null;
		SUNDAY_START = null;
		WEEK_BASED_YEARS = null;
	}
}
