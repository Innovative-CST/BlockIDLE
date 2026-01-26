package java.util.concurrent;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public interface ConcurrentMap<K, V> extends Map<K, V> {
	default V getOrDefault(final Object key, final V defaultValue) {
		throw new RuntimeException("Stub!");
	}

	default void forEach(final BiConsumer<? super K, ? super V> action) {
		throw new RuntimeException("Stub!");
	}

	V putIfAbsent(final K p0, final V p1);

	boolean remove(final Object p0, final Object p1);

	boolean replace(final K p0, final V p1, final V p2);

	V replace(final K p0, final V p1);

	default void replaceAll(final BiFunction<? super K, ? super V, ? extends V> function) {
		throw new RuntimeException("Stub!");
	}

	default V computeIfAbsent(final K key, final Function<? super K, ? extends V> mappingFunction) {
		throw new RuntimeException("Stub!");
	}

	default V computeIfPresent(final K key, final BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	default V compute(final K key, final BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	default V merge(final K key, final V value, final BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
		throw new RuntimeException("Stub!");
	}
}
