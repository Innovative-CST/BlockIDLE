package java.nio;

public abstract class LongBuffer extends Buffer implements Comparable<LongBuffer> {
	LongBuffer() {
		throw new RuntimeException("Stub!");
	}

	public static LongBuffer allocate(final int capacity) {
		throw new RuntimeException("Stub!");
	}

	public static LongBuffer wrap(final long[] array, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public static LongBuffer wrap(final long[] array) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract LongBuffer slice();

	@Override
	public abstract LongBuffer slice(final int p0, final int p1);

	@Override
	public abstract LongBuffer duplicate();

	public abstract LongBuffer asReadOnlyBuffer();

	public abstract long get();

	public abstract LongBuffer put(final long p0);

	public abstract long get(final int p0);

	public abstract LongBuffer put(final int p0, final long p1);

	public LongBuffer get(final long[] dst, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public LongBuffer get(final long[] dst) {
		throw new RuntimeException("Stub!");
	}

	public LongBuffer get(final int index, final long[] dst, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public LongBuffer get(final int index, final long[] dst) {
		throw new RuntimeException("Stub!");
	}

	public LongBuffer put(final LongBuffer src) {
		throw new RuntimeException("Stub!");
	}

	public LongBuffer put(final int index, final LongBuffer src, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public LongBuffer put(final long[] src, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public final LongBuffer put(final long[] src) {
		throw new RuntimeException("Stub!");
	}

	public LongBuffer put(final int index, final long[] src, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public LongBuffer put(final int index, final long[] src) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final boolean hasArray() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final long[] array() {
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

	public abstract LongBuffer compact();

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
	public int compareTo(final LongBuffer that) {
		throw new RuntimeException("Stub!");
	}

	public int mismatch(final LongBuffer that) {
		throw new RuntimeException("Stub!");
	}

	public abstract ByteOrder order();
}
