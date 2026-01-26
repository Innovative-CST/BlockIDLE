package java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;

public interface WritableByteChannel extends Channel {
	int write(final ByteBuffer p0) throws IOException;
}
