package java.nio.file;

import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.util.Set;

public interface SecureDirectoryStream<T> extends DirectoryStream<T> {
	SecureDirectoryStream<T> newDirectoryStream(final T p0, final LinkOption... p1) throws IOException;

	SeekableByteChannel newByteChannel(final T p0, final Set<? extends OpenOption> p1, final FileAttribute<?>... p2)
			throws IOException;

	void deleteFile(final T p0) throws IOException;

	void deleteDirectory(final T p0) throws IOException;

	void move(final T p0, final SecureDirectoryStream<T> p1, final T p2) throws IOException;

	<V extends FileAttributeView> V getFileAttributeView(final Class<V> p0);

	<V extends FileAttributeView> V getFileAttributeView(final T p0, final Class<V> p1, final LinkOption... p2);
}
