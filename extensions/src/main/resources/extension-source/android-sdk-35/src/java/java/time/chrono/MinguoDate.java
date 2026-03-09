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

public final class MinguoDate implements ChronoLocalDate, Temporal, TemporalAdjuster, Serializable {
	MinguoDate() {
		throw new RuntimeException("Stub!");
	}

	public static MinguoDate now() {
		throw new RuntimeException("Stub!");
	}

	public static MinguoDate now(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static MinguoDate now(final Clock clock) {
		throw new RuntimeException("Stub!");
	}

	public static MinguoDate of(final int prolepticYear, final int month, final int dayOfMonth) {
		throw new RuntimeException("Stub!");
	}

	public static MinguoDate from(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public MinguoChronology getChronology() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public MinguoEra getEra() {
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
	public MinguoDate with(final TemporalField field, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public MinguoDate with(final TemporalAdjuster adjuster) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public MinguoDate plus(final TemporalAmount amount) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public MinguoDate minus(final TemporalAmount amount) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public MinguoDate plus(final long amountToAdd, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public MinguoDate minus(final long amountToAdd, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ChronoLocalDateTime<MinguoDate> atTime(final LocalTime localTime) {
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
