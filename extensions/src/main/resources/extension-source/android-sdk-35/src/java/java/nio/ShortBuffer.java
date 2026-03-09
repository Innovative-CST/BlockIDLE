package java.nio;

public abstract class ShortBuffer extends Buffer implements Comparable<ShortBuffer> {
	ShortBuffer() {
		throw new RuntimeException("Stub!");
	}

	public static ShortBuffer allocate(final int capacity) {
		throw new RuntimeException("Stub!");
	}

	public static ShortBuffer wrap(final short[] array, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public static ShortBuffer wrap(final short[] array) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract ShortBuffer slice();

	@Override
	public abstract ShortBuffer slice(final int p0, final int p1);

	@Override
	public abstract ShortBuffer duplicate();

	public abstract ShortBuffer asReadOnlyBuffer();

	public abstract short get();

	public abstract ShortBuffer put(final short p0);

	public abstract short get(final int p0);

	public abstract ShortBuffer put(final int p0, final short p1);

	public ShortBuffer get(final short[] dst, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public ShortBuffer get(final short[] dst) {
		throw new RuntimeException("Stub!");
	}

	public ShortBuffer get(final int index, final short[] dst, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public ShortBuffer get(final int index, final short[] dst) {
		throw new RuntimeException("Stub!");
	}

	public ShortBuffer put(final ShortBuffer src) {
		throw new RuntimeException("Stub!");
	}

	public ShortBuffer put(final int index, final ShortBuffer src, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public ShortBuffer put(final short[] src, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public final ShortBuffer put(final short[] src) {
		throw new RuntimeException("Stub!");
	}

	public ShortBuffer put(final int index, final short[] src, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public ShortBuffer put(final int index, final short[] src) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final boolean hasArray() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final short[] array() {
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

	public abstract ShortBuffer compact();

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
	public int compareTo(final ShortBuffer that) {
		throw new RuntimeException("Stub!");
	}

	public int mismatch(final ShortBuffer that) {
		throw new RuntimeException("Stub!");
	}

	public abstract ByteOrder order();
}
