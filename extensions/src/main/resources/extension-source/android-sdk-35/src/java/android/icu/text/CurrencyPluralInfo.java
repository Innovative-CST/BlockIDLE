package android.icu.text;

import android.icu.util.ULocale;
import java.util.Locale;
import java.io.Serializable;

public class CurrencyPluralInfo implements Cloneable, Serializable
{
    public CurrencyPluralInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public CurrencyPluralInfo(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public CurrencyPluralInfo(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static CurrencyPluralInfo getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static CurrencyPluralInfo getInstance(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static CurrencyPluralInfo getInstance(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public PluralRules getPluralRules() {
        throw new RuntimeException("Stub!");
    }
    
    public String getCurrencyPluralPattern(final String pluralCount) {
        throw new RuntimeException("Stub!");
    }
    
    public ULocale getLocale() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPluralRules(final String ruleDescription) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCurrencyPluralPattern(final String pluralCount, final String pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLocale(final ULocale loc) {
        throw new RuntimeException("Stub!");
    }
    
    public Object clone() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object a) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
}
