package java.security.cert;

import java.util.Date;
import java.util.Map;

import javax.security.auth.x500.X500Principal;

public class CertificateRevokedException extends CertificateException {
	public CertificateRevokedException(final Date revocationDate, final CRLReason reason, final X500Principal authority,
			final Map<String, Extension> extensions) {
		throw new RuntimeException("Stub!");
	}

	public Date getRevocationDate() {
		throw new RuntimeException("Stub!");
	}

	public CRLReason getRevocationReason() {
		throw new RuntimeException("Stub!");
	}

	public X500Principal getAuthorityName() {
		throw new RuntimeException("Stub!");
	}

	public Date getInvalidityDate() {
		throw new RuntimeException("Stub!");
	}

	public Map<String, Extension> getExtensions() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String getMessage() {
		throw new RuntimeException("Stub!");
	}
}
