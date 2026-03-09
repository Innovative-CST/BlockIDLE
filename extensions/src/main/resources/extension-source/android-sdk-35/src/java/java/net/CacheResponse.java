package java.net;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public abstract class CacheResponse {
	public CacheResponse() {
		throw new RuntimeException("Stub!");
	}

	public abstract Map<String, List<String>> getHeaders() throws IOException;

	public abstract InputStream getBody() throws IOException;
}
