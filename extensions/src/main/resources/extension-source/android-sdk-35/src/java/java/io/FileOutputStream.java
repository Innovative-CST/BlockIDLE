package java.io;

import java.nio.channels.FileChannel;

public class FileOutputStream extends OutputStream {
	public FileOutputStream(final String name) throws FileNotFoundException {
		throw new RuntimeException("Stub!");
	}

	public FileOutputStream(final String name, final boolean append) throws FileNotFoundException {
		throw new RuntimeException("Stub!");
	}

	public FileOutputStream(final File file) throws FileNotFoundException {
		throw new RuntimeException("Stub!");
	}

	public FileOutputStream(final File file, final boolean append) throws FileNotFoundException {
		throw new RuntimeException("Stub!");
	}

	public FileOutputStream(final FileDescriptor fdObj) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final int b) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final byte[] b) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final byte[] b, final int off, final int len) throws IOException {
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
