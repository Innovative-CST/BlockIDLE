package java.security.cert;

import java.io.Serializable;
import java.security.GeneralSecurityException;

public class CertPathValidatorException extends GeneralSecurityException {
	public CertPathValidatorException() {
		throw new RuntimeException("Stub!");
	}

	public CertPathValidatorException(final String msg) {
		throw new RuntimeException("Stub!");
	}

	public CertPathValidatorException(final Throwable cause) {
		throw new RuntimeException("Stub!");
	}

	public CertPathValidatorException(final String msg, final Throwable cause) {
		throw new RuntimeException("Stub!");
	}

	public CertPathValidatorException(final String msg, final Throwable cause, final CertPath certPath,
			final int index) {
		throw new RuntimeException("Stub!");
	}

	public CertPathValidatorException(final String msg, final Throwable cause, final CertPath certPath, final int index,
			final Reason reason) {
		throw new RuntimeException("Stub!");
	}

	public CertPath getCertPath() {
		throw new RuntimeException("Stub!");
	}

	public int getIndex() {
		throw new RuntimeException("Stub!");
	}

	public Reason getReason() {
		throw new RuntimeException("Stub!");
	}

	public enum BasicReason implements Reason {
		UNSPECIFIED, EXPIRED, NOT_YET_VALID, REVOKED, UNDETERMINED_REVOCATION_STATUS, INVALID_SIGNATURE, ALGORITHM_CONSTRAINED;
	}

	public interface Reason extends Serializable {
	}
}
