package java.io;

public class BufferedInputStream extends FilterInputStream {
	protected volatile byte[] buf;
	protected int count;
	protected int marklimit;
	protected int markpos;
	protected int pos;

	public BufferedInputStream(final InputStream in) {
		super(null);
		this.markpos = -1;
		throw new RuntimeException("Stub!");
	}

	public BufferedInputStream(final InputStream in, final int size) {
		super(null);
		this.markpos = -1;
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized int read() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized int read(final byte[] b, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized long skip(final long n) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized int available() throws IOException {
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
	public boolean markSupported() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}
}
