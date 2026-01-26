package java.nio.channels.spi;

import java.io.IOException;
import java.nio.channels.AsynchronousCloseException;
import java.nio.channels.Channel;
import java.nio.channels.InterruptibleChannel;

public abstract class AbstractInterruptibleChannel implements Channel, InterruptibleChannel {
	protected AbstractInterruptibleChannel() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final void close() throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected abstract void implCloseChannel() throws IOException;

	@Override
	public final boolean isOpen() {
		throw new RuntimeException("Stub!");
	}

	protected final void begin() {
		throw new RuntimeException("Stub!");
	}

	protected final void end(final boolean completed) throws AsynchronousCloseException {
		throw new RuntimeException("Stub!");
	}
}
