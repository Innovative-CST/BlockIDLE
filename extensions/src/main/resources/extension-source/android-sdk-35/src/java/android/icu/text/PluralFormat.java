package android.icu.text;

import java.text.ParsePosition;
import java.text.FieldPosition;
import java.util.Locale;
import android.icu.util.ULocale;

public class PluralFormat extends UFormat
{
    public PluralFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public PluralFormat(final ULocale ulocale) {
        throw new RuntimeException("Stub!");
    }
    
    public PluralFormat(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public PluralFormat(final PluralRules rules) {
        throw new RuntimeException("Stub!");
    }
    
    public PluralFormat(final ULocale ulocale, final PluralRules rules) {
        throw new RuntimeException("Stub!");
    }
    
    public PluralFormat(final Locale locale, final PluralRules rules) {
        throw new RuntimeException("Stub!");
    }
    
    public PluralFormat(final ULocale ulocale, final PluralRules.PluralType type) {
        throw new RuntimeException("Stub!");
    }
    
    public PluralFormat(final Locale locale, final PluralRules.PluralType type) {
        throw new RuntimeException("Stub!");
    }
    
    public PluralFormat(final String pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public PluralFormat(final ULocale ulocale, final String pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public PluralFormat(final PluralRules rules, final String pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public PluralFormat(final ULocale ulocale, final PluralRules rules, final String pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public PluralFormat(final ULocale ulocale, final PluralRules.PluralType type, final String pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public void applyPattern(final String pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public String toPattern() {
        throw new RuntimeException("Stub!");
    }
    
    public final String format(final double number) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public StringBuffer format(final Object number, final StringBuffer toAppendTo, final FieldPosition pos) {
        throw new RuntimeException("Stub!");
    }
    
    public Number parse(final String text, final ParsePosition parsePosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Object parseObject(final String source, final ParsePosition pos) {
        throw new RuntimeException("Stub!");
    }
    
    public void setNumberFormat(final NumberFormat format) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object rhs) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean equals(final PluralFormat rhs) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
