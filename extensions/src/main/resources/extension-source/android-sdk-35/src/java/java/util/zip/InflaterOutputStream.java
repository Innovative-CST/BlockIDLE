package java.util.zip;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class InflaterOutputStream extends FilterOutputStream {
	protected final byte[] buf;
	protected final Inflater inf;

	public InflaterOutputStream(final OutputStream out) {
		super(null);
		this.buf = null;
		this.inf = null;
		throw new RuntimeException("Stub!");
	}

	public InflaterOutputStream(final OutputStream out, final Inflater infl) {
		super(null);
		this.buf = null;
		this.inf = null;
		throw new RuntimeException("Stub!");
	}

	public InflaterOutputStream(final OutputStream out, final Inflater infl, final int bufLen) {
		super(null);
		this.buf = null;
		this.inf = null;
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void flush() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void finish() throws IOException {
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
}
