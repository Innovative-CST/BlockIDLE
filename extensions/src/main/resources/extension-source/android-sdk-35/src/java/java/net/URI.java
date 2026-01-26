package java.net;

import java.io.Serializable;

public final class URI implements Comparable<URI>, Serializable {
	public URI(final String str) throws URISyntaxException {
		throw new RuntimeException("Stub!");
	}

	public URI(final String scheme, final String userInfo, final String host, final int port, final String path,
			final String query, final String fragment) throws URISyntaxException {
		throw new RuntimeException("Stub!");
	}

	public URI(final String scheme, final String authority, final String path, final String query,
			final String fragment) throws URISyntaxException {
		throw new RuntimeException("Stub!");
	}

	public URI(final String scheme, final String host, final String path, final String fragment)
			throws URISyntaxException {
		throw new RuntimeException("Stub!");
	}

	public URI(final String scheme, final String ssp, final String fragment) throws URISyntaxException {
		throw new RuntimeException("Stub!");
	}

	public static URI create(final String str) {
		throw new RuntimeException("Stub!");
	}

	public URI parseServerAuthority() throws URISyntaxException {
		throw new RuntimeException("Stub!");
	}

	public URI normalize() {
		throw new RuntimeException("Stub!");
	}

	public URI resolve(final URI uri) {
		throw new RuntimeException("Stub!");
	}

	public URI resolve(final String str) {
		throw new RuntimeException("Stub!");
	}

	public URI relativize(final URI uri) {
		throw new RuntimeException("Stub!");
	}

	public URL toURL() throws MalformedURLException {
		throw new RuntimeException("Stub!");
	}

	public String getScheme() {
		throw new RuntimeException("Stub!");
	}

	public boolean isAbsolute() {
		throw new RuntimeException("Stub!");
	}

	public boolean isOpaque() {
		throw new RuntimeException("Stub!");
	}

	public String getRawSchemeSpecificPart() {
		throw new RuntimeException("Stub!");
	}

	public String getSchemeSpecificPart() {
		throw new RuntimeException("Stub!");
	}

	public String getRawAuthority() {
		throw new RuntimeException("Stub!");
	}

	public String getAuthority() {
		throw new RuntimeException("Stub!");
	}

	public String getRawUserInfo() {
		throw new RuntimeException("Stub!");
	}

	public String getUserInfo() {
		throw new RuntimeException("Stub!");
	}

	public String getHost() {
		throw new RuntimeException("Stub!");
	}

	public int getPort() {
		throw new RuntimeException("Stub!");
	}

	public String getRawPath() {
		throw new RuntimeException("Stub!");
	}

	public String getPath() {
		throw new RuntimeException("Stub!");
	}

	public String getRawQuery() {
		throw new RuntimeException("Stub!");
	}

	public String getQuery() {
		throw new RuntimeException("Stub!");
	}

	public String getRawFragment() {
		throw new RuntimeException("Stub!");
	}

	public String getFragment() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object ob) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(final URI that) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public String toASCIIString() {
		throw new RuntimeException("Stub!");
	}
}
