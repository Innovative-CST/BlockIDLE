package java.security.cert;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public abstract class CertPath implements Serializable {
	protected CertPath(final String type) {
		throw new RuntimeException("Stub!");
	}

	public String getType() {
		throw new RuntimeException("Stub!");
	}

	public abstract Iterator<String> getEncodings();

	@Override
	public boolean equals(final Object other) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public abstract byte[] getEncoded() throws CertificateEncodingException;

	public abstract byte[] getEncoded(final String p0) throws CertificateEncodingException;

	public abstract List<? extends Certificate> getCertificates();

	protected Object writeReplace() throws ObjectStreamException {
		throw new RuntimeException("Stub!");
	}

	protected static class CertPathRep implements Serializable {
		protected CertPathRep(final String type, final byte[] data) {
			throw new RuntimeException("Stub!");
		}

		protected Object readResolve() throws ObjectStreamException {
			throw new RuntimeException("Stub!");
		}
	}
}
