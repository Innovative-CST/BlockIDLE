package java.security;

public class AccessControlException extends SecurityException {
	public AccessControlException(final String s) {
		throw new RuntimeException("Stub!");
	}

	public AccessControlException(final String s, final Permission p) {
		throw new RuntimeException("Stub!");
	}

	public Permission getPermission() {
		throw new RuntimeException("Stub!");
	}
}
