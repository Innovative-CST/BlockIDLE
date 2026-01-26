package java.nio;

public abstract class Buffer {
	Buffer() {
		throw new RuntimeException("Stub!");
	}

	public final int capacity() {
		throw new RuntimeException("Stub!");
	}

	public final int position() {
		throw new RuntimeException("Stub!");
	}

	public Buffer position(final int newPosition) {
		throw new RuntimeException("Stub!");
	}

	public final int limit() {
		throw new RuntimeException("Stub!");
	}

	public Buffer limit(final int newLimit) {
		throw new RuntimeException("Stub!");
	}

	public Buffer mark() {
		throw new RuntimeException("Stub!");
	}

	public Buffer reset() {
		throw new RuntimeException("Stub!");
	}

	public Buffer clear() {
		throw new RuntimeException("Stub!");
	}

	public Buffer flip() {
		throw new RuntimeException("Stub!");
	}

	public Buffer rewind() {
		throw new RuntimeException("Stub!");
	}

	public final int remaining() {
		throw new RuntimeException("Stub!");
	}

	public final boolean hasRemaining() {
		throw new RuntimeException("Stub!");
	}

	public abstract boolean isReadOnly();

	public abstract boolean hasArray();

	public abstract Object array();

	public abstract int arrayOffset();

	public abstract boolean isDirect();

	public abstract Buffer slice();

	public abstract Buffer slice(final int p0, final int p1);

	public abstract Buffer duplicate();
}
