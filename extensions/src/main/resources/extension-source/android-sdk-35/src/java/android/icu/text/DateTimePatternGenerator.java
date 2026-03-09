package android.icu.text;

import java.util.Set;
import java.util.Map;
import java.util.Locale;
import android.icu.util.ULocale;
import android.icu.util.Freezable;

public class DateTimePatternGenerator implements Freezable<DateTimePatternGenerator>, Cloneable
{
    public static final int DAY = 7;
    public static final int DAYPERIOD = 10;
    public static final int DAY_OF_WEEK_IN_MONTH = 9;
    public static final int DAY_OF_YEAR = 8;
    public static final int ERA = 0;
    public static final int FRACTIONAL_SECOND = 14;
    public static final int HOUR = 11;
    public static final int MATCH_ALL_FIELDS_LENGTH = 65535;
    public static final int MATCH_HOUR_FIELD_LENGTH = 2048;
    public static final int MATCH_NO_OPTIONS = 0;
    public static final int MINUTE = 12;
    public static final int MONTH = 3;
    public static final int QUARTER = 2;
    public static final int SECOND = 13;
    public static final int WEEKDAY = 6;
    public static final int WEEK_OF_MONTH = 5;
    public static final int WEEK_OF_YEAR = 4;
    public static final int YEAR = 1;
    public static final int ZONE = 15;
    
    protected DateTimePatternGenerator() {
        throw new RuntimeException("Stub!");
    }
    
    public static DateTimePatternGenerator getEmptyInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static DateTimePatternGenerator getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static DateTimePatternGenerator getInstance(final ULocale uLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static DateTimePatternGenerator getInstance(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public String getBestPattern(final String skeleton) {
        throw new RuntimeException("Stub!");
    }
    
    public String getBestPattern(final String skeleton, final int options) {
        throw new RuntimeException("Stub!");
    }
    
    public DateTimePatternGenerator addPattern(final String pattern, final boolean override, final PatternInfo returnInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public String getSkeleton(final String pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public String getBaseSkeleton(final String pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public Map<String, String> getSkeletons(final Map<String, String> result) {
        throw new RuntimeException("Stub!");
    }
    
    public Set<String> getBaseSkeletons(final Set<String> result) {
        throw new RuntimeException("Stub!");
    }
    
    public String replaceFieldTypes(final String pattern, final String skeleton) {
        throw new RuntimeException("Stub!");
    }
    
    public String replaceFieldTypes(final String pattern, final String skeleton, final int options) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDateTimeFormat(final String dateTimeFormat) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDateTimeFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDateTimeFormat(final int style, final String dateTimeFormat) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDateTimeFormat(final int style) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDecimal(final String decimal) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDecimal() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAppendItemFormat(final int field, final String value) {
        throw new RuntimeException("Stub!");
    }
    
    public String getAppendItemFormat(final int field) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAppendItemName(final int field, final String value) {
        throw new RuntimeException("Stub!");
    }
    
    public String getAppendItemName(final int field) {
        throw new RuntimeException("Stub!");
    }
    
    public DateFormat.HourCycle getDefaultHourCycle() {
        throw new RuntimeException("Stub!");
    }
    
    public String getFieldDisplayName(final int field, final DisplayWidth width) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isFrozen() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public DateTimePatternGenerator freeze() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public DateTimePatternGenerator cloneAsThawed() {
        throw new RuntimeException("Stub!");
    }
    
    public Object clone() {
        throw new RuntimeException("Stub!");
    }
    
    public enum DisplayWidth
    {
        WIDE, 
        ABBREVIATED, 
        NARROW;
    }
    
    public static final class PatternInfo
    {
        public static final int BASE_CONFLICT = 1;
        public static final int CONFLICT = 2;
        public static final int OK = 0;
        public String conflictingPattern;
        public int status;
        
        public PatternInfo() {
            throw new RuntimeException("Stub!");
        }
    }
}
