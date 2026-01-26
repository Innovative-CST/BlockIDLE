package java.net;

public final class Inet6Address extends InetAddress {
	Inet6Address() {
		throw new RuntimeException("Stub!");
	}

	public static Inet6Address getByAddress(final String host, final byte[] addr, final NetworkInterface nif)
			throws UnknownHostException {
		throw new RuntimeException("Stub!");
	}

	public static Inet6Address getByAddress(final String host, final byte[] addr, final int scope_id)
			throws UnknownHostException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isMulticastAddress() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isAnyLocalAddress() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isLoopbackAddress() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isLinkLocalAddress() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isSiteLocalAddress() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isMCGlobal() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isMCNodeLocal() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isMCLinkLocal() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isMCSiteLocal() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isMCOrgLocal() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public byte[] getAddress() {
		throw new RuntimeException("Stub!");
	}

	public int getScopeId() {
		throw new RuntimeException("Stub!");
	}

	public NetworkInterface getScopedInterface() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String getHostAddress() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object obj) {
		throw new RuntimeException("Stub!");
	}

	public boolean isIPv4CompatibleAddress() {
		throw new RuntimeException("Stub!");
	}
}
