package java.math;

import java.io.Serializable;

public final class MathContext implements Serializable {
	public static final MathContext DECIMAL128;
	public static final MathContext DECIMAL32;
	public static final MathContext DECIMAL64;
	public static final MathContext UNLIMITED;

	public MathContext(final int setPrecision) {
		throw new RuntimeException("Stub!");
	}

	public MathContext(final int setPrecision, final RoundingMode setRoundingMode) {
		throw new RuntimeException("Stub!");
	}

	public MathContext(final String val) {
		throw new RuntimeException("Stub!");
	}

	public int getPrecision() {
		throw new RuntimeException("Stub!");
	}

	public RoundingMode getRoundingMode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object x) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	static {
		DECIMAL128 = null;
		DECIMAL32 = null;
		DECIMAL64 = null;
		UNLIMITED = null;
	}
}
