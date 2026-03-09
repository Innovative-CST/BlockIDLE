package java.lang.ref;

public abstract class Reference<T> {
	Reference() {
		throw new RuntimeException("Stub!");
	}

	public T get() {
		throw new RuntimeException("Stub!");
	}

	public final boolean refersTo(final T obj) {
		throw new RuntimeException("Stub!");
	}

	public void clear() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public boolean isEnqueued() {
		throw new RuntimeException("Stub!");
	}

	public boolean enqueue() {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new RuntimeException("Stub!");
	}

	public static void reachabilityFence(final Object ref) {
		throw new RuntimeException("Stub!");
	}
}
