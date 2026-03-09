package java.security;

import java.util.Random;

public class SecureRandom extends Random {
	public SecureRandom() {
		throw new RuntimeException("Stub!");
	}

	public SecureRandom(final byte[] seed) {
		throw new RuntimeException("Stub!");
	}

	protected SecureRandom(final SecureRandomSpi secureRandomSpi, final Provider provider) {
		throw new RuntimeException("Stub!");
	}

	public static SecureRandom getInstance(final String algorithm) throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public static SecureRandom getInstance(final String algorithm, final String provider)
			throws NoSuchAlgorithmException, NoSuchProviderException {
		throw new RuntimeException("Stub!");
	}

	public static SecureRandom getInstance(final String algorithm, final Provider provider)
			throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public static SecureRandom getInstance(final String algorithm, final SecureRandomParameters params)
			throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public static SecureRandom getInstance(final String algorithm, final SecureRandomParameters params,
			final String provider) throws NoSuchAlgorithmException, NoSuchProviderException {
		throw new RuntimeException("Stub!");
	}

	public static SecureRandom getInstance(final String algorithm, final SecureRandomParameters params,
			final Provider provider) throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider() {
		throw new RuntimeException("Stub!");
	}

	public String getAlgorithm() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public SecureRandomParameters getParameters() {
		throw new RuntimeException("Stub!");
	}

	public void setSeed(final byte[] seed) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void setSeed(final long seed) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void nextBytes(final byte[] bytes) {
		throw new RuntimeException("Stub!");
	}

	public void nextBytes(final byte[] bytes, final SecureRandomParameters params) {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected final int next(final int numBits) {
		throw new RuntimeException("Stub!");
	}

	public static byte[] getSeed(final int numBytes) {
		throw new RuntimeException("Stub!");
	}

	public byte[] generateSeed(final int numBytes) {
		throw new RuntimeException("Stub!");
	}

	public static SecureRandom getInstanceStrong() throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public void reseed() {
		throw new RuntimeException("Stub!");
	}

	public void reseed(final SecureRandomParameters params) {
		throw new RuntimeException("Stub!");
	}
}
