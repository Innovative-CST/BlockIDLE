package java.time.format;

import java.text.Format;
import java.text.ParsePosition;
import java.time.Period;
import java.time.ZoneId;
import java.time.chrono.Chronology;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.util.Locale;
import java.util.Set;

public final class DateTimeFormatter {
	public static final DateTimeFormatter BASIC_ISO_DATE;
	public static final DateTimeFormatter ISO_DATE;
	public static final DateTimeFormatter ISO_DATE_TIME;
	public static final DateTimeFormatter ISO_INSTANT;
	public static final DateTimeFormatter ISO_LOCAL_DATE;
	public static final DateTimeFormatter ISO_LOCAL_DATE_TIME;
	public static final DateTimeFormatter ISO_LOCAL_TIME;
	public static final DateTimeFormatter ISO_OFFSET_DATE;
	public static final DateTimeFormatter ISO_OFFSET_DATE_TIME;
	public static final DateTimeFormatter ISO_OFFSET_TIME;
	public static final DateTimeFormatter ISO_ORDINAL_DATE;
	public static final DateTimeFormatter ISO_TIME;
	public static final DateTimeFormatter ISO_WEEK_DATE;
	public static final DateTimeFormatter ISO_ZONED_DATE_TIME;
	public static final DateTimeFormatter RFC_1123_DATE_TIME;

	DateTimeFormatter() {
		throw new RuntimeException("Stub!");
	}

	public static DateTimeFormatter ofPattern(final String pattern) {
		throw new RuntimeException("Stub!");
	}

	public static DateTimeFormatter ofPattern(final String pattern, final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	public static DateTimeFormatter ofLocalizedDate(final FormatStyle dateStyle) {
		throw new RuntimeException("Stub!");
	}

	public static DateTimeFormatter ofLocalizedTime(final FormatStyle timeStyle) {
		throw new RuntimeException("Stub!");
	}

	public static DateTimeFormatter ofLocalizedDateTime(final FormatStyle dateTimeStyle) {
		throw new RuntimeException("Stub!");
	}

	public static DateTimeFormatter ofLocalizedDateTime(final FormatStyle dateStyle, final FormatStyle timeStyle) {
		throw new RuntimeException("Stub!");
	}

	public static TemporalQuery<Period> parsedExcessDays() {
		throw new RuntimeException("Stub!");
	}

	public static TemporalQuery<Boolean> parsedLeapSecond() {
		throw new RuntimeException("Stub!");
	}

	public Locale getLocale() {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatter withLocale(final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatter localizedBy(final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	public DecimalStyle getDecimalStyle() {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatter withDecimalStyle(final DecimalStyle decimalStyle) {
		throw new RuntimeException("Stub!");
	}

	public Chronology getChronology() {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatter withChronology(final Chronology chrono) {
		throw new RuntimeException("Stub!");
	}

	public ZoneId getZone() {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatter withZone(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public ResolverStyle getResolverStyle() {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatter withResolverStyle(final ResolverStyle resolverStyle) {
		throw new RuntimeException("Stub!");
	}

	public Set<TemporalField> getResolverFields() {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatter withResolverFields(final TemporalField... resolverFields) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatter withResolverFields(final Set<TemporalField> resolverFields) {
		throw new RuntimeException("Stub!");
	}

	public String format(final TemporalAccessor temporal) {
		throw new RuntimeException("Stub!");
	}

	public void formatTo(final TemporalAccessor temporal, final Appendable appendable) {
		throw new RuntimeException("Stub!");
	}

	public TemporalAccessor parse(final CharSequence text) {
		throw new RuntimeException("Stub!");
	}

	public TemporalAccessor parse(final CharSequence text, final ParsePosition position) {
		throw new RuntimeException("Stub!");
	}

	public <T> T parse(final CharSequence text, final TemporalQuery<T> query) {
		throw new RuntimeException("Stub!");
	}

	public TemporalAccessor parseBest(final CharSequence text, final TemporalQuery<?>... queries) {
		throw new RuntimeException("Stub!");
	}

	public TemporalAccessor parseUnresolved(final CharSequence text, final ParsePosition position) {
		throw new RuntimeException("Stub!");
	}

	public Format toFormat() {
		throw new RuntimeException("Stub!");
	}

	public Format toFormat(final TemporalQuery<?> parseQuery) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	static {
		BASIC_ISO_DATE = null;
		ISO_DATE = null;
		ISO_DATE_TIME = null;
		ISO_INSTANT = null;
		ISO_LOCAL_DATE = null;
		ISO_LOCAL_DATE_TIME = null;
		ISO_LOCAL_TIME = null;
		ISO_OFFSET_DATE = null;
		ISO_OFFSET_DATE_TIME = null;
		ISO_OFFSET_TIME = null;
		ISO_ORDINAL_DATE = null;
		ISO_TIME = null;
		ISO_WEEK_DATE = null;
		ISO_ZONED_DATE_TIME = null;
		RFC_1123_DATE_TIME = null;
	}
}
