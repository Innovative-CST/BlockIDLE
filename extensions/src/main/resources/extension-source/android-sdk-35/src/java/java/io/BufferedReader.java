package java.io;

import java.util.stream.Stream;

public class BufferedReader extends Reader {
	public BufferedReader(final Reader in, final int sz) {
		throw new RuntimeException("Stub!");
	}

	public BufferedReader(final Reader in) {
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

	public String readLine() throws IOException {
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
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Stream<String> lines() {
		throw new RuntimeException("Stub!");
	}
}
