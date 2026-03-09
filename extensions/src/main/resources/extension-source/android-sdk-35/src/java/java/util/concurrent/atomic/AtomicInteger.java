package java.util.concurrent.atomic;

import java.io.Serializable;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class AtomicInteger extends Number implements Serializable {
	public AtomicInteger(final int initialValue) {
		throw new RuntimeException("Stub!");
	}

	public AtomicInteger() {
		throw new RuntimeException("Stub!");
	}

	public final int get() {
		throw new RuntimeException("Stub!");
	}

	public final void set(final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final void lazySet(final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final int getAndSet(final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean compareAndSet(final int expectedValue, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public final boolean weakCompareAndSet(final int expectedValue, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetPlain(final int expectedValue, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final int getAndIncrement() {
		throw new RuntimeException("Stub!");
	}

	public final int getAndDecrement() {
		throw new RuntimeException("Stub!");
	}

	public final int getAndAdd(final int delta) {
		throw new RuntimeException("Stub!");
	}

	public final int incrementAndGet() {
		throw new RuntimeException("Stub!");
	}

	public final int decrementAndGet() {
		throw new RuntimeException("Stub!");
	}

	public final int addAndGet(final int delta) {
		throw new RuntimeException("Stub!");
	}

	public final int getAndUpdate(final IntUnaryOperator updateFunction) {
		throw new RuntimeException("Stub!");
	}

	public final int updateAndGet(final IntUnaryOperator updateFunction) {
		throw new RuntimeException("Stub!");
	}

	public final int getAndAccumulate(final int x, final IntBinaryOperator accumulatorFunction) {
		throw new RuntimeException("Stub!");
	}

	public final int accumulateAndGet(final int x, final IntBinaryOperator accumulatorFunction) {
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

	public final int getPlain() {
		throw new RuntimeException("Stub!");
	}

	public final void setPlain(final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final int getOpaque() {
		throw new RuntimeException("Stub!");
	}

	public final void setOpaque(final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final int getAcquire() {
		throw new RuntimeException("Stub!");
	}

	public final void setRelease(final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final int compareAndExchange(final int expectedValue, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final int compareAndExchangeAcquire(final int expectedValue, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final int compareAndExchangeRelease(final int expectedValue, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetVolatile(final int expectedValue, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetAcquire(final int expectedValue, final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetRelease(final int expectedValue, final int newValue) {
		throw new RuntimeException("Stub!");
	}
}
