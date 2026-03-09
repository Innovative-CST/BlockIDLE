package android.icu.text;

import java.text.AttributedCharacterIterator;
import android.icu.util.TimeZone;
import java.text.ParsePosition;
import android.icu.util.Calendar;
import android.icu.util.DateInterval;
import java.text.FieldPosition;
import android.icu.util.ULocale;
import java.util.Locale;

public class DateIntervalFormat extends UFormat
{
    DateIntervalFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateIntervalFormat getInstance(final String skeleton) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateIntervalFormat getInstance(final String skeleton, final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateIntervalFormat getInstance(final String skeleton, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateIntervalFormat getInstance(final String skeleton, final DateIntervalInfo dtitvinf) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateIntervalFormat getInstance(final String skeleton, final Locale locale, final DateIntervalInfo dtitvinf) {
        throw new RuntimeException("Stub!");
    }
    
    public static final DateIntervalFormat getInstance(final String skeleton, final ULocale locale, final DateIntervalInfo dtitvinf) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized Object clone() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final StringBuffer format(final Object obj, final StringBuffer appendTo, final FieldPosition fieldPosition) {
        throw new RuntimeException("Stub!");
    }
    
    public final StringBuffer format(final DateInterval dtInterval, final StringBuffer appendTo, final FieldPosition fieldPosition) {
        throw new RuntimeException("Stub!");
    }
    
    public FormattedDateInterval formatToValue(final DateInterval dtInterval) {
        throw new RuntimeException("Stub!");
    }
    
    public final StringBuffer format(final Calendar fromCalendar, final Calendar toCalendar, final StringBuffer appendTo, final FieldPosition pos) {
        throw new RuntimeException("Stub!");
    }
    
    public FormattedDateInterval formatToValue(final Calendar fromCalendar, final Calendar toCalendar) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public Object parseObject(final String source, final ParsePosition parse_pos) {
        throw new RuntimeException("Stub!");
    }
    
    public DateIntervalInfo getDateIntervalInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDateIntervalInfo(final DateIntervalInfo newItvPattern) {
        throw new RuntimeException("Stub!");
    }
    
    public TimeZone getTimeZone() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTimeZone(final TimeZone zone) {
        throw new RuntimeException("Stub!");
    }
    
    public void setContext(final DisplayContext context) {
        throw new RuntimeException("Stub!");
    }
    
    public DisplayContext getContext(final DisplayContext.Type type) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized DateFormat getDateFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class FormattedDateInterval implements FormattedValue
    {
        FormattedDateInterval() {
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
}
