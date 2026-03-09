package java.nio;

public final class ByteOrder {
	public static final ByteOrder BIG_ENDIAN;
	public static final ByteOrder LITTLE_ENDIAN;

	ByteOrder() {
		throw new RuntimeException("Stub!");
	}

	public static ByteOrder nativeOrder() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	static {
		BIG_ENDIAN = null;
		LITTLE_ENDIAN = null;
	}
}
