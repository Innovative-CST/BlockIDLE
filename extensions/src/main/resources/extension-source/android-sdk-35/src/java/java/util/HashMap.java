package java.util;

import java.io.Serializable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class HashMap<K, V> extends AbstractMap<K, V> implements Map<K, V>, Cloneable, Serializable {
	public HashMap(final int initialCapacity, final float loadFactor) {
		throw new RuntimeException("Stub!");
	}

	public HashMap(final int initialCapacity) {
		throw new RuntimeException("Stub!");
	}

	public HashMap() {
		throw new RuntimeException("Stub!");
	}

	public HashMap(@RecentlyNonNull final Map<? extends K, ? extends V> m) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int size() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isEmpty() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V get(@RecentlyNullable final Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean containsKey(@RecentlyNullable final Object key) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V put(final K key, final V value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void putAll(@RecentlyNonNull final Map<? extends K, ? extends V> m) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V remove(@RecentlyNullable final Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void clear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean containsValue(@RecentlyNullable final Object value) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Set<K> keySet() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Collection<V> values() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Set<Entry<K, V>> entrySet() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V getOrDefault(@RecentlyNullable final Object key, @RecentlyNullable final V defaultValue) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V putIfAbsent(final K key, final V value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean remove(@RecentlyNullable final Object key, @RecentlyNullable final Object value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean replace(final K key, @RecentlyNullable final V oldValue, final V newValue) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V replace(final K key, final V value) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V computeIfAbsent(final K key, @RecentlyNonNull final Function<? super K, ? extends V> mappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V computeIfPresent(final K key,
			@RecentlyNonNull final BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V compute(final K key,
			@RecentlyNonNull final BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V merge(final K key, @RecentlyNonNull final V value,
			@RecentlyNonNull final BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void forEach(@RecentlyNonNull final BiConsumer<? super K, ? super V> action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void replaceAll(@RecentlyNonNull final BiFunction<? super K, ? super V, ? extends V> function) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Object clone() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <K, V> HashMap<K, V> newHashMap(final int numMappings) {
		throw new RuntimeException("Stub!");
	}
}
