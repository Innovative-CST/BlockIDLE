package java.lang;

public final class Double extends Number implements Comparable<Double> {
	public static final int BYTES = 8;
	public static final int MAX_EXPONENT = 1023;
	public static final double MAX_VALUE = 1.7976931348623157E308;
	public static final int MIN_EXPONENT = -1022;
	public static final double MIN_NORMAL = 2.2250738585072014E-308;
	public static final double MIN_VALUE = 4.9E-324;
	public static final double NEGATIVE_INFINITY = -1.0 / 0.0;
	public static final double NaN = 0.0 / 0.0;
	public static final double POSITIVE_INFINITY = 1.0 / 0.0;
	public static final int PRECISION = 53;
	public static final int SIZE = 64;
	public static final Class<Double> TYPE;

	@Deprecated
	public Double(final double value) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public Double(@RecentlyNonNull final String s) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toString(final double d) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toHexString(final double d) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Double valueOf(@RecentlyNonNull final String s) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Double valueOf(final double d) {
		throw new RuntimeException("Stub!");
	}

	public static double parseDouble(@RecentlyNonNull final String s) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	public static boolean isNaN(final double v) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isInfinite(final double v) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isFinite(final double d) {
		throw new RuntimeException("Stub!");
	}

	public boolean isNaN() {
		throw new RuntimeException("Stub!");
	}

	public boolean isInfinite() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
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

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	public static int hashCode(final double value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	public static long doubleToLongBits(final double value) {
		throw new RuntimeException("Stub!");
	}

	public static native long doubleToRawLongBits(final double p0);

	public static native double longBitsToDouble(final long p0);

	@Override
	public int compareTo(@RecentlyNonNull final Double anotherDouble) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(final double d1, final double d2) {
		throw new RuntimeException("Stub!");
	}

	public static double sum(final double a, final double b) {
		throw new RuntimeException("Stub!");
	}

	public static double max(final double a, final double b) {
		throw new RuntimeException("Stub!");
	}

	public static double min(final double a, final double b) {
		throw new RuntimeException("Stub!");
	}

	static {
		TYPE = null;
	}
}
