package java.lang;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public interface Iterable<T> {
	@RecentlyNonNull
	Iterator<T> iterator();

	default void forEach(@RecentlyNonNull final Consumer<? super T> action) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default Spliterator<T> spliterator() {
		throw new RuntimeException("Stub!");
	}
}
