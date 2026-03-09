package java.nio;

public abstract class IntBuffer extends Buffer implements Comparable<IntBuffer> {
	IntBuffer() {
		throw new RuntimeException("Stub!");
	}

	public static IntBuffer allocate(final int capacity) {
		throw new RuntimeException("Stub!");
	}

	public static IntBuffer wrap(final int[] array, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public static IntBuffer wrap(final int[] array) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract IntBuffer slice();

	@Override
	public abstract IntBuffer slice(final int p0, final int p1);

	@Override
	public abstract IntBuffer duplicate();

	public abstract IntBuffer asReadOnlyBuffer();

	public abstract int get();

	public abstract IntBuffer put(final int p0);

	public abstract int get(final int p0);

	public abstract IntBuffer put(final int p0, final int p1);

	public IntBuffer get(final int[] dst, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public IntBuffer get(final int[] dst) {
		throw new RuntimeException("Stub!");
	}

	public IntBuffer get(final int index, final int[] dst, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public IntBuffer get(final int index, final int[] dst) {
		throw new RuntimeException("Stub!");
	}

	public IntBuffer put(final IntBuffer src) {
		throw new RuntimeException("Stub!");
	}

	public IntBuffer put(final int index, final IntBuffer src, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public IntBuffer put(final int[] src, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public final IntBuffer put(final int[] src) {
		throw new RuntimeException("Stub!");
	}

	public IntBuffer put(final int index, final int[] src, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public IntBuffer put(final int index, final int[] src) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final boolean hasArray() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final int[] array() {
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

	public abstract IntBuffer compact();

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
	public int compareTo(final IntBuffer that) {
		throw new RuntimeException("Stub!");
	}

	public int mismatch(final IntBuffer that) {
		throw new RuntimeException("Stub!");
	}

	public abstract ByteOrder order();
}
