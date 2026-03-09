package java.time.temporal;

import java.time.Duration;

public interface TemporalUnit {
	Duration getDuration();

	boolean isDurationEstimated();

	boolean isDateBased();

	boolean isTimeBased();

	default boolean isSupportedBy(final Temporal temporal) {
		throw new RuntimeException("Stub!");
	}

	<R extends Temporal> R addTo(final R p0, final long p1);

	long between(final Temporal p0, final Temporal p1);

	String toString();
}
