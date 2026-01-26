package java.util.concurrent.atomic;

import java.io.Serializable;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;

public class AtomicLongArray implements Serializable {
	public AtomicLongArray(final int length) {
		throw new RuntimeException("Stub!");
	}

	public AtomicLongArray(final long[] array) {
		throw new RuntimeException("Stub!");
	}

	public final int length() {
		throw new RuntimeException("Stub!");
	}

	public final long get(final int i) {
		throw new RuntimeException("Stub!");
	}

	public final void set(final int i, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final void lazySet(final int i, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final long getAndSet(final int i, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean compareAndSet(final int i, final long expectedValue, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public final boolean weakCompareAndSet(final int i, final long expectedValue, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetPlain(final int i, final long expectedValue, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final long getAndIncrement(final int i) {
		throw new RuntimeException("Stub!");
	}

	public final long getAndDecrement(final int i) {
		throw new RuntimeException("Stub!");
	}

	public final long getAndAdd(final int i, final long delta) {
		throw new RuntimeException("Stub!");
	}

	public final long incrementAndGet(final int i) {
		throw new RuntimeException("Stub!");
	}

	public final long decrementAndGet(final int i) {
		throw new RuntimeException("Stub!");
	}

	public long addAndGet(final int i, final long delta) {
		throw new RuntimeException("Stub!");
	}

	public final long getAndUpdate(final int i, final LongUnaryOperator updateFunction) {
		throw new RuntimeException("Stub!");
	}

	public final long updateAndGet(final int i, final LongUnaryOperator updateFunction) {
		throw new RuntimeException("Stub!");
	}

	public final long getAndAccumulate(final int i, final long x, final LongBinaryOperator accumulatorFunction) {
		throw new RuntimeException("Stub!");
	}

	public final long accumulateAndGet(final int i, final long x, final LongBinaryOperator accumulatorFunction) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public final long getPlain(final int i) {
		throw new RuntimeException("Stub!");
	}

	public final void setPlain(final int i, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final long getOpaque(final int i) {
		throw new RuntimeException("Stub!");
	}

	public final void setOpaque(final int i, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final long getAcquire(final int i) {
		throw new RuntimeException("Stub!");
	}

	public final void setRelease(final int i, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final long compareAndExchange(final int i, final long expectedValue, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final long compareAndExchangeAcquire(final int i, final long expectedValue, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final long compareAndExchangeRelease(final int i, final long expectedValue, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetVolatile(final int i, final long expectedValue, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetAcquire(final int i, final long expectedValue, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetRelease(final int i, final long expectedValue, final long newValue) {
		throw new RuntimeException("Stub!");
	}
}
