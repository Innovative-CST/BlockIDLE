package java.security;

import java.io.Serializable;
import java.util.Enumeration;

public final class Permissions extends PermissionCollection implements Serializable {
	public Permissions() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void add(final Permission permission) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean implies(final Permission permission) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Enumeration<Permission> elements() {
		throw new RuntimeException("Stub!");
	}
}
