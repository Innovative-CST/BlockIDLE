package java.util.concurrent.atomic;

import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public abstract class AtomicIntegerFieldUpdater<T> {
	protected AtomicIntegerFieldUpdater() {
		throw new RuntimeException("Stub!");
	}

	public static <U> AtomicIntegerFieldUpdater<U> newUpdater(final Class<U> tclass, final String fieldName) {
		throw new RuntimeException("Stub!");
	}

	public abstract boolean compareAndSet(final T p0, final int p1, final int p2);

	public abstract boolean weakCompareAndSet(final T p0, final int p1, final int p2);

	public abstract void set(final T p0, final int p1);

	public abstract void lazySet(final T p0, final int p1);

	public abstract int get(final T p0);

	public int getAndSet(final T obj, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public int getAndIncrement(final T obj) {
		throw new RuntimeException("Stub!");
	}

	public int getAndDecrement(final T obj) {
		throw new RuntimeException("Stub!");
	}

	public int getAndAdd(final T obj, final int delta) {
		throw new RuntimeException("Stub!");
	}

	public int incrementAndGet(final T obj) {
		throw new RuntimeException("Stub!");
	}

	public int decrementAndGet(final T obj) {
		throw new RuntimeException("Stub!");
	}

	public int addAndGet(final T obj, final int delta) {
		throw new RuntimeException("Stub!");
	}

	public final int getAndUpdate(final T obj, final IntUnaryOperator updateFunction) {
		throw new RuntimeException("Stub!");
	}

	public final int updateAndGet(final T obj, final IntUnaryOperator updateFunction) {
		throw new RuntimeException("Stub!");
	}

	public final int getAndAccumulate(final T obj, final int x, final IntBinaryOperator accumulatorFunction) {
		throw new RuntimeException("Stub!");
	}

	public final int accumulateAndGet(final T obj, final int x, final IntBinaryOperator accumulatorFunction) {
		throw new RuntimeException("Stub!");
	}
}
