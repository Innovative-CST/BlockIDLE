package java.security.cert;

public abstract class CRL {
	protected CRL(final String type) {
		throw new RuntimeException("Stub!");
	}

	public final String getType() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract String toString();

	public abstract boolean isRevoked(final Certificate p0);
}
