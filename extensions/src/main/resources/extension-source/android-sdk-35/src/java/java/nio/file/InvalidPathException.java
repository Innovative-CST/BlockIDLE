package java.nio.file;

public class InvalidPathException extends IllegalArgumentException {
	public InvalidPathException(final String input, final String reason, final int index) {
		throw new RuntimeException("Stub!");
	}

	public InvalidPathException(final String input, final String reason) {
		throw new RuntimeException("Stub!");
	}

	public String getInput() {
		throw new RuntimeException("Stub!");
	}

	public String getReason() {
		throw new RuntimeException("Stub!");
	}

	public int getIndex() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String getMessage() {
		throw new RuntimeException("Stub!");
	}
}
