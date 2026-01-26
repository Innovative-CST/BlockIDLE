package java.util;

public interface SequencedCollection<E> extends Collection<E> {
	SequencedCollection<E> reversed();

	default void addFirst(final E e) {
		throw new RuntimeException("Stub!");
	}

	default void addLast(final E e) {
		throw new RuntimeException("Stub!");
	}

	default E getFirst() {
		throw new RuntimeException("Stub!");
	}

	default E getLast() {
		throw new RuntimeException("Stub!");
	}

	default E removeFirst() {
		throw new RuntimeException("Stub!");
	}

	default E removeLast() {
		throw new RuntimeException("Stub!");
	}
}
