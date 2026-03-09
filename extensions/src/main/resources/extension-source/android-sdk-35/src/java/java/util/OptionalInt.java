package java.util;

import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public final class OptionalInt {
	OptionalInt() {
		throw new RuntimeException("Stub!");
	}

	public static OptionalInt empty() {
		throw new RuntimeException("Stub!");
	}

	public static OptionalInt of(final int value) {
		throw new RuntimeException("Stub!");
	}

	public int getAsInt() {
		throw new RuntimeException("Stub!");
	}

	public boolean isPresent() {
		throw new RuntimeException("Stub!");
	}

	public boolean isEmpty() {
		throw new RuntimeException("Stub!");
	}

	public void ifPresent(final IntConsumer action) {
		throw new RuntimeException("Stub!");
	}

	public void ifPresentOrElse(final IntConsumer action, final Runnable emptyAction) {
		throw new RuntimeException("Stub!");
	}

	public IntStream stream() {
		throw new RuntimeException("Stub!");
	}

	public int orElse(final int other) {
		throw new RuntimeException("Stub!");
	}

	public int orElseGet(final IntSupplier supplier) {
		throw new RuntimeException("Stub!");
	}

	public int orElseThrow() {
		throw new RuntimeException("Stub!");
	}

	public <X extends Throwable> int orElseThrow(final Supplier<? extends X> exceptionSupplier) throws X, Throwable {
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
