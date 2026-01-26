package java.security;

public final class AccessControlContext {
	public AccessControlContext(final ProtectionDomain[] context) {
		throw new RuntimeException("Stub!");
	}

	public AccessControlContext(final AccessControlContext acc, final DomainCombiner combiner) {
		throw new RuntimeException("Stub!");
	}

	public DomainCombiner getDomainCombiner() {
		throw new RuntimeException("Stub!");
	}

	public void checkPermission(final Permission perm) throws AccessControlException {
		throw new RuntimeException("Stub!");
	}
}
