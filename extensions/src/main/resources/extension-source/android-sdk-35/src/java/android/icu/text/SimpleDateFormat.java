package android.icu.text;

import java.text.AttributedCharacterIterator;
import java.text.ParsePosition;
import java.text.FieldPosition;
import android.icu.util.Calendar;
import java.util.Date;
import android.icu.util.ULocale;
import java.util.Locale;

public class SimpleDateFormat extends DateFormat
{
    public SimpleDateFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public SimpleDateFormat(final String pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public SimpleDateFormat(final String pattern, final Locale loc) {
        throw new RuntimeException("Stub!");
    }
    
    public SimpleDateFormat(final String pattern, final ULocale loc) {
        throw new RuntimeException("Stub!");
    }
    
    public SimpleDateFormat(final String pattern, final String override, final ULocale loc) {
        throw new RuntimeException("Stub!");
    }
    
    public SimpleDateFormat(final String pattern, final DateFormatSymbols formatData) {
        throw new RuntimeException("Stub!");
    }
    
    public void set2DigitYearStart(final Date startDate) {
        throw new RuntimeException("Stub!");
    }
    
    public Date get2DigitYearStart() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setContext(final DisplayContext context) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public StringBuffer format(final Calendar cal, final StringBuffer toAppendTo, final FieldPosition pos) {
        throw new RuntimeException("Stub!");
    }
    
    protected Field patternCharToDateFormatField(final char ch) {
        throw new RuntimeException("Stub!");
    }
    
    protected String subFormat(final char ch, final int count, final int beginOffset, final FieldPosition pos, final DateFormatSymbols fmtData, final Calendar cal) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setNumberFormat(final NumberFormat newNumberFormat) {
        throw new RuntimeException("Stub!");
    }
    
    protected String zeroPaddingNumber(final long value, final int minDigits, final int maxDigits) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void parse(final String text, final Calendar cal, final ParsePosition parsePos) {
        throw new RuntimeException("Stub!");
    }
    
    protected int matchString(final String text, final int start, final int field, final String[] data, final Calendar cal) {
        throw new RuntimeException("Stub!");
    }
    
    protected int matchQuarterString(final String text, final int start, final int field, final String[] data, final Calendar cal) {
        throw new RuntimeException("Stub!");
    }
    
    protected int subParse(final String text, final int start, final char ch, final int count, final boolean obeyCount, final boolean allowNegative, final boolean[] ambiguousYear, final Calendar cal) {
        throw new RuntimeException("Stub!");
    }
    
    public String toPattern() {
        throw new RuntimeException("Stub!");
    }
    
    public String toLocalizedPattern() {
        throw new RuntimeException("Stub!");
    }
    
    public void applyPattern(final String pat) {
        throw new RuntimeException("Stub!");
    }
    
    public void applyLocalizedPattern(final String pat) {
        throw new RuntimeException("Stub!");
    }
    
    public DateFormatSymbols getDateFormatSymbols() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDateFormatSymbols(final DateFormatSymbols newFormatSymbols) {
        throw new RuntimeException("Stub!");
    }
    
    protected DateFormatSymbols getSymbols() {
        throw new RuntimeException("Stub!");
    }
    
    public TimeZoneFormat getTimeZoneFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTimeZoneFormat(final TimeZoneFormat tzfmt) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
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
    
    @Override
    public AttributedCharacterIterator formatToCharacterIterator(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    public void setNumberFormat(final String fields, final NumberFormat overrideNF) {
        throw new RuntimeException("Stub!");
    }
    
    public NumberFormat getNumberFormat(final char field) {
        throw new RuntimeException("Stub!");
    }
}
