package java.time;

import java.time.format.TextStyle;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.ValueRange;
import java.util.Locale;

public enum Month implements TemporalAccessor, TemporalAdjuster {
	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

	public static Month of(final int month) {
		throw new RuntimeException("Stub!");
	}

	public static Month from(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	public int getValue() {
		throw new RuntimeException("Stub!");
	}

	public String getDisplayName(final TextStyle style, final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isSupported(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ValueRange range(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int get(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long getLong(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	public Month plus(final long months) {
		throw new RuntimeException("Stub!");
	}

	public Month minus(final long months) {
		throw new RuntimeException("Stub!");
	}

	public int length(final boolean leapYear) {
		throw new RuntimeException("Stub!");
	}

	public int minLength() {
		throw new RuntimeException("Stub!");
	}

	public int maxLength() {
		throw new RuntimeException("Stub!");
	}

	public int firstDayOfYear(final boolean leapYear) {
		throw new RuntimeException("Stub!");
	}

	public Month firstMonthOfQuarter() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <R> R query(final TemporalQuery<R> query) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Temporal adjustInto(final Temporal temporal) {
		throw new RuntimeException("Stub!");
	}
}
