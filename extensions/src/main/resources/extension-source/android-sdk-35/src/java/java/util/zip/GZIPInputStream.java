package java.util.zip;

import java.io.IOException;
import java.io.InputStream;

public class GZIPInputStream extends InflaterInputStream {
	public static final int GZIP_MAGIC = 35615;
	protected CRC32 crc;
	protected boolean eos;

	public GZIPInputStream(final InputStream in, final int size) throws IOException {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public GZIPInputStream(final InputStream in) throws IOException {
		super(null);
		throw new RuntimeException("Stub!");
	}

	@Override
	public int read(final byte[] buf, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}
}
