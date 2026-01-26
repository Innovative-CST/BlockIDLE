package java.util;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class WeakHashMap<K, V> extends AbstractMap<K, V> implements Map<K, V> {
	public WeakHashMap(final int initialCapacity, final float loadFactor) {
		throw new RuntimeException("Stub!");
	}

	public WeakHashMap(final int initialCapacity) {
		throw new RuntimeException("Stub!");
	}

	public WeakHashMap() {
		throw new RuntimeException("Stub!");
	}

	public WeakHashMap(@RecentlyNonNull final Map<? extends K, ? extends V> m) {
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

	@Override
	public void forEach(@RecentlyNonNull final BiConsumer<? super K, ? super V> action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void replaceAll(@RecentlyNonNull final BiFunction<? super K, ? super V, ? extends V> function) {
		throw new RuntimeException("Stub!");
	}
}
