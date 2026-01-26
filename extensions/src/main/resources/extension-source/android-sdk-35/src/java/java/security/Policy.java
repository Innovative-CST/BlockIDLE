package java.security;

public abstract class Policy {
	public static final PermissionCollection UNSUPPORTED_EMPTY_COLLECTION;

	public Policy() {
		throw new RuntimeException("Stub!");
	}

	public static Policy getPolicy() {
		throw new RuntimeException("Stub!");
	}

	public static void setPolicy(final Policy p) {
		throw new RuntimeException("Stub!");
	}

	public static Policy getInstance(final String type, final Parameters params) throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public static Policy getInstance(final String type, final Parameters params, final String provider)
			throws NoSuchAlgorithmException, NoSuchProviderException {
		throw new RuntimeException("Stub!");
	}

	public static Policy getInstance(final String type, final Parameters params, final Provider provider)
			throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public Provider getProvider() {
		throw new RuntimeException("Stub!");
	}

	public String getType() {
		throw new RuntimeException("Stub!");
	}

	public Parameters getParameters() {
		throw new RuntimeException("Stub!");
	}

	public PermissionCollection getPermissions(final CodeSource codesource) {
		throw new RuntimeException("Stub!");
	}

	public PermissionCollection getPermissions(final ProtectionDomain domain) {
		throw new RuntimeException("Stub!");
	}

	public boolean implies(final ProtectionDomain domain, final Permission permission) {
		throw new RuntimeException("Stub!");
	}

	public void refresh() {
		throw new RuntimeException("Stub!");
	}

	static {
		UNSUPPORTED_EMPTY_COLLECTION = null;
	}

	public interface Parameters {
	}
}
