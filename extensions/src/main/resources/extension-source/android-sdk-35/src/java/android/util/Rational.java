package android.util;

public final class Rational extends Number implements Comparable<Rational>
{
    public static final Rational NEGATIVE_INFINITY;
    public static final Rational NaN;
    public static final Rational POSITIVE_INFINITY;
    public static final Rational ZERO;
    
    public Rational(final int numerator, final int denominator) {
        throw new RuntimeException("Stub!");
    }
    
    public int getNumerator() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDenominator() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isNaN() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isInfinite() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFinite() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isZero() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public double doubleValue() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public float floatValue() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int intValue() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long longValue() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public short shortValue() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int compareTo(final Rational another) {
        throw new RuntimeException("Stub!");
    }
    
    public static Rational parseRational(final String string) throws NumberFormatException {
        throw new RuntimeException("Stub!");
    }
    
    static {
        NEGATIVE_INFINITY = null;
        NaN = null;
        POSITIVE_INFINITY = null;
        ZERO = null;
    }
}
