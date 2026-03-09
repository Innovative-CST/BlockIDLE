package java.time;

import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;

public final class Year implements Temporal, TemporalAdjuster, Comparable<Year>, Serializable {
	public static final int MAX_VALUE = 999999999;
	public static final int MIN_VALUE = -999999999;

	Year() {
		throw new RuntimeException("Stub!");
	}

	public static Year now() {
		throw new RuntimeException("Stub!");
	}

	public static Year now(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static Year now(final Clock clock) {
		throw new RuntimeException("Stub!");
	}

	public static Year of(final int isoYear) {
		throw new RuntimeException("Stub!");
	}

	public static Year from(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	public static Year parse(final CharSequence text) {
		throw new RuntimeException("Stub!");
	}

	public static Year parse(final CharSequence text, final DateTimeFormatter formatter) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isLeap(final long year) {
		throw new RuntimeException("Stub!");
	}

	public int getValue() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isSupported(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isSupported(final TemporalUnit unit) {
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

	public boolean isLeap() {
		throw new RuntimeException("Stub!");
	}

	public boolean isValidMonthDay(final MonthDay monthDay) {
		throw new RuntimeException("Stub!");
	}

	public int length() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Year with(final TemporalAdjuster adjuster) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Year with(final TemporalField field, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Year plus(final TemporalAmount amountToAdd) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Year plus(final long amountToAdd, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public Year plusYears(final long yearsToAdd) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Year minus(final TemporalAmount amountToSubtract) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Year minus(final long amountToSubtract, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public Year minusYears(final long yearsToSubtract) {
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

	@Override
	public long until(final Temporal endExclusive, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public String format(final DateTimeFormatter formatter) {
		throw new RuntimeException("Stub!");
	}

	public LocalDate atDay(final int dayOfYear) {
		throw new RuntimeException("Stub!");
	}

	public YearMonth atMonth(final Month month) {
		throw new RuntimeException("Stub!");
	}

	public YearMonth atMonth(final int month) {
		throw new RuntimeException("Stub!");
	}

	public LocalDate atMonthDay(final MonthDay monthDay) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(final Year other) {
		throw new RuntimeException("Stub!");
	}

	public boolean isAfter(final Year other) {
		throw new RuntimeException("Stub!");
	}

	public boolean isBefore(final Year other) {
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
