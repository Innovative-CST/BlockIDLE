package java.util.concurrent;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class CompletableFuture<T> implements Future<T>, CompletionStage<T> {
	public CompletableFuture() {
		throw new RuntimeException("Stub!");
	}

	public static <U> CompletableFuture<U> supplyAsync(final Supplier<U> supplier) {
		throw new RuntimeException("Stub!");
	}

	public static <U> CompletableFuture<U> supplyAsync(final Supplier<U> supplier, final Executor executor) {
		throw new RuntimeException("Stub!");
	}

	public static CompletableFuture<Void> runAsync(final Runnable runnable) {
		throw new RuntimeException("Stub!");
	}

	public static CompletableFuture<Void> runAsync(final Runnable runnable, final Executor executor) {
		throw new RuntimeException("Stub!");
	}

	public static <U> CompletableFuture<U> completedFuture(final U value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isDone() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public T get() throws ExecutionException, InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public T get(final long timeout, final TimeUnit unit)
			throws ExecutionException, InterruptedException, TimeoutException {
		throw new RuntimeException("Stub!");
	}

	public T join() {
		throw new RuntimeException("Stub!");
	}

	public T getNow(final T valueIfAbsent) {
		throw new RuntimeException("Stub!");
	}

	public boolean complete(final T value) {
		throw new RuntimeException("Stub!");
	}

	public boolean completeExceptionally(final Throwable ex) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <U> CompletableFuture<U> thenApply(final Function<? super T, ? extends U> fn) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <U> CompletableFuture<U> thenApplyAsync(final Function<? super T, ? extends U> fn) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <U> CompletableFuture<U> thenApplyAsync(final Function<? super T, ? extends U> fn, final Executor executor) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<Void> thenAccept(final Consumer<? super T> action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<Void> thenAcceptAsync(final Consumer<? super T> action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<Void> thenAcceptAsync(final Consumer<? super T> action, final Executor executor) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<Void> thenRun(final Runnable action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<Void> thenRunAsync(final Runnable action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<Void> thenRunAsync(final Runnable action, final Executor executor) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <U, V> CompletableFuture<V> thenCombine(final CompletionStage<? extends U> other,
			final BiFunction<? super T, ? super U, ? extends V> fn) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <U, V> CompletableFuture<V> thenCombineAsync(final CompletionStage<? extends U> other,
			final BiFunction<? super T, ? super U, ? extends V> fn) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <U, V> CompletableFuture<V> thenCombineAsync(final CompletionStage<? extends U> other,
			final BiFunction<? super T, ? super U, ? extends V> fn, final Executor executor) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <U> CompletableFuture<Void> thenAcceptBoth(final CompletionStage<? extends U> other,
			final BiConsumer<? super T, ? super U> action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <U> CompletableFuture<Void> thenAcceptBothAsync(final CompletionStage<? extends U> other,
			final BiConsumer<? super T, ? super U> action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <U> CompletableFuture<Void> thenAcceptBothAsync(final CompletionStage<? extends U> other,
			final BiConsumer<? super T, ? super U> action, final Executor executor) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<Void> runAfterBoth(final CompletionStage<?> other, final Runnable action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<Void> runAfterBothAsync(final CompletionStage<?> other, final Runnable action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<Void> runAfterBothAsync(final CompletionStage<?> other, final Runnable action,
			final Executor executor) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <U> CompletableFuture<U> applyToEither(final CompletionStage<? extends T> other,
			final Function<? super T, U> fn) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <U> CompletableFuture<U> applyToEitherAsync(final CompletionStage<? extends T> other,
			final Function<? super T, U> fn) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <U> CompletableFuture<U> applyToEitherAsync(final CompletionStage<? extends T> other,
			final Function<? super T, U> fn, final Executor executor) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<Void> acceptEither(final CompletionStage<? extends T> other,
			final Consumer<? super T> action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<Void> acceptEitherAsync(final CompletionStage<? extends T> other,
			final Consumer<? super T> action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<Void> acceptEitherAsync(final CompletionStage<? extends T> other,
			final Consumer<? super T> action, final Executor executor) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<Void> runAfterEither(final CompletionStage<?> other, final Runnable action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<Void> runAfterEitherAsync(final CompletionStage<?> other, final Runnable action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<Void> runAfterEitherAsync(final CompletionStage<?> other, final Runnable action,
			final Executor executor) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <U> CompletableFuture<U> thenCompose(final Function<? super T, ? extends CompletionStage<U>> fn) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <U> CompletableFuture<U> thenComposeAsync(final Function<? super T, ? extends CompletionStage<U>> fn) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <U> CompletableFuture<U> thenComposeAsync(final Function<? super T, ? extends CompletionStage<U>> fn,
			final Executor executor) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<T> whenComplete(final BiConsumer<? super T, ? super Throwable> action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<T> whenCompleteAsync(final BiConsumer<? super T, ? super Throwable> action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<T> whenCompleteAsync(final BiConsumer<? super T, ? super Throwable> action,
			final Executor executor) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <U> CompletableFuture<U> handle(final BiFunction<? super T, Throwable, ? extends U> fn) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <U> CompletableFuture<U> handleAsync(final BiFunction<? super T, Throwable, ? extends U> fn) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <U> CompletableFuture<U> handleAsync(final BiFunction<? super T, Throwable, ? extends U> fn,
			final Executor executor) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<T> toCompletableFuture() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<T> exceptionally(final Function<Throwable, ? extends T> fn) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<T> exceptionallyAsync(final Function<Throwable, ? extends T> fn) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<T> exceptionallyAsync(final Function<Throwable, ? extends T> fn, final Executor executor) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<T> exceptionallyCompose(final Function<Throwable, ? extends CompletionStage<T>> fn) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<T> exceptionallyComposeAsync(final Function<Throwable, ? extends CompletionStage<T>> fn) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public CompletableFuture<T> exceptionallyComposeAsync(final Function<Throwable, ? extends CompletionStage<T>> fn,
			final Executor executor) {
		throw new RuntimeException("Stub!");
	}

	public static CompletableFuture<Void> allOf(final CompletableFuture<?>... cfs) {
		throw new RuntimeException("Stub!");
	}

	public static CompletableFuture<Object> anyOf(final CompletableFuture<?>... cfs) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean cancel(final boolean mayInterruptIfRunning) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isCancelled() {
		throw new RuntimeException("Stub!");
	}

	public boolean isCompletedExceptionally() {
		throw new RuntimeException("Stub!");
	}

	public void obtrudeValue(final T value) {
		throw new RuntimeException("Stub!");
	}

	public void obtrudeException(final Throwable ex) {
		throw new RuntimeException("Stub!");
	}

	public int getNumberOfDependents() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public <U> CompletableFuture<U> newIncompleteFuture() {
		throw new RuntimeException("Stub!");
	}

	public Executor defaultExecutor() {
		throw new RuntimeException("Stub!");
	}

	public CompletableFuture<T> copy() {
		throw new RuntimeException("Stub!");
	}

	public CompletionStage<T> minimalCompletionStage() {
		throw new RuntimeException("Stub!");
	}

	public CompletableFuture<T> completeAsync(final Supplier<? extends T> supplier, final Executor executor) {
		throw new RuntimeException("Stub!");
	}

	public CompletableFuture<T> completeAsync(final Supplier<? extends T> supplier) {
		throw new RuntimeException("Stub!");
	}

	public CompletableFuture<T> orTimeout(final long timeout, final TimeUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public CompletableFuture<T> completeOnTimeout(final T value, final long timeout, final TimeUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public static Executor delayedExecutor(final long delay, final TimeUnit unit, final Executor executor) {
		throw new RuntimeException("Stub!");
	}

	public static Executor delayedExecutor(final long delay, final TimeUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public static <U> CompletionStage<U> completedStage(final U value) {
		throw new RuntimeException("Stub!");
	}

	public static <U> CompletableFuture<U> failedFuture(final Throwable ex) {
		throw new RuntimeException("Stub!");
	}

	public static <U> CompletionStage<U> failedStage(final Throwable ex) {
		throw new RuntimeException("Stub!");
	}

	public interface AsynchronousCompletionTask {
	}
}
