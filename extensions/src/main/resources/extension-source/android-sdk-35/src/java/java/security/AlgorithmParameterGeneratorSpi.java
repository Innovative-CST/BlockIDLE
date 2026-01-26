package java.security;

import java.security.spec.AlgorithmParameterSpec;

public abstract class AlgorithmParameterGeneratorSpi {
	public AlgorithmParameterGeneratorSpi() {
		throw new RuntimeException("Stub!");
	}

	protected abstract void engineInit(final int p0, final SecureRandom p1);

	protected abstract void engineInit(final AlgorithmParameterSpec p0, final SecureRandom p1)
			throws InvalidAlgorithmParameterException;

	protected abstract AlgorithmParameters engineGenerateParameters();
}
