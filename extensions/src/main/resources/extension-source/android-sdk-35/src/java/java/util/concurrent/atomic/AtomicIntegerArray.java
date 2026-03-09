package java.util.concurrent.atomic;

import java.io.Serializable;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class AtomicIntegerArray implements Serializable {
	public AtomicIntegerArray(final int length) {
		throw new RuntimeException("Stub!");
	}

	public AtomicIntegerArray(final int[] array) {
		throw new RuntimeException("Stub!");
	}

	public final int length() {
		throw new RuntimeException("Stub!");
	}

	public final int get(final int i) {
		throw new RuntimeException("Stub!");
	}

	public final void set(final int i, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final void lazySet(final int i, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final int getAndSet(final int i, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean compareAndSet(final int i, final int expectedValue, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public final boolean weakCompareAndSet(final int i, final int expectedValue, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetPlain(final int i, final int expectedValue, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final int getAndIncrement(final int i) {
		throw new RuntimeException("Stub!");
	}

	public final int getAndDecrement(final int i) {
		throw new RuntimeException("Stub!");
	}

	public final int getAndAdd(final int i, final int delta) {
		throw new RuntimeException("Stub!");
	}

	public final int incrementAndGet(final int i) {
		throw new RuntimeException("Stub!");
	}

	public final int decrementAndGet(final int i) {
		throw new RuntimeException("Stub!");
	}

	public final int addAndGet(final int i, final int delta) {
		throw new RuntimeException("Stub!");
	}

	public final int getAndUpdate(final int i, final IntUnaryOperator updateFunction) {
		throw new RuntimeException("Stub!");
	}

	public final int updateAndGet(final int i, final IntUnaryOperator updateFunction) {
		throw new RuntimeException("Stub!");
	}

	public final int getAndAccumulate(final int i, final int x, final IntBinaryOperator accumulatorFunction) {
		throw new RuntimeException("Stub!");
	}

	public final int accumulateAndGet(final int i, final int x, final IntBinaryOperator accumulatorFunction) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public final int getPlain(final int i) {
		throw new RuntimeException("Stub!");
	}

	public final void setPlain(final int i, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final int getOpaque(final int i) {
		throw new RuntimeException("Stub!");
	}

	public final void setOpaque(final int i, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final int getAcquire(final int i) {
		throw new RuntimeException("Stub!");
	}

	public final void setRelease(final int i, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final int compareAndExchange(final int i, final int expectedValue, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final int compareAndExchangeAcquire(final int i, final int expectedValue, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final int compareAndExchangeRelease(final int i, final int expectedValue, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetVolatile(final int i, final int expectedValue, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetAcquire(final int i, final int expectedValue, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetRelease(final int i, final int expectedValue, final int newValue) {
		throw new RuntimeException("Stub!");
	}
}
