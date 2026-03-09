package java.nio.channels;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ProtocolFamily;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.nio.ByteBuffer;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.nio.channels.spi.SelectorProvider;

public abstract class DatagramChannel extends AbstractSelectableChannel
		implements ByteChannel, ScatteringByteChannel, GatheringByteChannel, MulticastChannel {
	protected DatagramChannel(final SelectorProvider provider) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public static DatagramChannel open() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static DatagramChannel open(final ProtocolFamily family) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final int validOps() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract DatagramChannel bind(final SocketAddress p0) throws IOException;

	@Override
	public abstract <T> DatagramChannel setOption(final SocketOption<T> p0, final T p1) throws IOException;

	public abstract DatagramSocket socket();

	public abstract boolean isConnected();

	public abstract DatagramChannel connect(final SocketAddress p0) throws IOException;

	public abstract DatagramChannel disconnect() throws IOException;

	public abstract SocketAddress getRemoteAddress() throws IOException;

	public abstract SocketAddress receive(final ByteBuffer p0) throws IOException;

	public abstract int send(final ByteBuffer p0, final SocketAddress p1) throws IOException;

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
