package java.util.logging;

import java.io.IOException;

public class FileHandler extends StreamHandler {
	public FileHandler() throws IOException, SecurityException {
		throw new RuntimeException("Stub!");
	}

	public FileHandler(final String pattern) throws IOException, SecurityException {
		throw new RuntimeException("Stub!");
	}

	public FileHandler(final String pattern, final boolean append) throws IOException, SecurityException {
		throw new RuntimeException("Stub!");
	}

	public FileHandler(final String pattern, final int limit, final int count) throws IOException, SecurityException {
		throw new RuntimeException("Stub!");
	}

	public FileHandler(final String pattern, final int limit, final int count, final boolean append)
			throws IOException, SecurityException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void publish(final LogRecord record) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void close() throws SecurityException {
		throw new RuntimeException("Stub!");
	}
}
