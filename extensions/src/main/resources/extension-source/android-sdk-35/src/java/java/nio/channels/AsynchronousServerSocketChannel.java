package java.nio.channels;

import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.nio.channels.spi.AsynchronousChannelProvider;
import java.util.concurrent.Future;

public abstract class AsynchronousServerSocketChannel implements AsynchronousChannel, NetworkChannel {
	protected AsynchronousServerSocketChannel(final AsynchronousChannelProvider provider) {
		throw new RuntimeException("Stub!");
	}

	public final AsynchronousChannelProvider provider() {
		throw new RuntimeException("Stub!");
	}

	public static AsynchronousServerSocketChannel open(final AsynchronousChannelGroup group) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static AsynchronousServerSocketChannel open() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final AsynchronousServerSocketChannel bind(final SocketAddress local) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public abstract AsynchronousServerSocketChannel bind(final SocketAddress p0, final int p1) throws IOException;

	@Override
	public abstract <T> AsynchronousServerSocketChannel setOption(final SocketOption<T> p0, final T p1)
			throws IOException;

	public abstract <A> void accept(final A p0, final CompletionHandler<AsynchronousSocketChannel, ? super A> p1);

	public abstract Future<AsynchronousSocketChannel> accept();

	@Override
	public abstract SocketAddress getLocalAddress() throws IOException;
}
