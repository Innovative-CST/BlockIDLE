package java.security.cert;

import java.security.PublicKey;

public class PKIXCertPathValidatorResult implements CertPathValidatorResult {
	public PKIXCertPathValidatorResult(final TrustAnchor trustAnchor, final PolicyNode policyTree,
			final PublicKey subjectPublicKey) {
		throw new RuntimeException("Stub!");
	}

	public TrustAnchor getTrustAnchor() {
		throw new RuntimeException("Stub!");
	}

	public PolicyNode getPolicyTree() {
		throw new RuntimeException("Stub!");
	}

	public PublicKey getPublicKey() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Object clone() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
