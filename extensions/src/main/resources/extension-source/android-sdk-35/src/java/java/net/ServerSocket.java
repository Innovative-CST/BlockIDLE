package java.net;

import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.ServerSocketChannel;
import java.util.Set;

public class ServerSocket implements Closeable {
	public ServerSocket() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public ServerSocket(final int port) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public ServerSocket(final int port, final int backlog) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public ServerSocket(final int port, final int backlog, final InetAddress bindAddr) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void bind(final SocketAddress endpoint) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void bind(final SocketAddress endpoint, final int backlog) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public InetAddress getInetAddress() {
		throw new RuntimeException("Stub!");
	}

	public int getLocalPort() {
		throw new RuntimeException("Stub!");
	}

	public SocketAddress getLocalSocketAddress() {
		throw new RuntimeException("Stub!");
	}

	public Socket accept() throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected final void implAccept(final Socket s) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public ServerSocketChannel getChannel() {
		throw new RuntimeException("Stub!");
	}

	public boolean isBound() {
		throw new RuntimeException("Stub!");
	}

	public boolean isClosed() {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setSoTimeout(final int timeout) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public synchronized int getSoTimeout() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void setReuseAddress(final boolean on) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public boolean getReuseAddress() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public static synchronized void setSocketFactory(final SocketImplFactory fac) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setReceiveBufferSize(final int size) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public synchronized int getReceiveBufferSize() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public void setPerformancePreferences(final int connectionTime, final int latency, final int bandwidth) {
		throw new RuntimeException("Stub!");
	}

	public <T> ServerSocket setOption(final SocketOption<T> name, final T value) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public <T> T getOption(final SocketOption<T> name) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Set<SocketOption<?>> supportedOptions() {
		throw new RuntimeException("Stub!");
	}
}
