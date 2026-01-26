package java.util.zip;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InflaterInputStream extends FilterInputStream {
	protected byte[] buf;
	@Deprecated
	protected boolean closed;
	protected Inflater inf;
	protected int len;

	public InflaterInputStream(final InputStream in, final Inflater inf, final int size) {
		super(null);
		this.closed = false;
		throw new RuntimeException("Stub!");
	}

	public InflaterInputStream(final InputStream in, final Inflater inf) {
		super(null);
		this.closed = false;
		throw new RuntimeException("Stub!");
	}

	public InflaterInputStream(final InputStream in) {
		super(null);
		this.closed = false;
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
	public int available() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long skip(final long n) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected void fill() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean markSupported() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void mark(final int readlimit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void reset() throws IOException {
		throw new RuntimeException("Stub!");
	}
}
