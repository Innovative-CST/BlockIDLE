package java.util.logging;

public abstract class Formatter {
	protected Formatter() {
		throw new RuntimeException("Stub!");
	}

	public abstract String format(final LogRecord p0);

	public String getHead(final Handler h) {
		throw new RuntimeException("Stub!");
	}

	public String getTail(final Handler h) {
		throw new RuntimeException("Stub!");
	}

	public synchronized String formatMessage(final LogRecord record) {
		throw new RuntimeException("Stub!");
	}
}
