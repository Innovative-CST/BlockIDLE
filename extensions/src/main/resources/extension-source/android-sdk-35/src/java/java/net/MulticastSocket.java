package java.net;

import java.io.IOException;
import java.util.Set;

public class MulticastSocket extends DatagramSocket {
	public MulticastSocket() throws IOException {
		super((DatagramSocketImpl) null);
		throw new RuntimeException("Stub!");
	}

	public MulticastSocket(final int port) throws IOException {
		super((DatagramSocketImpl) null);
		throw new RuntimeException("Stub!");
	}

	public MulticastSocket(final SocketAddress bindaddr) throws IOException {
		super((DatagramSocketImpl) null);
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void setTTL(final byte ttl) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void setTimeToLive(final int ttl) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public byte getTTL() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public int getTimeToLive() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void joinGroup(final InetAddress mcastaddr) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void leaveGroup(final InetAddress mcastaddr) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void joinGroup(final SocketAddress mcastaddr, final NetworkInterface netIf) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void leaveGroup(final SocketAddress mcastaddr, final NetworkInterface netIf) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void setInterface(final InetAddress inf) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public InetAddress getInterface() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public void setNetworkInterface(final NetworkInterface netIf) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public NetworkInterface getNetworkInterface() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public void setLoopbackMode(final boolean disable) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public boolean getLoopbackMode() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void send(final DatagramPacket p, final byte ttl) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Set<SocketOption<?>> supportedOptions() {
		throw new RuntimeException("Stub!");
	}
}
