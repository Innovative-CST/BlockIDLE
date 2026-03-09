package java.util.logging;

import java.io.UnsupportedEncodingException;

public abstract class Handler {
	protected Handler() {
		throw new RuntimeException("Stub!");
	}

	public abstract void publish(final LogRecord p0);

	public abstract void flush();

	public abstract void close() throws SecurityException;

	public synchronized void setFormatter(final Formatter newFormatter) throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	public Formatter getFormatter() {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setEncoding(final String encoding) throws SecurityException, UnsupportedEncodingException {
		throw new RuntimeException("Stub!");
	}

	public String getEncoding() {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setFilter(final Filter newFilter) throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	public Filter getFilter() {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setErrorManager(final ErrorManager em) {
		throw new RuntimeException("Stub!");
	}

	public ErrorManager getErrorManager() {
		throw new RuntimeException("Stub!");
	}

	protected void reportError(final String msg, final Exception ex, final int code) {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setLevel(final Level newLevel) throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	public Level getLevel() {
		throw new RuntimeException("Stub!");
	}

	public boolean isLoggable(final LogRecord record) {
		throw new RuntimeException("Stub!");
	}
}
