package java.security;

import java.nio.ByteBuffer;

public abstract class MessageDigestSpi {
	public MessageDigestSpi() {
		throw new RuntimeException("Stub!");
	}

	protected int engineGetDigestLength() {
		throw new RuntimeException("Stub!");
	}

	protected abstract void engineUpdate(final byte p0);

	protected abstract void engineUpdate(final byte[] p0, final int p1, final int p2);

	protected void engineUpdate(final ByteBuffer input) {
		throw new RuntimeException("Stub!");
	}

	protected abstract byte[] engineDigest();

	protected int engineDigest(final byte[] buf, final int offset, final int len) throws DigestException {
		throw new RuntimeException("Stub!");
	}

	protected abstract void engineReset();

	public Object clone() throws CloneNotSupportedException {
		throw new RuntimeException("Stub!");
	}
}
