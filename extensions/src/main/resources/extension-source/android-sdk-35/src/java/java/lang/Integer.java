package java.lang;

public final class Integer extends Number implements Comparable<Integer> {
	public static final int BYTES = 4;
	public static final int MAX_VALUE = 2147483647;
	public static final int MIN_VALUE = -2147483648;
	public static final int SIZE = 32;
	public static final Class<Integer> TYPE;

	@Deprecated
	public Integer(final int value) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public Integer(@RecentlyNonNull final String s) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toString(final int i, final int radix) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toUnsignedString(final int i, final int radix) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toHexString(final int i) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toOctalString(final int i) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toBinaryString(final int i) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toString(final int i) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toUnsignedString(final int i) {
		throw new RuntimeException("Stub!");
	}

	public static int parseInt(@RecentlyNonNull final String s, final int radix) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	public static int parseInt(@RecentlyNonNull final CharSequence s, final int beginIndex, final int endIndex,
			final int radix) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	public static int parseInt(@RecentlyNonNull final String s) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	public static int parseUnsignedInt(@RecentlyNonNull final String s, final int radix) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	public static int parseUnsignedInt(@RecentlyNonNull final CharSequence s, final int beginIndex, final int endIndex,
			final int radix) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	public static int parseUnsignedInt(@RecentlyNonNull final String s) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Integer valueOf(@RecentlyNonNull final String s, final int radix) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Integer valueOf(@RecentlyNonNull final String s) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Integer valueOf(final int i) {
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

	public static int hashCode(final int value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public static Integer getInteger(@RecentlyNonNull final String nm) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public static Integer getInteger(@RecentlyNonNull final String nm, final int val) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public static Integer getInteger(@RecentlyNonNull final String nm, @RecentlyNullable final Integer val) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Integer decode(@RecentlyNonNull final String nm) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(@RecentlyNonNull final Integer anotherInteger) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(final int x, final int y) {
		throw new RuntimeException("Stub!");
	}

	public static int compareUnsigned(final int x, final int y) {
		throw new RuntimeException("Stub!");
	}

	public static long toUnsignedLong(final int x) {
		throw new RuntimeException("Stub!");
	}

	public static int divideUnsigned(final int dividend, final int divisor) {
		throw new RuntimeException("Stub!");
	}

	public static int remainderUnsigned(final int dividend, final int divisor) {
		throw new RuntimeException("Stub!");
	}

	public static int highestOneBit(final int i) {
		throw new RuntimeException("Stub!");
	}

	public static int lowestOneBit(final int i) {
		throw new RuntimeException("Stub!");
	}

	public static int numberOfLeadingZeros(final int i) {
		throw new RuntimeException("Stub!");
	}

	public static int numberOfTrailingZeros(final int i) {
		throw new RuntimeException("Stub!");
	}

	public static int bitCount(final int i) {
		throw new RuntimeException("Stub!");
	}

	public static int rotateLeft(final int i, final int distance) {
		throw new RuntimeException("Stub!");
	}

	public static int rotateRight(final int i, final int distance) {
		throw new RuntimeException("Stub!");
	}

	public static int reverse(final int i) {
		throw new RuntimeException("Stub!");
	}

	public static int signum(final int i) {
		throw new RuntimeException("Stub!");
	}

	public static int reverseBytes(final int i) {
		throw new RuntimeException("Stub!");
	}

	public static int sum(final int a, final int b) {
		throw new RuntimeException("Stub!");
	}

	public static int max(final int a, final int b) {
		throw new RuntimeException("Stub!");
	}

	public static int min(final int a, final int b) {
		throw new RuntimeException("Stub!");
	}

	static {
		TYPE = null;
	}
}
