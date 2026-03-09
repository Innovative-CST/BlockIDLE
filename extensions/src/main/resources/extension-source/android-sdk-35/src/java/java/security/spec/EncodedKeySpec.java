package java.security.spec;

public abstract class EncodedKeySpec implements KeySpec {
	public EncodedKeySpec(final byte[] encodedKey) {
		throw new RuntimeException("Stub!");
	}

	protected EncodedKeySpec(final byte[] encodedKey, final String algorithm) {
		throw new RuntimeException("Stub!");
	}

	public String getAlgorithm() {
		throw new RuntimeException("Stub!");
	}

	public byte[] getEncoded() {
		throw new RuntimeException("Stub!");
	}

	public abstract String getFormat();
}
