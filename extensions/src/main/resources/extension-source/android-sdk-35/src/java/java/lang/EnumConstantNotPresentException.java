package java.lang;

public class EnumConstantNotPresentException extends RuntimeException {
	public EnumConstantNotPresentException(final Class<? extends Enum> enumType, final String constantName) {
		throw new RuntimeException("Stub!");
	}

	public Class<? extends Enum> enumType() {
		throw new RuntimeException("Stub!");
	}

	public String constantName() {
		throw new RuntimeException("Stub!");
	}
}
