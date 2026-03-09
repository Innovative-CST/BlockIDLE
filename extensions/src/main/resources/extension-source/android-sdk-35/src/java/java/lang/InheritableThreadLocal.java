package java.lang;

public class InheritableThreadLocal<T> extends ThreadLocal<T> {
	public InheritableThreadLocal() {
		throw new RuntimeException("Stub!");
	}

	protected T childValue(final T parentValue) {
		throw new RuntimeException("Stub!");
	}
}
