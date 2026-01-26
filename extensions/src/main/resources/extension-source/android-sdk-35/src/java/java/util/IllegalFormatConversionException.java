package java.util;

public class IllegalFormatConversionException extends IllegalFormatException {
	public IllegalFormatConversionException(final char c, final Class<?> arg) {
		throw new RuntimeException("Stub!");
	}

	public char getConversion() {
		throw new RuntimeException("Stub!");
	}

	public Class<?> getArgumentClass() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String getMessage() {
		throw new RuntimeException("Stub!");
	}
}
