package java.nio.channels;

import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.spi.SelectorProvider;
import java.util.Set;
import java.util.function.Consumer;

public abstract class Selector implements Closeable {
	protected Selector() {
		throw new RuntimeException("Stub!");
	}

	public static Selector open() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public abstract boolean isOpen();

	public abstract SelectorProvider provider();

	public abstract Set<SelectionKey> keys();

	public abstract Set<SelectionKey> selectedKeys();

	public abstract int selectNow() throws IOException;

	public abstract int select(final long p0) throws IOException;

	public abstract int select() throws IOException;

	public int select(final Consumer<SelectionKey> action, final long timeout) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public int select(final Consumer<SelectionKey> action) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public int selectNow(final Consumer<SelectionKey> action) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public abstract Selector wakeup();

	@Override
	public abstract void close() throws IOException;
}
