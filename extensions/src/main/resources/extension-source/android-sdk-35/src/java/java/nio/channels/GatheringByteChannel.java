package java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;

public interface GatheringByteChannel extends WritableByteChannel {
	long write(final ByteBuffer[] p0, final int p1, final int p2) throws IOException;

	long write(final ByteBuffer[] p0) throws IOException;
}
