package java.time.chrono;

import java.io.Serializable;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.time.temporal.ValueRange;
import java.util.List;
import java.util.Map;

public final class IsoChronology extends AbstractChronology implements Serializable {
	public static final IsoChronology INSTANCE;

	IsoChronology() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String getId() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String getCalendarType() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDate date(final Era era, final int yearOfEra, final int month, final int dayOfMonth) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDate date(final int prolepticYear, final int month, final int dayOfMonth) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDate dateYearDay(final Era era, final int yearOfEra, final int dayOfYear) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDate dateYearDay(final int prolepticYear, final int dayOfYear) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDate dateEpochDay(final long epochDay) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDate date(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long epochSecond(final int prolepticYear, final int month, final int dayOfMonth, final int hour,
			final int minute, final int second, final ZoneOffset zoneOffset) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDateTime localDateTime(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ZonedDateTime zonedDateTime(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ZonedDateTime zonedDateTime(final Instant instant, final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDate dateNow() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDate dateNow(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDate dateNow(final Clock clock) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isLeapYear(final long prolepticYear) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int prolepticYear(final Era era, final int yearOfEra) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public IsoEra eraOf(final int eraValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public List<Era> eras() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDate resolveDate(final Map<TemporalField, Long> fieldValues, final ResolverStyle resolverStyle) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ValueRange range(final ChronoField field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Period period(final int years, final int months, final int days) {
		throw new RuntimeException("Stub!");
	}

	static {
		INSTANCE = null;
	}
}
