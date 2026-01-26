package java.lang;

public final class Float extends Number implements Comparable<Float> {
	public static final int BYTES = 4;
	public static final int MAX_EXPONENT = 127;
	public static final float MAX_VALUE = 3.4028235E38f;
	public static final int MIN_EXPONENT = -126;
	public static final float MIN_NORMAL = 1.17549435E-38f;
	public static final float MIN_VALUE = 1.4E-45f;
	public static final float NEGATIVE_INFINITY = -1.0f / 0.0f;
	public static final float NaN = 0.0f / 0.0f;
	public static final float POSITIVE_INFINITY = 1.0f / 0.0f;
	public static final int PRECISION = 24;
	public static final int SIZE = 32;
	public static final Class<Float> TYPE;

	@Deprecated
	public Float(final float value) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public Float(final double value) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public Float(@RecentlyNonNull final String s) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toString(final float f) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toHexString(final float f) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Float valueOf(@RecentlyNonNull final String s) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Float valueOf(final float f) {
		throw new RuntimeException("Stub!");
	}

	public static float parseFloat(@RecentlyNonNull final String s) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	public static boolean isNaN(final float v) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isInfinite(final float v) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isFinite(final float f) {
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

	public static int hashCode(final float value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	public static int floatToIntBits(final float value) {
		throw new RuntimeException("Stub!");
	}

	public static native int floatToRawIntBits(final float p0);

	public static native float intBitsToFloat(final int p0);

	@Override
	public int compareTo(@RecentlyNonNull final Float anotherFloat) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(final float f1, final float f2) {
		throw new RuntimeException("Stub!");
	}

	public static float sum(final float a, final float b) {
		throw new RuntimeException("Stub!");
	}

	public static float max(final float a, final float b) {
		throw new RuntimeException("Stub!");
	}

	public static float min(final float a, final float b) {
		throw new RuntimeException("Stub!");
	}

	static {
		TYPE = null;
	}
}
