package java.util;

import java.io.Serializable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class IdentityHashMap<K, V> extends AbstractMap<K, V> implements Map<K, V>, Serializable, Cloneable {
	public IdentityHashMap() {
		throw new RuntimeException("Stub!");
	}

	public IdentityHashMap(final int expectedMaxSize) {
		throw new RuntimeException("Stub!");
	}

	public IdentityHashMap(final Map<? extends K, ? extends V> m) {
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

	@Override
	public V get(final Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean containsKey(final Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean containsValue(final Object value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public V put(final K key, final V value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void putAll(final Map<? extends K, ? extends V> m) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public V remove(final Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void clear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	public Object clone() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Set<K> keySet() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Collection<V> values() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void forEach(final BiConsumer<? super K, ? super V> action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void replaceAll(final BiFunction<? super K, ? super V, ? extends V> function) {
		throw new RuntimeException("Stub!");
	}
}
