package java.security;

import java.io.Serializable;
import java.security.cert.CertPath;
import java.util.Date;

public final class Timestamp implements Serializable {
	public Timestamp(final Date timestamp, final CertPath signerCertPath) {
		throw new RuntimeException("Stub!");
	}

	public Date getTimestamp() {
		throw new RuntimeException("Stub!");
	}

	public CertPath getSignerCertPath() {
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
