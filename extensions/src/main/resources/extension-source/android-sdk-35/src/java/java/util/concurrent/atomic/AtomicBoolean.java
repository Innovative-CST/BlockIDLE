package java.util.concurrent.atomic;

import java.io.Serializable;

public class AtomicBoolean implements Serializable {
	public AtomicBoolean(final boolean initialValue) {
		throw new RuntimeException("Stub!");
	}

	public AtomicBoolean() {
		throw new RuntimeException("Stub!");
	}

	public final boolean get() {
		throw new RuntimeException("Stub!");
	}

	public final boolean compareAndSet(final boolean expectedValue, final boolean newValue) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public boolean weakCompareAndSet(final boolean expectedValue, final boolean newValue) {
		throw new RuntimeException("Stub!");
	}

	public boolean weakCompareAndSetPlain(final boolean expectedValue, final boolean newValue) {
		throw new RuntimeException("Stub!");
	}

	public final void set(final boolean newValue) {
		throw new RuntimeException("Stub!");
	}

	public final void lazySet(final boolean newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean getAndSet(final boolean newValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public final boolean getPlain() {
		throw new RuntimeException("Stub!");
	}

	public final void setPlain(final boolean newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean getOpaque() {
		throw new RuntimeException("Stub!");
	}

	public final void setOpaque(final boolean newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean getAcquire() {
		throw new RuntimeException("Stub!");
	}

	public final void setRelease(final boolean newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean compareAndExchange(final boolean expectedValue, final boolean newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean compareAndExchangeAcquire(final boolean expectedValue, final boolean newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean compareAndExchangeRelease(final boolean expectedValue, final boolean newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetVolatile(final boolean expectedValue, final boolean newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetAcquire(final boolean expectedValue, final boolean newValue) {
		throw new RuntimeException("Stub!");
	}

	public final boolean weakCompareAndSetRelease(final boolean expectedValue, final boolean newValue) {
		throw new RuntimeException("Stub!");
	}
}
