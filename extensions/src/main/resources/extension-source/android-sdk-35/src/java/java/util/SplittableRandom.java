package java.util;

import java.util.random.RandomGenerator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public final class SplittableRandom implements RandomGenerator, SplittableGenerator {
	public SplittableRandom(final long seed) {
		throw new RuntimeException("Stub!");
	}

	public SplittableRandom() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public SplittableRandom split() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public SplittableRandom split(final SplittableGenerator source) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int nextInt() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long nextLong() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void nextBytes(final byte[] bytes) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Stream<SplittableGenerator> splits() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Stream<SplittableGenerator> splits(final long streamSize) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Stream<SplittableGenerator> splits(final SplittableGenerator source) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Stream<SplittableGenerator> splits(final long streamSize, final SplittableGenerator source) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public IntStream ints(final long streamSize) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public IntStream ints() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public IntStream ints(final long streamSize, final int randomNumberOrigin, final int randomNumberBound) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public IntStream ints(final int randomNumberOrigin, final int randomNumberBound) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LongStream longs(final long streamSize) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LongStream longs() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LongStream longs(final long streamSize, final long randomNumberOrigin, final long randomNumberBound) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public LongStream longs(final long randomNumberOrigin, final long randomNumberBound) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public DoubleStream doubles(final long streamSize) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public DoubleStream doubles() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public DoubleStream doubles(final long streamSize, final double randomNumberOrigin,
			final double randomNumberBound) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public DoubleStream doubles(final double randomNumberOrigin, final double randomNumberBound) {
		throw new RuntimeException("Stub!");
	}
}
