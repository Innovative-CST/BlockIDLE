package java.net;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public abstract class ResponseCache {
	public ResponseCache() {
		throw new RuntimeException("Stub!");
	}

	public static synchronized ResponseCache getDefault() {
		throw new RuntimeException("Stub!");
	}

	public static synchronized void setDefault(final ResponseCache responseCache) {
		throw new RuntimeException("Stub!");
	}

	public abstract CacheResponse get(final URI p0, final String p1, final Map<String, List<String>> p2)
			throws IOException;

	public abstract CacheRequest put(final URI p0, final URLConnection p1) throws IOException;
}
