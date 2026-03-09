package java.net;

import java.util.List;

public final class HttpCookie implements Cloneable {
	public HttpCookie(final String name, final String value) {
		throw new RuntimeException("Stub!");
	}

	public static List<HttpCookie> parse(final String header) {
		throw new RuntimeException("Stub!");
	}

	public boolean hasExpired() {
		throw new RuntimeException("Stub!");
	}

	public void setComment(final String purpose) {
		throw new RuntimeException("Stub!");
	}

	public String getComment() {
		throw new RuntimeException("Stub!");
	}

	public void setCommentURL(final String purpose) {
		throw new RuntimeException("Stub!");
	}

	public String getCommentURL() {
		throw new RuntimeException("Stub!");
	}

	public void setDiscard(final boolean discard) {
		throw new RuntimeException("Stub!");
	}

	public boolean getDiscard() {
		throw new RuntimeException("Stub!");
	}

	public void setPortlist(final String ports) {
		throw new RuntimeException("Stub!");
	}

	public String getPortlist() {
		throw new RuntimeException("Stub!");
	}

	public void setDomain(final String pattern) {
		throw new RuntimeException("Stub!");
	}

	public String getDomain() {
		throw new RuntimeException("Stub!");
	}

	public void setMaxAge(final long expiry) {
		throw new RuntimeException("Stub!");
	}

	public long getMaxAge() {
		throw new RuntimeException("Stub!");
	}

	public void setPath(final String uri) {
		throw new RuntimeException("Stub!");
	}

	public String getPath() {
		throw new RuntimeException("Stub!");
	}

	public void setSecure(final boolean flag) {
		throw new RuntimeException("Stub!");
	}

	public boolean getSecure() {
		throw new RuntimeException("Stub!");
	}

	public String getName() {
		throw new RuntimeException("Stub!");
	}

	public void setValue(final String newValue) {
		throw new RuntimeException("Stub!");
	}

	public String getValue() {
		throw new RuntimeException("Stub!");
	}

	public int getVersion() {
		throw new RuntimeException("Stub!");
	}

	public void setVersion(final int v) {
		throw new RuntimeException("Stub!");
	}

	public boolean isHttpOnly() {
		throw new RuntimeException("Stub!");
	}

	public void setHttpOnly(final boolean httpOnly) {
		throw new RuntimeException("Stub!");
	}

	public static boolean domainMatches(final String domain, final String host) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	public Object clone() {
		throw new RuntimeException("Stub!");
	}
}
