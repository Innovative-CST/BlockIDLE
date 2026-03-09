package java.util;

import java.io.Serializable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class TreeMap<K, V> extends AbstractMap<K, V> implements NavigableMap<K, V>, Cloneable, Serializable {
	public TreeMap() {
		throw new RuntimeException("Stub!");
	}

	public TreeMap(@RecentlyNullable final Comparator<? super K> comparator) {
		throw new RuntimeException("Stub!");
	}

	public TreeMap(@RecentlyNonNull final Map<? extends K, ? extends V> m) {
		throw new RuntimeException("Stub!");
	}

	public TreeMap(@RecentlyNonNull final SortedMap<K, ? extends V> m) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int size() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean containsKey(@RecentlyNullable final Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean containsValue(@RecentlyNullable final Object value) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V get(@RecentlyNullable final Object key) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
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

	@RecentlyNullable
	@Override
	public V putFirst(final K k, final V v) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V putLast(final K k, final V v) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void putAll(@RecentlyNonNull final Map<? extends K, ? extends V> map) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V put(final K key, final V value) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V putIfAbsent(final K key, final V value) {
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

	@RecentlyNullable
	@Override
	public V remove(@RecentlyNullable final Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void clear() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Object clone() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public Map.Entry<K, V> firstEntry() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public Map.Entry<K, V> lastEntry() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public Map.Entry<K, V> pollFirstEntry() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public Map.Entry<K, V> pollLastEntry() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public Map.Entry<K, V> lowerEntry(final K key) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public K lowerKey(final K key) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public Map.Entry<K, V> floorEntry(final K key) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public K floorKey(final K key) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public Map.Entry<K, V> ceilingEntry(final K key) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public K ceilingKey(final K key) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public Map.Entry<K, V> higherEntry(final K key) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public K higherKey(final K key) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Set<K> keySet() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public NavigableSet<K> navigableKeySet() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public NavigableSet<K> descendingKeySet() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Collection<V> values() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Set<Map.Entry<K, V>> entrySet() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public NavigableMap<K, V> descendingMap() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public NavigableMap<K, V> subMap(final K fromKey, final boolean fromInclusive, final K toKey,
			final boolean toInclusive) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public NavigableMap<K, V> headMap(final K toKey, final boolean inclusive) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public NavigableMap<K, V> tailMap(final K fromKey, final boolean inclusive) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public SortedMap<K, V> subMap(final K fromKey, final K toKey) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public SortedMap<K, V> headMap(final K toKey) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public SortedMap<K, V> tailMap(final K fromKey) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean replace(final K key, @RecentlyNullable final V oldValue, final V newValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public V replace(final K key, final V value) {
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
