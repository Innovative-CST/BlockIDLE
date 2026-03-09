package java.lang;

import java.security.BasicPermission;

public final class RuntimePermission extends BasicPermission {
	public RuntimePermission(final String name) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public RuntimePermission(final String name, final String actions) {
		super(null);
		throw new RuntimeException("Stub!");
	}
}
