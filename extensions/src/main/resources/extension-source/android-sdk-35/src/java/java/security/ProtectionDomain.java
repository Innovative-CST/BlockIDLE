package java.security;

public class ProtectionDomain {
	public ProtectionDomain(final CodeSource codesource, final PermissionCollection permissions) {
		throw new RuntimeException("Stub!");
	}

	public ProtectionDomain(final CodeSource codesource, final PermissionCollection permissions,
			final ClassLoader classloader, final Principal[] principals) {
		throw new RuntimeException("Stub!");
	}

	public final CodeSource getCodeSource() {
		throw new RuntimeException("Stub!");
	}

	public final ClassLoader getClassLoader() {
		throw new RuntimeException("Stub!");
	}

	public final Principal[] getPrincipals() {
		throw new RuntimeException("Stub!");
	}

	public final PermissionCollection getPermissions() {
		throw new RuntimeException("Stub!");
	}

	public boolean implies(final Permission permission) {
		throw new RuntimeException("Stub!");
	}
}
