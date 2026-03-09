package java.nio.channels.spi;

import java.io.IOException;
import java.nio.channels.AsynchronousChannelGroup;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public abstract class AsynchronousChannelProvider {
	protected AsynchronousChannelProvider() {
		throw new RuntimeException("Stub!");
	}

	public static AsynchronousChannelProvider provider() {
		throw new RuntimeException("Stub!");
	}

	public abstract AsynchronousChannelGroup openAsynchronousChannelGroup(final int p0, final ThreadFactory p1)
			throws IOException;

	public abstract AsynchronousChannelGroup openAsynchronousChannelGroup(final ExecutorService p0, final int p1)
			throws IOException;

	public abstract AsynchronousServerSocketChannel openAsynchronousServerSocketChannel(
			final AsynchronousChannelGroup p0) throws IOException;

	public abstract AsynchronousSocketChannel openAsynchronousSocketChannel(final AsynchronousChannelGroup p0)
			throws IOException;
}
