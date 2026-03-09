package java.io;

public abstract class OutputStream implements Closeable, Flushable {
	public OutputStream() {
		throw new RuntimeException("Stub!");
	}

	public static OutputStream nullOutputStream() {
		throw new RuntimeException("Stub!");
	}

	public abstract void write(final int p0) throws IOException;

	public void write(final byte[] b) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void write(final byte[] b, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void flush() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}
}
