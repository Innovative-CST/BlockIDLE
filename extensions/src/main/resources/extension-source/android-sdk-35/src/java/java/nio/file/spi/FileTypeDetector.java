package java.nio.file.spi;

import java.io.IOException;
import java.nio.file.Path;

public abstract class FileTypeDetector {
	protected FileTypeDetector() {
		throw new RuntimeException("Stub!");
	}

	public abstract String probeContentType(final Path p0) throws IOException;
}
