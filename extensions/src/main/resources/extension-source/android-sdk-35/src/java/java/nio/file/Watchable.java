package java.nio.file;

import java.io.IOException;

public interface Watchable {
	WatchKey register(final WatchService p0, final WatchEvent.Kind<?>[] p1, final WatchEvent.Modifier... p2)
			throws IOException;

	WatchKey register(final WatchService p0, final WatchEvent.Kind<?>... p1) throws IOException;
}
