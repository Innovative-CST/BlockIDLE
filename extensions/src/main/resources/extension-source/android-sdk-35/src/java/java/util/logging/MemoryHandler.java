package java.util.logging;

public class MemoryHandler extends Handler {
	public MemoryHandler() {
		throw new RuntimeException("Stub!");
	}

	public MemoryHandler(final Handler target, final int size, final Level pushLevel) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void publish(final LogRecord record) {
		throw new RuntimeException("Stub!");
	}

	public synchronized void push() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void flush() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setPushLevel(final Level newLevel) throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	public Level getPushLevel() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isLoggable(final LogRecord record) {
		throw new RuntimeException("Stub!");
	}
}
