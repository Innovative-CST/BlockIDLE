package java.util.concurrent.atomic;

import java.io.Serializable;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class AtomicReferenceArray<E> implements Serializable {
	public AtomicReferenceArray(final int length) {
		throw new RuntimeException("Stub!");
	}

	public AtomicReferenceArray(final E[] array) {
		throw new RuntimeException("Stub!");
	}

	public final int length() {
		throw new RuntimeException("Stub!");
	}

	public final E get(final int i) {
		throw new RuntimeException("Stub!");
	}

	public final void set(final int i, final E newValue) {
		throw new RuntimeException("Stub!");
	}

	public final void lazySet(final int i, final E newValue) {
		throw new RuntimeException("Stub!");
	}

	public final E getAndSet(final int i, final E newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean compareAndSet(final int i, final E expectedValue, final E newValue) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public final boolean weakCompareAndSet(final int i, final E expectedValue, final E newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetPlain(final int i, final E expectedValue, final E newValue) {
		throw new RuntimeException("Stub!");
	}

	public final E getAndUpdate(final int i, final UnaryOperator<E> updateFunction) {
		throw new RuntimeException("Stub!");
	}

	public final E updateAndGet(final int i, final UnaryOperator<E> updateFunction) {
		throw new RuntimeException("Stub!");
	}

	public final E getAndAccumulate(final int i, final E x, final BinaryOperator<E> accumulatorFunction) {
		throw new RuntimeException("Stub!");
	}

	public final E accumulateAndGet(final int i, final E x, final BinaryOperator<E> accumulatorFunction) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public final E getPlain(final int i) {
		throw new RuntimeException("Stub!");
	}

	public final void setPlain(final int i, final E newValue) {
		throw new RuntimeException("Stub!");
	}

	public final E getOpaque(final int i) {
		throw new RuntimeException("Stub!");
	}

	public final void setOpaque(final int i, final E newValue) {
		throw new RuntimeException("Stub!");
	}

	public final E getAcquire(final int i) {
		throw new RuntimeException("Stub!");
	}

	public final void setRelease(final int i, final E newValue) {
		throw new RuntimeException("Stub!");
	}

	public final E compareAndExchange(final int i, final E expectedValue, final E newValue) {
		throw new RuntimeException("Stub!");
	}

	public final E compareAndExchangeAcquire(final int i, final E expectedValue, final E newValue) {
		throw new RuntimeException("Stub!");
	}

	public final E compareAndExchangeRelease(final int i, final E expectedValue, final E newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetVolatile(final int i, final E expectedValue, final E newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetAcquire(final int i, final E expectedValue, final E newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetRelease(final int i, final E expectedValue, final E newValue) {
		throw new RuntimeException("Stub!");
	}
}
