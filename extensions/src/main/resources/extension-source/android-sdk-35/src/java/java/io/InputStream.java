package java.io;

public abstract class InputStream implements Closeable {
	public InputStream() {
		throw new RuntimeException("Stub!");
	}

	public static InputStream nullInputStream() {
		throw new RuntimeException("Stub!");
	}

	public abstract int read() throws IOException;

	public int read(final byte[] b) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public int read(final byte[] b, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public byte[] readAllBytes() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public byte[] readNBytes(final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public int readNBytes(final byte[] b, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public long skip(final long n) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void skipNBytes(final long n) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public int available() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public synchronized void mark(final int readlimit) {
		throw new RuntimeException("Stub!");
	}

	public synchronized void reset() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public boolean markSupported() {
		throw new RuntimeException("Stub!");
	}

	public long transferTo(final OutputStream out) throws IOException {
		throw new RuntimeException("Stub!");
	}
}
