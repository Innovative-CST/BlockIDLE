package android.icu.text;

import java.util.Collection;
import java.util.Set;
import android.icu.number.FormattedNumberRange;
import android.icu.number.FormattedNumber;
import java.util.Locale;
import android.icu.util.ULocale;
import java.text.ParseException;
import java.io.Serializable;

public class PluralRules implements Serializable
{
    public static final PluralRules DEFAULT;
    public static final String KEYWORD_FEW = "few";
    public static final String KEYWORD_MANY = "many";
    public static final String KEYWORD_ONE = "one";
    public static final String KEYWORD_OTHER = "other";
    public static final String KEYWORD_TWO = "two";
    public static final String KEYWORD_ZERO = "zero";
    public static final double NO_UNIQUE_VALUE = -0.00123456777;
    
    PluralRules() {
        throw new RuntimeException("Stub!");
    }
    
    public static PluralRules parseDescription(final String description) throws ParseException {
        throw new RuntimeException("Stub!");
    }
    
    public static PluralRules createRules(final String description) {
        throw new RuntimeException("Stub!");
    }
    
    public static PluralRules forLocale(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static PluralRules forLocale(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static PluralRules forLocale(final ULocale locale, final PluralType type) {
        throw new RuntimeException("Stub!");
    }
    
    public static PluralRules forLocale(final Locale locale, final PluralType type) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    public String select(final double number) {
        throw new RuntimeException("Stub!");
    }
    
    public String select(final FormattedNumber number) {
        throw new RuntimeException("Stub!");
    }
    
    public String select(final FormattedNumberRange range) {
        throw new RuntimeException("Stub!");
    }
    
    public Set<String> getKeywords() {
        throw new RuntimeException("Stub!");
    }
    
    public double getUniqueKeywordValue(final String keyword) {
        throw new RuntimeException("Stub!");
    }
    
    public Collection<Double> getAllKeywordValues(final String keyword) {
        throw new RuntimeException("Stub!");
    }
    
    public Collection<Double> getSamples(final String keyword) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object rhs) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean equals(final PluralRules rhs) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        DEFAULT = null;
    }
    
    public enum PluralType
    {
        CARDINAL, 
        ORDINAL;
    }
}
