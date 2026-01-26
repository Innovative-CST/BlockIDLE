package android.icu.util;

import java.util.Date;
import java.util.Locale;

public class GregorianCalendar extends Calendar
{
    public static final int AD = 1;
    public static final int BC = 0;
    protected transient boolean invertGregorian;
    protected transient boolean isGregorian;
    
    public GregorianCalendar() {
        throw new RuntimeException("Stub!");
    }
    
    public GregorianCalendar(final TimeZone zone) {
        throw new RuntimeException("Stub!");
    }
    
    public GregorianCalendar(final Locale aLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public GregorianCalendar(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public GregorianCalendar(final TimeZone zone, final Locale aLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public GregorianCalendar(final TimeZone zone, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public GregorianCalendar(final int year, final int month, final int date) {
        throw new RuntimeException("Stub!");
    }
    
    public GregorianCalendar(final int year, final int month, final int date, final int hour, final int minute) {
        throw new RuntimeException("Stub!");
    }
    
    public GregorianCalendar(final int year, final int month, final int date, final int hour, final int minute, final int second) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int handleGetLimit(final int field, final int limitType) {
        throw new RuntimeException("Stub!");
    }
    
    public void setGregorianChange(final Date date) {
        throw new RuntimeException("Stub!");
    }
    
    public final Date getGregorianChange() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLeapYear(final int year) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isEquivalentTo(final Calendar other) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void roll(final int field, final int amount) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getActualMinimum(final int field) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getActualMaximum(final int field) {
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
    
    @Override
    protected void handleComputeFields(final int julianDay) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int handleGetExtendedYear() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int handleComputeJulianDay(final int bestField) {
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
