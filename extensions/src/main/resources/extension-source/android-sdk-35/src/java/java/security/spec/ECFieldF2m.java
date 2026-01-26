package java.security.spec;

import java.math.BigInteger;

public class ECFieldF2m implements ECField {
	public ECFieldF2m(final int m) {
		throw new RuntimeException("Stub!");
	}

	public ECFieldF2m(final int m, final BigInteger rp) {
		throw new RuntimeException("Stub!");
	}

	public ECFieldF2m(final int m, final int[] ks) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getFieldSize() {
		throw new RuntimeException("Stub!");
	}

	public int getM() {
		throw new RuntimeException("Stub!");
	}

	public BigInteger getReductionPolynomial() {
		throw new RuntimeException("Stub!");
	}

	public int[] getMidTermsOfReductionPolynomial() {
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
}
