package java.security;

import java.io.Serializable;
import java.security.cert.CertPath;

public final class CodeSigner implements Serializable {
	public CodeSigner(final CertPath signerCertPath, final Timestamp timestamp) {
		throw new RuntimeException("Stub!");
	}

	public CertPath getSignerCertPath() {
		throw new RuntimeException("Stub!");
	}

	public Timestamp getTimestamp() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
