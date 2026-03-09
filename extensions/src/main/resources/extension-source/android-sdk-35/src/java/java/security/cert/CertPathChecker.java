package java.security.cert;

public interface CertPathChecker {
	void init(final boolean p0) throws CertPathValidatorException;

	boolean isForwardCheckingSupported();

	void check(final Certificate p0) throws CertPathValidatorException;
}
