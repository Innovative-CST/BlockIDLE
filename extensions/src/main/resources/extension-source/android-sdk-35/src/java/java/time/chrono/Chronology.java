package java.time.chrono;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.ResolverStyle;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.time.temporal.ValueRange;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public interface Chronology extends Comparable<Chronology> {
	default Chronology from(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	default Chronology ofLocale(final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	default Chronology of(final String id) {
		throw new RuntimeException("Stub!");
	}

	default Set<Chronology> getAvailableChronologies() {
		throw new RuntimeException("Stub!");
	}

	String getId();

	String getCalendarType();

	default ChronoLocalDate date(final Era era, final int yearOfEra, final int month, final int dayOfMonth) {
		throw new RuntimeException("Stub!");
	}

	ChronoLocalDate date(final int p0, final int p1, final int p2);

	default ChronoLocalDate dateYearDay(final Era era, final int yearOfEra, final int dayOfYear) {
		throw new RuntimeException("Stub!");
	}

	ChronoLocalDate dateYearDay(final int p0, final int p1);

	ChronoLocalDate dateEpochDay(final long p0);

	default ChronoLocalDate dateNow() {
		throw new RuntimeException("Stub!");
	}

	default ChronoLocalDate dateNow(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	default ChronoLocalDate dateNow(final Clock clock) {
		throw new RuntimeException("Stub!");
	}

	ChronoLocalDate date(final TemporalAccessor p0);

	default ChronoLocalDateTime<? extends ChronoLocalDate> localDateTime(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	default ChronoZonedDateTime<? extends ChronoLocalDate> zonedDateTime(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	default ChronoZonedDateTime<? extends ChronoLocalDate> zonedDateTime(final Instant instant, final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	boolean isLeapYear(final long p0);

	int prolepticYear(final Era p0, final int p1);

	Era eraOf(final int p0);

	List<Era> eras();

	ValueRange range(final ChronoField p0);

	default String getDisplayName(final TextStyle style, final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	ChronoLocalDate resolveDate(final Map<TemporalField, Long> p0, final ResolverStyle p1);

	default ChronoPeriod period(final int years, final int months, final int days) {
		throw new RuntimeException("Stub!");
	}

	default long epochSecond(final int prolepticYear, final int month, final int dayOfMonth, final int hour,
			final int minute, final int second, final ZoneOffset zoneOffset) {
		throw new RuntimeException("Stub!");
	}

	default long epochSecond(final Era era, final int yearOfEra, final int month, final int dayOfMonth, final int hour,
			final int minute, final int second, final ZoneOffset zoneOffset) {
		throw new RuntimeException("Stub!");
	}

	int compareTo(final Chronology p0);

	boolean equals(final Object p0);

	int hashCode();

	String toString();
}
