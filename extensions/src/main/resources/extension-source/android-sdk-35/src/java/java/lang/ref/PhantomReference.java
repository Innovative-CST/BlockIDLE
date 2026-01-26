package java.lang.ref;

public class PhantomReference<T> extends Reference<T> {
	public PhantomReference(final T referent, final ReferenceQueue<? super T> q) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public T get() {
		throw new RuntimeException("Stub!");
	}
}
