package java.security.cert;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Set;

public class PKIXBuilderParameters extends PKIXParameters {
	public PKIXBuilderParameters(final Set<TrustAnchor> trustAnchors, final CertSelector targetConstraints)
			throws InvalidAlgorithmParameterException {
		super((Set<TrustAnchor>) null);
		throw new RuntimeException("Stub!");
	}

	public PKIXBuilderParameters(final KeyStore keystore, final CertSelector targetConstraints)
			throws InvalidAlgorithmParameterException, KeyStoreException {
		super((Set<TrustAnchor>) null);
		throw new RuntimeException("Stub!");
	}

	public void setMaxPathLength(final int maxPathLength) {
		throw new RuntimeException("Stub!");
	}

	public int getMaxPathLength() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
