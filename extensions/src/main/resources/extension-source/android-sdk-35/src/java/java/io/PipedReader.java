package java.io;

public class PipedReader extends Reader {
	public PipedReader(final PipedWriter src) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public PipedReader(final PipedWriter src, final int pipeSize) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public PipedReader() {
		throw new RuntimeException("Stub!");
	}

	public PipedReader(final int pipeSize) {
		throw new RuntimeException("Stub!");
	}

	public void connect(final PipedWriter src) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized int read() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized int read(final char[] cbuf, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized boolean ready() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}
}
