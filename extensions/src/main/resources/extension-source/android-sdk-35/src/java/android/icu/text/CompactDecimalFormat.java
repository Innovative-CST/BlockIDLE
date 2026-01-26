package android.icu.text;

import android.icu.util.CurrencyAmount;
import java.text.ParsePosition;
import java.util.Locale;
import android.icu.util.ULocale;

public class CompactDecimalFormat extends DecimalFormat
{
    CompactDecimalFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public static CompactDecimalFormat getInstance(final ULocale locale, final CompactStyle style) {
        throw new RuntimeException("Stub!");
    }
    
    public static CompactDecimalFormat getInstance(final Locale locale, final CompactStyle style) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Number parse(final String text, final ParsePosition parsePosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CurrencyAmount parseCurrency(final CharSequence text, final ParsePosition parsePosition) {
        throw new RuntimeException("Stub!");
    }
    
    public enum CompactStyle
    {
        SHORT, 
        LONG;
    }
}
