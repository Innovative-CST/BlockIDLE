package java.util.concurrent;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public interface CompletionStage<T> {
	<U> CompletionStage<U> thenApply(final Function<? super T, ? extends U> p0);

	<U> CompletionStage<U> thenApplyAsync(final Function<? super T, ? extends U> p0);

	<U> CompletionStage<U> thenApplyAsync(final Function<? super T, ? extends U> p0, final Executor p1);

	CompletionStage<Void> thenAccept(final Consumer<? super T> p0);

	CompletionStage<Void> thenAcceptAsync(final Consumer<? super T> p0);

	CompletionStage<Void> thenAcceptAsync(final Consumer<? super T> p0, final Executor p1);

	CompletionStage<Void> thenRun(final Runnable p0);

	CompletionStage<Void> thenRunAsync(final Runnable p0);

	CompletionStage<Void> thenRunAsync(final Runnable p0, final Executor p1);

	<U, V> CompletionStage<V> thenCombine(final CompletionStage<? extends U> p0,
			final BiFunction<? super T, ? super U, ? extends V> p1);

	<U, V> CompletionStage<V> thenCombineAsync(final CompletionStage<? extends U> p0,
			final BiFunction<? super T, ? super U, ? extends V> p1);

	<U, V> CompletionStage<V> thenCombineAsync(final CompletionStage<? extends U> p0,
			final BiFunction<? super T, ? super U, ? extends V> p1, final Executor p2);

	<U> CompletionStage<Void> thenAcceptBoth(final CompletionStage<? extends U> p0,
			final BiConsumer<? super T, ? super U> p1);

	<U> CompletionStage<Void> thenAcceptBothAsync(final CompletionStage<? extends U> p0,
			final BiConsumer<? super T, ? super U> p1);

	<U> CompletionStage<Void> thenAcceptBothAsync(final CompletionStage<? extends U> p0,
			final BiConsumer<? super T, ? super U> p1, final Executor p2);

	CompletionStage<Void> runAfterBoth(final CompletionStage<?> p0, final Runnable p1);

	CompletionStage<Void> runAfterBothAsync(final CompletionStage<?> p0, final Runnable p1);

	CompletionStage<Void> runAfterBothAsync(final CompletionStage<?> p0, final Runnable p1, final Executor p2);

	<U> CompletionStage<U> applyToEither(final CompletionStage<? extends T> p0, final Function<? super T, U> p1);

	<U> CompletionStage<U> applyToEitherAsync(final CompletionStage<? extends T> p0, final Function<? super T, U> p1);

	<U> CompletionStage<U> applyToEitherAsync(final CompletionStage<? extends T> p0, final Function<? super T, U> p1,
			final Executor p2);

	CompletionStage<Void> acceptEither(final CompletionStage<? extends T> p0, final Consumer<? super T> p1);

	CompletionStage<Void> acceptEitherAsync(final CompletionStage<? extends T> p0, final Consumer<? super T> p1);

	CompletionStage<Void> acceptEitherAsync(final CompletionStage<? extends T> p0, final Consumer<? super T> p1,
			final Executor p2);

	CompletionStage<Void> runAfterEither(final CompletionStage<?> p0, final Runnable p1);

	CompletionStage<Void> runAfterEitherAsync(final CompletionStage<?> p0, final Runnable p1);

	CompletionStage<Void> runAfterEitherAsync(final CompletionStage<?> p0, final Runnable p1, final Executor p2);

	<U> CompletionStage<U> thenCompose(final Function<? super T, ? extends CompletionStage<U>> p0);

	<U> CompletionStage<U> thenComposeAsync(final Function<? super T, ? extends CompletionStage<U>> p0);

	<U> CompletionStage<U> thenComposeAsync(final Function<? super T, ? extends CompletionStage<U>> p0,
			final Executor p1);

	<U> CompletionStage<U> handle(final BiFunction<? super T, Throwable, ? extends U> p0);

	<U> CompletionStage<U> handleAsync(final BiFunction<? super T, Throwable, ? extends U> p0);

	<U> CompletionStage<U> handleAsync(final BiFunction<? super T, Throwable, ? extends U> p0, final Executor p1);

	CompletionStage<T> whenComplete(final BiConsumer<? super T, ? super Throwable> p0);

	CompletionStage<T> whenCompleteAsync(final BiConsumer<? super T, ? super Throwable> p0);

	CompletionStage<T> whenCompleteAsync(final BiConsumer<? super T, ? super Throwable> p0, final Executor p1);

	CompletionStage<T> exceptionally(final Function<Throwable, ? extends T> p0);

	default CompletionStage<T> exceptionallyAsync(final Function<Throwable, ? extends T> fn) {
		throw new RuntimeException("Stub!");
	}

	default CompletionStage<T> exceptionallyAsync(final Function<Throwable, ? extends T> fn, final Executor executor) {
		throw new RuntimeException("Stub!");
	}

	default CompletionStage<T> exceptionallyCompose(final Function<Throwable, ? extends CompletionStage<T>> fn) {
		throw new RuntimeException("Stub!");
	}

	default CompletionStage<T> exceptionallyComposeAsync(final Function<Throwable, ? extends CompletionStage<T>> fn) {
		throw new RuntimeException("Stub!");
	}

	default CompletionStage<T> exceptionallyComposeAsync(final Function<Throwable, ? extends CompletionStage<T>> fn,
			final Executor executor) {
		throw new RuntimeException("Stub!");
	}

	CompletableFuture<T> toCompletableFuture();
}
