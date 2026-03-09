package java.nio.file;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;

public class SimpleFileVisitor<T> implements FileVisitor<T> {
	protected SimpleFileVisitor() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public FileVisitResult preVisitDirectory(final T dir, final BasicFileAttributes attrs) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public FileVisitResult visitFile(final T file, final BasicFileAttributes attrs) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public FileVisitResult visitFileFailed(final T file, final IOException exc) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public FileVisitResult postVisitDirectory(final T dir, final IOException exc) throws IOException {
		throw new RuntimeException("Stub!");
	}
}
