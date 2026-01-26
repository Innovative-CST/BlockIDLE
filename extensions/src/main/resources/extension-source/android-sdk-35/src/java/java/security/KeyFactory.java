package java.security;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

public class KeyFactory {
	protected KeyFactory(final KeyFactorySpi keyFacSpi, final Provider provider, final String algorithm) {
		throw new RuntimeException("Stub!");
	}

	public static KeyFactory getInstance(final String algorithm) throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public static KeyFactory getInstance(final String algorithm, final String provider)
			throws NoSuchAlgorithmException, NoSuchProviderException {
		throw new RuntimeException("Stub!");
	}

	public static KeyFactory getInstance(final String algorithm, final Provider provider)
			throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider() {
		throw new RuntimeException("Stub!");
	}

	public final String getAlgorithm() {
		throw new RuntimeException("Stub!");
	}

	public final PublicKey generatePublic(final KeySpec keySpec) throws InvalidKeySpecException {
		throw new RuntimeException("Stub!");
	}

	public final PrivateKey generatePrivate(final KeySpec keySpec) throws InvalidKeySpecException {
		throw new RuntimeException("Stub!");
	}

	public final <T extends KeySpec> T getKeySpec(final Key key, final Class<T> keySpec)
			throws InvalidKeySpecException {
		throw new RuntimeException("Stub!");
	}

	public final Key translateKey(final Key key) throws InvalidKeyException {
		throw new RuntimeException("Stub!");
	}
}
