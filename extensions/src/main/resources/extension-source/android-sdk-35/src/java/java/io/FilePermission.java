package java.io;

import java.security.Permission;

public final class FilePermission extends Permission implements Serializable {
	public FilePermission(final String path, final String actions) {
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
