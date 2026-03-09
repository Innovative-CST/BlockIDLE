package java.io;

public class WriteAbortedException extends ObjectStreamException {
	@Deprecated
	public Exception detail;

	public WriteAbortedException(final String s, final Exception ex) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String getMessage() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Throwable getCause() {
		throw new RuntimeException("Stub!");
	}
}
