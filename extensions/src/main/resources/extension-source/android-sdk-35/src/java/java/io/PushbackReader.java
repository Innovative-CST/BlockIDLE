package java.io;

public class PushbackReader extends FilterReader {
	public PushbackReader(final Reader in, final int size) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public PushbackReader(final Reader in) {
		super(null);
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

	public void unread(final int c) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void unread(final char[] cbuf, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void unread(final char[] cbuf) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean ready() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void mark(final int readAheadLimit) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void reset() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean markSupported() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long skip(final long n) throws IOException {
		throw new RuntimeException("Stub!");
	}
}
