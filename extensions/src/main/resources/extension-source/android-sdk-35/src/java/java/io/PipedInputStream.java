package java.io;

public class PipedInputStream extends InputStream {
	protected static final int PIPE_SIZE = 1024;
	protected byte[] buffer;
	protected int in;
	protected int out;

	public PipedInputStream(final PipedOutputStream src) throws IOException {
		this.in = -1;
		this.out = 0;
		throw new RuntimeException("Stub!");
	}

	public PipedInputStream(final PipedOutputStream src, final int pipeSize) throws IOException {
		this.in = -1;
		this.out = 0;
		throw new RuntimeException("Stub!");
	}

	public PipedInputStream() {
		this.in = -1;
		this.out = 0;
		throw new RuntimeException("Stub!");
	}

	public PipedInputStream(final int pipeSize) {
		this.in = -1;
		this.out = 0;
		throw new RuntimeException("Stub!");
	}

	public void connect(final PipedOutputStream src) throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected synchronized void receive(final int b) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized int read() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized int read(final byte[] b, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized int available() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}
}
