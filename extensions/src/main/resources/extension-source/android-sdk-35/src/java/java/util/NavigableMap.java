package java.util;

public interface NavigableMap<K, V> extends SortedMap<K, V> {
	@RecentlyNullable
	Map.Entry<K, V> lowerEntry(final K p0);

	@RecentlyNullable
	K lowerKey(final K p0);

	@RecentlyNullable
	Map.Entry<K, V> floorEntry(final K p0);

	@RecentlyNullable
	K floorKey(final K p0);

	@RecentlyNullable
	Map.Entry<K, V> ceilingEntry(final K p0);

	@RecentlyNullable
	K ceilingKey(final K p0);

	@RecentlyNullable
	Map.Entry<K, V> higherEntry(final K p0);

	@RecentlyNullable
	K higherKey(final K p0);

	@RecentlyNullable
	Map.Entry<K, V> firstEntry();

	@RecentlyNullable
	Map.Entry<K, V> lastEntry();

	@RecentlyNullable
	Map.Entry<K, V> pollFirstEntry();

	@RecentlyNullable
	Map.Entry<K, V> pollLastEntry();

	@RecentlyNonNull
	NavigableMap<K, V> descendingMap();

	@RecentlyNonNull
	NavigableSet<K> navigableKeySet();

	@RecentlyNonNull
	NavigableSet<K> descendingKeySet();

	@RecentlyNonNull
	NavigableMap<K, V> subMap(final K p0, final boolean p1, final K p2, final boolean p3);

	@RecentlyNonNull
	NavigableMap<K, V> headMap(final K p0, final boolean p1);

	@RecentlyNonNull
	NavigableMap<K, V> tailMap(final K p0, final boolean p1);

	@RecentlyNonNull
	SortedMap<K, V> subMap(final K p0, final K p1);

	@RecentlyNonNull
	SortedMap<K, V> headMap(final K p0);

	@RecentlyNonNull
	SortedMap<K, V> tailMap(final K p0);

	@RecentlyNonNull
	default NavigableMap<K, V> reversed() {
		throw new RuntimeException("Stub!");
	}
}
