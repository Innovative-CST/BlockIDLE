package java.util.random;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public interface RandomGenerator {
	default RandomGenerator of(final String name) {
		throw new RuntimeException("Stub!");
	}

	default RandomGenerator getDefault() {
		throw new RuntimeException("Stub!");
	}

	default boolean isDeprecated() {
		throw new RuntimeException("Stub!");
	}

	default DoubleStream doubles() {
		throw new RuntimeException("Stub!");
	}

	default DoubleStream doubles(final double randomNumberOrigin, final double randomNumberBound) {
		throw new RuntimeException("Stub!");
	}

	default DoubleStream doubles(final long streamSize) {
		throw new RuntimeException("Stub!");
	}

	default DoubleStream doubles(final long streamSize, final double randomNumberOrigin,
			final double randomNumberBound) {
		throw new RuntimeException("Stub!");
	}

	default IntStream ints() {
		throw new RuntimeException("Stub!");
	}

	default IntStream ints(final int randomNumberOrigin, final int randomNumberBound) {
		throw new RuntimeException("Stub!");
	}

	default IntStream ints(final long streamSize) {
		throw new RuntimeException("Stub!");
	}

	default IntStream ints(final long streamSize, final int randomNumberOrigin, final int randomNumberBound) {
		throw new RuntimeException("Stub!");
	}

	default LongStream longs() {
		throw new RuntimeException("Stub!");
	}

	default LongStream longs(final long randomNumberOrigin, final long randomNumberBound) {
		throw new RuntimeException("Stub!");
	}

	default LongStream longs(final long streamSize) {
		throw new RuntimeException("Stub!");
	}

	default LongStream longs(final long streamSize, final long randomNumberOrigin, final long randomNumberBound) {
		throw new RuntimeException("Stub!");
	}

	default boolean nextBoolean() {
		throw new RuntimeException("Stub!");
	}

	default void nextBytes(final byte[] bytes) {
		throw new RuntimeException("Stub!");
	}

	default float nextFloat() {
		throw new RuntimeException("Stub!");
	}

	default float nextFloat(final float bound) {
		throw new RuntimeException("Stub!");
	}

	default float nextFloat(final float origin, final float bound) {
		throw new RuntimeException("Stub!");
	}

	default double nextDouble() {
		throw new RuntimeException("Stub!");
	}

	default double nextDouble(final double bound) {
		throw new RuntimeException("Stub!");
	}

	default double nextDouble(final double origin, final double bound) {
		throw new RuntimeException("Stub!");
	}

	default int nextInt() {
		throw new RuntimeException("Stub!");
	}

	default int nextInt(final int bound) {
		throw new RuntimeException("Stub!");
	}

	default int nextInt(final int origin, final int bound) {
		throw new RuntimeException("Stub!");
	}

	long nextLong();

	default long nextLong(final long bound) {
		throw new RuntimeException("Stub!");
	}

	default long nextLong(final long origin, final long bound) {
		throw new RuntimeException("Stub!");
	}

	default double nextGaussian() {
		throw new RuntimeException("Stub!");
	}

	default double nextGaussian(final double mean, final double stddev) {
		throw new RuntimeException("Stub!");
	}

	default double nextExponential() {
		throw new RuntimeException("Stub!");
	}

	interface ArbitrarilyJumpableGenerator extends LeapableGenerator {
		default ArbitrarilyJumpableGenerator of(final String name) {
			throw new RuntimeException("Stub!");
		}

		ArbitrarilyJumpableGenerator copy();

		void jumpPowerOfTwo(final int p0);

		void jump(final double p0);

		default void jump() {
			throw new RuntimeException("Stub!");
		}

		default Stream<ArbitrarilyJumpableGenerator> jumps(final double distance) {
			throw new RuntimeException("Stub!");
		}

		default Stream<ArbitrarilyJumpableGenerator> jumps(final long streamSize, final double distance) {
			throw new RuntimeException("Stub!");
		}

		default void leap() {
			throw new RuntimeException("Stub!");
		}

		default ArbitrarilyJumpableGenerator copyAndJump(final double distance) {
			throw new RuntimeException("Stub!");
		}
	}

	interface JumpableGenerator extends StreamableGenerator {
		default JumpableGenerator of(final String name) {
			throw new RuntimeException("Stub!");
		}

		JumpableGenerator copy();

		void jump();

		double jumpDistance();

		default Stream<RandomGenerator> jumps() {
			throw new RuntimeException("Stub!");
		}

		default Stream<RandomGenerator> jumps(final long streamSize) {
			throw new RuntimeException("Stub!");
		}

		default Stream<RandomGenerator> rngs() {
			throw new RuntimeException("Stub!");
		}

		default Stream<RandomGenerator> rngs(final long streamSize) {
			throw new RuntimeException("Stub!");
		}

		default RandomGenerator copyAndJump() {
			throw new RuntimeException("Stub!");
		}
	}

	interface LeapableGenerator extends JumpableGenerator {
		default LeapableGenerator of(final String name) {
			throw new RuntimeException("Stub!");
		}

		LeapableGenerator copy();

		void leap();

		double leapDistance();

		default Stream<JumpableGenerator> leaps() {
			throw new RuntimeException("Stub!");
		}

		default Stream<JumpableGenerator> leaps(final long streamSize) {
			throw new RuntimeException("Stub!");
		}

		default JumpableGenerator copyAndLeap() {
			throw new RuntimeException("Stub!");
		}
	}

	interface SplittableGenerator extends StreamableGenerator {
		default SplittableGenerator of(final String name) {
			throw new RuntimeException("Stub!");
		}

		SplittableGenerator split();

		SplittableGenerator split(final SplittableGenerator p0);

		default Stream<SplittableGenerator> splits() {
			throw new RuntimeException("Stub!");
		}

		Stream<SplittableGenerator> splits(final long p0);

		Stream<SplittableGenerator> splits(final SplittableGenerator p0);

		Stream<SplittableGenerator> splits(final long p0, final SplittableGenerator p1);

		default Stream<RandomGenerator> rngs() {
			throw new RuntimeException("Stub!");
		}

		default Stream<RandomGenerator> rngs(final long streamSize) {
			throw new RuntimeException("Stub!");
		}
	}

	interface StreamableGenerator extends RandomGenerator {
		default StreamableGenerator of(final String name) {
			throw new RuntimeException("Stub!");
		}

		Stream<RandomGenerator> rngs();

		default Stream<RandomGenerator> rngs(final long streamSize) {
			throw new RuntimeException("Stub!");
		}
	}
}
