package java.nio;

public abstract class MappedByteBuffer extends ByteBuffer {
	MappedByteBuffer() {
		throw new RuntimeException("Stub!");
	}

	public final boolean isLoaded() {
		throw new RuntimeException("Stub!");
	}

	public final MappedByteBuffer load() {
		throw new RuntimeException("Stub!");
	}

	public final MappedByteBuffer force() {
		throw new RuntimeException("Stub!");
	}

	public final MappedByteBuffer force(final int index, final int length) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final Buffer position(final int newPosition) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final Buffer limit(final int newLimit) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final Buffer mark() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final Buffer reset() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final Buffer clear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final Buffer flip() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final Buffer rewind() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract ByteBuffer slice();

	@Override
	public abstract MappedByteBuffer slice(final int p0, final int p1);

	@Override
	public abstract ByteBuffer duplicate();

	@Override
	public abstract ByteBuffer compact();
}
