package java.util.logging;

import java.io.IOException;

public class SocketHandler extends StreamHandler {
	public SocketHandler() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public SocketHandler(final String host, final int port) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void close() throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void publish(final LogRecord record) {
		throw new RuntimeException("Stub!");
	}
}
