package java.nio.file;

public interface WatchEvent<T> {
	Kind<T> kind();

	int count();

	T context();

	interface Modifier {
		String name();
	}

	interface Kind<T> {
		String name();

		Class<T> type();
	}
}
