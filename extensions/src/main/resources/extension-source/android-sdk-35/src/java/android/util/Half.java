package android.util;

public final class Half extends Number implements Comparable<Half>
{
    public static final short EPSILON = 5120;
    public static final short LOWEST_VALUE = -1025;
    public static final int MAX_EXPONENT = 15;
    public static final short MAX_VALUE = 31743;
    public static final int MIN_EXPONENT = -14;
    public static final short MIN_NORMAL = 1024;
    public static final short MIN_VALUE = 1;
    public static final short NEGATIVE_INFINITY = -1024;
    public static final short NEGATIVE_ZERO = Short.MIN_VALUE;
    public static final short NaN = 32256;
    public static final short POSITIVE_INFINITY = 31744;
    public static final short POSITIVE_ZERO = 0;
    public static final int SIZE = 16;
    
    public Half(final short value) {
        throw new RuntimeException("Stub!");
    }
    
    public Half(final float value) {
        throw new RuntimeException("Stub!");
    }
    
    public Half(final double value) {
        throw new RuntimeException("Stub!");
    }
    
    public Half(@NonNull final String value) throws NumberFormatException {
        throw new RuntimeException("Stub!");
    }
    
    public short halfValue() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public byte byteValue() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public short shortValue() {
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
    public float floatValue() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public double doubleValue() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isNaN() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int compareTo(@NonNull final Half h) {
        throw new RuntimeException("Stub!");
    }
    
    public static int hashCode(final short h) {
        throw new RuntimeException("Stub!");
    }
    
    public static int compare(final short x, final short y) {
        throw new RuntimeException("Stub!");
    }
    
    public static short halfToShortBits(final short h) {
        throw new RuntimeException("Stub!");
    }
    
    public static int halfToIntBits(final short h) {
        throw new RuntimeException("Stub!");
    }
    
    public static int halfToRawIntBits(final short h) {
        throw new RuntimeException("Stub!");
    }
    
    public static short intBitsToHalf(final int bits) {
        throw new RuntimeException("Stub!");
    }
    
    public static short copySign(final short magnitude, final short sign) {
        throw new RuntimeException("Stub!");
    }
    
    public static short abs(final short h) {
        throw new RuntimeException("Stub!");
    }
    
    public static short round(final short h) {
        throw new RuntimeException("Stub!");
    }
    
    public static short ceil(final short h) {
        throw new RuntimeException("Stub!");
    }
    
    public static short floor(final short h) {
        throw new RuntimeException("Stub!");
    }
    
    public static short trunc(final short h) {
        throw new RuntimeException("Stub!");
    }
    
    public static short min(final short x, final short y) {
        throw new RuntimeException("Stub!");
    }
    
    public static short max(final short x, final short y) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean less(final short x, final short y) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean lessEquals(final short x, final short y) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean greater(final short x, final short y) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean greaterEquals(final short x, final short y) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean equals(final short x, final short y) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getSign(final short h) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getExponent(final short h) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getSignificand(final short h) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isInfinite(final short h) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isNaN(final short h) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isNormalized(final short h) {
        throw new RuntimeException("Stub!");
    }
    
    public static float toFloat(final short h) {
        throw new RuntimeException("Stub!");
    }
    
    public static short toHalf(final float f) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Half valueOf(final short h) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Half valueOf(final float f) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Half valueOf(@NonNull final String s) {
        throw new RuntimeException("Stub!");
    }
    
    public static short parseHalf(@NonNull final String s) throws NumberFormatException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static String toString(final short h) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static String toHexString(final short h) {
        throw new RuntimeException("Stub!");
    }
}
