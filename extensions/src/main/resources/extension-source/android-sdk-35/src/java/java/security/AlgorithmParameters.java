package java.security;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

public class AlgorithmParameters {
	protected AlgorithmParameters(final AlgorithmParametersSpi paramSpi, final Provider provider,
			final String algorithm) {
		throw new RuntimeException("Stub!");
	}

	public final String getAlgorithm() {
		throw new RuntimeException("Stub!");
	}

	public static AlgorithmParameters getInstance(final String algorithm) throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public static AlgorithmParameters getInstance(final String algorithm, final String provider)
			throws NoSuchAlgorithmException, NoSuchProviderException {
		throw new RuntimeException("Stub!");
	}

	public static AlgorithmParameters getInstance(final String algorithm, final Provider provider)
			throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider() {
		throw new RuntimeException("Stub!");
	}

	public final void init(final AlgorithmParameterSpec paramSpec) throws InvalidParameterSpecException {
		throw new RuntimeException("Stub!");
	}

	public final void init(final byte[] params) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public final void init(final byte[] params, final String format) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public final <T extends AlgorithmParameterSpec> T getParameterSpec(final Class<T> paramSpec)
			throws InvalidParameterSpecException {
		throw new RuntimeException("Stub!");
	}

	public final byte[] getEncoded() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public final byte[] getEncoded(final String format) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final String toString() {
		throw new RuntimeException("Stub!");
	}
}
