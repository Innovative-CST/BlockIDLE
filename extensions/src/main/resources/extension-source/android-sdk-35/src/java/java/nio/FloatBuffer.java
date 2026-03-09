package java.nio;

public abstract class FloatBuffer extends Buffer implements Comparable<FloatBuffer> {
	FloatBuffer() {
		throw new RuntimeException("Stub!");
	}

	public static FloatBuffer allocate(final int capacity) {
		throw new RuntimeException("Stub!");
	}

	public static FloatBuffer wrap(final float[] array, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public static FloatBuffer wrap(final float[] array) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract FloatBuffer slice();

	@Override
	public abstract FloatBuffer slice(final int p0, final int p1);

	@Override
	public abstract FloatBuffer duplicate();

	public abstract FloatBuffer asReadOnlyBuffer();

	public abstract float get();

	public abstract FloatBuffer put(final float p0);

	public abstract float get(final int p0);

	public abstract FloatBuffer put(final int p0, final float p1);

	public FloatBuffer get(final float[] dst, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public FloatBuffer get(final float[] dst) {
		throw new RuntimeException("Stub!");
	}

	public FloatBuffer get(final int index, final float[] dst, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public FloatBuffer get(final int index, final float[] dst) {
		throw new RuntimeException("Stub!");
	}

	public FloatBuffer put(final FloatBuffer src) {
		throw new RuntimeException("Stub!");
	}

	public FloatBuffer put(final int index, final FloatBuffer src, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public FloatBuffer put(final float[] src, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public final FloatBuffer put(final float[] src) {
		throw new RuntimeException("Stub!");
	}

	public FloatBuffer put(final int index, final float[] src, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	public FloatBuffer put(final int index, final float[] src) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final boolean hasArray() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final float[] array() {
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

	public abstract FloatBuffer compact();

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
	public int compareTo(final FloatBuffer that) {
		throw new RuntimeException("Stub!");
	}

	public int mismatch(final FloatBuffer that) {
		throw new RuntimeException("Stub!");
	}

	public abstract ByteOrder order();
}
