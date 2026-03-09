package android.icu.util;

import android.icu.text.DateFormat;
import java.util.Locale;
import java.util.Date;
import java.io.Serializable;

public abstract class Calendar implements Serializable, Cloneable, Comparable<Calendar>
{
    public static final int AM = 0;
    public static final int AM_PM = 9;
    public static final int APRIL = 3;
    public static final int AUGUST = 7;
    public static final int DATE = 5;
    public static final int DAY_OF_MONTH = 5;
    public static final int DAY_OF_WEEK = 7;
    public static final int DAY_OF_WEEK_IN_MONTH = 8;
    public static final int DAY_OF_YEAR = 6;
    public static final int DECEMBER = 11;
    public static final int DOW_LOCAL = 18;
    public static final int DST_OFFSET = 16;
    protected static final int EPOCH_JULIAN_DAY = 2440588;
    public static final int ERA = 0;
    public static final int EXTENDED_YEAR = 19;
    public static final int FEBRUARY = 1;
    public static final int FRIDAY = 6;
    protected static final int GREATEST_MINIMUM = 1;
    public static final int HOUR = 10;
    public static final int HOUR_OF_DAY = 11;
    protected static final int INTERNALLY_SET = 1;
    public static final int IS_LEAP_MONTH = 22;
    public static final int JANUARY = 0;
    protected static final int JAN_1_1_JULIAN_DAY = 1721426;
    public static final int JULIAN_DAY = 20;
    public static final int JULY = 6;
    public static final int JUNE = 5;
    protected static final int LEAST_MAXIMUM = 2;
    public static final int MARCH = 2;
    protected static final int MAXIMUM = 3;
    protected static final Date MAX_DATE;
    @Deprecated
    protected static final int MAX_FIELD_COUNT = 32;
    protected static final int MAX_JULIAN = 2130706432;
    protected static final long MAX_MILLIS = 183882168921600000L;
    public static final int MAY = 4;
    public static final int MILLISECOND = 14;
    public static final int MILLISECONDS_IN_DAY = 21;
    protected static final int MINIMUM = 0;
    protected static final int MINIMUM_USER_STAMP = 2;
    public static final int MINUTE = 12;
    protected static final Date MIN_DATE;
    protected static final int MIN_JULIAN = -2130706432;
    protected static final long MIN_MILLIS = -184303902528000000L;
    public static final int MONDAY = 2;
    public static final int MONTH = 2;
    public static final int NOVEMBER = 10;
    public static final int OCTOBER = 9;
    protected static final long ONE_DAY = 86400000L;
    protected static final int ONE_HOUR = 3600000;
    protected static final int ONE_MINUTE = 60000;
    protected static final int ONE_SECOND = 1000;
    protected static final long ONE_WEEK = 604800000L;
    public static final int PM = 1;
    protected static final int RESOLVE_REMAP = 32;
    public static final int SATURDAY = 7;
    public static final int SECOND = 13;
    public static final int SEPTEMBER = 8;
    public static final int SUNDAY = 1;
    public static final int THURSDAY = 5;
    public static final int TUESDAY = 3;
    public static final int UNDECIMBER = 12;
    protected static final int UNSET = 0;
    public static final int WALLTIME_FIRST = 1;
    public static final int WALLTIME_LAST = 0;
    public static final int WALLTIME_NEXT_VALID = 2;
    public static final int WEDNESDAY = 4;
    public static final int WEEK_OF_MONTH = 4;
    public static final int WEEK_OF_YEAR = 3;
    public static final int YEAR = 1;
    public static final int YEAR_WOY = 17;
    public static final int ZONE_OFFSET = 15;
    
    protected Calendar() {
        throw new RuntimeException("Stub!");
    }
    
    protected Calendar(final TimeZone zone, final Locale aLocale) {
        throw new RuntimeException("Stub!");
    }
    
    protected Calendar(final TimeZone zone, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static Calendar getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static Calendar getInstance(final TimeZone zone) {
        throw new RuntimeException("Stub!");
    }
    
    public static Calendar getInstance(final Locale aLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static Calendar getInstance(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static Calendar getInstance(final TimeZone zone, final Locale aLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static Calendar getInstance(final TimeZone zone, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static Locale[] getAvailableLocales() {
        throw new RuntimeException("Stub!");
    }
    
    public static final String[] getKeywordValuesForLocale(final String key, final ULocale locale, final boolean commonlyUsed) {
        throw new RuntimeException("Stub!");
    }
    
    public final Date getTime() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setTime(final Date date) {
        throw new RuntimeException("Stub!");
    }
    
    public long getTimeInMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTimeInMillis(final long millis) {
        throw new RuntimeException("Stub!");
    }
    
    public final int get(final int field) {
        throw new RuntimeException("Stub!");
    }
    
    protected final int internalGet(final int field) {
        throw new RuntimeException("Stub!");
    }
    
    protected final int internalGet(final int field, final int defaultValue) {
        throw new RuntimeException("Stub!");
    }
    
    public final void set(final int field, final int value) {
        throw new RuntimeException("Stub!");
    }
    
    public final void set(final int year, final int month, final int date) {
        throw new RuntimeException("Stub!");
    }
    
    public final void set(final int year, final int month, final int date, final int hour, final int minute) {
        throw new RuntimeException("Stub!");
    }
    
    public final void set(final int year, final int month, final int date, final int hour, final int minute, final int second) {
        throw new RuntimeException("Stub!");
    }
    
    public final void clear() {
        throw new RuntimeException("Stub!");
    }
    
    public final void clear(final int field) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isSet(final int field) {
        throw new RuntimeException("Stub!");
    }
    
    protected void complete() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEquivalentTo(final Calendar other) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean before(final Object when) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean after(final Object when) {
        throw new RuntimeException("Stub!");
    }
    
    public int getActualMaximum(final int field) {
        throw new RuntimeException("Stub!");
    }
    
    public int getActualMinimum(final int field) {
        throw new RuntimeException("Stub!");
    }
    
    protected void prepareGetActual(final int field, final boolean isMinimum) {
        throw new RuntimeException("Stub!");
    }
    
    public final void roll(final int field, final boolean up) {
        throw new RuntimeException("Stub!");
    }
    
    public void roll(final int field, final int amount) {
        throw new RuntimeException("Stub!");
    }
    
    public void add(final int field, final int amount) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayName(final Locale loc) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayName(final ULocale loc) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int compareTo(final Calendar that) {
        throw new RuntimeException("Stub!");
    }
    
    public DateFormat getDateTimeFormat(final int dateStyle, final int timeStyle, final Locale loc) {
        throw new RuntimeException("Stub!");
    }
    
    public DateFormat getDateTimeFormat(final int dateStyle, final int timeStyle, final ULocale loc) {
        throw new RuntimeException("Stub!");
    }
    
    protected DateFormat handleGetDateFormat(final String pattern, final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    protected DateFormat handleGetDateFormat(final String pattern, final String override, final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    protected DateFormat handleGetDateFormat(final String pattern, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    protected void pinField(final int field) {
        throw new RuntimeException("Stub!");
    }
    
    protected int weekNumber(final int desiredDay, final int dayOfPeriod, final int dayOfWeek) {
        throw new RuntimeException("Stub!");
    }
    
    protected final int weekNumber(final int dayOfPeriod, final int dayOfWeek) {
        throw new RuntimeException("Stub!");
    }
    
    public int fieldDifference(final Date when, final int field) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTimeZone(final TimeZone value) {
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
    
    public void setRepeatedWallTimeOption(final int option) {
        throw new RuntimeException("Stub!");
    }
    
    public int getRepeatedWallTimeOption() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSkippedWallTimeOption(final int option) {
        throw new RuntimeException("Stub!");
    }
    
    public int getSkippedWallTimeOption() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFirstDayOfWeek(final int value) {
        throw new RuntimeException("Stub!");
    }
    
    public int getFirstDayOfWeek() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMinimalDaysInFirstWeek(final int value) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinimalDaysInFirstWeek() {
        throw new RuntimeException("Stub!");
    }
    
    protected abstract int handleGetLimit(final int p0, final int p1);
    
    protected int getLimit(final int field, final int limitType) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getMinimum(final int field) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getMaximum(final int field) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getGreatestMinimum(final int field) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getLeastMaximum(final int field) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWeekend(final Date date) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWeekend() {
        throw new RuntimeException("Stub!");
    }
    
    public Object clone() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static WeekData getWeekDataForRegion(final String region) {
        throw new RuntimeException("Stub!");
    }
    
    public WeekData getWeekData() {
        throw new RuntimeException("Stub!");
    }
    
    public Calendar setWeekData(final WeekData wdata) {
        throw new RuntimeException("Stub!");
    }
    
    protected void computeFields() {
        throw new RuntimeException("Stub!");
    }
    
    protected final void computeGregorianFields(final int julianDay) {
        throw new RuntimeException("Stub!");
    }
    
    protected int resolveFields(final int[][][] precedenceTable) {
        throw new RuntimeException("Stub!");
    }
    
    protected int newestStamp(final int first, final int last, final int bestStampSoFar) {
        throw new RuntimeException("Stub!");
    }
    
    protected final int getStamp(final int field) {
        throw new RuntimeException("Stub!");
    }
    
    protected int newerField(final int defaultField, final int alternateField) {
        throw new RuntimeException("Stub!");
    }
    
    protected void validateFields() {
        throw new RuntimeException("Stub!");
    }
    
    protected void validateField(final int field) {
        throw new RuntimeException("Stub!");
    }
    
    protected final void validateField(final int field, final int min, final int max) {
        throw new RuntimeException("Stub!");
    }
    
    protected void computeTime() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected int computeMillisInDay() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected int computeZoneOffset(final long millis, final int millisInDay) {
        throw new RuntimeException("Stub!");
    }
    
    protected int computeJulianDay() {
        throw new RuntimeException("Stub!");
    }
    
    protected int[][][] getFieldResolutionTable() {
        throw new RuntimeException("Stub!");
    }
    
    protected abstract int handleComputeMonthStart(final int p0, final int p1, final boolean p2);
    
    protected abstract int handleGetExtendedYear();
    
    protected int handleGetMonthLength(final int extendedYear, final int month) {
        throw new RuntimeException("Stub!");
    }
    
    protected int handleGetYearLength(final int eyear) {
        throw new RuntimeException("Stub!");
    }
    
    protected int[] handleCreateFields() {
        throw new RuntimeException("Stub!");
    }
    
    protected int handleComputeJulianDay(final int bestField) {
        throw new RuntimeException("Stub!");
    }
    
    protected int computeGregorianMonthStart(final int year, final int month) {
        throw new RuntimeException("Stub!");
    }
    
    protected void handleComputeFields(final int julianDay) {
        throw new RuntimeException("Stub!");
    }
    
    protected final int getGregorianYear() {
        throw new RuntimeException("Stub!");
    }
    
    protected final int getGregorianMonth() {
        throw new RuntimeException("Stub!");
    }
    
    protected final int getGregorianDayOfYear() {
        throw new RuntimeException("Stub!");
    }
    
    protected final int getGregorianDayOfMonth() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getFieldCount() {
        throw new RuntimeException("Stub!");
    }
    
    protected final void internalSet(final int field, final int value) {
        throw new RuntimeException("Stub!");
    }
    
    protected static final boolean isGregorianLeapYear(final int year) {
        throw new RuntimeException("Stub!");
    }
    
    protected static final int gregorianMonthLength(final int y, final int m) {
        throw new RuntimeException("Stub!");
    }
    
    protected static final int gregorianPreviousMonthLength(final int y, final int m) {
        throw new RuntimeException("Stub!");
    }
    
    protected static final long floorDivide(final long numerator, final long denominator) {
        throw new RuntimeException("Stub!");
    }
    
    protected static final int floorDivide(final int numerator, final int denominator) {
        throw new RuntimeException("Stub!");
    }
    
    protected static final int floorDivide(final int numerator, final int denominator, final int[] remainder) {
        throw new RuntimeException("Stub!");
    }
    
    protected static final int floorDivide(final long numerator, final int denominator, final int[] remainder) {
        throw new RuntimeException("Stub!");
    }
    
    protected String fieldName(final int field) {
        throw new RuntimeException("Stub!");
    }
    
    protected static final int millisToJulianDay(final long millis) {
        throw new RuntimeException("Stub!");
    }
    
    protected static final long julianDayToMillis(final int julian) {
        throw new RuntimeException("Stub!");
    }
    
    protected static final int julianDayToDayOfWeek(final int julian) {
        throw new RuntimeException("Stub!");
    }
    
    protected final long internalGetTimeInMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public String getType() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        MAX_DATE = null;
        MIN_DATE = null;
    }
    
    public static final class WeekData
    {
        public final int firstDayOfWeek;
        public final int minimalDaysInFirstWeek;
        public final int weekendCease;
        public final int weekendCeaseMillis;
        public final int weekendOnset;
        public final int weekendOnsetMillis;
        
        public WeekData(final int fdow, final int mdifw, final int weekendOnset, final int weekendOnsetMillis, final int weekendCease, final int weekendCeaseMillis) {
            this.firstDayOfWeek = 0;
            this.minimalDaysInFirstWeek = 0;
            this.weekendCease = 0;
            this.weekendCeaseMillis = 0;
            this.weekendOnset = 0;
            this.weekendOnsetMillis = 0;
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object other) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
