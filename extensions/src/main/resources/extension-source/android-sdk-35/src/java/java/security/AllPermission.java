package java.security;

public final class AllPermission extends Permission {
	public AllPermission() {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public AllPermission(final String name, final String actions) {
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
