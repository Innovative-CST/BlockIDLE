package java.util.concurrent.atomic;

import java.io.Serializable;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;

public class AtomicLong extends Number implements Serializable {
	public AtomicLong(final long initialValue) {
		throw new RuntimeException("Stub!");
	}

	public AtomicLong() {
		throw new RuntimeException("Stub!");
	}

	public final long get() {
		throw new RuntimeException("Stub!");
	}

	public final void set(final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final void lazySet(final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final long getAndSet(final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean compareAndSet(final long expectedValue, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public final boolean weakCompareAndSet(final long expectedValue, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetPlain(final long expectedValue, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final long getAndIncrement() {
		throw new RuntimeException("Stub!");
	}

	public final long getAndDecrement() {
		throw new RuntimeException("Stub!");
	}

	public final long getAndAdd(final long delta) {
		throw new RuntimeException("Stub!");
	}

	public final long incrementAndGet() {
		throw new RuntimeException("Stub!");
	}

	public final long decrementAndGet() {
		throw new RuntimeException("Stub!");
	}

	public final long addAndGet(final long delta) {
		throw new RuntimeException("Stub!");
	}

	public final long getAndUpdate(final LongUnaryOperator updateFunction) {
		throw new RuntimeException("Stub!");
	}

	public final long updateAndGet(final LongUnaryOperator updateFunction) {
		throw new RuntimeException("Stub!");
	}

	public final long getAndAccumulate(final long x, final LongBinaryOperator accumulatorFunction) {
		throw new RuntimeException("Stub!");
	}

	public final long accumulateAndGet(final long x, final LongBinaryOperator accumulatorFunction) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int intValue() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long longValue() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public float floatValue() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public double doubleValue() {
		throw new RuntimeException("Stub!");
	}

	public final long getPlain() {
		throw new RuntimeException("Stub!");
	}

	public final void setPlain(final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final long getOpaque() {
		throw new RuntimeException("Stub!");
	}

	public final void setOpaque(final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final long getAcquire() {
		throw new RuntimeException("Stub!");
	}

	public final void setRelease(final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final long compareAndExchange(final long expectedValue, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final long compareAndExchangeAcquire(final long expectedValue, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final long compareAndExchangeRelease(final long expectedValue, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetVolatile(final long expectedValue, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetAcquire(final long expectedValue, final long newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetRelease(final long expectedValue, final long newValue) {
		throw new RuntimeException("Stub!");
	}
}
