package java.nio.file;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Iterator;

public interface Path extends Comparable<Path>, Iterable<Path>, Watchable {
	default Path of(final String first, final String... more) {
		throw new RuntimeException("Stub!");
	}

	default Path of(final URI uri) {
		throw new RuntimeException("Stub!");
	}

	FileSystem getFileSystem();

	boolean isAbsolute();

	Path getRoot();

	Path getFileName();

	Path getParent();

	int getNameCount();

	Path getName(final int p0);

	Path subpath(final int p0, final int p1);

	boolean startsWith(final Path p0);

	boolean startsWith(final String p0);

	boolean endsWith(final Path p0);

	boolean endsWith(final String p0);

	Path normalize();

	Path resolve(final Path p0);

	Path resolve(final String p0);

	Path resolveSibling(final Path p0);

	Path resolveSibling(final String p0);

	Path relativize(final Path p0);

	URI toUri();

	Path toAbsolutePath();

	Path toRealPath(final LinkOption... p0) throws IOException;

	File toFile();

	WatchKey register(final WatchService p0, final WatchEvent.Kind<?>[] p1, final WatchEvent.Modifier... p2)
			throws IOException;

	WatchKey register(final WatchService p0, final WatchEvent.Kind<?>... p1) throws IOException;

	Iterator<Path> iterator();

	int compareTo(final Path p0);

	boolean equals(final Object p0);

	int hashCode();

	String toString();
}
