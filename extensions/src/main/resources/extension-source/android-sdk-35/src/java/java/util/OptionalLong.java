package java.util;

import java.util.function.LongConsumer;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.stream.LongStream;

public final class OptionalLong {
	OptionalLong() {
		throw new RuntimeException("Stub!");
	}

	public static OptionalLong empty() {
		throw new RuntimeException("Stub!");
	}

	public static OptionalLong of(final long value) {
		throw new RuntimeException("Stub!");
	}

	public long getAsLong() {
		throw new RuntimeException("Stub!");
	}

	public boolean isPresent() {
		throw new RuntimeException("Stub!");
	}

	public boolean isEmpty() {
		throw new RuntimeException("Stub!");
	}

	public void ifPresent(final LongConsumer action) {
		throw new RuntimeException("Stub!");
	}

	public void ifPresentOrElse(final LongConsumer action, final Runnable emptyAction) {
		throw new RuntimeException("Stub!");
	}

	public LongStream stream() {
		throw new RuntimeException("Stub!");
	}

	public long orElse(final long other) {
		throw new RuntimeException("Stub!");
	}

	public long orElseGet(final LongSupplier supplier) {
		throw new RuntimeException("Stub!");
	}

	public long orElseThrow() {
		throw new RuntimeException("Stub!");
	}

	public <X extends Throwable> long orElseThrow(final Supplier<? extends X> exceptionSupplier) throws X, Throwable {
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
