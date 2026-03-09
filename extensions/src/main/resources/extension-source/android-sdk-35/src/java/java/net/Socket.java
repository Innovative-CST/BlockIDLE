package java.net;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.SocketChannel;
import java.util.Set;

public class Socket implements Closeable {
	public Socket() {
		throw new RuntimeException("Stub!");
	}

	public Socket(final Proxy proxy) {
		throw new RuntimeException("Stub!");
	}

	protected Socket(final SocketImpl impl) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public Socket(final String host, final int port) throws IOException, UnknownHostException {
		throw new RuntimeException("Stub!");
	}

	public Socket(final InetAddress address, final int port) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Socket(final String host, final int port, final InetAddress localAddr, final int localPort)
			throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Socket(final InetAddress address, final int port, final InetAddress localAddr, final int localPort)
			throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public Socket(final String host, final int port, final boolean stream) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public Socket(final InetAddress host, final int port, final boolean stream) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void connect(final SocketAddress endpoint) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void connect(final SocketAddress endpoint, final int timeout) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void bind(final SocketAddress bindpoint) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public InetAddress getInetAddress() {
		throw new RuntimeException("Stub!");
	}

	public InetAddress getLocalAddress() {
		throw new RuntimeException("Stub!");
	}

	public int getPort() {
		throw new RuntimeException("Stub!");
	}

	public int getLocalPort() {
		throw new RuntimeException("Stub!");
	}

	public SocketAddress getRemoteSocketAddress() {
		throw new RuntimeException("Stub!");
	}

	public SocketAddress getLocalSocketAddress() {
		throw new RuntimeException("Stub!");
	}

	public SocketChannel getChannel() {
		throw new RuntimeException("Stub!");
	}

	public InputStream getInputStream() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public OutputStream getOutputStream() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void setTcpNoDelay(final boolean on) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public boolean getTcpNoDelay() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public void setSoLinger(final boolean on, final int linger) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public int getSoLinger() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public void sendUrgentData(final int data) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void setOOBInline(final boolean on) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public boolean getOOBInline() throws SocketException {
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

	public void setKeepAlive(final boolean on) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public boolean getKeepAlive() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public void setTrafficClass(final int tc) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public int getTrafficClass() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public void setReuseAddress(final boolean on) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	public boolean getReuseAddress() throws SocketException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void close() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void shutdownInput() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void shutdownOutput() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public boolean isConnected() {
		throw new RuntimeException("Stub!");
	}

	public boolean isBound() {
		throw new RuntimeException("Stub!");
	}

	public boolean isClosed() {
		throw new RuntimeException("Stub!");
	}

	public boolean isInputShutdown() {
		throw new RuntimeException("Stub!");
	}

	public boolean isOutputShutdown() {
		throw new RuntimeException("Stub!");
	}

	public static synchronized void setSocketImplFactory(final SocketImplFactory fac) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void setPerformancePreferences(final int connectionTime, final int latency, final int bandwidth) {
		throw new RuntimeException("Stub!");
	}

	public <T> Socket setOption(final SocketOption<T> name, final T value) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public <T> T getOption(final SocketOption<T> name) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Set<SocketOption<?>> supportedOptions() {
		throw new RuntimeException("Stub!");
	}
}
