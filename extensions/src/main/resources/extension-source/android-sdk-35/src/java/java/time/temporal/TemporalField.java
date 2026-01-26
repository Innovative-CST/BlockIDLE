package java.time.temporal;

import java.time.format.ResolverStyle;
import java.util.Locale;
import java.util.Map;

public interface TemporalField {
	default String getDisplayName(final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	TemporalUnit getBaseUnit();

	TemporalUnit getRangeUnit();

	ValueRange range();

	boolean isDateBased();

	boolean isTimeBased();

	boolean isSupportedBy(final TemporalAccessor p0);

	ValueRange rangeRefinedBy(final TemporalAccessor p0);

	long getFrom(final TemporalAccessor p0);

	<R extends Temporal> R adjustInto(final R p0, final long p1);

	default TemporalAccessor resolve(final Map<TemporalField, Long> fieldValues, final TemporalAccessor partialTemporal,
			final ResolverStyle resolverStyle) {
		throw new RuntimeException("Stub!");
	}

	String toString();
}
