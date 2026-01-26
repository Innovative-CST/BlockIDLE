package java.time;

import java.io.Serializable;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Era;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;
import java.util.stream.Stream;

public final class LocalDate implements Temporal, TemporalAdjuster, ChronoLocalDate, Serializable {
	public static final LocalDate EPOCH;
	public static final LocalDate MAX;
	public static final LocalDate MIN;

	LocalDate() {
		throw new RuntimeException("Stub!");
	}

	public static LocalDate now() {
		throw new RuntimeException("Stub!");
	}

	public static LocalDate now(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDate now(final Clock clock) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDate of(final int year, final Month month, final int dayOfMonth) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDate of(final int year, final int month, final int dayOfMonth) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDate ofYearDay(final int year, final int dayOfYear) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDate ofInstant(final Instant instant, final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDate ofEpochDay(final long epochDay) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDate from(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDate parse(final CharSequence text) {
		throw new RuntimeException("Stub!");
	}

	public static LocalDate parse(final CharSequence text, final DateTimeFormatter formatter) {
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
	public IsoChronology getChronology() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Era getEra() {
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
	public boolean isLeapYear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int lengthOfMonth() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int lengthOfYear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDate with(final TemporalAdjuster adjuster) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDate with(final TemporalField field, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public LocalDate withYear(final int year) {
		throw new RuntimeException("Stub!");
	}

	public LocalDate withMonth(final int month) {
		throw new RuntimeException("Stub!");
	}

	public LocalDate withDayOfMonth(final int dayOfMonth) {
		throw new RuntimeException("Stub!");
	}

	public LocalDate withDayOfYear(final int dayOfYear) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDate plus(final TemporalAmount amountToAdd) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDate plus(final long amountToAdd, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public LocalDate plusYears(final long yearsToAdd) {
		throw new RuntimeException("Stub!");
	}

	public LocalDate plusMonths(final long monthsToAdd) {
		throw new RuntimeException("Stub!");
	}

	public LocalDate plusWeeks(final long weeksToAdd) {
		throw new RuntimeException("Stub!");
	}

	public LocalDate plusDays(final long daysToAdd) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDate minus(final TemporalAmount amountToSubtract) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDate minus(final long amountToSubtract, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public LocalDate minusYears(final long yearsToSubtract) {
		throw new RuntimeException("Stub!");
	}

	public LocalDate minusMonths(final long monthsToSubtract) {
		throw new RuntimeException("Stub!");
	}

	public LocalDate minusWeeks(final long weeksToSubtract) {
		throw new RuntimeException("Stub!");
	}

	public LocalDate minusDays(final long daysToSubtract) {
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
	public Period until(final ChronoLocalDate endDateExclusive) {
		throw new RuntimeException("Stub!");
	}

	public Stream<LocalDate> datesUntil(final LocalDate endExclusive) {
		throw new RuntimeException("Stub!");
	}

	public Stream<LocalDate> datesUntil(final LocalDate endExclusive, final Period step) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String format(final DateTimeFormatter formatter) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LocalDateTime atTime(final LocalTime time) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime atTime(final int hour, final int minute) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime atTime(final int hour, final int minute, final int second) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime atTime(final int hour, final int minute, final int second, final int nanoOfSecond) {
		throw new RuntimeException("Stub!");
	}

	public OffsetDateTime atTime(final OffsetTime time) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime atStartOfDay() {
		throw new RuntimeException("Stub!");
	}

	public ZonedDateTime atStartOfDay(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long toEpochDay() {
		throw new RuntimeException("Stub!");
	}

	public long toEpochSecond(final LocalTime time, final ZoneOffset offset) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(final ChronoLocalDate other) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isAfter(final ChronoLocalDate other) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isBefore(final ChronoLocalDate other) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isEqual(final ChronoLocalDate other) {
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
		EPOCH = null;
		MAX = null;
		MIN = null;
	}
}
