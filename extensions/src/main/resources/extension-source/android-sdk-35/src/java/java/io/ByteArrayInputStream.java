package java.io;

public class ByteArrayInputStream extends InputStream {
	protected byte[] buf;
	protected int count;
	protected int mark;
	protected int pos;

	public ByteArrayInputStream(final byte[] buf) {
		this.mark = 0;
		throw new RuntimeException("Stub!");
	}

	public ByteArrayInputStream(final byte[] buf, final int offset, final int length) {
		this.mark = 0;
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized int read() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized int read(final byte[] b, final int off, final int len) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized byte[] readAllBytes() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int readNBytes(final byte[] b, final int off, final int len) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized long transferTo(final OutputStream out) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized long skip(final long n) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized int available() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean markSupported() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void mark(final int readAheadLimit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void reset() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}
}
