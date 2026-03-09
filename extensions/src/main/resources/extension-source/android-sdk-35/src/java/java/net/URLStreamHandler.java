package java.net;

import java.io.IOException;

public abstract class URLStreamHandler {
	public URLStreamHandler() {
		throw new RuntimeException("Stub!");
	}

	protected abstract URLConnection openConnection(final URL p0) throws IOException;

	protected URLConnection openConnection(final URL u, final Proxy p) throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected void parseURL(final URL u, final String spec, final int start, final int limit) {
		throw new RuntimeException("Stub!");
	}

	protected int getDefaultPort() {
		throw new RuntimeException("Stub!");
	}

	protected boolean equals(final URL u1, final URL u2) {
		throw new RuntimeException("Stub!");
	}

	protected int hashCode(final URL u) {
		throw new RuntimeException("Stub!");
	}

	protected boolean sameFile(final URL u1, final URL u2) {
		throw new RuntimeException("Stub!");
	}

	protected synchronized InetAddress getHostAddress(final URL u) {
		throw new RuntimeException("Stub!");
	}

	protected boolean hostsEqual(final URL u1, final URL u2) {
		throw new RuntimeException("Stub!");
	}

	protected String toExternalForm(final URL u) {
		throw new RuntimeException("Stub!");
	}

	protected void setURL(final URL u, final String protocol, final String host, final int port, final String authority,
			final String userInfo, final String path, final String query, final String ref) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	protected void setURL(final URL u, final String protocol, final String host, final int port, final String file,
			final String ref) {
		throw new RuntimeException("Stub!");
	}
}
