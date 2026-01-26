package java.io;

public class UncheckedIOException extends RuntimeException {
	public UncheckedIOException(final String message, final IOException cause) {
		throw new RuntimeException("Stub!");
	}

	public UncheckedIOException(final IOException cause) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public IOException getCause() {
		throw new RuntimeException("Stub!");
	}
}
