package java.net;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CookieManager extends CookieHandler {
	public CookieManager() {
		throw new RuntimeException("Stub!");
	}

	public CookieManager(final CookieStore store, final CookiePolicy cookiePolicy) {
		throw new RuntimeException("Stub!");
	}

	public void setCookiePolicy(final CookiePolicy cookiePolicy) {
		throw new RuntimeException("Stub!");
	}

	public CookieStore getCookieStore() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Map<String, List<String>> get(final URI uri, final Map<String, List<String>> requestHeaders)
			throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void put(final URI uri, final Map<String, List<String>> responseHeaders) throws IOException {
		throw new RuntimeException("Stub!");
	}
}
