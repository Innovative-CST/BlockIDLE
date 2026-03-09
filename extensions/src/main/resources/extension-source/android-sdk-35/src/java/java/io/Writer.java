package java.io;

public abstract class Writer implements Appendable, Closeable, Flushable {
	protected Object lock;

	protected Writer() {
		throw new RuntimeException("Stub!");
	}

	protected Writer(final Object lock) {
		throw new RuntimeException("Stub!");
	}

	public static Writer nullWriter() {
		throw new RuntimeException("Stub!");
	}

	public void write(final int c) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void write(final char[] cbuf) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public abstract void write(final char[] p0, final int p1, final int p2) throws IOException;

	public void write(final String str) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void write(final String str, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Writer append(final CharSequence csq) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Writer append(final CharSequence csq, final int start, final int end) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Writer append(final char c) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract void flush() throws IOException;

	@Override
	public abstract void close() throws IOException;
}
