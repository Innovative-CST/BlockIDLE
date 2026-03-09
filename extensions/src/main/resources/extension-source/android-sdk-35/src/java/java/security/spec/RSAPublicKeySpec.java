package java.security.spec;

import java.math.BigInteger;

public class RSAPublicKeySpec implements KeySpec {
	public RSAPublicKeySpec(final BigInteger modulus, final BigInteger publicExponent) {
		throw new RuntimeException("Stub!");
	}

	public RSAPublicKeySpec(final BigInteger modulus, final BigInteger publicExponent,
			final AlgorithmParameterSpec params) {
		throw new RuntimeException("Stub!");
	}

	public BigInteger getModulus() {
		throw new RuntimeException("Stub!");
	}

	public BigInteger getPublicExponent() {
		throw new RuntimeException("Stub!");
	}

	public AlgorithmParameterSpec getParams() {
		throw new RuntimeException("Stub!");
	}
}
