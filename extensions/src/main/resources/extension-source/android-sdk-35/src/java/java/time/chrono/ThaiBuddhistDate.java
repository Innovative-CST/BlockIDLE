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

public final class ThaiBuddhistDate implements ChronoLocalDate, Temporal, TemporalAdjuster, Serializable {
	ThaiBuddhistDate() {
		throw new RuntimeException("Stub!");
	}

	public static ThaiBuddhistDate now() {
		throw new RuntimeException("Stub!");
	}

	public static ThaiBuddhistDate now(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static ThaiBuddhistDate now(final Clock clock) {
		throw new RuntimeException("Stub!");
	}

	public static ThaiBuddhistDate of(final int prolepticYear, final int month, final int dayOfMonth) {
		throw new RuntimeException("Stub!");
	}

	public static ThaiBuddhistDate from(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ThaiBuddhistChronology getChronology() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ThaiBuddhistEra getEra() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int lengthOfMonth() {
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
	public ThaiBuddhistDate with(final TemporalField field, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ThaiBuddhistDate with(final TemporalAdjuster adjuster) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ThaiBuddhistDate plus(final TemporalAmount amount) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ThaiBuddhistDate minus(final TemporalAmount amount) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ThaiBuddhistDate plus(final long amountToAdd, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ThaiBuddhistDate minus(final long amountToAdd, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ChronoLocalDateTime<ThaiBuddhistDate> atTime(final LocalTime localTime) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ChronoPeriod until(final ChronoLocalDate endDate) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long toEpochDay() {
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
