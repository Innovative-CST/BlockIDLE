package java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;

public interface ScatteringByteChannel extends ReadableByteChannel {
	long read(final ByteBuffer[] p0, final int p1, final int p2) throws IOException;

	long read(final ByteBuffer[] p0) throws IOException;
}
