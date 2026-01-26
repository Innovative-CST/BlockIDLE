package java.util;

import java.util.function.Supplier;
import java.util.stream.Stream;

public final class ServiceLoader<S> implements Iterable<S> {
	ServiceLoader() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Iterator<S> iterator() {
		throw new RuntimeException("Stub!");
	}

	public Stream<Provider<S>> stream() {
		throw new RuntimeException("Stub!");
	}

	public static <S> ServiceLoader<S> load(final Class<S> service, final ClassLoader loader) {
		throw new RuntimeException("Stub!");
	}

	public static <S> ServiceLoader<S> load(final Class<S> service) {
		throw new RuntimeException("Stub!");
	}

	public static <S> ServiceLoader<S> loadInstalled(final Class<S> service) {
		throw new RuntimeException("Stub!");
	}

	public Optional<S> findFirst() {
		throw new RuntimeException("Stub!");
	}

	public void reload() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public interface Provider<S> extends Supplier<S> {
		Class<? extends S> type();

		S get();
	}
}
