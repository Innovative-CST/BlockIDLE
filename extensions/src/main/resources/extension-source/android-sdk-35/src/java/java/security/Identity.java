package java.security;

import java.io.Serializable;

@Deprecated
public abstract class Identity implements Principal, Serializable {
	@Deprecated
	protected Identity() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public Identity(final String name, final IdentityScope scope) throws KeyManagementException {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public Identity(final String name) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@Override
	public final String getName() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public final IdentityScope getScope() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public PublicKey getPublicKey() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void setPublicKey(final PublicKey key) throws KeyManagementException {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void setInfo(final String info) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public String getInfo() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void addCertificate(final Certificate certificate) throws KeyManagementException {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void removeCertificate(final Certificate certificate) throws KeyManagementException {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public Certificate[] certificates() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@Override
	public final boolean equals(final Object identity) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	protected boolean identityEquals(final Identity identity) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public String toString(final boolean detailed) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}
}
