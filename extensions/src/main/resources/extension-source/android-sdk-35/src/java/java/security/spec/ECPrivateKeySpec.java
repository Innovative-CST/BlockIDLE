package java.security.spec;

import java.math.BigInteger;

public class ECPrivateKeySpec implements KeySpec {
	public ECPrivateKeySpec(final BigInteger s, final ECParameterSpec params) {
		throw new RuntimeException("Stub!");
	}

	public BigInteger getS() {
		throw new RuntimeException("Stub!");
	}

	public ECParameterSpec getParams() {
		throw new RuntimeException("Stub!");
	}
}
