package android.icu.math;

import java.math.BigInteger;
import java.io.Serializable;

public class BigDecimal extends Number implements Serializable, Comparable<BigDecimal>
{
    public static final BigDecimal ONE;
    public static final int ROUND_CEILING = 2;
    public static final int ROUND_DOWN = 1;
    public static final int ROUND_FLOOR = 3;
    public static final int ROUND_HALF_DOWN = 5;
    public static final int ROUND_HALF_EVEN = 6;
    public static final int ROUND_HALF_UP = 4;
    public static final int ROUND_UNNECESSARY = 7;
    public static final int ROUND_UP = 0;
    public static final BigDecimal TEN;
    public static final BigDecimal ZERO;
    
    public BigDecimal(final java.math.BigDecimal bd) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal(final BigInteger bi) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal(final BigInteger bi, final int scale) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal(final char[] inchars) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal(final char[] inchars, final int offset, final int length) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal(final double num) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal(final int num) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal(final long num) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal(final String string) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal abs() {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal abs(final MathContext set) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal add(final BigDecimal rhs) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal add(final BigDecimal rhs, final MathContext set) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int compareTo(final BigDecimal rhs) {
        throw new RuntimeException("Stub!");
    }
    
    public int compareTo(final BigDecimal rhs, final MathContext set) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal divide(final BigDecimal rhs) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal divide(final BigDecimal rhs, final int round) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal divide(final BigDecimal rhs, final int scale, final int round) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal divide(final BigDecimal rhs, final MathContext set) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal divideInteger(final BigDecimal rhs) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal divideInteger(final BigDecimal rhs, final MathContext set) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal max(final BigDecimal rhs) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal max(final BigDecimal rhs, final MathContext set) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal min(final BigDecimal rhs) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal min(final BigDecimal rhs, final MathContext set) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal multiply(final BigDecimal rhs) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal multiply(final BigDecimal rhs, final MathContext set) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal negate() {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal negate(final MathContext set) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal plus() {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal plus(final MathContext set) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal pow(final BigDecimal rhs) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal pow(final BigDecimal rhs, final MathContext set) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal remainder(final BigDecimal rhs) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal remainder(final BigDecimal rhs, final MathContext set) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal subtract(final BigDecimal rhs) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal subtract(final BigDecimal rhs, final MathContext set) {
        throw new RuntimeException("Stub!");
    }
    
    public byte byteValueExact() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public double doubleValue() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public float floatValue() {
        throw new RuntimeException("Stub!");
    }
    
    public String format(final int before, final int after) {
        throw new RuntimeException("Stub!");
    }
    
    public String format(final int before, final int after, final int explaces, final int exdigits, final int exformint, final int exround) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int intValue() {
        throw new RuntimeException("Stub!");
    }
    
    public int intValueExact() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long longValue() {
        throw new RuntimeException("Stub!");
    }
    
    public long longValueExact() {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal movePointLeft(final int n) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal movePointRight(final int n) {
        throw new RuntimeException("Stub!");
    }
    
    public int scale() {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal setScale(final int scale) {
        throw new RuntimeException("Stub!");
    }
    
    public BigDecimal setScale(final int scale, final int round) {
        throw new RuntimeException("Stub!");
    }
    
    public short shortValueExact() {
        throw new RuntimeException("Stub!");
    }
    
    public int signum() {
        throw new RuntimeException("Stub!");
    }
    
    public java.math.BigDecimal toBigDecimal() {
        throw new RuntimeException("Stub!");
    }
    
    public BigInteger toBigInteger() {
        throw new RuntimeException("Stub!");
    }
    
    public BigInteger toBigIntegerExact() {
        throw new RuntimeException("Stub!");
    }
    
    public char[] toCharArray() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public BigInteger unscaledValue() {
        throw new RuntimeException("Stub!");
    }
    
    public static BigDecimal valueOf(final double dub) {
        throw new RuntimeException("Stub!");
    }
    
    public static BigDecimal valueOf(final long lint) {
        throw new RuntimeException("Stub!");
    }
    
    public static BigDecimal valueOf(final long lint, final int scale) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        ONE = null;
        TEN = null;
        ZERO = null;
    }
}
