package java.net;

import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Set;

public abstract class DatagramSocketImpl implements SocketOptions {
	protected FileDescriptor fd;
	protected int localPort;

	public DatagramSocketImpl() {
		throw new RuntimeException("Stub!");
	}

	protected abstract void create() throws SocketException;

	protected abstract void bind(final int p0, final InetAddress p1) throws SocketException;

	protected abstract void send(final DatagramPacket p0) throws IOException;

	protected void connect(final InetAddress address, final int port) throws SocketException {
		throw new RuntimeException("Stub!");
	}

	protected void disconnect() {
		throw new RuntimeException("Stub!");
	}

	protected abstract int peek(final InetAddress p0) throws IOException;

	protected abstract int peekData(final DatagramPacket p0) throws IOException;

	protected abstract void receive(final DatagramPacket p0) throws IOException;

	@Deprecated
	protected abstract void setTTL(final byte p0) throws IOException;

	@Deprecated
	protected abstract byte getTTL() throws IOException;

	protected abstract void setTimeToLive(final int p0) throws IOException;

	protected abstract int getTimeToLive() throws IOException;

	protected abstract void join(final InetAddress p0) throws IOException;

	protected abstract void leave(final InetAddress p0) throws IOException;

	protected abstract void joinGroup(final SocketAddress p0, final NetworkInterface p1) throws IOException;

	protected abstract void leaveGroup(final SocketAddress p0, final NetworkInterface p1) throws IOException;

	protected abstract void close();

	protected int getLocalPort() {
		throw new RuntimeException("Stub!");
	}

	protected FileDescriptor getFileDescriptor() {
		throw new RuntimeException("Stub!");
	}

	protected <T> void setOption(final SocketOption<T> name, final T value) throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected <T> T getOption(final SocketOption<T> name) throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected Set<SocketOption<?>> supportedOptions() {
		throw new RuntimeException("Stub!");
	}
}
