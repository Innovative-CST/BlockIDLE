package java.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

public final class URL implements Serializable {
	public URL(final String protocol, final String host, final int port, final String file)
			throws MalformedURLException {
		throw new RuntimeException("Stub!");
	}

	public URL(final String protocol, final String host, final String file) throws MalformedURLException {
		throw new RuntimeException("Stub!");
	}

	public URL(final String protocol, final String host, final int port, final String file,
			final URLStreamHandler handler) throws MalformedURLException {
		throw new RuntimeException("Stub!");
	}

	public URL(final String spec) throws MalformedURLException {
		throw new RuntimeException("Stub!");
	}

	public URL(final URL context, final String spec) throws MalformedURLException {
		throw new RuntimeException("Stub!");
	}

	public URL(final URL context, final String spec, final URLStreamHandler handler) throws MalformedURLException {
		throw new RuntimeException("Stub!");
	}

	public String getQuery() {
		throw new RuntimeException("Stub!");
	}

	public String getPath() {
		throw new RuntimeException("Stub!");
	}

	public String getUserInfo() {
		throw new RuntimeException("Stub!");
	}

	public String getAuthority() {
		throw new RuntimeException("Stub!");
	}

	public int getPort() {
		throw new RuntimeException("Stub!");
	}

	public int getDefaultPort() {
		throw new RuntimeException("Stub!");
	}

	public String getProtocol() {
		throw new RuntimeException("Stub!");
	}

	public String getHost() {
		throw new RuntimeException("Stub!");
	}

	public String getFile() {
		throw new RuntimeException("Stub!");
	}

	public String getRef() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized int hashCode() {
		throw new RuntimeException("Stub!");
	}

	public boolean sameFile(final URL other) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public String toExternalForm() {
		throw new RuntimeException("Stub!");
	}

	public URI toURI() throws URISyntaxException {
		throw new RuntimeException("Stub!");
	}

	public URLConnection openConnection() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public URLConnection openConnection(final Proxy proxy) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public InputStream openStream() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Object getContent() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Object getContent(final Class[] classes) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static void setURLStreamHandlerFactory(final URLStreamHandlerFactory fac) {
		throw new RuntimeException("Stub!");
	}
}
