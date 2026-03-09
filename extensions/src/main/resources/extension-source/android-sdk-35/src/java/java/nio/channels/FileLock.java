package java.nio.channels;

import java.io.IOException;

public abstract class FileLock implements AutoCloseable {
	protected FileLock(final FileChannel channel, final long position, final long size, final boolean shared) {
		throw new RuntimeException("Stub!");
	}

	protected FileLock(final AsynchronousFileChannel channel, final long position, final long size,
			final boolean shared) {
		throw new RuntimeException("Stub!");
	}

	public final FileChannel channel() {
		throw new RuntimeException("Stub!");
	}

	public Channel acquiredBy() {
		throw new RuntimeException("Stub!");
	}

	public final long position() {
		throw new RuntimeException("Stub!");
	}

	public final long size() {
		throw new RuntimeException("Stub!");
	}

	public final boolean isShared() {
		throw new RuntimeException("Stub!");
	}

	public final boolean overlaps(final long position, final long size) {
		throw new RuntimeException("Stub!");
	}

	public abstract boolean isValid();

	public abstract void release() throws IOException;

	@Override
	public final void close() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final String toString() {
		throw new RuntimeException("Stub!");
	}
}
