package java.util;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public final class Optional<T> {
	Optional() {
		throw new RuntimeException("Stub!");
	}

	public static <T> Optional<T> empty() {
		throw new RuntimeException("Stub!");
	}

	public static <T> Optional<T> of(final T value) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Optional<T> ofNullable(final T value) {
		throw new RuntimeException("Stub!");
	}

	public T get() {
		throw new RuntimeException("Stub!");
	}

	public boolean isPresent() {
		throw new RuntimeException("Stub!");
	}

	public boolean isEmpty() {
		throw new RuntimeException("Stub!");
	}

	public void ifPresent(final Consumer<? super T> action) {
		throw new RuntimeException("Stub!");
	}

	public void ifPresentOrElse(final Consumer<? super T> action, final Runnable emptyAction) {
		throw new RuntimeException("Stub!");
	}

	public Optional<T> filter(final Predicate<? super T> predicate) {
		throw new RuntimeException("Stub!");
	}

	public <U> Optional<U> map(final Function<? super T, ? extends U> mapper) {
		throw new RuntimeException("Stub!");
	}

	public <U> Optional<U> flatMap(final Function<? super T, ? extends Optional<? extends U>> mapper) {
		throw new RuntimeException("Stub!");
	}

	public Optional<T> or(final Supplier<? extends Optional<? extends T>> supplier) {
		throw new RuntimeException("Stub!");
	}

	public Stream<T> stream() {
		throw new RuntimeException("Stub!");
	}

	public T orElse(final T other) {
		throw new RuntimeException("Stub!");
	}

	public T orElseGet(final Supplier<? extends T> supplier) {
		throw new RuntimeException("Stub!");
	}

	public T orElseThrow() {
		throw new RuntimeException("Stub!");
	}

	public <X extends Throwable> T orElseThrow(final Supplier<? extends X> exceptionSupplier) throws X, Throwable {
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
