package java.security;

import java.io.Serializable;

public abstract class BasicPermission extends Permission implements Serializable {
	public BasicPermission(final String name) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public BasicPermission(final String name, final String actions) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean implies(final Permission p) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String getActions() {
		throw new RuntimeException("Stub!");
	}
}
