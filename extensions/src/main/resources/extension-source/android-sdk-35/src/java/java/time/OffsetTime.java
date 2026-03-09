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

public final class OffsetTime implements Temporal, TemporalAdjuster, Comparable<OffsetTime>, Serializable {
	public static final OffsetTime MAX;
	public static final OffsetTime MIN;

	OffsetTime() {
		throw new RuntimeException("Stub!");
	}

	public static OffsetTime now() {
		throw new RuntimeException("Stub!");
	}

	public static OffsetTime now(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static OffsetTime now(final Clock clock) {
		throw new RuntimeException("Stub!");
	}

	public static OffsetTime of(final LocalTime time, final ZoneOffset offset) {
		throw new RuntimeException("Stub!");
	}

	public static OffsetTime of(final int hour, final int minute, final int second, final int nanoOfSecond,
			final ZoneOffset offset) {
		throw new RuntimeException("Stub!");
	}

	public static OffsetTime ofInstant(final Instant instant, final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static OffsetTime from(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	public static OffsetTime parse(final CharSequence text) {
		throw new RuntimeException("Stub!");
	}

	public static OffsetTime parse(final CharSequence text, final DateTimeFormatter formatter) {
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

	public ZoneOffset getOffset() {
		throw new RuntimeException("Stub!");
	}

	public OffsetTime withOffsetSameLocal(final ZoneOffset offset) {
		throw new RuntimeException("Stub!");
	}

	public OffsetTime withOffsetSameInstant(final ZoneOffset offset) {
		throw new RuntimeException("Stub!");
	}

	public LocalTime toLocalTime() {
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
	public OffsetTime with(final TemporalAdjuster adjuster) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public OffsetTime with(final TemporalField field, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public OffsetTime withHour(final int hour) {
		throw new RuntimeException("Stub!");
	}

	public OffsetTime withMinute(final int minute) {
		throw new RuntimeException("Stub!");
	}

	public OffsetTime withSecond(final int second) {
		throw new RuntimeException("Stub!");
	}

	public OffsetTime withNano(final int nanoOfSecond) {
		throw new RuntimeException("Stub!");
	}

	public OffsetTime truncatedTo(final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public OffsetTime plus(final TemporalAmount amountToAdd) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public OffsetTime plus(final long amountToAdd, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public OffsetTime plusHours(final long hours) {
		throw new RuntimeException("Stub!");
	}

	public OffsetTime plusMinutes(final long minutes) {
		throw new RuntimeException("Stub!");
	}

	public OffsetTime plusSeconds(final long seconds) {
		throw new RuntimeException("Stub!");
	}

	public OffsetTime plusNanos(final long nanos) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public OffsetTime minus(final TemporalAmount amountToSubtract) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public OffsetTime minus(final long amountToSubtract, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public OffsetTime minusHours(final long hours) {
		throw new RuntimeException("Stub!");
	}

	public OffsetTime minusMinutes(final long minutes) {
		throw new RuntimeException("Stub!");
	}

	public OffsetTime minusSeconds(final long seconds) {
		throw new RuntimeException("Stub!");
	}

	public OffsetTime minusNanos(final long nanos) {
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

	public OffsetDateTime atDate(final LocalDate date) {
		throw new RuntimeException("Stub!");
	}

	public long toEpochSecond(final LocalDate date) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(final OffsetTime other) {
		throw new RuntimeException("Stub!");
	}

	public boolean isAfter(final OffsetTime other) {
		throw new RuntimeException("Stub!");
	}

	public boolean isBefore(final OffsetTime other) {
		throw new RuntimeException("Stub!");
	}

	public boolean isEqual(final OffsetTime other) {
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
		MIN = null;
	}
}
