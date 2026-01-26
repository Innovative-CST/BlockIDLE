package java.security;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DigestInputStream extends FilterInputStream {
	protected MessageDigest digest;

	public DigestInputStream(final InputStream stream, final MessageDigest digest) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public MessageDigest getMessageDigest() {
		throw new RuntimeException("Stub!");
	}

	public void setMessageDigest(final MessageDigest digest) {
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

	public void on(final boolean on) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
