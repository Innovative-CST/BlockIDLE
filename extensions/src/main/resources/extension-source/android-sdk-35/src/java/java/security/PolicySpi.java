package java.security;

public abstract class PolicySpi {
	public PolicySpi() {
		throw new RuntimeException("Stub!");
	}

	protected abstract boolean engineImplies(final ProtectionDomain p0, final Permission p1);

	protected void engineRefresh() {
		throw new RuntimeException("Stub!");
	}

	protected PermissionCollection engineGetPermissions(final CodeSource codesource) {
		throw new RuntimeException("Stub!");
	}

	protected PermissionCollection engineGetPermissions(final ProtectionDomain domain) {
		throw new RuntimeException("Stub!");
	}
}
