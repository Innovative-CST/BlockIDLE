package java.time.chrono;

import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.List;

public interface ChronoPeriod extends TemporalAmount {
	default ChronoPeriod between(final ChronoLocalDate startDateInclusive, final ChronoLocalDate endDateExclusive) {
		throw new RuntimeException("Stub!");
	}

	long get(final TemporalUnit p0);

	List<TemporalUnit> getUnits();

	Chronology getChronology();

	default boolean isZero() {
		throw new RuntimeException("Stub!");
	}

	default boolean isNegative() {
		throw new RuntimeException("Stub!");
	}

	ChronoPeriod plus(final TemporalAmount p0);

	ChronoPeriod minus(final TemporalAmount p0);

	ChronoPeriod multipliedBy(final int p0);

	default ChronoPeriod negated() {
		throw new RuntimeException("Stub!");
	}

	ChronoPeriod normalized();

	Temporal addTo(final Temporal p0);

	Temporal subtractFrom(final Temporal p0);

	boolean equals(final Object p0);

	int hashCode();

	String toString();
}
