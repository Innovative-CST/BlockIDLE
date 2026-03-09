package java.security.spec;

import java.math.BigInteger;

public class RSAPrivateKeySpec implements KeySpec {
	public RSAPrivateKeySpec(final BigInteger modulus, final BigInteger privateExponent) {
		throw new RuntimeException("Stub!");
	}

	public RSAPrivateKeySpec(final BigInteger modulus, final BigInteger privateExponent,
			final AlgorithmParameterSpec params) {
		throw new RuntimeException("Stub!");
	}

	public BigInteger getModulus() {
		throw new RuntimeException("Stub!");
	}

	public BigInteger getPrivateExponent() {
		throw new RuntimeException("Stub!");
	}

	public AlgorithmParameterSpec getParams() {
		throw new RuntimeException("Stub!");
	}
}
