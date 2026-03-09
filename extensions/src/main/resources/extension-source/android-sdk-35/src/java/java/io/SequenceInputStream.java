package java.io;

import java.util.Enumeration;

public class SequenceInputStream extends InputStream {
	public SequenceInputStream(final Enumeration<? extends InputStream> e) {
		throw new RuntimeException("Stub!");
	}

	public SequenceInputStream(final InputStream s1, final InputStream s2) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int available() throws IOException {
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

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}
}
