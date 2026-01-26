package java.time;

import java.io.Serializable;
import java.time.chrono.ChronoPeriod;
import java.time.chrono.IsoChronology;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.List;

public final class Period implements ChronoPeriod, Serializable {
	public static final Period ZERO;

	Period() {
		throw new RuntimeException("Stub!");
	}

	public static Period ofYears(final int years) {
		throw new RuntimeException("Stub!");
	}

	public static Period ofMonths(final int months) {
		throw new RuntimeException("Stub!");
	}

	public static Period ofWeeks(final int weeks) {
		throw new RuntimeException("Stub!");
	}

	public static Period ofDays(final int days) {
		throw new RuntimeException("Stub!");
	}

	public static Period of(final int years, final int months, final int days) {
		throw new RuntimeException("Stub!");
	}

	public static Period from(final TemporalAmount amount) {
		throw new RuntimeException("Stub!");
	}

	public static Period parse(final CharSequence text) {
		throw new RuntimeException("Stub!");
	}

	public static Period between(final LocalDate startDateInclusive, final LocalDate endDateExclusive) {
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

	@Override
	public IsoChronology getChronology() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isZero() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isNegative() {
		throw new RuntimeException("Stub!");
	}

	public int getYears() {
		throw new RuntimeException("Stub!");
	}

	public int getMonths() {
		throw new RuntimeException("Stub!");
	}

	public int getDays() {
		throw new RuntimeException("Stub!");
	}

	public Period withYears(final int years) {
		throw new RuntimeException("Stub!");
	}

	public Period withMonths(final int months) {
		throw new RuntimeException("Stub!");
	}

	public Period withDays(final int days) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Period plus(final TemporalAmount amountToAdd) {
		throw new RuntimeException("Stub!");
	}

	public Period plusYears(final long yearsToAdd) {
		throw new RuntimeException("Stub!");
	}

	public Period plusMonths(final long monthsToAdd) {
		throw new RuntimeException("Stub!");
	}

	public Period plusDays(final long daysToAdd) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Period minus(final TemporalAmount amountToSubtract) {
		throw new RuntimeException("Stub!");
	}

	public Period minusYears(final long yearsToSubtract) {
		throw new RuntimeException("Stub!");
	}

	public Period minusMonths(final long monthsToSubtract) {
		throw new RuntimeException("Stub!");
	}

	public Period minusDays(final long daysToSubtract) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Period multipliedBy(final int scalar) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Period negated() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Period normalized() {
		throw new RuntimeException("Stub!");
	}

	public long toTotalMonths() {
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
		ZERO = null;
	}
}
