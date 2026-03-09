package java.security;

import java.io.Serializable;
import java.util.Enumeration;

public abstract class PermissionCollection implements Serializable {
	public PermissionCollection() {
		throw new RuntimeException("Stub!");
	}

	public abstract void add(final Permission p0);

	public abstract boolean implies(final Permission p0);

	public abstract Enumeration<Permission> elements();

	public void setReadOnly() {
		throw new RuntimeException("Stub!");
	}

	public boolean isReadOnly() {
		throw new RuntimeException("Stub!");
	}
}
