package java.security;

import java.security.spec.AlgorithmParameterSpec;

public abstract class KeyPairGenerator extends KeyPairGeneratorSpi {
	protected KeyPairGenerator(final String algorithm) {
		throw new RuntimeException("Stub!");
	}

	public String getAlgorithm() {
		throw new RuntimeException("Stub!");
	}

	public static KeyPairGenerator getInstance(final String algorithm) throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public static KeyPairGenerator getInstance(final String algorithm, final String provider)
			throws NoSuchAlgorithmException, NoSuchProviderException {
		throw new RuntimeException("Stub!");
	}

	public static KeyPairGenerator getInstance(final String algorithm, final Provider provider)
			throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider() {
		throw new RuntimeException("Stub!");
	}

	public void initialize(final int keysize) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void initialize(final int keysize, final SecureRandom random) {
		throw new RuntimeException("Stub!");
	}

	public void initialize(final AlgorithmParameterSpec params) throws InvalidAlgorithmParameterException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void initialize(final AlgorithmParameterSpec params, final SecureRandom random)
			throws InvalidAlgorithmParameterException {
		throw new RuntimeException("Stub!");
	}

	public final KeyPair genKeyPair() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public KeyPair generateKeyPair() {
		throw new RuntimeException("Stub!");
	}
}
