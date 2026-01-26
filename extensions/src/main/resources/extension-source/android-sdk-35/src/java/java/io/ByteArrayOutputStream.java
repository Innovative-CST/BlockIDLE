package java.io;

import java.nio.charset.Charset;

public class ByteArrayOutputStream extends OutputStream {
	@RecentlyNonNull
	protected byte[] buf;
	protected int count;

	public ByteArrayOutputStream() {
		throw new RuntimeException("Stub!");
	}

	public ByteArrayOutputStream(final int size) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void write(final int b) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void write(@RecentlyNonNull final byte[] b, final int off, final int len) {
		throw new RuntimeException("Stub!");
	}

	public void writeBytes(final byte[] b) {
		throw new RuntimeException("Stub!");
	}

	public synchronized void writeTo(@RecentlyNonNull final OutputStream out) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public synchronized void reset() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized byte[] toByteArray() {
		throw new RuntimeException("Stub!");
	}

	public synchronized int size() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public synchronized String toString() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized String toString(@RecentlyNonNull final String charsetName) throws UnsupportedEncodingException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public synchronized String toString(@RecentlyNonNull final Charset charset) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@RecentlyNonNull
	public synchronized String toString(final int hibyte) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}
}
