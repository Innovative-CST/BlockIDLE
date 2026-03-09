package java.nio.channels;

import java.io.IOException;
import java.nio.channels.spi.AsynchronousChannelProvider;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public abstract class AsynchronousChannelGroup {
	protected AsynchronousChannelGroup(final AsynchronousChannelProvider provider) {
		throw new RuntimeException("Stub!");
	}

	public final AsynchronousChannelProvider provider() {
		throw new RuntimeException("Stub!");
	}

	public static AsynchronousChannelGroup withFixedThreadPool(final int nThreads, final ThreadFactory threadFactory)
			throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static AsynchronousChannelGroup withCachedThreadPool(final ExecutorService executor, final int initialSize)
			throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static AsynchronousChannelGroup withThreadPool(final ExecutorService executor) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public abstract boolean isShutdown();

	public abstract boolean isTerminated();

	public abstract void shutdown();

	public abstract void shutdownNow() throws IOException;

	public abstract boolean awaitTermination(final long p0, final TimeUnit p1) throws InterruptedException;
}
