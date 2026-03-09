package java.net;

import java.io.IOException;
import java.util.List;

public abstract class ProxySelector {
	public ProxySelector() {
		throw new RuntimeException("Stub!");
	}

	public static ProxySelector getDefault() {
		throw new RuntimeException("Stub!");
	}

	public static void setDefault(final ProxySelector ps) {
		throw new RuntimeException("Stub!");
	}

	public abstract List<Proxy> select(final URI p0);

	public abstract void connectFailed(final URI p0, final SocketAddress p1, final IOException p2);
}
