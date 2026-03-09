package java.util;

public abstract class Dictionary<K, V> {
	public Dictionary() {
		throw new RuntimeException("Stub!");
	}

	public abstract int size();

	public abstract boolean isEmpty();

	public abstract Enumeration<K> keys();

	public abstract Enumeration<V> elements();

	public abstract V get(final Object p0);

	public abstract V put(final K p0, final V p1);

	public abstract V remove(final Object p0);
}
