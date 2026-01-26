package java.util.random;

import java.math.BigInteger;
import java.util.stream.Stream;

public final class RandomGeneratorFactory<T extends RandomGenerator> {
	RandomGeneratorFactory() {
		throw new RuntimeException("Stub!");
	}

	public static <T extends RandomGenerator> RandomGeneratorFactory<T> of(final String name) {
		throw new RuntimeException("Stub!");
	}

	public static RandomGeneratorFactory<RandomGenerator> getDefault() {
		throw new RuntimeException("Stub!");
	}

	public static Stream<RandomGeneratorFactory<RandomGenerator>> all() {
		throw new RuntimeException("Stub!");
	}

	public String name() {
		throw new RuntimeException("Stub!");
	}

	public String group() {
		throw new RuntimeException("Stub!");
	}

	public int stateBits() {
		throw new RuntimeException("Stub!");
	}

	public int equidistribution() {
		throw new RuntimeException("Stub!");
	}

	public BigInteger period() {
		throw new RuntimeException("Stub!");
	}

	public boolean isStatistical() {
		throw new RuntimeException("Stub!");
	}

	public boolean isStochastic() {
		throw new RuntimeException("Stub!");
	}

	public boolean isHardware() {
		throw new RuntimeException("Stub!");
	}

	public boolean isArbitrarilyJumpable() {
		throw new RuntimeException("Stub!");
	}

	public boolean isJumpable() {
		throw new RuntimeException("Stub!");
	}

	public boolean isLeapable() {
		throw new RuntimeException("Stub!");
	}

	public boolean isSplittable() {
		throw new RuntimeException("Stub!");
	}

	public boolean isStreamable() {
		throw new RuntimeException("Stub!");
	}

	public boolean isDeprecated() {
		throw new RuntimeException("Stub!");
	}

	public T create() {
		throw new RuntimeException("Stub!");
	}

	public T create(final long seed) {
		throw new RuntimeException("Stub!");
	}

	public T create(final byte[] seed) {
		throw new RuntimeException("Stub!");
	}
}
