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

public final class YearMonth implements Temporal, TemporalAdjuster, Comparable<YearMonth>, Serializable {
	YearMonth() {
		throw new RuntimeException("Stub!");
	}

	public static YearMonth now() {
		throw new RuntimeException("Stub!");
	}

	public static YearMonth now(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static YearMonth now(final Clock clock) {
		throw new RuntimeException("Stub!");
	}

	public static YearMonth of(final int year, final Month month) {
		throw new RuntimeException("Stub!");
	}

	public static YearMonth of(final int year, final int month) {
		throw new RuntimeException("Stub!");
	}

	public static YearMonth from(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	public static YearMonth parse(final CharSequence text) {
		throw new RuntimeException("Stub!");
	}

	public static YearMonth parse(final CharSequence text, final DateTimeFormatter formatter) {
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

	public int getYear() {
		throw new RuntimeException("Stub!");
	}

	public int getMonthValue() {
		throw new RuntimeException("Stub!");
	}

	public Month getMonth() {
		throw new RuntimeException("Stub!");
	}

	public boolean isLeapYear() {
		throw new RuntimeException("Stub!");
	}

	public boolean isValidDay(final int dayOfMonth) {
		throw new RuntimeException("Stub!");
	}

	public int lengthOfMonth() {
		throw new RuntimeException("Stub!");
	}

	public int lengthOfYear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public YearMonth with(final TemporalAdjuster adjuster) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public YearMonth with(final TemporalField field, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public YearMonth withYear(final int year) {
		throw new RuntimeException("Stub!");
	}

	public YearMonth withMonth(final int month) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public YearMonth plus(final TemporalAmount amountToAdd) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public YearMonth plus(final long amountToAdd, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public YearMonth plusYears(final long yearsToAdd) {
		throw new RuntimeException("Stub!");
	}

	public YearMonth plusMonths(final long monthsToAdd) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public YearMonth minus(final TemporalAmount amountToSubtract) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public YearMonth minus(final long amountToSubtract, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public YearMonth minusYears(final long yearsToSubtract) {
		throw new RuntimeException("Stub!");
	}

	public YearMonth minusMonths(final long monthsToSubtract) {
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

	public LocalDate atDay(final int dayOfMonth) {
		throw new RuntimeException("Stub!");
	}

	public LocalDate atEndOfMonth() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(final YearMonth other) {
		throw new RuntimeException("Stub!");
	}

	public boolean isAfter(final YearMonth other) {
		throw new RuntimeException("Stub!");
	}

	public boolean isBefore(final YearMonth other) {
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
