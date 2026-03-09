package java.nio.file;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;

public interface FileVisitor<T> {
	FileVisitResult preVisitDirectory(final T p0, final BasicFileAttributes p1) throws IOException;

	FileVisitResult visitFile(final T p0, final BasicFileAttributes p1) throws IOException;

	FileVisitResult visitFileFailed(final T p0, final IOException p1) throws IOException;

	FileVisitResult postVisitDirectory(final T p0, final IOException p1) throws IOException;
}
