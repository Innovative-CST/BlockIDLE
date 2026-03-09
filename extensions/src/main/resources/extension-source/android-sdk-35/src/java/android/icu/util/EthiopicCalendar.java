package android.icu.util;

import java.util.Date;
import java.util.Locale;

public final class EthiopicCalendar extends Calendar
{
    public static final int GENBOT = 8;
    public static final int HAMLE = 10;
    public static final int HEDAR = 2;
    public static final int MEGABIT = 6;
    public static final int MESKEREM = 0;
    public static final int MIAZIA = 7;
    public static final int NEHASSE = 11;
    public static final int PAGUMEN = 12;
    public static final int SENE = 9;
    public static final int TAHSAS = 3;
    public static final int TEKEMT = 1;
    public static final int TER = 4;
    public static final int YEKATIT = 5;
    
    public EthiopicCalendar() {
        throw new RuntimeException("Stub!");
    }
    
    public EthiopicCalendar(final TimeZone zone) {
        throw new RuntimeException("Stub!");
    }
    
    public EthiopicCalendar(final Locale aLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public EthiopicCalendar(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public EthiopicCalendar(final TimeZone zone, final Locale aLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public EthiopicCalendar(final TimeZone zone, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public EthiopicCalendar(final int year, final int month, final int date) {
        throw new RuntimeException("Stub!");
    }
    
    public EthiopicCalendar(final Date date) {
        throw new RuntimeException("Stub!");
    }
    
    public EthiopicCalendar(final int year, final int month, final int date, final int hour, final int minute, final int second) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getType() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAmeteAlemEra(final boolean onOff) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAmeteAlemEra() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected int handleGetExtendedYear() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void handleComputeFields(final int julianDay) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected int handleGetLimit(final int field, final int limitType) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int handleComputeMonthStart(final int eyear, final int emonth, final boolean useMonth) {
        throw new RuntimeException("Stub!");
    }
}
