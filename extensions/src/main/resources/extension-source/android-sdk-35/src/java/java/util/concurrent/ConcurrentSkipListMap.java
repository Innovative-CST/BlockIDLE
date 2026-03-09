package java.util.concurrent;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ConcurrentSkipListMap<K, V> extends AbstractMap<K, V>
		implements ConcurrentNavigableMap<K, V>, Cloneable, Serializable {
	public ConcurrentSkipListMap() {
		throw new RuntimeException("Stub!");
	}

	public ConcurrentSkipListMap(final Comparator<? super K> comparator) {
		throw new RuntimeException("Stub!");
	}

	public ConcurrentSkipListMap(final Map<? extends K, ? extends V> m) {
		throw new RuntimeException("Stub!");
	}

	public ConcurrentSkipListMap(final SortedMap<K, ? extends V> m) {
		throw new RuntimeException("Stub!");
	}

	public ConcurrentSkipListMap<K, V> clone() {
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
	public V getOrDefault(final Object key, final V defaultValue) {
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
	public boolean containsValue(final Object value) {
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
	public void clear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public V computeIfAbsent(final K key, final Function<? super K, ? extends V> mappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public V computeIfPresent(final K key, final BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public V compute(final K key, final BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public V merge(final K key, final V value, final BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public NavigableSet<K> keySet() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public NavigableSet<K> navigableKeySet() {
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
	public ConcurrentNavigableMap<K, V> descendingMap() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public NavigableSet<K> descendingKeySet() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public V putIfAbsent(final K key, final V value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean remove(final Object key, final Object value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean replace(final K key, final V oldValue, final V newValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public V replace(final K key, final V value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Comparator<? super K> comparator() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public K firstKey() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public K lastKey() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public V putFirst(final K k, final V v) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public V putLast(final K k, final V v) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ConcurrentNavigableMap<K, V> subMap(final K fromKey, final boolean fromInclusive, final K toKey,
			final boolean toInclusive) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ConcurrentNavigableMap<K, V> headMap(final K toKey, final boolean inclusive) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ConcurrentNavigableMap<K, V> tailMap(final K fromKey, final boolean inclusive) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ConcurrentNavigableMap<K, V> subMap(final K fromKey, final K toKey) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ConcurrentNavigableMap<K, V> headMap(final K toKey) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public ConcurrentNavigableMap<K, V> tailMap(final K fromKey) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Map.Entry<K, V> lowerEntry(final K key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public K lowerKey(final K key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Map.Entry<K, V> floorEntry(final K key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public K floorKey(final K key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Map.Entry<K, V> ceilingEntry(final K key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public K ceilingKey(final K key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Map.Entry<K, V> higherEntry(final K key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public K higherKey(final K key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Map.Entry<K, V> firstEntry() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Map.Entry<K, V> lastEntry() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Map.Entry<K, V> pollFirstEntry() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Map.Entry<K, V> pollLastEntry() {
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
