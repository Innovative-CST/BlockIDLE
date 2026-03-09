package java.security;

@Deprecated
public abstract class Signer extends Identity {
	@Deprecated
	protected Signer() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public Signer(final String name) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public Signer(final String name, final IdentityScope scope) throws KeyManagementException {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public PrivateKey getPrivateKey() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public final void setKeyPair(final KeyPair pair) throws InvalidParameterException, KeyException {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
