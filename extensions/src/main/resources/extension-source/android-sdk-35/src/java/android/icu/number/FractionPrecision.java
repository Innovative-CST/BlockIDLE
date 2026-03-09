package android.icu.number;

public abstract class FractionPrecision extends Precision
{
    FractionPrecision() {
        throw new RuntimeException("Stub!");
    }
    
    public Precision withSignificantDigits(final int minSignificantDigits, final int maxSignificantDigits, final NumberFormatter.RoundingPriority priority) {
        throw new RuntimeException("Stub!");
    }
    
    public Precision withMinDigits(final int minSignificantDigits) {
        throw new RuntimeException("Stub!");
    }
    
    public Precision withMaxDigits(final int maxSignificantDigits) {
        throw new RuntimeException("Stub!");
    }
}
