package java.security;

import java.io.Serializable;

public abstract class SecureRandomSpi implements Serializable {
	public SecureRandomSpi() {
		throw new RuntimeException("Stub!");
	}

	protected SecureRandomSpi(final SecureRandomParameters params) {
		throw new RuntimeException("Stub!");
	}

	protected abstract void engineSetSeed(final byte[] p0);

	protected abstract void engineNextBytes(final byte[] p0);

	protected void engineNextBytes(final byte[] bytes, final SecureRandomParameters params) {
		throw new RuntimeException("Stub!");
	}

	protected abstract byte[] engineGenerateSeed(final int p0);

	protected void engineReseed(final SecureRandomParameters params) {
		throw new RuntimeException("Stub!");
	}

	protected SecureRandomParameters engineGetParameters() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
