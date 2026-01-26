package java.util.logging;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class StreamHandler extends Handler {
	public StreamHandler() {
		throw new RuntimeException("Stub!");
	}

	public StreamHandler(final OutputStream out, final Formatter formatter) {
		throw new RuntimeException("Stub!");
	}

	protected synchronized void setOutputStream(final OutputStream out) throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void setEncoding(final String encoding) throws SecurityException, UnsupportedEncodingException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void publish(final LogRecord record) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isLoggable(final LogRecord record) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void flush() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void close() throws SecurityException {
		throw new RuntimeException("Stub!");
	}
}
