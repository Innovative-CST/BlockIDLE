package java.security.spec;

import java.math.BigInteger;

public class RSAMultiPrimePrivateCrtKeySpec extends RSAPrivateKeySpec {
	public RSAMultiPrimePrivateCrtKeySpec(final BigInteger modulus, final BigInteger publicExponent,
			final BigInteger privateExponent, final BigInteger primeP, final BigInteger primeQ,
			final BigInteger primeExponentP, final BigInteger primeExponentQ, final BigInteger crtCoefficient,
			final RSAOtherPrimeInfo[] otherPrimeInfo) {
		super(null, null);
		throw new RuntimeException("Stub!");
	}

	public RSAMultiPrimePrivateCrtKeySpec(final BigInteger modulus, final BigInteger publicExponent,
			final BigInteger privateExponent, final BigInteger primeP, final BigInteger primeQ,
			final BigInteger primeExponentP, final BigInteger primeExponentQ, final BigInteger crtCoefficient,
			final RSAOtherPrimeInfo[] otherPrimeInfo, final AlgorithmParameterSpec keyParams) {
		super(null, null);
		throw new RuntimeException("Stub!");
	}

	public BigInteger getPublicExponent() {
		throw new RuntimeException("Stub!");
	}

	public BigInteger getPrimeP() {
		throw new RuntimeException("Stub!");
	}

	public BigInteger getPrimeQ() {
		throw new RuntimeException("Stub!");
	}

	public BigInteger getPrimeExponentP() {
		throw new RuntimeException("Stub!");
	}

	public BigInteger getPrimeExponentQ() {
		throw new RuntimeException("Stub!");
	}

	public BigInteger getCrtCoefficient() {
		throw new RuntimeException("Stub!");
	}

	public RSAOtherPrimeInfo[] getOtherPrimeInfo() {
		throw new RuntimeException("Stub!");
	}
}
