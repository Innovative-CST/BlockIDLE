package java.security.cert;

import java.security.InvalidAlgorithmParameterException;

public abstract class CertPathValidatorSpi {
	public CertPathValidatorSpi() {
		throw new RuntimeException("Stub!");
	}

	public abstract CertPathValidatorResult engineValidate(final CertPath p0, final CertPathParameters p1)
			throws CertPathValidatorException, InvalidAlgorithmParameterException;

	public CertPathChecker engineGetRevocationChecker() {
		throw new RuntimeException("Stub!");
	}
}
