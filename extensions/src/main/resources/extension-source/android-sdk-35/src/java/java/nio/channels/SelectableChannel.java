package java.nio.channels;

import java.io.IOException;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.nio.channels.spi.SelectorProvider;

public abstract class SelectableChannel extends AbstractInterruptibleChannel implements Channel {
	protected SelectableChannel() {
		throw new RuntimeException("Stub!");
	}

	public abstract SelectorProvider provider();

	public abstract int validOps();

	public abstract boolean isRegistered();

	public abstract SelectionKey keyFor(final Selector p0);

	public abstract SelectionKey register(final Selector p0, final int p1, final Object p2)
			throws ClosedChannelException;

	public final SelectionKey register(final Selector sel, final int ops) throws ClosedChannelException {
		throw new RuntimeException("Stub!");
	}

	public abstract SelectableChannel configureBlocking(final boolean p0) throws IOException;

	public abstract boolean isBlocking();

	public abstract Object blockingLock();
}
