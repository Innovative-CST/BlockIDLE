package java.security.cert;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collection;

public abstract class CertStoreSpi {
	public CertStoreSpi(final CertStoreParameters params) throws InvalidAlgorithmParameterException {
		throw new RuntimeException("Stub!");
	}

	public abstract Collection<? extends Certificate> engineGetCertificates(final CertSelector p0)
			throws CertStoreException;

	public abstract Collection<? extends CRL> engineGetCRLs(final CRLSelector p0) throws CertStoreException;
}
