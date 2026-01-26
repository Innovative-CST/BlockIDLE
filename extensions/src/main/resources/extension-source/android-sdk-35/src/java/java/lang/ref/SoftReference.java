package java.lang.ref;

public class SoftReference<T> extends Reference<T> {
	public SoftReference(final T referent) {
		throw new RuntimeException("Stub!");
	}

	public SoftReference(final T referent, final ReferenceQueue<? super T> q) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public T get() {
		throw new RuntimeException("Stub!");
	}
}
