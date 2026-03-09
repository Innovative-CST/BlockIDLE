package java.security;

import java.nio.ByteBuffer;

public abstract class MessageDigest extends MessageDigestSpi {
	protected MessageDigest(@RecentlyNonNull final String algorithm) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static MessageDigest getInstance(@RecentlyNonNull final String algorithm) throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static MessageDigest getInstance(@RecentlyNonNull final String algorithm,
			@RecentlyNonNull final String provider) throws NoSuchAlgorithmException, NoSuchProviderException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static MessageDigest getInstance(@RecentlyNonNull final String algorithm,
			@RecentlyNonNull final Provider provider) throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public final Provider getProvider() {
		throw new RuntimeException("Stub!");
	}

	public void update(final byte input) {
		throw new RuntimeException("Stub!");
	}

	public void update(@RecentlyNonNull final byte[] input, final int offset, final int len) {
		throw new RuntimeException("Stub!");
	}

	public void update(@RecentlyNonNull final byte[] input) {
		throw new RuntimeException("Stub!");
	}

	public final void update(@RecentlyNonNull final ByteBuffer input) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public byte[] digest() {
		throw new RuntimeException("Stub!");
	}

	public int digest(@RecentlyNonNull final byte[] buf, final int offset, final int len) throws DigestException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public byte[] digest(@RecentlyNonNull final byte[] input) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public static boolean isEqual(@RecentlyNullable final byte[] digesta, @RecentlyNullable final byte[] digestb) {
		throw new RuntimeException("Stub!");
	}

	public void reset() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public final String getAlgorithm() {
		throw new RuntimeException("Stub!");
	}

	public final int getDigestLength() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new RuntimeException("Stub!");
	}
}
