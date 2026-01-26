package android.icu.text;

import java.text.AttributedCharacterIterator;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import android.icu.util.Output;
import android.icu.util.TimeZone;
import java.util.EnumSet;
import java.util.Locale;
import android.icu.util.ULocale;
import java.io.Serializable;
import android.icu.util.Freezable;

public class TimeZoneFormat extends UFormat implements Freezable<TimeZoneFormat>, Serializable
{
    protected TimeZoneFormat(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static TimeZoneFormat getInstance(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static TimeZoneFormat getInstance(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public TimeZoneNames getTimeZoneNames() {
        throw new RuntimeException("Stub!");
    }
    
    public TimeZoneFormat setTimeZoneNames(final TimeZoneNames tznames) {
        throw new RuntimeException("Stub!");
    }
    
    public String getGMTPattern() {
        throw new RuntimeException("Stub!");
    }
    
    public TimeZoneFormat setGMTPattern(final String pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public String getGMTOffsetPattern(final GMTOffsetPatternType type) {
        throw new RuntimeException("Stub!");
    }
    
    public TimeZoneFormat setGMTOffsetPattern(final GMTOffsetPatternType type, final String pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public String getGMTOffsetDigits() {
        throw new RuntimeException("Stub!");
    }
    
    public TimeZoneFormat setGMTOffsetDigits(final String digits) {
        throw new RuntimeException("Stub!");
    }
    
    public String getGMTZeroFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public TimeZoneFormat setGMTZeroFormat(final String gmtZeroFormat) {
        throw new RuntimeException("Stub!");
    }
    
    public TimeZoneFormat setDefaultParseOptions(final EnumSet<ParseOption> options) {
        throw new RuntimeException("Stub!");
    }
    
    public EnumSet<ParseOption> getDefaultParseOptions() {
        throw new RuntimeException("Stub!");
    }
    
    public final String formatOffsetISO8601Basic(final int offset, final boolean useUtcIndicator, final boolean isShort, final boolean ignoreSeconds) {
        throw new RuntimeException("Stub!");
    }
    
    public final String formatOffsetISO8601Extended(final int offset, final boolean useUtcIndicator, final boolean isShort, final boolean ignoreSeconds) {
        throw new RuntimeException("Stub!");
    }
    
    public String formatOffsetLocalizedGMT(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public String formatOffsetShortLocalizedGMT(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public final String format(final Style style, final TimeZone tz, final long date) {
        throw new RuntimeException("Stub!");
    }
    
    public String format(final Style style, final TimeZone tz, final long date, final Output<TimeType> timeType) {
        throw new RuntimeException("Stub!");
    }
    
    public final int parseOffsetISO8601(final String text, final ParsePosition pos) {
        throw new RuntimeException("Stub!");
    }
    
    public int parseOffsetLocalizedGMT(final String text, final ParsePosition pos) {
        throw new RuntimeException("Stub!");
    }
    
    public int parseOffsetShortLocalizedGMT(final String text, final ParsePosition pos) {
        throw new RuntimeException("Stub!");
    }
    
    public TimeZone parse(final Style style, final String text, final ParsePosition pos, final EnumSet<ParseOption> options, final Output<TimeType> timeType) {
        throw new RuntimeException("Stub!");
    }
    
    public TimeZone parse(final Style style, final String text, final ParsePosition pos, final Output<TimeType> timeType) {
        throw new RuntimeException("Stub!");
    }
    
    public final TimeZone parse(final String text, final ParsePosition pos) {
        throw new RuntimeException("Stub!");
    }
    
    public final TimeZone parse(final String text) throws ParseException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public AttributedCharacterIterator formatToCharacterIterator(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Object parseObject(final String source, final ParsePosition pos) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isFrozen() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public TimeZoneFormat freeze() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public TimeZoneFormat cloneAsThawed() {
        throw new RuntimeException("Stub!");
    }
    
    public enum GMTOffsetPatternType
    {
        POSITIVE_HM, 
        POSITIVE_HMS, 
        NEGATIVE_HM, 
        NEGATIVE_HMS, 
        POSITIVE_H, 
        NEGATIVE_H;
    }
    
    public enum ParseOption
    {
        ALL_STYLES, 
        TZ_DATABASE_ABBREVIATIONS;
    }
    
    public enum Style
    {
        GENERIC_LOCATION, 
        GENERIC_LONG, 
        GENERIC_SHORT, 
        SPECIFIC_LONG, 
        SPECIFIC_SHORT, 
        LOCALIZED_GMT, 
        LOCALIZED_GMT_SHORT, 
        ISO_BASIC_SHORT, 
        ISO_BASIC_LOCAL_SHORT, 
        ISO_BASIC_FIXED, 
        ISO_BASIC_LOCAL_FIXED, 
        ISO_BASIC_FULL, 
        ISO_BASIC_LOCAL_FULL, 
        ISO_EXTENDED_FIXED, 
        ISO_EXTENDED_LOCAL_FIXED, 
        ISO_EXTENDED_FULL, 
        ISO_EXTENDED_LOCAL_FULL, 
        ZONE_ID, 
        ZONE_ID_SHORT, 
        EXEMPLAR_LOCATION;
    }
    
    public enum TimeType
    {
        UNKNOWN, 
        STANDARD, 
        DAYLIGHT;
    }
}
