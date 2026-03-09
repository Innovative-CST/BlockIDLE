package java.util.concurrent.atomic;

import java.io.Serializable;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class AtomicReference<V> implements Serializable {
	public AtomicReference(final V initialValue) {
		throw new RuntimeException("Stub!");
	}

	public AtomicReference() {
		throw new RuntimeException("Stub!");
	}

	public final V get() {
		throw new RuntimeException("Stub!");
	}

	public final void set(final V newValue) {
		throw new RuntimeException("Stub!");
	}

	public final void lazySet(final V newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean compareAndSet(final V expectedValue, final V newValue) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public final boolean weakCompareAndSet(final V expectedValue, final V newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetPlain(final V expectedValue, final V newValue) {
		throw new RuntimeException("Stub!");
	}

	public final V getAndSet(final V newValue) {
		throw new RuntimeException("Stub!");
	}

	public final V getAndUpdate(final UnaryOperator<V> updateFunction) {
		throw new RuntimeException("Stub!");
	}

	public final V updateAndGet(final UnaryOperator<V> updateFunction) {
		throw new RuntimeException("Stub!");
	}

	public final V getAndAccumulate(final V x, final BinaryOperator<V> accumulatorFunction) {
		throw new RuntimeException("Stub!");
	}

	public final V accumulateAndGet(final V x, final BinaryOperator<V> accumulatorFunction) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public final V getPlain() {
		throw new RuntimeException("Stub!");
	}

	public final void setPlain(final V newValue) {
		throw new RuntimeException("Stub!");
	}

	public final V getOpaque() {
		throw new RuntimeException("Stub!");
	}

	public final void setOpaque(final V newValue) {
		throw new RuntimeException("Stub!");
	}

	public final V getAcquire() {
		throw new RuntimeException("Stub!");
	}

	public final void setRelease(final V newValue) {
		throw new RuntimeException("Stub!");
	}

	public final V compareAndExchange(final V expectedValue, final V newValue) {
		throw new RuntimeException("Stub!");
	}

	public final V compareAndExchangeAcquire(final V expectedValue, final V newValue) {
		throw new RuntimeException("Stub!");
	}

	public final V compareAndExchangeRelease(final V expectedValue, final V newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetVolatile(final V expectedValue, final V newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetAcquire(final V expectedValue, final V newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetRelease(final V expectedValue, final V newValue) {
		throw new RuntimeException("Stub!");
	}
}
