package java.time.chrono;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.util.Comparator;

public interface ChronoLocalDateTime<D extends ChronoLocalDate>
		extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDateTime<?>> {
	default Comparator<ChronoLocalDateTime<?>> timeLineOrder() {
		throw new RuntimeException("Stub!");
	}

	default ChronoLocalDateTime<?> from(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	default Chronology getChronology() {
		throw new RuntimeException("Stub!");
	}

	D toLocalDate();

	LocalTime toLocalTime();

	boolean isSupported(final TemporalField p0);

	default boolean isSupported(final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	default ChronoLocalDateTime<D> with(final TemporalAdjuster adjuster) {
		throw new RuntimeException("Stub!");
	}

	ChronoLocalDateTime<D> with(final TemporalField p0, final long p1);

	default ChronoLocalDateTime<D> plus(final TemporalAmount amount) {
		throw new RuntimeException("Stub!");
	}

	ChronoLocalDateTime<D> plus(final long p0, final TemporalUnit p1);

	default ChronoLocalDateTime<D> minus(final TemporalAmount amount) {
		throw new RuntimeException("Stub!");
	}

	default ChronoLocalDateTime<D> minus(final long amountToSubtract, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	default <R> R query(final TemporalQuery<R> query) {
		throw new RuntimeException("Stub!");
	}

	default Temporal adjustInto(final Temporal temporal) {
		throw new RuntimeException("Stub!");
	}

	default String format(final DateTimeFormatter formatter) {
		throw new RuntimeException("Stub!");
	}

	ChronoZonedDateTime<D> atZone(final ZoneId p0);

	default Instant toInstant(final ZoneOffset offset) {
		throw new RuntimeException("Stub!");
	}

	default long toEpochSecond(final ZoneOffset offset) {
		throw new RuntimeException("Stub!");
	}

	default int compareTo(final ChronoLocalDateTime<?> other) {
		throw new RuntimeException("Stub!");
	}

	default boolean isAfter(final ChronoLocalDateTime<?> other) {
		throw new RuntimeException("Stub!");
	}

	default boolean isBefore(final ChronoLocalDateTime<?> other) {
		throw new RuntimeException("Stub!");
	}

	default boolean isEqual(final ChronoLocalDateTime<?> other) {
		throw new RuntimeException("Stub!");
	}

	boolean equals(final Object p0);

	int hashCode();

	String toString();
}
