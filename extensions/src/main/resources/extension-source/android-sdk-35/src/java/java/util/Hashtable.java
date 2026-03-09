package java.util;

import java.io.Serializable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Hashtable<K, V> extends Dictionary<K, V> implements Map<K, V>, Cloneable, Serializable {
	public Hashtable(final int initialCapacity, final float loadFactor) {
		throw new RuntimeException("Stub!");
	}

	public Hashtable(final int initialCapacity) {
		throw new RuntimeException("Stub!");
	}

	public Hashtable() {
		throw new RuntimeException("Stub!");
	}

	public Hashtable(final Map<? extends K, ? extends V> t) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized int size() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized boolean isEmpty() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized Enumeration<K> keys() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized Enumeration<V> elements() {
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean contains(final Object value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean containsValue(final Object value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized boolean containsKey(final Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized V get(final Object key) {
		throw new RuntimeException("Stub!");
	}

	protected void rehash() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized V put(final K key, final V value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized V remove(final Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void putAll(final Map<? extends K, ? extends V> t) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void clear() {
		throw new RuntimeException("Stub!");
	}

	public synchronized Object clone() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Set<K> keySet() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Collection<V> values() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized boolean equals(final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized V getOrDefault(final Object key, final V defaultValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void forEach(final BiConsumer<? super K, ? super V> action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void replaceAll(final BiFunction<? super K, ? super V, ? extends V> function) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized V putIfAbsent(final K key, final V value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized boolean remove(final Object key, final Object value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized boolean replace(final K key, final V oldValue, final V newValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized V replace(final K key, final V value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized V computeIfAbsent(final K key, final Function<? super K, ? extends V> mappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized V computeIfPresent(final K key,
			final BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized V compute(final K key, final BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized V merge(final K key, final V value,
			final BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
		throw new RuntimeException("Stub!");
	}
}
