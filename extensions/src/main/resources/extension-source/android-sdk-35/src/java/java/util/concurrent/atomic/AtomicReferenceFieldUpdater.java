package java.util.concurrent.atomic;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public abstract class AtomicReferenceFieldUpdater<T, V> {
	protected AtomicReferenceFieldUpdater() {
		throw new RuntimeException("Stub!");
	}

	public static <U, W> AtomicReferenceFieldUpdater<U, W> newUpdater(final Class<U> tclass, final Class<W> vclass,
			final String fieldName) {
		throw new RuntimeException("Stub!");
	}

	public abstract boolean compareAndSet(final T p0, final V p1, final V p2);

	public abstract boolean weakCompareAndSet(final T p0, final V p1, final V p2);

	public abstract void set(final T p0, final V p1);

	public abstract void lazySet(final T p0, final V p1);

	public abstract V get(final T p0);

	public V getAndSet(final T obj, final V newValue) {
		throw new RuntimeException("Stub!");
	}

	public final V getAndUpdate(final T obj, final UnaryOperator<V> updateFunction) {
		throw new RuntimeException("Stub!");
	}

	public final V updateAndGet(final T obj, final UnaryOperator<V> updateFunction) {
		throw new RuntimeException("Stub!");
	}

	public final V getAndAccumulate(final T obj, final V x, final BinaryOperator<V> accumulatorFunction) {
		throw new RuntimeException("Stub!");
	}

	public final V accumulateAndGet(final T obj, final V x, final BinaryOperator<V> accumulatorFunction) {
		throw new RuntimeException("Stub!");
	}
}
