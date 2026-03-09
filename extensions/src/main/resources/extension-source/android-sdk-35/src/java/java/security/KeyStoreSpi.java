package java.security;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.Date;
import java.util.Enumeration;

public abstract class KeyStoreSpi {
	public KeyStoreSpi() {
		throw new RuntimeException("Stub!");
	}

	public abstract Key engineGetKey(final String p0, final char[] p1)
			throws NoSuchAlgorithmException, UnrecoverableKeyException;

	public abstract Certificate[] engineGetCertificateChain(final String p0);

	public abstract Certificate engineGetCertificate(final String p0);

	public abstract Date engineGetCreationDate(final String p0);

	public abstract void engineSetKeyEntry(final String p0, final Key p1, final char[] p2, final Certificate[] p3)
			throws KeyStoreException;

	public abstract void engineSetKeyEntry(final String p0, final byte[] p1, final Certificate[] p2)
			throws KeyStoreException;

	public abstract void engineSetCertificateEntry(final String p0, final Certificate p1) throws KeyStoreException;

	public abstract void engineDeleteEntry(final String p0) throws KeyStoreException;

	public abstract Enumeration<String> engineAliases();

	public abstract boolean engineContainsAlias(final String p0);

	public abstract int engineSize();

	public abstract boolean engineIsKeyEntry(final String p0);

	public abstract boolean engineIsCertificateEntry(final String p0);

	public abstract String engineGetCertificateAlias(final Certificate p0);

	public abstract void engineStore(final OutputStream p0, final char[] p1)
			throws CertificateException, IOException, NoSuchAlgorithmException;

	public void engineStore(final KeyStore.LoadStoreParameter param)
			throws CertificateException, IOException, NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public abstract void engineLoad(final InputStream p0, final char[] p1)
			throws CertificateException, IOException, NoSuchAlgorithmException;

	public void engineLoad(final KeyStore.LoadStoreParameter param)
			throws CertificateException, IOException, NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public KeyStore.Entry engineGetEntry(final String alias, final KeyStore.ProtectionParameter protParam)
			throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableEntryException {
		throw new RuntimeException("Stub!");
	}

	public void engineSetEntry(final String alias, final KeyStore.Entry entry,
			final KeyStore.ProtectionParameter protParam) throws KeyStoreException {
		throw new RuntimeException("Stub!");
	}

	public boolean engineEntryInstanceOf(final String alias, final Class<? extends KeyStore.Entry> entryClass) {
		throw new RuntimeException("Stub!");
	}

	public boolean engineProbe(final InputStream stream) throws IOException {
		throw new RuntimeException("Stub!");
	}
}
