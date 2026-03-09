package android.icu.number;

import android.icu.text.DisplayOptions;
import android.icu.text.NumberingSystem;
import android.icu.text.DecimalFormatSymbols;
import java.math.RoundingMode;
import android.icu.util.MeasureUnit;

public abstract class NumberFormatterSettings<T extends NumberFormatterSettings<?>>
{
    NumberFormatterSettings() {
        throw new RuntimeException("Stub!");
    }
    
    public T notation(final Notation notation) {
        throw new RuntimeException("Stub!");
    }
    
    public T unit(final MeasureUnit unit) {
        throw new RuntimeException("Stub!");
    }
    
    public T perUnit(final MeasureUnit perUnit) {
        throw new RuntimeException("Stub!");
    }
    
    public T precision(final Precision precision) {
        throw new RuntimeException("Stub!");
    }
    
    public T roundingMode(final RoundingMode roundingMode) {
        throw new RuntimeException("Stub!");
    }
    
    public T grouping(final NumberFormatter.GroupingStrategy strategy) {
        throw new RuntimeException("Stub!");
    }
    
    public T integerWidth(final IntegerWidth style) {
        throw new RuntimeException("Stub!");
    }
    
    public T symbols(final DecimalFormatSymbols symbols) {
        throw new RuntimeException("Stub!");
    }
    
    public T symbols(final NumberingSystem ns) {
        throw new RuntimeException("Stub!");
    }
    
    public T unitWidth(final NumberFormatter.UnitWidth style) {
        throw new RuntimeException("Stub!");
    }
    
    public T sign(final NumberFormatter.SignDisplay style) {
        throw new RuntimeException("Stub!");
    }
    
    public T decimal(final NumberFormatter.DecimalSeparatorDisplay style) {
        throw new RuntimeException("Stub!");
    }
    
    public T scale(final Scale scale) {
        throw new RuntimeException("Stub!");
    }
    
    public T usage(final String usage) {
        throw new RuntimeException("Stub!");
    }
    
    public T displayOptions(final DisplayOptions displayOptions) {
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
