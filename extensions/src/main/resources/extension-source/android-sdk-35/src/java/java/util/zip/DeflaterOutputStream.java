package java.util.zip;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DeflaterOutputStream extends FilterOutputStream {
	protected byte[] buf;
	protected Deflater def;

	public DeflaterOutputStream(final OutputStream out, final Deflater def, final int size, final boolean syncFlush) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public DeflaterOutputStream(final OutputStream out, final Deflater def, final int size) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public DeflaterOutputStream(final OutputStream out, final Deflater def, final boolean syncFlush) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public DeflaterOutputStream(final OutputStream out, final Deflater def) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public DeflaterOutputStream(final OutputStream out, final boolean syncFlush) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public DeflaterOutputStream(final OutputStream out) {
		super(null);
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

	public void finish() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected void deflate() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void flush() throws IOException {
		throw new RuntimeException("Stub!");
	}
}
