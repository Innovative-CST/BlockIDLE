package java.lang;

import java.util.function.Supplier;

public class ThreadLocal<T> {
	public ThreadLocal() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	protected T initialValue() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <S> ThreadLocal<S> withInitial(@RecentlyNonNull final Supplier<? extends S> supplier) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public T get() {
		throw new RuntimeException("Stub!");
	}

	public void set(final T value) {
		throw new RuntimeException("Stub!");
	}

	public void remove() {
		throw new RuntimeException("Stub!");
	}
}
