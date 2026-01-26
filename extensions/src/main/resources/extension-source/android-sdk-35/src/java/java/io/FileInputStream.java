package java.io;

import java.nio.channels.FileChannel;

public class FileInputStream extends InputStream {
	public FileInputStream(final String name) throws FileNotFoundException {
		throw new RuntimeException("Stub!");
	}

	public FileInputStream(final File file) throws FileNotFoundException {
		throw new RuntimeException("Stub!");
	}

	public FileInputStream(final FileDescriptor fdObj) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int read() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int read(final byte[] b) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int read(final byte[] b, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long skip(final long n) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int available() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public final FileDescriptor getFD() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public FileChannel getChannel() {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected void finalize() throws IOException {
		throw new RuntimeException("Stub!");
	}
}
