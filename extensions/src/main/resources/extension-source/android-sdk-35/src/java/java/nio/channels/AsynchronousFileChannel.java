package java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public abstract class AsynchronousFileChannel implements AsynchronousChannel {
	protected AsynchronousFileChannel() {
		throw new RuntimeException("Stub!");
	}

	public static AsynchronousFileChannel open(final Path file, final Set<? extends OpenOption> options,
			final ExecutorService executor, final FileAttribute<?>... attrs) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static AsynchronousFileChannel open(final Path file, final OpenOption... options) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public abstract long size() throws IOException;

	public abstract AsynchronousFileChannel truncate(final long p0) throws IOException;

	public abstract void force(final boolean p0) throws IOException;

	public abstract <A> void lock(final long p0, final long p1, final boolean p2, final A p3,
			final CompletionHandler<FileLock, ? super A> p4);

	public final <A> void lock(final A attachment, final CompletionHandler<FileLock, ? super A> handler) {
		throw new RuntimeException("Stub!");
	}

	public abstract Future<FileLock> lock(final long p0, final long p1, final boolean p2);

	public final Future<FileLock> lock() {
		throw new RuntimeException("Stub!");
	}

	public abstract FileLock tryLock(final long p0, final long p1, final boolean p2) throws IOException;

	public final FileLock tryLock() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public abstract <A> void read(final ByteBuffer p0, final long p1, final A p2,
			final CompletionHandler<Integer, ? super A> p3);

	public abstract Future<Integer> read(final ByteBuffer p0, final long p1);

	public abstract <A> void write(final ByteBuffer p0, final long p1, final A p2,
			final CompletionHandler<Integer, ? super A> p3);

	public abstract Future<Integer> write(final ByteBuffer p0, final long p1);
}
