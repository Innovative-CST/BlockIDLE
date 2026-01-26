package java.security.cert;

import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class CertificateFactorySpi {
	public CertificateFactorySpi() {
		throw new RuntimeException("Stub!");
	}

	public abstract Certificate engineGenerateCertificate(final InputStream p0) throws CertificateException;

	public CertPath engineGenerateCertPath(final InputStream inStream) throws CertificateException {
		throw new RuntimeException("Stub!");
	}

	public CertPath engineGenerateCertPath(final InputStream inStream, final String encoding)
			throws CertificateException {
		throw new RuntimeException("Stub!");
	}

	public CertPath engineGenerateCertPath(final List<? extends Certificate> certificates) throws CertificateException {
		throw new RuntimeException("Stub!");
	}

	public Iterator<String> engineGetCertPathEncodings() {
		throw new RuntimeException("Stub!");
	}

	public abstract Collection<? extends Certificate> engineGenerateCertificates(final InputStream p0)
			throws CertificateException;

	public abstract CRL engineGenerateCRL(final InputStream p0) throws CRLException;

	public abstract Collection<? extends CRL> engineGenerateCRLs(final InputStream p0) throws CRLException;
}
