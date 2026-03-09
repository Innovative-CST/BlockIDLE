package java.util;

public interface SortedMap<K, V> extends SequencedMap<K, V>, Map<K, V> {
	@RecentlyNullable
	Comparator<? super K> comparator();

	@RecentlyNonNull
	SortedMap<K, V> subMap(final K p0, final K p1);

	@RecentlyNonNull
	SortedMap<K, V> headMap(final K p0);

	@RecentlyNonNull
	SortedMap<K, V> tailMap(final K p0);

	K firstKey();

	K lastKey();

	@RecentlyNonNull
	Set<K> keySet();

	@RecentlyNonNull
	Collection<V> values();

	@RecentlyNonNull
	Set<Entry<K, V>> entrySet();

	@RecentlyNullable
	default V putFirst(final K k, final V v) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	default V putLast(final K k, final V v) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default SortedMap<K, V> reversed() {
		throw new RuntimeException("Stub!");
	}
}
