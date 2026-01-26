package java.security;

import java.util.Enumeration;

@Deprecated
public abstract class IdentityScope extends Identity {
	@Deprecated
	protected IdentityScope() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public IdentityScope(final String name) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public IdentityScope(final String name, final IdentityScope scope) throws KeyManagementException {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public static IdentityScope getSystemScope() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	protected static void setSystemScope(final IdentityScope scope) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public abstract int size();

	@Deprecated
	public abstract Identity getIdentity(final String p0);

	@Deprecated
	public Identity getIdentity(final Principal principal) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public abstract Identity getIdentity(final PublicKey p0);

	@Deprecated
	public abstract void addIdentity(final Identity p0) throws KeyManagementException;

	@Deprecated
	public abstract void removeIdentity(final Identity p0) throws KeyManagementException;

	@Deprecated
	public abstract Enumeration<Identity> identities();

	@Deprecated
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
