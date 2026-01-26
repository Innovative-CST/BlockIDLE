package java.util;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class LinkedHashMap<K, V> extends HashMap<K, V> implements SequencedMap<K, V>, Map<K, V> {
	public LinkedHashMap(final int initialCapacity, final float loadFactor) {
		throw new RuntimeException("Stub!");
	}

	public LinkedHashMap(final int initialCapacity) {
		throw new RuntimeException("Stub!");
	}

	public LinkedHashMap() {
		throw new RuntimeException("Stub!");
	}

	public LinkedHashMap(final Map<? extends K, ? extends V> m) {
		throw new RuntimeException("Stub!");
	}

	public LinkedHashMap(final int initialCapacity, final float loadFactor, final boolean accessOrder) {
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
	public boolean containsValue(final Object value) {
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
	public void clear() {
		throw new RuntimeException("Stub!");
	}

	protected boolean removeEldestEntry(final Entry<K, V> eldest) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Set<K> keySet() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public SequencedSet<K> sequencedKeySet() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Collection<V> values() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public SequencedCollection<V> sequencedValues() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public SequencedSet<Entry<K, V>> sequencedEntrySet() {
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

	public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(final int numMappings) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public SequencedMap<K, V> reversed() {
		throw new RuntimeException("Stub!");
	}
}
