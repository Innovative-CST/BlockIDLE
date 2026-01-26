package java.time;

import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.ValueRange;

public final class MonthDay implements TemporalAccessor, TemporalAdjuster, Comparable<MonthDay>, Serializable {
	MonthDay() {
		throw new RuntimeException("Stub!");
	}

	public static MonthDay now() {
		throw new RuntimeException("Stub!");
	}

	public static MonthDay now(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static MonthDay now(final Clock clock) {
		throw new RuntimeException("Stub!");
	}

	public static MonthDay of(final Month month, final int dayOfMonth) {
		throw new RuntimeException("Stub!");
	}

	public static MonthDay of(final int month, final int dayOfMonth) {
		throw new RuntimeException("Stub!");
	}

	public static MonthDay from(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	public static MonthDay parse(final CharSequence text) {
		throw new RuntimeException("Stub!");
	}

	public static MonthDay parse(final CharSequence text, final DateTimeFormatter formatter) {
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

	public int getMonthValue() {
		throw new RuntimeException("Stub!");
	}

	public Month getMonth() {
		throw new RuntimeException("Stub!");
	}

	public int getDayOfMonth() {
		throw new RuntimeException("Stub!");
	}

	public boolean isValidYear(final int year) {
		throw new RuntimeException("Stub!");
	}

	public MonthDay withMonth(final int month) {
		throw new RuntimeException("Stub!");
	}

	public MonthDay with(final Month month) {
		throw new RuntimeException("Stub!");
	}

	public MonthDay withDayOfMonth(final int dayOfMonth) {
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

	public String format(final DateTimeFormatter formatter) {
		throw new RuntimeException("Stub!");
	}

	public LocalDate atYear(final int year) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(final MonthDay other) {
		throw new RuntimeException("Stub!");
	}

	public boolean isAfter(final MonthDay other) {
		throw new RuntimeException("Stub!");
	}

	public boolean isBefore(final MonthDay other) {
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
