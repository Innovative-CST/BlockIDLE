package android.icu.number;

import android.icu.util.ULocale;
import java.util.Locale;

public final class NumberFormatter
{
    NumberFormatter() {
        throw new RuntimeException("Stub!");
    }
    
    public static UnlocalizedNumberFormatter with() {
        throw new RuntimeException("Stub!");
    }
    
    public static LocalizedNumberFormatter withLocale(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static LocalizedNumberFormatter withLocale(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public enum DecimalSeparatorDisplay
    {
        AUTO, 
        ALWAYS;
    }
    
    public enum GroupingStrategy
    {
        OFF, 
        MIN2, 
        AUTO, 
        ON_ALIGNED, 
        THOUSANDS;
    }
    
    public enum RoundingPriority
    {
        RELAXED, 
        STRICT;
    }
    
    public enum SignDisplay
    {
        AUTO, 
        ALWAYS, 
        NEVER, 
        ACCOUNTING, 
        ACCOUNTING_ALWAYS, 
        EXCEPT_ZERO, 
        ACCOUNTING_EXCEPT_ZERO, 
        NEGATIVE, 
        ACCOUNTING_NEGATIVE;
    }
    
    public enum TrailingZeroDisplay
    {
        AUTO, 
        HIDE_IF_WHOLE;
    }
    
    public enum UnitWidth
    {
        NARROW, 
        SHORT, 
        FULL_NAME, 
        ISO_CODE, 
        FORMAL, 
        VARIANT, 
        HIDDEN;
    }
}
