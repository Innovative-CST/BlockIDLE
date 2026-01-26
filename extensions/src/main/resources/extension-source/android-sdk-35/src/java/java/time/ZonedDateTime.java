package java.time;

import java.io.Serializable;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;

public final class ZonedDateTime implements Temporal, ChronoZonedDateTime<LocalDate>, Serializable {
	ZonedDateTime() {
		throw new RuntimeException("Stub!");
	}

	public static ZonedDateTime now() {
		throw new RuntimeException("Stub!");
	}

	public static ZonedDateTime now(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static ZonedDateTime now(final Clock clock) {
		throw new RuntimeException("Stub!");
	}

	public static ZonedDateTime of(final LocalDate date, final LocalTime time, final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static ZonedDateTime of(final LocalDateTime localDateTime, final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static ZonedDateTime of(final int year, final int month, final int dayOfMonth, final int hour,
			final int minute, final int second, final int nanoOfSecond, final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static ZonedDateTime ofLocal(final LocalDateTime localDateTime, final ZoneId zone,
			final ZoneOffset preferredOffset) {
		throw new RuntimeException("Stub!");
	}

	public static ZonedDateTime ofInstant(final Instant instant, final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static ZonedDateTime ofInstant(final LocalDateTime localDateTime, final ZoneOffset offset,
			final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static ZonedDateTime ofStrict(final LocalDateTime localDateTime, final ZoneOffset offset,
			final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static ZonedDateTime from(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	public static ZonedDateTime parse(final CharSequence text) {
		throw new RuntimeException("Stub!");
	}

	public static ZonedDateTime parse(final CharSequence text, final DateTimeFormatter formatter) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isSupported(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isSupported(final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ValueRange range(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int get(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long getLong(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ZoneOffset getOffset() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ZonedDateTime withEarlierOffsetAtOverlap() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ZonedDateTime withLaterOffsetAtOverlap() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ZoneId getZone() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ZonedDateTime withZoneSameLocal(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ZonedDateTime withZoneSameInstant(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime withFixedOffsetZone() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDateTime toLocalDateTime() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDate toLocalDate() {
		throw new RuntimeException("Stub!");
	}

	public int getYear() {
		throw new RuntimeException("Stub!");
	}

	public int getMonthValue() {
		throw new RuntimeException("Stub!");
	}

	public Month getMonth() {
		throw new RuntimeException("Stub!");
	}

	public int getDayOfMonth() {
		throw new RuntimeException("Stub!");
	}

	public int getDayOfYear() {
		throw new RuntimeException("Stub!");
	}

	public DayOfWeek getDayOfWeek() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalTime toLocalTime() {
		throw new RuntimeException("Stub!");
	}

	public int getHour() {
		throw new RuntimeException("Stub!");
	}

	public int getMinute() {
		throw new RuntimeException("Stub!");
	}

	public int getSecond() {
		throw new RuntimeException("Stub!");
	}

	public int getNano() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ZonedDateTime with(final TemporalAdjuster adjuster) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ZonedDateTime with(final TemporalField field, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime withYear(final int year) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime withMonth(final int month) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime withDayOfMonth(final int dayOfMonth) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime withDayOfYear(final int dayOfYear) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime withHour(final int hour) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime withMinute(final int minute) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime withSecond(final int second) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime withNano(final int nanoOfSecond) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime truncatedTo(final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ZonedDateTime plus(final TemporalAmount amountToAdd) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ZonedDateTime plus(final long amountToAdd, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime plusYears(final long years) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime plusMonths(final long months) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime plusWeeks(final long weeks) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime plusDays(final long days) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime plusHours(final long hours) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime plusMinutes(final long minutes) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime plusSeconds(final long seconds) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime plusNanos(final long nanos) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ZonedDateTime minus(final TemporalAmount amountToSubtract) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ZonedDateTime minus(final long amountToSubtract, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime minusYears(final long years) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime minusMonths(final long months) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime minusWeeks(final long weeks) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime minusDays(final long days) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime minusHours(final long hours) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime minusMinutes(final long minutes) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime minusSeconds(final long seconds) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime minusNanos(final long nanos) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <R> R query(final TemporalQuery<R> query) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long until(final Temporal endExclusive, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String format(final DateTimeFormatter formatter) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime toOffsetDateTime() {
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
}
