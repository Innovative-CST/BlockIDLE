package java.security;

import java.security.spec.AlgorithmParameterSpec;

public class AlgorithmParameterGenerator {
	protected AlgorithmParameterGenerator(final AlgorithmParameterGeneratorSpi paramGenSpi, final Provider provider,
			final String algorithm) {
		throw new RuntimeException("Stub!");
	}

	public final String getAlgorithm() {
		throw new RuntimeException("Stub!");
	}

	public static AlgorithmParameterGenerator getInstance(final String algorithm) throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public static AlgorithmParameterGenerator getInstance(final String algorithm, final String provider)
			throws NoSuchAlgorithmException, NoSuchProviderException {
		throw new RuntimeException("Stub!");
	}

	public static AlgorithmParameterGenerator getInstance(final String algorithm, final Provider provider)
			throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider() {
		throw new RuntimeException("Stub!");
	}

	public final void init(final int size) {
		throw new RuntimeException("Stub!");
	}

	public final void init(final int size, final SecureRandom random) {
		throw new RuntimeException("Stub!");
	}

	public final void init(final AlgorithmParameterSpec genParamSpec) throws InvalidAlgorithmParameterException {
		throw new RuntimeException("Stub!");
	}

	public final void init(final AlgorithmParameterSpec genParamSpec, final SecureRandom random)
			throws InvalidAlgorithmParameterException {
		throw new RuntimeException("Stub!");
	}

	public final AlgorithmParameters generateParameters() {
		throw new RuntimeException("Stub!");
	}
}
