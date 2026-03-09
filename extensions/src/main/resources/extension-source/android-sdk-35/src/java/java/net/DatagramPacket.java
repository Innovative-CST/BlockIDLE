package java.net;

public final class DatagramPacket {
	public DatagramPacket(final byte[] buf, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public DatagramPacket(final byte[] buf, final int length) {
		throw new RuntimeException("Stub!");
	}

	public DatagramPacket(final byte[] buf, final int offset, final int length, final InetAddress address,
			final int port) {
		throw new RuntimeException("Stub!");
	}

	public DatagramPacket(final byte[] buf, final int offset, final int length, final SocketAddress address) {
		throw new RuntimeException("Stub!");
	}

	public DatagramPacket(final byte[] buf, final int length, final InetAddress address, final int port) {
		throw new RuntimeException("Stub!");
	}

	public DatagramPacket(final byte[] buf, final int length, final SocketAddress address) {
		throw new RuntimeException("Stub!");
	}

	public synchronized InetAddress getAddress() {
		throw new RuntimeException("Stub!");
	}

	public synchronized int getPort() {
		throw new RuntimeException("Stub!");
	}

	public synchronized byte[] getData() {
		throw new RuntimeException("Stub!");
	}

	public synchronized int getOffset() {
		throw new RuntimeException("Stub!");
	}

	public synchronized int getLength() {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setData(final byte[] buf, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setAddress(final InetAddress iaddr) {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setPort(final int iport) {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setSocketAddress(final SocketAddress address) {
		throw new RuntimeException("Stub!");
	}

	public synchronized SocketAddress getSocketAddress() {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setData(final byte[] buf) {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setLength(final int length) {
		throw new RuntimeException("Stub!");
	}
}
