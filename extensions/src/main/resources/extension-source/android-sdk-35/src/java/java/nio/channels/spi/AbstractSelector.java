package java.nio.channels.spi;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Set;

public abstract class AbstractSelector extends Selector {
	protected AbstractSelector(final SelectorProvider provider) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final void close() throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected abstract void implCloseSelector() throws IOException;

	@Override
	public final boolean isOpen() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final SelectorProvider provider() {
		throw new RuntimeException("Stub!");
	}

	protected final Set<SelectionKey> cancelledKeys() {
		throw new RuntimeException("Stub!");
	}

	protected abstract SelectionKey register(final AbstractSelectableChannel p0, final int p1, final Object p2);

	protected final void deregister(final AbstractSelectionKey key) {
		throw new RuntimeException("Stub!");
	}

	protected final void begin() {
		throw new RuntimeException("Stub!");
	}

	protected final void end() {
		throw new RuntimeException("Stub!");
	}
}
