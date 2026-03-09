package java.time.temporal;

import java.time.Duration;

public enum ChronoUnit implements TemporalUnit {
	NANOS, MICROS, MILLIS, SECONDS, MINUTES, HOURS, HALF_DAYS, DAYS, WEEKS, MONTHS, YEARS, DECADES, CENTURIES, MILLENNIA, ERAS, FOREVER;

	@Override
	public Duration getDuration() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isDurationEstimated() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isDateBased() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isTimeBased() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isSupportedBy(final Temporal temporal) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <R extends Temporal> R addTo(final R temporal, final long amount) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long between(final Temporal temporal1Inclusive, final Temporal temporal2Exclusive) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
