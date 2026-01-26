package java.net;

import java.io.IOException;

public abstract class ContentHandler {
	public ContentHandler() {
		throw new RuntimeException("Stub!");
	}

	public abstract Object getContent(final URLConnection p0) throws IOException;

	public Object getContent(final URLConnection urlc, final Class[] classes) throws IOException {
		throw new RuntimeException("Stub!");
	}
}
