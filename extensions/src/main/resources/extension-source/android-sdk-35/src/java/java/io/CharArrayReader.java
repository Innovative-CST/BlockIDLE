package java.io;

import java.nio.CharBuffer;

public class CharArrayReader extends Reader {
	protected char[] buf;
	protected int count;
	protected int markedPos;
	protected int pos;

	public CharArrayReader(final char[] buf) {
		this.markedPos = 0;
		throw new RuntimeException("Stub!");
	}

	public CharArrayReader(final char[] buf, final int offset, final int length) {
		this.markedPos = 0;
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
	public int read(final CharBuffer target) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long skip(final long n) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean ready() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean markSupported() {
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
	public void close() {
		throw new RuntimeException("Stub!");
	}
}
