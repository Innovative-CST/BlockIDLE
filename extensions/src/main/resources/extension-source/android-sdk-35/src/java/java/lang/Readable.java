package java.lang;

import java.io.IOException;
import java.nio.CharBuffer;

public interface Readable {
	int read(final CharBuffer p0) throws IOException;
}
