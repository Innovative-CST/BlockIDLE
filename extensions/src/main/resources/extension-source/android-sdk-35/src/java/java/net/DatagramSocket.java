package java.net;

import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.DatagramChannel;
import java.util.Set;

public class DatagramSocket implements Closeable {
	public DatagramSocket() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	protected DatagramSocket(final DatagramSocketImpl impl) {
		throw new RuntimeException("Stub!");
	}

	public DatagramSocket(final SocketAddress bindaddr) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public DatagramSocket(final int port) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public DatagramSocket(final int port, final InetAddress laddr) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public synchronized void bind(final SocketAddress addr) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public void connect(final InetAddress address, final int port) {
		throw new RuntimeException("Stub!");
	}

	public void connect(final SocketAddress addr) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public void disconnect() {
		throw new RuntimeException("Stub!");
	}

	public boolean isBound() {
		throw new RuntimeException("Stub!");
	}

	public boolean isConnected() {
		throw new RuntimeException("Stub!");
	}

	public InetAddress getInetAddress() {
		throw new RuntimeException("Stub!");
	}

	public int getPort() {
		throw new RuntimeException("Stub!");
	}

	public SocketAddress getRemoteSocketAddress() {
		throw new RuntimeException("Stub!");
	}

	public SocketAddress getLocalSocketAddress() {
		throw new RuntimeException("Stub!");
	}

	public void send(final DatagramPacket p) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public synchronized void receive(final DatagramPacket p) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public InetAddress getLocalAddress() {
		throw new RuntimeException("Stub!");
	}

	public int getLocalPort() {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setSoTimeout(final int timeout) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public synchronized int getSoTimeout() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setSendBufferSize(final int size) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public synchronized int getSendBufferSize() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setReceiveBufferSize(final int size) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public synchronized int getReceiveBufferSize() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setReuseAddress(final boolean on) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean getReuseAddress() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setBroadcast(final boolean on) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean getBroadcast() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setTrafficClass(final int tc) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public synchronized int getTrafficClass() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() {
		throw new RuntimeException("Stub!");
	}

	public boolean isClosed() {
		throw new RuntimeException("Stub!");
	}

	public DatagramChannel getChannel() {
		throw new RuntimeException("Stub!");
	}

	public static synchronized void setDatagramSocketImplFactory(final DatagramSocketImplFactory fac)
			throws IOException {
		throw new RuntimeException("Stub!");
	}

	public <T> DatagramSocket setOption(final SocketOption<T> name, final T value) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public <T> T getOption(final SocketOption<T> name) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Set<SocketOption<?>> supportedOptions() {
		throw new RuntimeException("Stub!");
	}
}
