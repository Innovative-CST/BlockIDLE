package java.util.logging;

import java.security.BasicPermission;

public final class LoggingPermission extends BasicPermission {
	public LoggingPermission(final String name, final String actions) throws IllegalArgumentException {
		super(null);
		throw new RuntimeException("Stub!");
	}
}
