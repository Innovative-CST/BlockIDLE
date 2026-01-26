package java.nio.file.spi;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public abstract class FileSystemProvider {
	protected FileSystemProvider() {
		throw new RuntimeException("Stub!");
	}

	public static List<FileSystemProvider> installedProviders() {
		throw new RuntimeException("Stub!");
	}

	public abstract String getScheme();

	public abstract FileSystem newFileSystem(final URI p0, final Map<String, ?> p1) throws IOException;

	public abstract FileSystem getFileSystem(final URI p0);

	public abstract Path getPath(final URI p0);

	public FileSystem newFileSystem(final Path path, final Map<String, ?> env) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public InputStream newInputStream(final Path path, final OpenOption... options) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public OutputStream newOutputStream(final Path path, final OpenOption... options) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public FileChannel newFileChannel(final Path path, final Set<? extends OpenOption> options,
			final FileAttribute<?>... attrs) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public AsynchronousFileChannel newAsynchronousFileChannel(final Path path, final Set<? extends OpenOption> options,
			final ExecutorService executor, final FileAttribute<?>... attrs) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public abstract SeekableByteChannel newByteChannel(final Path p0, final Set<? extends OpenOption> p1,
			final FileAttribute<?>... p2) throws IOException;

	public abstract DirectoryStream<Path> newDirectoryStream(final Path p0,
			final DirectoryStream.Filter<? super Path> p1) throws IOException;

	public abstract void createDirectory(final Path p0, final FileAttribute<?>... p1) throws IOException;

	public void createSymbolicLink(final Path link, final Path target, final FileAttribute<?>... attrs)
			throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void createLink(final Path link, final Path existing) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public abstract void delete(final Path p0) throws IOException;

	public boolean deleteIfExists(final Path path) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Path readSymbolicLink(final Path link) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public abstract void copy(final Path p0, final Path p1, final CopyOption... p2) throws IOException;

	public abstract void move(final Path p0, final Path p1, final CopyOption... p2) throws IOException;

	public abstract boolean isSameFile(final Path p0, final Path p1) throws IOException;

	public abstract boolean isHidden(final Path p0) throws IOException;

	public abstract FileStore getFileStore(final Path p0) throws IOException;

	public abstract void checkAccess(final Path p0, final AccessMode... p1) throws IOException;

	public abstract <V extends FileAttributeView> V getFileAttributeView(final Path p0, final Class<V> p1,
			final LinkOption... p2);

	public abstract <A extends BasicFileAttributes> A readAttributes(final Path p0, final Class<A> p1,
			final LinkOption... p2) throws IOException;

	public abstract Map<String, Object> readAttributes(final Path p0, final String p1, final LinkOption... p2)
			throws IOException;

	public abstract void setAttribute(final Path p0, final String p1, final Object p2, final LinkOption... p3)
			throws IOException;
}
