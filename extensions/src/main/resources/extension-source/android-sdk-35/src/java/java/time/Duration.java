package java.time;

import java.io.Serializable;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.List;

public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
	public static final Duration ZERO;

	Duration() {
		throw new RuntimeException("Stub!");
	}

	public static Duration ofDays(final long days) {
		throw new RuntimeException("Stub!");
	}

	public static Duration ofHours(final long hours) {
		throw new RuntimeException("Stub!");
	}

	public static Duration ofMinutes(final long minutes) {
		throw new RuntimeException("Stub!");
	}

	public static Duration ofSeconds(final long seconds) {
		throw new RuntimeException("Stub!");
	}

	public static Duration ofSeconds(final long seconds, final long nanoAdjustment) {
		throw new RuntimeException("Stub!");
	}

	public static Duration ofMillis(final long millis) {
		throw new RuntimeException("Stub!");
	}

	public static Duration ofNanos(final long nanos) {
		throw new RuntimeException("Stub!");
	}

	public static Duration of(final long amount, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public static Duration from(final TemporalAmount amount) {
		throw new RuntimeException("Stub!");
	}

	public static Duration parse(final CharSequence text) {
		throw new RuntimeException("Stub!");
	}

	public static Duration between(final Temporal startInclusive, final Temporal endExclusive) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long get(final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public List<TemporalUnit> getUnits() {
		throw new RuntimeException("Stub!");
	}

	public boolean isZero() {
		throw new RuntimeException("Stub!");
	}

	public boolean isNegative() {
		throw new RuntimeException("Stub!");
	}

	public long getSeconds() {
		throw new RuntimeException("Stub!");
	}

	public int getNano() {
		throw new RuntimeException("Stub!");
	}

	public Duration withSeconds(final long seconds) {
		throw new RuntimeException("Stub!");
	}

	public Duration withNanos(final int nanoOfSecond) {
		throw new RuntimeException("Stub!");
	}

	public Duration plus(final Duration duration) {
		throw new RuntimeException("Stub!");
	}

	public Duration plus(final long amountToAdd, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public Duration plusDays(final long daysToAdd) {
		throw new RuntimeException("Stub!");
	}

	public Duration plusHours(final long hoursToAdd) {
		throw new RuntimeException("Stub!");
	}

	public Duration plusMinutes(final long minutesToAdd) {
		throw new RuntimeException("Stub!");
	}

	public Duration plusSeconds(final long secondsToAdd) {
		throw new RuntimeException("Stub!");
	}

	public Duration plusMillis(final long millisToAdd) {
		throw new RuntimeException("Stub!");
	}

	public Duration plusNanos(final long nanosToAdd) {
		throw new RuntimeException("Stub!");
	}

	public Duration minus(final Duration duration) {
		throw new RuntimeException("Stub!");
	}

	public Duration minus(final long amountToSubtract, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public Duration minusDays(final long daysToSubtract) {
		throw new RuntimeException("Stub!");
	}

	public Duration minusHours(final long hoursToSubtract) {
		throw new RuntimeException("Stub!");
	}

	public Duration minusMinutes(final long minutesToSubtract) {
		throw new RuntimeException("Stub!");
	}

	public Duration minusSeconds(final long secondsToSubtract) {
		throw new RuntimeException("Stub!");
	}

	public Duration minusMillis(final long millisToSubtract) {
		throw new RuntimeException("Stub!");
	}

	public Duration minusNanos(final long nanosToSubtract) {
		throw new RuntimeException("Stub!");
	}

	public Duration multipliedBy(final long multiplicand) {
		throw new RuntimeException("Stub!");
	}

	public Duration dividedBy(final long divisor) {
		throw new RuntimeException("Stub!");
	}

	public long dividedBy(final Duration divisor) {
		throw new RuntimeException("Stub!");
	}

	public Duration negated() {
		throw new RuntimeException("Stub!");
	}

	public Duration abs() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Temporal addTo(final Temporal temporal) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Temporal subtractFrom(final Temporal temporal) {
		throw new RuntimeException("Stub!");
	}

	public long toDays() {
		throw new RuntimeException("Stub!");
	}

	public long toHours() {
		throw new RuntimeException("Stub!");
	}

	public long toMinutes() {
		throw new RuntimeException("Stub!");
	}

	public long toSeconds() {
		throw new RuntimeException("Stub!");
	}

	public long toMillis() {
		throw new RuntimeException("Stub!");
	}

	public long toNanos() {
		throw new RuntimeException("Stub!");
	}

	public long toDaysPart() {
		throw new RuntimeException("Stub!");
	}

	public int toHoursPart() {
		throw new RuntimeException("Stub!");
	}

	public int toMinutesPart() {
		throw new RuntimeException("Stub!");
	}

	public int toSecondsPart() {
		throw new RuntimeException("Stub!");
	}

	public int toMillisPart() {
		throw new RuntimeException("Stub!");
	}

	public int toNanosPart() {
		throw new RuntimeException("Stub!");
	}

	public Duration truncatedTo(final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(final Duration otherDuration) {
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
		ZERO = null;
	}
}
