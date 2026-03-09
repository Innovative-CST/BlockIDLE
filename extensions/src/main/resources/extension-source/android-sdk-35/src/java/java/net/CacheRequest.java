package java.net;

import java.io.IOException;
import java.io.OutputStream;

public abstract class CacheRequest {
	public CacheRequest() {
		throw new RuntimeException("Stub!");
	}

	public abstract OutputStream getBody() throws IOException;

	public abstract void abort();
}
