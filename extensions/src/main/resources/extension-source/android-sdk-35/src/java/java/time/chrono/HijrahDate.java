package java.time.chrono;

import java.io.Serializable;
import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;

public final class HijrahDate implements ChronoLocalDate, Temporal, TemporalAdjuster, Serializable {
	HijrahDate() {
		throw new RuntimeException("Stub!");
	}

	public static HijrahDate now() {
		throw new RuntimeException("Stub!");
	}

	public static HijrahDate now(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static HijrahDate now(final Clock clock) {
		throw new RuntimeException("Stub!");
	}

	public static HijrahDate of(final int prolepticYear, final int month, final int dayOfMonth) {
		throw new RuntimeException("Stub!");
	}

	public static HijrahDate from(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public HijrahChronology getChronology() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public HijrahEra getEra() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int lengthOfMonth() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int lengthOfYear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ValueRange range(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long getLong(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public HijrahDate with(final TemporalField field, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public HijrahDate with(final TemporalAdjuster adjuster) {
		throw new RuntimeException("Stub!");
	}

	public HijrahDate withVariant(final HijrahChronology chronology) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public HijrahDate plus(final TemporalAmount amount) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public HijrahDate minus(final TemporalAmount amount) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long toEpochDay() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isLeapYear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public HijrahDate plus(final long amountToAdd, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public HijrahDate minus(final long amountToSubtract, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ChronoLocalDateTime<HijrahDate> atTime(final LocalTime localTime) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ChronoPeriod until(final ChronoLocalDate endDate) {
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
	public long until(final Temporal endExclusive, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
