package java.nio.charset;

public class CoderResult {
	public static final CoderResult OVERFLOW;
	public static final CoderResult UNDERFLOW;

	CoderResult() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public boolean isUnderflow() {
		throw new RuntimeException("Stub!");
	}

	public boolean isOverflow() {
		throw new RuntimeException("Stub!");
	}

	public boolean isError() {
		throw new RuntimeException("Stub!");
	}

	public boolean isMalformed() {
		throw new RuntimeException("Stub!");
	}

	public boolean isUnmappable() {
		throw new RuntimeException("Stub!");
	}

	public int length() {
		throw new RuntimeException("Stub!");
	}

	public static CoderResult malformedForLength(final int length) {
		throw new RuntimeException("Stub!");
	}

	public static CoderResult unmappableForLength(final int length) {
		throw new RuntimeException("Stub!");
	}

	public void throwException() throws CharacterCodingException {
		throw new RuntimeException("Stub!");
	}

	static {
		OVERFLOW = null;
		UNDERFLOW = null;
	}
}
