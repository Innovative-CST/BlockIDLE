package java.security;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DigestOutputStream extends FilterOutputStream {
	protected MessageDigest digest;

	public DigestOutputStream(final OutputStream stream, final MessageDigest digest) {
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
	public void write(final int b) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final byte[] b, final int off, final int len) throws IOException {
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
