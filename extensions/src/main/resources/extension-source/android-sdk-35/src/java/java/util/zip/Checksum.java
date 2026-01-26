package java.util.zip;

import java.nio.ByteBuffer;

public interface Checksum {
	void update(final int p0);

	default void update(final byte[] b) {
		throw new RuntimeException("Stub!");
	}

	void update(final byte[] p0, final int p1, final int p2);

	default void update(final ByteBuffer buffer) {
		throw new RuntimeException("Stub!");
	}

	long getValue();

	void reset();
}
