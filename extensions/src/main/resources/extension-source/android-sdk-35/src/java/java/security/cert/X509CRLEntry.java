package java.security.cert;

import java.math.BigInteger;
import java.util.Date;

import javax.security.auth.x500.X500Principal;

public abstract class X509CRLEntry implements X509Extension {
	public X509CRLEntry() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object other) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	public abstract byte[] getEncoded() throws CRLException;

	public abstract BigInteger getSerialNumber();

	public X500Principal getCertificateIssuer() {
		throw new RuntimeException("Stub!");
	}

	public abstract Date getRevocationDate();

	public abstract boolean hasExtensions();

	@Override
	public abstract String toString();

	public CRLReason getRevocationReason() {
		throw new RuntimeException("Stub!");
	}
}
