package java.io;

public class InvalidClassException extends ObjectStreamException {
	public String classname;

	public InvalidClassException(final String reason) {
		throw new RuntimeException("Stub!");
	}

	public InvalidClassException(final String cname, final String reason) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String getMessage() {
		throw new RuntimeException("Stub!");
	}
}
