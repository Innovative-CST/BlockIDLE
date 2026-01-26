package java.security;

import java.io.Serializable;
import java.net.URL;
import java.security.cert.Certificate;

public class CodeSource implements Serializable {
	public CodeSource(final URL url, final Certificate[] certs) {
		throw new RuntimeException("Stub!");
	}

	public CodeSource(final URL url, final CodeSigner[] signers) {
		throw new RuntimeException("Stub!");
	}

	public final URL getLocation() {
		throw new RuntimeException("Stub!");
	}

	public final Certificate[] getCertificates() {
		throw new RuntimeException("Stub!");
	}

	public final CodeSigner[] getCodeSigners() {
		throw new RuntimeException("Stub!");
	}

	public boolean implies(final CodeSource codesource) {
		throw new RuntimeException("Stub!");
	}
}
