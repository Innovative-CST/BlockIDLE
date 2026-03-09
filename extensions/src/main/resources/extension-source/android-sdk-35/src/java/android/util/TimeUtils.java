package android.util;

import java.time.LocalTime;
import java.util.List;
import java.util.TimeZone;

public class TimeUtils
{
    TimeUtils() {
        throw new RuntimeException("Stub!");
    }
    
    public static TimeZone getTimeZone(final int offset, final boolean dst, final long when, final String country) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static List<String> getTimeZoneIdsForCountryCode(@NonNull final String countryCode) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getTimeZoneDatabaseVersion() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isTimeBetween(@NonNull final LocalTime reference, @NonNull final LocalTime start, @NonNull final LocalTime end) {
        throw new RuntimeException("Stub!");
    }
}
