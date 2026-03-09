package java.security.cert;

import java.security.InvalidAlgorithmParameterException;

public abstract class CertPathBuilderSpi {
	public CertPathBuilderSpi() {
		throw new RuntimeException("Stub!");
	}

	public abstract CertPathBuilderResult engineBuild(final CertPathParameters p0)
			throws CertPathBuilderException, InvalidAlgorithmParameterException;

	public CertPathChecker engineGetRevocationChecker() {
		throw new RuntimeException("Stub!");
	}
}
