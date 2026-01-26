package java.util.concurrent.atomic;

public class AtomicStampedReference<V> {
	public AtomicStampedReference(final V initialRef, final int initialStamp) {
		throw new RuntimeException("Stub!");
	}

	public V getReference() {
		throw new RuntimeException("Stub!");
	}

	public int getStamp() {
		throw new RuntimeException("Stub!");
	}

	public V get(final int[] stampHolder) {
		throw new RuntimeException("Stub!");
	}

	public boolean weakCompareAndSet(final V expectedReference, final V newReference, final int expectedStamp,
			final int newStamp) {
		throw new RuntimeException("Stub!");
	}

	public boolean compareAndSet(final V expectedReference, final V newReference, final int expectedStamp,
			final int newStamp) {
		throw new RuntimeException("Stub!");
	}

	public void set(final V newReference, final int newStamp) {
		throw new RuntimeException("Stub!");
	}

	public boolean attemptStamp(final V expectedReference, final int newStamp) {
		throw new RuntimeException("Stub!");
	}
}
