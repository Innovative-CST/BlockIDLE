package java.security.cert;

import java.security.PublicKey;

import javax.security.auth.x500.X500Principal;

public class TrustAnchor {
	public TrustAnchor(final X509Certificate trustedCert, final byte[] nameConstraints) {
		throw new RuntimeException("Stub!");
	}

	public TrustAnchor(final X500Principal caPrincipal, final PublicKey pubKey, final byte[] nameConstraints) {
		throw new RuntimeException("Stub!");
	}

	public TrustAnchor(final String caName, final PublicKey pubKey, final byte[] nameConstraints) {
		throw new RuntimeException("Stub!");
	}

	public final X509Certificate getTrustedCert() {
		throw new RuntimeException("Stub!");
	}

	public final X500Principal getCA() {
		throw new RuntimeException("Stub!");
	}

	public final String getCAName() {
		throw new RuntimeException("Stub!");
	}

	public final PublicKey getCAPublicKey() {
		throw new RuntimeException("Stub!");
	}

	public final byte[] getNameConstraints() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
