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

public final class LocalTime implements Temporal, TemporalAdjuster, Comparable<LocalTime>, Serializable {
	public static final LocalTime MAX;
	public static final LocalTime MIDNIGHT;
	public static final LocalTime MIN;
	public static final LocalTime NOON;

	LocalTime() {
		throw new RuntimeException("Stub!");
	}

	public static LocalTime now() {
		throw new RuntimeException("Stub!");
	}

	public static LocalTime now(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static LocalTime now(final Clock clock) {
		throw new RuntimeException("Stub!");
	}

	public static LocalTime of(final int hour, final int minute) {
		throw new RuntimeException("Stub!");
	}

	public static LocalTime of(final int hour, final int minute, final int second) {
		throw new RuntimeException("Stub!");
	}

	public static LocalTime of(final int hour, final int minute, final int second, final int nanoOfSecond) {
		throw new RuntimeException("Stub!");
	}

	public static LocalTime ofInstant(final Instant instant, final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static LocalTime ofSecondOfDay(final long secondOfDay) {
		throw new RuntimeException("Stub!");
	}

	public static LocalTime ofNanoOfDay(final long nanoOfDay) {
		throw new RuntimeException("Stub!");
	}

	public static LocalTime from(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	public static LocalTime parse(final CharSequence text) {
		throw new RuntimeException("Stub!");
	}

	public static LocalTime parse(final CharSequence text, final DateTimeFormatter formatter) {
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

	public int getHour() {
		throw new RuntimeException("Stub!");
	}

	public int getMinute() {
		throw new RuntimeException("Stub!");
	}

	public int getSecond() {
		throw new RuntimeException("Stub!");
	}

	public int getNano() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalTime with(final TemporalAdjuster adjuster) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalTime with(final TemporalField field, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public LocalTime withHour(final int hour) {
		throw new RuntimeException("Stub!");
	}

	public LocalTime withMinute(final int minute) {
		throw new RuntimeException("Stub!");
	}

	public LocalTime withSecond(final int second) {
		throw new RuntimeException("Stub!");
	}

	public LocalTime withNano(final int nanoOfSecond) {
		throw new RuntimeException("Stub!");
	}

	public LocalTime truncatedTo(final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalTime plus(final TemporalAmount amountToAdd) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalTime plus(final long amountToAdd, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public LocalTime plusHours(final long hoursToAdd) {
		throw new RuntimeException("Stub!");
	}

	public LocalTime plusMinutes(final long minutesToAdd) {
		throw new RuntimeException("Stub!");
	}

	public LocalTime plusSeconds(final long secondstoAdd) {
		throw new RuntimeException("Stub!");
	}

	public LocalTime plusNanos(final long nanosToAdd) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalTime minus(final TemporalAmount amountToSubtract) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalTime minus(final long amountToSubtract, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public LocalTime minusHours(final long hoursToSubtract) {
		throw new RuntimeException("Stub!");
	}

	public LocalTime minusMinutes(final long minutesToSubtract) {
		throw new RuntimeException("Stub!");
	}

	public LocalTime minusSeconds(final long secondsToSubtract) {
		throw new RuntimeException("Stub!");
	}

	public LocalTime minusNanos(final long nanosToSubtract) {
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

	public LocalDateTime atDate(final LocalDate date) {
		throw new RuntimeException("Stub!");
	}

	public OffsetTime atOffset(final ZoneOffset offset) {
		throw new RuntimeException("Stub!");
	}

	public int toSecondOfDay() {
		throw new RuntimeException("Stub!");
	}

	public long toNanoOfDay() {
		throw new RuntimeException("Stub!");
	}

	public long toEpochSecond(final LocalDate date, final ZoneOffset offset) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(final LocalTime other) {
		throw new RuntimeException("Stub!");
	}

	public boolean isAfter(final LocalTime other) {
		throw new RuntimeException("Stub!");
	}

	public boolean isBefore(final LocalTime other) {
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

	static {
		MAX = null;
		MIDNIGHT = null;
		MIN = null;
		NOON = null;
	}
}
