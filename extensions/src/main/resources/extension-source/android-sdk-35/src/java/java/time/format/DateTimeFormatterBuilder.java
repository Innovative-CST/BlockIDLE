package java.time.format;

import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.temporal.TemporalField;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class DateTimeFormatterBuilder {
	public DateTimeFormatterBuilder() {
		throw new RuntimeException("Stub!");
	}

	public static String getLocalizedDateTimePattern(final FormatStyle dateStyle, final FormatStyle timeStyle,
			final Chronology chrono, final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder parseCaseSensitive() {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder parseCaseInsensitive() {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder parseStrict() {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder parseLenient() {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder parseDefaulting(final TemporalField field, final long value) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendValue(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendValue(final TemporalField field, final int width) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendValue(final TemporalField field, final int minWidth, final int maxWidth,
			final SignStyle signStyle) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendValueReduced(final TemporalField field, final int width, final int maxWidth,
			final int baseValue) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendValueReduced(final TemporalField field, final int width, final int maxWidth,
			final ChronoLocalDate baseDate) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendFraction(final TemporalField field, final int minWidth, final int maxWidth,
			final boolean decimalPoint) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendText(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendText(final TemporalField field, final TextStyle textStyle) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendText(final TemporalField field, final Map<Long, String> textLookup) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendInstant() {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendInstant(final int fractionalDigits) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendOffsetId() {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendOffset(final String pattern, final String noOffsetText) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendLocalizedOffset(final TextStyle style) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendZoneId() {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendZoneRegionId() {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendZoneOrOffsetId() {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendZoneText(final TextStyle textStyle) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendZoneText(final TextStyle textStyle, final Set<ZoneId> preferredZones) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendGenericZoneText(final TextStyle textStyle) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendGenericZoneText(final TextStyle textStyle, final Set<ZoneId> preferredZones) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendChronologyId() {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendChronologyText(final TextStyle textStyle) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendLocalized(final FormatStyle dateStyle, final FormatStyle timeStyle) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendLiteral(final char literal) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendLiteral(final String literal) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder append(final DateTimeFormatter formatter) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendOptional(final DateTimeFormatter formatter) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder appendPattern(final String pattern) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder padNext(final int padWidth) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder padNext(final int padWidth, final char padChar) {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder optionalStart() {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatterBuilder optionalEnd() {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatter toFormatter() {
		throw new RuntimeException("Stub!");
	}

	public DateTimeFormatter toFormatter(final Locale locale) {
		throw new RuntimeException("Stub!");
	}
}
