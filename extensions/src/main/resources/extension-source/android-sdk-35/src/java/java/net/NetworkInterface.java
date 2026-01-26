package java.net;

import java.util.Enumeration;
import java.util.List;

public final class NetworkInterface {
	NetworkInterface() {
		throw new RuntimeException("Stub!");
	}

	public String getName() {
		throw new RuntimeException("Stub!");
	}

	public Enumeration<InetAddress> getInetAddresses() {
		throw new RuntimeException("Stub!");
	}

	public List<InterfaceAddress> getInterfaceAddresses() {
		throw new RuntimeException("Stub!");
	}

	public Enumeration<NetworkInterface> getSubInterfaces() {
		throw new RuntimeException("Stub!");
	}

	public NetworkInterface getParent() {
		throw new RuntimeException("Stub!");
	}

	public int getIndex() {
		throw new RuntimeException("Stub!");
	}

	public String getDisplayName() {
		throw new RuntimeException("Stub!");
	}

	public static NetworkInterface getByName(final String name) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public static NetworkInterface getByIndex(final int index) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public static NetworkInterface getByInetAddress(final InetAddress addr) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public static Enumeration<NetworkInterface> getNetworkInterfaces() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public boolean isUp() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public boolean isLoopback() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public boolean isPointToPoint() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public boolean supportsMulticast() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public byte[] getHardwareAddress() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public int getMTU() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public boolean isVirtual() {
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

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
