package java.security;

import java.security.spec.AlgorithmParameterSpec;

public abstract class KeyPairGeneratorSpi {
	public KeyPairGeneratorSpi() {
		throw new RuntimeException("Stub!");
	}

	public abstract void initialize(final int p0, final SecureRandom p1);

	public void initialize(final AlgorithmParameterSpec params, final SecureRandom random)
			throws InvalidAlgorithmParameterException {
		throw new RuntimeException("Stub!");
	}

	public abstract KeyPair generateKeyPair();
}
