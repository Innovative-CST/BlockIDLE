package android.text.format;

@Deprecated
public class Time
{
    @Deprecated
    public static final int EPOCH_JULIAN_DAY = 2440588;
    @Deprecated
    public static final int FRIDAY = 5;
    @Deprecated
    public static final int HOUR = 3;
    @Deprecated
    public static final int MINUTE = 2;
    @Deprecated
    public static final int MONDAY = 1;
    @Deprecated
    public static final int MONDAY_BEFORE_JULIAN_EPOCH = 2440585;
    @Deprecated
    public static final int MONTH = 5;
    @Deprecated
    public static final int MONTH_DAY = 4;
    @Deprecated
    public static final int SATURDAY = 6;
    @Deprecated
    public static final int SECOND = 1;
    @Deprecated
    public static final int SUNDAY = 0;
    @Deprecated
    public static final int THURSDAY = 4;
    @Deprecated
    public static final String TIMEZONE_UTC = "UTC";
    @Deprecated
    public static final int TUESDAY = 2;
    @Deprecated
    public static final int WEDNESDAY = 3;
    @Deprecated
    public static final int WEEK_DAY = 7;
    @Deprecated
    public static final int WEEK_NUM = 9;
    @Deprecated
    public static final int YEAR = 6;
    @Deprecated
    public static final int YEAR_DAY = 8;
    @Deprecated
    public boolean allDay;
    @Deprecated
    public long gmtoff;
    @Deprecated
    public int hour;
    @Deprecated
    public int isDst;
    @Deprecated
    public int minute;
    @Deprecated
    public int month;
    @Deprecated
    public int monthDay;
    @Deprecated
    public int second;
    @Deprecated
    public String timezone;
    @Deprecated
    public int weekDay;
    @Deprecated
    public int year;
    @Deprecated
    public int yearDay;
    
    @Deprecated
    public Time(final String timezoneId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Time() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Time(final Time other) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public long normalize(final boolean ignoreDst) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void switchTimezone(final String timezone) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getActualMaximum(final int field) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void clear(final String timezoneId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int compare(final Time a, final Time b) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String format(final String format) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean parse(final String s) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean parse3339(final String s) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static String getCurrentTimezone() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setToNow() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public long toMillis(final boolean ignoreDst) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void set(final long millis) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String format2445() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void set(final Time that) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void set(final int second, final int minute, final int hour, final int monthDay, final int month, final int year) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void set(final int monthDay, final int month, final int year) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean before(final Time that) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean after(final Time that) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getWeekNumber() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String format3339(final boolean allDay) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static boolean isEpoch(final Time time) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getJulianDay(final long millis, final long gmtoffSeconds) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public long setJulianDay(final int julianDay) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getWeeksSinceEpochFromJulianDay(final int julianDay, final int firstDayOfWeek) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getJulianMondayFromWeeksSinceEpoch(final int week) {
        throw new RuntimeException("Stub!");
    }
}
