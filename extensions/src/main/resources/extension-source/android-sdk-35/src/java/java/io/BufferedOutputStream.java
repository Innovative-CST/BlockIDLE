package java.io;

public class BufferedOutputStream extends FilterOutputStream {
	protected byte[] buf;
	protected int count;

	public BufferedOutputStream(final OutputStream out) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public BufferedOutputStream(final OutputStream out, final int size) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void write(final int b) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void write(final byte[] b, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void flush() throws IOException {
		throw new RuntimeException("Stub!");
	}
}
