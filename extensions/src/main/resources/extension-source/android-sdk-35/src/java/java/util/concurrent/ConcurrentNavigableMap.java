package java.util.concurrent;

import java.util.NavigableMap;
import java.util.NavigableSet;

public interface ConcurrentNavigableMap<K, V> extends ConcurrentMap<K, V>, NavigableMap<K, V> {
	ConcurrentNavigableMap<K, V> subMap(final K p0, final boolean p1, final K p2, final boolean p3);

	ConcurrentNavigableMap<K, V> headMap(final K p0, final boolean p1);

	ConcurrentNavigableMap<K, V> tailMap(final K p0, final boolean p1);

	ConcurrentNavigableMap<K, V> subMap(final K p0, final K p1);

	ConcurrentNavigableMap<K, V> headMap(final K p0);

	ConcurrentNavigableMap<K, V> tailMap(final K p0);

	ConcurrentNavigableMap<K, V> descendingMap();

	NavigableSet<K> navigableKeySet();

	NavigableSet<K> keySet();

	NavigableSet<K> descendingKeySet();
}
