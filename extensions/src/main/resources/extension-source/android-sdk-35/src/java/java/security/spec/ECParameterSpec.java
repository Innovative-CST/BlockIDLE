package java.security.spec;

import java.math.BigInteger;

public class ECParameterSpec implements AlgorithmParameterSpec {
	public ECParameterSpec(final EllipticCurve curve, final ECPoint g, final BigInteger n, final int h) {
		throw new RuntimeException("Stub!");
	}

	public EllipticCurve getCurve() {
		throw new RuntimeException("Stub!");
	}

	public ECPoint getGenerator() {
		throw new RuntimeException("Stub!");
	}

	public BigInteger getOrder() {
		throw new RuntimeException("Stub!");
	}

	public int getCofactor() {
		throw new RuntimeException("Stub!");
	}
}
