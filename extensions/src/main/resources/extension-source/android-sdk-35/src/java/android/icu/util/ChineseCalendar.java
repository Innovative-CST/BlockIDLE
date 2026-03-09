package android.icu.util;

import android.icu.text.DateFormat;
import java.util.Locale;
import java.util.Date;

public class ChineseCalendar extends Calendar
{
    public ChineseCalendar() {
        throw new RuntimeException("Stub!");
    }
    
    public ChineseCalendar(final Date date) {
        throw new RuntimeException("Stub!");
    }
    
    public ChineseCalendar(final int year, final int month, final int isLeapMonth, final int date) {
        throw new RuntimeException("Stub!");
    }
    
    public ChineseCalendar(final int year, final int month, final int isLeapMonth, final int date, final int hour, final int minute, final int second) {
        throw new RuntimeException("Stub!");
    }
    
    public ChineseCalendar(final int era, final int year, final int month, final int isLeapMonth, final int date) {
        throw new RuntimeException("Stub!");
    }
    
    public ChineseCalendar(final int era, final int year, final int month, final int isLeapMonth, final int date, final int hour, final int minute, final int second) {
        throw new RuntimeException("Stub!");
    }
    
    public ChineseCalendar(final Locale aLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public ChineseCalendar(final TimeZone zone) {
        throw new RuntimeException("Stub!");
    }
    
    public ChineseCalendar(final TimeZone zone, final Locale aLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public ChineseCalendar(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public ChineseCalendar(final TimeZone zone, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int handleGetLimit(final int field, final int limitType) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int handleGetExtendedYear() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int handleGetMonthLength(final int extendedYear, final int month) {
        throw new RuntimeException("Stub!");
    }
    
    protected DateFormat handleGetDateFormat(final String pattern, final String override, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int[][][] getFieldResolutionTable() {
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
    protected void handleComputeFields(final int julianDay) {
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
