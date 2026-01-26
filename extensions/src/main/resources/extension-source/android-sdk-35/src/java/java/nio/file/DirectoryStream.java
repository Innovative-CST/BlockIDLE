package java.nio.file;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;

public interface DirectoryStream<T> extends Closeable, Iterable<T> {
	Iterator<T> iterator();

	@FunctionalInterface
	interface Filter<T> {
		boolean accept(final T p0) throws IOException;
	}
}
