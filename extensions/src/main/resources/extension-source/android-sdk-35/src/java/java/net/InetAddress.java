package java.net;

import java.io.IOException;
import java.io.Serializable;

public class InetAddress implements Serializable {
	InetAddress() {
		throw new RuntimeException("Stub!");
	}

	public boolean isMulticastAddress() {
		throw new RuntimeException("Stub!");
	}

	public boolean isAnyLocalAddress() {
		throw new RuntimeException("Stub!");
	}

	public boolean isLoopbackAddress() {
		throw new RuntimeException("Stub!");
	}

	public boolean isLinkLocalAddress() {
		throw new RuntimeException("Stub!");
	}

	public boolean isSiteLocalAddress() {
		throw new RuntimeException("Stub!");
	}

	public boolean isMCGlobal() {
		throw new RuntimeException("Stub!");
	}

	public boolean isMCNodeLocal() {
		throw new RuntimeException("Stub!");
	}

	public boolean isMCLinkLocal() {
		throw new RuntimeException("Stub!");
	}

	public boolean isMCSiteLocal() {
		throw new RuntimeException("Stub!");
	}

	public boolean isMCOrgLocal() {
		throw new RuntimeException("Stub!");
	}

	public boolean isReachable(final int timeout) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public boolean isReachable(@RecentlyNullable final NetworkInterface netif, final int ttl, final int timeout)
			throws IOException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getHostName() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getCanonicalHostName() {
		throw new RuntimeException("Stub!");
	}

	public byte[] getAddress() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public String getHostAddress() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static InetAddress getByAddress(@RecentlyNullable final String host, final byte[] addr)
			throws UnknownHostException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static InetAddress getByName(@RecentlyNullable final String host) throws UnknownHostException {
		throw new RuntimeException("Stub!");
	}

	public static InetAddress[] getAllByName(@RecentlyNullable final String host) throws UnknownHostException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static InetAddress getLoopbackAddress() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static InetAddress getByAddress(final byte[] addr) throws UnknownHostException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static InetAddress getLocalHost() throws UnknownHostException {
		throw new RuntimeException("Stub!");
	}
}
