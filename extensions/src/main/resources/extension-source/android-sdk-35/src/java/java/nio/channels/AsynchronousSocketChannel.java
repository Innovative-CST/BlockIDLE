package java.nio.channels;

import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.nio.ByteBuffer;
import java.nio.channels.spi.AsynchronousChannelProvider;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class AsynchronousSocketChannel implements AsynchronousByteChannel, NetworkChannel {
	protected AsynchronousSocketChannel(final AsynchronousChannelProvider provider) {
		throw new RuntimeException("Stub!");
	}

	public final AsynchronousChannelProvider provider() {
		throw new RuntimeException("Stub!");
	}

	public static AsynchronousSocketChannel open(final AsynchronousChannelGroup group) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static AsynchronousSocketChannel open() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract AsynchronousSocketChannel bind(final SocketAddress p0) throws IOException;

	@Override
	public abstract <T> AsynchronousSocketChannel setOption(final SocketOption<T> p0, final T p1) throws IOException;

	public abstract AsynchronousSocketChannel shutdownInput() throws IOException;

	public abstract AsynchronousSocketChannel shutdownOutput() throws IOException;

	public abstract SocketAddress getRemoteAddress() throws IOException;

	public abstract <A> void connect(final SocketAddress p0, final A p1, final CompletionHandler<Void, ? super A> p2);

	public abstract Future<Void> connect(final SocketAddress p0);

	public abstract <A> void read(final ByteBuffer p0, final long p1, final TimeUnit p2, final A p3,
			final CompletionHandler<Integer, ? super A> p4);

	@Override
	public final <A> void read(final ByteBuffer dst, final A attachment,
			final CompletionHandler<Integer, ? super A> handler) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract Future<Integer> read(final ByteBuffer p0);

	public abstract <A> void read(final ByteBuffer[] p0, final int p1, final int p2, final long p3, final TimeUnit p4,
			final A p5, final CompletionHandler<Long, ? super A> p6);

	public abstract <A> void write(final ByteBuffer p0, final long p1, final TimeUnit p2, final A p3,
			final CompletionHandler<Integer, ? super A> p4);

	@Override
	public final <A> void write(final ByteBuffer src, final A attachment,
			final CompletionHandler<Integer, ? super A> handler) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract Future<Integer> write(final ByteBuffer p0);

	public abstract <A> void write(final ByteBuffer[] p0, final int p1, final int p2, final long p3, final TimeUnit p4,
			final A p5, final CompletionHandler<Long, ? super A> p6);

	@Override
	public abstract SocketAddress getLocalAddress() throws IOException;
}
