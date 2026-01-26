package java.time.chrono;

import java.io.Serializable;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.time.temporal.ValueRange;
import java.util.List;
import java.util.Map;

public final class MinguoChronology extends AbstractChronology implements Serializable {
	public static final MinguoChronology INSTANCE;

	MinguoChronology() {
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
	public MinguoDate date(final Era era, final int yearOfEra, final int month, final int dayOfMonth) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public MinguoDate date(final int prolepticYear, final int month, final int dayOfMonth) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public MinguoDate dateYearDay(final Era era, final int yearOfEra, final int dayOfYear) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public MinguoDate dateYearDay(final int prolepticYear, final int dayOfYear) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public MinguoDate dateEpochDay(final long epochDay) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public MinguoDate dateNow() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public MinguoDate dateNow(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public MinguoDate dateNow(final Clock clock) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public MinguoDate date(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ChronoLocalDateTime<MinguoDate> localDateTime(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ChronoZonedDateTime<MinguoDate> zonedDateTime(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ChronoZonedDateTime<MinguoDate> zonedDateTime(final Instant instant, final ZoneId zone) {
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
	public MinguoEra eraOf(final int eraValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public List<Era> eras() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ValueRange range(final ChronoField field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public MinguoDate resolveDate(final Map<TemporalField, Long> fieldValues, final ResolverStyle resolverStyle) {
		throw new RuntimeException("Stub!");
	}

	static {
		INSTANCE = null;
	}
}
