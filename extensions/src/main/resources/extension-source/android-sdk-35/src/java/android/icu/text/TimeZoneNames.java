package android.icu.text;

import java.util.Set;
import java.util.Locale;
import android.icu.util.ULocale;
import java.io.Serializable;

public abstract class TimeZoneNames implements Serializable
{
    TimeZoneNames() {
        throw new RuntimeException("Stub!");
    }
    
    public static TimeZoneNames getInstance(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static TimeZoneNames getInstance(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static TimeZoneNames getTZDBInstance(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Set<String> getAvailableMetaZoneIDs();
    
    public abstract Set<String> getAvailableMetaZoneIDs(final String p0);
    
    public abstract String getMetaZoneID(final String p0, final long p1);
    
    public abstract String getReferenceZoneID(final String p0, final String p1);
    
    public abstract String getMetaZoneDisplayName(final String p0, final NameType p1);
    
    public final String getDisplayName(final String tzID, final NameType type, final long date) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract String getTimeZoneDisplayName(final String p0, final NameType p1);
    
    public String getExemplarLocationName(final String tzID) {
        throw new RuntimeException("Stub!");
    }
    
    public enum NameType
    {
        LONG_GENERIC, 
        LONG_STANDARD, 
        LONG_DAYLIGHT, 
        SHORT_GENERIC, 
        SHORT_STANDARD, 
        SHORT_DAYLIGHT, 
        EXEMPLAR_LOCATION;
    }
}
