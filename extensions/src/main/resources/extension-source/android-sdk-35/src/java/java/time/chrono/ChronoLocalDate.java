package java.time.chrono;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.util.Comparator;

public interface ChronoLocalDate extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDate> {
	default Comparator<ChronoLocalDate> timeLineOrder() {
		throw new RuntimeException("Stub!");
	}

	default ChronoLocalDate from(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	Chronology getChronology();

	default Era getEra() {
		throw new RuntimeException("Stub!");
	}

	default boolean isLeapYear() {
		throw new RuntimeException("Stub!");
	}

	int lengthOfMonth();

	default int lengthOfYear() {
		throw new RuntimeException("Stub!");
	}

	default boolean isSupported(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	default boolean isSupported(final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	default ChronoLocalDate with(final TemporalAdjuster adjuster) {
		throw new RuntimeException("Stub!");
	}

	default ChronoLocalDate with(final TemporalField field, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	default ChronoLocalDate plus(final TemporalAmount amount) {
		throw new RuntimeException("Stub!");
	}

	default ChronoLocalDate plus(final long amountToAdd, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	default ChronoLocalDate minus(final TemporalAmount amount) {
		throw new RuntimeException("Stub!");
	}

	default ChronoLocalDate minus(final long amountToSubtract, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	default <R> R query(final TemporalQuery<R> query) {
		throw new RuntimeException("Stub!");
	}

	default Temporal adjustInto(final Temporal temporal) {
		throw new RuntimeException("Stub!");
	}

	long until(final Temporal p0, final TemporalUnit p1);

	ChronoPeriod until(final ChronoLocalDate p0);

	default String format(final DateTimeFormatter formatter) {
		throw new RuntimeException("Stub!");
	}

	default ChronoLocalDateTime<?> atTime(final LocalTime localTime) {
		throw new RuntimeException("Stub!");
	}

	default long toEpochDay() {
		throw new RuntimeException("Stub!");
	}

	default int compareTo(final ChronoLocalDate other) {
		throw new RuntimeException("Stub!");
	}

	default boolean isAfter(final ChronoLocalDate other) {
		throw new RuntimeException("Stub!");
	}

	default boolean isBefore(final ChronoLocalDate other) {
		throw new RuntimeException("Stub!");
	}

	default boolean isEqual(final ChronoLocalDate other) {
		throw new RuntimeException("Stub!");
	}

	boolean equals(final Object p0);

	int hashCode();

	String toString();
}
