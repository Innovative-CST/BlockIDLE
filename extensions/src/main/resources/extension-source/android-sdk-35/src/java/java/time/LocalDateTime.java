package java.time;

import java.io.Serializable;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;

public final class LocalDateTime implements Temporal, TemporalAdjuster, ChronoLocalDateTime<LocalDate>, Serializable {
	public static final LocalDateTime MAX;
	public static final LocalDateTime MIN;

	LocalDateTime() {
		throw new RuntimeException("Stub!");
	}

	public static LocalDateTime now() {
		throw new RuntimeException("Stub!");
	}

	public static LocalDateTime now(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDateTime now(final Clock clock) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDateTime of(final int year, final Month month, final int dayOfMonth, final int hour,
			final int minute) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDateTime of(final int year, final Month month, final int dayOfMonth, final int hour,
			final int minute, final int second) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDateTime of(final int year, final Month month, final int dayOfMonth, final int hour,
			final int minute, final int second, final int nanoOfSecond) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDateTime of(final int year, final int month, final int dayOfMonth, final int hour,
			final int minute) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDateTime of(final int year, final int month, final int dayOfMonth, final int hour,
			final int minute, final int second) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDateTime of(final int year, final int month, final int dayOfMonth, final int hour,
			final int minute, final int second, final int nanoOfSecond) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDateTime of(final LocalDate date, final LocalTime time) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDateTime ofInstant(final Instant instant, final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDateTime ofEpochSecond(final long epochSecond, final int nanoOfSecond, final ZoneOffset offset) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDateTime from(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDateTime parse(final CharSequence text) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDateTime parse(final CharSequence text, final DateTimeFormatter formatter) {
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
	public LocalDateTime with(final TemporalAdjuster adjuster) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDateTime with(final TemporalField field, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime withYear(final int year) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime withMonth(final int month) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime withDayOfMonth(final int dayOfMonth) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime withDayOfYear(final int dayOfYear) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime withHour(final int hour) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime withMinute(final int minute) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime withSecond(final int second) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime withNano(final int nanoOfSecond) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime truncatedTo(final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDateTime plus(final TemporalAmount amountToAdd) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDateTime plus(final long amountToAdd, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime plusYears(final long years) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime plusMonths(final long months) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime plusWeeks(final long weeks) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime plusDays(final long days) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime plusHours(final long hours) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime plusMinutes(final long minutes) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime plusSeconds(final long seconds) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime plusNanos(final long nanos) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDateTime minus(final TemporalAmount amountToSubtract) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDateTime minus(final long amountToSubtract, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime minusYears(final long years) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime minusMonths(final long months) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime minusWeeks(final long weeks) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime minusDays(final long days) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime minusHours(final long hours) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime minusMinutes(final long minutes) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime minusSeconds(final long seconds) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime minusNanos(final long nanos) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <R> R query(final TemporalQuery<R> query) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Temporal adjustInto(final Temporal temporal) {
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

	public OffsetDateTime atOffset(final ZoneOffset offset) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ZonedDateTime atZone(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(final ChronoLocalDateTime<?> other) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isAfter(final ChronoLocalDateTime<?> other) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isBefore(final ChronoLocalDateTime<?> other) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isEqual(final ChronoLocalDateTime<?> other) {
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
		MAX = null;
		MIN = null;
	}
}
