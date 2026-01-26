package java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;

public interface ReadableByteChannel extends Channel {
	int read(final ByteBuffer p0) throws IOException;
}
