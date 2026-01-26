package android.icu.text;

import java.io.InvalidObjectException;
import java.text.Format;
import android.icu.util.TimeZone;
import android.icu.util.ULocale;
import java.util.Locale;
import java.text.ParsePosition;
import java.text.ParseException;
import java.util.Date;
import java.text.FieldPosition;
import android.icu.util.Calendar;

public abstract class DateFormat extends UFormat
{
    public static final String ABBR_GENERIC_TZ = "v";
    public static final String ABBR_MONTH = "MMM";
    public static final String ABBR_MONTH_DAY = "MMMd";
    public static final String ABBR_MONTH_WEEKDAY_DAY = "MMMEd";
    public static final String ABBR_QUARTER = "QQQ";
    public static final String ABBR_SPECIFIC_TZ = "z";
    public static final String ABBR_UTC_TZ = "ZZZZ";
    public static final String ABBR_WEEKDAY = "E";
    public static final int AM_PM_FIELD = 14;
    public static final int AM_PM_MIDNIGHT_NOON_FIELD = 35;
    public static final int DATE_FIELD = 3;
    public static final String DAY = "d";
    public static final int DAY_OF_WEEK_FIELD = 9;
    public static final int DAY_OF_WEEK_IN_MONTH_FIELD = 11;
    public static final int DAY_OF_YEAR_FIELD = 10;
    public static final int DEFAULT = 2;
    public static final int DOW_LOCAL_FIELD = 19;
    public static final int ERA_FIELD = 0;
    public static final int EXTENDED_YEAR_FIELD = 20;
    public static final int FLEXIBLE_DAY_PERIOD_FIELD = 36;
    public static final int FRACTIONAL_SECOND_FIELD = 8;
    public static final int FULL = 0;
    public static final String GENERIC_TZ = "vvvv";
    public static final String HOUR = "j";
    public static final int HOUR0_FIELD = 16;
    public static final int HOUR1_FIELD = 15;
    public static final String HOUR24 = "H";
    public static final String HOUR24_MINUTE = "Hm";
    public static final String HOUR24_MINUTE_SECOND = "Hms";
    public static final String HOUR_MINUTE = "jm";
    public static final String HOUR_MINUTE_SECOND = "jms";
    public static final int HOUR_OF_DAY0_FIELD = 5;
    public static final int HOUR_OF_DAY1_FIELD = 4;
    public static final int JULIAN_DAY_FIELD = 21;
    public static final String LOCATION_TZ = "VVVV";
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int MILLISECONDS_IN_DAY_FIELD = 22;
    public static final int MILLISECOND_FIELD = 8;
    public static final String MINUTE = "m";
    public static final int MINUTE_FIELD = 6;
    public static final String MINUTE_SECOND = "ms";
    public static final String MONTH = "MMMM";
    public static final String MONTH_DAY = "MMMMd";
    public static final int MONTH_FIELD = 2;
    public static final String MONTH_WEEKDAY_DAY = "MMMMEEEEd";
    public static final int NONE = -1;
    public static final String NUM_MONTH = "M";
    public static final String NUM_MONTH_DAY = "Md";
    public static final String NUM_MONTH_WEEKDAY_DAY = "MEd";
    public static final String QUARTER = "QQQQ";
    public static final int QUARTER_FIELD = 27;
    public static final int RELATIVE = 128;
    public static final int RELATIVE_DEFAULT = 130;
    public static final int RELATIVE_FULL = 128;
    public static final int RELATIVE_LONG = 129;
    public static final int RELATIVE_MEDIUM = 130;
    public static final int RELATIVE_SHORT = 131;
    public static final String SECOND = "s";
    public static final int SECOND_FIELD = 7;
    public static final int SHORT = 3;
    public static final String SPECIFIC_TZ = "zzzz";
    public static final int STANDALONE_DAY_FIELD = 25;
    public static final int STANDALONE_MONTH_FIELD = 26;
    public static final int STANDALONE_QUARTER_FIELD = 28;
    public static final int TIMEZONE_FIELD = 17;
    public static final int TIMEZONE_GENERIC_FIELD = 24;
    public static final int TIMEZONE_ISO_FIELD = 32;
    public static final int TIMEZONE_ISO_LOCAL_FIELD = 33;
    public static final int TIMEZONE_LOCALIZED_GMT_OFFSET_FIELD = 31;
    public static final int TIMEZONE_RFC_FIELD = 23;
    public static final int TIMEZONE_SPECIAL_FIELD = 29;
    public static final String WEEKDAY = "EEEE";
    public static final int WEEK_OF_MONTH_FIELD = 13;
    public static final int WEEK_OF_YEAR_FIELD = 12;
    public static final String YEAR = "y";
    public static final String YEAR_ABBR_MONTH = "yMMM";
    public static final String YEAR_ABBR_MONTH_DAY = "yMMMd";
    public static final String YEAR_ABBR_MONTH_WEEKDAY_DAY = "yMMMEd";
    public static final String YEAR_ABBR_QUARTER = "yQQQ";
    public static final int YEAR_FIELD = 1;
    public static final String YEAR_MONTH = "yMMMM";
    public static final String YEAR_MONTH_DAY = "yMMMMd";
    public static final String YEAR_MONTH_WEEKDAY_DAY = "yMMMMEEEEd";
    public static final int YEAR_NAME_FIELD = 30;
    public static final String YEAR_NUM_MONTH = "yM";
    public static final String YEAR_NUM_MONTH_DAY = "yMd";
    public static final String YEAR_NUM_MONTH_WEEKDAY_DAY = "yMEd";
    public static final String YEAR_QUARTER = "yQQQQ";
    public static final int YEAR_WOY_FIELD = 18;
    protected Calendar calendar;
    protected NumberFormat numberFormat;
    
    protected DateFormat() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition fieldPosition) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract StringBuffer format(final Calendar p0, final StringBuffer p1, final FieldPosition p2);
    
    public StringBuffer format(final Date date, final StringBuffer toAppendTo, final FieldPosition fieldPosition) {
        throw new RuntimeException("Stub!");
    }
    
    public final String format(final Date date) {
        throw new RuntimeException("Stub!");
    }
    
    public Date parse(final String text) throws ParseException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void parse(final String p0, final Calendar p1, final ParsePosition p2);
    
    public Date parse(final String text, final ParsePosition pos) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Object parseObject(final String source, final ParsePosition pos) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getTimeInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getTimeInstance(final int style) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getTimeInstance(final int style, final Locale aLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getTimeInstance(final int style, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getDateInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getDateInstance(final int style) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getDateInstance(final int style, final Locale aLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getDateInstance(final int style, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getDateTimeInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getDateTimeInstance(final int dateStyle, final int timeStyle) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final Locale aLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static Locale[] getAvailableLocales() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCalendar(final Calendar newCalendar) {
        throw new RuntimeException("Stub!");
    }
    
    public Calendar getCalendar() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNumberFormat(final NumberFormat newNumberFormat) {
        throw new RuntimeException("Stub!");
    }
    
    public NumberFormat getNumberFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTimeZone(final TimeZone zone) {
        throw new RuntimeException("Stub!");
    }
    
    public TimeZone getTimeZone() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLenient(final boolean lenient) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLenient() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCalendarLenient(final boolean lenient) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCalendarLenient() {
        throw new RuntimeException("Stub!");
    }
    
    public DateFormat setBooleanAttribute(final BooleanAttribute key, final boolean value) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getBooleanAttribute(final BooleanAttribute key) {
        throw new RuntimeException("Stub!");
    }
    
    public void setContext(final DisplayContext context) {
        throw new RuntimeException("Stub!");
    }
    
    public DisplayContext getContext(final DisplayContext.Type type) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Object clone() {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getDateInstance(final Calendar cal, final int dateStyle, final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getDateInstance(final Calendar cal, final int dateStyle, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getTimeInstance(final Calendar cal, final int timeStyle, final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getTimeInstance(final Calendar cal, final int timeStyle, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getDateTimeInstance(final Calendar cal, final int dateStyle, final int timeStyle, final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getDateTimeInstance(final Calendar cal, final int dateStyle, final int timeStyle, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getInstance(final Calendar cal, final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getInstance(final Calendar cal, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getInstance(final Calendar cal) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getDateInstance(final Calendar cal, final int dateStyle) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getTimeInstance(final Calendar cal, final int timeStyle) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getDateTimeInstance(final Calendar cal, final int dateStyle, final int timeStyle) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getInstanceForSkeleton(final String skeleton) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getInstanceForSkeleton(final String skeleton, final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getInstanceForSkeleton(final String skeleton, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getInstanceForSkeleton(final Calendar cal, final String skeleton, final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getInstanceForSkeleton(final Calendar cal, final String skeleton, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getPatternInstance(final String skeleton) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getPatternInstance(final String skeleton, final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getPatternInstance(final String skeleton, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getPatternInstance(final Calendar cal, final String skeleton, final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateFormat getPatternInstance(final Calendar cal, final String skeleton, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public enum BooleanAttribute
    {
        PARSE_ALLOW_WHITESPACE, 
        PARSE_ALLOW_NUMERIC, 
        PARSE_MULTIPLE_PATTERNS_FOR_MATCH, 
        PARSE_PARTIAL_LITERAL_MATCH;
    }
    
    public static class Field extends Format.Field
    {
        public static final Field AM_PM;
        public static final Field AM_PM_MIDNIGHT_NOON;
        public static final Field DAY_OF_MONTH;
        public static final Field DAY_OF_WEEK;
        public static final Field DAY_OF_WEEK_IN_MONTH;
        public static final Field DAY_OF_YEAR;
        public static final Field DOW_LOCAL;
        public static final Field ERA;
        public static final Field EXTENDED_YEAR;
        public static final Field FLEXIBLE_DAY_PERIOD;
        public static final Field HOUR0;
        public static final Field HOUR1;
        public static final Field HOUR_OF_DAY0;
        public static final Field HOUR_OF_DAY1;
        public static final Field JULIAN_DAY;
        public static final Field MILLISECOND;
        public static final Field MILLISECONDS_IN_DAY;
        public static final Field MINUTE;
        public static final Field MONTH;
        public static final Field QUARTER;
        public static final Field SECOND;
        public static final Field TIME_ZONE;
        public static final Field WEEK_OF_MONTH;
        public static final Field WEEK_OF_YEAR;
        public static final Field YEAR;
        public static final Field YEAR_WOY;
        
        protected Field(final String name, final int calendarField) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public static Field ofCalendarField(final int calendarField) {
            throw new RuntimeException("Stub!");
        }
        
        public int getCalendarField() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        protected Object readResolve() throws InvalidObjectException {
            throw new RuntimeException("Stub!");
        }
        
        static {
            AM_PM = null;
            AM_PM_MIDNIGHT_NOON = null;
            DAY_OF_MONTH = null;
            DAY_OF_WEEK = null;
            DAY_OF_WEEK_IN_MONTH = null;
            DAY_OF_YEAR = null;
            DOW_LOCAL = null;
            ERA = null;
            EXTENDED_YEAR = null;
            FLEXIBLE_DAY_PERIOD = null;
            HOUR0 = null;
            HOUR1 = null;
            HOUR_OF_DAY0 = null;
            HOUR_OF_DAY1 = null;
            JULIAN_DAY = null;
            MILLISECOND = null;
            MILLISECONDS_IN_DAY = null;
            MINUTE = null;
            MONTH = null;
            QUARTER = null;
            SECOND = null;
            TIME_ZONE = null;
            WEEK_OF_MONTH = null;
            WEEK_OF_YEAR = null;
            YEAR = null;
            YEAR_WOY = null;
        }
    }
    
    public enum HourCycle
    {
        HOUR_CYCLE_11, 
        HOUR_CYCLE_12, 
        HOUR_CYCLE_23, 
        HOUR_CYCLE_24;
    }
}
