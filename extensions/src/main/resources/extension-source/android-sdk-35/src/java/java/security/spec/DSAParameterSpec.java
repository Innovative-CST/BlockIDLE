package java.security.spec;

import java.math.BigInteger;
import java.security.interfaces.DSAParams;

public class DSAParameterSpec implements AlgorithmParameterSpec, DSAParams {
	public DSAParameterSpec(final BigInteger p, final BigInteger q, final BigInteger g) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public BigInteger getP() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public BigInteger getQ() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public BigInteger getG() {
		throw new RuntimeException("Stub!");
	}
}
