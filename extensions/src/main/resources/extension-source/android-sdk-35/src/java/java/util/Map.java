package java.util;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public interface Map<K, V> {
	int size();

	boolean isEmpty();

	boolean containsKey(@RecentlyNullable final Object p0);

	boolean containsValue(@RecentlyNullable final Object p0);

	@RecentlyNullable
	V get(@RecentlyNullable final Object p0);

	@RecentlyNullable
	V put(final K p0, final V p1);

	@RecentlyNullable
	V remove(@RecentlyNullable final Object p0);

	void putAll(@RecentlyNonNull final Map<? extends K, ? extends V> p0);

	void clear();

	@RecentlyNonNull
	Set<K> keySet();

	@RecentlyNonNull
	Collection<V> values();

	@RecentlyNonNull
	Set<Entry<K, V>> entrySet();

	boolean equals(@RecentlyNullable final Object p0);

	int hashCode();

	@RecentlyNullable
	default V getOrDefault(@RecentlyNullable final Object key, @RecentlyNullable final V defaultValue) {
		throw new RuntimeException("Stub!");
	}

	default void forEach(@RecentlyNonNull final BiConsumer<? super K, ? super V> action) {
		throw new RuntimeException("Stub!");
	}

	default void replaceAll(@RecentlyNonNull final BiFunction<? super K, ? super V, ? extends V> function) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	default V putIfAbsent(final K key, final V value) {
		throw new RuntimeException("Stub!");
	}

	default boolean remove(@RecentlyNullable final Object key, @RecentlyNullable final Object value) {
		throw new RuntimeException("Stub!");
	}

	default boolean replace(final K key, @RecentlyNullable final V oldValue, final V newValue) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	default V replace(final K key, final V value) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	default V computeIfAbsent(final K key, @RecentlyNonNull final Function<? super K, ? extends V> mappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	default V computeIfPresent(final K key,
			@RecentlyNonNull final BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	default V compute(final K key,
			@RecentlyNonNull final BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	default V merge(final K key, @RecentlyNonNull final V value,
			@RecentlyNonNull final BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <K, V> Map<K, V> of() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <K, V> Map<K, V> of(@RecentlyNonNull final K k1, @RecentlyNonNull final V v1) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <K, V> Map<K, V> of(@RecentlyNonNull final K k1, @RecentlyNonNull final V v1, @RecentlyNonNull final K k2,
			@RecentlyNonNull final V v2) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <K, V> Map<K, V> of(@RecentlyNonNull final K k1, @RecentlyNonNull final V v1, @RecentlyNonNull final K k2,
			@RecentlyNonNull final V v2, @RecentlyNonNull final K k3, @RecentlyNonNull final V v3) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <K, V> Map<K, V> of(@RecentlyNonNull final K k1, @RecentlyNonNull final V v1, @RecentlyNonNull final K k2,
			@RecentlyNonNull final V v2, @RecentlyNonNull final K k3, @RecentlyNonNull final V v3,
			@RecentlyNonNull final K k4, @RecentlyNonNull final V v4) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <K, V> Map<K, V> of(@RecentlyNonNull final K k1, @RecentlyNonNull final V v1, @RecentlyNonNull final K k2,
			@RecentlyNonNull final V v2, @RecentlyNonNull final K k3, @RecentlyNonNull final V v3,
			@RecentlyNonNull final K k4, @RecentlyNonNull final V v4, @RecentlyNonNull final K k5,
			@RecentlyNonNull final V v5) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <K, V> Map<K, V> of(@RecentlyNonNull final K k1, @RecentlyNonNull final V v1, @RecentlyNonNull final K k2,
			@RecentlyNonNull final V v2, @RecentlyNonNull final K k3, @RecentlyNonNull final V v3,
			@RecentlyNonNull final K k4, @RecentlyNonNull final V v4, @RecentlyNonNull final K k5,
			@RecentlyNonNull final V v5, @RecentlyNonNull final K k6, @RecentlyNonNull final V v6) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <K, V> Map<K, V> of(@RecentlyNonNull final K k1, @RecentlyNonNull final V v1, @RecentlyNonNull final K k2,
			@RecentlyNonNull final V v2, @RecentlyNonNull final K k3, @RecentlyNonNull final V v3,
			@RecentlyNonNull final K k4, @RecentlyNonNull final V v4, @RecentlyNonNull final K k5,
			@RecentlyNonNull final V v5, @RecentlyNonNull final K k6, @RecentlyNonNull final V v6,
			@RecentlyNonNull final K k7, @RecentlyNonNull final V v7) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <K, V> Map<K, V> of(@RecentlyNonNull final K k1, @RecentlyNonNull final V v1, @RecentlyNonNull final K k2,
			@RecentlyNonNull final V v2, @RecentlyNonNull final K k3, @RecentlyNonNull final V v3,
			@RecentlyNonNull final K k4, @RecentlyNonNull final V v4, @RecentlyNonNull final K k5,
			@RecentlyNonNull final V v5, @RecentlyNonNull final K k6, @RecentlyNonNull final V v6,
			@RecentlyNonNull final K k7, @RecentlyNonNull final V v7, @RecentlyNonNull final K k8,
			@RecentlyNonNull final V v8) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <K, V> Map<K, V> of(@RecentlyNonNull final K k1, @RecentlyNonNull final V v1, @RecentlyNonNull final K k2,
			@RecentlyNonNull final V v2, @RecentlyNonNull final K k3, @RecentlyNonNull final V v3,
			@RecentlyNonNull final K k4, @RecentlyNonNull final V v4, @RecentlyNonNull final K k5,
			@RecentlyNonNull final V v5, @RecentlyNonNull final K k6, @RecentlyNonNull final V v6,
			@RecentlyNonNull final K k7, @RecentlyNonNull final V v7, @RecentlyNonNull final K k8,
			@RecentlyNonNull final V v8, @RecentlyNonNull final K k9, @RecentlyNonNull final V v9) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <K, V> Map<K, V> of(@RecentlyNonNull final K k1, @RecentlyNonNull final V v1, @RecentlyNonNull final K k2,
			@RecentlyNonNull final V v2, @RecentlyNonNull final K k3, @RecentlyNonNull final V v3,
			@RecentlyNonNull final K k4, @RecentlyNonNull final V v4, @RecentlyNonNull final K k5,
			@RecentlyNonNull final V v5, @RecentlyNonNull final K k6, @RecentlyNonNull final V v6,
			@RecentlyNonNull final K k7, @RecentlyNonNull final V v7, @RecentlyNonNull final K k8,
			@RecentlyNonNull final V v8, @RecentlyNonNull final K k9, @RecentlyNonNull final V v9,
			@RecentlyNonNull final K k10, @RecentlyNonNull final V v10) {
		throw new RuntimeException("Stub!");
	}

	@SafeVarargs
	@RecentlyNonNull
	default <K, V> Map<K, V> ofEntries(@RecentlyNonNull final Entry<? extends K, ? extends V>... entries) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <K, V> Entry<K, V> entry(@RecentlyNonNull final K k, @RecentlyNonNull final V v) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default <K, V> Map<K, V> copyOf(@RecentlyNonNull final Map<? extends K, ? extends V> map) {
		throw new RuntimeException("Stub!");
	}

	interface Entry<K, V> {
		K getKey();

		V getValue();

		V setValue(final V p0);

		boolean equals(@RecentlyNullable final Object p0);

		int hashCode();

		@RecentlyNonNull
		default <K extends Comparable<? super K>, V> Comparator<Entry<K, V>> comparingByKey() {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		default <K, V extends Comparable<? super V>> Comparator<Entry<K, V>> comparingByValue() {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		default <K, V> Comparator<Entry<K, V>> comparingByKey(@RecentlyNonNull final Comparator<? super K> cmp) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		default <K, V> Comparator<Entry<K, V>> comparingByValue(@RecentlyNonNull final Comparator<? super V> cmp) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		default <K, V> Entry<K, V> copyOf(@RecentlyNonNull final Entry<? extends K, ? extends V> e) {
			throw new RuntimeException("Stub!");
		}
	}
}
