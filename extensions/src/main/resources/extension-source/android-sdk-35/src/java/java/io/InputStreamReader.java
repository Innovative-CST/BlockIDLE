package java.io;

import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class InputStreamReader extends Reader {
	public InputStreamReader(final InputStream in) {
		throw new RuntimeException("Stub!");
	}

	public InputStreamReader(final InputStream in, final String charsetName) throws UnsupportedEncodingException {
		throw new RuntimeException("Stub!");
	}

	public InputStreamReader(final InputStream in, final Charset cs) {
		throw new RuntimeException("Stub!");
	}

	public InputStreamReader(final InputStream in, final CharsetDecoder dec) {
		throw new RuntimeException("Stub!");
	}

	public String getEncoding() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int read(final CharBuffer target) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int read() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int read(final char[] cbuf, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean ready() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}
}
