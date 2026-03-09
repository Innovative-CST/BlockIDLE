package java.util.zip;

import java.io.IOException;
import java.io.OutputStream;

public class GZIPOutputStream extends DeflaterOutputStream {
	protected CRC32 crc;

	public GZIPOutputStream(final OutputStream out, final int size) throws IOException {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public GZIPOutputStream(final OutputStream out, final int size, final boolean syncFlush) throws IOException {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public GZIPOutputStream(final OutputStream out) throws IOException {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public GZIPOutputStream(final OutputStream out, final boolean syncFlush) throws IOException {
		super(null);
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void write(final byte[] buf, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void finish() throws IOException {
		throw new RuntimeException("Stub!");
	}
}
