package java.lang;

public abstract class ClassValue<T> {
	protected ClassValue() {
		throw new RuntimeException("Stub!");
	}

	protected abstract T computeValue(final Class<?> p0);

	public T get(final Class<?> type) {
		throw new RuntimeException("Stub!");
	}

	public void remove(final Class<?> type) {
		throw new RuntimeException("Stub!");
	}
}
