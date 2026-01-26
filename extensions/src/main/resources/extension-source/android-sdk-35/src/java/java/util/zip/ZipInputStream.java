package java.util.zip;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ZipInputStream extends InflaterInputStream {
	public static final int CENATT = 36;
	public static final int CENATX = 38;
	public static final int CENCOM = 32;
	public static final int CENCRC = 16;
	public static final int CENDSK = 34;
	public static final int CENEXT = 30;
	public static final int CENFLG = 8;
	public static final int CENHDR = 46;
	public static final int CENHOW = 10;
	public static final int CENLEN = 24;
	public static final int CENNAM = 28;
	public static final int CENOFF = 42;
	public static final long CENSIG = 33639248L;
	public static final int CENSIZ = 20;
	public static final int CENTIM = 12;
	public static final int CENVEM = 4;
	public static final int CENVER = 6;
	public static final int ENDCOM = 20;
	public static final int ENDHDR = 22;
	public static final int ENDOFF = 16;
	public static final long ENDSIG = 101010256L;
	public static final int ENDSIZ = 12;
	public static final int ENDSUB = 8;
	public static final int ENDTOT = 10;
	public static final int EXTCRC = 4;
	public static final int EXTHDR = 16;
	public static final int EXTLEN = 12;
	public static final long EXTSIG = 134695760L;
	public static final int EXTSIZ = 8;
	public static final int LOCCRC = 14;
	public static final int LOCEXT = 28;
	public static final int LOCFLG = 6;
	public static final int LOCHDR = 30;
	public static final int LOCHOW = 8;
	public static final int LOCLEN = 22;
	public static final int LOCNAM = 26;
	public static final long LOCSIG = 67324752L;
	public static final int LOCSIZ = 18;
	public static final int LOCTIM = 10;
	public static final int LOCVER = 4;

	public ZipInputStream(final InputStream in) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public ZipInputStream(final InputStream in, final Charset charset) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public ZipEntry getNextEntry() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void closeEntry() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int available() throws IOException {
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
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected ZipEntry createZipEntry(final String name) {
		throw new RuntimeException("Stub!");
	}
}
