package android.icu.text;

import java.util.ResourceBundle;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import java.util.Locale;
import java.io.Serializable;

public class DateFormatSymbols implements Serializable, Cloneable
{
    public static final int ABBREVIATED = 0;
    public static final int FORMAT = 0;
    public static final int NARROW = 2;
    public static final int SHORT = 3;
    public static final int STANDALONE = 1;
    public static final int WIDE = 1;
    
    public DateFormatSymbols() {
        throw new RuntimeException("Stub!");
    }
    
    public DateFormatSymbols(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public DateFormatSymbols(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public DateFormatSymbols(final Calendar cal, final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public DateFormatSymbols(final Calendar cal, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public DateFormatSymbols(final Class<? extends Calendar> calendarClass, final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public DateFormatSymbols(final Class<? extends Calendar> calendarClass, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public DateFormatSymbols(final ResourceBundle bundle, final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public DateFormatSymbols(final ResourceBundle bundle, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static DateFormatSymbols getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static DateFormatSymbols getInstance(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static DateFormatSymbols getInstance(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static Locale[] getAvailableLocales() {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getEras() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEras(final String[] newEras) {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getEraNames() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEraNames(final String[] newEraNames) {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getNarrowEras() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNarrowEras(final String[] newNarrowEras) {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getMonths() {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getMonths(final int context, final int width) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMonths(final String[] newMonths) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMonths(final String[] newMonths, final int context, final int width) {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getShortMonths() {
        throw new RuntimeException("Stub!");
    }
    
    public void setShortMonths(final String[] newShortMonths) {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getWeekdays() {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getWeekdays(final int context, final int width) {
        throw new RuntimeException("Stub!");
    }
    
    public void setWeekdays(final String[] newWeekdays, final int context, final int width) {
        throw new RuntimeException("Stub!");
    }
    
    public void setWeekdays(final String[] newWeekdays) {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getShortWeekdays() {
        throw new RuntimeException("Stub!");
    }
    
    public void setShortWeekdays(final String[] newAbbrevWeekdays) {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getQuarters(final int context, final int width) {
        throw new RuntimeException("Stub!");
    }
    
    public void setQuarters(final String[] newQuarters, final int context, final int width) {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getYearNames(final int context, final int width) {
        throw new RuntimeException("Stub!");
    }
    
    public void setYearNames(final String[] yearNames, final int context, final int width) {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getZodiacNames(final int context, final int width) {
        throw new RuntimeException("Stub!");
    }
    
    public void setZodiacNames(final String[] zodiacNames, final int context, final int width) {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getAmPmStrings() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAmPmStrings(final String[] newAmpms) {
        throw new RuntimeException("Stub!");
    }
    
    public String[][] getZoneStrings() {
        throw new RuntimeException("Stub!");
    }
    
    public void setZoneStrings(final String[][] newZoneStrings) {
        throw new RuntimeException("Stub!");
    }
    
    public String getLocalPatternChars() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLocalPatternChars(final String newLocalPatternChars) {
        throw new RuntimeException("Stub!");
    }
    
    public Object clone() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    protected void initializeData(final ULocale desiredLocale, final String type) {
        throw new RuntimeException("Stub!");
    }
}
