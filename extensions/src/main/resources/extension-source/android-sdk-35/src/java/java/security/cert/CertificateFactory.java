package java.security.cert;

import java.io.InputStream;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CertificateFactory {
	protected CertificateFactory(final CertificateFactorySpi certFacSpi, final Provider provider, final String type) {
		throw new RuntimeException("Stub!");
	}

	public static final CertificateFactory getInstance(final String type) throws CertificateException {
		throw new RuntimeException("Stub!");
	}

	public static final CertificateFactory getInstance(final String type, final String provider)
			throws CertificateException, NoSuchProviderException {
		throw new RuntimeException("Stub!");
	}

	public static final CertificateFactory getInstance(final String type, final Provider provider)
			throws CertificateException {
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider() {
		throw new RuntimeException("Stub!");
	}

	public final String getType() {
		throw new RuntimeException("Stub!");
	}

	public final Certificate generateCertificate(final InputStream inStream) throws CertificateException {
		throw new RuntimeException("Stub!");
	}

	public final Iterator<String> getCertPathEncodings() {
		throw new RuntimeException("Stub!");
	}

	public final CertPath generateCertPath(final InputStream inStream) throws CertificateException {
		throw new RuntimeException("Stub!");
	}

	public final CertPath generateCertPath(final InputStream inStream, final String encoding)
			throws CertificateException {
		throw new RuntimeException("Stub!");
	}

	public final CertPath generateCertPath(final List<? extends Certificate> certificates) throws CertificateException {
		throw new RuntimeException("Stub!");
	}

	public final Collection<? extends Certificate> generateCertificates(final InputStream inStream)
			throws CertificateException {
		throw new RuntimeException("Stub!");
	}

	public final CRL generateCRL(final InputStream inStream) throws CRLException {
		throw new RuntimeException("Stub!");
	}

	public final Collection<? extends CRL> generateCRLs(final InputStream inStream) throws CRLException {
		throw new RuntimeException("Stub!");
	}
}
