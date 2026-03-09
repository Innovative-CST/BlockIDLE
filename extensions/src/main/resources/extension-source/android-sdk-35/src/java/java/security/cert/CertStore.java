package java.security.cert;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Collection;

public class CertStore {
	protected CertStore(final CertStoreSpi storeSpi, final Provider provider, final String type,
			final CertStoreParameters params) {
		throw new RuntimeException("Stub!");
	}

	public final Collection<? extends Certificate> getCertificates(final CertSelector selector)
			throws CertStoreException {
		throw new RuntimeException("Stub!");
	}

	public final Collection<? extends CRL> getCRLs(final CRLSelector selector) throws CertStoreException {
		throw new RuntimeException("Stub!");
	}

	public static CertStore getInstance(final String type, final CertStoreParameters params)
			throws InvalidAlgorithmParameterException, NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public static CertStore getInstance(final String type, final CertStoreParameters params, final String provider)
			throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException {
		throw new RuntimeException("Stub!");
	}

	public static CertStore getInstance(final String type, final CertStoreParameters params, final Provider provider)
			throws InvalidAlgorithmParameterException, NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public final CertStoreParameters getCertStoreParameters() {
		throw new RuntimeException("Stub!");
	}

	public final String getType() {
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider() {
		throw new RuntimeException("Stub!");
	}

	public static final String getDefaultType() {
		throw new RuntimeException("Stub!");
	}
}
