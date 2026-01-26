package java.net;

import java.io.Serializable;
import java.security.Permission;

public final class SocketPermission extends Permission implements Serializable {
	public SocketPermission(final String host, final String action) {
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
