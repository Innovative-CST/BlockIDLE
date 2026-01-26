package java.util.concurrent.atomic;

import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;

public abstract class AtomicLongFieldUpdater<T> {
	protected AtomicLongFieldUpdater() {
		throw new RuntimeException("Stub!");
	}

	public static <U> AtomicLongFieldUpdater<U> newUpdater(final Class<U> tclass, final String fieldName) {
		throw new RuntimeException("Stub!");
	}

	public abstract boolean compareAndSet(final T p0, final long p1, final long p2);

	public abstract boolean weakCompareAndSet(final T p0, final long p1, final long p2);

	public abstract void set(final T p0, final long p1);

	public abstract void lazySet(final T p0, final long p1);

	public abstract long get(final T p0);

	public long getAndSet(final T obj, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public long getAndIncrement(final T obj) {
		throw new RuntimeException("Stub!");
	}

	public long getAndDecrement(final T obj) {
		throw new RuntimeException("Stub!");
	}

	public long getAndAdd(final T obj, final long delta) {
		throw new RuntimeException("Stub!");
	}

	public long incrementAndGet(final T obj) {
		throw new RuntimeException("Stub!");
	}

	public long decrementAndGet(final T obj) {
		throw new RuntimeException("Stub!");
	}

	public long addAndGet(final T obj, final long delta) {
		throw new RuntimeException("Stub!");
	}

	public final long getAndUpdate(final T obj, final LongUnaryOperator updateFunction) {
		throw new RuntimeException("Stub!");
	}

	public final long updateAndGet(final T obj, final LongUnaryOperator updateFunction) {
		throw new RuntimeException("Stub!");
	}

	public final long getAndAccumulate(final T obj, final long x, final LongBinaryOperator accumulatorFunction) {
		throw new RuntimeException("Stub!");
	}

	public final long accumulateAndGet(final T obj, final long x, final LongBinaryOperator accumulatorFunction) {
		throw new RuntimeException("Stub!");
	}
}
