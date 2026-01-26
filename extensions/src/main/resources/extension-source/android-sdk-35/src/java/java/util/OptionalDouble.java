package java.util;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

public final class OptionalDouble {
	OptionalDouble() {
		throw new RuntimeException("Stub!");
	}

	public static OptionalDouble empty() {
		throw new RuntimeException("Stub!");
	}

	public static OptionalDouble of(final double value) {
		throw new RuntimeException("Stub!");
	}

	public double getAsDouble() {
		throw new RuntimeException("Stub!");
	}

	public boolean isPresent() {
		throw new RuntimeException("Stub!");
	}

	public boolean isEmpty() {
		throw new RuntimeException("Stub!");
	}

	public void ifPresent(final DoubleConsumer action) {
		throw new RuntimeException("Stub!");
	}

	public void ifPresentOrElse(final DoubleConsumer action, final Runnable emptyAction) {
		throw new RuntimeException("Stub!");
	}

	public DoubleStream stream() {
		throw new RuntimeException("Stub!");
	}

	public double orElse(final double other) {
		throw new RuntimeException("Stub!");
	}

	public double orElseGet(final DoubleSupplier supplier) {
		throw new RuntimeException("Stub!");
	}

	public double orElseThrow() {
		throw new RuntimeException("Stub!");
	}

	public <X extends Throwable> double orElseThrow(final Supplier<? extends X> exceptionSupplier) throws X, Throwable {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
