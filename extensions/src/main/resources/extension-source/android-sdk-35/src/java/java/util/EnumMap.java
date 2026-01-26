package java.util;

import java.io.Serializable;

public class EnumMap<K extends Enum<K>, V> extends AbstractMap<K, V> implements Serializable, Cloneable {
	public EnumMap(final Class<K> keyType) {
		throw new RuntimeException("Stub!");
	}

	public EnumMap(final EnumMap<K, ? extends V> m) {
		throw new RuntimeException("Stub!");
	}

	public EnumMap(final Map<K, ? extends V> m) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int size() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean containsValue(final Object value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean containsKey(final Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public V get(final Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public V put(final K key, final V value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public V remove(final Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void putAll(final Map<? extends K, ? extends V> m) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void clear() {
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
	public Set<Map.Entry<K, V>> entrySet() {
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

	public EnumMap<K, V> clone() {
		throw new RuntimeException("Stub!");
	}
}
