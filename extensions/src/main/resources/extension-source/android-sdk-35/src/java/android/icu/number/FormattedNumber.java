package android.icu.number;

import android.icu.text.DisplayOptions;
import android.icu.util.MeasureUnit;
import java.math.BigDecimal;
import java.text.AttributedCharacterIterator;
import android.icu.text.ConstrainedFieldPosition;
import android.icu.text.FormattedValue;

public class FormattedNumber implements FormattedValue
{
    FormattedNumber() {
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
    
    public BigDecimal toBigDecimal() {
        throw new RuntimeException("Stub!");
    }
    
    public MeasureUnit getOutputUnit() {
        throw new RuntimeException("Stub!");
    }
    
    public DisplayOptions.NounClass getNounClass() {
        throw new RuntimeException("Stub!");
    }
}
