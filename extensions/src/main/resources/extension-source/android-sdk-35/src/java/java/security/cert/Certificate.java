package java.security.cert;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SignatureException;

public abstract class Certificate implements Serializable {
	protected Certificate(final String type) {
		throw new RuntimeException("Stub!");
	}

	public final String getType() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object other) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	public abstract byte[] getEncoded() throws CertificateEncodingException;

	public abstract void verify(final PublicKey p0) throws CertificateException, InvalidKeyException,
			NoSuchAlgorithmException, NoSuchProviderException, SignatureException;

	public abstract void verify(final PublicKey p0, final String p1) throws CertificateException, InvalidKeyException,
			NoSuchAlgorithmException, NoSuchProviderException, SignatureException;

	public void verify(final PublicKey key, final Provider sigProvider)
			throws CertificateException, InvalidKeyException, NoSuchAlgorithmException, SignatureException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract String toString();

	public abstract PublicKey getPublicKey();

	protected Object writeReplace() throws ObjectStreamException {
		throw new RuntimeException("Stub!");
	}

	protected static class CertificateRep implements Serializable {
		protected CertificateRep(final String type, final byte[] data) {
			throw new RuntimeException("Stub!");
		}

		protected Object readResolve() throws ObjectStreamException {
			throw new RuntimeException("Stub!");
		}
	}
}
