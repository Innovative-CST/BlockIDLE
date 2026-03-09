package java.net;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;

public abstract class SocketImpl implements SocketOptions {
	protected InetAddress address;
	protected FileDescriptor fd;
	protected int localport;
	protected int port;

	public SocketImpl() {
		throw new RuntimeException("Stub!");
	}

	protected abstract void create(final boolean p0) throws IOException;

	protected abstract void connect(final String p0, final int p1) throws IOException;

	protected abstract void connect(final InetAddress p0, final int p1) throws IOException;

	protected abstract void connect(final SocketAddress p0, final int p1) throws IOException;

	protected abstract void bind(final InetAddress p0, final int p1) throws IOException;

	protected abstract void listen(final int p0) throws IOException;

	protected abstract void accept(final SocketImpl p0) throws IOException;

	protected abstract InputStream getInputStream() throws IOException;

	protected abstract OutputStream getOutputStream() throws IOException;

	protected abstract int available() throws IOException;

	protected abstract void close() throws IOException;

	protected void shutdownInput() throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected void shutdownOutput() throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected FileDescriptor getFileDescriptor() {
		throw new RuntimeException("Stub!");
	}

	protected InetAddress getInetAddress() {
		throw new RuntimeException("Stub!");
	}

	protected int getPort() {
		throw new RuntimeException("Stub!");
	}

	protected boolean supportsUrgentData() {
		throw new RuntimeException("Stub!");
	}

	protected abstract void sendUrgentData(final int p0) throws IOException;

	protected int getLocalPort() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	protected void setPerformancePreferences(final int connectionTime, final int latency, final int bandwidth) {
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
