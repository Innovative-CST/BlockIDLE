package java.security.interfaces;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

public interface RSAKey {
	BigInteger getModulus();

	default AlgorithmParameterSpec getParams() {
		throw new RuntimeException("Stub!");
	}
}
