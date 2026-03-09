package java.nio;

public abstract class ByteBuffer extends Buffer implements Comparable<ByteBuffer> {
	ByteBuffer() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static ByteBuffer allocateDirect(final int capacity) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static ByteBuffer allocate(final int capacity) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static ByteBuffer wrap(@RecentlyNonNull final byte[] array, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static ByteBuffer wrap(@RecentlyNonNull final byte[] array) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public abstract ByteBuffer slice();

	@RecentlyNonNull
	@Override
	public abstract ByteBuffer slice(final int p0, final int p1);

	@RecentlyNonNull
	@Override
	public abstract ByteBuffer duplicate();

	@RecentlyNonNull
	public abstract ByteBuffer asReadOnlyBuffer();

	public abstract byte get();

	@RecentlyNonNull
	public abstract ByteBuffer put(final byte p0);

	public abstract byte get(final int p0);

	@RecentlyNonNull
	public abstract ByteBuffer put(final int p0, final byte p1);

	@RecentlyNonNull
	public ByteBuffer get(@RecentlyNonNull final byte[] dst, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public ByteBuffer get(@RecentlyNonNull final byte[] dst) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public ByteBuffer get(final int index, @RecentlyNonNull final byte[] dst, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public ByteBuffer get(final int index, @RecentlyNonNull final byte[] dst) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public ByteBuffer put(@RecentlyNonNull final ByteBuffer src) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public ByteBuffer put(final int index, @RecentlyNonNull final ByteBuffer src, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public ByteBuffer put(@RecentlyNonNull final byte[] src, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public final ByteBuffer put(@RecentlyNonNull final byte[] src) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public ByteBuffer put(final int index, @RecentlyNonNull final byte[] src, final int offset, final int length) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public ByteBuffer put(final int index, @RecentlyNonNull final byte[] src) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final boolean hasArray() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public final byte[] array() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final int arrayOffset() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Buffer position(final int newPosition) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Buffer limit(final int newLimit) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Buffer mark() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Buffer reset() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Buffer clear() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Buffer flip() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Buffer rewind() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public abstract ByteBuffer compact();

	@Override
	public abstract boolean isDirect();

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object ob) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(@RecentlyNonNull final ByteBuffer that) {
		throw new RuntimeException("Stub!");
	}

	public int mismatch(@RecentlyNonNull final ByteBuffer that) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public final ByteOrder order() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public final ByteBuffer order(@RecentlyNonNull final ByteOrder bo) {
		throw new RuntimeException("Stub!");
	}

	public final int alignmentOffset(final int index, final int unitSize) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public final ByteBuffer alignedSlice(final int unitSize) {
		throw new RuntimeException("Stub!");
	}

	public abstract char getChar();

	@RecentlyNonNull
	public abstract ByteBuffer putChar(final char p0);

	public abstract char getChar(final int p0);

	@RecentlyNonNull
	public abstract ByteBuffer putChar(final int p0, final char p1);

	@RecentlyNonNull
	public abstract CharBuffer asCharBuffer();

	public abstract short getShort();

	@RecentlyNonNull
	public abstract ByteBuffer putShort(final short p0);

	public abstract short getShort(final int p0);

	@RecentlyNonNull
	public abstract ByteBuffer putShort(final int p0, final short p1);

	@RecentlyNonNull
	public abstract ShortBuffer asShortBuffer();

	public abstract int getInt();

	@RecentlyNonNull
	public abstract ByteBuffer putInt(final int p0);

	public abstract int getInt(final int p0);

	@RecentlyNonNull
	public abstract ByteBuffer putInt(final int p0, final int p1);

	@RecentlyNonNull
	public abstract IntBuffer asIntBuffer();

	public abstract long getLong();

	@RecentlyNonNull
	public abstract ByteBuffer putLong(final long p0);

	public abstract long getLong(final int p0);

	@RecentlyNonNull
	public abstract ByteBuffer putLong(final int p0, final long p1);

	@RecentlyNonNull
	public abstract LongBuffer asLongBuffer();

	public abstract float getFloat();

	@RecentlyNonNull
	public abstract ByteBuffer putFloat(final float p0);

	public abstract float getFloat(final int p0);

	@RecentlyNonNull
	public abstract ByteBuffer putFloat(final int p0, final float p1);

	@RecentlyNonNull
	public abstract FloatBuffer asFloatBuffer();

	public abstract double getDouble();

	@RecentlyNonNull
	public abstract ByteBuffer putDouble(final double p0);

	public abstract double getDouble(final int p0);

	@RecentlyNonNull
	public abstract ByteBuffer putDouble(final int p0, final double p1);

	@RecentlyNonNull
	public abstract DoubleBuffer asDoubleBuffer();
}
