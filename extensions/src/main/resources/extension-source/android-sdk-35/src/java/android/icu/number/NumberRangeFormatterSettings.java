package android.icu.number;

public abstract class NumberRangeFormatterSettings<T extends NumberRangeFormatterSettings<?>>
{
    NumberRangeFormatterSettings() {
        throw new RuntimeException("Stub!");
    }
    
    public T numberFormatterBoth(final UnlocalizedNumberFormatter formatter) {
        throw new RuntimeException("Stub!");
    }
    
    public T numberFormatterFirst(final UnlocalizedNumberFormatter formatterFirst) {
        throw new RuntimeException("Stub!");
    }
    
    public T numberFormatterSecond(final UnlocalizedNumberFormatter formatterSecond) {
        throw new RuntimeException("Stub!");
    }
    
    public T collapse(final NumberRangeFormatter.RangeCollapse collapse) {
        throw new RuntimeException("Stub!");
    }
    
    public T identityFallback(final NumberRangeFormatter.RangeIdentityFallback identityFallback) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object other) {
        throw new RuntimeException("Stub!");
    }
}
