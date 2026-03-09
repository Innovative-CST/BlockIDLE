package android.icu.util;

import java.util.Date;
import java.util.Locale;

public class HebrewCalendar extends Calendar
{
    public static final int ADAR = 6;
    public static final int ADAR_1 = 5;
    public static final int AV = 11;
    public static final int ELUL = 12;
    public static final int HESHVAN = 1;
    public static final int IYAR = 8;
    public static final int KISLEV = 2;
    public static final int NISAN = 7;
    public static final int SHEVAT = 4;
    public static final int SIVAN = 9;
    public static final int TAMUZ = 10;
    public static final int TEVET = 3;
    public static final int TISHRI = 0;
    
    public HebrewCalendar() {
        throw new RuntimeException("Stub!");
    }
    
    public HebrewCalendar(final TimeZone zone) {
        throw new RuntimeException("Stub!");
    }
    
    public HebrewCalendar(final Locale aLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public HebrewCalendar(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public HebrewCalendar(final TimeZone zone, final Locale aLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public HebrewCalendar(final TimeZone zone, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public HebrewCalendar(final int year, final int month, final int date) {
        throw new RuntimeException("Stub!");
    }
    
    public HebrewCalendar(final Date date) {
        throw new RuntimeException("Stub!");
    }
    
    public HebrewCalendar(final int year, final int month, final int date, final int hour, final int minute, final int second) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void add(final int field, final int amount) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void roll(final int field, final int amount) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int handleGetLimit(final int field, final int limitType) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int handleGetMonthLength(final int extendedYear, final int month) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int handleGetYearLength(final int eyear) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void validateField(final int field) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void handleComputeFields(final int julianDay) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int handleGetExtendedYear() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int handleComputeMonthStart(final int eyear, final int month, final boolean useMonth) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getType() {
        throw new RuntimeException("Stub!");
    }
}
