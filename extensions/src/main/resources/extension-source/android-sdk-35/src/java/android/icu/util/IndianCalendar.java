package android.icu.util;

import java.util.Date;
import java.util.Locale;

public class IndianCalendar extends Calendar
{
    public static final int AGRAHAYANA = 8;
    public static final int ASADHA = 3;
    public static final int ASVINA = 6;
    public static final int BHADRA = 5;
    public static final int CHAITRA = 0;
    public static final int IE = 0;
    public static final int JYAISTHA = 2;
    public static final int KARTIKA = 7;
    public static final int MAGHA = 10;
    public static final int PAUSA = 9;
    public static final int PHALGUNA = 11;
    public static final int SRAVANA = 4;
    public static final int VAISAKHA = 1;
    
    public IndianCalendar() {
        throw new RuntimeException("Stub!");
    }
    
    public IndianCalendar(final TimeZone zone) {
        throw new RuntimeException("Stub!");
    }
    
    public IndianCalendar(final Locale aLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public IndianCalendar(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public IndianCalendar(final TimeZone zone, final Locale aLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public IndianCalendar(final TimeZone zone, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public IndianCalendar(final Date date) {
        throw new RuntimeException("Stub!");
    }
    
    public IndianCalendar(final int year, final int month, final int date) {
        throw new RuntimeException("Stub!");
    }
    
    public IndianCalendar(final int year, final int month, final int date, final int hour, final int minute, final int second) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int handleGetExtendedYear() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int handleGetYearLength(final int extendedYear) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int handleGetMonthLength(final int extendedYear, final int month) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void handleComputeFields(final int julianDay) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int handleGetLimit(final int field, final int limitType) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int handleComputeMonthStart(final int year, final int month, final boolean useMonth) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getType() {
        throw new RuntimeException("Stub!");
    }
}
