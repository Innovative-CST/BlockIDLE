package java.nio.channels.spi;

import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;

public abstract class AbstractSelectableChannel extends SelectableChannel {
	protected AbstractSelectableChannel(final SelectorProvider provider) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final SelectorProvider provider() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final boolean isRegistered() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final SelectionKey keyFor(final Selector sel) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final SelectionKey register(final Selector sel, final int ops, final Object att)
			throws ClosedChannelException {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected final void implCloseChannel() throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected abstract void implCloseSelectableChannel() throws IOException;

	@Override
	public final boolean isBlocking() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final Object blockingLock() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final SelectableChannel configureBlocking(final boolean block) throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected abstract void implConfigureBlocking(final boolean p0) throws IOException;
}
