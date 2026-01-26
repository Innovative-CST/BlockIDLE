package java.nio.channels;

public abstract class SelectionKey {
	public static final int OP_ACCEPT = 16;
	public static final int OP_CONNECT = 8;
	public static final int OP_READ = 1;
	public static final int OP_WRITE = 4;

	protected SelectionKey() {
		throw new RuntimeException("Stub!");
	}

	public abstract SelectableChannel channel();

	public abstract Selector selector();

	public abstract boolean isValid();

	public abstract void cancel();

	public abstract int interestOps();

	public abstract SelectionKey interestOps(final int p0);

	public int interestOpsOr(final int ops) {
		throw new RuntimeException("Stub!");
	}

	public int interestOpsAnd(final int ops) {
		throw new RuntimeException("Stub!");
	}

	public abstract int readyOps();

	public final boolean isReadable() {
		throw new RuntimeException("Stub!");
	}

	public final boolean isWritable() {
		throw new RuntimeException("Stub!");
	}

	public final boolean isConnectable() {
		throw new RuntimeException("Stub!");
	}

	public final boolean isAcceptable() {
		throw new RuntimeException("Stub!");
	}

	public final Object attach(final Object ob) {
		throw new RuntimeException("Stub!");
	}

	public final Object attachment() {
		throw new RuntimeException("Stub!");
	}
}
