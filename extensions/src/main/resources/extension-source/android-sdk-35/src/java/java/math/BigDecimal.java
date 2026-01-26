package java.math;

public class BigDecimal extends Number implements Comparable<BigDecimal> {
	public static final BigDecimal ONE;
	@Deprecated
	public static final int ROUND_CEILING = 2;
	@Deprecated
	public static final int ROUND_DOWN = 1;
	@Deprecated
	public static final int ROUND_FLOOR = 3;
	@Deprecated
	public static final int ROUND_HALF_DOWN = 5;
	@Deprecated
	public static final int ROUND_HALF_EVEN = 6;
	@Deprecated
	public static final int ROUND_HALF_UP = 4;
	@Deprecated
	public static final int ROUND_UNNECESSARY = 7;
	@Deprecated
	public static final int ROUND_UP = 0;
	public static final BigDecimal TEN;
	public static final BigDecimal ZERO;

	public BigDecimal(final char[] in, final int offset, final int len) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(final char[] in, final int offset, final int len, final MathContext mc) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(final char[] in) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(final char[] in, final MathContext mc) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(final String val) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(final String val, final MathContext mc) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(final double val) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(final double val, final MathContext mc) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(final BigInteger val) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(final BigInteger val, final MathContext mc) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(final BigInteger unscaledVal, final int scale) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(final BigInteger unscaledVal, final int scale, final MathContext mc) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(final int val) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(final int val, final MathContext mc) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(final long val) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(final long val, final MathContext mc) {
		throw new RuntimeException("Stub!");
	}

	public static BigDecimal valueOf(final long unscaledVal, final int scale) {
		throw new RuntimeException("Stub!");
	}

	public static BigDecimal valueOf(final long val) {
		throw new RuntimeException("Stub!");
	}

	public static BigDecimal valueOf(final double val) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal add(final BigDecimal augend) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal add(final BigDecimal augend, final MathContext mc) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal subtract(final BigDecimal subtrahend) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal subtract(final BigDecimal subtrahend, final MathContext mc) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal multiply(final BigDecimal multiplicand) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal multiply(final BigDecimal multiplicand, final MathContext mc) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public BigDecimal divide(final BigDecimal divisor, final int scale, final int roundingMode) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal divide(final BigDecimal divisor, final int scale, final RoundingMode roundingMode) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public BigDecimal divide(final BigDecimal divisor, final int roundingMode) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal divide(final BigDecimal divisor, final RoundingMode roundingMode) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal divide(final BigDecimal divisor) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal divide(final BigDecimal divisor, final MathContext mc) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal divideToIntegralValue(final BigDecimal divisor) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal divideToIntegralValue(final BigDecimal divisor, final MathContext mc) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal remainder(final BigDecimal divisor) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal remainder(final BigDecimal divisor, final MathContext mc) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal[] divideAndRemainder(final BigDecimal divisor) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal[] divideAndRemainder(final BigDecimal divisor, final MathContext mc) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal sqrt(final MathContext mc) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal pow(final int n) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal pow(final int n, final MathContext mc) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal abs() {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal abs(final MathContext mc) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal negate() {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal negate(final MathContext mc) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal plus() {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal plus(final MathContext mc) {
		throw new RuntimeException("Stub!");
	}

	public int signum() {
		throw new RuntimeException("Stub!");
	}

	public int scale() {
		throw new RuntimeException("Stub!");
	}

	public int precision() {
		throw new RuntimeException("Stub!");
	}

	public BigInteger unscaledValue() {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal round(final MathContext mc) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal setScale(final int newScale, final RoundingMode roundingMode) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public BigDecimal setScale(final int newScale, final int roundingMode) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal setScale(final int newScale) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal movePointLeft(final int n) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal movePointRight(final int n) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal scaleByPowerOfTen(final int n) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal stripTrailingZeros() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(final BigDecimal val) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object x) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal min(final BigDecimal val) {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal max(final BigDecimal val) {
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

	public String toEngineeringString() {
		throw new RuntimeException("Stub!");
	}

	public String toPlainString() {
		throw new RuntimeException("Stub!");
	}

	public BigInteger toBigInteger() {
		throw new RuntimeException("Stub!");
	}

	public BigInteger toBigIntegerExact() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long longValue() {
		throw new RuntimeException("Stub!");
	}

	public long longValueExact() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int intValue() {
		throw new RuntimeException("Stub!");
	}

	public int intValueExact() {
		throw new RuntimeException("Stub!");
	}

	public short shortValueExact() {
		throw new RuntimeException("Stub!");
	}

	public byte byteValueExact() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public float floatValue() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public double doubleValue() {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal ulp() {
		throw new RuntimeException("Stub!");
	}

	static {
		ONE = null;
		TEN = null;
		ZERO = null;
	}
}
