package java.lang;

public final class Short extends Number implements Comparable<Short> {
	public static final int BYTES = 2;
	public static final short MAX_VALUE = 32767;
	public static final short MIN_VALUE = -32768;
	public static final int SIZE = 16;
	public static final Class<Short> TYPE;

	@Deprecated
	public Short(final short value) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public Short(final String s) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	public static String toString(final short s) {
		throw new RuntimeException("Stub!");
	}

	public static short parseShort(final String s, final int radix) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	public static short parseShort(final String s) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	public static Short valueOf(final String s, final int radix) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	public static Short valueOf(final String s) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	public static Short valueOf(final short s) {
		throw new RuntimeException("Stub!");
	}

	public static Short decode(final String nm) throws NumberFormatException {
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
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	public static int hashCode(final short value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(final Short anotherShort) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(final short x, final short y) {
		throw new RuntimeException("Stub!");
	}

	public static int compareUnsigned(final short x, final short y) {
		throw new RuntimeException("Stub!");
	}

	public static short reverseBytes(final short i) {
		throw new RuntimeException("Stub!");
	}

	public static int toUnsignedInt(final short x) {
		throw new RuntimeException("Stub!");
	}

	public static long toUnsignedLong(final short x) {
		throw new RuntimeException("Stub!");
	}

	static {
		TYPE = null;
	}
}
