package java.time;

import java.io.Serializable;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;

public final class Instant implements Temporal, TemporalAdjuster, Comparable<Instant>, Serializable {
	public static final Instant EPOCH;
	public static final Instant MAX;
	public static final Instant MIN;

	Instant() {
		throw new RuntimeException("Stub!");
	}

	public static Instant now() {
		throw new RuntimeException("Stub!");
	}

	public static Instant now(final Clock clock) {
		throw new RuntimeException("Stub!");
	}

	public static Instant ofEpochSecond(final long epochSecond) {
		throw new RuntimeException("Stub!");
	}

	public static Instant ofEpochSecond(final long epochSecond, final long nanoAdjustment) {
		throw new RuntimeException("Stub!");
	}

	public static Instant ofEpochMilli(final long epochMilli) {
		throw new RuntimeException("Stub!");
	}

	public static Instant from(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	public static Instant parse(final CharSequence text) {
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

	public long getEpochSecond() {
		throw new RuntimeException("Stub!");
	}

	public int getNano() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Instant with(final TemporalAdjuster adjuster) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Instant with(final TemporalField field, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public Instant truncatedTo(final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Instant plus(final TemporalAmount amountToAdd) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Instant plus(final long amountToAdd, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public Instant plusSeconds(final long secondsToAdd) {
		throw new RuntimeException("Stub!");
	}

	public Instant plusMillis(final long millisToAdd) {
		throw new RuntimeException("Stub!");
	}

	public Instant plusNanos(final long nanosToAdd) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Instant minus(final TemporalAmount amountToSubtract) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Instant minus(final long amountToSubtract, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public Instant minusSeconds(final long secondsToSubtract) {
		throw new RuntimeException("Stub!");
	}

	public Instant minusMillis(final long millisToSubtract) {
		throw new RuntimeException("Stub!");
	}

	public Instant minusNanos(final long nanosToSubtract) {
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

	public OffsetDateTime atOffset(final ZoneOffset offset) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime atZone(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public long toEpochMilli() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(final Instant otherInstant) {
		throw new RuntimeException("Stub!");
	}

	public boolean isAfter(final Instant otherInstant) {
		throw new RuntimeException("Stub!");
	}

	public boolean isBefore(final Instant otherInstant) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object other) {
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
		EPOCH = null;
		MAX = null;
		MIN = null;
	}
}
