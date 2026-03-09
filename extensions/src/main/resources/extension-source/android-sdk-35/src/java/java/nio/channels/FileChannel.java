package java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Set;

public abstract class FileChannel extends AbstractInterruptibleChannel
		implements SeekableByteChannel, GatheringByteChannel, ScatteringByteChannel {
	protected FileChannel() {
		throw new RuntimeException("Stub!");
	}

	public static FileChannel open(final Path path, final Set<? extends OpenOption> options,
			final FileAttribute<?>... attrs) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static FileChannel open(final Path path, final OpenOption... options) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract int read(final ByteBuffer p0) throws IOException;

	@Override
	public abstract long read(final ByteBuffer[] p0, final int p1, final int p2) throws IOException;

	@Override
	public final long read(final ByteBuffer[] dsts) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract int write(final ByteBuffer p0) throws IOException;

	@Override
	public abstract long write(final ByteBuffer[] p0, final int p1, final int p2) throws IOException;

	@Override
	public final long write(final ByteBuffer[] srcs) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract long position() throws IOException;

	@Override
	public abstract FileChannel position(final long p0) throws IOException;

	@Override
	public abstract long size() throws IOException;

	@Override
	public abstract FileChannel truncate(final long p0) throws IOException;

	public abstract void force(final boolean p0) throws IOException;

	public abstract long transferTo(final long p0, final long p1, final WritableByteChannel p2) throws IOException;

	public abstract long transferFrom(final ReadableByteChannel p0, final long p1, final long p2) throws IOException;

	public abstract int read(final ByteBuffer p0, final long p1) throws IOException;

	public abstract int write(final ByteBuffer p0, final long p1) throws IOException;

	public abstract MappedByteBuffer map(final MapMode p0, final long p1, final long p2) throws IOException;

	public abstract FileLock lock(final long p0, final long p1, final boolean p2) throws IOException;

	public final FileLock lock() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public abstract FileLock tryLock(final long p0, final long p1, final boolean p2) throws IOException;

	public final FileLock tryLock() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static class MapMode {
		public static final MapMode PRIVATE;
		public static final MapMode READ_ONLY;
		public static final MapMode READ_WRITE;

		MapMode() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public String toString() {
			throw new RuntimeException("Stub!");
		}

		static {
			PRIVATE = null;
			READ_ONLY = null;
			READ_WRITE = null;
		}
	}
}
