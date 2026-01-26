package android.icu.util;

import java.util.Date;
import java.util.Locale;

public class IslamicCalendar extends Calendar
{
    public static final int DHU_AL_HIJJAH = 11;
    public static final int DHU_AL_QIDAH = 10;
    public static final int JUMADA_1 = 4;
    public static final int JUMADA_2 = 5;
    public static final int MUHARRAM = 0;
    public static final int RABI_1 = 2;
    public static final int RABI_2 = 3;
    public static final int RAJAB = 6;
    public static final int RAMADAN = 8;
    public static final int SAFAR = 1;
    public static final int SHABAN = 7;
    public static final int SHAWWAL = 9;
    
    public IslamicCalendar() {
        throw new RuntimeException("Stub!");
    }
    
    public IslamicCalendar(final TimeZone zone) {
        throw new RuntimeException("Stub!");
    }
    
    public IslamicCalendar(final Locale aLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public IslamicCalendar(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public IslamicCalendar(final TimeZone zone, final Locale aLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public IslamicCalendar(final TimeZone zone, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public IslamicCalendar(final Date date) {
        throw new RuntimeException("Stub!");
    }
    
    public IslamicCalendar(final int year, final int month, final int date) {
        throw new RuntimeException("Stub!");
    }
    
    public IslamicCalendar(final int year, final int month, final int date, final int hour, final int minute, final int second) {
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
    protected int handleGetYearLength(final int extendedYear) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int handleComputeMonthStart(final int eyear, final int month, final boolean useMonth) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int handleGetExtendedYear() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void handleComputeFields(final int julianDay) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCalculationType(final CalculationType type) {
        throw new RuntimeException("Stub!");
    }
    
    public CalculationType getCalculationType() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getType() {
        throw new RuntimeException("Stub!");
    }
    
    public enum CalculationType
    {
        ISLAMIC, 
        ISLAMIC_CIVIL, 
        ISLAMIC_UMALQURA, 
        ISLAMIC_TBLA;
    }
}
