package java.nio.channels;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.nio.ByteBuffer;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.nio.channels.spi.SelectorProvider;

public abstract class SocketChannel extends AbstractSelectableChannel
		implements ByteChannel, ScatteringByteChannel, GatheringByteChannel, NetworkChannel {
	protected SocketChannel(final SelectorProvider provider) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public static SocketChannel open() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static SocketChannel open(final SocketAddress remote) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final int validOps() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract SocketChannel bind(final SocketAddress p0) throws IOException;

	@Override
	public abstract <T> SocketChannel setOption(final SocketOption<T> p0, final T p1) throws IOException;

	public abstract SocketChannel shutdownInput() throws IOException;

	public abstract SocketChannel shutdownOutput() throws IOException;

	public abstract Socket socket();

	public abstract boolean isConnected();

	public abstract boolean isConnectionPending();

	public abstract boolean connect(final SocketAddress p0) throws IOException;

	public abstract boolean finishConnect() throws IOException;

	public abstract SocketAddress getRemoteAddress() throws IOException;

	@Override
	public abstract int read(final ByteBuffer p0) throws IOException;

	@Override
	public abstract long read(final ByteBuffer[] p0, final int p1, final int p2) throws IOException;

	@Override
	public final long read(final ByteBuffer[] dsts) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract int write(final ByteBuffer p0) throws IOException;

	@Override
	public abstract long write(final ByteBuffer[] p0, final int p1, final int p2) throws IOException;

	@Override
	public final long write(final ByteBuffer[] srcs) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract SocketAddress getLocalAddress() throws IOException;
}
