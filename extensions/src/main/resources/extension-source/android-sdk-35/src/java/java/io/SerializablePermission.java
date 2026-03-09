package java.io;

import java.security.BasicPermission;

public final class SerializablePermission extends BasicPermission {
	public SerializablePermission(final String name) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public SerializablePermission(final String name, final String actions) {
		super(null);
		throw new RuntimeException("Stub!");
	}
}
