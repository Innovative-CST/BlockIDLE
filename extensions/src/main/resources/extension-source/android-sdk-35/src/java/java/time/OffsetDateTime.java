package java.time;

import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;
import java.util.Comparator;

public final class OffsetDateTime implements Temporal, TemporalAdjuster, Comparable<OffsetDateTime>, Serializable {
	public static final OffsetDateTime MAX;
	public static final OffsetDateTime MIN;

	OffsetDateTime() {
		throw new RuntimeException("Stub!");
	}

	public static Comparator<OffsetDateTime> timeLineOrder() {
		throw new RuntimeException("Stub!");
	}

	public static OffsetDateTime now() {
		throw new RuntimeException("Stub!");
	}

	public static OffsetDateTime now(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static OffsetDateTime now(final Clock clock) {
		throw new RuntimeException("Stub!");
	}

	public static OffsetDateTime of(final LocalDate date, final LocalTime time, final ZoneOffset offset) {
		throw new RuntimeException("Stub!");
	}

	public static OffsetDateTime of(final LocalDateTime dateTime, final ZoneOffset offset) {
		throw new RuntimeException("Stub!");
	}

	public static OffsetDateTime of(final int year, final int month, final int dayOfMonth, final int hour,
			final int minute, final int second, final int nanoOfSecond, final ZoneOffset offset) {
		throw new RuntimeException("Stub!");
	}

	public static OffsetDateTime ofInstant(final Instant instant, final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static OffsetDateTime from(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	public static OffsetDateTime parse(final CharSequence text) {
		throw new RuntimeException("Stub!");
	}

	public static OffsetDateTime parse(final CharSequence text, final DateTimeFormatter formatter) {
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

	public ZoneOffset getOffset() {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime withOffsetSameLocal(final ZoneOffset offset) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime withOffsetSameInstant(final ZoneOffset offset) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime toLocalDateTime() {
		throw new RuntimeException("Stub!");
	}

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
	public OffsetDateTime with(final TemporalAdjuster adjuster) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public OffsetDateTime with(final TemporalField field, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime withYear(final int year) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime withMonth(final int month) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime withDayOfMonth(final int dayOfMonth) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime withDayOfYear(final int dayOfYear) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime withHour(final int hour) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime withMinute(final int minute) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime withSecond(final int second) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime withNano(final int nanoOfSecond) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime truncatedTo(final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public OffsetDateTime plus(final TemporalAmount amountToAdd) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public OffsetDateTime plus(final long amountToAdd, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime plusYears(final long years) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime plusMonths(final long months) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime plusWeeks(final long weeks) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime plusDays(final long days) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime plusHours(final long hours) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime plusMinutes(final long minutes) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime plusSeconds(final long seconds) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime plusNanos(final long nanos) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public OffsetDateTime minus(final TemporalAmount amountToSubtract) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public OffsetDateTime minus(final long amountToSubtract, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime minusYears(final long years) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime minusMonths(final long months) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime minusWeeks(final long weeks) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime minusDays(final long days) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime minusHours(final long hours) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime minusMinutes(final long minutes) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime minusSeconds(final long seconds) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime minusNanos(final long nanos) {
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

	public String format(final DateTimeFormatter formatter) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime atZoneSameInstant(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime atZoneSimilarLocal(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public OffsetTime toOffsetTime() {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime toZonedDateTime() {
		throw new RuntimeException("Stub!");
	}

	public Instant toInstant() {
		throw new RuntimeException("Stub!");
	}

	public long toEpochSecond() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(final OffsetDateTime other) {
		throw new RuntimeException("Stub!");
	}

	public boolean isAfter(final OffsetDateTime other) {
		throw new RuntimeException("Stub!");
	}

	public boolean isBefore(final OffsetDateTime other) {
		throw new RuntimeException("Stub!");
	}

	public boolean isEqual(final OffsetDateTime other) {
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
