package java.security.spec;

public class X509EncodedKeySpec extends EncodedKeySpec {
	public X509EncodedKeySpec(final byte[] encodedKey) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public X509EncodedKeySpec(final byte[] encodedKey, final String algorithm) {
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
