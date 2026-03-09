package java.security.spec;

import java.math.BigInteger;

public class ECPoint {
	public static final ECPoint POINT_INFINITY;

	public ECPoint(final BigInteger x, final BigInteger y) {
		throw new RuntimeException("Stub!");
	}

	public BigInteger getAffineX() {
		throw new RuntimeException("Stub!");
	}

	public BigInteger getAffineY() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	static {
		POINT_INFINITY = null;
	}
}
