package java.net;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public abstract class CookieHandler {
	public CookieHandler() {
		throw new RuntimeException("Stub!");
	}

	public static synchronized CookieHandler getDefault() {
		throw new RuntimeException("Stub!");
	}

	public static synchronized void setDefault(final CookieHandler cHandler) {
		throw new RuntimeException("Stub!");
	}

	public abstract Map<String, List<String>> get(final URI p0, final Map<String, List<String>> p1) throws IOException;

	public abstract void put(final URI p0, final Map<String, List<String>> p1) throws IOException;
}
