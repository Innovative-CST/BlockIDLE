package java.nio.file;

import java.io.IOException;
import java.net.URI;
import java.util.Map;

public final class FileSystems {
	FileSystems() {
		throw new RuntimeException("Stub!");
	}

	public static FileSystem getDefault() {
		throw new RuntimeException("Stub!");
	}

	public static FileSystem getFileSystem(final URI uri) {
		throw new RuntimeException("Stub!");
	}

	public static FileSystem newFileSystem(final URI uri, final Map<String, ?> env) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static FileSystem newFileSystem(final URI uri, final Map<String, ?> env, final ClassLoader loader)
			throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static FileSystem newFileSystem(final Path path, final ClassLoader loader) throws IOException {
		throw new RuntimeException("Stub!");
	}
}
