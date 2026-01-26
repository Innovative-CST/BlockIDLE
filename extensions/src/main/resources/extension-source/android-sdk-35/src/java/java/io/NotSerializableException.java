package java.io;

public class NotSerializableException extends ObjectStreamException {
	public NotSerializableException(final String classname) {
		throw new RuntimeException("Stub!");
	}

	public NotSerializableException() {
		throw new RuntimeException("Stub!");
	}
}
