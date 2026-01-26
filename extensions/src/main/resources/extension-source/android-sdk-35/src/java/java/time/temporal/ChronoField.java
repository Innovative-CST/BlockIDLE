package java.time.temporal;

import java.util.Locale;

public enum ChronoField implements TemporalField {
	NANO_OF_SECOND, NANO_OF_DAY, MICRO_OF_SECOND, MICRO_OF_DAY, MILLI_OF_SECOND, MILLI_OF_DAY, SECOND_OF_MINUTE, SECOND_OF_DAY, MINUTE_OF_HOUR, MINUTE_OF_DAY, HOUR_OF_AMPM, CLOCK_HOUR_OF_AMPM, HOUR_OF_DAY, CLOCK_HOUR_OF_DAY, AMPM_OF_DAY, DAY_OF_WEEK, ALIGNED_DAY_OF_WEEK_IN_MONTH, ALIGNED_DAY_OF_WEEK_IN_YEAR, DAY_OF_MONTH, DAY_OF_YEAR, EPOCH_DAY, ALIGNED_WEEK_OF_MONTH, ALIGNED_WEEK_OF_YEAR, MONTH_OF_YEAR, PROLEPTIC_MONTH, YEAR_OF_ERA, YEAR, ERA, INSTANT_SECONDS, OFFSET_SECONDS;

	@Override
	public String getDisplayName(final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public TemporalUnit getBaseUnit() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public TemporalUnit getRangeUnit() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ValueRange range() {
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

	public long checkValidValue(final long value) {
		throw new RuntimeException("Stub!");
	}

	public int checkValidIntValue(final long value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isSupportedBy(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ValueRange rangeRefinedBy(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long getFrom(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <R extends Temporal> R adjustInto(final R temporal, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
