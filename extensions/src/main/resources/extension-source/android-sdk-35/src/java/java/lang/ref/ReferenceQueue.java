package java.lang.ref;

public class ReferenceQueue<T> {
	public ReferenceQueue() {
		throw new RuntimeException("Stub!");
	}

	public Reference<? extends T> poll() {
		throw new RuntimeException("Stub!");
	}

	public Reference<? extends T> remove(final long timeout) throws IllegalArgumentException, InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public Reference<? extends T> remove() throws InterruptedException {
		throw new RuntimeException("Stub!");
	}
}
