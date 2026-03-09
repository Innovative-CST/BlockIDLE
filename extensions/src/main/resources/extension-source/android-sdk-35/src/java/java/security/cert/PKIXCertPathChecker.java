package java.security.cert;

import java.util.Collection;
import java.util.Set;

public abstract class PKIXCertPathChecker implements CertPathChecker, Cloneable {
	protected PKIXCertPathChecker() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract void init(final boolean p0) throws CertPathValidatorException;

	@Override
	public abstract boolean isForwardCheckingSupported();

	public abstract Set<String> getSupportedExtensions();

	public abstract void check(final Certificate p0, final Collection<String> p1) throws CertPathValidatorException;

	@Override
	public void check(final Certificate cert) throws CertPathValidatorException {
		throw new RuntimeException("Stub!");
	}

	public Object clone() {
		throw new RuntimeException("Stub!");
	}
}
