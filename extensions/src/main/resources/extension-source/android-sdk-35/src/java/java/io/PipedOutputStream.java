package java.io;

public class PipedOutputStream extends OutputStream {
	public PipedOutputStream(final PipedInputStream snk) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public PipedOutputStream() {
		throw new RuntimeException("Stub!");
	}

	public synchronized void connect(final PipedInputStream snk) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final int b) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final byte[] b, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void flush() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}
}
