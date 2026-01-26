package java.net;

public abstract class Authenticator {
	public Authenticator() {
		throw new RuntimeException("Stub!");
	}

	public static synchronized void setDefault(final Authenticator a) {
		throw new RuntimeException("Stub!");
	}

	public static PasswordAuthentication requestPasswordAuthentication(final InetAddress addr, final int port,
			final String protocol, final String prompt, final String scheme) {
		throw new RuntimeException("Stub!");
	}

	public static PasswordAuthentication requestPasswordAuthentication(final String host, final InetAddress addr,
			final int port, final String protocol, final String prompt, final String scheme) {
		throw new RuntimeException("Stub!");
	}

	public static PasswordAuthentication requestPasswordAuthentication(final String host, final InetAddress addr,
			final int port, final String protocol, final String prompt, final String scheme, final URL url,
			final RequestorType reqType) {
		throw new RuntimeException("Stub!");
	}

	protected final String getRequestingHost() {
		throw new RuntimeException("Stub!");
	}

	protected final InetAddress getRequestingSite() {
		throw new RuntimeException("Stub!");
	}

	protected final int getRequestingPort() {
		throw new RuntimeException("Stub!");
	}

	protected final String getRequestingProtocol() {
		throw new RuntimeException("Stub!");
	}

	protected final String getRequestingPrompt() {
		throw new RuntimeException("Stub!");
	}

	protected final String getRequestingScheme() {
		throw new RuntimeException("Stub!");
	}

	protected PasswordAuthentication getPasswordAuthentication() {
		throw new RuntimeException("Stub!");
	}

	protected URL getRequestingURL() {
		throw new RuntimeException("Stub!");
	}

	protected RequestorType getRequestorType() {
		throw new RuntimeException("Stub!");
	}

	public enum RequestorType {
		PROXY, SERVER;
	}
}
