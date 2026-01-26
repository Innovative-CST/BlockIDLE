package android.icu.text;

import java.text.AttributedCharacterIterator;
import java.util.Collection;
import java.util.Locale;
import android.icu.util.ULocale;

public final class ListFormatter
{
    ListFormatter() {
        throw new RuntimeException("Stub!");
    }
    
    public static ListFormatter getInstance(final ULocale locale, final Type type, final Width width) {
        throw new RuntimeException("Stub!");
    }
    
    public static ListFormatter getInstance(final Locale locale, final Type type, final Width width) {
        throw new RuntimeException("Stub!");
    }
    
    public static ListFormatter getInstance(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static ListFormatter getInstance(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static ListFormatter getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public String format(final Object... items) {
        throw new RuntimeException("Stub!");
    }
    
    public String format(final Collection<?> items) {
        throw new RuntimeException("Stub!");
    }
    
    public FormattedList formatToValue(final Object... items) {
        throw new RuntimeException("Stub!");
    }
    
    public FormattedList formatToValue(final Collection<?> items) {
        throw new RuntimeException("Stub!");
    }
    
    public String getPatternForNumItems(final int count) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class FormattedList implements FormattedValue
    {
        FormattedList() {
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
    
    public enum Type
    {
        AND, 
        OR, 
        UNITS;
    }
    
    public enum Width
    {
        WIDE, 
        SHORT, 
        NARROW;
    }
}
