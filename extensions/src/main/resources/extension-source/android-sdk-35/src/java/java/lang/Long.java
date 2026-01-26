package java.lang;

public final class Long extends Number implements Comparable<Long> {
	public static final int BYTES = 8;
	public static final long MAX_VALUE = 9223372036854775807L;
	public static final long MIN_VALUE = -9223372036854775808L;
	public static final int SIZE = 64;
	public static final Class<Long> TYPE;

	@Deprecated
	public Long(final long value) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public Long(@RecentlyNonNull final String s) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toString(final long i, final int radix) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toUnsignedString(final long i, final int radix) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toHexString(final long i) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toOctalString(final long i) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toBinaryString(final long i) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toString(final long i) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toUnsignedString(final long i) {
		throw new RuntimeException("Stub!");
	}

	public static long parseLong(@RecentlyNonNull final String s, final int radix) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	public static long parseLong(@RecentlyNonNull final CharSequence s, final int beginIndex, final int endIndex,
			final int radix) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	public static long parseLong(@RecentlyNonNull final String s) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	public static long parseUnsignedLong(@RecentlyNonNull final String s, final int radix)
			throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	public static long parseUnsignedLong(@RecentlyNonNull final CharSequence s, final int beginIndex,
			final int endIndex, final int radix) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	public static long parseUnsignedLong(@RecentlyNonNull final String s) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Long valueOf(@RecentlyNonNull final String s, final int radix) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Long valueOf(@RecentlyNonNull final String s) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Long valueOf(final long l) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Long decode(@RecentlyNonNull final String nm) throws NumberFormatException {
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

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	public static int hashCode(final long value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public static Long getLong(@RecentlyNonNull final String nm) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public static Long getLong(@RecentlyNonNull final String nm, final long val) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public static Long getLong(@RecentlyNonNull final String nm, @RecentlyNullable final Long val) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(@RecentlyNonNull final Long anotherLong) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(final long x, final long y) {
		throw new RuntimeException("Stub!");
	}

	public static int compareUnsigned(final long x, final long y) {
		throw new RuntimeException("Stub!");
	}

	public static long divideUnsigned(final long dividend, final long divisor) {
		throw new RuntimeException("Stub!");
	}

	public static long remainderUnsigned(final long dividend, final long divisor) {
		throw new RuntimeException("Stub!");
	}

	public static long highestOneBit(final long i) {
		throw new RuntimeException("Stub!");
	}

	public static long lowestOneBit(final long i) {
		throw new RuntimeException("Stub!");
	}

	public static int numberOfLeadingZeros(final long i) {
		throw new RuntimeException("Stub!");
	}

	public static int numberOfTrailingZeros(final long i) {
		throw new RuntimeException("Stub!");
	}

	public static int bitCount(final long i) {
		throw new RuntimeException("Stub!");
	}

	public static long rotateLeft(final long i, final int distance) {
		throw new RuntimeException("Stub!");
	}

	public static long rotateRight(final long i, final int distance) {
		throw new RuntimeException("Stub!");
	}

	public static long reverse(final long i) {
		throw new RuntimeException("Stub!");
	}

	public static int signum(final long i) {
		throw new RuntimeException("Stub!");
	}

	public static long reverseBytes(final long i) {
		throw new RuntimeException("Stub!");
	}

	public static long sum(final long a, final long b) {
		throw new RuntimeException("Stub!");
	}

	public static long max(final long a, final long b) {
		throw new RuntimeException("Stub!");
	}

	public static long min(final long a, final long b) {
		throw new RuntimeException("Stub!");
	}

	static {
		TYPE = null;
	}
}
