package java.nio.channels.spi;

import java.nio.channels.SelectionKey;

public abstract class AbstractSelectionKey extends SelectionKey {
	protected AbstractSelectionKey() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final boolean isValid() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final void cancel() {
		throw new RuntimeException("Stub!");
	}
}
