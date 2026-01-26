package java.security.cert;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;

public class CertPathValidator {
	protected CertPathValidator(final CertPathValidatorSpi validatorSpi, final Provider provider,
			final String algorithm) {
		throw new RuntimeException("Stub!");
	}

	public static CertPathValidator getInstance(final String algorithm) throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public static CertPathValidator getInstance(final String algorithm, final String provider)
			throws NoSuchAlgorithmException, NoSuchProviderException {
		throw new RuntimeException("Stub!");
	}

	public static CertPathValidator getInstance(final String algorithm, final Provider provider)
			throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider() {
		throw new RuntimeException("Stub!");
	}

	public final String getAlgorithm() {
		throw new RuntimeException("Stub!");
	}

	public final CertPathValidatorResult validate(final CertPath certPath, final CertPathParameters params)
			throws CertPathValidatorException, InvalidAlgorithmParameterException {
		throw new RuntimeException("Stub!");
	}

	public static final String getDefaultType() {
		throw new RuntimeException("Stub!");
	}

	public final CertPathChecker getRevocationChecker() {
		throw new RuntimeException("Stub!");
	}
}
