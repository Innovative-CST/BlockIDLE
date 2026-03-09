package java.nio.channels;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.nio.channels.spi.SelectorProvider;

public abstract class ServerSocketChannel extends AbstractSelectableChannel implements NetworkChannel {
	protected ServerSocketChannel(final SelectorProvider provider) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public static ServerSocketChannel open() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final int validOps() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final ServerSocketChannel bind(final SocketAddress local) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public abstract ServerSocketChannel bind(final SocketAddress p0, final int p1) throws IOException;

	@Override
	public abstract <T> ServerSocketChannel setOption(final SocketOption<T> p0, final T p1) throws IOException;

	public abstract ServerSocket socket();

	public abstract SocketChannel accept() throws IOException;

	@Override
	public abstract SocketAddress getLocalAddress() throws IOException;
}
