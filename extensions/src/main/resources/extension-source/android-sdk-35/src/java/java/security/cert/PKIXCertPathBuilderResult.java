package java.security.cert;

import java.security.PublicKey;

public class PKIXCertPathBuilderResult extends PKIXCertPathValidatorResult implements CertPathBuilderResult {
	public PKIXCertPathBuilderResult(final CertPath certPath, final TrustAnchor trustAnchor,
			final PolicyNode policyTree, final PublicKey subjectPublicKey) {
		super(null, null, null);
		throw new RuntimeException("Stub!");
	}

	@Override
	public CertPath getCertPath() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
