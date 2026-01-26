package java.io;

public class PipedWriter extends Writer {
	public PipedWriter(final PipedReader snk) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public PipedWriter() {
		throw new RuntimeException("Stub!");
	}

	public synchronized void connect(final PipedReader snk) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final int c) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final char[] cbuf, final int off, final int len) throws IOException {
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
