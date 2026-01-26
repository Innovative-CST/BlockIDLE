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
import java.time.temporal.ValueRange;
import java.util.Comparator;

public interface ChronoZonedDateTime<D extends ChronoLocalDate> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
	default Comparator<ChronoZonedDateTime<?>> timeLineOrder() {
		throw new RuntimeException("Stub!");
	}

	default ChronoZonedDateTime<?> from(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	default ValueRange range(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	default int get(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	default long getLong(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	default D toLocalDate() {
		throw new RuntimeException("Stub!");
	}

	default LocalTime toLocalTime() {
		throw new RuntimeException("Stub!");
	}

	ChronoLocalDateTime<D> toLocalDateTime();

	default Chronology getChronology() {
		throw new RuntimeException("Stub!");
	}

	ZoneOffset getOffset();

	ZoneId getZone();

	ChronoZonedDateTime<D> withEarlierOffsetAtOverlap();

	ChronoZonedDateTime<D> withLaterOffsetAtOverlap();

	ChronoZonedDateTime<D> withZoneSameLocal(final ZoneId p0);

	ChronoZonedDateTime<D> withZoneSameInstant(final ZoneId p0);

	boolean isSupported(final TemporalField p0);

	default boolean isSupported(final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	default ChronoZonedDateTime<D> with(final TemporalAdjuster adjuster) {
		throw new RuntimeException("Stub!");
	}

	ChronoZonedDateTime<D> with(final TemporalField p0, final long p1);

	default ChronoZonedDateTime<D> plus(final TemporalAmount amount) {
		throw new RuntimeException("Stub!");
	}

	ChronoZonedDateTime<D> plus(final long p0, final TemporalUnit p1);

	default ChronoZonedDateTime<D> minus(final TemporalAmount amount) {
		throw new RuntimeException("Stub!");
	}

	default ChronoZonedDateTime<D> minus(final long amountToSubtract, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	default <R> R query(final TemporalQuery<R> query) {
		throw new RuntimeException("Stub!");
	}

	default String format(final DateTimeFormatter formatter) {
		throw new RuntimeException("Stub!");
	}

	default Instant toInstant() {
		throw new RuntimeException("Stub!");
	}

	default long toEpochSecond() {
		throw new RuntimeException("Stub!");
	}

	default int compareTo(final ChronoZonedDateTime<?> other) {
		throw new RuntimeException("Stub!");
	}

	default boolean isBefore(final ChronoZonedDateTime<?> other) {
		throw new RuntimeException("Stub!");
	}

	default boolean isAfter(final ChronoZonedDateTime<?> other) {
		throw new RuntimeException("Stub!");
	}

	default boolean isEqual(final ChronoZonedDateTime<?> other) {
		throw new RuntimeException("Stub!");
	}

	boolean equals(final Object p0);

	int hashCode();

	String toString();
}
