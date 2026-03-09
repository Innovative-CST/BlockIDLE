package java.util.concurrent.atomic;

public class AtomicMarkableReference<V> {
	public AtomicMarkableReference(final V initialRef, final boolean initialMark) {
		throw new RuntimeException("Stub!");
	}

	public V getReference() {
		throw new RuntimeException("Stub!");
	}

	public boolean isMarked() {
		throw new RuntimeException("Stub!");
	}

	public V get(final boolean[] markHolder) {
		throw new RuntimeException("Stub!");
	}

	public boolean weakCompareAndSet(final V expectedReference, final V newReference, final boolean expectedMark,
			final boolean newMark) {
		throw new RuntimeException("Stub!");
	}

	public boolean compareAndSet(final V expectedReference, final V newReference, final boolean expectedMark,
			final boolean newMark) {
		throw new RuntimeException("Stub!");
	}

	public void set(final V newReference, final boolean newMark) {
		throw new RuntimeException("Stub!");
	}

	public boolean attemptMark(final V expectedReference, final boolean newMark) {
		throw new RuntimeException("Stub!");
	}
}
