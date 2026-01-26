package java.util;

public interface SequencedMap<K, V> extends Map<K, V> {
	SequencedMap<K, V> reversed();

	default Entry<K, V> firstEntry() {
		throw new RuntimeException("Stub!");
	}

	default Entry<K, V> lastEntry() {
		throw new RuntimeException("Stub!");
	}

	default Entry<K, V> pollFirstEntry() {
		throw new RuntimeException("Stub!");
	}

	default Entry<K, V> pollLastEntry() {
		throw new RuntimeException("Stub!");
	}

	default V putFirst(final K k, final V v) {
		throw new RuntimeException("Stub!");
	}

	default V putLast(final K k, final V v) {
		throw new RuntimeException("Stub!");
	}

	default SequencedSet<K> sequencedKeySet() {
		throw new RuntimeException("Stub!");
	}

	default SequencedCollection<V> sequencedValues() {
		throw new RuntimeException("Stub!");
	}

	default SequencedSet<Entry<K, V>> sequencedEntrySet() {
		throw new RuntimeException("Stub!");
	}
}
