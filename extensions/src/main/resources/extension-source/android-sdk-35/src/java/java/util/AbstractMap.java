package java.util;

import java.io.Serializable;

public abstract class AbstractMap<K, V> implements Map<K, V> {
	protected AbstractMap() {
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
	public boolean containsValue(@RecentlyNullable final Object value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean containsKey(@RecentlyNullable final Object key) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V get(@RecentlyNullable final Object key) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V put(final K key, final V value) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public V remove(@RecentlyNullable final Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void putAll(@RecentlyNonNull final Map<? extends K, ? extends V> m) {
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
	public abstract Set<Entry<K, V>> entrySet();

	@Override
	public boolean equals(@RecentlyNullable final Object o) {
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

	@RecentlyNonNull
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new RuntimeException("Stub!");
	}

	public static class SimpleEntry<K, V> implements Entry<K, V>, Serializable {
		public SimpleEntry(final K key, final V value) {
			throw new RuntimeException("Stub!");
		}

		public SimpleEntry(@RecentlyNonNull final Entry<? extends K, ? extends V> entry) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public K getKey() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public V getValue() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public V setValue(final V value) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public boolean equals(@RecentlyNullable final Object o) {
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
	}

	public static class SimpleImmutableEntry<K, V> implements Entry<K, V>, Serializable {
		public SimpleImmutableEntry(final K key, final V value) {
			throw new RuntimeException("Stub!");
		}

		public SimpleImmutableEntry(@RecentlyNonNull final Entry<? extends K, ? extends V> entry) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public K getKey() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public V getValue() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public V setValue(final V value) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public boolean equals(@RecentlyNullable final Object o) {
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
	}
}
