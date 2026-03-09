package java.security.spec;

public class NamedParameterSpec implements AlgorithmParameterSpec {
	public static final NamedParameterSpec ED25519;
	public static final NamedParameterSpec ED448;
	public static final NamedParameterSpec X25519;
	public static final NamedParameterSpec X448;

	public NamedParameterSpec(@RecentlyNonNull final String stdName) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getName() {
		throw new RuntimeException("Stub!");
	}

	static {
		ED25519 = null;
		ED448 = null;
		X25519 = null;
		X448 = null;
	}
}
