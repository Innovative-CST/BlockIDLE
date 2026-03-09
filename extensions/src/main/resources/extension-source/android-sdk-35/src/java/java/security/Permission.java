package java.security;

import java.io.Serializable;

public abstract class Permission implements Guard, Serializable {
	public Permission(final String name) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void checkGuard(final Object object) throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	public abstract boolean implies(final Permission p0);

	public final String getName() {
		throw new RuntimeException("Stub!");
	}

	public abstract String getActions();

	public PermissionCollection newPermissionCollection() {
		throw new RuntimeException("Stub!");
	}
}
