package java.io;

public class PushbackInputStream extends FilterInputStream {
	protected byte[] buf;
	protected int pos;

	public PushbackInputStream(final InputStream in, final int size) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public PushbackInputStream(final InputStream in) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	@Override
	public int read() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int read(final byte[] b, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void unread(final int b) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void unread(final byte[] b, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void unread(final byte[] b) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int available() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long skip(final long n) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean markSupported() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void mark(final int readlimit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void reset() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void close() throws IOException {
		throw new RuntimeException("Stub!");
	}
}
