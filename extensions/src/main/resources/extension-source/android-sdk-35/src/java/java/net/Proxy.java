package java.net;

public class Proxy {
	public static final Proxy NO_PROXY;

	public Proxy(final Type type, final SocketAddress sa) {
		throw new RuntimeException("Stub!");
	}

	public Type type() {
		throw new RuntimeException("Stub!");
	}

	public SocketAddress address() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final boolean equals(final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final int hashCode() {
		throw new RuntimeException("Stub!");
	}

	static {
		NO_PROXY = null;
	}

	public enum Type {
		DIRECT, HTTP, SOCKS;
	}
}
