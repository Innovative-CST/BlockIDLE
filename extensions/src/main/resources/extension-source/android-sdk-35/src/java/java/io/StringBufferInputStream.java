package java.io;

@Deprecated
public class StringBufferInputStream extends InputStream {
	@Deprecated
	protected String buffer;
	@Deprecated
	protected int count;
	@Deprecated
	protected int pos;

	@Deprecated
	public StringBufferInputStream(final String s) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@Override
	public synchronized int read() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@Override
	public synchronized int read(final byte[] b, final int off, final int len) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@Override
	public synchronized long skip(final long n) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@Override
	public synchronized int available() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@Override
	public synchronized void reset() {
		throw new RuntimeException("Stub!");
	}
}
