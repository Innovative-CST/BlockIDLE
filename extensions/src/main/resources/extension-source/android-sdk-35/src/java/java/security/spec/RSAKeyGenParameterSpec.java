package java.security.spec;

import java.math.BigInteger;

public class RSAKeyGenParameterSpec implements AlgorithmParameterSpec {
	public static final BigInteger F0;
	public static final BigInteger F4;

	public RSAKeyGenParameterSpec(final int keysize, final BigInteger publicExponent) {
		throw new RuntimeException("Stub!");
	}

	public RSAKeyGenParameterSpec(final int keysize, final BigInteger publicExponent,
			final AlgorithmParameterSpec keyParams) {
		throw new RuntimeException("Stub!");
	}

	public int getKeysize() {
		throw new RuntimeException("Stub!");
	}

	public BigInteger getPublicExponent() {
		throw new RuntimeException("Stub!");
	}

	public AlgorithmParameterSpec getKeyParams() {
		throw new RuntimeException("Stub!");
	}

	static {
		F0 = null;
		F4 = null;
	}
}
