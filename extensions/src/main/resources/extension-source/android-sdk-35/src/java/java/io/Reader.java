package java.io;

import java.nio.CharBuffer;

public abstract class Reader implements Readable, Closeable {
	protected Object lock;

	protected Reader() {
		throw new RuntimeException("Stub!");
	}

	protected Reader(final Object lock) {
		throw new RuntimeException("Stub!");
	}

	public static Reader nullReader() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int read(final CharBuffer target) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public int read() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public int read(final char[] cbuf) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public abstract int read(final char[] p0, final int p1, final int p2) throws IOException;

	public long skip(final long n) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public boolean ready() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public boolean markSupported() {
		throw new RuntimeException("Stub!");
	}

	public void mark(final int readAheadLimit) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void reset() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract void close() throws IOException;

	public long transferTo(final Writer out) throws IOException {
		throw new RuntimeException("Stub!");
	}
}
