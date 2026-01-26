package java.util;

import java.io.Serializable;
import java.util.random.RandomGenerator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Random implements RandomGenerator, Serializable {
	public Random() {
		throw new RuntimeException("Stub!");
	}

	public Random(final long seed) {
		throw new RuntimeException("Stub!");
	}

	public synchronized void setSeed(final long seed) {
		throw new RuntimeException("Stub!");
	}

	protected int next(final int bits) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void nextBytes(final byte[] bytes) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int nextInt() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int nextInt(final int bound) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long nextLong() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean nextBoolean() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public float nextFloat() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public double nextDouble() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized double nextGaussian() {
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
