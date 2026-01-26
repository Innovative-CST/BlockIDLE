package java.security.spec;

public class PKCS8EncodedKeySpec extends EncodedKeySpec {
	public PKCS8EncodedKeySpec(final byte[] encodedKey) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public PKCS8EncodedKeySpec(final byte[] encodedKey, final String algorithm) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	@Override
	public byte[] getEncoded() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final String getFormat() {
		throw new RuntimeException("Stub!");
	}
}
