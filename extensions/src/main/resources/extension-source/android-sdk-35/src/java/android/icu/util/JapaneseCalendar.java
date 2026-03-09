package android.icu.util;

import java.util.Date;
import java.util.Locale;

public class JapaneseCalendar extends GregorianCalendar
{
    public static final int HEISEI;
    public static final int MEIJI;
    public static final int REIWA;
    public static final int SHOWA;
    public static final int TAISHO;
    
    public JapaneseCalendar() {
        throw new RuntimeException("Stub!");
    }
    
    public JapaneseCalendar(final TimeZone zone) {
        throw new RuntimeException("Stub!");
    }
    
    public JapaneseCalendar(final Locale aLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public JapaneseCalendar(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public JapaneseCalendar(final TimeZone zone, final Locale aLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public JapaneseCalendar(final TimeZone zone, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public JapaneseCalendar(final Date date) {
        throw new RuntimeException("Stub!");
    }
    
    public JapaneseCalendar(final int era, final int year, final int month, final int date) {
        throw new RuntimeException("Stub!");
    }
    
    public JapaneseCalendar(final int year, final int month, final int date) {
        throw new RuntimeException("Stub!");
    }
    
    public JapaneseCalendar(final int year, final int month, final int date, final int hour, final int minute, final int second) {
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
    
    @Override
    protected int handleGetLimit(final int field, final int limitType) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getType() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getActualMaximum(final int field) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        HEISEI = 0;
        MEIJI = 0;
        REIWA = 0;
        SHOWA = 0;
        TAISHO = 0;
    }
}
