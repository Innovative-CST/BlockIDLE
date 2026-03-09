package java.security;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Date;
import java.util.Enumeration;
import java.util.Set;

import javax.crypto.SecretKey;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;
import javax.security.auth.callback.CallbackHandler;

public class KeyStore {
	protected KeyStore(final KeyStoreSpi keyStoreSpi, final Provider provider, final String type) {
		throw new RuntimeException("Stub!");
	}

	public static KeyStore getInstance(final String type) throws KeyStoreException {
		throw new RuntimeException("Stub!");
	}

	public static KeyStore getInstance(final String type, final String provider)
			throws KeyStoreException, NoSuchProviderException {
		throw new RuntimeException("Stub!");
	}

	public static KeyStore getInstance(final String type, final Provider provider) throws KeyStoreException {
		throw new RuntimeException("Stub!");
	}

	public static final String getDefaultType() {
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider() {
		throw new RuntimeException("Stub!");
	}

	public final String getType() {
		throw new RuntimeException("Stub!");
	}

	public final Key getKey(final String alias, final char[] password)
			throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
		throw new RuntimeException("Stub!");
	}

	public final Certificate[] getCertificateChain(final String alias) throws KeyStoreException {
		throw new RuntimeException("Stub!");
	}

	public final Certificate getCertificate(final String alias) throws KeyStoreException {
		throw new RuntimeException("Stub!");
	}

	public final Date getCreationDate(final String alias) throws KeyStoreException {
		throw new RuntimeException("Stub!");
	}

	public final void setKeyEntry(final String alias, final Key key, final char[] password, final Certificate[] chain)
			throws KeyStoreException {
		throw new RuntimeException("Stub!");
	}

	public final void setKeyEntry(final String alias, final byte[] key, final Certificate[] chain)
			throws KeyStoreException {
		throw new RuntimeException("Stub!");
	}

	public final void setCertificateEntry(final String alias, final Certificate cert) throws KeyStoreException {
		throw new RuntimeException("Stub!");
	}

	public final void deleteEntry(final String alias) throws KeyStoreException {
		throw new RuntimeException("Stub!");
	}

	public final Enumeration<String> aliases() throws KeyStoreException {
		throw new RuntimeException("Stub!");
	}

	public final boolean containsAlias(final String alias) throws KeyStoreException {
		throw new RuntimeException("Stub!");
	}

	public final int size() throws KeyStoreException {
		throw new RuntimeException("Stub!");
	}

	public final boolean isKeyEntry(final String alias) throws KeyStoreException {
		throw new RuntimeException("Stub!");
	}

	public final boolean isCertificateEntry(final String alias) throws KeyStoreException {
		throw new RuntimeException("Stub!");
	}

	public final String getCertificateAlias(final Certificate cert) throws KeyStoreException {
		throw new RuntimeException("Stub!");
	}

	public final void store(final OutputStream stream, final char[] password)
			throws CertificateException, IOException, KeyStoreException, NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public final void store(final LoadStoreParameter param)
			throws CertificateException, IOException, KeyStoreException, NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public final void load(final InputStream stream, final char[] password)
			throws CertificateException, IOException, NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public final void load(final LoadStoreParameter param)
			throws CertificateException, IOException, NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public final Entry getEntry(final String alias, final ProtectionParameter protParam)
			throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableEntryException {
		throw new RuntimeException("Stub!");
	}

	public final void setEntry(final String alias, final Entry entry, final ProtectionParameter protParam)
			throws KeyStoreException {
		throw new RuntimeException("Stub!");
	}

	public final boolean entryInstanceOf(final String alias, final Class<? extends Entry> entryClass)
			throws KeyStoreException {
		throw new RuntimeException("Stub!");
	}

	public static final KeyStore getInstance(final File file, final char[] password)
			throws CertificateException, IOException, KeyStoreException, NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public static final KeyStore getInstance(final File file, final LoadStoreParameter param)
			throws CertificateException, IOException, KeyStoreException, NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public abstract static class Builder {
		protected Builder() {
			throw new RuntimeException("Stub!");
		}

		public abstract KeyStore getKeyStore() throws KeyStoreException;

		public abstract ProtectionParameter getProtectionParameter(final String p0) throws KeyStoreException;

		public static Builder newInstance(final KeyStore keyStore, final ProtectionParameter protectionParameter) {
			throw new RuntimeException("Stub!");
		}

		public static Builder newInstance(final String type, final Provider provider, final File file,
				final ProtectionParameter protection) {
			throw new RuntimeException("Stub!");
		}

		public static Builder newInstance(final File file, final ProtectionParameter protection) {
			throw new RuntimeException("Stub!");
		}

		public static Builder newInstance(final String type, final Provider provider,
				final ProtectionParameter protection) {
			throw new RuntimeException("Stub!");
		}
	}

	public static class CallbackHandlerProtection implements ProtectionParameter {
		public CallbackHandlerProtection(final CallbackHandler handler) {
			throw new RuntimeException("Stub!");
		}

		public CallbackHandler getCallbackHandler() {
			throw new RuntimeException("Stub!");
		}
	}

	public interface Entry {
		default Set<Attribute> getAttributes() {
			throw new RuntimeException("Stub!");
		}

		interface Attribute {
			String getName();

			String getValue();
		}
	}

	public static class PasswordProtection implements ProtectionParameter, Destroyable {
		public PasswordProtection(final char[] password) {
			throw new RuntimeException("Stub!");
		}

		public PasswordProtection(final char[] password, final String protectionAlgorithm,
				final AlgorithmParameterSpec protectionParameters) {
			throw new RuntimeException("Stub!");
		}

		public String getProtectionAlgorithm() {
			throw new RuntimeException("Stub!");
		}

		public AlgorithmParameterSpec getProtectionParameters() {
			throw new RuntimeException("Stub!");
		}

		public synchronized char[] getPassword() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public synchronized void destroy() throws DestroyFailedException {
			throw new RuntimeException("Stub!");
		}

		@Override
		public synchronized boolean isDestroyed() {
			throw new RuntimeException("Stub!");
		}
	}

	public static final class PrivateKeyEntry implements Entry {
		public PrivateKeyEntry(final PrivateKey privateKey, final Certificate[] chain) {
			throw new RuntimeException("Stub!");
		}

		public PrivateKeyEntry(final PrivateKey privateKey, final Certificate[] chain,
				final Set<Attribute> attributes) {
			throw new RuntimeException("Stub!");
		}

		public PrivateKey getPrivateKey() {
			throw new RuntimeException("Stub!");
		}

		public Certificate[] getCertificateChain() {
			throw new RuntimeException("Stub!");
		}

		public Certificate getCertificate() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public Set<Attribute> getAttributes() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public String toString() {
			throw new RuntimeException("Stub!");
		}
	}

	public static final class SecretKeyEntry implements Entry {
		public SecretKeyEntry(final SecretKey secretKey) {
			throw new RuntimeException("Stub!");
		}

		public SecretKeyEntry(final SecretKey secretKey, final Set<Attribute> attributes) {
			throw new RuntimeException("Stub!");
		}

		public SecretKey getSecretKey() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public Set<Attribute> getAttributes() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public String toString() {
			throw new RuntimeException("Stub!");
		}
	}

	public static final class TrustedCertificateEntry implements Entry {
		public TrustedCertificateEntry(final Certificate trustedCert) {
			throw new RuntimeException("Stub!");
		}

		public TrustedCertificateEntry(final Certificate trustedCert, final Set<Attribute> attributes) {
			throw new RuntimeException("Stub!");
		}

		public Certificate getTrustedCertificate() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public Set<Attribute> getAttributes() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public String toString() {
			throw new RuntimeException("Stub!");
		}
	}

	public interface ProtectionParameter {
	}

	public interface LoadStoreParameter {
		ProtectionParameter getProtectionParameter();
	}
}
