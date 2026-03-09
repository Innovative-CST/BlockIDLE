package java.nio;

public abstract class DoubleBuffer extends Buffer implements Comparable<DoubleBuffer> {
	DoubleBuffer() {
		throw new RuntimeException("Stub!");
	}

	public static DoubleBuffer allocate(final int capacity) {
		throw new RuntimeException("Stub!");
	}

	public static DoubleBuffer wrap(final double[] array, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public static DoubleBuffer wrap(final double[] array) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract DoubleBuffer slice();

	@Override
	public abstract DoubleBuffer slice(final int p0, final int p1);

	@Override
	public abstract DoubleBuffer duplicate();

	public abstract DoubleBuffer asReadOnlyBuffer();

	public abstract double get();

	public abstract DoubleBuffer put(final double p0);

	public abstract double get(final int p0);

	public abstract DoubleBuffer put(final int p0, final double p1);

	public DoubleBuffer get(final double[] dst, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public DoubleBuffer get(final double[] dst) {
		throw new RuntimeException("Stub!");
	}

	public DoubleBuffer get(final int index, final double[] dst, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public DoubleBuffer get(final int index, final double[] dst) {
		throw new RuntimeException("Stub!");
	}

	public DoubleBuffer put(final DoubleBuffer src) {
		throw new RuntimeException("Stub!");
	}

	public DoubleBuffer put(final int index, final DoubleBuffer src, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public DoubleBuffer put(final double[] src, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public final DoubleBuffer put(final double[] src) {
		throw new RuntimeException("Stub!");
	}

	public DoubleBuffer put(final int index, final double[] src, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public DoubleBuffer put(final int index, final double[] src) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final boolean hasArray() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final double[] array() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final int arrayOffset() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Buffer position(final int newPosition) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Buffer limit(final int newLimit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Buffer mark() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Buffer reset() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Buffer clear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Buffer flip() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Buffer rewind() {
		throw new RuntimeException("Stub!");
	}

	public abstract DoubleBuffer compact();

	@Override
	public abstract boolean isDirect();

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object ob) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(final DoubleBuffer that) {
		throw new RuntimeException("Stub!");
	}

	public int mismatch(final DoubleBuffer that) {
		throw new RuntimeException("Stub!");
	}

	public abstract ByteOrder order();
}
