package java.math;

import java.util.Random;

public class BigInteger extends Number implements Comparable<BigInteger> {
	@RecentlyNonNull
	public static final BigInteger ONE;
	@RecentlyNonNull
	public static final BigInteger TEN;
	@RecentlyNonNull
	public static final BigInteger TWO;
	@RecentlyNonNull
	public static final BigInteger ZERO;

	public BigInteger(final byte[] val, final int off, final int len) {
		throw new RuntimeException("Stub!");
	}

	public BigInteger(final byte[] val) {
		throw new RuntimeException("Stub!");
	}

	public BigInteger(final int signum, final byte[] magnitude, final int off, final int len) {
		throw new RuntimeException("Stub!");
	}

	public BigInteger(final int signum, final byte[] magnitude) {
		throw new RuntimeException("Stub!");
	}

	public BigInteger(@RecentlyNonNull final String val, final int radix) {
		throw new RuntimeException("Stub!");
	}

	public BigInteger(@RecentlyNonNull final String val) {
		throw new RuntimeException("Stub!");
	}

	public BigInteger(final int numBits, @RecentlyNonNull final Random rnd) {
		throw new RuntimeException("Stub!");
	}

	public BigInteger(final int bitLength, final int certainty, @RecentlyNonNull final Random rnd) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static BigInteger probablePrime(final int bitLength, @RecentlyNonNull final Random rnd) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger nextProbablePrime() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static BigInteger valueOf(final long val) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger add(@RecentlyNonNull final BigInteger val) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger subtract(@RecentlyNonNull final BigInteger val) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger multiply(@RecentlyNonNull final BigInteger val) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger divide(@RecentlyNonNull final BigInteger val) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger[] divideAndRemainder(@RecentlyNonNull final BigInteger val) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger remainder(@RecentlyNonNull final BigInteger val) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger pow(final int exponent) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger sqrt() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger[] sqrtAndRemainder() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger gcd(@RecentlyNonNull final BigInteger val) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger abs() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger negate() {
		throw new RuntimeException("Stub!");
	}

	public int signum() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger mod(@RecentlyNonNull final BigInteger m) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger modPow(@RecentlyNonNull final BigInteger exponent, @RecentlyNonNull final BigInteger m) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger modInverse(@RecentlyNonNull final BigInteger m) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger shiftLeft(final int n) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger shiftRight(final int n) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger and(@RecentlyNonNull final BigInteger val) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger or(@RecentlyNonNull final BigInteger val) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger xor(@RecentlyNonNull final BigInteger val) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger not() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger andNot(@RecentlyNonNull final BigInteger val) {
		throw new RuntimeException("Stub!");
	}

	public boolean testBit(final int n) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger setBit(final int n) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger clearBit(final int n) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger flipBit(final int n) {
		throw new RuntimeException("Stub!");
	}

	public int getLowestSetBit() {
		throw new RuntimeException("Stub!");
	}

	public int bitLength() {
		throw new RuntimeException("Stub!");
	}

	public int bitCount() {
		throw new RuntimeException("Stub!");
	}

	public boolean isProbablePrime(final int certainty) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(@RecentlyNonNull final BigInteger val) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object x) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger min(@RecentlyNonNull final BigInteger val) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public BigInteger max(@RecentlyNonNull final BigInteger val) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String toString(final int radix) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public byte[] toByteArray() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int intValue() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long longValue() {
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

	public long longValueExact() {
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

	static {
		ONE = null;
		TEN = null;
		TWO = null;
		ZERO = null;
	}
}
