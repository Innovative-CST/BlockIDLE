package java.security.cert;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;

public class CertPathBuilder {
	protected CertPathBuilder(final CertPathBuilderSpi builderSpi, final Provider provider, final String algorithm) {
		throw new RuntimeException("Stub!");
	}

	public static CertPathBuilder getInstance(final String algorithm) throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public static CertPathBuilder getInstance(final String algorithm, final String provider)
			throws NoSuchAlgorithmException, NoSuchProviderException {
		throw new RuntimeException("Stub!");
	}

	public static CertPathBuilder getInstance(final String algorithm, final Provider provider)
			throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider() {
		throw new RuntimeException("Stub!");
	}

	public final String getAlgorithm() {
		throw new RuntimeException("Stub!");
	}

	public final CertPathBuilderResult build(final CertPathParameters params)
			throws CertPathBuilderException, InvalidAlgorithmParameterException {
		throw new RuntimeException("Stub!");
	}

	public static final String getDefaultType() {
		throw new RuntimeException("Stub!");
	}

	public final CertPathChecker getRevocationChecker() {
		throw new RuntimeException("Stub!");
	}
}
