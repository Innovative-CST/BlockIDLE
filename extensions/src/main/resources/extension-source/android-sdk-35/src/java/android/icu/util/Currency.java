package android.icu.util;

import java.util.Set;
import java.util.Date;
import java.util.Locale;

public class Currency extends MeasureUnit
{
    public static final int FORMAL_SYMBOL_NAME = 4;
    public static final int LONG_NAME = 1;
    public static final int NARROW_SYMBOL_NAME = 3;
    public static final int PLURAL_LONG_NAME = 2;
    public static final int SYMBOL_NAME = 0;
    public static final int VARIANT_SYMBOL_NAME = 5;
    
    protected Currency(final String theISOCode) {
        throw new RuntimeException("Stub!");
    }
    
    public static Currency getInstance(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static Currency getInstance(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static String[] getAvailableCurrencyCodes(final ULocale loc, final Date d) {
        throw new RuntimeException("Stub!");
    }
    
    public static String[] getAvailableCurrencyCodes(final Locale loc, final Date d) {
        throw new RuntimeException("Stub!");
    }
    
    public static Set<Currency> getAvailableCurrencies() {
        throw new RuntimeException("Stub!");
    }
    
    public static Currency getInstance(final String theISOCode) {
        throw new RuntimeException("Stub!");
    }
    
    public static Currency fromJavaCurrency(final java.util.Currency currency) {
        throw new RuntimeException("Stub!");
    }
    
    public java.util.Currency toJavaCurrency() {
        throw new RuntimeException("Stub!");
    }
    
    public static Locale[] getAvailableLocales() {
        throw new RuntimeException("Stub!");
    }
    
    public static ULocale[] getAvailableULocales() {
        throw new RuntimeException("Stub!");
    }
    
    public static final String[] getKeywordValuesForLocale(final String key, final ULocale locale, final boolean commonlyUsed) {
        throw new RuntimeException("Stub!");
    }
    
    public String getCurrencyCode() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNumericCode() {
        throw new RuntimeException("Stub!");
    }
    
    public String getSymbol() {
        throw new RuntimeException("Stub!");
    }
    
    public String getSymbol(final Locale loc) {
        throw new RuntimeException("Stub!");
    }
    
    public String getSymbol(final ULocale uloc) {
        throw new RuntimeException("Stub!");
    }
    
    public String getName(final Locale locale, final int nameStyle, final boolean[] isChoiceFormat) {
        throw new RuntimeException("Stub!");
    }
    
    public String getName(final ULocale locale, final int nameStyle, final boolean[] isChoiceFormat) {
        throw new RuntimeException("Stub!");
    }
    
    public String getName(final Locale locale, final int nameStyle, final String pluralCount, final boolean[] isChoiceFormat) {
        throw new RuntimeException("Stub!");
    }
    
    public String getName(final ULocale locale, final int nameStyle, final String pluralCount, final boolean[] isChoiceFormat) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayName() {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayName(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDefaultFractionDigits() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDefaultFractionDigits(final CurrencyUsage Usage) {
        throw new RuntimeException("Stub!");
    }
    
    public double getRoundingIncrement() {
        throw new RuntimeException("Stub!");
    }
    
    public double getRoundingIncrement(final CurrencyUsage Usage) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isAvailable(final String code, final Date from, final Date to) {
        throw new RuntimeException("Stub!");
    }
    
    public enum CurrencyUsage
    {
        STANDARD, 
        CASH;
    }
}
