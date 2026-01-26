package java.util.zip;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DeflaterInputStream extends FilterInputStream {
	protected final byte[] buf;
	protected final Deflater def;

	public DeflaterInputStream(final InputStream in) {
		super(null);
		this.buf = null;
		this.def = null;
		throw new RuntimeException("Stub!");
	}

	public DeflaterInputStream(final InputStream in, final Deflater defl) {
		super(null);
		this.buf = null;
		this.def = null;
		throw new RuntimeException("Stub!");
	}

	public DeflaterInputStream(final InputStream in, final Deflater defl, final int bufLen) {
		super(null);
		this.buf = null;
		this.def = null;
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
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
	public long skip(final long n) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int available() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean markSupported() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void mark(final int limit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void reset() throws IOException {
		throw new RuntimeException("Stub!");
	}
}
