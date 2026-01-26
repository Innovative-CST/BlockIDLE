package java.lang.ref;

public class WeakReference<T> extends Reference<T> {
	public WeakReference(final T referent) {
		throw new RuntimeException("Stub!");
	}

	public WeakReference(final T referent, final ReferenceQueue<? super T> q) {
		throw new RuntimeException("Stub!");
	}
}
