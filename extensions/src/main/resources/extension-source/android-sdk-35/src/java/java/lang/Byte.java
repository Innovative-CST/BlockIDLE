package java.lang;

public final class Byte extends Number implements Comparable<Byte> {
	public static final int BYTES = 1;
	public static final byte MAX_VALUE = 127;
	public static final byte MIN_VALUE = -128;
	public static final int SIZE = 8;
	public static final Class<Byte> TYPE;

	@Deprecated
	public Byte(final byte value) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public Byte(@RecentlyNonNull final String s) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toString(final byte b) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Byte valueOf(final byte b) {
		throw new RuntimeException("Stub!");
	}

	public static byte parseByte(@RecentlyNonNull final String s, final int radix) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	public static byte parseByte(@RecentlyNonNull final String s) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Byte valueOf(@RecentlyNonNull final String s, final int radix) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Byte valueOf(@RecentlyNonNull final String s) throws NumberFormatException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Byte decode(@RecentlyNonNull final String nm) throws NumberFormatException {
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

	public static int hashCode(final byte value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(@RecentlyNonNull final Byte anotherByte) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(final byte x, final byte y) {
		throw new RuntimeException("Stub!");
	}

	public static int compareUnsigned(final byte x, final byte y) {
		throw new RuntimeException("Stub!");
	}

	public static int toUnsignedInt(final byte x) {
		throw new RuntimeException("Stub!");
	}

	public static long toUnsignedLong(final byte x) {
		throw new RuntimeException("Stub!");
	}

	static {
		TYPE = null;
	}
}
