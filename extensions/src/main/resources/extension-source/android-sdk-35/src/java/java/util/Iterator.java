package java.util;

import java.util.function.Consumer;

public interface Iterator<E> {
	boolean hasNext();

	E next();

	default void remove() {
		throw new RuntimeException("Stub!");
	}

	default void forEachRemaining(@RecentlyNonNull final Consumer<? super E> action) {
		throw new RuntimeException("Stub!");
	}
}
