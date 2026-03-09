package android.icu.util;

import java.util.Set;
import java.util.Date;
import java.util.Locale;
import java.io.Serializable;

public abstract class TimeZone implements Serializable, Cloneable, Freezable<TimeZone>
{
    public static final int GENERIC_LOCATION = 7;
    public static final TimeZone GMT_ZONE;
    public static final int LONG = 1;
    public static final int LONG_GENERIC = 3;
    public static final int LONG_GMT = 5;
    public static final int SHORT = 0;
    public static final int SHORT_COMMONLY_USED = 6;
    public static final int SHORT_GENERIC = 2;
    public static final int SHORT_GMT = 4;
    public static final int TIMEZONE_ICU = 0;
    public static final int TIMEZONE_JDK = 1;
    public static final TimeZone UNKNOWN_ZONE;
    public static final String UNKNOWN_ZONE_ID = "Etc/Unknown";
    
    public TimeZone() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int getOffset(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    
    public int getOffset(final long date) {
        throw new RuntimeException("Stub!");
    }
    
    public void getOffset(final long date, final boolean local, final int[] offsets) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setRawOffset(final int p0);
    
    public abstract int getRawOffset();
    
    public String getID() {
        throw new RuntimeException("Stub!");
    }
    
    public void setID(final String ID) {
        throw new RuntimeException("Stub!");
    }
    
    public final String getDisplayName() {
        throw new RuntimeException("Stub!");
    }
    
    public final String getDisplayName(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public final String getDisplayName(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public final String getDisplayName(final boolean daylight, final int style) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayName(final boolean daylight, final int style, final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayName(final boolean daylight, final int style, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDSTSavings() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract boolean useDaylightTime();
    
    public boolean observesDaylightTime() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract boolean inDaylightTime(final Date p0);
    
    public static TimeZone getTimeZone(final String ID) {
        throw new RuntimeException("Stub!");
    }
    
    public static TimeZone getFrozenTimeZone(final String ID) {
        throw new RuntimeException("Stub!");
    }
    
    public static TimeZone getTimeZone(final String ID, final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public static Set<String> getAvailableIDs(final SystemTimeZoneType zoneType, final String region, final Integer rawOffset) {
        throw new RuntimeException("Stub!");
    }
    
    public static String[] getAvailableIDs(final int rawOffset) {
        throw new RuntimeException("Stub!");
    }
    
    public static String[] getAvailableIDs(final String country) {
        throw new RuntimeException("Stub!");
    }
    
    public static String[] getAvailableIDs() {
        throw new RuntimeException("Stub!");
    }
    
    public static int countEquivalentIDs(final String id) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getEquivalentID(final String id, final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public static TimeZone getDefault() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasSameRules(final TimeZone other) {
        throw new RuntimeException("Stub!");
    }
    
    public Object clone() {
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
    
    public static String getTZDataVersion() {
        throw new RuntimeException("Stub!");
    }
    
    public static String getCanonicalID(final String id) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getCanonicalID(final String id, final boolean[] isSystemID) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getRegion(final String id) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getWindowsID(final String id) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getIDForWindowsID(final String winid, final String region) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isFrozen() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public TimeZone freeze() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public TimeZone cloneAsThawed() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        GMT_ZONE = null;
        UNKNOWN_ZONE = null;
    }
    
    public enum SystemTimeZoneType
    {
        ANY, 
        CANONICAL, 
        CANONICAL_LOCATION;
    }
}
