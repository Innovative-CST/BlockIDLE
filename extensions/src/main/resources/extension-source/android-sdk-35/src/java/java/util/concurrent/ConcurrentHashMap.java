package java.util.concurrent;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;

public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
	public ConcurrentHashMap() {
		throw new RuntimeException("Stub!");
	}

	public ConcurrentHashMap(final int initialCapacity) {
		throw new RuntimeException("Stub!");
	}

	public ConcurrentHashMap(@RecentlyNonNull final Map<? extends K, ? extends V> m) {
		throw new RuntimeException("Stub!");
	}

	public ConcurrentHashMap(final int initialCapacity, final float loadFactor) {
		throw new RuntimeException("Stub!");
	}

	public ConcurrentHashMap(final int initialCapacity, final float loadFactor, final int concurrencyLevel) {
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
	public V get(@RecentlyNonNull final Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean containsKey(@RecentlyNonNull final Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean containsValue(@RecentlyNonNull final Object value) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V put(@RecentlyNonNull final K key, @RecentlyNonNull final V value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void putAll(@RecentlyNonNull final Map<? extends K, ? extends V> m) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V remove(@RecentlyNonNull final Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void clear() {
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
	public Set<Map.Entry<K, V>> entrySet() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object o) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V putIfAbsent(@RecentlyNonNull final K key, @RecentlyNonNull final V value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean remove(@RecentlyNonNull final Object key, @RecentlyNullable final Object value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean replace(@RecentlyNonNull final K key, @RecentlyNonNull final V oldValue,
			@RecentlyNonNull final V newValue) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V replace(@RecentlyNonNull final K key, @RecentlyNonNull final V value) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V getOrDefault(@RecentlyNonNull final Object key, @RecentlyNullable final V defaultValue) {
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

	@RecentlyNullable
	@Override
	public V computeIfAbsent(@RecentlyNonNull final K key,
			@RecentlyNonNull final Function<? super K, ? extends V> mappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V computeIfPresent(@RecentlyNonNull final K key,
			@RecentlyNonNull final BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V compute(@RecentlyNonNull final K key,
			@RecentlyNonNull final BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V merge(@RecentlyNonNull final K key, @RecentlyNonNull final V value,
			@RecentlyNonNull final BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	public boolean contains(@RecentlyNonNull final Object value) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Enumeration<K> keys() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Enumeration<V> elements() {
		throw new RuntimeException("Stub!");
	}

	public long mappingCount() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <K> KeySetView<K, Boolean> newKeySet() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <K> KeySetView<K, Boolean> newKeySet(final int initialCapacity) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public KeySetView<K, V> keySet(@RecentlyNonNull final V mappedValue) {
		throw new RuntimeException("Stub!");
	}

	public void forEach(final long parallelismThreshold,
			@RecentlyNonNull final BiConsumer<? super K, ? super V> action) {
		throw new RuntimeException("Stub!");
	}

	public <U> void forEach(final long parallelismThreshold,
			@RecentlyNonNull final BiFunction<? super K, ? super V, ? extends U> transformer,
			@RecentlyNonNull final Consumer<? super U> action) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public <U> U search(final long parallelismThreshold,
			@RecentlyNonNull final BiFunction<? super K, ? super V, ? extends U> searchFunction) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public <U> U reduce(final long parallelismThreshold,
			@RecentlyNonNull final BiFunction<? super K, ? super V, ? extends U> transformer,
			@RecentlyNonNull final BiFunction<? super U, ? super U, ? extends U> reducer) {
		throw new RuntimeException("Stub!");
	}

	public double reduceToDouble(final long parallelismThreshold,
			@RecentlyNonNull final ToDoubleBiFunction<? super K, ? super V> transformer, final double basis,
			@RecentlyNonNull final DoubleBinaryOperator reducer) {
		throw new RuntimeException("Stub!");
	}

	public long reduceToLong(final long parallelismThreshold,
			@RecentlyNonNull final ToLongBiFunction<? super K, ? super V> transformer, final long basis,
			@RecentlyNonNull final LongBinaryOperator reducer) {
		throw new RuntimeException("Stub!");
	}

	public int reduceToInt(final long parallelismThreshold,
			@RecentlyNonNull final ToIntBiFunction<? super K, ? super V> transformer, final int basis,
			@RecentlyNonNull final IntBinaryOperator reducer) {
		throw new RuntimeException("Stub!");
	}

	public void forEachKey(final long parallelismThreshold, @RecentlyNonNull final Consumer<? super K> action) {
		throw new RuntimeException("Stub!");
	}

	public <U> void forEachKey(final long parallelismThreshold,
			@RecentlyNonNull final Function<? super K, ? extends U> transformer,
			@RecentlyNonNull final Consumer<? super U> action) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public <U> U searchKeys(final long parallelismThreshold,
			@RecentlyNonNull final Function<? super K, ? extends U> searchFunction) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public K reduceKeys(final long parallelismThreshold,
			@RecentlyNonNull final BiFunction<? super K, ? super K, ? extends K> reducer) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public <U> U reduceKeys(final long parallelismThreshold,
			@RecentlyNonNull final Function<? super K, ? extends U> transformer,
			@RecentlyNonNull final BiFunction<? super U, ? super U, ? extends U> reducer) {
		throw new RuntimeException("Stub!");
	}

	public double reduceKeysToDouble(final long parallelismThreshold,
			@RecentlyNonNull final ToDoubleFunction<? super K> transformer, final double basis,
			@RecentlyNonNull final DoubleBinaryOperator reducer) {
		throw new RuntimeException("Stub!");
	}

	public long reduceKeysToLong(final long parallelismThreshold,
			@RecentlyNonNull final ToLongFunction<? super K> transformer, final long basis,
			@RecentlyNonNull final LongBinaryOperator reducer) {
		throw new RuntimeException("Stub!");
	}

	public int reduceKeysToInt(final long parallelismThreshold,
			@RecentlyNonNull final ToIntFunction<? super K> transformer, final int basis,
			@RecentlyNonNull final IntBinaryOperator reducer) {
		throw new RuntimeException("Stub!");
	}

	public void forEachValue(final long parallelismThreshold, @RecentlyNonNull final Consumer<? super V> action) {
		throw new RuntimeException("Stub!");
	}

	public <U> void forEachValue(final long parallelismThreshold,
			@RecentlyNonNull final Function<? super V, ? extends U> transformer,
			@RecentlyNonNull final Consumer<? super U> action) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public <U> U searchValues(final long parallelismThreshold,
			@RecentlyNonNull final Function<? super V, ? extends U> searchFunction) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public V reduceValues(final long parallelismThreshold,
			@RecentlyNonNull final BiFunction<? super V, ? super V, ? extends V> reducer) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public <U> U reduceValues(final long parallelismThreshold,
			@RecentlyNonNull final Function<? super V, ? extends U> transformer,
			@RecentlyNonNull final BiFunction<? super U, ? super U, ? extends U> reducer) {
		throw new RuntimeException("Stub!");
	}

	public double reduceValuesToDouble(final long parallelismThreshold,
			@RecentlyNonNull final ToDoubleFunction<? super V> transformer, final double basis,
			@RecentlyNonNull final DoubleBinaryOperator reducer) {
		throw new RuntimeException("Stub!");
	}

	public long reduceValuesToLong(final long parallelismThreshold,
			@RecentlyNonNull final ToLongFunction<? super V> transformer, final long basis,
			@RecentlyNonNull final LongBinaryOperator reducer) {
		throw new RuntimeException("Stub!");
	}

	public int reduceValuesToInt(final long parallelismThreshold,
			@RecentlyNonNull final ToIntFunction<? super V> transformer, final int basis,
			@RecentlyNonNull final IntBinaryOperator reducer) {
		throw new RuntimeException("Stub!");
	}

	public void forEachEntry(final long parallelismThreshold,
			@RecentlyNonNull final Consumer<? super Map.Entry<K, V>> action) {
		throw new RuntimeException("Stub!");
	}

	public <U> void forEachEntry(final long parallelismThreshold,
			@RecentlyNonNull final Function<Map.Entry<K, V>, ? extends U> transformer,
			@RecentlyNonNull final Consumer<? super U> action) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public <U> U searchEntries(final long parallelismThreshold,
			@RecentlyNonNull final Function<Map.Entry<K, V>, ? extends U> searchFunction) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public Map.Entry<K, V> reduceEntries(final long parallelismThreshold,
			@RecentlyNonNull final BiFunction<Map.Entry<K, V>, Map.Entry<K, V>, ? extends Map.Entry<K, V>> reducer) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public <U> U reduceEntries(final long parallelismThreshold,
			@RecentlyNonNull final Function<Map.Entry<K, V>, ? extends U> transformer,
			@RecentlyNonNull final BiFunction<? super U, ? super U, ? extends U> reducer) {
		throw new RuntimeException("Stub!");
	}

	public double reduceEntriesToDouble(final long parallelismThreshold,
			@RecentlyNonNull final ToDoubleFunction<Map.Entry<K, V>> transformer, final double basis,
			@RecentlyNonNull final DoubleBinaryOperator reducer) {
		throw new RuntimeException("Stub!");
	}

	public long reduceEntriesToLong(final long parallelismThreshold,
			@RecentlyNonNull final ToLongFunction<Map.Entry<K, V>> transformer, final long basis,
			@RecentlyNonNull final LongBinaryOperator reducer) {
		throw new RuntimeException("Stub!");
	}

	public int reduceEntriesToInt(final long parallelismThreshold,
			@RecentlyNonNull final ToIntFunction<Map.Entry<K, V>> transformer, final int basis,
			@RecentlyNonNull final IntBinaryOperator reducer) {
		throw new RuntimeException("Stub!");
	}

	public static class KeySetView<K, V> implements Collection<K>, Serializable, Set<K> {
		KeySetView() {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNullable
		public V getMappedValue() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public boolean contains(@RecentlyNonNull final Object o) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public boolean remove(@RecentlyNonNull final Object o) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		@Override
		public Iterator<K> iterator() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public boolean add(@RecentlyNonNull final K e) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public boolean addAll(@RecentlyNonNull final Collection<? extends K> c) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public int hashCode() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public boolean equals(@RecentlyNullable final Object o) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		@Override
		public Spliterator<K> spliterator() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public void forEach(@RecentlyNonNull final Consumer<? super K> action) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public boolean removeAll(@RecentlyNonNull final Collection<?> c) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public final int size() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public final boolean containsAll(@RecentlyNonNull final Collection<?> c) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public final void clear() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public final boolean isEmpty() {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		@Override
		public final Object[] toArray() {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		@Override
		public final <T> T[] toArray(@RecentlyNonNull final T[] a) {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		@Override
		public final String toString() {
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		public ConcurrentHashMap<K, V> getMap() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public final boolean retainAll(@RecentlyNonNull final Collection<?> c) {
			throw new RuntimeException("Stub!");
		}
	}
}
