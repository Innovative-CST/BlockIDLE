package java.nio.file;

import java.io.IOException;
import java.util.ConcurrentModificationException;

public final class DirectoryIteratorException extends ConcurrentModificationException {
	public DirectoryIteratorException(final IOException cause) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public IOException getCause() {
		throw new RuntimeException("Stub!");
	}
}
