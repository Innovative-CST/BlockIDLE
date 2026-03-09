package android.icu.text;

import java.text.AttributedCharacterIterator;
import java.util.Locale;
import android.icu.util.ULocale;

public final class RelativeDateTimeFormatter
{
    RelativeDateTimeFormatter() {
        throw new RuntimeException("Stub!");
    }
    
    public static RelativeDateTimeFormatter getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static RelativeDateTimeFormatter getInstance(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static RelativeDateTimeFormatter getInstance(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static RelativeDateTimeFormatter getInstance(final ULocale locale, final NumberFormat nf) {
        throw new RuntimeException("Stub!");
    }
    
    public static RelativeDateTimeFormatter getInstance(final ULocale locale, final NumberFormat nf, final Style style, final DisplayContext capitalizationContext) {
        throw new RuntimeException("Stub!");
    }
    
    public static RelativeDateTimeFormatter getInstance(final Locale locale, final NumberFormat nf) {
        throw new RuntimeException("Stub!");
    }
    
    public String format(final double quantity, final Direction direction, final RelativeUnit unit) {
        throw new RuntimeException("Stub!");
    }
    
    public FormattedRelativeDateTime formatToValue(final double quantity, final Direction direction, final RelativeUnit unit) {
        throw new RuntimeException("Stub!");
    }
    
    public String formatNumeric(final double offset, final RelativeDateTimeUnit unit) {
        throw new RuntimeException("Stub!");
    }
    
    public FormattedRelativeDateTime formatNumericToValue(final double offset, final RelativeDateTimeUnit unit) {
        throw new RuntimeException("Stub!");
    }
    
    public String format(final Direction direction, final AbsoluteUnit unit) {
        throw new RuntimeException("Stub!");
    }
    
    public FormattedRelativeDateTime formatToValue(final Direction direction, final AbsoluteUnit unit) {
        throw new RuntimeException("Stub!");
    }
    
    public String format(final double offset, final RelativeDateTimeUnit unit) {
        throw new RuntimeException("Stub!");
    }
    
    public FormattedRelativeDateTime formatToValue(final double offset, final RelativeDateTimeUnit unit) {
        throw new RuntimeException("Stub!");
    }
    
    public String combineDateAndTime(final String relativeDateString, final String timeString) {
        throw new RuntimeException("Stub!");
    }
    
    public NumberFormat getNumberFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public DisplayContext getCapitalizationContext() {
        throw new RuntimeException("Stub!");
    }
    
    public Style getFormatStyle() {
        throw new RuntimeException("Stub!");
    }
    
    public enum AbsoluteUnit
    {
        SUNDAY, 
        MONDAY, 
        TUESDAY, 
        WEDNESDAY, 
        THURSDAY, 
        FRIDAY, 
        SATURDAY, 
        DAY, 
        WEEK, 
        MONTH, 
        YEAR, 
        NOW, 
        QUARTER, 
        HOUR, 
        MINUTE;
    }
    
    public enum Direction
    {
        LAST_2, 
        LAST, 
        THIS, 
        NEXT, 
        NEXT_2, 
        PLAIN;
    }
    
    public static class FormattedRelativeDateTime implements FormattedValue
    {
        FormattedRelativeDateTime() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int length() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public char charAt(final int index) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public CharSequence subSequence(final int start, final int end) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public <A extends Appendable> A appendTo(final A appendable) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean nextPosition(final ConstrainedFieldPosition cfpos) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public AttributedCharacterIterator toCharacterIterator() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public enum RelativeDateTimeUnit
    {
        YEAR, 
        QUARTER, 
        MONTH, 
        WEEK, 
        DAY, 
        HOUR, 
        MINUTE, 
        SECOND, 
        SUNDAY, 
        MONDAY, 
        TUESDAY, 
        WEDNESDAY, 
        THURSDAY, 
        FRIDAY, 
        SATURDAY;
    }
    
    public enum RelativeUnit
    {
        SECONDS, 
        MINUTES, 
        HOURS, 
        DAYS, 
        WEEKS, 
        MONTHS, 
        YEARS;
    }
    
    public enum Style
    {
        LONG, 
        SHORT, 
        NARROW;
    }
}
