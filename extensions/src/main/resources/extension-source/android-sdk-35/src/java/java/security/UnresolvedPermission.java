package java.security;

import java.io.Serializable;
import java.security.cert.Certificate;

public final class UnresolvedPermission extends Permission implements Serializable {
	public UnresolvedPermission(final String type, final String name, final String actions, final Certificate[] certs) {
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

	public String getUnresolvedType() {
		throw new RuntimeException("Stub!");
	}

	public String getUnresolvedName() {
		throw new RuntimeException("Stub!");
	}

	public String getUnresolvedActions() {
		throw new RuntimeException("Stub!");
	}

	public Certificate[] getUnresolvedCerts() {
		throw new RuntimeException("Stub!");
	}
}
