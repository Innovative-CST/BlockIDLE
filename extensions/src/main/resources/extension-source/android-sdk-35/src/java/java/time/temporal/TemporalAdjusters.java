package java.time.temporal;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.UnaryOperator;

public final class TemporalAdjusters {
	TemporalAdjusters() {
		throw new RuntimeException("Stub!");
	}

	public static TemporalAdjuster ofDateAdjuster(final UnaryOperator<LocalDate> dateBasedAdjuster) {
		throw new RuntimeException("Stub!");
	}

	public static TemporalAdjuster firstDayOfMonth() {
		throw new RuntimeException("Stub!");
	}

	public static TemporalAdjuster lastDayOfMonth() {
		throw new RuntimeException("Stub!");
	}

	public static TemporalAdjuster firstDayOfNextMonth() {
		throw new RuntimeException("Stub!");
	}

	public static TemporalAdjuster firstDayOfYear() {
		throw new RuntimeException("Stub!");
	}

	public static TemporalAdjuster lastDayOfYear() {
		throw new RuntimeException("Stub!");
	}

	public static TemporalAdjuster firstDayOfNextYear() {
		throw new RuntimeException("Stub!");
	}

	public static TemporalAdjuster firstInMonth(final DayOfWeek dayOfWeek) {
		throw new RuntimeException("Stub!");
	}

	public static TemporalAdjuster lastInMonth(final DayOfWeek dayOfWeek) {
		throw new RuntimeException("Stub!");
	}

	public static TemporalAdjuster dayOfWeekInMonth(final int ordinal, final DayOfWeek dayOfWeek) {
		throw new RuntimeException("Stub!");
	}

	public static TemporalAdjuster next(final DayOfWeek dayOfWeek) {
		throw new RuntimeException("Stub!");
	}

	public static TemporalAdjuster nextOrSame(final DayOfWeek dayOfWeek) {
		throw new RuntimeException("Stub!");
	}

	public static TemporalAdjuster previous(final DayOfWeek dayOfWeek) {
		throw new RuntimeException("Stub!");
	}

	public static TemporalAdjuster previousOrSame(final DayOfWeek dayOfWeek) {
		throw new RuntimeException("Stub!");
	}
}
