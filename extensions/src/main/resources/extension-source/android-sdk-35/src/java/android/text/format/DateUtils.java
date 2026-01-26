package android.text.format;

import java.util.Formatter;
import android.content.Context;

public class DateUtils
{
    @Deprecated
    public static final String ABBREV_MONTH_FORMAT = "%b";
    public static final String ABBREV_WEEKDAY_FORMAT = "%a";
    public static final long DAY_IN_MILLIS = 86400000L;
    @Deprecated
    public static final int FORMAT_12HOUR = 64;
    @Deprecated
    public static final int FORMAT_24HOUR = 128;
    public static final int FORMAT_ABBREV_ALL = 524288;
    public static final int FORMAT_ABBREV_MONTH = 65536;
    public static final int FORMAT_ABBREV_RELATIVE = 262144;
    public static final int FORMAT_ABBREV_TIME = 16384;
    public static final int FORMAT_ABBREV_WEEKDAY = 32768;
    @Deprecated
    public static final int FORMAT_CAP_AMPM = 256;
    @Deprecated
    public static final int FORMAT_CAP_MIDNIGHT = 4096;
    @Deprecated
    public static final int FORMAT_CAP_NOON = 1024;
    @Deprecated
    public static final int FORMAT_CAP_NOON_MIDNIGHT = 5120;
    public static final int FORMAT_NO_MIDNIGHT = 2048;
    public static final int FORMAT_NO_MONTH_DAY = 32;
    public static final int FORMAT_NO_NOON = 512;
    @Deprecated
    public static final int FORMAT_NO_NOON_MIDNIGHT = 2560;
    public static final int FORMAT_NO_YEAR = 8;
    public static final int FORMAT_NUMERIC_DATE = 131072;
    public static final int FORMAT_SHOW_DATE = 16;
    public static final int FORMAT_SHOW_TIME = 1;
    public static final int FORMAT_SHOW_WEEKDAY = 2;
    public static final int FORMAT_SHOW_YEAR = 4;
    @Deprecated
    public static final int FORMAT_UTC = 8192;
    public static final long HOUR_IN_MILLIS = 3600000L;
    @Deprecated
    public static final String HOUR_MINUTE_24 = "%H:%M";
    @Deprecated
    public static final int LENGTH_LONG = 10;
    @Deprecated
    public static final int LENGTH_MEDIUM = 20;
    @Deprecated
    public static final int LENGTH_SHORT = 30;
    @Deprecated
    public static final int LENGTH_SHORTER = 40;
    @Deprecated
    public static final int LENGTH_SHORTEST = 50;
    public static final long MINUTE_IN_MILLIS = 60000L;
    public static final String MONTH_DAY_FORMAT = "%-d";
    public static final String MONTH_FORMAT = "%B";
    public static final String NUMERIC_MONTH_FORMAT = "%m";
    public static final long SECOND_IN_MILLIS = 1000L;
    public static final String WEEKDAY_FORMAT = "%A";
    public static final long WEEK_IN_MILLIS = 604800000L;
    public static final String YEAR_FORMAT = "%Y";
    public static final String YEAR_FORMAT_TWO_DIGITS = "%g";
    @Deprecated
    public static final long YEAR_IN_MILLIS = 31449600000L;
    @Deprecated
    public static final int[] sameMonthTable;
    @Deprecated
    public static final int[] sameYearTable;
    
    public DateUtils() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static String getDayOfWeekString(final int dayOfWeek, final int abbrev) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static String getAMPMString(final int ampm) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static String getMonthString(final int month, final int abbrev) {
        throw new RuntimeException("Stub!");
    }
    
    public static CharSequence getRelativeTimeSpanString(final long startTime) {
        throw new RuntimeException("Stub!");
    }
    
    public static CharSequence getRelativeTimeSpanString(final long time, final long now, final long minResolution) {
        throw new RuntimeException("Stub!");
    }
    
    public static CharSequence getRelativeTimeSpanString(final long time, final long now, final long minResolution, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static CharSequence getRelativeDateTimeString(final Context c, final long time, final long minResolution, final long transitionResolution, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static String formatElapsedTime(final long elapsedSeconds) {
        throw new RuntimeException("Stub!");
    }
    
    public static String formatElapsedTime(final StringBuilder recycle, final long elapsedSeconds) {
        throw new RuntimeException("Stub!");
    }
    
    public static final CharSequence formatSameDayTime(final long then, final long now, final int dateStyle, final int timeStyle) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isToday(final long when) {
        throw new RuntimeException("Stub!");
    }
    
    public static String formatDateRange(final Context context, final long startMillis, final long endMillis, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static Formatter formatDateRange(final Context context, final Formatter formatter, final long startMillis, final long endMillis, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static Formatter formatDateRange(final Context context, final Formatter formatter, final long startMillis, final long endMillis, final int flags, final String timeZone) {
        throw new RuntimeException("Stub!");
    }
    
    public static String formatDateTime(final Context context, final long millis, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static CharSequence getRelativeTimeSpanString(final Context c, final long millis, final boolean withPreposition) {
        throw new RuntimeException("Stub!");
    }
    
    public static CharSequence getRelativeTimeSpanString(final Context c, final long millis) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        sameMonthTable = null;
        sameYearTable = null;
    }
}
